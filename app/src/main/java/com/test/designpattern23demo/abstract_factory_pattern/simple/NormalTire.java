package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.ITire;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class NormalTire implements ITire {
    public static final String TAG = NormalTire.class.getSimpleName();

    @Override
    public void tire() {
        Log.e(TAG, "普通轮胎");
    }
}
