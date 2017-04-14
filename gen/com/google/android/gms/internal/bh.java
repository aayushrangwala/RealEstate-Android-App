package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.b.a;
import com.google.android.gms.dynamic.c;

public final class bh
  implements SafeParcelable
{
  public static final bg CREATOR = new bg();
  public final co eg;
  public final be fR;
  public final q fS;
  public final bi fT;
  public final cq fU;
  public final ag fV;
  public final String fW;
  public final boolean fX;
  public final String fY;
  public final bl fZ;
  public final String fz;
  public final int ga;
  public final int orientation;
  public final int versionCode;
  
  bh(int paramInt1, be parambe, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt2, int paramInt3, String paramString3, co paramco)
  {
    this.versionCode = paramInt1;
    this.fR = parambe;
    this.fS = ((q)c.b(b.a.z(paramIBinder1)));
    this.fT = ((bi)c.b(b.a.z(paramIBinder2)));
    this.fU = ((cq)c.b(b.a.z(paramIBinder3)));
    this.fV = ((ag)c.b(b.a.z(paramIBinder4)));
    this.fW = paramString1;
    this.fX = paramBoolean;
    this.fY = paramString2;
    this.fZ = ((bl)c.b(b.a.z(paramIBinder5)));
    this.orientation = paramInt2;
    this.ga = paramInt3;
    this.fz = paramString3;
    this.eg = paramco;
  }
  
  public bh(be parambe, q paramq, bi parambi, bl parambl, co paramco)
  {
    this.versionCode = 1;
    this.fR = parambe;
    this.fS = paramq;
    this.fT = parambi;
    this.fU = null;
    this.fV = null;
    this.fW = null;
    this.fX = false;
    this.fY = null;
    this.fZ = parambl;
    this.orientation = -1;
    this.ga = 4;
    this.fz = null;
    this.eg = paramco;
  }
  
  public bh(q paramq, bi parambi, ag paramag, bl parambl, cq paramcq, boolean paramBoolean, int paramInt, String paramString, co paramco)
  {
    this.versionCode = 1;
    this.fR = null;
    this.fS = paramq;
    this.fT = parambi;
    this.fU = paramcq;
    this.fV = paramag;
    this.fW = null;
    this.fX = paramBoolean;
    this.fY = null;
    this.fZ = parambl;
    this.orientation = paramInt;
    this.ga = 3;
    this.fz = paramString;
    this.eg = paramco;
  }
  
  public bh(q paramq, bi parambi, ag paramag, bl parambl, cq paramcq, boolean paramBoolean, int paramInt, String paramString1, String paramString2, co paramco)
  {
    this.versionCode = 1;
    this.fR = null;
    this.fS = paramq;
    this.fT = parambi;
    this.fU = paramcq;
    this.fV = paramag;
    this.fW = paramString2;
    this.fX = paramBoolean;
    this.fY = paramString1;
    this.fZ = parambl;
    this.orientation = paramInt;
    this.ga = 3;
    this.fz = null;
    this.eg = paramco;
  }
  
  public bh(q paramq, bi parambi, bl parambl, cq paramcq, int paramInt, co paramco)
  {
    this.versionCode = 1;
    this.fR = null;
    this.fS = paramq;
    this.fT = parambi;
    this.fU = paramcq;
    this.fV = null;
    this.fW = null;
    this.fX = false;
    this.fY = null;
    this.fZ = parambl;
    this.orientation = paramInt;
    this.ga = 1;
    this.fz = null;
    this.eg = paramco;
  }
  
  public bh(q paramq, bi parambi, bl parambl, cq paramcq, boolean paramBoolean, int paramInt, co paramco)
  {
    this.versionCode = 1;
    this.fR = null;
    this.fS = paramq;
    this.fT = parambi;
    this.fU = paramcq;
    this.fV = null;
    this.fW = null;
    this.fX = paramBoolean;
    this.fY = null;
    this.fZ = parambl;
    this.orientation = paramInt;
    this.ga = 2;
    this.fz = null;
    this.eg = paramco;
  }
  
  public static bh a(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      localBundle.setClassLoader(bh.class.getClassLoader());
      bh localbh = (bh)localBundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return localbh;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void a(Intent paramIntent, bh parambh)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", parambh);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  IBinder U()
  {
    return c.g(this.fS).asBinder();
  }
  
  IBinder V()
  {
    return c.g(this.fT).asBinder();
  }
  
  IBinder W()
  {
    return c.g(this.fU).asBinder();
  }
  
  IBinder X()
  {
    return c.g(this.fV).asBinder();
  }
  
  IBinder Y()
  {
    return c.g(this.fZ).asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bg.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bh
 * JD-Core Version:    0.7.0.1
 */