package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ey
{
  private final Context mContext;
  private final fc<ex> oO;
  private ContentProviderClient oP = null;
  private boolean oQ = false;
  private HashMap<LocationListener, b> oR = new HashMap();
  
  public ey(Context paramContext, fc<ex> paramfc)
  {
    this.mContext = paramContext;
    this.oO = paramfc;
  }
  
  public void cm()
  {
    if (this.oQ) {
      setMockMode(false);
    }
  }
  
  public Location getLastLocation()
  {
    this.oO.bc();
    try
    {
      Location localLocation = ((ex)this.oO.bd()).cl();
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void removeAllListeners()
  {
    try
    {
      synchronized (this.oR)
      {
        Iterator localIterator = this.oR.values().iterator();
        while (localIterator.hasNext())
        {
          b localb = (b)localIterator.next();
          if (localb != null) {
            ((ex)this.oO.bd()).a(localb);
          }
        }
      }
      this.oR.clear();
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    this.oO.bc();
    try
    {
      ((ex)this.oO.bd()).a(paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    this.oO.bc();
    dm.a(paramLocationListener, "Invalid null listener");
    synchronized (this.oR)
    {
      b localb = (b)this.oR.remove(paramLocationListener);
      if ((this.oP != null) && (this.oR.isEmpty()))
      {
        this.oP.release();
        this.oP = null;
      }
      if (localb != null) {
        localb.release();
      }
      try
      {
        ((ex)this.oO.bd()).a(localb);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new IllegalStateException(localRemoteException);
      }
    }
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    this.oO.bc();
    try
    {
      ((ex)this.oO.bd()).a(paramLocationRequest, paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.oO.bc();
    if (paramLooper == null) {
      dm.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
    }
    for (;;)
    {
      b localb1;
      synchronized (this.oR)
      {
        localb1 = (b)this.oR.get(paramLocationListener);
        if (localb1 == null)
        {
          localb2 = new b(paramLocationListener, paramLooper);
          this.oR.put(paramLocationListener, localb2);
          try
          {
            ((ex)this.oO.bd()).a(paramLocationRequest, localb2, this.mContext.getPackageName());
            return;
          }
          catch (RemoteException localRemoteException)
          {
            throw new IllegalStateException(localRemoteException);
          }
        }
      }
      b localb2 = localb1;
    }
  }
  
  public void setMockLocation(Location paramLocation)
  {
    this.oO.bc();
    try
    {
      ((ex)this.oO.bd()).setMockLocation(paramLocation);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void setMockMode(boolean paramBoolean)
  {
    this.oO.bc();
    try
    {
      ((ex)this.oO.bd()).setMockMode(paramBoolean);
      this.oQ = paramBoolean;
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  private static class a
    extends Handler
  {
    private final LocationListener oS;
    
    public a(LocationListener paramLocationListener)
    {
      this.oS = paramLocationListener;
    }
    
    public a(LocationListener paramLocationListener, Looper paramLooper)
    {
      super();
      this.oS = paramLocationListener;
    }
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
        return;
      }
      Location localLocation = new Location((Location)paramMessage.obj);
      this.oS.onLocationChanged(localLocation);
    }
  }
  
  private static class b
    extends a.a
  {
    private Handler oT;
    
    b(LocationListener paramLocationListener, Looper paramLooper)
    {
      if (paramLooper == null) {}
      for (ey.a locala = new ey.a(paramLocationListener);; locala = new ey.a(paramLocationListener, paramLooper))
      {
        this.oT = locala;
        return;
      }
    }
    
    public void onLocationChanged(Location paramLocation)
    {
      if (this.oT == null)
      {
        Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
        return;
      }
      Message localMessage = Message.obtain();
      localMessage.what = 1;
      localMessage.obj = paramLocation;
      this.oT.sendMessage(localMessage);
    }
    
    public void release()
    {
      this.oT = null;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ey
 * JD-Core Version:    0.7.0.1
 */