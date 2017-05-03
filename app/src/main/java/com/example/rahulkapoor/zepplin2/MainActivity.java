package com.example.rahulkapoor.zepplin2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;

/**
 * main activity holds view pager and its adapter;
 */
public class MainActivity extends ActionBarActivity implements AppConstants, View.OnClickListener {

    private ImageView mHamburger;
    private DrawerLayout mDrawer;
    private FragmentTransaction ft;
    private FragmentManager manager;
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapterViewPager;
    private Intent intent;

    private ImageView mDiscover, mMap, mPost, mRequest, mNetwork;

    /**
     * @param savedInstanceState state of instance is saved;
     */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init1();

        mViewPager = (ViewPager) findViewById(R.id.fm_view_pager);
        mViewPager.setOffscreenPageLimit(5);
        mAdapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapterViewPager);

        init2();


        mHamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mDrawer.openDrawer(Gravity.START);

            }
        });


    }

    /**
     * @param v view
     */
    @Override
    public void onClick(final View v) {
        int position;
        switch (v.getId()) {

            case R.id.iv_discover:
                position = 0;
                break;
            case R.id.iv_maps:
                position = 1;
                break;
            case R.id.iv_posts:
                position = 2;
                break;
            case R.id.iv_request:
                position = 3;
                break;
            case R.id.iv_network:
                position = 4;
                break;
            default:
                position = 0;

        }

        mViewPager.setCurrentItem(position);
    }


    /**
     * initialise 1;
     */
    private void init1() {

        mToolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(mToolbar);


    }

    /**
     * init 2
     */
    private void init2() {
        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mHamburger = (ImageView) findViewById(R.id.iv_hamburger);

    }

    @Override
    public void dummyInit() {

    }


    /**
     * pager adapter inner class
     */
    private class MyPagerAdapter extends FragmentPagerAdapter implements AppConstants {

        /**
         * @param fm fragment maanger
         */
        public MyPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        /**
         * @param position position
         * @return return fragment instance;
         */
        @Override
        public Fragment getItem(final int position) {

            switch (position) {
                case 0:
                    Log.d("log", "position : " + position);
                    return new FragmentActivity().newInstance(DEFAULT_MODE);
                case 1:
                    Log.d("log", "position :" + position);
                    return new MapsFragment();
                case 2:
                    Log.d("log", "position : " + position);
                    return new MyPostFragment().newInstance(POST_MODE);
                case 3:
                    Log.d("log", "position : " + position);
                    return new RequestFragment();
                case 4:
                    Log.d("log", "position : " + position);
                    return new NetworkFragment();
                default:
                    Log.d("log", "position is null");
                    return new FragmentActivity().newInstance(DEFAULT_MODE);

            }

        }


        /**
         * @return no of slider pages;
         */
        @Override
        public int getCount() {
            return 5;


        }

        /**
         * dummy method;
         */
        @Override
        public void dummyInit() {

        }
    }


}


