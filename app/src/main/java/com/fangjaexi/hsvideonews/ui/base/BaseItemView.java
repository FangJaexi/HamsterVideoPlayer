package com.fangjaexi.hsvideonews.ui.base;

import android.content.Context;
import android.widget.FrameLayout;

/**
 * 作者：fangjaexi on 2016/9/12 0012 10:18
 * 邮箱：fangjaexi@163.com
 */
public abstract class BaseItemView<Model> extends FrameLayout{

    public BaseItemView(Context context) {
        super(context);
        initView();
    }

    /** 初始化当前视图*/
    protected abstract void initView();

    /** 将实体数据设计到当前视图上*/
    protected abstract void bindModel(Model model);
}