package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer
{
  public static void initialize(Context paramContext)
    throws GooglePlayServicesNotAvailableException
  {
    dm.e(paramContext);
    c localc = q.u(paramContext);
    try
    {
      CameraUpdateFactory.a(localc.cG());
      BitmapDescriptorFactory.a(localc.cH());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapsInitializer
 * JD-Core Version:    0.7.0.1
 */