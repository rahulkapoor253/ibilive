package com.example.rahulkapoor.zepplin2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahulkapoor.zepplin2.Constant.AppConstants;

/**
 * Created by rahulkapoor on 29/04/17.
 */

public class SideMenuFragment extends Fragment implements AppConstants {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_side_menu, container, false);


        return view;
    }
}
