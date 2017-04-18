package com.test.designpattern23demo.factroy_pattern;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.factroy_pattern
 * @class: FactroyPattern
 * @author: 陆伟
 * @Date: 2017/4/16 22:34
 * @desc： TODO
 */
public class FactroyPattern {
    private static final String TAG = "FactroyPattern";

    /**
     * @desc：工厂设置模式，是创建模式之一。广场模式是一种结构简单的模式，其实我们平时开发中中庸很广泛，
     * @desc：如Android中的Activiy里的各个生命周期方法，以onCreate方法为例，他就可以看做是一个工厂方法，
     * @desc：Wien中其中可以构造View并通过setContentView返回framework处理等。
     *
     * @define：用于创建对象的接口，让子类决定实例化那个类。
     *
     * @sence：在创建复杂对象的地方，都可以用工厂方法模式，用new就可以创建的对象就无需使用工厂模式。
     */
}
