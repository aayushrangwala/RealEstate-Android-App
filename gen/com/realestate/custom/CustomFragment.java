package com.realestate.custom;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;

public class CustomFragment
  extends Fragment
  implements View.OnClickListener
{
  public void onClick(View paramView) {}
  
  public View setTouchNClick(View paramView)
  {
    paramView.setOnClickListener(this);
    paramView.setOnTouchListener(CustomActivity.TOUCH);
    return paramView;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.custom.CustomFragment
 * JD-Core Version:    0.7.0.1
 */