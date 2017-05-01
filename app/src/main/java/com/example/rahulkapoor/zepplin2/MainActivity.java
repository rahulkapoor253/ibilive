package com.example.rahulkapoor.zepplin2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;

public class MainActivity extends ActionBarActivity implements AppConstants {

    private ImageView mHamburger;
    private DrawerLayout mDrawer;
    private FragmentTransaction ft;
    private FragmentManager manager;
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapterViewPager;

    private ImageView mDiscover, mMap, mPost, mRequest, mNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init1();

        mViewPager = (ViewPager) findViewById(R.id.fm_view_pager);
        mAdapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapterViewPager);


        init2();


        mHamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(Gravity.START);

            }
        });




    }



    private void init1() {

        Toolbar mToolbar= (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(mToolbar);


    }

    private void init2(){
        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mHamburger = (ImageView) findViewById(R.id.iv_hamburger);
        mDiscover = (ImageView) findViewById(R.id.iv_discover);
        mMap = (ImageView) findViewById(R.id.iv_maps);
        mRequest = (ImageView) findViewById(R.id.iv_request);
        mNetwork = (ImageView) findViewById(R.id.iv_network);
        mPost = (ImageView) findViewById(R.id.iv_posts);


    }

    private class MyPagerAdapter extends FragmentPagerAdapter implements AppConstants {

        public MyPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    Log.d("log", "position : " + position);
                    return new FragmentActivity().newInstance(DEFAULT_MODE);
                case 1:
                    Log.d("log", "position : " + position);
                    return new MyPostFragment().newInstance(POST_MODE);
                case 2:
                    Log.d("log", "position : " + position);
                    return new NetworkFragment();

                default:
                    Log.d("log", "position is null");
                    return null;

            }

        }

        @Override
        public int getCount() {
            return 3;


        }
    }



}


