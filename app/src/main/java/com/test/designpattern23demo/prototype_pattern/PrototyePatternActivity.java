
package com.test.designpattern23demo.prototype_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.test.designpattern23demo.R;

public class PrototyePatternActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "PrototyePatternActivity";
    private Button mBtnNew;
    private Button mBtnClone;
    private Button mBtnShowInfo;
    private Button mBtnModify;

    private WordDocument mNewWordDocument;
    private WordDocument mCloneWordDocument;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototye_pattern);

        mBtnNew = (Button) findViewById(R.id.btnNew);
        mBtnClone = (Button) findViewById(R.id.btnClone);
        mBtnShowInfo = (Button) findViewById(R.id.btnShowInfo);
        mBtnModify = (Button) findViewById(R.id.btnModify);

        mBtnNew.setOnClickListener(this);
        mBtnClone.setOnClickListener(this);
        mBtnShowInfo.setOnClickListener(this);
        mBtnModify.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        long start = 0;
        long end = 0;
        String msg = null;
        switch(v.getId()) {
            case R.id.btnNew:   //New 一个实例
                start = System.currentTimeMillis();
                mNewWordDocument = new WordDocument();
                end = System.currentTimeMillis();
                msg = "New 创建";
                break;

            case R.id.btnClone: //Clone 一个实例

                if(mNewWordDocument == null) {
                    Log.d(TAG, "请先创建对象再进行克隆");
                    return;
                }

                start = System.currentTimeMillis();
                mCloneWordDocument = mNewWordDocument.clone();
                end = System.currentTimeMillis();
                msg = "Clone 创建";
                break;

            case R.id.btnShowInfo:   //显示New对象和Clone对象的信息
                onClickShow();
                break;

            case R.id.btnModify:   //修改Clone对象的数据
                onClickModify();
                break;

        }
        long time = end - start;
        Log.d(TAG, msg + "需要时间：" + time + "毫秒");
    }


    private void onClickShow() {
        if(mNewWordDocument == null || mCloneWordDocument == null) {
            Log.d(TAG, "请先New一个实例后，在Clone一个实例");
        }
        mNewWordDocument.showDocument();
        mCloneWordDocument.showDocument();
    }

    private void onClickModify() {
        if(mNewWordDocument == null || mCloneWordDocument == null) {
            Log.d(TAG, "请先New一个实例后，在Clone一个实例");
        }
        mCloneWordDocument.setText("Clone Word");
        mCloneWordDocument.setImage(0, "Clone数据被修改了");
    }

}
