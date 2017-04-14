package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public class bt
  extends de<by>
{
  private final int gz;
  
  public bt(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.gz = paramInt;
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    paramdj.g(paramd, this.gz, getContext().getPackageName(), localBundle);
  }
  
  protected String ag()
  {
    return "com.google.android.gms.ads.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  public by ai()
  {
    return (by)super.bd();
  }
  
  protected by o(IBinder paramIBinder)
  {
    return by.a.q(paramIBinder);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bt
 * JD-Core Version:    0.7.0.1
 */