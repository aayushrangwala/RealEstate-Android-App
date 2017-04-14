package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y
  implements Parcelable.Creator<x>
{
  static void a(x paramx, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramx.versionCode);
    b.a(paramParcel, 2, paramx.ew, false);
    b.c(paramParcel, 3, paramx.height);
    b.c(paramParcel, 4, paramx.heightPixels);
    b.a(paramParcel, 5, paramx.ex);
    b.c(paramParcel, 6, paramx.width);
    b.c(paramParcel, 7, paramx.widthPixels);
    b.C(paramParcel, i);
  }
  
  public x b(Parcel paramParcel)
  {
    int i = 0;
    int j = a.j(paramParcel);
    String str = null;
    int k = 0;
    boolean bool = false;
    int m = 0;
    int n = 0;
    int i1 = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i2 = a.i(paramParcel);
      switch (a.y(i2))
      {
      default: 
        a.b(paramParcel, i2);
        break;
      case 1: 
        i1 = a.f(paramParcel, i2);
        break;
      case 2: 
        str = a.l(paramParcel, i2);
        break;
      case 3: 
        n = a.f(paramParcel, i2);
        break;
      case 4: 
        m = a.f(paramParcel, i2);
        break;
      case 5: 
        bool = a.c(paramParcel, i2);
        break;
      case 6: 
        k = a.f(paramParcel, i2);
        break;
      case 7: 
        i = a.f(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new x(i1, str, n, m, bool, k, i);
  }
  
  public x[] c(int paramInt)
  {
    return new x[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.y
 * JD-Core Version:    0.7.0.1
 */