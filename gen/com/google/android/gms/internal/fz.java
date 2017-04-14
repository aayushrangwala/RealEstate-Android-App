package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class fz
  implements Parcelable.Creator<fv.b.a>
{
  static void a(fv.b.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = parama.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, parama.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.c(paramParcel, 2, parama.getLeftImageOffset());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.c(paramParcel, 3, parama.getTopImageOffset());
    }
    b.C(paramParcel, i);
  }
  
  public fv.b.a G(Parcel paramParcel)
  {
    int i = 0;
    int j = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        k = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        i = a.f(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new fv.b.a(localHashSet, m, k, i);
  }
  
  public fv.b.a[] al(int paramInt)
  {
    return new fv.b.a[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fz
 * JD-Core Version:    0.7.0.1
 */