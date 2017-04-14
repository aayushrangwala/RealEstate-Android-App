package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class t
  extends ab.a
{
  private final AdListener dT;
  
  public t(AdListener paramAdListener)
  {
    this.dT = paramAdListener;
  }
  
  public void onAdClosed()
  {
    this.dT.onAdClosed();
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    this.dT.onAdFailedToLoad(paramInt);
  }
  
  public void onAdLeftApplication()
  {
    this.dT.onAdLeftApplication();
  }
  
  public void onAdLoaded()
  {
    this.dT.onAdLoaded();
  }
  
  public void onAdOpened()
  {
    this.dT.onAdOpened();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.t
 * JD-Core Version:    0.7.0.1
 */