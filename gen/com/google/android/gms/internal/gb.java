package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class gb
  implements Parcelable.Creator<fv.c>
{
  static void a(fv.c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramc.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramc.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramc.getUrl(), true);
    }
    b.C(paramParcel, i);
  }
  
  public fv.c I(Parcel paramParcel)
  {
    int i = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
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
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fv.c(localHashSet, j, str);
  }
  
  public fv.c[] an(int paramInt)
  {
    return new fv.c[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gb
 * JD-Core Version:    0.7.0.1
 */