package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<LineItem>
{
  static void a(LineItem paramLineItem, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramLineItem.getVersionCode());
    b.a(paramParcel, 2, paramLineItem.description, false);
    b.a(paramParcel, 3, paramLineItem.tQ, false);
    b.a(paramParcel, 4, paramLineItem.tR, false);
    b.a(paramParcel, 5, paramLineItem.tD, false);
    b.c(paramParcel, 6, paramLineItem.tS);
    b.a(paramParcel, 7, paramLineItem.tE, false);
    b.C(paramParcel, i);
  }
  
  public LineItem R(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.j(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        break;
      case 2: 
        str5 = a.l(paramParcel, m);
        break;
      case 3: 
        str4 = a.l(paramParcel, m);
        break;
      case 4: 
        str3 = a.l(paramParcel, m);
        break;
      case 5: 
        str2 = a.l(paramParcel, m);
        break;
      case 6: 
        i = a.f(paramParcel, m);
        break;
      case 7: 
        str1 = a.l(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new LineItem(k, str5, str4, str3, str2, i, str1);
  }
  
  public LineItem[] aw(int paramInt)
  {
    return new LineItem[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.e
 * JD-Core Version:    0.7.0.1
 */