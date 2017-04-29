package com.example.rahulkapoor.zepplin2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by rahulkapoor on 29/04/17.
 */

public class BottomBarFragment extends Fragment {

    private ImageView mDiscover, mMaps, mUser, mNetwork, mPosts;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottombar, container, false);

        init(view);

        mDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return view;
    }

    private void init(View view) {
        mDiscover = (ImageView) view.findViewById(R.id.iv_discover);
        mMaps = (ImageView) view.findViewById(R.id.iv_maps);
        mNetwork = (ImageView) view.findViewById(R.id.iv_network);
        mUser = (ImageView) view.findViewById(R.id.iv_request);
        mPosts = (ImageView) view.findViewById(R.id.iv_posts);
    }
}
