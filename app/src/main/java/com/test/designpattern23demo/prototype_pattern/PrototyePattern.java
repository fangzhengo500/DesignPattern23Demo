package com.test.designpattern23demo.prototype_pattern;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.prototype_pattern
 * @class: PrototyePattern
 * @author: 陆伟
 * @Date: 2017/3/19 21:19
 * @desc： TODO
 */
public class PrototyePattern {
    private static final String TAG = "PrototyePattern";

    /**
     * 原型模式
     *
     * @desc：原型模式是一种创建型的模式。原型二字表明了该模式应该有一个模板实例，用户从这个对象中复制出一个内部属性一致的对象，这个过程也就是我们熟称的“克隆”。
     * @desc：被赋值的实例就是我们熟称的“原型”，这个原型是可定制的。原型模式用于创建复杂的或者构造好事的实例，因为这种情况下，复制一个已经存在的实例可是程序运行更高效。
     *
     * @define：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象；
     *
     * @sence：（1）类初始化血药消耗非常多资源，这个资源包括数据吗、硬件资源等，通过原型拷贝避免这些消耗。
     * @sence：（2）通过new 产生一个对象需要非常反复的数据准备或访问权限，这时可以使用原型模式。
     * @sence：（3）一个对象需要提供给其他对象访问，而且各个调用者可以能需要修改其值时，可以考虑用原型拷贝多个对象，供调用者使用，即保护性拷贝。
     *
     * @notify：通过事项Cloneable接口的原型模式在调用clone函数构造实例时并不一定比通过new快，只用当通过new构造对象较耗时或是成本较高时，通过clone方法才能够提升效率。
     * @notify：因此，实现原型模式也不一定非要实现Cloneable接口，也有其他的实现方式。
     */
}
