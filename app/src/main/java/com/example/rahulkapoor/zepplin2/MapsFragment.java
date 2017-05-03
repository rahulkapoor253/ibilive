package com.example.rahulkapoor.zepplin2;


import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;


/**
 * Created by rahulkapoor on 02/05/17.
 */

public class MapsFragment extends Fragment implements OnMapReadyCallback {

    private View rootView;
    private GoogleMap mGoogleMap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_map, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getActivity().getSupportFragmentManager()
                .findFragmentById(R.id.google_map);

        
return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        if(googleMap != null){
            mGoogleMap = googleMap;
        }

    }
}
