package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ft
  implements Parcelable.Creator<fs>
{
  static void a(fs paramfs, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramfs.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramfs.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramfs.getId(), true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      b.a(paramParcel, 4, paramfs.dz(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      b.a(paramParcel, 5, paramfs.getStartDate(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      b.a(paramParcel, 6, paramfs.dA(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      b.a(paramParcel, 7, paramfs.getType(), true);
    }
    b.C(paramParcel, i);
  }
  
  public fs C(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2 = null;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.i(paramParcel);
      switch (a.y(k))
      {
      case 3: 
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str3 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 4: 
        fq localfq2 = (fq)a.a(paramParcel, k, fq.CREATOR);
        localHashSet.add(Integer.valueOf(4));
        localObject2 = localfq2;
        break;
      case 5: 
        str2 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        fq localfq1 = (fq)a.a(paramParcel, k, fq.CREATOR);
        localHashSet.add(Integer.valueOf(6));
        localObject1 = localfq1;
        break;
      case 7: 
        str1 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fs(localHashSet, j, str3, localObject2, str2, localObject1, str1);
  }
  
  public fs[] ah(int paramInt)
  {
    return new fs[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ft
 * JD-Core Version:    0.7.0.1
 */