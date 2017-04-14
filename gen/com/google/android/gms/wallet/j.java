package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j
  implements Parcelable.Creator<OfferWalletObject>
{
  static void a(OfferWalletObject paramOfferWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramOfferWalletObject.getVersionCode());
    b.a(paramParcel, 2, paramOfferWalletObject.tU, false);
    b.a(paramParcel, 3, paramOfferWalletObject.ul, false);
    b.C(paramParcel, i);
  }
  
  public OfferWalletObject W(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str2 = null;
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
        str2 = a.l(paramParcel, k);
        break;
      case 3: 
        str1 = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new OfferWalletObject(j, str2, str1);
  }
  
  public OfferWalletObject[] aB(int paramInt)
  {
    return new OfferWalletObject[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.j
 * JD-Core Version:    0.7.0.1
 */