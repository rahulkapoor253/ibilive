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
import com.example.rahulkapoor.zepplin2.R;
import com.example.rahulkapoor.zepplin2.model.ListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class MyAdapterDiscoverPost extends RecyclerView.Adapter<MyAdapterDiscoverPost.ViewHolder> implements AppConstants {

    private static int MODE = -1;
    private ArrayList<ListItems> mDataArrayList;
    private View itemView;

    public MyAdapterDiscoverPost(final ArrayList<ListItems> data, final int mode) {
        Log.d("log", "parametrized array list fired");
        this.mDataArrayList = data;
        this.MODE = mode;

    }


    /**
     * @param parent   parent
     * @param viewType view
     * @return return viewholder object;
     */
    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        Log.d("log", "MODE = " + MODE);

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_view, parent, false);

        return new ViewHolder(itemView, MODE);

    }

    /**
     * @param holder   holder
     * @param position pos
     */
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        ListItems obj = mDataArrayList.get(position);

        holder.mUsername.setText(obj.getmUsername());
        holder.mReviews.setText(obj.getmReviews());
        holder.mTime.setText(obj.getmTime());
        holder.mDescription.setText(obj.getmDescribe());

    }

    /**
     * @return array size
     */
    @Override
    public int getItemCount() {

        return mDataArrayList.size();
    }

    /**
     * view holder class
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mDescription;
        private TextView mTime;
        private TextView mReviews;
        private TextView mUsername;
        private Switch mSwitch;
        private ImageView mEdit, mBin, mLocator, mIcon;
        private RatingBar mRatingBar;

        /**
         * @param itemView item view
         * @param val      mode
         */
        public ViewHolder(final View itemView, final int val) {
            super(itemView);

            init();

            if (val == POST_MODE) {
                mSwitch.setVisibility(View.VISIBLE);
                mEdit.setVisibility(View.VISIBLE);
                mBin.setVisibility(View.VISIBLE);
                mIcon.setVisibility(View.INVISIBLE);
                mLocator.setVisibility(View.GONE);
                mUsername.setVisibility(View.INVISIBLE);
                mRatingBar.setVisibility(View.INVISIBLE);
            } else {
                mIcon.setVisibility(View.VISIBLE);
                mLocator.setVisibility(View.VISIBLE);
                mUsername.setVisibility(View.VISIBLE);
                mRatingBar.setVisibility(View.VISIBLE);
                mSwitch.setVisibility(View.GONE);
                mEdit.setVisibility(View.GONE);
                mBin.setVisibility(View.GONE);
            }


        }

        /**
         * initialising;
         */
        private void init() {
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
