package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.ez;

public class ActivityRecognitionClient
  implements GooglePlayServicesClient
{
  private final ez ou;
  
  public ActivityRecognitionClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ou = new ez(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, "activity_recognition");
  }
  
  public void connect()
  {
    this.ou.connect();
  }
  
  public void disconnect()
  {
    this.ou.disconnect();
  }
  
  public boolean isConnected()
  {
    return this.ou.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.ou.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.ou.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.ou.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.ou.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ou.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void removeActivityUpdates(PendingIntent paramPendingIntent)
  {
    this.ou.removeActivityUpdates(paramPendingIntent);
  }
  
  public void requestActivityUpdates(long paramLong, PendingIntent paramPendingIntent)
  {
    this.ou.requestActivityUpdates(paramLong, paramPendingIntent);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.ou.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ou.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionClient
 * JD-Core Version:    0.7.0.1
 */