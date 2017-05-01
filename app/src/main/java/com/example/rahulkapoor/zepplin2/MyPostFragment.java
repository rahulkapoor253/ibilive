package com.example.rahulkapoor.zepplin2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.adapter.MyAdapterDiscoverPost;

/**
 * Created by rahulkapoor on 30/04/17.
 */

public class MyPostFragment extends Fragment implements AppConstants {

    private RecyclerView mRecyclerView;
    private MyAdapterDiscoverPost adapter;
    private String mCheck;
    private MyPostFragment frag;

    public MyPostFragment newInstance(int val) {

        frag = new MyPostFragment();
        Bundle b = new Bundle();
        b.putInt("POST_MODE", val);

        frag.setArguments(b);

        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Log.d("log", "discover view inflated");


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        adapter = new MyAdapterDiscoverPost(getArguments().getInt("POST_MODE"));
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }
}
