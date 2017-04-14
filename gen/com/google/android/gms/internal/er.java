package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;

public abstract interface er
  extends IInterface
{
  public abstract String L(String paramString)
    throws RemoteException;
  
  public abstract String M(String paramString)
    throws RemoteException;
  
  public abstract void N(String paramString)
    throws RemoteException;
  
  public abstract int O(String paramString)
    throws RemoteException;
  
  public abstract Uri P(String paramString)
    throws RemoteException;
  
  public abstract int a(eq parameq, byte[] paramArrayOfByte, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq)
    throws RemoteException;
  
  public abstract void a(eq parameq, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, Bundle paramBundle, int paramInt1, int paramInt2)
    throws RemoteException;
  
  public abstract void a(eq parameq, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, long paramLong, String paramString2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, boolean paramBoolean, long[] paramArrayOfLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(String paramString1, String paramString2, int paramInt)
    throws RemoteException;
  
  public abstract int b(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
    throws RemoteException;
  
  public abstract void b(eq parameq)
    throws RemoteException;
  
  public abstract void b(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void bT()
    throws RemoteException;
  
  public abstract d bU()
    throws RemoteException;
  
  public abstract boolean bV()
    throws RemoteException;
  
  public abstract d bW()
    throws RemoteException;
  
  public abstract Bundle ba()
    throws RemoteException;
  
  public abstract void c(eq parameq)
    throws RemoteException;
  
  public abstract void c(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void c(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void clearNotifications(int paramInt)
    throws RemoteException;
  
  public abstract void d(eq parameq)
    throws RemoteException;
  
  public abstract void d(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void d(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void d(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract ParcelFileDescriptor e(Uri paramUri)
    throws RemoteException;
  
  public abstract void e(eq parameq)
    throws RemoteException;
  
  public abstract void e(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void e(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void f(long paramLong)
    throws RemoteException;
  
  public abstract void f(eq parameq)
    throws RemoteException;
  
  public abstract void f(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void f(String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void g(long paramLong)
    throws RemoteException;
  
  public abstract void g(eq parameq)
    throws RemoteException;
  
  public abstract void g(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract String getAppId()
    throws RemoteException;
  
  public abstract String getCurrentAccountName()
    throws RemoteException;
  
  public abstract String getCurrentPlayerId()
    throws RemoteException;
  
  public abstract void h(eq parameq)
    throws RemoteException;
  
  public abstract void h(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void i(eq parameq)
    throws RemoteException;
  
  public abstract void i(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void i(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract int j(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void j(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract void k(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void k(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract void l(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void m(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements er
  {
    public static er C(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
      if ((localIInterface != null) && ((localIInterface instanceof er))) {
        return (er)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.games.internal.IGamesService");
        return true;
      case 5001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5002: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5003: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        String str28 = getAppId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str28);
        return true;
      case 5004: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        Bundle localBundle8 = ba();
        paramParcel2.writeNoException();
        if (localBundle8 != null)
        {
          paramParcel2.writeInt(1);
          localBundle8.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5005: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        IBinder localIBinder7 = paramParcel1.readStrongBinder();
        int i48 = paramParcel1.readInt();
        Bundle localBundle7 = null;
        if (i48 != 0) {
          localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(localIBinder7, localBundle7);
        paramParcel2.writeNoException();
        return true;
      case 5006: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        bT();
        paramParcel2.writeNoException();
        return true;
      case 5007: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        String str27 = getCurrentAccountName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str27);
        return true;
      case 5064: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        String str26 = L(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(str26);
        return true;
      case 5065: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5008: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5009: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5010: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5011: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq30 = eq.a.B(paramParcel1.readStrongBinder());
        String str25 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool38 = true;; bool38 = false)
        {
          a(localeq30, str25, bool38, paramParcel1.createLongArray());
          paramParcel2.writeNoException();
          return true;
        }
      case 5012: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        String str24 = getCurrentPlayerId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str24);
        return true;
      case 5013: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d locald2 = bU();
        paramParcel2.writeNoException();
        if (locald2 != null)
        {
          paramParcel2.writeInt(1);
          locald2.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5014: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5015: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq29 = eq.a.B(paramParcel1.readStrongBinder());
        int i46 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool36 = true;; bool36 = false)
        {
          int i47 = paramParcel1.readInt();
          boolean bool37 = false;
          if (i47 != 0) {
            bool37 = true;
          }
          a(localeq29, i46, bool36, bool37);
          paramParcel2.writeNoException();
          return true;
        }
      case 5016: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5017: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5018: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5019: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq28 = eq.a.B(paramParcel1.readStrongBinder());
        String str23 = paramParcel1.readString();
        int i43 = paramParcel1.readInt();
        int i44 = paramParcel1.readInt();
        int i45 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool35 = true;; bool35 = false)
        {
          a(localeq28, str23, i43, i44, i45, bool35);
          paramParcel2.writeNoException();
          return true;
        }
      case 5020: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq27 = eq.a.B(paramParcel1.readStrongBinder());
        String str22 = paramParcel1.readString();
        int i40 = paramParcel1.readInt();
        int i41 = paramParcel1.readInt();
        int i42 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool34 = true;; bool34 = false)
        {
          b(localeq27, str22, i40, i41, i42, bool34);
          paramParcel2.writeNoException();
          return true;
        }
      case 5021: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq26 = eq.a.B(paramParcel1.readStrongBinder());
        int i39 = paramParcel1.readInt();
        Bundle localBundle6 = null;
        if (i39 != 0) {
          localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(localeq26, localBundle6, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5022: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5023: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq25 = eq.a.B(paramParcel1.readStrongBinder());
        String str21 = paramParcel1.readString();
        IBinder localIBinder6 = paramParcel1.readStrongBinder();
        int i38 = paramParcel1.readInt();
        Bundle localBundle5 = null;
        if (i38 != 0) {
          localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(localeq25, str21, localIBinder6, localBundle5);
        paramParcel2.writeNoException();
        return true;
      case 5024: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq24 = eq.a.B(paramParcel1.readStrongBinder());
        String str20 = paramParcel1.readString();
        IBinder localIBinder5 = paramParcel1.readStrongBinder();
        int i37 = paramParcel1.readInt();
        Bundle localBundle4 = null;
        if (i37 != 0) {
          localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        b(localeq24, str20, localIBinder5, localBundle4);
        paramParcel2.writeNoException();
        return true;
      case 5025: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq23 = eq.a.B(paramParcel1.readStrongBinder());
        String str19 = paramParcel1.readString();
        int i36 = paramParcel1.readInt();
        IBinder localIBinder4 = paramParcel1.readStrongBinder();
        if (paramParcel1.readInt() != 0) {}
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
        {
          a(localeq23, str19, i36, localIBinder4, localBundle3);
          paramParcel2.writeNoException();
          return true;
        }
      case 5026: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5027: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        e(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5028: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        j(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5029: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5058: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5059: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5030: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq22 = eq.a.B(paramParcel1.readStrongBinder());
        IBinder localIBinder3 = paramParcel1.readStrongBinder();
        int i35 = paramParcel1.readInt();
        String[] arrayOfString = paramParcel1.createStringArray();
        Bundle localBundle2;
        if (paramParcel1.readInt() != 0)
        {
          localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label2058;
          }
        }
        for (boolean bool33 = true;; bool33 = false)
        {
          a(localeq22, localIBinder3, i35, arrayOfString, localBundle2, bool33, paramParcel1.readLong());
          paramParcel2.writeNoException();
          return true;
          localBundle2 = null;
          break;
        }
      case 5031: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq21 = eq.a.B(paramParcel1.readStrongBinder());
        IBinder localIBinder2 = paramParcel1.readStrongBinder();
        String str18 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool32 = true;; bool32 = false)
        {
          a(localeq21, localIBinder2, str18, bool32, paramParcel1.readLong());
          paramParcel2.writeNoException();
          return true;
        }
      case 5032: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        e(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5033: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int i34 = a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i34);
        return true;
      case 5034: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int i33 = b(paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i33);
        return true;
      case 5035: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        String str17 = M(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(str17);
        return true;
      case 5036: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        clearNotifications(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5037: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5038: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5039: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq20 = eq.a.B(paramParcel1.readStrongBinder());
        String str15 = paramParcel1.readString();
        String str16 = paramParcel1.readString();
        int i29 = paramParcel1.readInt();
        int i30 = paramParcel1.readInt();
        int i31 = paramParcel1.readInt();
        int i32 = paramParcel1.readInt();
        boolean bool31 = false;
        if (i32 != 0) {
          bool31 = true;
        }
        a(localeq20, str15, str16, i29, i30, i31, bool31);
        paramParcel2.writeNoException();
        return true;
      case 5040: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq19 = eq.a.B(paramParcel1.readStrongBinder());
        String str13 = paramParcel1.readString();
        String str14 = paramParcel1.readString();
        int i25 = paramParcel1.readInt();
        int i26 = paramParcel1.readInt();
        int i27 = paramParcel1.readInt();
        int i28 = paramParcel1.readInt();
        boolean bool30 = false;
        if (i28 != 0) {
          bool30 = true;
        }
        b(localeq19, str13, str14, i25, i26, i27, bool30);
        paramParcel2.writeNoException();
        return true;
      case 5041: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5042: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5043: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        h(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5044: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq18 = eq.a.B(paramParcel1.readStrongBinder());
        int i23 = paramParcel1.readInt();
        int i24 = paramParcel1.readInt();
        boolean bool28;
        if (paramParcel1.readInt() != 0)
        {
          bool28 = true;
          if (paramParcel1.readInt() == 0) {
            break label2671;
          }
        }
        for (boolean bool29 = true;; bool29 = false)
        {
          a(localeq18, i23, i24, bool28, bool29);
          paramParcel2.writeNoException();
          return true;
          bool28 = false;
          break;
        }
      case 5045: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq17 = eq.a.B(paramParcel1.readStrongBinder());
        String str12 = paramParcel1.readString();
        int i22 = paramParcel1.readInt();
        boolean bool26;
        if (paramParcel1.readInt() != 0)
        {
          bool26 = true;
          if (paramParcel1.readInt() == 0) {
            break label2750;
          }
        }
        for (boolean bool27 = true;; bool27 = false)
        {
          a(localeq17, str12, i22, bool26, bool27);
          paramParcel2.writeNoException();
          return true;
          bool26 = false;
          break;
        }
      case 5046: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq16 = eq.a.B(paramParcel1.readStrongBinder());
        int i20 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool24 = true;; bool24 = false)
        {
          int i21 = paramParcel1.readInt();
          boolean bool25 = false;
          if (i21 != 0) {
            bool25 = true;
          }
          b(localeq16, i20, bool24, bool25);
          paramParcel2.writeNoException();
          return true;
        }
      case 5047: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5048: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq15 = eq.a.B(paramParcel1.readStrongBinder());
        int i18 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool22 = true;; bool22 = false)
        {
          int i19 = paramParcel1.readInt();
          boolean bool23 = false;
          if (i19 != 0) {
            bool23 = true;
          }
          c(localeq15, i18, bool22, bool23);
          paramParcel2.writeNoException();
          return true;
        }
      case 5049: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5050: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        N(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5051: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5052: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5053: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int i17 = j(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i17);
        return true;
      case 5060: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int i16 = O(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i16);
        return true;
      case 5054: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq14 = eq.a.B(paramParcel1.readStrongBinder());
        String str11 = paramParcel1.readString();
        int i15 = paramParcel1.readInt();
        boolean bool21 = false;
        if (i15 != 0) {
          bool21 = true;
        }
        a(localeq14, str11, bool21);
        paramParcel2.writeNoException();
        return true;
      case 5061: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        k(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5055: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        k(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5067: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        boolean bool20 = bV();
        paramParcel2.writeNoException();
        int i14 = 0;
        if (bool20) {
          i14 = 1;
        }
        paramParcel2.writeInt(i14);
        return true;
      case 5068: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int i13 = paramParcel1.readInt();
        boolean bool19 = false;
        if (i13 != 0) {
          bool19 = true;
        }
        setUseNewPlayerNotificationsFirstParty(bool19);
        paramParcel2.writeNoException();
        return true;
      case 5056: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        h(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5057: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        l(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5062: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5063: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq13 = eq.a.B(paramParcel1.readStrongBinder());
        int i12 = paramParcel1.readInt();
        boolean bool18 = false;
        if (i12 != 0) {
          bool18 = true;
        }
        a(localeq13, bool18);
        paramParcel2.writeNoException();
        return true;
      case 5066: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        Uri localUri2 = P(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (localUri2 != null)
        {
          paramParcel2.writeInt(1);
          localUri2.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5501: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq12 = eq.a.B(paramParcel1.readStrongBinder());
        String str10 = paramParcel1.readString();
        int i11 = paramParcel1.readInt();
        boolean bool16;
        if (paramParcel1.readInt() != 0)
        {
          bool16 = true;
          if (paramParcel1.readInt() == 0) {
            break label3497;
          }
        }
        for (boolean bool17 = true;; bool17 = false)
        {
          b(localeq12, str10, i11, bool16, bool17);
          paramParcel2.writeNoException();
          return true;
          bool16 = false;
          break;
        }
      case 5502: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d locald1 = bW();
        paramParcel2.writeNoException();
        if (locald1 != null)
        {
          paramParcel2.writeInt(1);
          locald1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 6001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq11 = eq.a.B(paramParcel1.readStrongBinder());
        int i10 = paramParcel1.readInt();
        boolean bool15 = false;
        if (i10 != 0) {
          bool15 = true;
        }
        b(localeq11, bool15);
        paramParcel2.writeNoException();
        return true;
      case 6002: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq10 = eq.a.B(paramParcel1.readStrongBinder());
        String str8 = paramParcel1.readString();
        String str9 = paramParcel1.readString();
        int i9 = paramParcel1.readInt();
        boolean bool14 = false;
        if (i9 != 0) {
          bool14 = true;
        }
        a(localeq10, str8, str9, bool14);
        paramParcel2.writeNoException();
        return true;
      case 6003: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq9 = eq.a.B(paramParcel1.readStrongBinder());
        int i7 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool12 = true;; bool12 = false)
        {
          int i8 = paramParcel1.readInt();
          boolean bool13 = false;
          if (i8 != 0) {
            bool13 = true;
          }
          d(localeq9, i7, bool12, bool13);
          paramParcel2.writeNoException();
          return true;
        }
      case 6004: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq8 = eq.a.B(paramParcel1.readStrongBinder());
        int i5 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool10 = true;; bool10 = false)
        {
          int i6 = paramParcel1.readInt();
          boolean bool11 = false;
          if (i6 != 0) {
            bool11 = true;
          }
          e(localeq8, i5, bool10, bool11);
          paramParcel2.writeNoException();
          return true;
        }
      case 6501: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq7 = eq.a.B(paramParcel1.readStrongBinder());
        String str7 = paramParcel1.readString();
        int i3 = paramParcel1.readInt();
        boolean bool6;
        boolean bool7;
        if (paramParcel1.readInt() != 0)
        {
          bool6 = true;
          if (paramParcel1.readInt() == 0) {
            break label3901;
          }
          bool7 = true;
          if (paramParcel1.readInt() == 0) {
            break label3907;
          }
        }
        for (boolean bool8 = true;; bool8 = false)
        {
          int i4 = paramParcel1.readInt();
          boolean bool9 = false;
          if (i4 != 0) {
            bool9 = true;
          }
          a(localeq7, str7, i3, bool6, bool7, bool8, bool9);
          paramParcel2.writeNoException();
          return true;
          bool6 = false;
          break;
          bool7 = false;
          break label3844;
        }
      case 6502: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq6 = eq.a.B(paramParcel1.readStrongBinder());
        String str6 = paramParcel1.readString();
        int i2 = paramParcel1.readInt();
        boolean bool5 = false;
        if (i2 != 0) {
          bool5 = true;
        }
        b(localeq6, str6, bool5);
        paramParcel2.writeNoException();
        return true;
      case 6503: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq5 = eq.a.B(paramParcel1.readStrongBinder());
        int i1 = paramParcel1.readInt();
        boolean bool4 = false;
        if (i1 != 0) {
          bool4 = true;
        }
        c(localeq5, bool4);
        paramParcel2.writeNoException();
        return true;
      case 6504: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq4 = eq.a.B(paramParcel1.readStrongBinder());
        String str5 = paramParcel1.readString();
        int n = paramParcel1.readInt();
        boolean bool3 = false;
        if (n != 0) {
          bool3 = true;
        }
        c(localeq4, str5, bool3);
        paramParcel2.writeNoException();
        return true;
      case 6505: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq3 = eq.a.B(paramParcel1.readStrongBinder());
        String str4 = paramParcel1.readString();
        int m = paramParcel1.readInt();
        boolean bool2 = false;
        if (m != 0) {
          bool2 = true;
        }
        d(localeq3, str4, bool2);
        paramParcel2.writeNoException();
        return true;
      case 6506: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        eq localeq2 = eq.a.B(paramParcel1.readStrongBinder());
        String str2 = paramParcel1.readString();
        String str3 = paramParcel1.readString();
        int k = paramParcel1.readInt();
        boolean bool1 = false;
        if (k != 0) {
          bool1 = true;
        }
        b(localeq2, str2, str3, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6507: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        int j = paramParcel1.readInt();
        Uri localUri1 = null;
        if (j != 0) {
          localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        }
        ParcelFileDescriptor localParcelFileDescriptor = e(localUri1);
        paramParcel2.writeNoException();
        if (localParcelFileDescriptor != null)
        {
          paramParcel2.writeInt(1);
          localParcelFileDescriptor.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 7001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        m(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 7002: 
        label2058:
        label2671:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        label2750:
        label3907:
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readString());
        label3497:
        label3901:
        paramParcel2.writeNoException();
        label3844:
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      eq localeq1 = eq.a.B(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      int i = paramParcel1.readInt();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        b(localeq1, str1, i, localIBinder1, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    
    private static class a
      implements er
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      public String L(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5064, localParcel1, localParcel2, 0);
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
      
      public String M(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5035, localParcel1, localParcel2, 0);
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
      
      public void N(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5050, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int O(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5060, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public Uri P(String paramString)
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
        //   14: aload_2
        //   15: aload_1
        //   16: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   19: aload_0
        //   20: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   23: sipush 5066
        //   26: aload_2
        //   27: aload_3
        //   28: iconst_0
        //   29: invokeinterface 40 5 0
        //   34: pop
        //   35: aload_3
        //   36: invokevirtual 43	android/os/Parcel:readException	()V
        //   39: aload_3
        //   40: invokevirtual 58	android/os/Parcel:readInt	()I
        //   43: ifeq +28 -> 71
        //   46: getstatic 66	android/net/Uri:CREATOR	Landroid/os/Parcelable$Creator;
        //   49: aload_3
        //   50: invokeinterface 72 2 0
        //   55: checkcast 62	android/net/Uri
        //   58: astore 6
        //   60: aload_3
        //   61: invokevirtual 50	android/os/Parcel:recycle	()V
        //   64: aload_2
        //   65: invokevirtual 50	android/os/Parcel:recycle	()V
        //   68: aload 6
        //   70: areturn
        //   71: aconst_null
        //   72: astore 6
        //   74: goto -14 -> 60
        //   77: astore 4
        //   79: aload_3
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_2
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 4
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramString	String
        //   3	81	2	localParcel1	Parcel
        //   7	73	3	localParcel2	Parcel
        //   77	11	4	localObject	Object
        //   58	15	6	localUri	Uri
        // Exception table:
        //   from	to	target	type
        //   8	60	77	finally
      }
      
      /* Error */
      public int a(eq parameq, byte[] paramArrayOfByte, String paramString1, String paramString2)
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
        //   18: ifnull +80 -> 98
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 87	android/os/Parcel:writeByteArray	([B)V
        //   42: aload 5
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload 5
        //   50: aload 4
        //   52: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   55: aload_0
        //   56: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   59: sipush 5033
        //   62: aload 5
        //   64: aload 6
        //   66: iconst_0
        //   67: invokeinterface 40 5 0
        //   72: pop
        //   73: aload 6
        //   75: invokevirtual 43	android/os/Parcel:readException	()V
        //   78: aload 6
        //   80: invokevirtual 58	android/os/Parcel:readInt	()I
        //   83: istore 10
        //   85: aload 6
        //   87: invokevirtual 50	android/os/Parcel:recycle	()V
        //   90: aload 5
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: iload 10
        //   97: ireturn
        //   98: aconst_null
        //   99: astore 8
        //   101: goto -72 -> 29
        //   104: astore 7
        //   106: aload 6
        //   108: invokevirtual 50	android/os/Parcel:recycle	()V
        //   111: aload 5
        //   113: invokevirtual 50	android/os/Parcel:recycle	()V
        //   116: aload 7
        //   118: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	119	0	this	a
        //   0	119	1	parameq	eq
        //   0	119	2	paramArrayOfByte	byte[]
        //   0	119	3	paramString1	String
        //   0	119	4	paramString2	String
        //   3	109	5	localParcel1	Parcel
        //   8	99	6	localParcel2	Parcel
        //   104	13	7	localObject	Object
        //   27	73	8	localIBinder	IBinder
        //   83	13	10	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	104	finally
        //   21	29	104	finally
        //   29	85	104	finally
      }
      
      /* Error */
      public void a(IBinder paramIBinder, Bundle paramBundle)
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
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   20: aload_2
        //   21: ifnull +46 -> 67
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   39: sipush 5005
        //   42: aload_3
        //   43: aload 4
        //   45: iconst_0
        //   46: invokeinterface 40 5 0
        //   51: pop
        //   52: aload 4
        //   54: invokevirtual 43	android/os/Parcel:readException	()V
        //   57: aload 4
        //   59: invokevirtual 50	android/os/Parcel:recycle	()V
        //   62: aload_3
        //   63: invokevirtual 50	android/os/Parcel:recycle	()V
        //   66: return
        //   67: aload_3
        //   68: iconst_0
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: goto -37 -> 35
        //   75: astore 5
        //   77: aload 4
        //   79: invokevirtual 50	android/os/Parcel:recycle	()V
        //   82: aload_3
        //   83: invokevirtual 50	android/os/Parcel:recycle	()V
        //   86: aload 5
        //   88: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	89	0	this	a
        //   0	89	1	paramIBinder	IBinder
        //   0	89	2	paramBundle	Bundle
        //   3	80	3	localParcel1	Parcel
        //   7	71	4	localParcel2	Parcel
        //   75	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   9	20	75	finally
        //   24	35	75	finally
        //   35	57	75	finally
        //   67	72	75	finally
      }
      
      /* Error */
      public void a(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5002
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void a(eq parameq, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +92 -> 113
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 10
        //   32: aload 7
        //   34: aload 10
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 7
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: aload 7
        //   47: iload_3
        //   48: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   51: iload 4
        //   53: ifeq +66 -> 119
        //   56: iload 6
        //   58: istore 11
        //   60: aload 7
        //   62: iload 11
        //   64: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   67: iload 5
        //   69: ifeq +56 -> 125
        //   72: aload 7
        //   74: iload 6
        //   76: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   83: sipush 5044
        //   86: aload 7
        //   88: aload 8
        //   90: iconst_0
        //   91: invokeinterface 40 5 0
        //   96: pop
        //   97: aload 8
        //   99: invokevirtual 43	android/os/Parcel:readException	()V
        //   102: aload 8
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: aload 7
        //   109: invokevirtual 50	android/os/Parcel:recycle	()V
        //   112: return
        //   113: aconst_null
        //   114: astore 10
        //   116: goto -84 -> 32
        //   119: iconst_0
        //   120: istore 11
        //   122: goto -62 -> 60
        //   125: iconst_0
        //   126: istore 6
        //   128: goto -56 -> 72
        //   131: astore 9
        //   133: aload 8
        //   135: invokevirtual 50	android/os/Parcel:recycle	()V
        //   138: aload 7
        //   140: invokevirtual 50	android/os/Parcel:recycle	()V
        //   143: aload 9
        //   145: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	146	0	this	a
        //   0	146	1	parameq	eq
        //   0	146	2	paramInt1	int
        //   0	146	3	paramInt2	int
        //   0	146	4	paramBoolean1	boolean
        //   0	146	5	paramBoolean2	boolean
        //   1	126	6	i	int
        //   6	133	7	localParcel1	Parcel
        //   11	123	8	localParcel2	Parcel
        //   131	13	9	localObject	Object
        //   30	85	10	localIBinder	IBinder
        //   58	63	11	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	131	finally
        //   24	32	131	finally
        //   32	51	131	finally
        //   60	67	131	finally
        //   72	102	131	finally
      }
      
      /* Error */
      public void a(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 9
        //   32: aload 6
        //   34: aload 9
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 6
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: iload_3
        //   46: ifeq +66 -> 112
        //   49: iload 5
        //   51: istore 10
        //   53: aload 6
        //   55: iload 10
        //   57: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   60: iload 4
        //   62: ifeq +56 -> 118
        //   65: aload 6
        //   67: iload 5
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: aload_0
        //   73: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 5015
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 40 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 43	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 50	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore 9
        //   109: goto -77 -> 32
        //   112: iconst_0
        //   113: istore 10
        //   115: goto -62 -> 53
        //   118: iconst_0
        //   119: istore 5
        //   121: goto -56 -> 65
        //   124: astore 8
        //   126: aload 7
        //   128: invokevirtual 50	android/os/Parcel:recycle	()V
        //   131: aload 6
        //   133: invokevirtual 50	android/os/Parcel:recycle	()V
        //   136: aload 8
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	parameq	eq
        //   0	139	2	paramInt	int
        //   0	139	3	paramBoolean1	boolean
        //   0	139	4	paramBoolean2	boolean
        //   1	119	5	i	int
        //   6	126	6	localParcel1	Parcel
        //   11	116	7	localParcel2	Parcel
        //   124	13	8	localObject	Object
        //   30	78	9	localIBinder	IBinder
        //   51	63	10	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	124	finally
        //   24	32	124	finally
        //   32	45	124	finally
        //   53	60	124	finally
        //   65	95	124	finally
      }
      
      /* Error */
      public void a(eq parameq, long paramLong)
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
        //   18: ifnull +58 -> 76
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: lload_2
        //   39: invokevirtual 106	android/os/Parcel:writeLong	(J)V
        //   42: aload_0
        //   43: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   46: sipush 5058
        //   49: aload 4
        //   51: aload 5
        //   53: iconst_0
        //   54: invokeinterface 40 5 0
        //   59: pop
        //   60: aload 5
        //   62: invokevirtual 43	android/os/Parcel:readException	()V
        //   65: aload 5
        //   67: invokevirtual 50	android/os/Parcel:recycle	()V
        //   70: aload 4
        //   72: invokevirtual 50	android/os/Parcel:recycle	()V
        //   75: return
        //   76: aconst_null
        //   77: astore 7
        //   79: goto -50 -> 29
        //   82: astore 6
        //   84: aload 5
        //   86: invokevirtual 50	android/os/Parcel:recycle	()V
        //   89: aload 4
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload 6
        //   96: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	97	0	this	a
        //   0	97	1	parameq	eq
        //   0	97	2	paramLong	long
        //   3	87	4	localParcel1	Parcel
        //   8	77	5	localParcel2	Parcel
        //   82	13	6	localObject	Object
        //   27	51	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	82	finally
        //   21	29	82	finally
        //   29	65	82	finally
      }
      
      /* Error */
      public void a(eq parameq, Bundle paramBundle, int paramInt1, int paramInt2)
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
        //   18: ifnull +82 -> 100
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload_2
        //   37: ifnull +69 -> 106
        //   40: aload 5
        //   42: iconst_1
        //   43: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   46: aload_2
        //   47: aload 5
        //   49: iconst_0
        //   50: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   53: aload 5
        //   55: iload_3
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload 5
        //   61: iload 4
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload_0
        //   67: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   70: sipush 5021
        //   73: aload 5
        //   75: aload 6
        //   77: iconst_0
        //   78: invokeinterface 40 5 0
        //   83: pop
        //   84: aload 6
        //   86: invokevirtual 43	android/os/Parcel:readException	()V
        //   89: aload 6
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload 5
        //   96: invokevirtual 50	android/os/Parcel:recycle	()V
        //   99: return
        //   100: aconst_null
        //   101: astore 8
        //   103: goto -74 -> 29
        //   106: aload 5
        //   108: iconst_0
        //   109: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   112: goto -59 -> 53
        //   115: astore 7
        //   117: aload 6
        //   119: invokevirtual 50	android/os/Parcel:recycle	()V
        //   122: aload 5
        //   124: invokevirtual 50	android/os/Parcel:recycle	()V
        //   127: aload 7
        //   129: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	130	0	this	a
        //   0	130	1	parameq	eq
        //   0	130	2	paramBundle	Bundle
        //   0	130	3	paramInt1	int
        //   0	130	4	paramInt2	int
        //   3	120	5	localParcel1	Parcel
        //   8	110	6	localParcel2	Parcel
        //   115	13	7	localObject	Object
        //   27	75	8	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	115	finally
        //   21	29	115	finally
        //   29	36	115	finally
        //   40	53	115	finally
        //   53	89	115	finally
        //   106	112	115	finally
      }
      
      public void a(eq parameq, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            IBinder localIBinder;
            if (parameq != null)
            {
              localIBinder = parameq.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              localParcel1.writeStrongBinder(paramIBinder);
              localParcel1.writeInt(paramInt);
              localParcel1.writeStringArray(paramArrayOfString);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                break label164;
                localParcel1.writeInt(i);
                localParcel1.writeLong(paramLong);
                this.dG.transact(5030, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localIBinder = null;
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label164:
          while (!paramBoolean)
          {
            i = 0;
            break;
          }
        }
      }
      
      /* Error */
      public void a(eq parameq, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong)
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
        //   18: ifnull +89 -> 107
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 10
        //   29: aload 7
        //   31: aload 10
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 7
        //   38: aload_2
        //   39: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload 7
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: iconst_0
        //   49: istore 11
        //   51: iload 4
        //   53: ifeq +6 -> 59
        //   56: iconst_1
        //   57: istore 11
        //   59: aload 7
        //   61: iload 11
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload 7
        //   68: lload 5
        //   70: invokevirtual 106	android/os/Parcel:writeLong	(J)V
        //   73: aload_0
        //   74: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   77: sipush 5031
        //   80: aload 7
        //   82: aload 8
        //   84: iconst_0
        //   85: invokeinterface 40 5 0
        //   90: pop
        //   91: aload 8
        //   93: invokevirtual 43	android/os/Parcel:readException	()V
        //   96: aload 8
        //   98: invokevirtual 50	android/os/Parcel:recycle	()V
        //   101: aload 7
        //   103: invokevirtual 50	android/os/Parcel:recycle	()V
        //   106: return
        //   107: aconst_null
        //   108: astore 10
        //   110: goto -81 -> 29
        //   113: astore 9
        //   115: aload 8
        //   117: invokevirtual 50	android/os/Parcel:recycle	()V
        //   120: aload 7
        //   122: invokevirtual 50	android/os/Parcel:recycle	()V
        //   125: aload 9
        //   127: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	128	0	this	a
        //   0	128	1	parameq	eq
        //   0	128	2	paramIBinder	IBinder
        //   0	128	3	paramString	String
        //   0	128	4	paramBoolean	boolean
        //   0	128	5	paramLong	long
        //   3	118	7	localParcel1	Parcel
        //   8	108	8	localParcel2	Parcel
        //   113	13	9	localObject	Object
        //   27	82	10	localIBinder	IBinder
        //   49	13	11	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	113	finally
        //   21	29	113	finally
        //   29	48	113	finally
        //   59	96	113	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5008
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
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
        //   22: invokeinterface 80 1 0
        //   27: astore 10
        //   29: aload 7
        //   31: aload 10
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 7
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 7
        //   44: iload_3
        //   45: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   48: aload 7
        //   50: iload 4
        //   52: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   55: aload 7
        //   57: iload 5
        //   59: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   62: iconst_0
        //   63: istore 11
        //   65: iload 6
        //   67: ifeq +6 -> 73
        //   70: iconst_1
        //   71: istore 11
        //   73: aload 7
        //   75: iload 11
        //   77: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   80: aload_0
        //   81: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   84: sipush 5019
        //   87: aload 7
        //   89: aload 8
        //   91: iconst_0
        //   92: invokeinterface 40 5 0
        //   97: pop
        //   98: aload 8
        //   100: invokevirtual 43	android/os/Parcel:readException	()V
        //   103: aload 8
        //   105: invokevirtual 50	android/os/Parcel:recycle	()V
        //   108: aload 7
        //   110: invokevirtual 50	android/os/Parcel:recycle	()V
        //   113: return
        //   114: aconst_null
        //   115: astore 10
        //   117: goto -88 -> 29
        //   120: astore 9
        //   122: aload 8
        //   124: invokevirtual 50	android/os/Parcel:recycle	()V
        //   127: aload 7
        //   129: invokevirtual 50	android/os/Parcel:recycle	()V
        //   132: aload 9
        //   134: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	135	0	this	a
        //   0	135	1	parameq	eq
        //   0	135	2	paramString	String
        //   0	135	3	paramInt1	int
        //   0	135	4	paramInt2	int
        //   0	135	5	paramInt3	int
        //   0	135	6	paramBoolean	boolean
        //   3	125	7	localParcel1	Parcel
        //   8	115	8	localParcel2	Parcel
        //   120	13	9	localObject	Object
        //   27	89	10	localIBinder	IBinder
        //   63	13	11	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	120	finally
        //   21	29	120	finally
        //   29	62	120	finally
        //   73	103	120	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
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
        //   18: ifnull +90 -> 108
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 9
        //   29: aload 6
        //   31: aload 9
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 6
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 6
        //   44: iload_3
        //   45: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   48: aload 6
        //   50: aload 4
        //   52: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   55: aload 5
        //   57: ifnull +57 -> 114
        //   60: aload 6
        //   62: iconst_1
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload 5
        //   68: aload 6
        //   70: iconst_0
        //   71: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   74: aload_0
        //   75: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   78: sipush 5025
        //   81: aload 6
        //   83: aload 7
        //   85: iconst_0
        //   86: invokeinterface 40 5 0
        //   91: pop
        //   92: aload 7
        //   94: invokevirtual 43	android/os/Parcel:readException	()V
        //   97: aload 7
        //   99: invokevirtual 50	android/os/Parcel:recycle	()V
        //   102: aload 6
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: return
        //   108: aconst_null
        //   109: astore 9
        //   111: goto -82 -> 29
        //   114: aload 6
        //   116: iconst_0
        //   117: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   120: goto -46 -> 74
        //   123: astore 8
        //   125: aload 7
        //   127: invokevirtual 50	android/os/Parcel:recycle	()V
        //   130: aload 6
        //   132: invokevirtual 50	android/os/Parcel:recycle	()V
        //   135: aload 8
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	parameq	eq
        //   0	138	2	paramString	String
        //   0	138	3	paramInt	int
        //   0	138	4	paramIBinder	IBinder
        //   0	138	5	paramBundle	Bundle
        //   3	128	6	localParcel1	Parcel
        //   8	118	7	localParcel2	Parcel
        //   123	13	8	localObject	Object
        //   27	83	9	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	123	finally
        //   21	29	123	finally
        //   29	55	123	finally
        //   60	74	123	finally
        //   74	97	123	finally
        //   114	120	123	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +92 -> 113
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 10
        //   32: aload 7
        //   34: aload 10
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 7
        //   41: aload_2
        //   42: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   45: aload 7
        //   47: iload_3
        //   48: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   51: iload 4
        //   53: ifeq +66 -> 119
        //   56: iload 6
        //   58: istore 11
        //   60: aload 7
        //   62: iload 11
        //   64: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   67: iload 5
        //   69: ifeq +56 -> 125
        //   72: aload 7
        //   74: iload 6
        //   76: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   83: sipush 5045
        //   86: aload 7
        //   88: aload 8
        //   90: iconst_0
        //   91: invokeinterface 40 5 0
        //   96: pop
        //   97: aload 8
        //   99: invokevirtual 43	android/os/Parcel:readException	()V
        //   102: aload 8
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: aload 7
        //   109: invokevirtual 50	android/os/Parcel:recycle	()V
        //   112: return
        //   113: aconst_null
        //   114: astore 10
        //   116: goto -84 -> 32
        //   119: iconst_0
        //   120: istore 11
        //   122: goto -62 -> 60
        //   125: iconst_0
        //   126: istore 6
        //   128: goto -56 -> 72
        //   131: astore 9
        //   133: aload 8
        //   135: invokevirtual 50	android/os/Parcel:recycle	()V
        //   138: aload 7
        //   140: invokevirtual 50	android/os/Parcel:recycle	()V
        //   143: aload 9
        //   145: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	146	0	this	a
        //   0	146	1	parameq	eq
        //   0	146	2	paramString	String
        //   0	146	3	paramInt	int
        //   0	146	4	paramBoolean1	boolean
        //   0	146	5	paramBoolean2	boolean
        //   1	126	6	i	int
        //   6	133	7	localParcel1	Parcel
        //   11	123	8	localParcel2	Parcel
        //   131	13	9	localObject	Object
        //   30	85	10	localIBinder	IBinder
        //   58	63	11	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	131	finally
        //   24	32	131	finally
        //   32	51	131	finally
        //   60	67	131	finally
        //   72	102	131	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 8
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 9
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: aload 9
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +124 -> 145
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 12
        //   32: aload 9
        //   34: aload 12
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 9
        //   41: aload_2
        //   42: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   45: aload 9
        //   47: iload_3
        //   48: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   51: iload 4
        //   53: ifeq +98 -> 151
        //   56: iload 8
        //   58: istore 13
        //   60: aload 9
        //   62: iload 13
        //   64: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   67: iload 5
        //   69: ifeq +88 -> 157
        //   72: iload 8
        //   74: istore 14
        //   76: aload 9
        //   78: iload 14
        //   80: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   83: iload 6
        //   85: ifeq +78 -> 163
        //   88: iload 8
        //   90: istore 15
        //   92: aload 9
        //   94: iload 15
        //   96: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   99: iload 7
        //   101: ifeq +68 -> 169
        //   104: aload 9
        //   106: iload 8
        //   108: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   111: aload_0
        //   112: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   115: sipush 6501
        //   118: aload 9
        //   120: aload 10
        //   122: iconst_0
        //   123: invokeinterface 40 5 0
        //   128: pop
        //   129: aload 10
        //   131: invokevirtual 43	android/os/Parcel:readException	()V
        //   134: aload 10
        //   136: invokevirtual 50	android/os/Parcel:recycle	()V
        //   139: aload 9
        //   141: invokevirtual 50	android/os/Parcel:recycle	()V
        //   144: return
        //   145: aconst_null
        //   146: astore 12
        //   148: goto -116 -> 32
        //   151: iconst_0
        //   152: istore 13
        //   154: goto -94 -> 60
        //   157: iconst_0
        //   158: istore 14
        //   160: goto -84 -> 76
        //   163: iconst_0
        //   164: istore 15
        //   166: goto -74 -> 92
        //   169: iconst_0
        //   170: istore 8
        //   172: goto -68 -> 104
        //   175: astore 11
        //   177: aload 10
        //   179: invokevirtual 50	android/os/Parcel:recycle	()V
        //   182: aload 9
        //   184: invokevirtual 50	android/os/Parcel:recycle	()V
        //   187: aload 11
        //   189: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	190	0	this	a
        //   0	190	1	parameq	eq
        //   0	190	2	paramString	String
        //   0	190	3	paramInt	int
        //   0	190	4	paramBoolean1	boolean
        //   0	190	5	paramBoolean2	boolean
        //   0	190	6	paramBoolean3	boolean
        //   0	190	7	paramBoolean4	boolean
        //   1	170	8	i	int
        //   6	177	9	localParcel1	Parcel
        //   11	167	10	localParcel2	Parcel
        //   175	13	11	localObject	Object
        //   30	117	12	localIBinder	IBinder
        //   58	95	13	j	int
        //   74	85	14	k	int
        //   90	75	15	m	int
        // Exception table:
        //   from	to	target	type
        //   13	20	175	finally
        //   24	32	175	finally
        //   32	51	175	finally
        //   60	67	175	finally
        //   76	83	175	finally
        //   92	99	175	finally
        //   104	134	175	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, long paramLong)
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
        //   18: ifnull +64 -> 82
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: lload_3
        //   45: invokevirtual 106	android/os/Parcel:writeLong	(J)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 5016
        //   55: aload 5
        //   57: aload 6
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 6
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 6
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload 5
        //   78: invokevirtual 50	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore 8
        //   85: goto -56 -> 29
        //   88: astore 7
        //   90: aload 6
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 7
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	parameq	eq
        //   0	103	2	paramString	String
        //   0	103	3	paramLong	long
        //   3	93	5	localParcel1	Parcel
        //   8	83	6	localParcel2	Parcel
        //   88	13	7	localObject	Object
        //   27	57	8	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	88	finally
        //   21	29	88	finally
        //   29	71	88	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, long paramLong, String paramString2)
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
        //   18: ifnull +71 -> 89
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 9
        //   29: aload 6
        //   31: aload 9
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 6
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 6
        //   44: lload_3
        //   45: invokevirtual 106	android/os/Parcel:writeLong	(J)V
        //   48: aload 6
        //   50: aload 5
        //   52: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   55: aload_0
        //   56: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   59: sipush 7002
        //   62: aload 6
        //   64: aload 7
        //   66: iconst_0
        //   67: invokeinterface 40 5 0
        //   72: pop
        //   73: aload 7
        //   75: invokevirtual 43	android/os/Parcel:readException	()V
        //   78: aload 7
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload 6
        //   85: invokevirtual 50	android/os/Parcel:recycle	()V
        //   88: return
        //   89: aconst_null
        //   90: astore 9
        //   92: goto -63 -> 29
        //   95: astore 8
        //   97: aload 7
        //   99: invokevirtual 50	android/os/Parcel:recycle	()V
        //   102: aload 6
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: aload 8
        //   109: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	110	0	this	a
        //   0	110	1	parameq	eq
        //   0	110	2	paramString1	String
        //   0	110	3	paramLong	long
        //   0	110	5	paramString2	String
        //   3	100	6	localParcel1	Parcel
        //   8	90	7	localParcel2	Parcel
        //   95	13	8	localObject	Object
        //   27	64	9	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	95	finally
        //   21	29	95	finally
        //   29	78	95	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
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
        //   18: ifnull +83 -> 101
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: aload_3
        //   45: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   48: aload 4
        //   50: ifnull +57 -> 107
        //   53: aload 5
        //   55: iconst_1
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload 4
        //   61: aload 5
        //   63: iconst_0
        //   64: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   67: aload_0
        //   68: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   71: sipush 5023
        //   74: aload 5
        //   76: aload 6
        //   78: iconst_0
        //   79: invokeinterface 40 5 0
        //   84: pop
        //   85: aload 6
        //   87: invokevirtual 43	android/os/Parcel:readException	()V
        //   90: aload 6
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: return
        //   101: aconst_null
        //   102: astore 8
        //   104: goto -75 -> 29
        //   107: aload 5
        //   109: iconst_0
        //   110: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   113: goto -46 -> 67
        //   116: astore 7
        //   118: aload 6
        //   120: invokevirtual 50	android/os/Parcel:recycle	()V
        //   123: aload 5
        //   125: invokevirtual 50	android/os/Parcel:recycle	()V
        //   128: aload 7
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramString	String
        //   0	131	3	paramIBinder	IBinder
        //   0	131	4	paramBundle	Bundle
        //   3	121	5	localParcel1	Parcel
        //   8	111	6	localParcel2	Parcel
        //   116	13	7	localObject	Object
        //   27	76	8	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	116	finally
        //   21	29	116	finally
        //   29	48	116	finally
        //   53	67	116	finally
        //   67	90	116	finally
        //   107	113	116	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2)
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
        //   18: ifnull +64 -> 82
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 4
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 5009
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 50	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore 7
        //   85: goto -56 -> 29
        //   88: astore 6
        //   90: aload 5
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 4
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	parameq	eq
        //   0	103	2	paramString1	String
        //   0	103	3	paramString2	String
        //   3	93	4	localParcel1	Parcel
        //   8	83	5	localParcel2	Parcel
        //   88	13	6	localObject	Object
        //   27	57	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	88	finally
        //   21	29	88	finally
        //   29	71	88	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 8
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 9
        //   10: aload 8
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +103 -> 121
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 11
        //   29: aload 8
        //   31: aload 11
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 8
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 8
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload 8
        //   50: iload 4
        //   52: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   55: aload 8
        //   57: iload 5
        //   59: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   62: aload 8
        //   64: iload 6
        //   66: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   69: iconst_0
        //   70: istore 12
        //   72: iload 7
        //   74: ifeq +6 -> 80
        //   77: iconst_1
        //   78: istore 12
        //   80: aload 8
        //   82: iload 12
        //   84: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   87: aload_0
        //   88: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   91: sipush 5039
        //   94: aload 8
        //   96: aload 9
        //   98: iconst_0
        //   99: invokeinterface 40 5 0
        //   104: pop
        //   105: aload 9
        //   107: invokevirtual 43	android/os/Parcel:readException	()V
        //   110: aload 9
        //   112: invokevirtual 50	android/os/Parcel:recycle	()V
        //   115: aload 8
        //   117: invokevirtual 50	android/os/Parcel:recycle	()V
        //   120: return
        //   121: aconst_null
        //   122: astore 11
        //   124: goto -95 -> 29
        //   127: astore 10
        //   129: aload 9
        //   131: invokevirtual 50	android/os/Parcel:recycle	()V
        //   134: aload 8
        //   136: invokevirtual 50	android/os/Parcel:recycle	()V
        //   139: aload 10
        //   141: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	142	0	this	a
        //   0	142	1	parameq	eq
        //   0	142	2	paramString1	String
        //   0	142	3	paramString2	String
        //   0	142	4	paramInt1	int
        //   0	142	5	paramInt2	int
        //   0	142	6	paramInt3	int
        //   0	142	7	paramBoolean	boolean
        //   3	132	8	localParcel1	Parcel
        //   8	122	9	localParcel2	Parcel
        //   127	13	10	localObject	Object
        //   27	96	11	localIBinder	IBinder
        //   70	13	12	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	127	finally
        //   21	29	127	finally
        //   29	69	127	finally
        //   80	110	127	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
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
        //   18: ifnull +82 -> 100
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: iconst_0
        //   49: istore 9
        //   51: iload 4
        //   53: ifeq +6 -> 59
        //   56: iconst_1
        //   57: istore 9
        //   59: aload 5
        //   61: iload 9
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload_0
        //   67: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   70: sipush 6002
        //   73: aload 5
        //   75: aload 6
        //   77: iconst_0
        //   78: invokeinterface 40 5 0
        //   83: pop
        //   84: aload 6
        //   86: invokevirtual 43	android/os/Parcel:readException	()V
        //   89: aload 6
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload 5
        //   96: invokevirtual 50	android/os/Parcel:recycle	()V
        //   99: return
        //   100: aconst_null
        //   101: astore 8
        //   103: goto -74 -> 29
        //   106: astore 7
        //   108: aload 6
        //   110: invokevirtual 50	android/os/Parcel:recycle	()V
        //   113: aload 5
        //   115: invokevirtual 50	android/os/Parcel:recycle	()V
        //   118: aload 7
        //   120: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	121	0	this	a
        //   0	121	1	parameq	eq
        //   0	121	2	paramString1	String
        //   0	121	3	paramString2	String
        //   0	121	4	paramBoolean	boolean
        //   3	111	5	localParcel1	Parcel
        //   8	101	6	localParcel2	Parcel
        //   106	13	7	localObject	Object
        //   27	75	8	localIBinder	IBinder
        //   49	13	9	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	106	finally
        //   21	29	106	finally
        //   29	48	106	finally
        //   59	89	106	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, boolean paramBoolean)
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
        //   18: ifnull +75 -> 93
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: iconst_0
        //   43: istore 8
        //   45: iload_3
        //   46: ifeq +6 -> 52
        //   49: iconst_1
        //   50: istore 8
        //   52: aload 4
        //   54: iload 8
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload_0
        //   60: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   63: sipush 5054
        //   66: aload 4
        //   68: aload 5
        //   70: iconst_0
        //   71: invokeinterface 40 5 0
        //   76: pop
        //   77: aload 5
        //   79: invokevirtual 43	android/os/Parcel:readException	()V
        //   82: aload 5
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 4
        //   89: invokevirtual 50	android/os/Parcel:recycle	()V
        //   92: return
        //   93: aconst_null
        //   94: astore 7
        //   96: goto -67 -> 29
        //   99: astore 6
        //   101: aload 5
        //   103: invokevirtual 50	android/os/Parcel:recycle	()V
        //   106: aload 4
        //   108: invokevirtual 50	android/os/Parcel:recycle	()V
        //   111: aload 6
        //   113: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	114	0	this	a
        //   0	114	1	parameq	eq
        //   0	114	2	paramString	String
        //   0	114	3	paramBoolean	boolean
        //   3	104	4	localParcel1	Parcel
        //   8	94	5	localParcel2	Parcel
        //   99	13	6	localObject	Object
        //   27	68	7	localIBinder	IBinder
        //   43	12	8	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	99	finally
        //   21	29	99	finally
        //   29	42	99	finally
        //   52	82	99	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, boolean paramBoolean, long[] paramArrayOfLong)
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
        //   18: ifnull +82 -> 100
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: iconst_0
        //   43: istore 9
        //   45: iload_3
        //   46: ifeq +6 -> 52
        //   49: iconst_1
        //   50: istore 9
        //   52: aload 5
        //   54: iload 9
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload 5
        //   61: aload 4
        //   63: invokevirtual 130	android/os/Parcel:writeLongArray	([J)V
        //   66: aload_0
        //   67: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   70: sipush 5011
        //   73: aload 5
        //   75: aload 6
        //   77: iconst_0
        //   78: invokeinterface 40 5 0
        //   83: pop
        //   84: aload 6
        //   86: invokevirtual 43	android/os/Parcel:readException	()V
        //   89: aload 6
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload 5
        //   96: invokevirtual 50	android/os/Parcel:recycle	()V
        //   99: return
        //   100: aconst_null
        //   101: astore 8
        //   103: goto -74 -> 29
        //   106: astore 7
        //   108: aload 6
        //   110: invokevirtual 50	android/os/Parcel:recycle	()V
        //   113: aload 5
        //   115: invokevirtual 50	android/os/Parcel:recycle	()V
        //   118: aload 7
        //   120: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	121	0	this	a
        //   0	121	1	parameq	eq
        //   0	121	2	paramString	String
        //   0	121	3	paramBoolean	boolean
        //   0	121	4	paramArrayOfLong	long[]
        //   3	111	5	localParcel1	Parcel
        //   8	101	6	localParcel2	Parcel
        //   106	13	7	localObject	Object
        //   27	75	8	localIBinder	IBinder
        //   43	12	9	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	106	finally
        //   21	29	106	finally
        //   29	42	106	finally
        //   52	89	106	finally
      }
      
      /* Error */
      public void a(eq parameq, boolean paramBoolean)
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
        //   16: ifnull +65 -> 81
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: iconst_0
        //   34: istore 7
        //   36: iload_2
        //   37: ifeq +6 -> 43
        //   40: iconst_1
        //   41: istore 7
        //   43: aload_3
        //   44: iload 7
        //   46: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   49: aload_0
        //   50: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   53: sipush 5063
        //   56: aload_3
        //   57: aload 4
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 4
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 4
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload_3
        //   77: invokevirtual 50	android/os/Parcel:recycle	()V
        //   80: return
        //   81: aconst_null
        //   82: astore 6
        //   84: goto -57 -> 27
        //   87: astore 5
        //   89: aload 4
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload_3
        //   95: invokevirtual 50	android/os/Parcel:recycle	()V
        //   98: aload 5
        //   100: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	101	0	this	a
        //   0	101	1	parameq	eq
        //   0	101	2	paramBoolean	boolean
        //   3	92	3	localParcel1	Parcel
        //   7	83	4	localParcel2	Parcel
        //   87	12	5	localObject	Object
        //   25	58	6	localIBinder	IBinder
        //   34	11	7	i	int
        // Exception table:
        //   from	to	target	type
        //   9	15	87	finally
        //   19	27	87	finally
        //   27	33	87	finally
        //   43	71	87	finally
      }
      
      public void a(String paramString1, String paramString2, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5051, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
      
      public int b(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeByteArray(paramArrayOfByte);
          localParcel1.writeString(paramString);
          localParcel1.writeStringArray(paramArrayOfString);
          this.dG.transact(5034, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void b(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5017
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void b(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 9
        //   32: aload 6
        //   34: aload 9
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 6
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: iload_3
        //   46: ifeq +66 -> 112
        //   49: iload 5
        //   51: istore 10
        //   53: aload 6
        //   55: iload 10
        //   57: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   60: iload 4
        //   62: ifeq +56 -> 118
        //   65: aload 6
        //   67: iload 5
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: aload_0
        //   73: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 5046
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 40 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 43	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 50	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore 9
        //   109: goto -77 -> 32
        //   112: iconst_0
        //   113: istore 10
        //   115: goto -62 -> 53
        //   118: iconst_0
        //   119: istore 5
        //   121: goto -56 -> 65
        //   124: astore 8
        //   126: aload 7
        //   128: invokevirtual 50	android/os/Parcel:recycle	()V
        //   131: aload 6
        //   133: invokevirtual 50	android/os/Parcel:recycle	()V
        //   136: aload 8
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	parameq	eq
        //   0	139	2	paramInt	int
        //   0	139	3	paramBoolean1	boolean
        //   0	139	4	paramBoolean2	boolean
        //   1	119	5	i	int
        //   6	126	6	localParcel1	Parcel
        //   11	116	7	localParcel2	Parcel
        //   124	13	8	localObject	Object
        //   30	78	9	localIBinder	IBinder
        //   51	63	10	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	124	finally
        //   24	32	124	finally
        //   32	45	124	finally
        //   53	60	124	finally
        //   65	95	124	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5010
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
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
        //   22: invokeinterface 80 1 0
        //   27: astore 10
        //   29: aload 7
        //   31: aload 10
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 7
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 7
        //   44: iload_3
        //   45: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   48: aload 7
        //   50: iload 4
        //   52: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   55: aload 7
        //   57: iload 5
        //   59: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   62: iconst_0
        //   63: istore 11
        //   65: iload 6
        //   67: ifeq +6 -> 73
        //   70: iconst_1
        //   71: istore 11
        //   73: aload 7
        //   75: iload 11
        //   77: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   80: aload_0
        //   81: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   84: sipush 5020
        //   87: aload 7
        //   89: aload 8
        //   91: iconst_0
        //   92: invokeinterface 40 5 0
        //   97: pop
        //   98: aload 8
        //   100: invokevirtual 43	android/os/Parcel:readException	()V
        //   103: aload 8
        //   105: invokevirtual 50	android/os/Parcel:recycle	()V
        //   108: aload 7
        //   110: invokevirtual 50	android/os/Parcel:recycle	()V
        //   113: return
        //   114: aconst_null
        //   115: astore 10
        //   117: goto -88 -> 29
        //   120: astore 9
        //   122: aload 8
        //   124: invokevirtual 50	android/os/Parcel:recycle	()V
        //   127: aload 7
        //   129: invokevirtual 50	android/os/Parcel:recycle	()V
        //   132: aload 9
        //   134: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	135	0	this	a
        //   0	135	1	parameq	eq
        //   0	135	2	paramString	String
        //   0	135	3	paramInt1	int
        //   0	135	4	paramInt2	int
        //   0	135	5	paramInt3	int
        //   0	135	6	paramBoolean	boolean
        //   3	125	7	localParcel1	Parcel
        //   8	115	8	localParcel2	Parcel
        //   120	13	9	localObject	Object
        //   27	89	10	localIBinder	IBinder
        //   63	13	11	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	120	finally
        //   21	29	120	finally
        //   29	62	120	finally
        //   73	103	120	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
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
        //   18: ifnull +90 -> 108
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 9
        //   29: aload 6
        //   31: aload 9
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 6
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 6
        //   44: iload_3
        //   45: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   48: aload 6
        //   50: aload 4
        //   52: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   55: aload 5
        //   57: ifnull +57 -> 114
        //   60: aload 6
        //   62: iconst_1
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload 5
        //   68: aload 6
        //   70: iconst_0
        //   71: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   74: aload_0
        //   75: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   78: sipush 7003
        //   81: aload 6
        //   83: aload 7
        //   85: iconst_0
        //   86: invokeinterface 40 5 0
        //   91: pop
        //   92: aload 7
        //   94: invokevirtual 43	android/os/Parcel:readException	()V
        //   97: aload 7
        //   99: invokevirtual 50	android/os/Parcel:recycle	()V
        //   102: aload 6
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: return
        //   108: aconst_null
        //   109: astore 9
        //   111: goto -82 -> 29
        //   114: aload 6
        //   116: iconst_0
        //   117: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   120: goto -46 -> 74
        //   123: astore 8
        //   125: aload 7
        //   127: invokevirtual 50	android/os/Parcel:recycle	()V
        //   130: aload 6
        //   132: invokevirtual 50	android/os/Parcel:recycle	()V
        //   135: aload 8
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	parameq	eq
        //   0	138	2	paramString	String
        //   0	138	3	paramInt	int
        //   0	138	4	paramIBinder	IBinder
        //   0	138	5	paramBundle	Bundle
        //   3	128	6	localParcel1	Parcel
        //   8	118	7	localParcel2	Parcel
        //   123	13	8	localObject	Object
        //   27	83	9	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	123	finally
        //   21	29	123	finally
        //   29	55	123	finally
        //   60	74	123	finally
        //   74	97	123	finally
        //   114	120	123	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +92 -> 113
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 10
        //   32: aload 7
        //   34: aload 10
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 7
        //   41: aload_2
        //   42: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   45: aload 7
        //   47: iload_3
        //   48: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   51: iload 4
        //   53: ifeq +66 -> 119
        //   56: iload 6
        //   58: istore 11
        //   60: aload 7
        //   62: iload 11
        //   64: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   67: iload 5
        //   69: ifeq +56 -> 125
        //   72: aload 7
        //   74: iload 6
        //   76: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   83: sipush 5501
        //   86: aload 7
        //   88: aload 8
        //   90: iconst_0
        //   91: invokeinterface 40 5 0
        //   96: pop
        //   97: aload 8
        //   99: invokevirtual 43	android/os/Parcel:readException	()V
        //   102: aload 8
        //   104: invokevirtual 50	android/os/Parcel:recycle	()V
        //   107: aload 7
        //   109: invokevirtual 50	android/os/Parcel:recycle	()V
        //   112: return
        //   113: aconst_null
        //   114: astore 10
        //   116: goto -84 -> 32
        //   119: iconst_0
        //   120: istore 11
        //   122: goto -62 -> 60
        //   125: iconst_0
        //   126: istore 6
        //   128: goto -56 -> 72
        //   131: astore 9
        //   133: aload 8
        //   135: invokevirtual 50	android/os/Parcel:recycle	()V
        //   138: aload 7
        //   140: invokevirtual 50	android/os/Parcel:recycle	()V
        //   143: aload 9
        //   145: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	146	0	this	a
        //   0	146	1	parameq	eq
        //   0	146	2	paramString	String
        //   0	146	3	paramInt	int
        //   0	146	4	paramBoolean1	boolean
        //   0	146	5	paramBoolean2	boolean
        //   1	126	6	i	int
        //   6	133	7	localParcel1	Parcel
        //   11	123	8	localParcel2	Parcel
        //   131	13	9	localObject	Object
        //   30	85	10	localIBinder	IBinder
        //   58	63	11	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	131	finally
        //   24	32	131	finally
        //   32	51	131	finally
        //   60	67	131	finally
        //   72	102	131	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
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
        //   18: ifnull +83 -> 101
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: aload_3
        //   45: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   48: aload 4
        //   50: ifnull +57 -> 107
        //   53: aload 5
        //   55: iconst_1
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload 4
        //   61: aload 5
        //   63: iconst_0
        //   64: invokevirtual 98	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   67: aload_0
        //   68: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   71: sipush 5024
        //   74: aload 5
        //   76: aload 6
        //   78: iconst_0
        //   79: invokeinterface 40 5 0
        //   84: pop
        //   85: aload 6
        //   87: invokevirtual 43	android/os/Parcel:readException	()V
        //   90: aload 6
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: return
        //   101: aconst_null
        //   102: astore 8
        //   104: goto -75 -> 29
        //   107: aload 5
        //   109: iconst_0
        //   110: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   113: goto -46 -> 67
        //   116: astore 7
        //   118: aload 6
        //   120: invokevirtual 50	android/os/Parcel:recycle	()V
        //   123: aload 5
        //   125: invokevirtual 50	android/os/Parcel:recycle	()V
        //   128: aload 7
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramString	String
        //   0	131	3	paramIBinder	IBinder
        //   0	131	4	paramBundle	Bundle
        //   3	121	5	localParcel1	Parcel
        //   8	111	6	localParcel2	Parcel
        //   116	13	7	localObject	Object
        //   27	76	8	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	116	finally
        //   21	29	116	finally
        //   29	48	116	finally
        //   53	67	116	finally
        //   67	90	116	finally
        //   107	113	116	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2)
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
        //   18: ifnull +64 -> 82
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 4
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 5038
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 50	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore 7
        //   85: goto -56 -> 29
        //   88: astore 6
        //   90: aload 5
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 4
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	parameq	eq
        //   0	103	2	paramString1	String
        //   0	103	3	paramString2	String
        //   3	93	4	localParcel1	Parcel
        //   8	83	5	localParcel2	Parcel
        //   88	13	6	localObject	Object
        //   27	57	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	88	finally
        //   21	29	88	finally
        //   29	71	88	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 8
        //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 9
        //   10: aload 8
        //   12: ldc 27
        //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +103 -> 121
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 11
        //   29: aload 8
        //   31: aload 11
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 8
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 8
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload 8
        //   50: iload 4
        //   52: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   55: aload 8
        //   57: iload 5
        //   59: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   62: aload 8
        //   64: iload 6
        //   66: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   69: iconst_0
        //   70: istore 12
        //   72: iload 7
        //   74: ifeq +6 -> 80
        //   77: iconst_1
        //   78: istore 12
        //   80: aload 8
        //   82: iload 12
        //   84: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   87: aload_0
        //   88: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   91: sipush 5040
        //   94: aload 8
        //   96: aload 9
        //   98: iconst_0
        //   99: invokeinterface 40 5 0
        //   104: pop
        //   105: aload 9
        //   107: invokevirtual 43	android/os/Parcel:readException	()V
        //   110: aload 9
        //   112: invokevirtual 50	android/os/Parcel:recycle	()V
        //   115: aload 8
        //   117: invokevirtual 50	android/os/Parcel:recycle	()V
        //   120: return
        //   121: aconst_null
        //   122: astore 11
        //   124: goto -95 -> 29
        //   127: astore 10
        //   129: aload 9
        //   131: invokevirtual 50	android/os/Parcel:recycle	()V
        //   134: aload 8
        //   136: invokevirtual 50	android/os/Parcel:recycle	()V
        //   139: aload 10
        //   141: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	142	0	this	a
        //   0	142	1	parameq	eq
        //   0	142	2	paramString1	String
        //   0	142	3	paramString2	String
        //   0	142	4	paramInt1	int
        //   0	142	5	paramInt2	int
        //   0	142	6	paramInt3	int
        //   0	142	7	paramBoolean	boolean
        //   3	132	8	localParcel1	Parcel
        //   8	122	9	localParcel2	Parcel
        //   127	13	10	localObject	Object
        //   27	96	11	localIBinder	IBinder
        //   70	13	12	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	127	finally
        //   21	29	127	finally
        //   29	69	127	finally
        //   80	110	127	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
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
        //   18: ifnull +82 -> 100
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 8
        //   29: aload 5
        //   31: aload 8
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 5
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 5
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: iconst_0
        //   49: istore 9
        //   51: iload 4
        //   53: ifeq +6 -> 59
        //   56: iconst_1
        //   57: istore 9
        //   59: aload 5
        //   61: iload 9
        //   63: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   66: aload_0
        //   67: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   70: sipush 6506
        //   73: aload 5
        //   75: aload 6
        //   77: iconst_0
        //   78: invokeinterface 40 5 0
        //   83: pop
        //   84: aload 6
        //   86: invokevirtual 43	android/os/Parcel:readException	()V
        //   89: aload 6
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload 5
        //   96: invokevirtual 50	android/os/Parcel:recycle	()V
        //   99: return
        //   100: aconst_null
        //   101: astore 8
        //   103: goto -74 -> 29
        //   106: astore 7
        //   108: aload 6
        //   110: invokevirtual 50	android/os/Parcel:recycle	()V
        //   113: aload 5
        //   115: invokevirtual 50	android/os/Parcel:recycle	()V
        //   118: aload 7
        //   120: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	121	0	this	a
        //   0	121	1	parameq	eq
        //   0	121	2	paramString1	String
        //   0	121	3	paramString2	String
        //   0	121	4	paramBoolean	boolean
        //   3	111	5	localParcel1	Parcel
        //   8	101	6	localParcel2	Parcel
        //   106	13	7	localObject	Object
        //   27	75	8	localIBinder	IBinder
        //   49	13	9	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	106	finally
        //   21	29	106	finally
        //   29	48	106	finally
        //   59	89	106	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, boolean paramBoolean)
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
        //   18: ifnull +75 -> 93
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: iconst_0
        //   43: istore 8
        //   45: iload_3
        //   46: ifeq +6 -> 52
        //   49: iconst_1
        //   50: istore 8
        //   52: aload 4
        //   54: iload 8
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload_0
        //   60: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   63: sipush 6502
        //   66: aload 4
        //   68: aload 5
        //   70: iconst_0
        //   71: invokeinterface 40 5 0
        //   76: pop
        //   77: aload 5
        //   79: invokevirtual 43	android/os/Parcel:readException	()V
        //   82: aload 5
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 4
        //   89: invokevirtual 50	android/os/Parcel:recycle	()V
        //   92: return
        //   93: aconst_null
        //   94: astore 7
        //   96: goto -67 -> 29
        //   99: astore 6
        //   101: aload 5
        //   103: invokevirtual 50	android/os/Parcel:recycle	()V
        //   106: aload 4
        //   108: invokevirtual 50	android/os/Parcel:recycle	()V
        //   111: aload 6
        //   113: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	114	0	this	a
        //   0	114	1	parameq	eq
        //   0	114	2	paramString	String
        //   0	114	3	paramBoolean	boolean
        //   3	104	4	localParcel1	Parcel
        //   8	94	5	localParcel2	Parcel
        //   99	13	6	localObject	Object
        //   27	68	7	localIBinder	IBinder
        //   43	12	8	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	99	finally
        //   21	29	99	finally
        //   29	42	99	finally
        //   52	82	99	finally
      }
      
      /* Error */
      public void b(eq parameq, boolean paramBoolean)
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
        //   16: ifnull +65 -> 81
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: iconst_0
        //   34: istore 7
        //   36: iload_2
        //   37: ifeq +6 -> 43
        //   40: iconst_1
        //   41: istore 7
        //   43: aload_3
        //   44: iload 7
        //   46: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   49: aload_0
        //   50: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   53: sipush 6001
        //   56: aload_3
        //   57: aload 4
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 4
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 4
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload_3
        //   77: invokevirtual 50	android/os/Parcel:recycle	()V
        //   80: return
        //   81: aconst_null
        //   82: astore 6
        //   84: goto -57 -> 27
        //   87: astore 5
        //   89: aload 4
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload_3
        //   95: invokevirtual 50	android/os/Parcel:recycle	()V
        //   98: aload 5
        //   100: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	101	0	this	a
        //   0	101	1	parameq	eq
        //   0	101	2	paramBoolean	boolean
        //   3	92	3	localParcel1	Parcel
        //   7	83	4	localParcel2	Parcel
        //   87	12	5	localObject	Object
        //   25	58	6	localIBinder	IBinder
        //   34	11	7	i	int
        // Exception table:
        //   from	to	target	type
        //   9	15	87	finally
        //   19	27	87	finally
        //   27	33	87	finally
        //   43	71	87	finally
      }
      
      public void bT()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5006, localParcel1, localParcel2, 0);
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
      public d bU()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5013
        //   21: aload_1
        //   22: aload_2
        //   23: iconst_0
        //   24: invokeinterface 40 5 0
        //   29: pop
        //   30: aload_2
        //   31: invokevirtual 43	android/os/Parcel:readException	()V
        //   34: aload_2
        //   35: invokevirtual 58	android/os/Parcel:readInt	()I
        //   38: ifeq +27 -> 65
        //   41: getstatic 142	com/google/android/gms/common/data/d:CREATOR	Lcom/google/android/gms/common/data/e;
        //   44: aload_2
        //   45: invokevirtual 148	com/google/android/gms/common/data/e:h	(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;
        //   48: astore 6
        //   50: aload 6
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 50	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 50	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 50	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	locald1	d
        //   48	3	6	locald2	d
        // Exception table:
        //   from	to	target	type
        //   8	50	71	finally
      }
      
      public boolean bV()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5067, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public d bW()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5502
        //   21: aload_1
        //   22: aload_2
        //   23: iconst_0
        //   24: invokeinterface 40 5 0
        //   29: pop
        //   30: aload_2
        //   31: invokevirtual 43	android/os/Parcel:readException	()V
        //   34: aload_2
        //   35: invokevirtual 58	android/os/Parcel:readInt	()I
        //   38: ifeq +27 -> 65
        //   41: getstatic 142	com/google/android/gms/common/data/d:CREATOR	Lcom/google/android/gms/common/data/e;
        //   44: aload_2
        //   45: invokevirtual 148	com/google/android/gms/common/data/e:h	(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;
        //   48: astore 6
        //   50: aload 6
        //   52: astore 5
        //   54: aload_2
        //   55: invokevirtual 50	android/os/Parcel:recycle	()V
        //   58: aload_1
        //   59: invokevirtual 50	android/os/Parcel:recycle	()V
        //   62: aload 5
        //   64: areturn
        //   65: aconst_null
        //   66: astore 5
        //   68: goto -14 -> 54
        //   71: astore_3
        //   72: aload_2
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload_1
        //   77: invokevirtual 50	android/os/Parcel:recycle	()V
        //   80: aload_3
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   3	74	1	localParcel1	Parcel
        //   7	66	2	localParcel2	Parcel
        //   71	10	3	localObject	Object
        //   52	15	5	locald1	d
        //   48	3	6	locald2	d
        // Exception table:
        //   from	to	target	type
        //   8	50	71	finally
      }
      
      /* Error */
      public Bundle ba()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_1
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_2
        //   8: aload_1
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5004
        //   21: aload_1
        //   22: aload_2
        //   23: iconst_0
        //   24: invokeinterface 40 5 0
        //   29: pop
        //   30: aload_2
        //   31: invokevirtual 43	android/os/Parcel:readException	()V
        //   34: aload_2
        //   35: invokevirtual 58	android/os/Parcel:readInt	()I
        //   38: ifeq +28 -> 66
        //   41: getstatic 154	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
        //   44: aload_2
        //   45: invokeinterface 72 2 0
        //   50: checkcast 94	android/os/Bundle
        //   53: astore 5
        //   55: aload_2
        //   56: invokevirtual 50	android/os/Parcel:recycle	()V
        //   59: aload_1
        //   60: invokevirtual 50	android/os/Parcel:recycle	()V
        //   63: aload 5
        //   65: areturn
        //   66: aconst_null
        //   67: astore 5
        //   69: goto -14 -> 55
        //   72: astore_3
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload_1
        //   78: invokevirtual 50	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	83	0	this	a
        //   3	75	1	localParcel1	Parcel
        //   7	67	2	localParcel2	Parcel
        //   72	10	3	localObject	Object
        //   53	15	5	localBundle	Bundle
        // Exception table:
        //   from	to	target	type
        //   8	55	72	finally
      }
      
      /* Error */
      public void c(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5022
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void c(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 9
        //   32: aload 6
        //   34: aload 9
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 6
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: iload_3
        //   46: ifeq +66 -> 112
        //   49: iload 5
        //   51: istore 10
        //   53: aload 6
        //   55: iload 10
        //   57: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   60: iload 4
        //   62: ifeq +56 -> 118
        //   65: aload 6
        //   67: iload 5
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: aload_0
        //   73: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 5048
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 40 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 43	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 50	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore 9
        //   109: goto -77 -> 32
        //   112: iconst_0
        //   113: istore 10
        //   115: goto -62 -> 53
        //   118: iconst_0
        //   119: istore 5
        //   121: goto -56 -> 65
        //   124: astore 8
        //   126: aload 7
        //   128: invokevirtual 50	android/os/Parcel:recycle	()V
        //   131: aload 6
        //   133: invokevirtual 50	android/os/Parcel:recycle	()V
        //   136: aload 8
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	parameq	eq
        //   0	139	2	paramInt	int
        //   0	139	3	paramBoolean1	boolean
        //   0	139	4	paramBoolean2	boolean
        //   1	119	5	i	int
        //   6	126	6	localParcel1	Parcel
        //   11	116	7	localParcel2	Parcel
        //   124	13	8	localObject	Object
        //   30	78	9	localIBinder	IBinder
        //   51	63	10	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	124	finally
        //   24	32	124	finally
        //   32	45	124	finally
        //   53	60	124	finally
        //   65	95	124	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5014
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString1, String paramString2)
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
        //   18: ifnull +64 -> 82
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: aload 4
        //   44: aload_3
        //   45: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   48: aload_0
        //   49: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 5041
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 50	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore 7
        //   85: goto -56 -> 29
        //   88: astore 6
        //   90: aload 5
        //   92: invokevirtual 50	android/os/Parcel:recycle	()V
        //   95: aload 4
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	parameq	eq
        //   0	103	2	paramString1	String
        //   0	103	3	paramString2	String
        //   3	93	4	localParcel1	Parcel
        //   8	83	5	localParcel2	Parcel
        //   88	13	6	localObject	Object
        //   27	57	7	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   10	17	88	finally
        //   21	29	88	finally
        //   29	71	88	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString, boolean paramBoolean)
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
        //   18: ifnull +75 -> 93
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: iconst_0
        //   43: istore 8
        //   45: iload_3
        //   46: ifeq +6 -> 52
        //   49: iconst_1
        //   50: istore 8
        //   52: aload 4
        //   54: iload 8
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload_0
        //   60: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   63: sipush 6504
        //   66: aload 4
        //   68: aload 5
        //   70: iconst_0
        //   71: invokeinterface 40 5 0
        //   76: pop
        //   77: aload 5
        //   79: invokevirtual 43	android/os/Parcel:readException	()V
        //   82: aload 5
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 4
        //   89: invokevirtual 50	android/os/Parcel:recycle	()V
        //   92: return
        //   93: aconst_null
        //   94: astore 7
        //   96: goto -67 -> 29
        //   99: astore 6
        //   101: aload 5
        //   103: invokevirtual 50	android/os/Parcel:recycle	()V
        //   106: aload 4
        //   108: invokevirtual 50	android/os/Parcel:recycle	()V
        //   111: aload 6
        //   113: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	114	0	this	a
        //   0	114	1	parameq	eq
        //   0	114	2	paramString	String
        //   0	114	3	paramBoolean	boolean
        //   3	104	4	localParcel1	Parcel
        //   8	94	5	localParcel2	Parcel
        //   99	13	6	localObject	Object
        //   27	68	7	localIBinder	IBinder
        //   43	12	8	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	99	finally
        //   21	29	99	finally
        //   29	42	99	finally
        //   52	82	99	finally
      }
      
      /* Error */
      public void c(eq parameq, boolean paramBoolean)
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
        //   16: ifnull +65 -> 81
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: iconst_0
        //   34: istore 7
        //   36: iload_2
        //   37: ifeq +6 -> 43
        //   40: iconst_1
        //   41: istore 7
        //   43: aload_3
        //   44: iload 7
        //   46: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   49: aload_0
        //   50: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   53: sipush 6503
        //   56: aload_3
        //   57: aload 4
        //   59: iconst_0
        //   60: invokeinterface 40 5 0
        //   65: pop
        //   66: aload 4
        //   68: invokevirtual 43	android/os/Parcel:readException	()V
        //   71: aload 4
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: aload_3
        //   77: invokevirtual 50	android/os/Parcel:recycle	()V
        //   80: return
        //   81: aconst_null
        //   82: astore 6
        //   84: goto -57 -> 27
        //   87: astore 5
        //   89: aload 4
        //   91: invokevirtual 50	android/os/Parcel:recycle	()V
        //   94: aload_3
        //   95: invokevirtual 50	android/os/Parcel:recycle	()V
        //   98: aload 5
        //   100: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	101	0	this	a
        //   0	101	1	parameq	eq
        //   0	101	2	paramBoolean	boolean
        //   3	92	3	localParcel1	Parcel
        //   7	83	4	localParcel2	Parcel
        //   87	12	5	localObject	Object
        //   25	58	6	localIBinder	IBinder
        //   34	11	7	i	int
        // Exception table:
        //   from	to	target	type
        //   9	15	87	finally
        //   19	27	87	finally
        //   27	33	87	finally
        //   43	71	87	finally
      }
      
      public void clearNotifications(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeInt(paramInt);
          this.dG.transact(5036, localParcel1, localParcel2, 0);
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
      public void d(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5026
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void d(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 9
        //   32: aload 6
        //   34: aload 9
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 6
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: iload_3
        //   46: ifeq +66 -> 112
        //   49: iload 5
        //   51: istore 10
        //   53: aload 6
        //   55: iload 10
        //   57: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   60: iload 4
        //   62: ifeq +56 -> 118
        //   65: aload 6
        //   67: iload 5
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: aload_0
        //   73: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 6003
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 40 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 43	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 50	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore 9
        //   109: goto -77 -> 32
        //   112: iconst_0
        //   113: istore 10
        //   115: goto -62 -> 53
        //   118: iconst_0
        //   119: istore 5
        //   121: goto -56 -> 65
        //   124: astore 8
        //   126: aload 7
        //   128: invokevirtual 50	android/os/Parcel:recycle	()V
        //   131: aload 6
        //   133: invokevirtual 50	android/os/Parcel:recycle	()V
        //   136: aload 8
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	parameq	eq
        //   0	139	2	paramInt	int
        //   0	139	3	paramBoolean1	boolean
        //   0	139	4	paramBoolean2	boolean
        //   1	119	5	i	int
        //   6	126	6	localParcel1	Parcel
        //   11	116	7	localParcel2	Parcel
        //   124	13	8	localObject	Object
        //   30	78	9	localIBinder	IBinder
        //   51	63	10	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	124	finally
        //   24	32	124	finally
        //   32	45	124	finally
        //   53	60	124	finally
        //   65	95	124	finally
      }
      
      /* Error */
      public void d(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5018
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void d(eq parameq, String paramString, boolean paramBoolean)
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
        //   18: ifnull +75 -> 93
        //   21: aload_1
        //   22: invokeinterface 80 1 0
        //   27: astore 7
        //   29: aload 4
        //   31: aload 7
        //   33: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload 4
        //   38: aload_2
        //   39: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   42: iconst_0
        //   43: istore 8
        //   45: iload_3
        //   46: ifeq +6 -> 52
        //   49: iconst_1
        //   50: istore 8
        //   52: aload 4
        //   54: iload 8
        //   56: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   59: aload_0
        //   60: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   63: sipush 6505
        //   66: aload 4
        //   68: aload 5
        //   70: iconst_0
        //   71: invokeinterface 40 5 0
        //   76: pop
        //   77: aload 5
        //   79: invokevirtual 43	android/os/Parcel:readException	()V
        //   82: aload 5
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 4
        //   89: invokevirtual 50	android/os/Parcel:recycle	()V
        //   92: return
        //   93: aconst_null
        //   94: astore 7
        //   96: goto -67 -> 29
        //   99: astore 6
        //   101: aload 5
        //   103: invokevirtual 50	android/os/Parcel:recycle	()V
        //   106: aload 4
        //   108: invokevirtual 50	android/os/Parcel:recycle	()V
        //   111: aload 6
        //   113: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	114	0	this	a
        //   0	114	1	parameq	eq
        //   0	114	2	paramString	String
        //   0	114	3	paramBoolean	boolean
        //   3	104	4	localParcel1	Parcel
        //   8	94	5	localParcel2	Parcel
        //   99	13	6	localObject	Object
        //   27	68	7	localIBinder	IBinder
        //   43	12	8	i	int
        // Exception table:
        //   from	to	target	type
        //   10	17	99	finally
        //   21	29	99	finally
        //   29	42	99	finally
        //   52	82	99	finally
      }
      
      public ParcelFileDescriptor e(Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (paramUri != null)
            {
              localParcel1.writeInt(1);
              paramUri.writeToParcel(localParcel1, 0);
              this.dG.transact(6507, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(localParcel2);
                return localParcelFileDescriptor;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            ParcelFileDescriptor localParcelFileDescriptor = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void e(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5027
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void e(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 80 1 0
        //   30: astore 9
        //   32: aload 6
        //   34: aload 9
        //   36: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload 6
        //   41: iload_2
        //   42: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   45: iload_3
        //   46: ifeq +66 -> 112
        //   49: iload 5
        //   51: istore 10
        //   53: aload 6
        //   55: iload 10
        //   57: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   60: iload 4
        //   62: ifeq +56 -> 118
        //   65: aload 6
        //   67: iload 5
        //   69: invokevirtual 92	android/os/Parcel:writeInt	(I)V
        //   72: aload_0
        //   73: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 6004
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 40 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 43	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 50	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 50	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore 9
        //   109: goto -77 -> 32
        //   112: iconst_0
        //   113: istore 10
        //   115: goto -62 -> 53
        //   118: iconst_0
        //   119: istore 5
        //   121: goto -56 -> 65
        //   124: astore 8
        //   126: aload 7
        //   128: invokevirtual 50	android/os/Parcel:recycle	()V
        //   131: aload 6
        //   133: invokevirtual 50	android/os/Parcel:recycle	()V
        //   136: aload 8
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	parameq	eq
        //   0	139	2	paramInt	int
        //   0	139	3	paramBoolean1	boolean
        //   0	139	4	paramBoolean2	boolean
        //   1	119	5	i	int
        //   6	126	6	localParcel1	Parcel
        //   11	116	7	localParcel2	Parcel
        //   124	13	8	localObject	Object
        //   30	78	9	localIBinder	IBinder
        //   51	63	10	j	int
        // Exception table:
        //   from	to	target	type
        //   13	20	124	finally
        //   24	32	124	finally
        //   32	45	124	finally
        //   53	60	124	finally
        //   65	95	124	finally
      }
      
      /* Error */
      public void e(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5032
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public void f(long paramLong)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeLong(paramLong);
          this.dG.transact(5001, localParcel1, localParcel2, 0);
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
      public void f(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5047
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void f(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5037
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public void f(String paramString1, String paramString2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.dG.transact(5065, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void g(long paramLong)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeLong(paramLong);
          this.dG.transact(5059, localParcel1, localParcel2, 0);
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
      public void g(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5049
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void g(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5042
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public String getAppId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5003, localParcel1, localParcel2, 0);
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
      
      public String getCurrentAccountName()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5007, localParcel1, localParcel2, 0);
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
      
      public String getCurrentPlayerId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5012, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public void h(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5056
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void h(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5043
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void i(eq parameq)
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
        //   15: ifnull +46 -> 61
        //   18: aload_1
        //   19: invokeinterface 80 1 0
        //   24: astore 5
        //   26: aload_2
        //   27: aload 5
        //   29: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   32: aload_0
        //   33: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   36: sipush 5062
        //   39: aload_2
        //   40: aload_3
        //   41: iconst_0
        //   42: invokeinterface 40 5 0
        //   47: pop
        //   48: aload_3
        //   49: invokevirtual 43	android/os/Parcel:readException	()V
        //   52: aload_3
        //   53: invokevirtual 50	android/os/Parcel:recycle	()V
        //   56: aload_2
        //   57: invokevirtual 50	android/os/Parcel:recycle	()V
        //   60: return
        //   61: aconst_null
        //   62: astore 5
        //   64: goto -38 -> 26
        //   67: astore 4
        //   69: aload_3
        //   70: invokevirtual 50	android/os/Parcel:recycle	()V
        //   73: aload_2
        //   74: invokevirtual 50	android/os/Parcel:recycle	()V
        //   77: aload 4
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   0	80	1	parameq	eq
        //   3	71	2	localParcel1	Parcel
        //   7	63	3	localParcel2	Parcel
        //   67	11	4	localObject	Object
        //   24	39	5	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   8	14	67	finally
        //   18	26	67	finally
        //   26	52	67	finally
      }
      
      /* Error */
      public void i(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5052
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public void i(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5029, localParcel1, localParcel2, 0);
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
      public int j(eq parameq, String paramString)
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
        //   16: ifnull +63 -> 79
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5053
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 58	android/os/Parcel:readInt	()I
        //   65: istore 8
        //   67: aload 4
        //   69: invokevirtual 50	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 50	android/os/Parcel:recycle	()V
        //   76: iload 8
        //   78: ireturn
        //   79: aconst_null
        //   80: astore 6
        //   82: goto -55 -> 27
        //   85: astore 5
        //   87: aload 4
        //   89: invokevirtual 50	android/os/Parcel:recycle	()V
        //   92: aload_3
        //   93: invokevirtual 50	android/os/Parcel:recycle	()V
        //   96: aload 5
        //   98: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	99	0	this	a
        //   0	99	1	parameq	eq
        //   0	99	2	paramString	String
        //   3	90	3	localParcel1	Parcel
        //   7	81	4	localParcel2	Parcel
        //   85	12	5	localObject	Object
        //   25	56	6	localIBinder	IBinder
        //   65	12	8	i	int
        // Exception table:
        //   from	to	target	type
        //   9	15	85	finally
        //   19	27	85	finally
        //   27	67	85	finally
      }
      
      public void j(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5028, localParcel1, localParcel2, 0);
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
      public void k(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5061
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public void k(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5055, localParcel1, localParcel2, 0);
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
      public void l(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 5057
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      /* Error */
      public void m(eq parameq, String paramString)
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
        //   16: ifnull +54 -> 70
        //   19: aload_1
        //   20: invokeinterface 80 1 0
        //   25: astore 6
        //   27: aload_3
        //   28: aload 6
        //   30: invokevirtual 83	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   33: aload_3
        //   34: aload_2
        //   35: invokevirtual 34	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 15	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   42: sipush 7001
        //   45: aload_3
        //   46: aload 4
        //   48: iconst_0
        //   49: invokeinterface 40 5 0
        //   54: pop
        //   55: aload 4
        //   57: invokevirtual 43	android/os/Parcel:readException	()V
        //   60: aload 4
        //   62: invokevirtual 50	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 50	android/os/Parcel:recycle	()V
        //   69: return
        //   70: aconst_null
        //   71: astore 6
        //   73: goto -46 -> 27
        //   76: astore 5
        //   78: aload 4
        //   80: invokevirtual 50	android/os/Parcel:recycle	()V
        //   83: aload_3
        //   84: invokevirtual 50	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	parameq	eq
        //   0	90	2	paramString	String
        //   3	81	3	localParcel1	Parcel
        //   7	72	4	localParcel2	Parcel
        //   76	12	5	localObject	Object
        //   25	47	6	localIBinder	IBinder
        // Exception table:
        //   from	to	target	type
        //   9	15	76	finally
        //   19	27	76	finally
        //   27	60	76	finally
      }
      
      public void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          int i = 0;
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.dG.transact(5068, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.er
 * JD-Core Version:    0.7.0.1
 */