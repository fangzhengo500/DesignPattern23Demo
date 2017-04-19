package com.test.designpattern23demo.abstract_factory_pattern;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.abstract_factory_pattern
 * @class: AbstractFactoryPattern
 * @author: 陆伟
 * @Date: 2017/4/18 23:35
 * @desc： TODO
 */
public class AbstractFactoryPattern {
    private static final String TAG = "AbstractFactoryPattern";
    /**
     * @desc：抽象工厂模式，是创建模式之一。广场模式是一种结构简单的模式，其实我们平时开发中中庸很广泛，
     * @desc：如Android中的Activiy里的各个生命周期方法，以onCreate方法为例，他就可以看做是一个工厂方法，
     * @desc：Wien中其中可以构造View并通过setContentView返回framework处理等。
     *
     * @define：为创建一组香菇或者相互以来的对象提供一个接口，而不是需要制定他们的具体类。
     *
     * @sence：一个对象族具有相同的约束是可以使用抽象工厂模式。
     *
     * @summarzie: 抽象工场实际开发中用的不多，主要是开发过程中，很少会出现多个产品种类的情况。
     * @summarzie: 大部分情况工厂模式都能解决。
     *
     * @advantage: 1. 分离接口与实现，客户端用抽象工场创建对象，而客户端根本不知道具体的实现是谁，只需要面向接口编程
     *
     * @disadvantage: 1. 类文件太多
     * @disadvantage: 2. 抽象工场修改接口，所有的实现类都要去修改。
     */
}
