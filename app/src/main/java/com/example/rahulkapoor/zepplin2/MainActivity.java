package com.example.rahulkapoor.zepplin2;

import android.content.Intent;
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

public class MainActivity extends ActionBarActivity implements AppConstants, View.OnClickListener{

    private ImageView mHamburger;
    private DrawerLayout mDrawer;
    private FragmentTransaction ft;
    private FragmentManager manager;
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapterViewPager;
    private Intent intent;

    private ImageView mDiscover, mMap, mPost, mRequest, mNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
            public void onClick(View v) {
                mDrawer.openDrawer(Gravity.START);

            }
        });



    }

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



    private void init1() {

        Toolbar mToolbar= (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(mToolbar);


    }

    private void init2(){
        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mHamburger = (ImageView) findViewById(R.id.iv_hamburger);

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





        @Override
        public int getCount() {
            return 5;


        }
    }



}


