package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dx
  implements Parcelable.Creator<dw.a>
{
  static void a(dw.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, parama.getVersionCode());
    b.c(paramParcel, 2, parama.bn());
    b.a(paramParcel, 3, parama.bt());
    b.c(paramParcel, 4, parama.bo());
    b.a(paramParcel, 5, parama.bu());
    b.a(paramParcel, 6, parama.bv(), false);
    b.c(paramParcel, 7, parama.bw());
    b.a(paramParcel, 8, parama.by(), false);
    b.a(paramParcel, 9, parama.bA(), paramInt, false);
    b.C(paramParcel, i);
  }
  
  public dw.a[] C(int paramInt)
  {
    return new dw.a[paramInt];
  }
  
  public dw.a o(Parcel paramParcel)
  {
    dr localdr = null;
    int i = 0;
    int j = a.j(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = a.i(paramParcel);
      switch (a.y(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        n = a.f(paramParcel, i1);
        break;
      case 2: 
        m = a.f(paramParcel, i1);
        break;
      case 3: 
        bool2 = a.c(paramParcel, i1);
        break;
      case 4: 
        k = a.f(paramParcel, i1);
        break;
      case 5: 
        bool1 = a.c(paramParcel, i1);
        break;
      case 6: 
        str2 = a.l(paramParcel, i1);
        break;
      case 7: 
        i = a.f(paramParcel, i1);
        break;
      case 8: 
        str1 = a.l(paramParcel, i1);
        break;
      case 9: 
        localdr = (dr)a.a(paramParcel, i1, dr.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new dw.a(n, m, bool2, k, bool1, str2, i, str1, localdr);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dx
 * JD-Core Version:    0.7.0.1
 */