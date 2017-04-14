package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class bx
  implements Parcelable.Creator<bw>
{
  static void a(bw parambw, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parambw.versionCode);
    b.a(paramParcel, 2, parambw.fW, false);
    b.a(paramParcel, 3, parambw.gG, false);
    b.a(paramParcel, 4, parambw.eW, false);
    b.c(paramParcel, 5, parambw.errorCode);
    b.a(paramParcel, 6, parambw.eX, false);
    b.a(paramParcel, 7, parambw.gH);
    b.a(paramParcel, 8, parambw.gI);
    b.a(paramParcel, 9, parambw.gJ);
    b.a(paramParcel, 10, parambw.gK, false);
    b.a(paramParcel, 11, parambw.fa);
    b.c(paramParcel, 12, parambw.orientation);
    b.C(paramParcel, i);
  }
  
  public bw f(Parcel paramParcel)
  {
    int i = a.j(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList1 = null;
    int k = 0;
    ArrayList localArrayList2 = null;
    long l1 = 0L;
    boolean bool = false;
    long l2 = 0L;
    ArrayList localArrayList3 = null;
    long l3 = 0L;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.f(paramParcel, n);
        break;
      case 2: 
        str1 = a.l(paramParcel, n);
        break;
      case 3: 
        str2 = a.l(paramParcel, n);
        break;
      case 4: 
        localArrayList1 = a.x(paramParcel, n);
        break;
      case 5: 
        k = a.f(paramParcel, n);
        break;
      case 6: 
        localArrayList2 = a.x(paramParcel, n);
        break;
      case 7: 
        l1 = a.g(paramParcel, n);
        break;
      case 8: 
        bool = a.c(paramParcel, n);
        break;
      case 9: 
        l2 = a.g(paramParcel, n);
        break;
      case 10: 
        localArrayList3 = a.x(paramParcel, n);
        break;
      case 11: 
        l3 = a.g(paramParcel, n);
        break;
      case 12: 
        m = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new bw(j, str1, str2, localArrayList1, k, localArrayList2, l1, bool, l2, localArrayList3, l3, m);
  }
  
  public bw[] j(int paramInt)
  {
    return new bw[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bx
 * JD-Core Version:    0.7.0.1
 */