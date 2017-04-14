package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

public class ez
  extends de<ex>
{
  private final fc<ex> oO = new c(null);
  private final ey oU = new ey(paramContext, this.oO);
  private final String oV;
  
  public ez(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.oV = paramString;
  }
  
  protected ex G(IBinder paramIBinder)
  {
    return ex.a.F(paramIBinder);
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("client_name", this.oV);
    paramdj.e(paramd, 4030500, getContext().getPackageName(), localBundle);
  }
  
  public void addGeofences(List<fa> paramList, PendingIntent paramPendingIntent, LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
  {
    bc();
    if ((paramList != null) && (paramList.size() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      dm.b(bool, "At least one geofence must be specified.");
      dm.a(paramPendingIntent, "PendingIntent must be specified.");
      dm.a(paramOnAddGeofencesResultListener, "OnAddGeofencesResultListener not provided.");
      if (paramOnAddGeofencesResultListener == null) {}
      for (Object localObject = null;; localObject = localb)
      {
        try
        {
          ((ex)bd()).a(paramList, paramPendingIntent, (ew)localObject, getContext().getPackageName());
          return;
        }
        catch (RemoteException localRemoteException)
        {
          b localb;
          throw new IllegalStateException(localRemoteException);
        }
        localb = new b(paramOnAddGeofencesResultListener, this);
      }
    }
  }
  
  protected String ag()
  {
    return "com.google.android.location.internal.GoogleLocationManagerService.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
  }
  
  public void disconnect()
  {
    synchronized (this.oU)
    {
      if (isConnected())
      {
        this.oU.removeAllListeners();
        this.oU.cm();
      }
      super.disconnect();
      return;
    }
  }
  
  public Location getLastLocation()
  {
    return this.oU.getLastLocation();
  }
  
  public void removeActivityUpdates(PendingIntent paramPendingIntent)
  {
    bc();
    dm.e(paramPendingIntent);
    try
    {
      ((ex)bd()).removeActivityUpdates(paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void removeGeofences(PendingIntent paramPendingIntent, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    bc();
    dm.a(paramPendingIntent, "PendingIntent must be specified.");
    dm.a(paramOnRemoveGeofencesResultListener, "OnRemoveGeofencesResultListener not provided.");
    if (paramOnRemoveGeofencesResultListener == null) {}
    for (Object localObject = null;; localObject = localb)
    {
      try
      {
        ((ex)bd()).a(paramPendingIntent, (ew)localObject, getContext().getPackageName());
        return;
      }
      catch (RemoteException localRemoteException)
      {
        b localb;
        throw new IllegalStateException(localRemoteException);
      }
      localb = new b(paramOnRemoveGeofencesResultListener, this);
    }
  }
  
  public void removeGeofences(List<String> paramList, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    bc();
    if ((paramList != null) && (paramList.size() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      dm.b(bool, "geofenceRequestIds can't be null nor empty.");
      dm.a(paramOnRemoveGeofencesResultListener, "OnRemoveGeofencesResultListener not provided.");
      String[] arrayOfString = (String[])paramList.toArray(new String[0]);
      if (paramOnRemoveGeofencesResultListener == null) {}
      for (Object localObject = null;; localObject = localb)
      {
        try
        {
          ((ex)bd()).a(arrayOfString, (ew)localObject, getContext().getPackageName());
          return;
        }
        catch (RemoteException localRemoteException)
        {
          b localb;
          throw new IllegalStateException(localRemoteException);
        }
        localb = new b(paramOnRemoveGeofencesResultListener, this);
      }
    }
  }
  
  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    this.oU.removeLocationUpdates(paramPendingIntent);
  }
  
  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    this.oU.removeLocationUpdates(paramLocationListener);
  }
  
  public void requestActivityUpdates(long paramLong, PendingIntent paramPendingIntent)
  {
    boolean bool = true;
    bc();
    dm.e(paramPendingIntent);
    if (paramLong >= 0L) {}
    for (;;)
    {
      dm.b(bool, "detectionIntervalMillis must be >= 0");
      try
      {
        ((ex)bd()).a(paramLong, true, paramPendingIntent);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new IllegalStateException(localRemoteException);
      }
      bool = false;
    }
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    this.oU.requestLocationUpdates(paramLocationRequest, paramPendingIntent);
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    requestLocationUpdates(paramLocationRequest, paramLocationListener, null);
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    synchronized (this.oU)
    {
      this.oU.requestLocationUpdates(paramLocationRequest, paramLocationListener, paramLooper);
      return;
    }
  }
  
  public void setMockLocation(Location paramLocation)
  {
    this.oU.setMockLocation(paramLocation);
  }
  
  public void setMockMode(boolean paramBoolean)
  {
    this.oU.setMockMode(paramBoolean);
  }
  
  private final class a
    extends de<ex>.b<LocationClient.OnAddGeofencesResultListener>
  {
    private final int iC;
    private final String[] oW;
    
    public a(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, int paramInt, String[] paramArrayOfString)
    {
      super(paramOnAddGeofencesResultListener);
      this.iC = LocationStatusCodes.Z(paramInt);
      this.oW = paramArrayOfString;
    }
    
    protected void a(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
    {
      if (paramOnAddGeofencesResultListener != null) {
        paramOnAddGeofencesResultListener.onAddGeofencesResult(this.iC, this.oW);
      }
    }
    
    protected void aF() {}
  }
  
  private static final class b
    extends ew.a
  {
    private LocationClient.OnAddGeofencesResultListener oY;
    private LocationClient.OnRemoveGeofencesResultListener oZ;
    private ez pa;
    
    public b(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, ez paramez)
    {
      this.oY = paramOnAddGeofencesResultListener;
      this.oZ = null;
      this.pa = paramez;
    }
    
    public b(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, ez paramez)
    {
      this.oZ = paramOnRemoveGeofencesResultListener;
      this.oY = null;
      this.pa = paramez;
    }
    
    public void onAddGeofencesResult(int paramInt, String[] paramArrayOfString)
      throws RemoteException
    {
      if (this.pa == null)
      {
        Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
        return;
      }
      ez localez1 = this.pa;
      ez localez2 = this.pa;
      localez2.getClass();
      localez1.a(new ez.a(localez2, this.oY, paramInt, paramArrayOfString));
      this.pa = null;
      this.oY = null;
      this.oZ = null;
    }
    
    public void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent)
    {
      if (this.pa == null)
      {
        Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
        return;
      }
      ez localez1 = this.pa;
      ez localez2 = this.pa;
      localez2.getClass();
      localez1.a(new ez.d(localez2, 1, this.oZ, paramInt, paramPendingIntent));
      this.pa = null;
      this.oY = null;
      this.oZ = null;
    }
    
    public void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString)
    {
      if (this.pa == null)
      {
        Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
        return;
      }
      ez localez1 = this.pa;
      ez localez2 = this.pa;
      localez2.getClass();
      localez1.a(new ez.d(localez2, 2, this.oZ, paramInt, paramArrayOfString));
      this.pa = null;
      this.oY = null;
      this.oZ = null;
    }
  }
  
  private final class c
    implements fc<ex>
  {
    private c() {}
    
    public void bc()
    {
      ez.a(ez.this);
    }
    
    public ex cn()
    {
      return (ex)ez.b(ez.this);
    }
  }
  
  private final class d
    extends de<ex>.b<LocationClient.OnRemoveGeofencesResultListener>
  {
    private final int iC;
    private final PendingIntent mPendingIntent;
    private final String[] oW;
    private final int pb;
    
    public d(int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, PendingIntent paramPendingIntent)
    {
      super(paramOnRemoveGeofencesResultListener);
      if (paramInt1 == i) {}
      for (;;)
      {
        db.k(i);
        this.pb = paramInt1;
        this.iC = LocationStatusCodes.Z(paramInt2);
        this.mPendingIntent = paramPendingIntent;
        this.oW = null;
        return;
        i = 0;
      }
    }
    
    public d(int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, String[] paramArrayOfString)
    {
      super(paramOnRemoveGeofencesResultListener);
      if (paramInt1 == 2) {}
      for (boolean bool = true;; bool = false)
      {
        db.k(bool);
        this.pb = paramInt1;
        this.iC = LocationStatusCodes.Z(paramInt2);
        this.oW = paramArrayOfString;
        this.mPendingIntent = null;
        return;
      }
    }
    
    protected void a(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
    {
      if (paramOnRemoveGeofencesResultListener != null) {}
      switch (this.pb)
      {
      default: 
        Log.wtf("LocationClientImpl", "Unsupported action: " + this.pb);
        return;
      case 1: 
        paramOnRemoveGeofencesResultListener.onRemoveGeofencesByPendingIntentResult(this.iC, this.mPendingIntent);
        return;
      }
      paramOnRemoveGeofencesResultListener.onRemoveGeofencesByRequestIdsResult(this.iC, this.oW);
    }
    
    protected void aF() {}
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ez
 * JD-Core Version:    0.7.0.1
 */