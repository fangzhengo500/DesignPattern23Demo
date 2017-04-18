package com.test.designpattern23demo.abstract_factory_pattern.module;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: AbstractFactory
 * @author: 陆伟
 * @Date: 2017/4/18 23:45
 * @desc： TODO
 */
public abstract class AbstractFactory {
    private static final String TAG = "AbstractFactory";

    /**
     * 生产具体的商品A
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 生产具体的商品B
     * @return
     */
    public abstract AbstractProductB createProductB();
}
