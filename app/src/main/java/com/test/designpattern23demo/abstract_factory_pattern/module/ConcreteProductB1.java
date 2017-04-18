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
public class ConcreteProductB1 extends AbstractProductB {
    private static final String TAG = "ConcreteProductB1";

    @Override
    public void method() {
        Log.e(TAG, "具体商品B1的方法");
    }
}
