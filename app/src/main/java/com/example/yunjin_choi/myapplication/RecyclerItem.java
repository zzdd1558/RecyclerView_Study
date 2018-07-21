package com.example.yunjin_choi.myapplication;

import android.graphics.drawable.Drawable;

public class RecyclerItem {

    private Drawable img;
    private String name;
    private String msg;

    public RecyclerItem(Drawable img){
        this.img = img;
    }

    public RecyclerItem(Drawable img, String name, String msg) {
        this.img = img;
        this.name = name;
        this.msg = msg;
    }

    public Drawable getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }
}
