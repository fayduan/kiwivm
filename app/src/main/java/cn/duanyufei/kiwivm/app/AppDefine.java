/**
 * Copyright (c) 2015 Mindray. All rights reserved.
 * <p/>
 * desc：文件描述
 */
package cn.duanyufei.kiwivm.app;

import cn.duanyufei.kiwivm.BuildConfig;

/**
 * desc：全局配置文件
 *
 */
public class AppDefine {

    /**
     * 服务器URL
     */
    public final static String SERVER = "https://api.64clouds.com/v1/";
    public final static String ID = "?veid=";
    public final static String KEY = "&api_key=";
    public final static String SERVICE_INFO = "getServiceInfo";
    public final static String LIVE_SERVICE_INFO = "getLiveServiceInfo";

    public static final String UPDATE_URL = "http://api.fir.im/apps/latest/58ca2449959d6912f20001c7";
    public static final String FIR_TOKEN_URL = "?api_token=" + BuildConfig.FIR_TOKEN;
    public static final String DOWNLOAD_URL = "http://fir.im/kiwivm";
}
