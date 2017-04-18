package com.test.designpattern23demo.factroy_pattern;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.test.designpattern23demo.BaseActivity;
import com.test.designpattern23demo.R;
import com.test.designpattern23demo.factroy_pattern.factroy.ConcreteFactroy;
import com.test.designpattern23demo.factroy_pattern.product.ConcreteProductA;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo
 * @class: FactroyPatternActivity
 * @author: 陆伟
 * @Date: 2017/4/16 22:50
 * @desc： TODO
 */
public class FactroyPatternActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "FactroyPatternActivity";
    private Button mBtnCreateProductA;

    /**
     * 工厂模式主要分成4大模块：
     * 1. 抽象工厂：工厂模式的核心;
     * 2. 具体工厂：实现具体的业务逻辑；
     * 3. 抽象商品：工厂模式创建的商品父类；
     * 4. 具体商品：实现抽象商品具体商品的对象；
     */

    @NonNull
    @Override
    protected int getLayoutId() {
        return R.layout.activity_factroy_pattern;
    }

    @Override
    protected void initView() {
        super.initView();
        mBtnCreateProductA = (Button) findViewById(R.id.btnCreateProductA);
    }

    @Override
    protected void initListener() {
        super.initListener();
        mBtnCreateProductA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnCreateProductA:
                createProductA();
                break;
        }
    }

    private void createProductA() {
        ConcreteFactroy factroy = new ConcreteFactroy();
        ConcreteProductA product = factroy.createProduct();
        product.method();
    }
}

