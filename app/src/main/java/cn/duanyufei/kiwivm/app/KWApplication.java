package cn.duanyufei.kiwivm.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by DUAN Yufei on 2017/3/13.
 */

public class KWApplication extends Application {

    // Global context;
    private static Context context;

    private static final String TAG = "KWApplication";

    private static final String INTERNAL_VERSION = "Internal Version: ";
    private static final String VERSION = "Version V";
    private static final String SVN = "SVN: ";
    private static KWApplication instance = null;

    private static String mVersion = null;
    private static int mVersionCode = 0;

    public static KWApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = getApplicationContext();
    }

    public String getVersion() {

        if (mVersion == null) {
            try {
                mVersion = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                mVersion = "v0.0.1";
            }
        }

        return mVersion;
    }

    public int getVersionCode() {

        if (mVersionCode == 0) {
            try {
                mVersionCode = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                mVersionCode = 0;
            }
        }

        return mVersionCode;
    }

    public static Context getContext() {
        return context;
    }
}
