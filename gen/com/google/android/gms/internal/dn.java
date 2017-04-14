package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.e.a;

public final class dn
  extends e<dk>
{
  private static final dn ll = new dn();
  
  private dn()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View d(Context paramContext, int paramInt1, int paramInt2)
    throws e.a
  {
    return ll.e(paramContext, paramInt1, paramInt2);
  }
  
  private View e(Context paramContext, int paramInt1, int paramInt2)
    throws e.a
  {
    try
    {
      b localb = c.g(paramContext);
      View localView = (View)c.b(((dk)t(paramContext)).a(localb, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
      throw new e.a("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
    }
  }
  
  public dk y(IBinder paramIBinder)
  {
    return dk.a.x(paramIBinder);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dn
 * JD-Core Version:    0.7.0.1
 */