package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.e;

public abstract interface fh
  extends IInterface
{
  public abstract void W(String paramString)
    throws RemoteException;
  
  public abstract void X(String paramString)
    throws RemoteException;
  
  public abstract void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException;
  
  public abstract void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
    throws RemoteException;
  
  public abstract void a(int paramInt, Bundle paramBundle, ec paramec)
    throws RemoteException;
  
  public abstract void a(d paramd, String paramString)
    throws RemoteException;
  
  public abstract void a(d paramd, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void b(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements fh
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
    }
    
    public static fh an(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof fh))) {
        return (fh)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        int i2 = paramParcel1.readInt();
        Bundle localBundle4;
        if (paramParcel1.readInt() != 0)
        {
          localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label178;
          }
        }
        for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
        {
          a(i2, localBundle4, localBundle5);
          paramParcel2.writeNoException();
          return true;
          localBundle4 = null;
          break;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        int i1 = paramParcel1.readInt();
        Bundle localBundle3;
        if (paramParcel1.readInt() != 0)
        {
          localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label260;
          }
        }
        for (ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; localParcelFileDescriptor = null)
        {
          a(i1, localBundle3, localParcelFileDescriptor);
          paramParcel2.writeNoException();
          return true;
          localBundle3 = null;
          break;
        }
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        W(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        int n = paramParcel1.readInt();
        d locald2 = null;
        if (n != 0) {
          locald2 = d.CREATOR.h(paramParcel1);
        }
        a(locald2, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        int k = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
        {
          int m = paramParcel1.readInt();
          ec localec = null;
          if (m != 0) {
            localec = ec.CREATOR.s(paramParcel1);
          }
          a(k, localBundle2, localec);
          paramParcel2.writeNoException();
          return true;
        }
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        int j = paramParcel1.readInt();
        d locald1 = null;
        if (j != 0) {
          locald1 = d.CREATOR.h(paramParcel1);
        }
        a(locald1, paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 7: 
        label178:
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        label260:
        int i = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
        {
          b(i, localBundle1);
          paramParcel2.writeNoException();
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      X(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class a
      implements fh
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      public void W(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
          localParcel1.writeString(paramString);
          this.dG.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void X(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
          localParcel1.writeString(paramString);
          this.dG.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            localParcel1.writeInt(paramInt);
            if (paramBundle1 != null)
            {
              localParcel1.writeInt(1);
              paramBundle1.writeToParcel(localParcel1, 0);
              if (paramBundle2 != null)
              {
                localParcel1.writeInt(1);
                paramBundle2.writeToParcel(localParcel1, 0);
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
      
      public void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              if (paramParcelFileDescriptor != null)
              {
                localParcel1.writeInt(1);
                paramParcelFileDescriptor.writeToParcel(localParcel1, 0);
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
      
      public void a(int paramInt, Bundle paramBundle, ec paramec)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              if (paramec != null)
              {
                localParcel1.writeInt(1);
                paramec.writeToParcel(localParcel1, 0);
                this.dG.transact(5, localParcel1, localParcel2, 0);
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
      public void a(d paramd, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +49 -> 65
        //   19: aload_3
        //   20: iconst_1
        //   21: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   24: aload_1
        //   25: aload_3
        //   26: iconst_0
        //   27: invokevirtual 70	com/google/android/gms/common/data/d:writeToParcel	(Landroid/os/Parcel;I)V
        //   30: aload_3
        //   31: aload_2
        //   32: invokevirtual 33	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   35: aload_0
        //   36: getfield 15	com/google/android/gms/internal/fh$a$a:dG	Landroid/os/IBinder;
        //   39: iconst_4
        //   40: aload_3
        //   41: aload 4
        //   43: iconst_0
        //   44: invokeinterface 39 5 0
        //   49: pop
        //   50: aload 4
        //   52: invokevirtual 42	android/os/Parcel:readException	()V
        //   55: aload 4
        //   57: invokevirtual 45	android/os/Parcel:recycle	()V
        //   60: aload_3
        //   61: invokevirtual 45	android/os/Parcel:recycle	()V
        //   64: return
        //   65: aload_3
        //   66: iconst_0
        //   67: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   70: goto -40 -> 30
        //   73: astore 5
        //   75: aload 4
        //   77: invokevirtual 45	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: invokevirtual 45	android/os/Parcel:recycle	()V
        //   84: aload 5
        //   86: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	87	0	this	a
        //   0	87	1	paramd	d
        //   0	87	2	paramString	String
        //   3	78	3	localParcel1	Parcel
        //   7	69	4	localParcel2	Parcel
        //   73	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	30	73	finally
        //   30	55	73	finally
        //   65	70	73	finally
      }
      
      /* Error */
      public void a(d paramd, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 27
        //   14: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +61 -> 79
        //   21: aload 4
        //   23: iconst_1
        //   24: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   27: aload_1
        //   28: aload 4
        //   30: iconst_0
        //   31: invokevirtual 70	com/google/android/gms/common/data/d:writeToParcel	(Landroid/os/Parcel;I)V
        //   34: aload 4
        //   36: aload_2
        //   37: invokevirtual 33	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 4
        //   42: aload_3
        //   43: invokevirtual 33	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload_0
        //   47: getfield 15	com/google/android/gms/internal/fh$a$a:dG	Landroid/os/IBinder;
        //   50: bipush 6
        //   52: aload 4
        //   54: aload 5
        //   56: iconst_0
        //   57: invokeinterface 39 5 0
        //   62: pop
        //   63: aload 5
        //   65: invokevirtual 42	android/os/Parcel:readException	()V
        //   68: aload 5
        //   70: invokevirtual 45	android/os/Parcel:recycle	()V
        //   73: aload 4
        //   75: invokevirtual 45	android/os/Parcel:recycle	()V
        //   78: return
        //   79: aload 4
        //   81: iconst_0
        //   82: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   85: goto -51 -> 34
        //   88: astore 6
        //   90: aload 5
        //   92: invokevirtual 45	android/os/Parcel:recycle	()V
        //   95: aload 4
        //   97: invokevirtual 45	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	paramd	d
        //   0	103	2	paramString1	String
        //   0	103	3	paramString2	String
        //   3	93	4	localParcel1	Parcel
        //   8	83	5	localParcel2	Parcel
        //   88	13	6	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   10	17	88	finally
        //   21	34	88	finally
        //   34	68	88	finally
        //   79	85	88	finally
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
      
      /* Error */
      public void b(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 30	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: iload_1
        //   17: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   20: aload_2
        //   21: ifnull +45 -> 66
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 58	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	com/google/android/gms/internal/fh$a$a:dG	Landroid/os/IBinder;
        //   39: bipush 7
        //   41: aload_3
        //   42: aload 4
        //   44: iconst_0
        //   45: invokeinterface 39 5 0
        //   50: pop
        //   51: aload 4
        //   53: invokevirtual 42	android/os/Parcel:readException	()V
        //   56: aload 4
        //   58: invokevirtual 45	android/os/Parcel:recycle	()V
        //   61: aload_3
        //   62: invokevirtual 45	android/os/Parcel:recycle	()V
        //   65: return
        //   66: aload_3
        //   67: iconst_0
        //   68: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   71: goto -36 -> 35
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 45	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 45	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramInt	int
        //   0	88	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	74	finally
        //   24	35	74	finally
        //   35	56	74	finally
        //   66	71	74	finally
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fh
 * JD-Core Version:    0.7.0.1
 */