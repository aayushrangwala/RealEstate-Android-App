package com.realestate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.realestate.SearchResultActivity;
import com.realestate.custom.CustomFragment;

public class MapViewer
  extends CustomFragment
{
  private GoogleMap mMap;
  private MapView mMapView = ((MapView)paramView.findViewById(2131034134));
  
  private void setupMap(View paramView, Bundle paramBundle)
  {
    try
    {
      MapsInitializer.initialize(getActivity());
      this.mMapView.onCreate(paramBundle);
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        localGooglePlayServicesNotAvailableException.printStackTrace();
      }
    }
  }
  
  private void setupMarker()
  {
    int i = 0;
    this.mMap.clear();
    LatLng[] arrayOfLatLng = new LatLng[4];
    arrayOfLatLng[0] = new LatLng(-33.891591503569337D, 151.21157605201006D);
    arrayOfLatLng[1] = new LatLng(-33.890214132574279D, 151.21306367218494D);
    arrayOfLatLng[2] = new LatLng(-33.890214132574279D, 151.21709771454334D);
    arrayOfLatLng[3] = new LatLng(-33.890261446151726D, 151.21967263519764D);
    int j = arrayOfLatLng.length;
    for (;;)
    {
      if (i >= j)
      {
        this.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(arrayOfLatLng[2], 15.0F));
        return;
      }
      LatLng localLatLng = arrayOfLatLng[i];
      MarkerOptions localMarkerOptions = new MarkerOptions();
      localMarkerOptions.position(localLatLng).title("South Extenstion 324").snippet("Sydney, Australia");
      localMarkerOptions.icon(BitmapDescriptorFactory.fromResource(2130837569));
      this.mMap.addMarker(localMarkerOptions);
      i++;
    }
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView.getId() == 2131034135) {
      startActivity(new Intent(getActivity(), SearchResultActivity.class));
    }
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(2131427329, paramMenu);
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903046, null);
    setHasOptionsMenu(true);
    setTouchNClick(localView.findViewById(2131034135));
    setupMap(localView, paramBundle);
    return localView;
  }
  
  public void onDestroy()
  {
    this.mMapView.onDestroy();
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.mMapView.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.mMapView.onResume();
    this.mMap = this.mMapView.getMap();
    if (this.mMap != null)
    {
      this.mMap.setMyLocationEnabled(true);
      this.mMap.setInfoWindowAdapter(null);
      setupMarker();
    }
  }
}



