package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IBrake;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class SeniorBrake implements IBrake {

    public static final String TAG = SeniorBrake.class.getSimpleName();

    @Override
    public void brake() {
        Log.e(TAG, "高级发动机");
    }
}
