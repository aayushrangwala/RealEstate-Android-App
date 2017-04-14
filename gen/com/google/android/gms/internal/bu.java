package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class bu
  implements SafeParcelable
{
  public static final bv CREATOR = new bv();
  public final String adUnitId;
  public final ApplicationInfo applicationInfo;
  public final x ed;
  public final co eg;
  public final Bundle gA;
  public final v gB;
  public final PackageInfo gC;
  public final String gD;
  public final String gE;
  public final String gF;
  public final int versionCode;
  
  bu(int paramInt, Bundle paramBundle, v paramv, x paramx, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, co paramco)
  {
    this.versionCode = paramInt;
    this.gA = paramBundle;
    this.gB = paramv;
    this.ed = paramx;
    this.adUnitId = paramString1;
    this.applicationInfo = paramApplicationInfo;
    this.gC = paramPackageInfo;
    this.gD = paramString2;
    this.gE = paramString3;
    this.gF = paramString4;
    this.eg = paramco;
  }
  
  public bu(Bundle paramBundle, v paramv, x paramx, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, co paramco)
  {
    this(1, paramBundle, paramv, paramx, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramco);
  }
  
  public bu(a parama, String paramString)
  {
    this(parama.gA, parama.gB, parama.ed, parama.adUnitId, parama.applicationInfo, parama.gC, paramString, parama.gE, parama.gF, parama.eg);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bv.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    public final String adUnitId;
    public final ApplicationInfo applicationInfo;
    public final x ed;
    public final co eg;
    public final Bundle gA;
    public final v gB;
    public final PackageInfo gC;
    public final String gE;
    public final String gF;
    
    public a(Bundle paramBundle, v paramv, x paramx, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, co paramco)
    {
      this.gA = paramBundle;
      this.gB = paramv;
      this.ed = paramx;
      this.adUnitId = paramString1;
      this.applicationInfo = paramApplicationInfo;
      this.gC = paramPackageInfo;
      this.gE = paramString2;
      this.gF = paramString3;
      this.eg = paramco;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bu
 * JD-Core Version:    0.7.0.1
 */