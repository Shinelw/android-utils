package com.shinelw.utils_library;

import android.util.Log;

/**
 * 统一管理的log
 * Created by shinelw on 16/7/4.
 */
public class LogUtils {
    private static volatile boolean sEnableLog = true;
    private static volatile LogLevel sLogLevel = LogLevel.D;

    private LogUtils(){}

    public enum LogLevel {
        V("V"),D("D"),I("I"),W("W"),E("E"),N("N");
        private String logLevel;

        public String getLogLevel(){
            return logLevel;
        }

        LogLevel(String logLevel){
            this.logLevel = logLevel;
        }
    }

    /**
     * 设置是否显示log
     * @param enableLog
     */
    public static void setEnableLog(boolean enableLog){
        sEnableLog = enableLog;
    }

    /**
     * 设置log的等级
     * @param logLevel
     */
    public static void setLogLevel(LogLevel logLevel){
        if (null != logLevel){
            sLogLevel = logLevel;
        }
    }

    /**
     * 判断log是否显示
     * @param logLevel
     * @return
     */
    public static boolean isLogEnable(LogLevel logLevel){
        return (null != logLevel) ? logLevel.ordinal() >= sLogLevel.ordinal() :false;
    }

    public static int e(String tag, String msg) {
        if (sEnableLog && isLogEnable(LogLevel.E)) {
            return Log.e(tag, msg);
        }
        return 0;
    }

    public static int e(String tag, String msg, Throwable tr) {
        if (sEnableLog && isLogEnable(LogLevel.E)) {
            return Log.e(tag, msg, tr);
        }
        return 0;
    }

    public static int w(String tag, String msg) {
        if (sEnableLog && isLogEnable(LogLevel.W)) {
            return Log.w(tag, msg);
        }
        return 0;
    }

    public static int w(String tag, String msg, Throwable tr) {
        if (sEnableLog && isLogEnable(LogLevel.W)) {
            return Log.w(tag, msg, tr);
        }
        return 0;
    }

    public static int i(String tag, String msg) {
        if (sEnableLog && isLogEnable(LogLevel.I)) {
            return Log.w(tag, msg);
        }
        return 0;
    }

    public static int d(String tag, String msg) {
        if (sEnableLog && isLogEnable(LogLevel.D)) {
            return Log.w(tag, msg);
        }
        return 0;
    }

    public static int v(String tag, String msg) {
        if (sEnableLog && isLogEnable(LogLevel.V)) {
            return Log.w(tag, msg);
        }
        return 0;
    }
}
