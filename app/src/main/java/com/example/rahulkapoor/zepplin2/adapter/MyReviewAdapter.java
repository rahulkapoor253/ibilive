package com.example.rahulkapoor.zepplin2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.R;
import com.example.rahulkapoor.zepplin2.model.ListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 02/05/17.
 */

public class MyReviewAdapter extends RecyclerView.Adapter<MyReviewAdapter.ViewHolder> implements AppConstants {

    private View itemView;
    private ArrayList<ListItems> mDataArrayList;

    /**
     * @param data arraylist;
     */
    public MyReviewAdapter(final ArrayList<ListItems> data) {
        this.mDataArrayList = data;

    }

    /**
     * @param parent   parent
     * @param viewType viewtype
     * @return view holder object
     */
    @Override
    public MyReviewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_request, parent, false);

        return new ViewHolder(itemView);
    }

    /**
     * @param holder   holder
     * @param position position
     */
    @Override
    public void onBindViewHolder(final MyReviewAdapter.ViewHolder holder, final int position) {

        ListItems obj = mDataArrayList.get(position);

        holder.mUsername.setText(obj.getmUsername());
        holder.mName.setText(obj.getmUsername());
        holder.mDescribe.setText(obj.getmDescribe());
        holder.mTime.setText(obj.getmTime());

    }

    /**
     * @return arraylist size
     */
    @Override
    public int getItemCount() {
        return mDataArrayList.size();
    }

    /**
     * dummy method;
     */
    @Override
    public void dummyInit() {

    }

    /**
     * view holder inner class;
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mUsername;
        private TextView mDescribe;
        private TextView mTime;
        private TextView mName;

        /**
         * @param itemView current itemview;
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.tv_request_username);
            mUsername = (TextView) itemView.findViewById(R.id.request_username);
            mDescribe = (TextView) itemView.findViewById(R.id.request_description);
            mTime = (TextView) itemView.findViewById(R.id.request_time);
        }
    }
}
