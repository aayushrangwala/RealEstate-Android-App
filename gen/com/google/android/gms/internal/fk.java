package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import java.util.List;

public abstract interface fk
  extends IInterface
{
  public abstract void a(ec paramec)
    throws RemoteException;
  
  public abstract void a(fh paramfh)
    throws RemoteException;
  
  public abstract void a(fh paramfh, int paramInt1, int paramInt2, int paramInt3, String paramString)
    throws RemoteException;
  
  public abstract void a(fh paramfh, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
    throws RemoteException;
  
  public abstract void a(fh paramfh, Uri paramUri, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(fh paramfh, String paramString)
    throws RemoteException;
  
  public abstract void a(fh paramfh, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(fh paramfh, List<String> paramList)
    throws RemoteException;
  
  public abstract void b(fh paramfh)
    throws RemoteException;
  
  public abstract void b(fh paramfh, String paramString)
    throws RemoteException;
  
  public abstract void c(fh paramfh, String paramString)
    throws RemoteException;
  
  public abstract String cW()
    throws RemoteException;
  
  public abstract boolean cX()
    throws RemoteException;
  
  public abstract String cY()
    throws RemoteException;
  
  public abstract void clearDefaultAccount()
    throws RemoteException;
  
  public abstract void d(fh paramfh, String paramString)
    throws RemoteException;
  
  public abstract String getAccountName()
    throws RemoteException;
  
  public abstract void removeMoment(String paramString)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements fk
  {
    public static fk aq(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
      if ((localIInterface != null) && ((localIInterface instanceof fk))) {
        return (fk)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        a(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        a(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        b(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        if (paramParcel1.readInt() != 0) {}
        for (ec localec = ec.CREATOR.s(paramParcel1);; localec = null)
        {
          a(localec);
          paramParcel2.writeNoException();
          return true;
        }
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        String str4 = getAccountName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str4);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        clearDefaultAccount();
        paramParcel2.writeNoException();
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        a(fh.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        fh localfh2 = fh.a.an(paramParcel1.readStrongBinder());
        Uri localUri2;
        if (paramParcel1.readInt() != 0)
        {
          localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label449;
          }
        }
        for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle = null)
        {
          a(localfh2, localUri2, localBundle);
          paramParcel2.writeNoException();
          return true;
          localUri2 = null;
          break;
        }
      case 14: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        fh localfh1 = fh.a.an(paramParcel1.readStrongBinder());
        int j = paramParcel1.readInt();
        String str3 = paramParcel1.readString();
        int k = paramParcel1.readInt();
        Uri localUri1 = null;
        if (k != 0) {
          localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        }
        a(localfh1, j, str3, localUri1, paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        a(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 17: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        removeMoment(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        c(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 19: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        b(fh.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 34: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        a(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        return true;
      case 40: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        d(fh.a.an(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 41: 
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        String str2 = cW();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 42: 
        label449:
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        boolean bool = cX();
        paramParcel2.writeNoException();
        if (bool) {}
        for (int i = 1;; i = 0)
        {
          paramParcel2.writeInt(i);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      String str1 = cY();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    }
    
    private static class a
      implements fk
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      /* Error */
      public void a(ec paramec)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +41 -> 56
        //   18: aload_2
        //   19: iconst_1
        //   20: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   23: aload_1
        //   24: aload_2
        //   25: iconst_0
        //   26: invokevirtual 41	com/google/android/gms/internal/ec:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload_0
        //   30: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   33: iconst_4
        //   34: aload_2
        //   35: aload_3
        //   36: iconst_0
        //   37: invokeinterface 47 5 0
        //   42: pop
        //   43: aload_3
        //   44: invokevirtual 50	android/os/Parcel:readException	()V
        //   47: aload_3
        //   48: invokevirtual 53	android/os/Parcel:recycle	()V
        //   51: aload_2
        //   52: invokevirtual 53	android/os/Parcel:recycle	()V
        //   55: return
        //   56: aload_2
        //   57: iconst_0
        //   58: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   61: goto -32 -> 29
        //   64: astore 4
        //   66: aload_3
        //   67: invokevirtual 53	android/os/Parcel:recycle	()V
        //   70: aload_2
        //   71: invokevirtual 53	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	77	0	this	a
        //   0	77	1	paramec	ec
        //   3	68	2	localParcel1	Parcel
        //   7	60	3	localParcel2	Parcel
        //   64	11	4	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	29	64	finally
        //   29	47	64	finally
        //   56	61	64	finally
      }
      
      /* Error */
      public void a(fh paramfh)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +45 -> 60
        //   18: aload_1
        //   19: invokeinterface 60 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   36: bipush 8
        //   38: aload_2
        //   39: aload_3
        //   40: iconst_0
        //   41: invokeinterface 47 5 0
        //   46: pop
        //   47: aload_3
        //   48: invokevirtual 50	android/os/Parcel:readException	()V
        //   51: aload_3
        //   52: invokevirtual 53	android/os/Parcel:recycle	()V
        //   55: aload_2
        //   56: invokevirtual 53	android/os/Parcel:recycle	()V
        //   59: return
        //   60: aconst_null
        //   61: astore 5
        //   63: goto -37 -> 26
        //   66: astore 4
        //   68: aload_3
        //   69: invokevirtual 53	android/os/Parcel:recycle	()V
        //   72: aload_2
        //   73: invokevirtual 53	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	79	0	this	a
        //   0	79	1	paramfh	fh
        //   3	70	2	localParcel1	Parcel
        //   7	62	3	localParcel2	Parcel
        //   66	11	4	localObject	Object
        //   24	38	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	66	finally
        //   18	26	66	finally
        //   26	51	66	finally
      }
      
      /* Error */
      public void a(fh paramfh, int paramInt1, int paramInt2, int paramInt3, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 6
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 7
        //   10: aload 6
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +77 -> 95
        //   21: aload_1
        //   22: invokeinterface 60 1 0
        //   27: astore 9
        //   29: aload 6
        //   31: aload 9
        //   33: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 6
        //   38: iload_2
        //   39: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   42: aload 6
        //   44: iload_3
        //   45: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   48: aload 6
        //   50: iload 4
        //   52: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   55: aload 6
        //   57: aload 5
        //   59: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   62: aload_0
        //   63: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   66: bipush 16
        //   68: aload 6
        //   70: aload 7
        //   72: iconst_0
        //   73: invokeinterface 47 5 0
        //   78: pop
        //   79: aload 7
        //   81: invokevirtual 50	android/os/Parcel:readException	()V
        //   84: aload 7
        //   86: invokevirtual 53	android/os/Parcel:recycle	()V
        //   89: aload 6
        //   91: invokevirtual 53	android/os/Parcel:recycle	()V
        //   94: return
        //   95: aconst_null
        //   96: astore 9
        //   98: goto -69 -> 29
        //   101: astore 8
        //   103: aload 7
        //   105: invokevirtual 53	android/os/Parcel:recycle	()V
        //   108: aload 6
        //   110: invokevirtual 53	android/os/Parcel:recycle	()V
        //   113: aload 8
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	paramfh	fh
        //   0	116	2	paramInt1	int
        //   0	116	3	paramInt2	int
        //   0	116	4	paramInt3	int
        //   0	116	5	paramString	String
        //   3	106	6	localParcel1	Parcel
        //   8	96	7	localParcel2	Parcel
        //   101	13	8	localObject	Object
        //   27	70	9	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	101	finally
        //   21	29	101	finally
        //   29	84	101	finally
      }
      
      /* Error */
      public void a(fh paramfh, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 7
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 8
        //   10: aload 7
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +96 -> 114
        //   21: aload_1
        //   22: invokeinterface 60 1 0
        //   27: astore 10
        //   29: aload 7
        //   31: aload 10
        //   33: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 7
        //   38: iload_2
        //   39: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   42: aload 7
        //   44: aload_3
        //   45: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload 4
        //   50: ifnull +70 -> 120
        //   53: aload 7
        //   55: iconst_1
        //   56: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   59: aload 4
        //   61: aload 7
        //   63: iconst_0
        //   64: invokevirtual 71	android/net/Uri:writeToParcel	(Landroid/os/Parcel;I)V
        //   67: aload 7
        //   69: aload 5
        //   71: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   74: aload 7
        //   76: aload 6
        //   78: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   81: aload_0
        //   82: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   85: bipush 14
        //   87: aload 7
        //   89: aload 8
        //   91: iconst_0
        //   92: invokeinterface 47 5 0
        //   97: pop
        //   98: aload 8
        //   100: invokevirtual 50	android/os/Parcel:readException	()V
        //   103: aload 8
        //   105: invokevirtual 53	android/os/Parcel:recycle	()V
        //   108: aload 7
        //   110: invokevirtual 53	android/os/Parcel:recycle	()V
        //   113: return
        //   114: aconst_null
        //   115: astore 10
        //   117: goto -88 -> 29
        //   120: aload 7
        //   122: iconst_0
        //   123: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   126: goto -59 -> 67
        //   129: astore 9
        //   131: aload 8
        //   133: invokevirtual 53	android/os/Parcel:recycle	()V
        //   136: aload 7
        //   138: invokevirtual 53	android/os/Parcel:recycle	()V
        //   141: aload 9
        //   143: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	144	0	this	a
        //   0	144	1	paramfh	fh
        //   0	144	2	paramInt	int
        //   0	144	3	paramString1	String
        //   0	144	4	paramUri	Uri
        //   0	144	5	paramString2	String
        //   0	144	6	paramString3	String
        //   3	134	7	localParcel1	Parcel
        //   8	124	8	localParcel2	Parcel
        //   129	13	9	localObject	Object
        //   27	89	10	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	129	finally
        //   21	29	129	finally
        //   29	48	129	finally
        //   53	67	129	finally
        //   67	103	129	finally
        //   120	126	129	finally
      }
      
      public void a(fh paramfh, Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        label133:
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            IBinder localIBinder;
            if (paramfh != null)
            {
              localIBinder = paramfh.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              if (paramUri != null)
              {
                localParcel1.writeInt(1);
                paramUri.writeToParcel(localParcel1, 0);
                if (paramBundle == null) {
                  break label133;
                }
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.dG.transact(9, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localIBinder = null;
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
      
      /* Error */
      public void a(fh paramfh, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 60 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   42: iconst_1
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 47 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 50	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 53	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 53	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore 6
        //   71: goto -44 -> 27
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 53	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 53	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramfh	fh
        //   0	88	2	paramString	String
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        //   25	45	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	74	finally
        //   19	27	74	finally
        //   27	58	74	finally
      }
      
      /* Error */
      public void a(fh paramfh, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +62 -> 80
        //   21: aload_1
        //   22: invokeinterface 60 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 4
        //   44: aload_3
        //   45: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   52: iconst_2
        //   53: aload 4
        //   55: aload 5
        //   57: iconst_0
        //   58: invokeinterface 47 5 0
        //   63: pop
        //   64: aload 5
        //   66: invokevirtual 50	android/os/Parcel:readException	()V
        //   69: aload 5
        //   71: invokevirtual 53	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: invokevirtual 53	android/os/Parcel:recycle	()V
        //   79: return
        //   80: aconst_null
        //   81: astore 7
        //   83: goto -54 -> 29
        //   86: astore 6
        //   88: aload 5
        //   90: invokevirtual 53	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 53	android/os/Parcel:recycle	()V
        //   98: aload 6
        //   100: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	101	0	this	a
        //   0	101	1	paramfh	fh
        //   0	101	2	paramString1	String
        //   0	101	3	paramString2	String
        //   3	91	4	localParcel1	Parcel
        //   8	81	5	localParcel2	Parcel
        //   86	13	6	localObject	Object
        //   27	55	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	86	finally
        //   21	29	86	finally
        //   29	69	86	finally
      }
      
      /* Error */
      public void a(fh paramfh, List<String> paramList)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +53 -> 69
        //   19: aload_1
        //   20: invokeinterface 60 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 82	android/os/Parcel:writeStringList	(Ljava/util/List;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   42: bipush 34
        //   44: aload_3
        //   45: aload 4
        //   47: iconst_0
        //   48: invokeinterface 47 5 0
        //   53: pop
        //   54: aload 4
        //   56: invokevirtual 50	android/os/Parcel:readException	()V
        //   59: aload 4
        //   61: invokevirtual 53	android/os/Parcel:recycle	()V
        //   64: aload_3
        //   65: invokevirtual 53	android/os/Parcel:recycle	()V
        //   68: return
        //   69: aconst_null
        //   70: astore 6
        //   72: goto -45 -> 27
        //   75: astore 5
        //   77: aload 4
        //   79: invokevirtual 53	android/os/Parcel:recycle	()V
        //   82: aload_3
        //   83: invokevirtual 53	android/os/Parcel:recycle	()V
        //   86: aload 5
        //   88: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	89	0	this	a
        //   0	89	1	paramfh	fh
        //   0	89	2	paramList	List<String>
        //   3	80	3	localParcel1	Parcel
        //   7	71	4	localParcel2	Parcel
        //   75	12	5	localObject	Object
        //   25	46	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	75	finally
        //   19	27	75	finally
        //   27	59	75	finally
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
      
      /* Error */
      public void b(fh paramfh)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +45 -> 60
        //   18: aload_1
        //   19: invokeinterface 60 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   36: bipush 19
        //   38: aload_2
        //   39: aload_3
        //   40: iconst_0
        //   41: invokeinterface 47 5 0
        //   46: pop
        //   47: aload_3
        //   48: invokevirtual 50	android/os/Parcel:readException	()V
        //   51: aload_3
        //   52: invokevirtual 53	android/os/Parcel:recycle	()V
        //   55: aload_2
        //   56: invokevirtual 53	android/os/Parcel:recycle	()V
        //   59: return
        //   60: aconst_null
        //   61: astore 5
        //   63: goto -37 -> 26
        //   66: astore 4
        //   68: aload_3
        //   69: invokevirtual 53	android/os/Parcel:recycle	()V
        //   72: aload_2
        //   73: invokevirtual 53	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	79	0	this	a
        //   0	79	1	paramfh	fh
        //   3	70	2	localParcel1	Parcel
        //   7	62	3	localParcel2	Parcel
        //   66	11	4	localObject	Object
        //   24	38	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	66	finally
        //   18	26	66	finally
        //   26	51	66	finally
      }
      
      /* Error */
      public void b(fh paramfh, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 60 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   42: iconst_3
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 47 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 50	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 53	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 53	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore 6
        //   71: goto -44 -> 27
        //   74: astore 5
        //   76: aload 4
        //   78: invokevirtual 53	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 53	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	88	0	this	a
        //   0	88	1	paramfh	fh
        //   0	88	2	paramString	String
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        //   74	12	5	localObject	Object
        //   25	45	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	74	finally
        //   19	27	74	finally
        //   27	58	74	finally
      }
      
      /* Error */
      public void c(fh paramfh, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +53 -> 69
        //   19: aload_1
        //   20: invokeinterface 60 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   42: bipush 18
        //   44: aload_3
        //   45: aload 4
        //   47: iconst_0
        //   48: invokeinterface 47 5 0
        //   53: pop
        //   54: aload 4
        //   56: invokevirtual 50	android/os/Parcel:readException	()V
        //   59: aload 4
        //   61: invokevirtual 53	android/os/Parcel:recycle	()V
        //   64: aload_3
        //   65: invokevirtual 53	android/os/Parcel:recycle	()V
        //   68: return
        //   69: aconst_null
        //   70: astore 6
        //   72: goto -45 -> 27
        //   75: astore 5
        //   77: aload 4
        //   79: invokevirtual 53	android/os/Parcel:recycle	()V
        //   82: aload_3
        //   83: invokevirtual 53	android/os/Parcel:recycle	()V
        //   86: aload 5
        //   88: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	89	0	this	a
        //   0	89	1	paramfh	fh
        //   0	89	2	paramString	String
        //   3	80	3	localParcel1	Parcel
        //   7	71	4	localParcel2	Parcel
        //   75	12	5	localObject	Object
        //   25	46	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	75	finally
        //   19	27	75	finally
        //   27	59	75	finally
      }
      
      public String cW()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          this.dG.transact(41, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean cX()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          this.dG.transact(42, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          boolean bool = false;
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public String cY()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          this.dG.transact(43, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void clearDefaultAccount()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          this.dG.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void d(fh paramfh, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +53 -> 69
        //   19: aload_1
        //   20: invokeinterface 60 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 67	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/fk$a$a:dG	Landroid/os/IBinder;
        //   42: bipush 40
        //   44: aload_3
        //   45: aload 4
        //   47: iconst_0
        //   48: invokeinterface 47 5 0
        //   53: pop
        //   54: aload 4
        //   56: invokevirtual 50	android/os/Parcel:readException	()V
        //   59: aload 4
        //   61: invokevirtual 53	android/os/Parcel:recycle	()V
        //   64: aload_3
        //   65: invokevirtual 53	android/os/Parcel:recycle	()V
        //   68: return
        //   69: aconst_null
        //   70: astore 6
        //   72: goto -45 -> 27
        //   75: astore 5
        //   77: aload 4
        //   79: invokevirtual 53	android/os/Parcel:recycle	()V
        //   82: aload_3
        //   83: invokevirtual 53	android/os/Parcel:recycle	()V
        //   86: aload 5
        //   88: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	89	0	this	a
        //   0	89	1	paramfh	fh
        //   0	89	2	paramString	String
        //   3	80	3	localParcel1	Parcel
        //   7	71	4	localParcel2	Parcel
        //   75	12	5	localObject	Object
        //   25	46	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	75	finally
        //   19	27	75	finally
        //   27	59	75	finally
      }
      
      public String getAccountName()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          this.dG.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void removeMoment(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
          localParcel1.writeString(paramString);
          this.dG.transact(17, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.fk
 * JD-Core Version:    0.7.0.1
 */