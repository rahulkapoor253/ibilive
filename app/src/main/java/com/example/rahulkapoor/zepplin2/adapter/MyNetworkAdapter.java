package com.example.rahulkapoor.zepplin2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.R;
import com.example.rahulkapoor.zepplin2.model.NetworkListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 01/05/17.
 */

public class MyNetworkAdapter extends RecyclerView.Adapter<MyNetworkAdapter.DataHolder> implements AppConstants {

    private View itemView;
    private ArrayList<NetworkListItems> mItems;

    /**
     * @param data arraylist
     */
    public MyNetworkAdapter(final ArrayList<NetworkListItems> data) {
        this.mItems = data;

    }

    /**
     * @param parent   parent
     * @param viewType viewtype
     * @return return data holder object;
     */
    @Override
    public MyNetworkAdapter.DataHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.network_items, parent, false);

        return new DataHolder(itemView);
    }

    /**
     * @param holder   holder
     * @param position position
     */
    @Override
    public void onBindViewHolder(final MyNetworkAdapter.DataHolder holder, final int position) {

        NetworkListItems obj = mItems.get(position);
        if (position == 0) {
            holder.mRelativelayout.setBackgroundResource(R.drawable.network_top);

        } else if (position == mItems.size() - 1) {
            holder.mRelativelayout.setBackgroundResource(R.drawable.network_bottom);
        }

        holder.mUsername.setText(obj.getName());


    }

    /**
     * @return arraylist size
     */
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    /**
     * dummy method;
     */
    @Override
    public void dummyInit() {

    }

    /**
     * data holder inner class;
     */
    public class DataHolder extends RecyclerView.ViewHolder {

        private TextView mUsername;
        private RelativeLayout mRelativelayout;

        /**
         * @param itemView current itemview;
         */
        public DataHolder(final View itemView) {
            super(itemView);
            mUsername = (TextView) itemView.findViewById(R.id.tv_username);
            mRelativelayout = (RelativeLayout) itemView.findViewById(R.id.rl_network);

        }
    }

}
