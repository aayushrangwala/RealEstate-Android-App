package com.realestate;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import com.realestate.custom.CustomActivity;
import com.realestate.custom.CustomFragment;
import com.realestate.ui.SearchResult;

public class SearchResultActivity
  extends CustomActivity
{
  private void addFragment()
  {
    SearchResult localSearchResult = new SearchResult();
    if (!getIntent().getBooleanExtra("buy", false)) {
      localSearchResult.setArguments(new Bundle());
    }
    getSupportFragmentManager().beginTransaction().replace(2131034118, localSearchResult).commit();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    getActionBar().setTitle("Search Results");
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
 * Qualified Name:     com.realestate.SearchResultActivity
 * JD-Core Version:    0.7.0.1
 */