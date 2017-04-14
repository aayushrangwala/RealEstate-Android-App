package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import com.google.android.gms.internal.z;

public final class InterstitialAd
{
  private final av dS = new av();
  private AdListener dT;
  private ac dU;
  private String dV;
  private a dW;
  private final Context mContext;
  
  public InterstitialAd(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void c(String paramString)
    throws RemoteException
  {
    if (this.dV == null) {
      d(paramString);
    }
    this.dU = u.a(this.mContext, new x(), this.dV, this.dS);
    if (this.dT != null) {
      this.dU.a(new t(this.dT));
    }
    if (this.dW != null) {
      this.dU.a(new z(this.dW));
    }
  }
  
  private void d(String paramString)
  {
    if (this.dU == null) {
      throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
    }
  }
  
  public AdListener getAdListener()
  {
    return this.dT;
  }
  
  public String getAdUnitId()
  {
    return this.dV;
  }
  
  public boolean isLoaded()
  {
    try
    {
      if (this.dU == null) {
        return false;
      }
      boolean bool = this.dU.isReady();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    try
    {
      if (this.dU == null) {
        c("loadAd");
      }
      if (this.dU.a(new v(this.mContext, paramAdRequest))) {
        this.dS.c(paramAdRequest.v());
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to load ad.", localRemoteException);
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
  
  public void setAdUnitId(String paramString)
  {
    if (this.dV != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }
    this.dV = paramString;
  }
  
  public void show()
  {
    try
    {
      d("show");
      this.dU.showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Failed to show interstitial.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.7.0.1
 */