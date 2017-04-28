package com.example.rahulkapoor.zepplin2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.ListItems;
import com.example.rahulkapoor.zepplin2.R;
import com.example.rahulkapoor.zepplin2.adapter.MyAdapter;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 28/04/17.
 */

public class RecyclerFragment extends Fragment {

    private ArrayList<ListItems> mDataArrayList;
    private MyAdapter adapter;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
                mDataArrayList = new ArrayList<>();

        adapter = new MyAdapter(getContext(), mDataArrayList);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }


}
