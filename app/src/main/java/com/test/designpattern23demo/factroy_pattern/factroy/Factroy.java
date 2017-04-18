package com.test.designpattern23demo.factroy_pattern.factroy;

import com.test.designpattern23demo.factroy_pattern.product.Product;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.factroy_pattern
 * @class: Factroy
 * @author: 陆伟
 * @Date: 2017/4/16 22:57
 * @desc： TODO
 */
public abstract class Factroy {
    private static final String TAG = "Factroy";

    /**
     * 抽象工厂方法， 具体生产什么由子类去实现
     *
     * @return
     */
    public abstract Product createProduct();


    /**
     * 有时候可以利用反射更简洁的创建商品对象
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
