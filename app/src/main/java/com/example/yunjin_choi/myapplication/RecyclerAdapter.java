package com.example.yunjin_choi.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context mCtx;
    ArrayList<RecyclerItem> recyclerItems;

    public RecyclerAdapter(Context context , ArrayList array) {
        this.mCtx = context;
        this.recyclerItems = array;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout , parent, false);

        RecyclerAdapter.ViewHolder viewHolder = new RecyclerAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        RecyclerItem item = recyclerItems.get(position);

        holder.itemImage.setImageDrawable(item.getImg());
        holder.itemName.setText(item.getName());
        holder.itemMsg.setText(item.getMsg());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemName;
        TextView itemMsg;

        public ViewHolder(View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_title);
            itemMsg = itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected Item " + position, Snackbar.LENGTH_LONG).setAction("Action" , null) . show();

                }
            });
        }
    }
}
