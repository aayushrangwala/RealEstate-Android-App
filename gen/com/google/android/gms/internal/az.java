package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobServerParameters;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class az<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  extends ax.a
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> fr;
  private final NETWORK_EXTRAS fs;
  
  public az(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.fr = paramMediationAdapter;
    this.fs = paramNETWORK_EXTRAS;
  }
  
  private SERVER_PARAMETERS a(String paramString, int paramInt)
    throws RemoteException
  {
    if (paramString != null) {
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        HashMap localHashMap2 = new HashMap(localJSONObject.length());
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap2.put(str, localJSONObject.getString(str));
        }
        localObject1 = localHashMap2;
      }
      catch (Throwable localThrowable)
      {
        cn.b("Could not get MediationServerParameters.", localThrowable);
        throw new RemoteException();
      }
    }
    Object localObject2;
    for (;;)
    {
      Class localClass = this.fr.getServerParametersType();
      localObject2 = null;
      if (localClass != null)
      {
        MediationServerParameters localMediationServerParameters = (MediationServerParameters)localClass.newInstance();
        localMediationServerParameters.load((Map)localObject1);
        localObject2 = localMediationServerParameters;
      }
      if (!(localObject2 instanceof AdMobServerParameters)) {
        break;
      }
      ((AdMobServerParameters)localObject2).tagForChildDirectedTreatment = paramInt;
      return localObject2;
      HashMap localHashMap1 = new HashMap(0);
      Object localObject1 = localHashMap1;
    }
    return localObject2;
  }
  
  public void a(b paramb, v paramv, String paramString, ay paramay)
    throws RemoteException
  {
    if (!(this.fr instanceof MediationInterstitialAdapter))
    {
      cn.q("MediationAdapter is not a MediationInterstitialAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Requesting interstitial ad from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.fr).requestInterstitialAd(new ba(paramay), (Activity)c.b(paramb), a(paramString, paramv.tagForChildDirectedTreatment), bb.e(paramv), this.fs);
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not request interstitial ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void a(b paramb, x paramx, v paramv, String paramString, ay paramay)
    throws RemoteException
  {
    if (!(this.fr instanceof MediationBannerAdapter))
    {
      cn.q("MediationAdapter is not a MediationBannerAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Requesting banner ad from adapter.");
    try
    {
      ((MediationBannerAdapter)this.fr).requestBannerAd(new ba(paramay), (Activity)c.b(paramb), a(paramString, paramv.tagForChildDirectedTreatment), bb.a(paramx), bb.e(paramv), this.fs);
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not request banner ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void destroy()
    throws RemoteException
  {
    try
    {
      this.fr.destroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public b getView()
    throws RemoteException
  {
    if (!(this.fr instanceof MediationBannerAdapter))
    {
      cn.q("MediationAdapter is not a MediationBannerAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      b localb = c.g(((MediationBannerAdapter)this.fr).getBannerView());
      return localb;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public void showInterstitial()
    throws RemoteException
  {
    if (!(this.fr instanceof MediationInterstitialAdapter))
    {
      cn.q("MediationAdapter is not a MediationInterstitialAdapter: " + this.fr.getClass().getCanonicalName());
      throw new RemoteException();
    }
    cn.m("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.fr).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.b("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.az
 * JD-Core Version:    0.7.0.1
 */