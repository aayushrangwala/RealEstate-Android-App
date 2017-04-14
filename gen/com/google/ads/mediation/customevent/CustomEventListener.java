package com.google.ads.mediation.customevent;

@Deprecated
public abstract interface CustomEventListener
{
  public abstract void onDismissScreen();
  
  public abstract void onFailedToReceiveAd();
  
  public abstract void onLeaveApplication();
  
  public abstract void onPresentScreen();
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventListener
 * JD-Core Version:    0.7.0.1
 */