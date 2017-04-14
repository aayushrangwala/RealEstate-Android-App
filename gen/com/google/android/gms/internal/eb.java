package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class eb
  implements Parcelable.Creator<dz.a>
{
  static void a(dz.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parama.versionCode);
    b.a(paramParcel, 2, parama.className, false);
    b.b(paramParcel, 3, parama.lM, false);
    b.C(paramParcel, i);
  }
  
  public dz.a[] F(int paramInt)
  {
    return new dz.a[paramInt];
  }
  
  public dz.a r(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, dz.b.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new dz.a(j, str, localArrayList);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eb
 * JD-Core Version:    0.7.0.1
 */