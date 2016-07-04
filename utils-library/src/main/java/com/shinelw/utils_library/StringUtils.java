package com.shinelw.utils_library;

/**
 * 字符工具库
 * Created by shinelw on 16/7/4.
 */
public class StringUtils {

    public static boolean isEmpty(String string){
        return null == string || string.isEmpty();
    }

    public static String toLowCase(String string){
        return string.toLowerCase();
    }

}
