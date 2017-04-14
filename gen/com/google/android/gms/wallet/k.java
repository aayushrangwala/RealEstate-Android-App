package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<ProxyCard>
{
  static void a(ProxyCard paramProxyCard, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramProxyCard.getVersionCode());
    b.a(paramParcel, 2, paramProxyCard.um, false);
    b.a(paramParcel, 3, paramProxyCard.un, false);
    b.c(paramParcel, 4, paramProxyCard.uo);
    b.c(paramParcel, 5, paramProxyCard.up);
    b.C(paramParcel, i);
  }
  
  public ProxyCard X(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.j(paramParcel);
    int k = 0;
    String str2 = null;
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
        str2 = a.l(paramParcel, n);
        break;
      case 3: 
        str1 = a.l(paramParcel, n);
        break;
      case 4: 
        k = a.f(paramParcel, n);
        break;
      case 5: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new ProxyCard(m, str2, str1, k, i);
  }
  
  public ProxyCard[] aC(int paramInt)
  {
    return new ProxyCard[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.k
 * JD-Core Version:    0.7.0.1
 */