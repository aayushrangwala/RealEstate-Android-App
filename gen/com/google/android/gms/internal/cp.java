package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class cp
  implements Parcelable.Creator<co>
{
  static void a(co paramco, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramco.versionCode);
    b.a(paramParcel, 2, paramco.hP, false);
    b.c(paramParcel, 3, paramco.hQ);
    b.c(paramParcel, 4, paramco.hR);
    b.a(paramParcel, 5, paramco.hS);
    b.C(paramParcel, i);
  }
  
  public co g(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.j(paramParcel);
    String str = null;
    int j = 0;
    int k = 0;
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
        m = a.f(paramParcel, n);
        break;
      case 2: 
        str = a.l(paramParcel, n);
        break;
      case 3: 
        k = a.f(paramParcel, n);
        break;
      case 4: 
        j = a.f(paramParcel, n);
        break;
      case 5: 
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new co(m, str, k, j, bool);
  }
  
  public co[] l(int paramInt)
  {
    return new co[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cp
 * JD-Core Version:    0.7.0.1
 */