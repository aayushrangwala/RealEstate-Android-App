package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface by
  extends IInterface
{
  public abstract bw a(bu parambu)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements by
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }
    
    public static by q(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if ((localIInterface != null) && ((localIInterface instanceof by))) {
        return (by)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      bu localbu;
      if (paramParcel1.readInt() != 0)
      {
        localbu = bu.CREATOR.e(paramParcel1);
        bw localbw = a(localbu);
        paramParcel2.writeNoException();
        if (localbw == null) {
          break label105;
        }
        paramParcel2.writeInt(1);
        localbw.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localbu = null;
        break;
        label105:
        paramParcel2.writeInt(0);
      }
    }
    
    private static class a
      implements by
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      public bw a(bu parambu)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (parambu != null)
            {
              localParcel1.writeInt(1);
              parambu.writeToParcel(localParcel1, 0);
              this.dG.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                bw localbw2 = bw.CREATOR.f(localParcel2);
                localbw1 = localbw2;
                return localbw1;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            bw localbw1 = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.by
 * JD-Core Version:    0.7.0.1
 */