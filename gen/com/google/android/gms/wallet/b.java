package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<Cart>
{
  static void a(Cart paramCart, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.k(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramCart.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCart.tD, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramCart.tE, false);
    com.google.android.gms.common.internal.safeparcel.b.b(paramParcel, 4, paramCart.tF, false);
    com.google.android.gms.common.internal.safeparcel.b.C(paramParcel, i);
  }
  
  public Cart O(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    int j = 0;
    ArrayList localArrayList = new ArrayList();
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
        localArrayList = a.c(paramParcel, k, LineItem.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new Cart(j, str2, str1, localArrayList);
  }
  
  public Cart[] at(int paramInt)
  {
    return new Cart[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.b
 * JD-Core Version:    0.7.0.1
 */