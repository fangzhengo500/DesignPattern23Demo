package com.test.designpattern23demo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo
 * @class: BaseActivity
 * @author: 陆伟
 * @Date: 2017/4/16 23:07
 * @desc： TODO
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView();

        initListener();
    }

    @NonNull
    protected abstract int getLayoutId();

    protected void initView() {}

    protected void initListener() {}

}
