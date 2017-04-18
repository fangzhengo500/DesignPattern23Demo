package com.test.designpattern23demo.factroy_pattern.product;

import android.util.Log;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.factroy_pattern
 * @class: ConcreteProductA1
 * @author: 陆伟
 * @Date: 2017/4/16 22:55
 * @desc： TODO
 */
public class ConcreteProductB extends Product {
    private static final String TAG = "ConcreteProductB";

    @Override
    public void method() {
        Log.e(TAG, "我是具体的商品B");
    }
}
