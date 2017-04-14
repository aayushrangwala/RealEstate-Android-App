package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.c;

public final class as
  implements at.a
{
  private final aw dZ;
  private final Object eJ = new Object();
  private final v em;
  private final String fd;
  private final long fe;
  private final ao ff;
  private final x fg;
  private ax fh;
  private int fi = -2;
  private final Context mContext;
  
  public as(Context paramContext, String paramString, aw paramaw, ap paramap, ao paramao, v paramv, x paramx)
  {
    this.mContext = paramContext;
    this.fd = paramString;
    this.dZ = paramaw;
    if (paramap.eV != -1L) {}
    for (long l = paramap.eV;; l = 10000L)
    {
      this.fe = l;
      this.ff = paramao;
      this.em = paramv;
      this.fg = paramx;
      return;
    }
  }
  
  private ax P()
  {
    cn.o("Instantiating mediation adapter: " + this.fd);
    try
    {
      ax localax = this.dZ.g(this.fd);
      return localax;
    }
    catch (RemoteException localRemoteException)
    {
      cn.a("Could not instantiate mediation adapter: " + this.fd, localRemoteException);
    }
    return null;
  }
  
  private void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    for (;;)
    {
      if (this.fi != -2) {
        return;
      }
      b(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }
  
  private void a(ar paramar)
  {
    try
    {
      if (this.fg.ex)
      {
        this.fh.a(c.g(this.mContext), this.em, this.ff.eS, paramar);
        return;
      }
      this.fh.a(c.g(this.mContext), this.fg, this.em, this.ff.eS, paramar);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not request ad from mediation adapter.", localRemoteException);
      d(5);
    }
  }
  
  private void b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = paramLong2 - (l1 - paramLong1);
    long l3 = paramLong4 - (l1 - paramLong3);
    if ((l2 <= 0L) || (l3 <= 0L))
    {
      cn.o("Timed out waiting for adapter.");
      this.fi = 3;
      return;
    }
    try
    {
      this.eJ.wait(Math.min(l2, l3));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      this.fi = -1;
    }
  }
  
  public at b(long paramLong1, long paramLong2)
  {
    synchronized (this.eJ)
    {
      long l = SystemClock.elapsedRealtime();
      final ar localar = new ar();
      cm.hO.post(new Runnable()
      {
        public void run()
        {
          synchronized (as.a(as.this))
          {
            if (as.b(as.this) != -2) {
              return;
            }
            as.a(as.this, as.c(as.this));
            if (as.d(as.this) == null)
            {
              as.this.d(4);
              return;
            }
          }
          localar.a(as.this);
          as.a(as.this, localar);
        }
      });
      a(l, this.fe, paramLong1, paramLong2);
      at localat = new at(this.ff, this.fh, this.fd, localar, this.fi);
      return localat;
    }
  }
  
  public void cancel()
  {
    synchronized (this.eJ)
    {
      try
      {
        if (this.fh != null) {
          this.fh.destroy();
        }
        this.fi = -1;
        this.eJ.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          cn.b("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public void d(int paramInt)
  {
    synchronized (this.eJ)
    {
      this.fi = paramInt;
      this.eJ.notify();
      return;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.as
 * JD-Core Version:    0.7.0.1
 */