package com.realestate.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.realestate.MapViewActivity;
import com.realestate.PropertyDetail;
import com.realestate.SearchResultActivity;
import com.realestate.custom.CustomFragment;
import java.util.ArrayList;

public class FeedList
  extends CustomFragment
{
  private ArrayList<String[]> fList;
  
  private void loadDummyFeeds(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new String[] { "Rs 20,00,000 - Rs 35,00,000", "Central Avenue", "15 Aman's Valley ", "6", "2", "1" });
    if (paramBoolean) {}
    for (int i = 0;; i = 1)
    {
      localArrayList.add(i, new String[] { "RS 30,00,000 - RS 45,00,000", "North Extenstion 454", "14 Mount view place", "4", "3", "2" });
      this.fList = new ArrayList(localArrayList);
      this.fList.addAll(localArrayList);
      this.fList.addAll(localArrayList);
      this.fList.addAll(localArrayList);
      this.fList.addAll(localArrayList);
      this.fList.addAll(localArrayList);
      this.fList.addAll(localArrayList);
      return;
    }
  }
  
  private void setFeedList(View paramView, boolean paramBoolean)
  {
    loadDummyFeeds(paramBoolean);
    ListView localListView = (ListView)paramView.findViewById(2131034128);
    localListView.setAdapter(new FeedAdapter(null));
    localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        FeedList.this.startActivity(new Intent(FeedList.this.getActivity(), PropertyDetail.class));
      }
    });
  }
  
  private void showSortPopup()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    localBuilder.setTitle(2131099681);
    localBuilder.setSingleChoiceItems(2131296256, 0, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        if ((paramAnonymousInt == 1) || (paramAnonymousInt == 2) || (paramAnonymousInt == 4))
        {
          FeedList.this.setFeedList(FeedList.this.getView(), true);
          return;
        }
        FeedList.this.setFeedList(FeedList.this.getView(), false);
      }
    });
    localBuilder.create().show();
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(2131427328, paramMenu);
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903042, null);
    setHasOptionsMenu(true);
    setFeedList(localView, false);
    return localView;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131034151) {
      showSortPopup();
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131034149) {
        startActivity(new Intent(getActivity(), MapViewActivity.class));
      } else if (paramMenuItem.getItemId() == 2131034150) {
        startActivity(new Intent(getActivity(), SearchResultActivity.class));
      }
    }
  }
  
  private class FeedAdapter
    extends BaseAdapter
  {
    private FeedAdapter() {}
    
    public int getCount()
    {
      return FeedList.this.fList.size();
    }
    
    public String[] getItem(int paramInt)
    {
      return (String[])FeedList.this.fList.get(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = FeedList.this.getLayoutInflater(null).inflate(2130903043, null);
      }
      String[] arrayOfString = getItem(paramInt);
      ((TextView)paramView.findViewById(2131034121)).setText(arrayOfString[0]);
      ((TextView)paramView.findViewById(2131034122)).setText(arrayOfString[1]);
      ((TextView)paramView.findViewById(2131034123)).setText(arrayOfString[2]);
      ((TextView)paramView.findViewById(2131034124)).setText(arrayOfString[3]);
      ((TextView)paramView.findViewById(2131034125)).setText(arrayOfString[4]);
      ((TextView)paramView.findViewById(2131034126)).setText(arrayOfString[5]);
      ImageView localImageView = (ImageView)paramView.findViewById(2131034120);
      if (paramInt % 2 == 0) {}
      for (int i = 2130837540;; i = 2130837541)
      {
        localImageView.setImageResource(i);
        return paramView;
      }
    }
  }
}



/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.realestate.ui.FeedList

 * JD-Core Version:    0.7.0.1

 */