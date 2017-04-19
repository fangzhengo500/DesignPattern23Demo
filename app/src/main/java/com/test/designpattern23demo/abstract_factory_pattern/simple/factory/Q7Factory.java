package com.test.designpattern23demo.abstract_factory_pattern.simple.factory;

import com.test.designpattern23demo.abstract_factory_pattern.simple.ImportEngine;
import com.test.designpattern23demo.abstract_factory_pattern.simple.SUVTire;
import com.test.designpattern23demo.abstract_factory_pattern.simple.SeniorBrake;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IBrake;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IEngine;
import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.ITire;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
