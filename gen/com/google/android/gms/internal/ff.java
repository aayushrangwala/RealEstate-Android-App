package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.panorama.PanoramaClient.OnPanoramaInfoLoadedListener;
import com.google.android.gms.panorama.PanoramaClient.a;

public class ff
  extends de<fe>
{
  public ff(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, (String[])null);
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    paramdj.a(paramd, 4030500, getContext().getPackageName(), localBundle);
  }
  
  public void a(b paramb, Uri paramUri, Bundle paramBundle, boolean paramBoolean)
  {
    bc();
    if (paramBoolean) {
      getContext().grantUriPermission("com.google.android.gms", paramUri, 1);
    }
    try
    {
      ((fe)bd()).a(paramb, paramUri, paramBundle, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramb.a(8, null, 0, null);
    }
  }
  
  public void a(PanoramaClient.OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener, Uri paramUri, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Uri localUri = paramUri;; localUri = null)
    {
      a(new b(paramOnPanoramaInfoLoadedListener, localUri), paramUri, null, paramBoolean);
      return;
    }
  }
  
  protected String ag()
  {
    return "com.google.android.gms.panorama.service.START";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.panorama.internal.IPanoramaService";
  }
  
  public fe am(IBinder paramIBinder)
  {
    return fe.a.al(paramIBinder);
  }
  
  final class a
    extends de<fe>.b<PanoramaClient.a>
  {
    public final ConnectionResult qV;
    public final Intent qW;
    public final int type;
    
    public a(PanoramaClient.a parama, ConnectionResult paramConnectionResult, int paramInt, Intent paramIntent)
    {
      super(parama);
      this.qV = paramConnectionResult;
      this.type = paramInt;
      this.qW = paramIntent;
    }
    
    protected void a(PanoramaClient.a parama)
    {
      if (parama != null) {
        parama.a(this.qV, this.type, this.qW);
      }
    }
    
    protected void aF() {}
  }
  
  final class b
    extends fd.a
  {
    private final PanoramaClient.a qY = null;
    private final PanoramaClient.OnPanoramaInfoLoadedListener qZ;
    private final Uri ra;
    
    public b(PanoramaClient.OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener, Uri paramUri)
    {
      this.qZ = paramOnPanoramaInfoLoadedListener;
      this.ra = paramUri;
    }
    
    public void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
    {
      if (this.ra != null) {
        ff.this.getContext().revokeUriPermission(this.ra, 1);
      }
      PendingIntent localPendingIntent = null;
      if (paramBundle != null) {
        localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent");
      }
      ConnectionResult localConnectionResult = new ConnectionResult(paramInt1, localPendingIntent);
      if (this.qY != null)
      {
        ff.this.a(new ff.a(ff.this, this.qY, localConnectionResult, paramInt2, paramIntent));
        return;
      }
      ff.this.a(new ff.c(ff.this, this.qZ, localConnectionResult, paramIntent));
    }
  }
  
  final class c
    extends de<fe>.b<PanoramaClient.OnPanoramaInfoLoadedListener>
  {
    private final ConnectionResult qV;
    private final Intent qW;
    
    public c(PanoramaClient.OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener, ConnectionResult paramConnectionResult, Intent paramIntent)
    {
      super(paramOnPanoramaInfoLoadedListener);
      this.qV = paramConnectionResult;
      this.qW = paramIntent;
    }
    
    protected void a(PanoramaClient.OnPanoramaInfoLoadedListener paramOnPanoramaInfoLoadedListener)
    {
      if (paramOnPanoramaInfoLoadedListener != null) {
        paramOnPanoramaInfoLoadedListener.onPanoramaInfoLoaded(this.qV, this.qW);
      }
    }
    
    protected void aF() {}
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ff
 * JD-Core Version:    0.7.0.1
 */