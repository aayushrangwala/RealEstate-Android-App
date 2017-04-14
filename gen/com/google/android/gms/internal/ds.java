package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ds
  implements Parcelable.Creator<dr>
{
  static void a(dr paramdr, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramdr.getVersionCode());
    b.a(paramParcel, 2, paramdr.bk(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public dr l(Parcel paramParcel)
  {
    int i = a.j(paramParcel);
    int j = 0;
    dt localdt = null;
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
        localdt = (dt)a.a(paramParcel, k, dt.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new dr(j, localdt);
  }
  
  public dr[] z(int paramInt)
  {
    return new dr[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ds
 * JD-Core Version:    0.7.0.1
 */