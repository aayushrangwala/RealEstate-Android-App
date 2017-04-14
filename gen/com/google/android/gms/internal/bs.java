package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public abstract class bs
  extends cg
{
  private final bu eI;
  private final br.a gx;
  
  public bs(bu parambu, br.a parama)
  {
    this.eI = parambu;
    this.gx = parama;
  }
  
  private static bw a(by paramby, bu parambu)
  {
    try
    {
      bw localbw = paramby.a(parambu);
      return localbw;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not fetch ad response from ad request service.", localRemoteException);
    }
    return null;
  }
  
  /* Error */
  public final void ac()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 39	com/google/android/gms/internal/bs:af	()Lcom/google/android/gms/internal/by;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull +27 -> 33
    //   9: new 41	com/google/android/gms/internal/bw
    //   12: dup
    //   13: iconst_0
    //   14: invokespecial 44	com/google/android/gms/internal/bw:<init>	(I)V
    //   17: astore_3
    //   18: aload_0
    //   19: invokevirtual 47	com/google/android/gms/internal/bs:ae	()V
    //   22: aload_0
    //   23: getfield 17	com/google/android/gms/internal/bs:gx	Lcom/google/android/gms/internal/br$a;
    //   26: aload_3
    //   27: invokeinterface 52 2 0
    //   32: return
    //   33: aload_2
    //   34: aload_0
    //   35: getfield 15	com/google/android/gms/internal/bs:eI	Lcom/google/android/gms/internal/bu;
    //   38: invokestatic 54	com/google/android/gms/internal/bs:a	(Lcom/google/android/gms/internal/by;Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnonnull -25 -> 18
    //   46: new 41	com/google/android/gms/internal/bw
    //   49: dup
    //   50: iconst_0
    //   51: invokespecial 44	com/google/android/gms/internal/bw:<init>	(I)V
    //   54: astore_3
    //   55: goto -37 -> 18
    //   58: astore_1
    //   59: aload_0
    //   60: invokevirtual 47	com/google/android/gms/internal/bs:ae	()V
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	bs
    //   58	6	1	localObject	Object
    //   4	30	2	localby	by
    //   17	38	3	localbw	bw
    // Exception table:
    //   from	to	target	type
    //   0	5	58	finally
    //   9	18	58	finally
    //   33	42	58	finally
    //   46	55	58	finally
  }
  
  public abstract void ae();
  
  public abstract by af();
  
  public final void onStop()
  {
    ae();
  }
  
  public static final class a
    extends bs
  {
    private final Context mContext;
    
    public a(Context paramContext, bu parambu, br.a parama)
    {
      super(parama);
      this.mContext = paramContext;
    }
    
    public void ae() {}
    
    public by af()
    {
      return bz.a(this.mContext, new am());
    }
  }
  
  public static final class b
    extends bs
    implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
  {
    private final Object eJ = new Object();
    private final br.a gx;
    private final bt gy;
    
    public b(Context paramContext, bu parambu, br.a parama)
    {
      super(parama);
      this.gx = parama;
      this.gy = new bt(paramContext, this, this, parambu.eg.hR);
      this.gy.connect();
    }
    
    public void ae()
    {
      synchronized (this.eJ)
      {
        if ((this.gy.isConnected()) || (this.gy.isConnecting())) {
          this.gy.disconnect();
        }
        return;
      }
    }
    
    public by af()
    {
      synchronized (this.eJ)
      {
        try
        {
          by localby = this.gy.ai();
          return localby;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          return null;
        }
      }
    }
    
    public void onConnected(Bundle paramBundle)
    {
      start();
    }
    
    public void onConnectionFailed(ConnectionResult paramConnectionResult)
    {
      this.gx.a(new bw(0));
    }
    
    public void onDisconnected()
    {
      cn.m("Disconnected from remote ad request service.");
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bs
 * JD-Core Version:    0.7.0.1
 */