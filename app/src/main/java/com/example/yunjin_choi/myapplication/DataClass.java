package com.example.yunjin_choi.myapplication;

import android.content.Context;
import android.content.res.TypedArray;

public class DataClass {

    Context mctx;

    public DataClass(Context context) {
        this.mctx = context;
    }

    public TypedArray getImageList(){
        return mctx.getResources().obtainTypedArray(R.array.img_array);
    }

    public String[] getNameList(){
        return mctx.getResources().getStringArray(R.array.nm_array);
    }

    public String[] getMsgList(){
        return mctx.getResources().getStringArray(R.array.msg_array);
    }
}
