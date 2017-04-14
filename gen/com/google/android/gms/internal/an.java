package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

public final class an
{
  private final aw dZ;
  private final bu eI;
  private final Object eJ = new Object();
  private final ap eK;
  private boolean eL = false;
  private as eM;
  private final Context mContext;
  
  public an(Context paramContext, bu parambu, aw paramaw, ap paramap)
  {
    this.mContext = paramContext;
    this.eI = parambu;
    this.dZ = paramaw;
    this.eK = paramap;
  }
  
  public at a(long paramLong1, long paramLong2)
  {
    cn.m("Starting mediation.");
    Iterator localIterator1 = this.eK.eU.iterator();
    while (localIterator1.hasNext())
    {
      ao localao = (ao)localIterator1.next();
      cn.o("Trying mediation network: " + localao.eP);
      Iterator localIterator2 = localao.eQ.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        final at localat2;
        synchronized (this.eJ)
        {
          if (this.eL)
          {
            at localat1 = new at(-1);
            return localat1;
          }
          this.eM = new as(this.mContext, str, this.dZ, this.eK, localao, this.eI.gB, this.eI.ed);
          localat2 = this.eM.b(paramLong1, paramLong2);
          if (localat2.fl == 0)
          {
            cn.m("Adapter succeeded.");
            return localat2;
          }
        }
        if (localat2.fn != null) {
          cm.hO.post(new Runnable()
          {
            public void run()
            {
              try
              {
                localat2.fn.destroy();
                return;
              }
              catch (RemoteException localRemoteException)
              {
                cn.b("Could not destroy mediation adapter.", localRemoteException);
              }
            }
          });
        }
      }
    }
    return new at(1);
  }
  
  public void cancel()
  {
    synchronized (this.eJ)
    {
      this.eL = true;
      if (this.eM != null) {
        this.eM.cancel();
      }
      return;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.an
 * JD-Core Version:    0.7.0.1
 */