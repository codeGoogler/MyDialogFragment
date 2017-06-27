package stu.df.yyh.cn.mydialogfragment.utils;

import android.util.Log;

/**
 * 类功能描述：</br>
 * LogUtil
 * @author 于亚豪
 *  博客地址： http://blog.csdn.net/androidstarjack
 * 公众号： 终端研发部
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
public class LogUtil {
    public static boolean IS_DEBUG = true;
    private static String TAG = LogUtil.class.getSimpleName();

    /**
     * 开启Log,默认不开启
     *
     * @param enable
     */
    public static final void openDebugLog(boolean enable) {
        IS_DEBUG = enable;
    }

    public static final void i(String TAG, String value) {
        if (IS_DEBUG) {
            Log.i(TAG, value);
        }
    }

    public static final void i(String value) {
        if (IS_DEBUG) {
            i(TAG, value);
        }
    }

    public static final void e(String TAG, String value) {
        if (IS_DEBUG) {
            Log.e(TAG, value);
        }
    }

    public static final void e(String value) {
        if (IS_DEBUG) {
            e(TAG, value);
        }
    }

    public static final void d(String TAG, String value) {
        if (IS_DEBUG) {
            Log.d(TAG, value);
        }
    }

    public static final void d(String value) {
        if (IS_DEBUG) {
            d(TAG, value);
        }
    }

    public static final void exception(Exception e) {
        if (IS_DEBUG) {
            e.printStackTrace();
        }
    }}
