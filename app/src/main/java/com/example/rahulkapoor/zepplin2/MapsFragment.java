package com.example.rahulkapoor.zepplin2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

    /**
     *
     * @param inflater infalter
     * @param container container
     * @param savedInstanceState current instance is saved;
     * @return return view;
     */
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_map, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getActivity().getSupportFragmentManager()
                .findFragmentById(R.id.google_map);


        return rootView;
    }

    /**
     *
     * @param googleMap googlemap;
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        if (googleMap != null) {
            mGoogleMap = googleMap;
        }

    }
}
