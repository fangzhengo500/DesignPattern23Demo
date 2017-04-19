package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.ITire;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class SUVTire implements ITire {
    public static final String TAG = SUVTire.class.getSimpleName();

    @Override
    public void tire() {
        Log.e(TAG, "越野轮胎");
    }
}
