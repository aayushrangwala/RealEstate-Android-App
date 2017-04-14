package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public abstract interface gi
  extends IInterface
{
  public abstract void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements gi
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }
    
    public static gi at(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof gi))) {
        return (gi)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        int k = paramParcel1.readInt();
        MaskedWallet localMaskedWallet;
        if (paramParcel1.readInt() != 0)
        {
          localMaskedWallet = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label138;
          }
        }
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
        {
          a(k, localMaskedWallet, localBundle3);
          paramParcel2.writeNoException();
          return true;
          localMaskedWallet = null;
          break;
        }
      case 2: 
        label138:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        int j = paramParcel1.readInt();
        FullWallet localFullWallet;
        if (paramParcel1.readInt() != 0)
        {
          localFullWallet = (FullWallet)FullWallet.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label220;
          }
        }
        label220:
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
        {
          a(j, localFullWallet, localBundle2);
          paramParcel2.writeNoException();
          return true;
          localFullWallet = null;
          break;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      int i = paramParcel1.readInt();
      boolean bool;
      if (paramParcel1.readInt() != 0)
      {
        bool = true;
        if (paramParcel1.readInt() == 0) {
          break label291;
        }
      }
      label291:
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        a(i, bool, localBundle1);
        paramParcel2.writeNoException();
        return true;
        bool = false;
        break;
      }
    }
    
    private static class a
      implements gi
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      public void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            localParcel1.writeInt(paramInt);
            if (paramFullWallet != null)
            {
              localParcel1.writeInt(1);
              paramFullWallet.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.dG.transact(2, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            localParcel1.writeInt(paramInt);
            if (paramMaskedWallet != null)
            {
              localParcel1.writeInt(1);
              paramMaskedWallet.writeToParcel(localParcel1, 0);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.dG.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 4
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 5
        //   22: iload_1
        //   23: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   26: iload_2
        //   27: ifeq +59 -> 86
        //   30: aload 5
        //   32: iload 4
        //   34: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   37: aload_3
        //   38: ifnull +54 -> 92
        //   41: aload 5
        //   43: iconst_1
        //   44: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   47: aload_3
        //   48: aload 5
        //   50: iconst_0
        //   51: invokevirtual 44	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   54: aload_0
        //   55: getfield 15	com/google/android/gms/internal/gi$a$a:dG	Landroid/os/IBinder;
        //   58: iconst_3
        //   59: aload 5
        //   61: aload 6
        //   63: iconst_0
        //   64: invokeinterface 50 5 0
        //   69: pop
        //   70: aload 6
        //   72: invokevirtual 53	android/os/Parcel:readException	()V
        //   75: aload 6
        //   77: invokevirtual 56	android/os/Parcel:recycle	()V
        //   80: aload 5
        //   82: invokevirtual 56	android/os/Parcel:recycle	()V
        //   85: return
        //   86: iconst_0
        //   87: istore 4
        //   89: goto -59 -> 30
        //   92: aload 5
        //   94: iconst_0
        //   95: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   98: goto -44 -> 54
        //   101: astore 7
        //   103: aload 6
        //   105: invokevirtual 56	android/os/Parcel:recycle	()V
        //   108: aload 5
        //   110: invokevirtual 56	android/os/Parcel:recycle	()V
        //   113: aload 7
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	paramInt	int
        //   0	116	2	paramBoolean	boolean
        //   0	116	3	paramBundle	Bundle
        //   1	87	4	i	int
        //   6	103	5	localParcel1	Parcel
        //   11	93	6	localParcel2	Parcel
        //   101	13	7	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   13	26	101	finally
        //   30	37	101	finally
        //   41	54	101	finally
        //   54	75	101	finally
        //   92	98	101	finally
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gi
 * JD-Core Version:    0.7.0.1
 */