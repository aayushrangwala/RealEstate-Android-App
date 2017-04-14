package com.realestate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.realestate.custom.CustomActivity;

public class PropertyDetail
  extends CustomActivity
{
  private GoogleMap mMap;
  private MapView mMapView;
  
  private void setupMap(Bundle paramBundle)
  {
    try
    {
      MapsInitializer.initialize(this);
      this.mMapView = ((MapView)findViewById(2131034134));
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
    this.mMap.clear();
    LatLng localLatLng = new LatLng(-33.859999999999999D, 151.21109999999999D);
    MarkerOptions localMarkerOptions = new MarkerOptions();
    localMarkerOptions.position(localLatLng).title("South Extenstion 324").snippet("Sydney, Australia");
    localMarkerOptions.icon(BitmapDescriptorFactory.fromResource(2130837569));
    this.mMap.addMarker(localMarkerOptions);
    this.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(localLatLng, 16.0F));
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView.getId() == 2131034138) {
      startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:0123456789")));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    setupMap(paramBundle);
    setTouchNClick(2131034138);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131427328, paramMenu);
    paramMenu.findItem(2131034151).setVisible(false);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    this.mMapView.onDestroy();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      finish();
      return true;
    }
    if (paramMenuItem.getItemId() == 2131034149) {
      startActivity(new Intent(this, MapViewActivity.class));
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131034150) {
        startActivity(new Intent(this, SearchResultActivity.class));
      }
    }
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
      this.mMap.setMyLocationEnabled(false);
      this.mMap.getUiSettings().setAllGesturesEnabled(false);
      this.mMap.setInfoWindowAdapter(null);
      setupMarker();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.PropertyDetail
 * JD-Core Version:    0.7.0.1
 */