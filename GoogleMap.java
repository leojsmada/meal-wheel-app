package com.example.animationproject;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.animationproject.R.id.mapAPI;


public class GoogleMap extends FragmentActivity implements OnMapReadyCallback
    {

        com.google.android.gms.maps.GoogleMap mapAPI;
        SupportMapFragment mapFragment;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);
            mapFragment.getMapAsync(this);

        }



        @Override
        public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap)
        {
            mapAPI = googleMap;

            LatLng Jenksinburg = new LatLng(33.334410,-84.050280);

            mapAPI.addMarker(new MarkerOptions().position(Jenksinburg).title("Jenkinsburg"));

            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Jenksinburg));


        }
    }




