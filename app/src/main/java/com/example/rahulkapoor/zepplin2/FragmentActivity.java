package com.example.rahulkapoor.zepplin2;

import android.support.v4.app.Fragment;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rahulkapoor.zepplin2.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class FragmentActivity extends Fragment {

    private Toolbar mToolbar;
    private ArrayList<ListItems> mDataArrayList;
    private MyAdapter adapter;
    private RecyclerView mRecyclerView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        init(view);
        setUp(view);

        return view;
    }



    private void setUp(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mDataArrayList = new ArrayList<>();

        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));
        mDataArrayList.add(new ListItems("Drake", "6d 2h left", "220", "Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum." ));

        adapter = new MyAdapter(mDataArrayList);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    private void init(View view) {
        Toolbar mToolbar= (Toolbar) view.findViewById(R.id.app_toolbar);
        ((ActionBarActivity)getActivity()).setSupportActionBar(mToolbar);


    }



}
