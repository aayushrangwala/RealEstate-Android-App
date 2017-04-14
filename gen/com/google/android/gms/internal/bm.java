package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.e.a;

public final class bm
  extends e<bo>
{
  private static final bm gl = new bm();
  
  private bm()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public static bn a(Activity paramActivity)
  {
    try
    {
      if (b(paramActivity))
      {
        cn.m("Using AdOverlay from the client jar.");
        return new bf(paramActivity);
      }
      bn localbn = gl.c(paramActivity);
      return localbn;
    }
    catch (a locala)
    {
      cn.q(locala.getMessage());
    }
    return null;
  }
  
  private static boolean b(Activity paramActivity)
    throws bm.a
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
      throw new a("Ad overlay requires the useClientJar flag in intent extras.");
    }
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }
  
  private bn c(Activity paramActivity)
  {
    try
    {
      b localb = c.g(paramActivity);
      bn localbn = bn.a.m(((bo)t(paramActivity)).a(localb));
      return localbn;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not create remote AdOverlay.", localRemoteException);
      return null;
    }
    catch (e.a locala)
    {
      cn.b("Could not create remote AdOverlay.", locala);
    }
    return null;
  }
  
  protected bo l(IBinder paramIBinder)
  {
    return bo.a.n(paramIBinder);
  }
  
  private static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bm
 * JD-Core Version:    0.7.0.1
 */