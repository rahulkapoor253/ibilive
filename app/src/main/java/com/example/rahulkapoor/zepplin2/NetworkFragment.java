package com.example.rahulkapoor.zepplin2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.adapter.MyNetworkAdapter;
import com.example.rahulkapoor.zepplin2.model.NetworkListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 30/04/17.
 */

public class NetworkFragment extends Fragment implements AppConstants {

    private RecyclerView mRecyclerView;
    private MyNetworkAdapter adapter;
    private ArrayList<NetworkListItems> mItems;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mItems = new ArrayList<>();

        mItems.add(new NetworkListItems("Evelyn"));
        mItems.add(new NetworkListItems("Evelyn"));
        mItems.add(new NetworkListItems("Evelyn"));
        mItems.add(new NetworkListItems("Evelyn"));
        mItems.add(new NetworkListItems("Evelyn"));
        mItems.add(new NetworkListItems("Evelyn"));

        adapter = new MyNetworkAdapter(mItems);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

}
