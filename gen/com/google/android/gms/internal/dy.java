package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dy
  implements Parcelable.Creator<dz.b>
{
  static void a(dz.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramb.versionCode);
    b.a(paramParcel, 2, paramb.lN, false);
    b.a(paramParcel, 3, paramb.lO, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public dz.b[] D(int paramInt)
  {
    return new dz.b[paramInt];
  }
  
  public dz.b p(Parcel paramParcel)
  {
    dw.a locala = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str = null;
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
        str = a.l(paramParcel, k);
        break;
      case 3: 
        locala = (dw.a)a.a(paramParcel, k, dw.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new dz.b(j, str, locala);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dy
 * JD-Core Version:    0.7.0.1
 */