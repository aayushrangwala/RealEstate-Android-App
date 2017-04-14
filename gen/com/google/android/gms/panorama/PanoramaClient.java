package com.google.android.gms.panorama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.ff;

public class PanoramaClient
  implements GooglePlayServicesClient
{
  private final ff qU;
  
  public PanoramaClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.qU = new ff(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public void connect()
  {
    this.qU.connect();
  }
  
  public void disconnect()
  {
    this.qU.disconnect();
  }
  
  public boolean isConnected()
  {
    return this.qU.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.qU.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.qU.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.qU.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void loadPanoramaInfo(OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener, Uri paramUri)
  {
    this.qU.a(paramOnPanoramaInfoLoadedListener, paramUri, false);
  }
  
  public void loadPanoramaInfoAndGrantAccess(OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener, Uri paramUri)
  {
    this.qU.a(paramOnPanoramaInfoLoadedListener, paramUri, true);
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.qU.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.qU.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.qU.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.qU.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public static abstract interface OnPanoramaInfoLoadedListener
  {
    public abstract void onPanoramaInfoLoaded(ConnectionResult paramConnectionResult, Intent paramIntent);
  }
  
  public static abstract interface a
  {
    public abstract void a(ConnectionResult paramConnectionResult, int paramInt, Intent paramIntent);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.panorama.PanoramaClient
 * JD-Core Version:    0.7.0.1
 */