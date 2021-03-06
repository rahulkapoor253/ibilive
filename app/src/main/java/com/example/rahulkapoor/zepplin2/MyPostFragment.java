package com.example.rahulkapoor.zepplin2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.adapter.MyAdapterDiscoverPost;
import com.example.rahulkapoor.zepplin2.model.ListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 30/04/17.
 */

public class MyPostFragment extends Fragment implements AppConstants {

    private RecyclerView mRecyclerView;
    private ArrayList<ListItems> mDataArrayList;
    private MyAdapterDiscoverPost adapter;
    private String mCheck;
    private MyPostFragment frag;

    /**
     *
     * @param val val
     * @return return insatnce of the current fragment;
     */
    public MyPostFragment newInstance(final int val) {

        frag = new MyPostFragment();
        Bundle b = new Bundle();
        b.putInt("POST_MODE", val);

        frag.setArguments(b);

        return frag;
    }

    /**
     *
     * @param inflater inflater
     * @param container conatiner
     * @param savedInstanceState current instance is saved;
     * @return view
     */
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        Log.d("log", "discover view inflated");


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mDataArrayList = new ArrayList<>();

        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));

        adapter = new MyAdapterDiscoverPost(mDataArrayList, getArguments().getInt("POST_MODE"));
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    /**
     * dummy method;
     */
    @Override
    public void dummyInit() {

    }
}
