package com.example.rahulkapoor.zepplin2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.adapter.MyReviewAdapter;
import com.example.rahulkapoor.zepplin2.model.ListItems;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 02/05/17.
 */

public class RequestFragment extends Fragment {

    private View view;
    private RecyclerView mRecyclerView;
    private ArrayList<ListItems> mDataArrayList;
    private MyReviewAdapter adapter;

    /**
     *
     * @param inflater inflater
     * @param container container
     * @param savedInstanceState current instance is saved;
     * @return view;
     */
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.request_recyclerview, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.header_recycler_view);
        mDataArrayList = new ArrayList<>();

        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                + "dolor sit amet, consectetur lorem ipsum."));

        adapter = new MyReviewAdapter(mDataArrayList);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }
}
