package com.test.designpattern23demo.abstract_factory_pattern.module;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: ConcreteFactory1
 * @author: 陆伟
 * @Date: 2017/4/18 23:44
 * @desc： TODO
 */
public class ConcreteFactory1 extends AbstractFactory {
    private static final String TAG = "ConcreteFactory1";

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
