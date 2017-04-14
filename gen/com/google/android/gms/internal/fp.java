package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fp
  implements Parcelable.Creator<fn>
{
  static void a(fn paramfn, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.a(paramParcel, 1, paramfn.getAccountName(), false);
    b.c(paramParcel, 1000, paramfn.getVersionCode());
    b.a(paramParcel, 2, paramfn.cZ(), false);
    b.a(paramParcel, 3, paramfn.da(), false);
    b.a(paramParcel, 4, paramfn.db(), false);
    b.a(paramParcel, 5, paramfn.dc(), false);
    b.a(paramParcel, 6, paramfn.dd(), false);
    b.a(paramParcel, 7, paramfn.de(), false);
    b.a(paramParcel, 8, paramfn.df(), false);
    b.C(paramParcel, i);
  }
  
  public fn A(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.j(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String[] arrayOfString1 = null;
    String[] arrayOfString2 = null;
    String[] arrayOfString3 = null;
    String str5 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.i(paramParcel);
      switch (a.y(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str5 = a.l(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        arrayOfString3 = a.w(paramParcel, k);
        break;
      case 3: 
        arrayOfString2 = a.w(paramParcel, k);
        break;
      case 4: 
        arrayOfString1 = a.w(paramParcel, k);
        break;
      case 5: 
        str4 = a.l(paramParcel, k);
        break;
      case 6: 
        str3 = a.l(paramParcel, k);
        break;
      case 7: 
        str2 = a.l(paramParcel, k);
        break;
      case 8: 
        str1 = a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fn(j, str5, arrayOfString3, arrayOfString2, arrayOfString1, str4, str3, str2, str1);
  }
  
  public fn[] af(int paramInt)
  {
    return new fn[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fp
 * JD-Core Version:    0.7.0.1
 */