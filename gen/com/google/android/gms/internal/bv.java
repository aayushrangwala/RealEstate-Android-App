package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bv
  implements Parcelable.Creator<bu>
{
  static void a(bu parambu, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parambu.versionCode);
    b.a(paramParcel, 2, parambu.gA, false);
    b.a(paramParcel, 3, parambu.gB, paramInt, false);
    b.a(paramParcel, 4, parambu.ed, paramInt, false);
    b.a(paramParcel, 5, parambu.adUnitId, false);
    b.a(paramParcel, 6, parambu.applicationInfo, paramInt, false);
    b.a(paramParcel, 7, parambu.gC, paramInt, false);
    b.a(paramParcel, 8, parambu.gD, false);
    b.a(paramParcel, 9, parambu.gE, false);
    b.a(paramParcel, 10, parambu.gF, false);
    b.a(paramParcel, 11, parambu.eg, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public bu e(Parcel paramParcel)
  {
    co localco = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    PackageInfo localPackageInfo = null;
    ApplicationInfo localApplicationInfo = null;
    String str4 = null;
    x localx = null;
    v localv = null;
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.i(paramParcel);
      switch (a.y(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        localBundle = a.n(paramParcel, k);
        break;
      case 3: 
        localv = (v)a.a(paramParcel, k, v.CREATOR);
        break;
      case 4: 
        localx = (x)a.a(paramParcel, k, x.CREATOR);
        break;
      case 5: 
        str4 = a.l(paramParcel, k);
        break;
      case 6: 
        localApplicationInfo = (ApplicationInfo)a.a(paramParcel, k, ApplicationInfo.CREATOR);
        break;
      case 7: 
        localPackageInfo = (PackageInfo)a.a(paramParcel, k, PackageInfo.CREATOR);
        break;
      case 8: 
        str3 = a.l(paramParcel, k);
        break;
      case 9: 
        str2 = a.l(paramParcel, k);
        break;
      case 10: 
        str1 = a.l(paramParcel, k);
        break;
      case 11: 
        localco = (co)a.a(paramParcel, k, co.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new bu(j, localBundle, localv, localx, str4, localApplicationInfo, localPackageInfo, str3, str2, str1, localco);
  }
  
  public bu[] i(int paramInt)
  {
    return new bu[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bv
 * JD-Core Version:    0.7.0.1
 */