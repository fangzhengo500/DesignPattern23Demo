package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IEngine;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class DomesticEngine implements IEngine {

    public static final String TAG = DomesticEngine.class.getSimpleName();

    @Override
    public void engine() {
        Log.e(TAG, "国产发动机");
    }
}
