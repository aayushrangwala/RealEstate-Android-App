package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<FullWalletRequest>
{
  static void a(FullWalletRequest paramFullWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramFullWalletRequest.getVersionCode());
    b.a(paramParcel, 2, paramFullWalletRequest.tH, false);
    b.a(paramParcel, 3, paramFullWalletRequest.tI, false);
    b.a(paramParcel, 4, paramFullWalletRequest.tO, paramInt, false);
    b.C(paramParcel, i);
  }
  
  public FullWalletRequest Q(Parcel paramParcel)
  {
    Cart localCart = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str1 = null;
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
        break;
      case 4: 
        localCart = (Cart)a.a(paramParcel, k, Cart.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new FullWalletRequest(j, str2, str1, localCart);
  }
  
  public FullWalletRequest[] av(int paramInt)
  {
    return new FullWalletRequest[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.d
 * JD-Core Version:    0.7.0.1
 */