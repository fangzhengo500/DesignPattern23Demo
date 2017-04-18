package com.test.designpattern23demo.abstract_factory_pattern;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.test.designpattern23demo.BaseActivity;
import com.test.designpattern23demo.R;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: AbstractFactroyPatternActivity
 * @author: 陆伟
 * @Date: 2017/4/18 23:31
 * @desc： TODO
 */
public class AbstractFactroyPatternActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "AbstractFactroyPatternActivity";
    private Button mBtnAbsFactoryDemo;

    @NonNull
    @Override
    protected int getLayoutId() {
        return R.layout.activity_abstract_factory;
    }

    @Override
    protected void initView() {
        mBtnAbsFactoryDemo = (Button) findViewById(R.id.btnAbsFactoryDemo);
    }

    @Override
    protected void initListener() {
        mBtnAbsFactoryDemo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
