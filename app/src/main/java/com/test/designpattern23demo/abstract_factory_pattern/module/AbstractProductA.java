package com.test.designpattern23demo.abstract_factory_pattern.module;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: AbstractProductA
 * @author: 陆伟
 * @Date: 2017/4/18 23:33
 * @desc： TODO
 */
public abstract class AbstractProductA {
    private static final String TAG = "AbstractProductA";

    /**
     * 每个具体产品子类需要实现的方法
     */
    public abstract void method();
}
