package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class fx
  implements Parcelable.Creator<fv.a>
{
  static void a(fv.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = parama.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, parama.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.c(paramParcel, 2, parama.getMax());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.c(paramParcel, 3, parama.getMin());
    }
    b.C(paramParcel, i);
  }
  
  public fv.a E(Parcel paramParcel)
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
    return new fv.a(localHashSet, m, k, i);
  }
  
  public fv.a[] aj(int paramInt)
  {
    return new fv.a[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fx
 * JD-Core Version:    0.7.0.1
 */