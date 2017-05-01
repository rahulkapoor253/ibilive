package com.example.rahulkapoor.zepplin2.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.model.ListItems;
import com.example.rahulkapoor.zepplin2.R;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class MyAdapterDiscoverPost extends RecyclerView.Adapter<MyAdapterDiscoverPost.ViewHolder> implements AppConstants {

    private ArrayList<ListItems> mDataArrayList;
    private static int MODE = -1;
    private View itemView;

    public MyAdapterDiscoverPost(ArrayList<ListItems> data, int mode){
        Log.d("log", "parametrized array list fired");
        this.mDataArrayList = data;
        this.MODE = mode;

    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.d("log", "MODE = " + MODE);

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(itemView, MODE);

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
        private Switch mSwitch;
        private ImageView mEdit, mBin, mLocator, mIcon ;
        private RatingBar mRatingBar;

        public ViewHolder(View itemView,int val) {
            super(itemView);

            init();

            if(val == DEFAULT_MODE) {
                mSwitch.setVisibility(View.GONE);
                mEdit.setVisibility(View.GONE);
                mBin.setVisibility(View.GONE);
            }

           else if(val == POST_MODE){
                mIcon.setVisibility(View.INVISIBLE);
                mLocator.setVisibility(View.GONE);
                mUsername.setVisibility(View.INVISIBLE);
                mRatingBar.setVisibility(View.INVISIBLE);
            }

        }

        private void init(){
            mRatingBar = (RatingBar) itemView.findViewById(R.id.rating_bar);
            mUsername = (TextView) itemView.findViewById(R.id.tv_username);
            mDescription = (TextView) itemView.findViewById(R.id.et_user_describe);
            mTime = (TextView) itemView.findViewById(R.id.tv_time);
            mReviews = (TextView) itemView.findViewById(R.id.tv_reviews2);
            mSwitch = (Switch) itemView.findViewById(R.id.toggle);
            mEdit = (ImageView) itemView.findViewById(R.id.iv_edit);
            mBin = (ImageView) itemView.findViewById(R.id.iv_bin);
            mLocator = (ImageView) itemView.findViewById(R.id.iv_locator);
            mIcon = (ImageView) itemView.findViewById(R.id.iv_icon);

        }



    }
}
