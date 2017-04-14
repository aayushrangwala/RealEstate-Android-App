package com.realestate.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.realestate.model.Data;
import java.util.ArrayList;

public class LeftNavAdapter
  extends BaseAdapter
{
  private Context context;
  private ArrayList<Data> items;
  private int selected;
  
  public LeftNavAdapter(Context paramContext, ArrayList<Data> paramArrayList)
  {
    this.context = paramContext;
    this.items = paramArrayList;
  }
  
  public int getCount()
  {
    return this.items.size();
  }
  
  public Data getItem(int paramInt)
  {
    return (Data)this.items.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = LayoutInflater.from(this.context).inflate(2130903045, null);
    }
    TextView localTextView = (TextView)paramView;
    localTextView.setText(getItem(paramInt).getTitle1());
    if (paramInt == this.selected)
    {
      localTextView.setCompoundDrawablesWithIntrinsicBounds(getItem(paramInt).getImage2(), 0, 0, 0);
      localTextView.setBackgroundColor(this.context.getResources().getColor(2130968595));
      localTextView.setTextColor(-1);
      return paramView;
    }
    localTextView.setCompoundDrawablesWithIntrinsicBounds(getItem(paramInt).getImage1(), 0, 0, 0);
    localTextView.setBackgroundResource(0);
    localTextView.setTextColor(this.context.getResources().getColor(2130968594));
    return paramView;
  }
  
  public void setSelection(int paramInt)
  {
    this.selected = paramInt;
    notifyDataSetChanged();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.ui.LeftNavAdapter
 * JD-Core Version:    0.7.0.1
 */