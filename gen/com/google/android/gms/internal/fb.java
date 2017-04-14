package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fb
  implements Parcelable.Creator<fa>
{
  static void a(fa paramfa, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.a(paramParcel, 1, paramfa.getRequestId(), false);
    b.c(paramParcel, 1000, paramfa.getVersionCode());
    b.a(paramParcel, 2, paramfa.getExpirationTime());
    b.a(paramParcel, 3, paramfa.co());
    b.a(paramParcel, 4, paramfa.getLatitude());
    b.a(paramParcel, 5, paramfa.getLongitude());
    b.a(paramParcel, 6, paramfa.cp());
    b.c(paramParcel, 7, paramfa.cq());
    b.c(paramParcel, 8, paramfa.getNotificationResponsiveness());
    b.c(paramParcel, 9, paramfa.cr());
    b.C(paramParcel, i);
  }
  
  public fa[] ac(int paramInt)
  {
    return new fa[paramInt];
  }
  
  public fa z(Parcel paramParcel)
  {
    int i = a.j(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    short s = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    float f = 0.0F;
    long l = 0L;
    int m = 0;
    int n = -1;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = a.i(paramParcel);
      switch (a.y(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str = a.l(paramParcel, i1);
        break;
      case 1000: 
        j = a.f(paramParcel, i1);
        break;
      case 2: 
        l = a.g(paramParcel, i1);
        break;
      case 3: 
        s = a.e(paramParcel, i1);
        break;
      case 4: 
        d1 = a.j(paramParcel, i1);
        break;
      case 5: 
        d2 = a.j(paramParcel, i1);
        break;
      case 6: 
        f = a.i(paramParcel, i1);
        break;
      case 7: 
        k = a.f(paramParcel, i1);
        break;
      case 8: 
        m = a.f(paramParcel, i1);
        break;
      case 9: 
        n = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fa(j, str, k, s, d1, d2, f, l, m, n);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fb
 * JD-Core Version:    0.7.0.1
 */