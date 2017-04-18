package com.test.designpattern23demo.factroy_pattern.product;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.factroy_pattern
 * @class: Product
 * @author: 陆伟
 * @Date: 2017/4/16 22:52
 * @desc： TODO
 */
public abstract class Product {
    private static final String TAG = "Product";
    /**
     * 商品类的抽象方法
     * 有具体的产品类去实现
     */

    public abstract void method();
}
