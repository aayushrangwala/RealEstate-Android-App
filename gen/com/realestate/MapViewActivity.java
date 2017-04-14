package com.realestate;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import com.realestate.custom.CustomActivity;
import com.realestate.ui.MapViewer;

public class MapViewActivity
  extends CustomActivity
{
  private void addFragment()
  {
    getSupportFragmentManager().beginTransaction().replace(2131034118, new MapViewer()).commit();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    getActionBar().setTitle("Map");
    addFragment();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.MapViewActivity
 * JD-Core Version:    0.7.0.1
 */