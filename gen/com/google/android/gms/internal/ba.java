package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

public final class ba<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  implements MediationBannerListener, MediationInterstitialListener
{
  private final ay ft;
  
  public ba(ay paramay)
  {
    this.ft = paramay;
  }
  
  public void onClick(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    cn.m("Adapter called onClick.");
    if (!cm.ar())
    {
      cn.q("onClick must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).y();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdClicked.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.y();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdClicked.", localRemoteException);
    }
  }
  
  public void onDismissScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    cn.m("Adapter called onDismissScreen.");
    if (!cm.ar())
    {
      cn.q("onDismissScreen must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdClosed();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdClosed.", localRemoteException);
    }
  }
  
  public void onDismissScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    cn.m("Adapter called onDismissScreen.");
    if (!cm.ar())
    {
      cn.q("onDismissScreen must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdClosed();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdClosed.", localRemoteException);
    }
  }
  
  public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, final AdRequest.ErrorCode paramErrorCode)
  {
    cn.m("Adapter called onFailedToReceiveAd with error. " + paramErrorCode);
    if (!cm.ar())
    {
      cn.q("onFailedToReceiveAd must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdFailedToLoad(bb.a(paramErrorCode));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdFailedToLoad(bb.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
  
  public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, final AdRequest.ErrorCode paramErrorCode)
  {
    cn.m("Adapter called onFailedToReceiveAd with error " + paramErrorCode + ".");
    if (!cm.ar())
    {
      cn.q("onFailedToReceiveAd must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdFailedToLoad(bb.a(paramErrorCode));
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdFailedToLoad(bb.a(paramErrorCode));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
  
  public void onLeaveApplication(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    cn.m("Adapter called onLeaveApplication.");
    if (!cm.ar())
    {
      cn.q("onLeaveApplication must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdLeftApplication();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
  
  public void onLeaveApplication(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    cn.m("Adapter called onLeaveApplication.");
    if (!cm.ar())
    {
      cn.q("onLeaveApplication must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdLeftApplication();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
  
  public void onPresentScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    cn.m("Adapter called onPresentScreen.");
    if (!cm.ar())
    {
      cn.q("onPresentScreen must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdOpened();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdOpened.", localRemoteException);
    }
  }
  
  public void onPresentScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    cn.m("Adapter called onPresentScreen.");
    if (!cm.ar())
    {
      cn.q("onPresentScreen must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdOpened();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdOpened.", localRemoteException);
    }
  }
  
  public void onReceivedAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    cn.m("Adapter called onReceivedAd.");
    if (!cm.ar())
    {
      cn.q("onReceivedAd must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdLoaded();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdLoaded.", localRemoteException);
    }
  }
  
  public void onReceivedAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    cn.m("Adapter called onReceivedAd.");
    if (!cm.ar())
    {
      cn.q("onReceivedAd must be called on the main UI thread.");
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          try
          {
            ba.a(ba.this).onAdLoaded();
            return;
          }
          catch (RemoteException localRemoteException)
          {
            cn.b("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.ft.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call onAdLoaded.", localRemoteException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ba
 * JD-Core Version:    0.7.0.1
 */