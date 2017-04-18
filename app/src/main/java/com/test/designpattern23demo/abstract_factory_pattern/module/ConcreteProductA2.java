package com.test.designpattern23demo.abstract_factory_pattern.module;

import android.util.Log;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: ConcreteProductA1
 * @author: 陆伟
 * @Date: 2017/4/18 23:39
 * @desc： TODO
 */
public class ConcreteProductA2 extends AbstractProductA {
    private static final String TAG = "ConcreteProductA2";

    @Override
    public void method() {
        Log.e(TAG, "具体商品A2的方法");
    }
}
