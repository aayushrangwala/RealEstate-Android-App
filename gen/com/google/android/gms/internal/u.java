package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.e.a;

public final class u
  extends e<ad>
{
  private static final u er = new u();
  
  private u()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public static ac a(Context paramContext, x paramx, String paramString, av paramav)
  {
    Object localObject;
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) == 0)
    {
      localObject = er.b(paramContext, paramx, paramString, paramav);
      if (localObject != null) {}
    }
    else
    {
      cn.m("Using AdManager from the client jar.");
      localObject = new r(paramContext, paramx, paramString, paramav, new co(4030500, 4030500, true));
    }
    return localObject;
  }
  
  private ac b(Context paramContext, x paramx, String paramString, av paramav)
  {
    try
    {
      b localb = c.g(paramContext);
      ac localac = ac.a.f(((ad)t(paramContext)).a(localb, paramx, paramString, paramav, 4030500));
      return localac;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not create remote AdManager.", localRemoteException);
      return null;
    }
    catch (e.a locala)
    {
      cn.b("Could not create remote AdManager.", locala);
    }
    return null;
  }
  
  protected ad c(IBinder paramIBinder)
  {
    return ad.a.g(paramIBinder);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u
 * JD-Core Version:    0.7.0.1
 */