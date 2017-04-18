package com.test.designpattern23demo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.test.designpattern23demo.abstract_factory_pattern.AbstractFactroyPatternActivity;
import com.test.designpattern23demo.factroy_pattern.FactroyPatternActivity;
import com.test.designpattern23demo.prototype_pattern.PrototyePatternActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    private static final int SINGLETON = 0;
    private static final int BUILDER = 1;
    private static final int PROTOTYPE_PATTERN = 2;
    private static final int FACTROY_PATTERN = 3;
    private static final int ABSTEACT_FACTROY_PATTERN = 4;
    private ListView mListView;
    private List<String> mPatternList = new ArrayList<>();
    private PatternAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.patternList);
        mListView.setOnItemClickListener(this);

        mPatternList.add("单例模式（Singleton）");
        mPatternList.add("Builder模式（Builder）");
        mPatternList.add("原型模式（Prototype Pattern）");
        mPatternList.add("工厂模式（Factroy Pattern）");
        mPatternList.add("抽象工厂模式（Abstract Factroy Pattern）");

        mAdapter = new PatternAdapter(this, mPatternList);
        mListView.setAdapter(mAdapter);
    }

    @NonNull
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Class clazz = null;

        switch(position) {
            case SINGLETON:
                clazz = PrototyePatternActivity.class;
                break;

            case BUILDER:
                clazz = PrototyePatternActivity.class;
                break;

            case PROTOTYPE_PATTERN:
                clazz = PrototyePatternActivity.class;
                break;

            case FACTROY_PATTERN:
                clazz = FactroyPatternActivity.class;
                break;

            case ABSTEACT_FACTROY_PATTERN:
                clazz = AbstractFactroyPatternActivity.class;
                break;
        }

        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }


    public static class PatternAdapter extends BaseAdapter {

        private Context mContext;

        private List<String> mDatas;

        public PatternAdapter(Context context, List<String> datas) {
            mContext = context;
            mDatas = datas == null ? new ArrayList<String>() : datas;
        }

        @Override
        public int getCount() {
            return mDatas.size();
        }

        @Override
        public String getItem(int position) {
            return mDatas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;

            if(convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item_pattern, null, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.mTextView.setText(mDatas.get(position));

            return convertView;
        }

        public static class ViewHolder {

            TextView mTextView;

            public ViewHolder(View itemView) {
                mTextView = (TextView) itemView.findViewById(R.id.text);
            }
        }
    }
}
