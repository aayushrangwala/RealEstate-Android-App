package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ed
  implements Parcelable.Creator<ec>
{
  static void a(ec paramec, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramec.getVersionCode());
    b.a(paramParcel, 2, paramec.bH(), false);
    b.a(paramParcel, 3, paramec.bI(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public ec[] G(int paramInt)
  {
    return new ec[paramInt];
  }
  
  public ec s(Parcel paramParcel)
  {
    dz localdz = null;
    int i = a.j(paramParcel);
    int j = 0;
    Parcel localParcel = null;
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
        localParcel = a.y(paramParcel, k);
        break;
      case 3: 
        localdz = (dz)a.a(paramParcel, k, dz.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new ec(j, localParcel, localdz);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ed
 * JD-Core Version:    0.7.0.1
 */