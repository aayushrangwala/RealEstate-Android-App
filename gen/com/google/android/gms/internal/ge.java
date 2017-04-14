package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ge
  implements Parcelable.Creator<fv.g>
{
  static void a(fv.g paramg, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramg.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramg.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramg.isPrimary());
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.a(paramParcel, 3, paramg.getValue(), true);
    }
    b.C(paramParcel, i);
  }
  
  public fv.g L(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    String str = null;
    int j = 0;
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
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        bool = a.c(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        str = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fv.g(localHashSet, j, bool, str);
  }
  
  public fv.g[] aq(int paramInt)
  {
    return new fv.g[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ge
 * JD-Core Version:    0.7.0.1
 */