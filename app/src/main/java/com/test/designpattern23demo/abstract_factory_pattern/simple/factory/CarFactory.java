package com.test.designpattern23demo.abstract_factory_pattern.simple.factory;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IBrake;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IEngine;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.ITire;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public abstract class CarFactory {

    /**
     * 生产轮胎
     *
     * @return 轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     *
     * @return 发动机
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     *
     * @return 制动系统
     */
    public abstract IBrake createBrake();
}
