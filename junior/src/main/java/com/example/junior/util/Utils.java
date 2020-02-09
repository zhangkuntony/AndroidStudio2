package com.example.junior.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Utils {
    //  根据手机的分辨率从dp的单位转成px（像素）
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;        //  获取当前手机的像素密度
        return (int) (dpValue * scale + 0.5f);                                          //  四舍五入取整
    }

    //  根据手机的分辨率从px（像素）的单位转成为dp
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;         //  获取当前手机的像素密度
        return (int) (pxValue / scale + 0.5f);                                          //  四舍五入取整
    }

    //  获取屏幕的宽度
    public static int getScreenWidth(Context ctx) {
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);     //  从系统服务中获取窗口管理器
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);                                              //  从默认显示器中获取显示参数保存到dm对象中
        return dm.widthPixels;                                                              //  返回屏幕的宽度数值
    }

    //  获取屏幕的高度
    public static int getScreenHeight(Context ctx) {
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);     //  从系统服务中获取窗口管理器
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);                                              //  从默认显示器中获取显示参数保存到dm对象中
        return dm.heightPixels;                                                             //  返回屏幕的高度数值
    }

    //  获取屏幕的像素密度
    public static float getScreenDensity(Context ctx) {
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);     //  从系统服务中获取窗口管理器
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);                                              //  从默认显示器中获取显示参数保存到dm对象中
        return dm.density;                                                                  //  返回屏幕的像素密度数值
    }
}
