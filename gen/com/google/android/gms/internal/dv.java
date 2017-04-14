package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dv
  implements Parcelable.Creator<dt.a>
{
  static void a(dt.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parama.versionCode);
    b.a(paramParcel, 2, parama.lx, false);
    b.c(paramParcel, 3, parama.ly);
    b.C(paramParcel, i);
  }
  
  public dt.a[] B(int paramInt)
  {
    return new dt.a[paramInt];
  }
  
  public dt.a n(Parcel paramParcel)
  {
    int i = 0;
    int j = a.j(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.i(paramParcel);
      switch (a.y(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        str = a.l(paramParcel, m);
        break;
      case 3: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new dt.a(k, str, i);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dv
 * JD-Core Version:    0.7.0.1
 */