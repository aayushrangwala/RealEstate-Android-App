package com.realestate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.realestate.SearchResultActivity;
import com.realestate.custom.CustomFragment;

public class Search
  extends CustomFragment
{
  private boolean buy;
  
  private void setupSearchOptions(boolean paramBoolean)
  {
    this.buy = paramBoolean;
    View localView1 = getView();
    View localView2 = localView1.findViewById(2131034145);
    int i;
    int j;
    label47:
    View localView4;
    int k;
    if (paramBoolean)
    {
      i = 8;
      localView2.setVisibility(i);
      View localView3 = localView1.findViewById(2131034148);
      if (!paramBoolean) {
        break label83;
      }
      j = 8;
      localView3.setVisibility(j);
      localView4 = localView1.findViewById(2131034143);
      k = 0;
      if (!paramBoolean) {
        break label89;
      }
    }
    for (;;)
    {
      localView4.setVisibility(k);
      return;
      i = 0;
      break;
      label83:
      j = 0;
      break label47;
      label89:
      k = 8;
    }
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if ((paramView.getId() == 2131034140) || (paramView.getId() == 2131034141)) {
      if (paramView.getId() == 2131034140)
      {
        bool1 = true;
        setupSearchOptions(bool1);
        paramView.setEnabled(false);
        if (paramView.getId() != 2131034140) {
          break label72;
        }
        getView().findViewById(2131034141).setEnabled(true);
      }
    }
    label72:
    while (paramView.getId() != 2131034135)
    {
      for (;;)
      {
        return;
        boolean bool1 = false;
      }
      getView().findViewById(2131034140).setEnabled(true);
      return;
    }
    Intent localIntent = new Intent(getActivity(), SearchResultActivity.class);
    boolean bool2 = getView().findViewById(2131034140).isEnabled();
    boolean bool3 = false;
    if (bool2) {}
    for (;;)
    {
      startActivity(localIntent.putExtra("buy", bool3));
      return;
      bool3 = true;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903049, null);
    setTouchNClick(localView.findViewById(2131034135));
    setTouchNClick(localView.findViewById(2131034140));
    setTouchNClick(localView.findViewById(2131034141));
    this.buy = true;
    return localView;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.ui.Search
 * JD-Core Version:    0.7.0.1
 */