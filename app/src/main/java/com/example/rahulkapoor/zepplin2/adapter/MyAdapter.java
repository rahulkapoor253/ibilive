package com.example.rahulkapoor.zepplin2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rahulkapoor.zepplin2.ListItems;
import com.example.rahulkapoor.zepplin2.R;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<ListItems> mDataArrayList;

    public MyAdapter(ArrayList<ListItems> data){

        this.mDataArrayList = data;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItems obj = mDataArrayList.get(position);

        holder.mUsername.setText(obj.getmUsername());
        holder.mReviews.setText(obj.getmReviews());
holder.mTime.setText(obj.getmTime());
        holder.mDescription.setText(obj.getmDescribe());

    }

    @Override
    public int getItemCount() {
        return mDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mDescription;
        private TextView mTime;
        private TextView mReviews;
        private TextView mUsername;

        public ViewHolder(View itemView) {
            super(itemView);
            mUsername = (TextView) itemView.findViewById(R.id.tv_username);
            mDescription = (TextView) itemView.findViewById(R.id.et_user_describe);
            mTime = (TextView) itemView.findViewById(R.id.tv_time);
            mReviews = (TextView) itemView.findViewById(R.id.tv_reviews2);

        }



    }
}
