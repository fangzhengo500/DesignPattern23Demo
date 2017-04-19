package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IBrake;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class NormalBrake implements IBrake {

    public static final String TAG = NormalBrake.class.getSimpleName();

    @Override
    public void brake() {
        Log.e(TAG, "普通发动机");
    }
}
