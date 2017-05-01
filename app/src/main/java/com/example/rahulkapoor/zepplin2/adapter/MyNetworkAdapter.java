package com.example.rahulkapoor.zepplin2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public MyNetworkAdapter(ArrayList<NetworkListItems> data) {
    this.mItems = data;

}

    @Override
    public MyNetworkAdapter.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.network_items, parent, false);

        return new DataHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyNetworkAdapter.DataHolder holder, int position) {

        NetworkListItems obj = mItems.get(position);
        holder.Username.setText(obj.getName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        private TextView Username;

        public DataHolder(View itemView) {
            super(itemView);
            Username = (TextView) itemView.findViewById(R.id.tv_username);

        }
    }

}
