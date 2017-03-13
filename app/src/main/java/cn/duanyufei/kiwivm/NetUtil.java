package cn.duanyufei.kiwivm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;

/**
 * desc: HTTP/HTTPS 请求通用类
 * Created by DUAN Yufei on 2017/3/8.
 */

public class NetUtil {

    public static final String TAG = NetUtil.class.getName();

    private OkHttpClient mOkHttpClient = new OkHttpClient();
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static NetUtil mInstance = null;
    //获取UI线程
    private Handler mHandler = new Handler(Looper.getMainLooper());

    //回调接口
    public interface MOkCallBack {
        void onSuccess(String rep);

        void onError();
    }

    //获取实例
    public static NetUtil getInstance(Context context) {
        if (mInstance == null) {
            synchronized (NetUtil.class) {
                if (mInstance == null) {
                    mInstance = new NetUtil();
                    try {
                        mInstance.setCertificates(context.getAssets().open("server.cer"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mInstance.mOkHttpClient.setHostnameVerifier(new HostnameVerifier() {
                        @Override
                        public boolean verify(String hostname, SSLSession session) {
                            return true;
                        }
                    });
                }
            }
        }
        return mInstance;
    }

    public void getMessage(String url, final MOkCallBack mCallBack) {
        get(mOkHttpClient, url, null, mCallBack);
    }

    private <E> void get(OkHttpClient ohc, String url, final Type typeofT, final MOkCallBack mCallBack) {
        Log.i(TAG, "GET: " + url);

        final Request request = new Request.Builder()
                .url(url)
                .addHeader("Accept", "*/*")
                .build();
        Log.i(TAG, "Request: " + request.toString());
        Call call = ohc.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.i(TAG, "run: error");
                        mCallBack.onError();
                    }
                });
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                final String re = response.body().string();
                Log.i(TAG, "onResponse: " + re);
                mHandler.post(new Runnable() {
                    public void run() {
                        mCallBack.onSuccess(re);
                    }
                });
            }
        });
    }

    public void post(String url, Type typeOfT, MOkCallBack mCallBack) {
        post(url, typeOfT, mCallBack);
    }

    public void post(String url, String json, final Type typeOfT, final MOkCallBack mCallBack) {
        Log.i(TAG, "POST: " + url + " " + json);

        Request.Builder builder = new Request.Builder();
        builder.url(url);
        if (json != null && json.length() > 0) {
            RequestBody rb = RequestBody.create(JSON, json);
            builder.post(rb);
        }
        builder.addHeader("Accept", "*/*");
        Request request = builder.build();

        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, final IOException e) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mCallBack.onError();
                        e.printStackTrace();
                    }
                });
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                final String re = response.body().string();
                Log.i(TAG, "onResponse: " + re);
                mHandler.post(new Runnable() {
                    public void run() {
                        mCallBack.onSuccess(re);
                    }
                });
            }
        });
    }

    public void setCertificates(InputStream... certificates) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null);
            int index = 0;
            for (InputStream certificate : certificates) {
                String certificateAlias = Integer.toString(index++);
                keyStore.setCertificateEntry(certificateAlias, certificateFactory.generateCertificate(certificate));

                try {
                    if (certificate != null)
                        certificate.close();
                } catch (IOException e) {
                }
            }

            SSLContext sslContext = SSLContext.getInstance("TLS");

            TrustManagerFactory trustManagerFactory =
                    TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

            trustManagerFactory.init(keyStore);
            sslContext.init
                    (
                            null,
                            trustManagerFactory.getTrustManagers(),
                            new SecureRandom()
                    );
            mOkHttpClient.setSslSocketFactory(sslContext.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
