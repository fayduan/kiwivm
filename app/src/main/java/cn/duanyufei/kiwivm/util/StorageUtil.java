package cn.duanyufei.kiwivm.util;

import android.content.Context;
import android.content.SharedPreferences;

import cn.duanyufei.kiwivm.app.KWApplication;

/**
 * Created by DUAN Yufei on 2017/3/9.
 */

public class StorageUtil {

    /**
     * 公用配置
     */
    private static final String LOCAL_STORAGE = "kiwivm_storage";

    private static SharedPreferences sharedPreferences
            = KWApplication.getInstance().getSharedPreferences(LOCAL_STORAGE, Context.MODE_PRIVATE);

    /**
     * 数据标签
     */
    private static final String ID = "veid";
    private static final String KEY = "api_key";
    private static final String TOTAL = "total";
    /**
     * 用户数据
     */
    private static String sId = null;
    private static String sKey = null;
    private static int sTotal = 0;

    /**
     * Getters & Setters
     */
    public static String getID() {
        if (sId == null) {
            sId = sharedPreferences.getString(ID, "");
        }
        return sId;
    }

    public static void setID(String id) {
        sId = id;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ID, sId);
        editor.apply();
    }

    public static String getKey() {
        if (sKey == null) {
            sKey = sharedPreferences.getString(KEY, "");
        }
        return sKey;
    }

    public static void setKey(String key) {
        sKey = key;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY, sKey);
        editor.apply();
    }

    public static int getTotal() {
        if (sTotal == 0) {
            sTotal = sharedPreferences.getInt(TOTAL, 0);
        }
        return sTotal;
    }

    public static void setTotal(int total) {
        sTotal = total;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(TOTAL, total);
        editor.apply();
    }
}
