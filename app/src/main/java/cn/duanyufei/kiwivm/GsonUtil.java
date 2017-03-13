package cn.duanyufei.kiwivm;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by DUAN Yufei on 2017-3-8.
 */
public class GsonUtil {

    private static final String TAG = "GsonUtil";
    private static Gson sGson = new Gson();

    public static Object fromJson(String text, Type typeOfT) {
        Object msg = null;
        try {
            msg = sGson.fromJson(text, typeOfT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
