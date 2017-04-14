package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.b.a;

public abstract interface ax
  extends IInterface
{
  public abstract void a(b paramb, v paramv, String paramString, ay paramay)
    throws RemoteException;
  
  public abstract void a(b paramb, x paramx, v paramv, String paramString, ay paramay)
    throws RemoteException;
  
  public abstract void destroy()
    throws RemoteException;
  
  public abstract b getView()
    throws RemoteException;
  
  public abstract void showInterstitial()
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements ax
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }
    
    public static ax j(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if ((localIInterface != null) && ((localIInterface instanceof ax))) {
        return (ax)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        b localb3 = b.a.z(paramParcel1.readStrongBinder());
        x localx;
        if (paramParcel1.readInt() != 0)
        {
          localx = x.CREATOR.b(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label158;
          }
        }
        for (v localv2 = v.CREATOR.a(paramParcel1);; localv2 = null)
        {
          a(localb3, localx, localv2, paramParcel1.readString(), ay.a.k(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localx = null;
          break;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        b localb2 = getView();
        paramParcel2.writeNoException();
        IBinder localIBinder = null;
        if (localb2 != null) {
          localIBinder = localb2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        b localb1 = b.a.z(paramParcel1.readStrongBinder());
        int i = paramParcel1.readInt();
        v localv1 = null;
        if (i != 0) {
          localv1 = v.CREATOR.a(paramParcel1);
        }
        a(localb1, localv1, paramParcel1.readString(), ay.a.k(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4: 
        label158:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        showInterstitial();
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      destroy();
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class a
      implements ax
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      /* Error */
      public void a(b paramb, v paramv, String paramString, ay paramay)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +97 -> 115
        //   21: aload_1
        //   22: invokeinterface 37 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload_2
        //   37: ifnull +84 -> 121
        //   40: aload 5
        //   42: iconst_1
        //   43: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   46: aload_2
        //   47: aload 5
        //   49: iconst_0
        //   50: invokevirtual 50	com/google/android/gms/internal/v:writeToParcel	(Landroid/os/Parcel;I)V
        //   53: aload 5
        //   55: aload_3
        //   56: invokevirtual 53	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   59: aconst_null
        //   60: astore 9
        //   62: aload 4
        //   64: ifnull +12 -> 76
        //   67: aload 4
        //   69: invokeinterface 56 1 0
        //   74: astore 9
        //   76: aload 5
        //   78: aload 9
        //   80: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   83: aload_0
        //   84: getfield 15	com/google/android/gms/internal/ax$a$a:dG	Landroid/os/IBinder;
        //   87: iconst_3
        //   88: aload 5
        //   90: aload 6
        //   92: iconst_0
        //   93: invokeinterface 62 5 0
        //   98: pop
        //   99: aload 6
        //   101: invokevirtual 65	android/os/Parcel:readException	()V
        //   104: aload 6
        //   106: invokevirtual 68	android/os/Parcel:recycle	()V
        //   109: aload 5
        //   111: invokevirtual 68	android/os/Parcel:recycle	()V
        //   114: return
        //   115: aconst_null
        //   116: astore 8
        //   118: goto -89 -> 29
        //   121: aload 5
        //   123: iconst_0
        //   124: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   127: goto -74 -> 53
        //   130: astore 7
        //   132: aload 6
        //   134: invokevirtual 68	android/os/Parcel:recycle	()V
        //   137: aload 5
        //   139: invokevirtual 68	android/os/Parcel:recycle	()V
        //   142: aload 7
        //   144: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	145	0	this	a
        //   0	145	1	paramb	b
        //   0	145	2	paramv	v
        //   0	145	3	paramString	String
        //   0	145	4	paramay	ay
        //   3	135	5	localParcel1	Parcel
        //   8	125	6	localParcel2	Parcel
        //   130	13	7	localObject	Object
        //   27	90	8	localIBinder1	IBinder
        //   60	19	9	localIBinder2	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	130	finally
        //   21	29	130	finally
        //   29	36	130	finally
        //   40	53	130	finally
        //   53	59	130	finally
        //   67	76	130	finally
        //   76	104	130	finally
        //   121	127	130	finally
      }
      
      public void a(b paramb, x paramx, v paramv, String paramString, ay paramay)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        label163:
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            IBinder localIBinder1;
            if (paramb != null)
            {
              localIBinder1 = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder1);
              if (paramx != null)
              {
                localParcel1.writeInt(1);
                paramx.writeToParcel(localParcel1, 0);
                if (paramv == null) {
                  break label163;
                }
                localParcel1.writeInt(1);
                paramv.writeToParcel(localParcel1, 0);
                localParcel1.writeString(paramString);
                IBinder localIBinder2 = null;
                if (paramay != null) {
                  localIBinder2 = paramay.asBinder();
                }
                localParcel1.writeStrongBinder(localIBinder2);
                this.dG.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localIBinder1 = null;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            localParcel1.writeInt(0);
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
      
      public void destroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.dG.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public b getView()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.dG.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          b localb = b.a.z(localParcel2.readStrongBinder());
          return localb;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void showInterstitial()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.dG.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ax
 * JD-Core Version:    0.7.0.1
 */