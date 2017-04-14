package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<FullWallet>
{
  static void a(FullWallet paramFullWallet, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramFullWallet.getVersionCode());
    b.a(paramParcel, 2, paramFullWallet.tH, false);
    b.a(paramParcel, 3, paramFullWallet.tI, false);
    b.a(paramParcel, 4, paramFullWallet.tJ, paramInt, false);
    b.a(paramParcel, 5, paramFullWallet.tK, false);
    b.a(paramParcel, 6, paramFullWallet.tL, paramInt, false);
    b.a(paramParcel, 7, paramFullWallet.tM, paramInt, false);
    b.a(paramParcel, 8, paramFullWallet.tN, false);
    b.C(paramParcel, i);
  }
  
  public FullWallet P(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    int i = a.j(paramParcel);
    int j = 0;
    Address localAddress1 = null;
    Address localAddress2 = null;
    String str1 = null;
    ProxyCard localProxyCard = null;
    String str2 = null;
    String str3 = null;
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
        break;
      case 2: 
        str3 = a.l(paramParcel, k);
        break;
      case 3: 
        str2 = a.l(paramParcel, k);
        break;
      case 4: 
        localProxyCard = (ProxyCard)a.a(paramParcel, k, ProxyCard.CREATOR);
        break;
      case 5: 
        str1 = a.l(paramParcel, k);
        break;
      case 6: 
        localAddress2 = (Address)a.a(paramParcel, k, Address.CREATOR);
        break;
      case 7: 
        localAddress1 = (Address)a.a(paramParcel, k, Address.CREATOR);
        break;
      case 8: 
        arrayOfString = a.w(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new FullWallet(j, str3, str2, localProxyCard, str1, localAddress2, localAddress1, arrayOfString);
  }
  
  public FullWallet[] au(int paramInt)
  {
    return new FullWallet[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.c
 * JD-Core Version:    0.7.0.1
 */