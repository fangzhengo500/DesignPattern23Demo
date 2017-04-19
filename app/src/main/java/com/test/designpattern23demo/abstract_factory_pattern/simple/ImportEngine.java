package com.test.designpattern23demo.abstract_factory_pattern.simple;

import android.util.Log;

import com.test.designpattern23demo.abstract_factory_pattern.simple.interfaces.IEngine;

/**
 * Created by TNT_17306 on 2017/4/19.
 */

public class ImportEngine implements IEngine {

    public static final String TAG = ImportEngine.class.getSimpleName();

    @Override
    public void engine() {
        Log.e(TAG, "进口发动机");
    }
}
