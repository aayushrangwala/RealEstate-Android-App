package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class gc
  implements Parcelable.Creator<fv.d>
{
  static void a(fv.d paramd, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramd.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramd.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramd.getFamilyName(), true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.a(paramParcel, 3, paramd.getFormatted(), true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      b.a(paramParcel, 4, paramd.getGivenName(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      b.a(paramParcel, 5, paramd.getHonorificPrefix(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      b.a(paramParcel, 6, paramd.getHonorificSuffix(), true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      b.a(paramParcel, 7, paramd.getMiddleName(), true);
    }
    b.C(paramParcel, i);
  }
  
  public fv.d J(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
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
        str6 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        str5 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        str4 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str3 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        str2 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        str1 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fv.d(localHashSet, j, str6, str5, str4, str3, str2, str1);
  }
  
  public fv.d[] ao(int paramInt)
  {
    return new fv.d[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gc
 * JD-Core Version:    0.7.0.1
 */