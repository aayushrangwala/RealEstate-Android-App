package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class du
  implements Parcelable.Creator<dt>
{
  static void a(dt paramdt, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramdt.getVersionCode());
    b.b(paramParcel, 2, paramdt.bm(), false);
    b.C(paramParcel, i);
  }
  
  public dt[] A(int paramInt)
  {
    return new dt[paramInt];
  }
  
  public dt m(Parcel paramParcel)
  {
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
        localArrayList = a.c(paramParcel, k, dt.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new dt(j, localArrayList);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.du
 * JD-Core Version:    0.7.0.1
 */