package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ea
  implements Parcelable.Creator<dz>
{
  static void a(dz paramdz, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramdz.getVersionCode());
    b.b(paramParcel, 2, paramdz.bE(), false);
    b.a(paramParcel, 3, paramdz.bF(), false);
    b.C(paramParcel, i);
  }
  
  public dz[] E(int paramInt)
  {
    return new dz[paramInt];
  }
  
  public dz q(Parcel paramParcel)
  {
    String str = null;
    int i = a.j(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, dz.a.CREATOR);
        break;
      case 3: 
        str = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new dz(j, localArrayList, str);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ea
 * JD-Core Version:    0.7.0.1
 */