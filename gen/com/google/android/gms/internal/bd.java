package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class bd
  implements Parcelable.Creator<be>
{
  static void a(be parambe, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parambe.versionCode);
    b.a(paramParcel, 2, parambe.fy, false);
    b.a(paramParcel, 3, parambe.fz, false);
    b.a(paramParcel, 4, parambe.mimeType, false);
    b.a(paramParcel, 5, parambe.packageName, false);
    b.a(paramParcel, 6, parambe.fA, false);
    b.a(paramParcel, 7, parambe.fB, false);
    b.a(paramParcel, 8, parambe.fC, false);
    b.C(paramParcel, i);
  }
  
  public be c(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
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
        str7 = a.l(paramParcel, k);
        break;
      case 3: 
        str6 = a.l(paramParcel, k);
        break;
      case 4: 
        str5 = a.l(paramParcel, k);
        break;
      case 5: 
        str4 = a.l(paramParcel, k);
        break;
      case 6: 
        str3 = a.l(paramParcel, k);
        break;
      case 7: 
        str2 = a.l(paramParcel, k);
        break;
      case 8: 
        str1 = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new be(j, str7, str6, str5, str4, str3, str2, str1);
  }
  
  public be[] g(int paramInt)
  {
    return new be[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bd
 * JD-Core Version:    0.7.0.1
 */