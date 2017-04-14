package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.plus.PlusOneDummyView;

public final class fm
{
  private static Context pW;
  private static fi rx;
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    if (paramString == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        return new PlusOneDummyView(paramContext, paramInt1);
      }
    }
    View localView = (View)c.b(x(paramContext).a(c.g(paramContext), paramInt1, paramInt2, paramString, paramInt3));
    return localView;
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        return new PlusOneDummyView(paramContext, paramInt1);
      }
    }
    View localView = (View)c.b(x(paramContext).a(c.g(paramContext), paramInt1, paramInt2, paramString1, paramString2));
    return localView;
  }
  
  private static fi x(Context paramContext)
    throws fm.a
  {
    dm.e(paramContext);
    ClassLoader localClassLoader;
    if (rx == null)
    {
      if (pW == null)
      {
        pW = GooglePlayServicesUtil.getRemoteContext(paramContext);
        if (pW == null) {
          throw new a("Could not get remote context.");
        }
      }
      localClassLoader = pW.getClassLoader();
    }
    try
    {
      rx = fi.a.ao((IBinder)localClassLoader.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
      return rx;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new a("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a("Could not access creator.");
    }
  }
  
  public static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fm
 * JD-Core Version:    0.7.0.1
 */