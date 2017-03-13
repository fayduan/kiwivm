package cn.duanyufei.kiwivm;

import com.google.gson.Gson;

import cn.duanyufei.kiwivm.model.ServiceInfo;

/**
 * Created by DUAN Yufei on 2017-3-8.
 */
public class GsonUtil {

    private static final String TAG = "GsonUtil";
    private static Gson sGson = new Gson();

    public static ServiceInfo fromJson(String text) {
        ServiceInfo msg = null;
        try {
            msg = sGson.fromJson(text, ServiceInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
