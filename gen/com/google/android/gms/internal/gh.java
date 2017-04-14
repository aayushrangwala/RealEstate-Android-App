package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public abstract interface gh
  extends IInterface
{
  public abstract void a(Bundle paramBundle, gi paramgi)
    throws RemoteException;
  
  public abstract void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, gi paramgi)
    throws RemoteException;
  
  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, gi paramgi)
    throws RemoteException;
  
  public abstract void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, gi paramgi)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements gh
  {
    public static gh as(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
      if ((localIInterface != null) && ((localIInterface instanceof gh))) {
        return (gh)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        MaskedWalletRequest localMaskedWalletRequest;
        if (paramParcel1.readInt() != 0)
        {
          localMaskedWalletRequest = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label149;
          }
        }
        for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
        {
          a(localMaskedWalletRequest, localBundle5, gi.a.at(paramParcel1.readStrongBinder()));
          return true;
          localMaskedWalletRequest = null;
          break;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        FullWalletRequest localFullWalletRequest;
        if (paramParcel1.readInt() != 0)
        {
          localFullWalletRequest = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label226;
          }
        }
        for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
        {
          a(localFullWalletRequest, localBundle4, gi.a.at(paramParcel1.readStrongBinder()));
          return true;
          localFullWalletRequest = null;
          break;
        }
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        String str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
        {
          a(str1, str2, localBundle3, gi.a.at(paramParcel1.readStrongBinder()));
          return true;
        }
      case 4: 
        label149:
        label226:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        NotifyTransactionStatusRequest localNotifyTransactionStatusRequest;
        if (paramParcel1.readInt() != 0)
        {
          localNotifyTransactionStatusRequest = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label360;
          }
        }
        label360:
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
        {
          a(localNotifyTransactionStatusRequest, localBundle2);
          return true;
          localNotifyTransactionStatusRequest = null;
          break;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        a(localBundle1, gi.a.at(paramParcel1.readStrongBinder()));
        return true;
      }
    }
    
    private static class a
      implements gh
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      /* Error */
      public void a(Bundle paramBundle, gi paramgi)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: aload_3
        //   5: ldc 27
        //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +54 -> 65
        //   14: aload_3
        //   15: iconst_1
        //   16: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_3
        //   21: iconst_0
        //   22: invokevirtual 41	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aconst_null
        //   26: astore 5
        //   28: aload_2
        //   29: ifnull +11 -> 40
        //   32: aload_2
        //   33: invokeinterface 47 1 0
        //   38: astore 5
        //   40: aload_3
        //   41: aload 5
        //   43: invokevirtual 50	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   46: aload_0
        //   47: getfield 15	com/google/android/gms/internal/gh$a$a:dG	Landroid/os/IBinder;
        //   50: iconst_5
        //   51: aload_3
        //   52: aconst_null
        //   53: iconst_1
        //   54: invokeinterface 56 5 0
        //   59: pop
        //   60: aload_3
        //   61: invokevirtual 59	android/os/Parcel:recycle	()V
        //   64: return
        //   65: aload_3
        //   66: iconst_0
        //   67: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   70: goto -45 -> 25
        //   73: astore 4
        //   75: aload_3
        //   76: invokevirtual 59	android/os/Parcel:recycle	()V
        //   79: aload 4
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   0	82	1	paramBundle	Bundle
        //   0	82	2	paramgi	gi
        //   3	73	3	localParcel	Parcel
        //   73	7	4	localObject	Object
        //   26	16	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   4	10	73	finally
        //   14	25	73	finally
        //   32	40	73	finally
        //   40	60	73	finally
        //   65	70	73	finally
      }
      
      public void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, gi paramgi)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramFullWalletRequest != null)
            {
              localParcel.writeInt(1);
              paramFullWalletRequest.writeToParcel(localParcel, 0);
              if (paramBundle != null)
              {
                localParcel.writeInt(1);
                paramBundle.writeToParcel(localParcel, 0);
                IBinder localIBinder = null;
                if (paramgi != null) {
                  localIBinder = paramgi.asBinder();
                }
                localParcel.writeStrongBinder(localIBinder);
                this.dG.transact(2, localParcel, null, 1);
              }
            }
            else
            {
              localParcel.writeInt(0);
              continue;
            }
            localParcel.writeInt(0);
          }
          finally
          {
            localParcel.recycle();
          }
        }
      }
      
      public void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, gi paramgi)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramMaskedWalletRequest != null)
            {
              localParcel.writeInt(1);
              paramMaskedWalletRequest.writeToParcel(localParcel, 0);
              if (paramBundle != null)
              {
                localParcel.writeInt(1);
                paramBundle.writeToParcel(localParcel, 0);
                IBinder localIBinder = null;
                if (paramgi != null) {
                  localIBinder = paramgi.asBinder();
                }
                localParcel.writeStrongBinder(localIBinder);
                this.dG.transact(1, localParcel, null, 1);
              }
            }
            else
            {
              localParcel.writeInt(0);
              continue;
            }
            localParcel.writeInt(0);
          }
          finally
          {
            localParcel.recycle();
          }
        }
      }
      
      public void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramNotifyTransactionStatusRequest != null)
            {
              localParcel.writeInt(1);
              paramNotifyTransactionStatusRequest.writeToParcel(localParcel, 0);
              if (paramBundle != null)
              {
                localParcel.writeInt(1);
                paramBundle.writeToParcel(localParcel, 0);
                this.dG.transact(4, localParcel, null, 1);
              }
            }
            else
            {
              localParcel.writeInt(0);
              continue;
            }
            localParcel.writeInt(0);
          }
          finally
          {
            localParcel.recycle();
          }
        }
      }
      
      /* Error */
      public void a(String paramString1, String paramString2, Bundle paramBundle, gi paramgi)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: aload 5
        //   7: ldc 27
        //   9: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: aload 5
        //   14: aload_1
        //   15: invokevirtual 75	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   18: aload 5
        //   20: aload_2
        //   21: invokevirtual 75	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   24: aload_3
        //   25: ifnull +61 -> 86
        //   28: aload 5
        //   30: iconst_1
        //   31: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   34: aload_3
        //   35: aload 5
        //   37: iconst_0
        //   38: invokevirtual 41	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   41: aconst_null
        //   42: astore 7
        //   44: aload 4
        //   46: ifnull +12 -> 58
        //   49: aload 4
        //   51: invokeinterface 47 1 0
        //   56: astore 7
        //   58: aload 5
        //   60: aload 7
        //   62: invokevirtual 50	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   65: aload_0
        //   66: getfield 15	com/google/android/gms/internal/gh$a$a:dG	Landroid/os/IBinder;
        //   69: iconst_3
        //   70: aload 5
        //   72: aconst_null
        //   73: iconst_1
        //   74: invokeinterface 56 5 0
        //   79: pop
        //   80: aload 5
        //   82: invokevirtual 59	android/os/Parcel:recycle	()V
        //   85: return
        //   86: aload 5
        //   88: iconst_0
        //   89: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   92: goto -51 -> 41
        //   95: astore 6
        //   97: aload 5
        //   99: invokevirtual 59	android/os/Parcel:recycle	()V
        //   102: aload 6
        //   104: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	105	0	this	a
        //   0	105	1	paramString1	String
        //   0	105	2	paramString2	String
        //   0	105	3	paramBundle	Bundle
        //   0	105	4	paramgi	gi
        //   3	95	5	localParcel	Parcel
        //   95	8	6	localObject	Object
        //   42	19	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   5	24	95	finally
        //   28	41	95	finally
        //   49	58	95	finally
        //   58	80	95	finally
        //   86	92	95	finally
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gh
 * JD-Core Version:    0.7.0.1
 */