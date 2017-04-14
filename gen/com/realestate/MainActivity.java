package com.realestate;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.realestate.custom.CustomActivity;
import com.realestate.model.Data;
import com.realestate.ui.FeedList;
import com.realestate.ui.LeftNavAdapter;
import com.realestate.ui.MapViewer;
import com.realestate.ui.Search;
import com.realestate.ui.SearchResult;
import java.util.ArrayList;

class MainActivity
  extends CustomActivity
{
  private LeftNavAdapter adapter;
  private DrawerLayout drawerLayout;
  private ListView drawerLeft;
  private ActionBarDrawerToggle drawerToggle;

  private ArrayList<Data> getDummyLeftNavItems()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new Data("Feed", 2130837552, 2130837553));
    localArrayList.add(new Data("Search", 2130837554, 2130837555));
    localArrayList.add(new Data("Map", 2130837556, 2130837557));
    localArrayList.add(new Data("Search Results", 2130837558, 2130837559));
    return localArrayList;
  }

  private void launchFragment(int paramInt)
  {
    String str;
    Object localObject;
    if (paramInt == 0)
    {
      str = "Feed";
      localObject = new FeedList();
      if (localObject == null) {}
    }
    for (;;)
    {
      if (getSupportFragmentManager().getBackStackEntryCount() <= 0)
      {
        getSupportFragmentManager().beginTransaction().replace(2131034118, (Fragment)localObject).addToBackStack(str).commit();
        if (this.adapter != null) {
          this.adapter.setSelection(paramInt);
        }
        return;
        if (paramInt == 1)
        {
          str = "Search";
          localObject = new Search();
          break;
        }
        if (paramInt == 2)
        {
          str = "Map";
          localObject = new MapViewer();
          break;
        }
        localObject = null;
        str = null;
        if (paramInt != 3) {
          break;
        }
        str = "Search Results";
        localObject = new SearchResult();
        break;
      }
      getSupportFragmentManager().popBackStackImmediate();
    }
  }

  private void setActionBarTitle()
  {
    if (this.drawerLayout.isDrawerOpen(this.drawerLeft)) {
      getActionBar().setTitle(2131099674);
    }
    while (getSupportFragmentManager().getBackStackEntryCount() == 0) {
      return;
    }
    String str = getSupportFragmentManager().getBackStackEntryAt(-1 + getSupportFragmentManager().getBackStackEntryCount()).getName();
    getActionBar().setTitle(str);
    getActionBar().setLogo(2130837568);
  }

  private void setupContainer()
  {
    getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener()
    {
      public void onBackStackChanged()
      {
        MainActivity.this.setActionBarTitle();
      }
    });
    launchFragment(0);
  }

  private void setupDrawer()
  {
    this.drawerLayout = ((DrawerLayout)findViewById(2131034117));
    this.drawerLayout.setDrawerShadow(2130837538, 8388611);
    this.drawerToggle = new ActionBarDrawerToggle(this, this.drawerLayout, 2130837548, 2131099675, 2131099676)
    {
      public void onDrawerClosed(View paramAnonymousView)
      {
        MainActivity.this.setActionBarTitle();
      }

      public void onDrawerOpened(View paramAnonymousView)
      {
        MainActivity.this.getActionBar().setTitle(2131099674);
      }
    };
    this.drawerLayout.setDrawerListener(this.drawerToggle);
    this.drawerLayout.closeDrawers();
    setupLeftNavDrawer();
  }

  private void setupLeftNavDrawer()
  {
    this.drawerLeft = ((ListView)findViewById(2131034119));
    this.adapter = new LeftNavAdapter(this, getDummyLeftNavItems());
    this.drawerLeft.setAdapter(this.adapter);
    this.drawerLeft.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        MainActivity.this.drawerLayout.closeDrawers();
        MainActivity.this.launchFragment(paramAnonymousInt);
      }
    });
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.drawerToggle.onConfigurationChanged(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    setupContainer();
    setupDrawer();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (getSupportFragmentManager().getBackStackEntryCount() > 1)
      {
        getSupportFragmentManager().popBackStackImmediate();
        return true;
      }
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.drawerToggle.onOptionsItemSelected(paramMenuItem)) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    this.drawerToggle.syncState();
  }
}



