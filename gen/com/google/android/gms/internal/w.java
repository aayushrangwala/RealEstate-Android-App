package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class w
  implements Parcelable.Creator<v>
{
  static void a(v paramv, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramv.versionCode);
    b.a(paramParcel, 2, paramv.es);
    b.a(paramParcel, 3, paramv.extras, false);
    b.c(paramParcel, 4, paramv.et);
    b.a(paramParcel, 5, paramv.eu, false);
    b.a(paramParcel, 6, paramv.ev);
    b.c(paramParcel, 7, paramv.tagForChildDirectedTreatment);
    b.C(paramParcel, i);
  }
  
  public v a(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int i = 0;
    int j = a.j(paramParcel);
    long l = 0L;
    boolean bool = false;
    int k = 0;
    Bundle localBundle = null;
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
        break;
      case 2: 
        l = a.g(paramParcel, n);
        break;
      case 3: 
        localBundle = a.n(paramParcel, n);
        break;
      case 4: 
        k = a.f(paramParcel, n);
        break;
      case 5: 
        localArrayList = a.x(paramParcel, n);
        break;
      case 6: 
        bool = a.c(paramParcel, n);
        break;
      case 7: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new v(m, l, localBundle, k, localArrayList, bool, i);
  }
  
  public v[] b(int paramInt)
  {
    return new v[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.w
 * JD-Core Version:    0.7.0.1
 */