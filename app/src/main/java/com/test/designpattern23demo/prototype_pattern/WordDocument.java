package com.test.designpattern23demo.prototype_pattern;

import android.util.Log;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.prototype_pattern
 * @class: WordDocument
 * @author: 陆伟
 * @Date: 2017/3/19 21:39
 * @desc： TODO
 */
public class WordDocument implements Cloneable {
    private static final String TAG = "WordDocument";
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages;

    public WordDocument() {

        ArrayList<String> mDatas = new ArrayList<>();
        for(int i = 0; i < 100000; i++) {
            mDatas.add("假数据" + i);
        }

        mImages = mDatas;

        Log.d(TAG, "构造了" + mDatas.size() + "条数据的WordDocument");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> images) {
        mImages = images;
    }

    public void showDocument() {
        Log.d(TAG, "----- Word Content Start -----");
        Log.d(TAG, "mText = " + this.mText);
        Log.d(TAG, "mImages = " + this.mImages);
//        for(String image : mImages) {
//            Log.d(TAG, "image = " + image);
//        }
        Log.d(TAG, "----- Word Content End -----");
    }

    public void setImage(int position, String str) {
        mImages.set(position, str);
    }
}
