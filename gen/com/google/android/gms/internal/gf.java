package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class gf
  implements Parcelable.Creator<fv.h>
{
  static void a(fv.h paramh, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramh.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramh.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.c(paramParcel, 3, paramh.dV());
    }
    if (localSet.contains(Integer.valueOf(4))) {
      b.a(paramParcel, 4, paramh.getValue(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      b.a(paramParcel, 5, paramh.getLabel(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      b.c(paramParcel, 6, paramh.getType());
    }
    b.C(paramParcel, i);
  }
  
  public fv.h M(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
    String str2 = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      case 2: 
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 3: 
        i = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        str1 = a.l(paramParcel, n);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str2 = a.l(paramParcel, n);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        k = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(6));
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new fv.h(localHashSet, m, str2, k, str1, i);
  }
  
  public fv.h[] ar(int paramInt)
  {
    return new fv.h[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gf
 * JD-Core Version:    0.7.0.1
 */