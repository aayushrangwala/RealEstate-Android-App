package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import com.google.android.gms.internal.z;

public final class AdView
  extends ViewGroup
{
  private AdSize c;
  private final av dS = new av();
  private AdListener dT;
  private ac dU;
  private String dV;
  private a dW;
  
  public AdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      aa localaa = new aa(paramContext, paramAttributeSet);
      this.c = localaa.getAdSize();
      this.dV = localaa.getAdUnitId();
      if (isInEditMode()) {
        cm.b(this, new x(paramContext, this.c), "Ads by Google");
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      cm.a(this, new x(paramContext, AdSize.BANNER), localIllegalArgumentException.getMessage());
    }
  }
  
  private void c(String paramString)
    throws RemoteException
  {
    if ((this.c == null) || (this.dV == null)) {
      d(paramString);
    }
    Context localContext = getContext();
    this.dU = u.a(localContext, new x(localContext, this.c), this.dV, this.dS);
    if (this.dT != null) {
      this.dU.a(new t(this.dT));
    }
    if (this.dW != null) {
      this.dU.a(new z(this.dW));
    }
    x();
  }
  
  private void d(String paramString)
  {
    if (this.dU == null) {
      throw new IllegalStateException("The ad size and ad unit ID must be set on AdView before " + paramString + " is called.");
    }
  }
  
  private void x()
  {
    try
    {
      b localb = this.dU.z();
      if (localb == null) {
        return;
      }
      addView((View)c.b(localb));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to get an ad frame.", localRemoteException);
    }
  }
  
  public void destroy()
  {
    try
    {
      if (this.dU != null) {
        this.dU.destroy();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to destroy AdView.", localRemoteException);
    }
  }
  
  public AdListener getAdListener()
  {
    return this.dT;
  }
  
  public AdSize getAdSize()
  {
    return this.c;
  }
  
  public String getAdUnitId()
  {
    return this.dV;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    try
    {
      if (this.dU == null) {
        c("loadAd");
      }
      if (this.dU.a(new v(getContext(), paramAdRequest))) {
        this.dS.c(paramAdRequest.v());
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to load ad.", localRemoteException);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      int k = (paramInt3 - paramInt1 - i) / 2;
      int m = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(k, m, i + k, j + m);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = getChildAt(0);
    int j;
    int i;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      measureChild(localView, paramInt1, paramInt2);
      j = localView.getMeasuredWidth();
      i = localView.getMeasuredHeight();
    }
    for (;;)
    {
      int k = Math.max(j, getSuggestedMinimumWidth());
      int m = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(resolveSize(k, paramInt1), resolveSize(m, paramInt2));
      return;
      if (this.c != null)
      {
        Context localContext = getContext();
        j = this.c.getWidthInPixels(localContext);
        i = this.c.getHeightInPixels(localContext);
      }
      else
      {
        i = 0;
        j = 0;
      }
    }
  }
  
  public void pause()
  {
    try
    {
      if (this.dU != null) {
        this.dU.pause();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to call pause.", localRemoteException);
    }
  }
  
  public void resume()
  {
    try
    {
      if (this.dU != null) {
        this.dU.resume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to call resume.", localRemoteException);
    }
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    try
    {
      this.dT = paramAdListener;
      ac localac;
      if (this.dU != null)
      {
        localac = this.dU;
        if (paramAdListener == null) {
          break label40;
        }
      }
      label40:
      for (t localt = new t(paramAdListener);; localt = null)
      {
        localac.a(localt);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to set the AdListener.", localRemoteException);
    }
  }
  
  public void setAdSize(AdSize paramAdSize)
  {
    if (this.c != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    this.c = paramAdSize;
    requestLayout();
  }
  
  public void setAdUnitId(String paramString)
  {
    if (this.dV != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    this.dV = paramString;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdView
 * JD-Core Version:    0.7.0.1
 */