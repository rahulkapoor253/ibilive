package com.example.rahulkapoor.zepplin2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.ListItems;
import com.example.rahulkapoor.zepplin2.R;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<ListItems> mDataArrayList;
    private Context mContext;

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return mDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView {

        public ViewHolder(Context context) {
            super(context);
        }


    }
}
