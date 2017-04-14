package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<MaskedWalletRequest>
{
  static void a(MaskedWalletRequest paramMaskedWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramMaskedWalletRequest.getVersionCode());
    b.a(paramParcel, 2, paramMaskedWalletRequest.tI, false);
    b.a(paramParcel, 3, paramMaskedWalletRequest.ub);
    b.a(paramParcel, 4, paramMaskedWalletRequest.uc);
    b.a(paramParcel, 5, paramMaskedWalletRequest.ud);
    b.a(paramParcel, 6, paramMaskedWalletRequest.ue, false);
    b.a(paramParcel, 7, paramMaskedWalletRequest.tE, false);
    b.a(paramParcel, 8, paramMaskedWalletRequest.uf, false);
    b.a(paramParcel, 9, paramMaskedWalletRequest.tO, paramInt, false);
    b.a(paramParcel, 10, paramMaskedWalletRequest.ug);
    b.a(paramParcel, 11, paramMaskedWalletRequest.uh);
    b.C(paramParcel, i);
  }
  
  public MaskedWalletRequest U(Parcel paramParcel)
  {
    Cart localCart = null;
    boolean bool1 = false;
    int i = a.j(paramParcel);
    boolean bool2 = false;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str4 = null;
    int j = 0;
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
        str4 = a.l(paramParcel, k);
        break;
      case 3: 
        bool5 = a.c(paramParcel, k);
        break;
      case 4: 
        bool4 = a.c(paramParcel, k);
        break;
      case 5: 
        bool3 = a.c(paramParcel, k);
        break;
      case 6: 
        str3 = a.l(paramParcel, k);
        break;
      case 7: 
        str2 = a.l(paramParcel, k);
        break;
      case 8: 
        str1 = a.l(paramParcel, k);
        break;
      case 9: 
        localCart = (Cart)a.a(paramParcel, k, Cart.CREATOR);
        break;
      case 10: 
        bool2 = a.c(paramParcel, k);
        break;
      case 11: 
        bool1 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new MaskedWalletRequest(j, str4, bool5, bool4, bool3, str3, str2, str1, localCart, bool2, bool1);
  }
  
  public MaskedWalletRequest[] az(int paramInt)
  {
    return new MaskedWalletRequest[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.h
 * JD-Core Version:    0.7.0.1
 */