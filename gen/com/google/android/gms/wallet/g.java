package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<MaskedWallet>
{
  static void a(MaskedWallet paramMaskedWallet, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramMaskedWallet.getVersionCode());
    b.a(paramParcel, 2, paramMaskedWallet.tH, false);
    b.a(paramParcel, 3, paramMaskedWallet.tI, false);
    b.a(paramParcel, 4, paramMaskedWallet.tN, false);
    b.a(paramParcel, 5, paramMaskedWallet.tK, false);
    b.a(paramParcel, 6, paramMaskedWallet.tL, paramInt, false);
    b.a(paramParcel, 7, paramMaskedWallet.tM, paramInt, false);
    b.a(paramParcel, 8, paramMaskedWallet.tZ, paramInt, false);
    b.a(paramParcel, 9, paramMaskedWallet.ua, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public MaskedWallet T(Parcel paramParcel)
  {
    OfferWalletObject[] arrayOfOfferWalletObject = null;
    int i = a.j(paramParcel);
    int j = 0;
    LoyaltyWalletObject[] arrayOfLoyaltyWalletObject = null;
    Address localAddress1 = null;
    Address localAddress2 = null;
    String str1 = null;
    String[] arrayOfString = null;
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
        arrayOfString = a.w(paramParcel, k);
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
        arrayOfLoyaltyWalletObject = (LoyaltyWalletObject[])a.b(paramParcel, k, LoyaltyWalletObject.CREATOR);
        break;
      case 9: 
        arrayOfOfferWalletObject = (OfferWalletObject[])a.b(paramParcel, k, OfferWalletObject.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new MaskedWallet(j, str3, str2, arrayOfString, str1, localAddress2, localAddress1, arrayOfLoyaltyWalletObject, arrayOfOfferWalletObject);
  }
  
  public MaskedWallet[] ay(int paramInt)
  {
    return new MaskedWallet[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.g
 * JD-Core Version:    0.7.0.1
 */