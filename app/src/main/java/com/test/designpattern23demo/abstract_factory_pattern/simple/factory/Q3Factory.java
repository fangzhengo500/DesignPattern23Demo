package com.test.designpattern23demo.abstract_factory_pattern.simple.factory;

import com.test.designpattern23demo.abstract_factory_pattern.simple.DomesticEngine;
import com.test.designpattern23demo.abstract_factory_pattern.simple.NormalBrake;
import com.test.designpattern23demo.abstract_factory_pattern.simple.NormalTire;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IBrake;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IEngine;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.ITire;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
