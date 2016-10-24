package com.fangjaexi.hsvideonews;

import android.app.Application;

import com.fangjaexi.hsvideonews.commons.ToastUtils;

/**
 * 作者：fangjaexi on 2016/9/12 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public class VideoNewsApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}