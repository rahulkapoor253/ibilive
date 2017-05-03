package com.example.rahulkapoor.zepplin2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;
import com.example.rahulkapoor.zepplin2.adapter.MyAdapterDiscoverPost;
import com.example.rahulkapoor.zepplin2.model.ListItems;

import java.util.ArrayList;


public class FragmentActivity extends Fragment implements AppConstants {

    private Toolbar mToolbar;
    private ArrayList<ListItems> mDataArrayList;
    private MyAdapterDiscoverPost adapter;
    private RecyclerView mRecyclerView;
    private FragmentActivity frag;


    public FragmentActivity newInstance(final int val) {

        frag = new FragmentActivity();
        Bundle b = new Bundle();
        b.putInt("DISCOVER_MODE", val);

        frag.setArguments(b);

        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        setUp(view);


        return view;
    }


    private void setUp(final View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mDataArrayList = new ArrayList<>();

        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum."));

        adapter = new MyAdapterDiscoverPost(mDataArrayList, getArguments().getInt("DEFAULT_MODE"));
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

    }


}
