package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public class es
{
  protected em mz;
  protected a np;
  
  private es(em paramem, int paramInt)
  {
    this.mz = paramem;
    Q(paramInt);
  }
  
  public static es a(em paramem, int paramInt)
  {
    if (ek.bK()) {
      return new b(paramem, paramInt);
    }
    return new es(paramem, paramInt);
  }
  
  protected void Q(int paramInt)
  {
    this.np = new a(paramInt, new Binder(), null);
  }
  
  public void bX()
  {
    this.mz.a(this.np.nq, this.np.ca());
  }
  
  public Bundle bY()
  {
    return this.np.ca();
  }
  
  public IBinder bZ()
  {
    return this.np.nq;
  }
  
  public void e(View paramView) {}
  
  public void setGravity(int paramInt)
  {
    this.np.gravity = paramInt;
  }
  
  public static final class a
  {
    public int bottom = 0;
    public int gravity;
    public int left = 0;
    public IBinder nq;
    public int nr = -1;
    public int right = 0;
    public int top = 0;
    
    private a(int paramInt, IBinder paramIBinder)
    {
      this.gravity = paramInt;
      this.nq = paramIBinder;
    }
    
    public Bundle ca()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("popupLocationInfo.gravity", this.gravity);
      localBundle.putInt("popupLocationInfo.displayId", this.nr);
      localBundle.putInt("popupLocationInfo.left", this.left);
      localBundle.putInt("popupLocationInfo.top", this.top);
      localBundle.putInt("popupLocationInfo.right", this.right);
      localBundle.putInt("popupLocationInfo.bottom", this.bottom);
      return localBundle;
    }
  }
  
  private static final class b
    extends es
    implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
  {
    private boolean mK = false;
    private WeakReference<View> ns;
    
    protected b(em paramem, int paramInt)
    {
      super(paramInt, null);
    }
    
    private void f(View paramView)
    {
      int i = -1;
      if (ek.bO())
      {
        Display localDisplay = paramView.getDisplay();
        if (localDisplay != null) {
          i = localDisplay.getDisplayId();
        }
      }
      IBinder localIBinder = paramView.getWindowToken();
      int[] arrayOfInt = new int[2];
      paramView.getLocationInWindow(arrayOfInt);
      int j = paramView.getWidth();
      int k = paramView.getHeight();
      this.np.nr = i;
      this.np.nq = localIBinder;
      this.np.left = arrayOfInt[0];
      this.np.top = arrayOfInt[1];
      this.np.right = (j + arrayOfInt[0]);
      this.np.bottom = (k + arrayOfInt[1]);
      if (this.mK)
      {
        bX();
        this.mK = false;
      }
    }
    
    protected void Q(int paramInt)
    {
      this.np = new es.a(paramInt, null, null);
    }
    
    public void bX()
    {
      if (this.np.nq != null)
      {
        super.bX();
        return;
      }
      if (this.ns != null) {}
      for (boolean bool = true;; bool = false)
      {
        this.mK = bool;
        return;
      }
    }
    
    public void e(View paramView)
    {
      this.mz.bT();
      ViewTreeObserver localViewTreeObserver;
      if (this.ns != null)
      {
        View localView2 = (View)this.ns.get();
        Context localContext2 = this.mz.getContext();
        if ((localView2 == null) && ((localContext2 instanceof Activity))) {
          localView2 = ((Activity)localContext2).getWindow().getDecorView();
        }
        if (localView2 != null)
        {
          localView2.removeOnAttachStateChangeListener(this);
          localViewTreeObserver = localView2.getViewTreeObserver();
          if (!ek.bN()) {
            break label184;
          }
          localViewTreeObserver.removeOnGlobalLayoutListener(this);
        }
      }
      for (;;)
      {
        this.ns = null;
        Context localContext1 = this.mz.getContext();
        if ((paramView == null) && ((localContext1 instanceof Activity)))
        {
          View localView1 = ((Activity)localContext1).findViewById(16908290);
          if (localView1 == null) {
            localView1 = ((Activity)localContext1).getWindow().getDecorView();
          }
          ep.c("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
          paramView = localView1;
        }
        if (paramView == null) {
          break;
        }
        f(paramView);
        this.ns = new WeakReference(paramView);
        paramView.addOnAttachStateChangeListener(this);
        paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return;
        label184:
        localViewTreeObserver.removeGlobalOnLayoutListener(this);
      }
      ep.d("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }
    
    public void onGlobalLayout()
    {
      if (this.ns == null) {}
      View localView;
      do
      {
        return;
        localView = (View)this.ns.get();
      } while (localView == null);
      f(localView);
    }
    
    public void onViewAttachedToWindow(View paramView)
    {
      f(paramView);
    }
    
    public void onViewDetachedFromWindow(View paramView)
    {
      this.mz.bT();
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.es
 * JD-Core Version:    0.7.0.1
 */