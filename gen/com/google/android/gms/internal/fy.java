package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class fy
  implements Parcelable.Creator<fv.b>
{
  static void a(fv.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramb.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramb.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramb.dM(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.a(paramParcel, 3, paramb.dN(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      b.c(paramParcel, 4, paramb.getLayout());
    }
    b.C(paramParcel, i);
  }
  
  public fv.b F(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    Object localObject2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.i(paramParcel);
      switch (a.y(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        k = a.f(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        fv.b.a locala = (fv.b.a)a.a(paramParcel, m, fv.b.a.CREATOR);
        localHashSet.add(Integer.valueOf(2));
        localObject2 = locala;
        break;
      case 3: 
        fv.b.b localb = (fv.b.b)a.a(paramParcel, m, fv.b.b.CREATOR);
        localHashSet.add(Integer.valueOf(3));
        localObject1 = localb;
        break;
      case 4: 
        i = a.f(paramParcel, m);
        localHashSet.add(Integer.valueOf(4));
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new fv.b(localHashSet, k, localObject2, localObject1, i);
  }
  
  public fv.b[] ak(int paramInt)
  {
    return new fv.b[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fy
 * JD-Core Version:    0.7.0.1
 */