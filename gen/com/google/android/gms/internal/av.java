package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import java.util.Map;

public final class av
  extends aw.a
{
  private Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> fq;
  
  private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> ax h(String paramString)
    throws RemoteException
  {
    try
    {
      MediationAdapter localMediationAdapter = (MediationAdapter)Class.forName(paramString).newInstance();
      az localaz = new az(localMediationAdapter, (com.google.ads.mediation.NetworkExtras)this.fq.get(localMediationAdapter.getAdditionalParametersType()));
      return localaz;
    }
    catch (Throwable localThrowable)
    {
      cn.q("Could not instantiate mediation adapter: " + paramString + ". " + localThrowable.getMessage());
      throw new RemoteException();
    }
  }
  
  public void c(Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> paramMap)
  {
    this.fq = paramMap;
  }
  
  public ax g(String paramString)
    throws RemoteException
  {
    return h(paramString);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.av
 * JD-Core Version:    0.7.0.1
 */