package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a<T extends LifecycleDelegate>
{
  private T lV;
  private Bundle lW;
  private LinkedList<a> lX;
  private final d<T> lY = new d()
  {
    public void a(T paramAnonymousT)
    {
      a.a(a.this, paramAnonymousT);
      Iterator localIterator = a.a(a.this).iterator();
      while (localIterator.hasNext()) {
        ((a.a)localIterator.next()).b(a.b(a.this));
      }
      a.a(a.this).clear();
      a.a(a.this, null);
    }
  };
  
  private void J(int paramInt)
  {
    while ((!this.lX.isEmpty()) && (((a)this.lX.getLast()).getState() >= paramInt)) {
      this.lX.removeLast();
    }
  }
  
  private void a(Bundle paramBundle, a parama)
  {
    if (this.lV != null)
    {
      parama.b(this.lV);
      return;
    }
    if (this.lX == null) {
      this.lX = new LinkedList();
    }
    this.lX.add(parama);
    if (paramBundle != null)
    {
      if (this.lW != null) {
        break label76;
      }
      this.lW = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      a(this.lY);
      return;
      label76:
      this.lW.putAll(paramBundle);
    }
  }
  
  public void a(FrameLayout paramFrameLayout)
  {
    final Context localContext = paramFrameLayout.getContext();
    final int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    String str1 = GooglePlayServicesUtil.b(localContext, i, -1);
    String str2 = GooglePlayServicesUtil.b(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    TextView localTextView = new TextView(paramFrameLayout.getContext());
    localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    localTextView.setText(str1);
    localLinearLayout.addView(localTextView);
    if (str2 != null)
    {
      Button localButton = new Button(localContext);
      localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localButton.setText(str2);
      localLinearLayout.addView(localButton);
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          localContext.startActivity(GooglePlayServicesUtil.a(localContext, i, -1));
        }
      });
    }
  }
  
  protected abstract void a(d<T> paramd);
  
  public T bP()
  {
    return this.lV;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    a(paramBundle, new a()
    {
      public void b(LifecycleDelegate paramAnonymousLifecycleDelegate)
      {
        a.b(a.this).onCreate(paramBundle);
      }
      
      public int getState()
      {
        return 1;
      }
    });
  }
  
  public View onCreateView(final LayoutInflater paramLayoutInflater, final ViewGroup paramViewGroup, final Bundle paramBundle)
  {
    final FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new a()
    {
      public void b(LifecycleDelegate paramAnonymousLifecycleDelegate)
      {
        localFrameLayout.removeAllViews();
        localFrameLayout.addView(a.b(a.this).onCreateView(paramLayoutInflater, paramViewGroup, paramBundle));
      }
      
      public int getState()
      {
        return 2;
      }
    });
    if (this.lV == null) {
      a(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public void onDestroy()
  {
    if (this.lV != null)
    {
      this.lV.onDestroy();
      return;
    }
    J(1);
  }
  
  public void onDestroyView()
  {
    if (this.lV != null)
    {
      this.lV.onDestroyView();
      return;
    }
    J(2);
  }
  
  public void onInflate(final Activity paramActivity, final Bundle paramBundle1, final Bundle paramBundle2)
  {
    a(paramBundle2, new a()
    {
      public void b(LifecycleDelegate paramAnonymousLifecycleDelegate)
      {
        a.b(a.this).onInflate(paramActivity, paramBundle1, paramBundle2);
      }
      
      public int getState()
      {
        return 0;
      }
    });
  }
  
  public void onLowMemory()
  {
    if (this.lV != null) {
      this.lV.onLowMemory();
    }
  }
  
  public void onPause()
  {
    if (this.lV != null)
    {
      this.lV.onPause();
      return;
    }
    J(3);
  }
  
  public void onResume()
  {
    a(null, new a()
    {
      public void b(LifecycleDelegate paramAnonymousLifecycleDelegate)
      {
        a.b(a.this).onResume();
      }
      
      public int getState()
      {
        return 3;
      }
    });
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.lV != null) {
      this.lV.onSaveInstanceState(paramBundle);
    }
    while (this.lW == null) {
      return;
    }
    paramBundle.putAll(this.lW);
  }
  
  private static abstract interface a
  {
    public abstract void b(LifecycleDelegate paramLifecycleDelegate);
    
    public abstract int getState();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a
 * JD-Core Version:    0.7.0.1
 */