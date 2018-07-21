package com.example.yunjin_choi.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context mCtx;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCtx = this;
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutMgr = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutMgr);
        adapter = new RecyclerAdapter(mCtx , getItem());
        recyclerView.setAdapter(adapter);


    }

    private ArrayList<RecyclerItem> getItem(){

        DataClass data = new DataClass(mCtx);

        ArrayList<RecyclerItem> item = new ArrayList<RecyclerItem>();

        TypedArray img = data.getImageList();
        String[] name = data.getNameList();
        String[] msg = data.getMsgList();

        for (int i = 0; i< img.length(); i++){
            item.add(new RecyclerItem(getDrawable(img.getResourceId(i , -1)) , name[i] , msg[i]));
        }

        return item;
    }
}
