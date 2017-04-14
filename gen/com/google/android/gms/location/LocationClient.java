package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationClient
  implements GooglePlayServicesClient
{
  public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
  public static final String KEY_MOCK_LOCATION = "mockLocation";
  private final ez ou;
  
  public LocationClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ou = new ez(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, "location");
  }
  
  public static int getErrorCode(Intent paramIntent)
  {
    return paramIntent.getIntExtra("gms_error_code", -1);
  }
  
  public static int getGeofenceTransition(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
    if (i == -1) {}
    while ((i != 1) && (i != 2) && (i != 4)) {
      return -1;
    }
    return i;
  }
  
  public static List<Geofence> getTriggeringGeofences(Intent paramIntent)
  {
    ArrayList localArrayList1 = (ArrayList)paramIntent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
    if (localArrayList1 == null) {
      return null;
    }
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext()) {
      localArrayList2.add(fa.d((byte[])localIterator.next()));
    }
    return localArrayList2;
  }
  
  public static boolean hasError(Intent paramIntent)
  {
    return paramIntent.hasExtra("gms_error_code");
  }
  
  public void addGeofences(List<Geofence> paramList, PendingIntent paramPendingIntent, OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
  {
    Object localObject = null;
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Geofence localGeofence = (Geofence)localIterator.next();
        dm.b(localGeofence instanceof fa, "Geofence must be created using Geofence.Builder.");
        localArrayList.add((fa)localGeofence);
      }
      localObject = localArrayList;
    }
    this.ou.addGeofences(localObject, paramPendingIntent, paramOnAddGeofencesResultListener);
  }
  
  public void connect()
  {
    this.ou.connect();
  }
  
  public void disconnect()
  {
    this.ou.disconnect();
  }
  
  public Location getLastLocation()
  {
    return this.ou.getLastLocation();
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
  
  public void removeGeofences(PendingIntent paramPendingIntent, OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    this.ou.removeGeofences(paramPendingIntent, paramOnRemoveGeofencesResultListener);
  }
  
  public void removeGeofences(List<String> paramList, OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    this.ou.removeGeofences(paramList, paramOnRemoveGeofencesResultListener);
  }
  
  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    this.ou.removeLocationUpdates(paramPendingIntent);
  }
  
  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    this.ou.removeLocationUpdates(paramLocationListener);
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    this.ou.requestLocationUpdates(paramLocationRequest, paramPendingIntent);
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    this.ou.requestLocationUpdates(paramLocationRequest, paramLocationListener);
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.ou.requestLocationUpdates(paramLocationRequest, paramLocationListener, paramLooper);
  }
  
  public void setMockLocation(Location paramLocation)
  {
    this.ou.setMockLocation(paramLocation);
  }
  
  public void setMockMode(boolean paramBoolean)
  {
    this.ou.setMockMode(paramBoolean);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.ou.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ou.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public static abstract interface OnAddGeofencesResultListener
  {
    public abstract void onAddGeofencesResult(int paramInt, String[] paramArrayOfString);
  }
  
  public static abstract interface OnRemoveGeofencesResultListener
  {
    public abstract void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent);
    
    public abstract void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationClient
 * JD-Core Version:    0.7.0.1
 */