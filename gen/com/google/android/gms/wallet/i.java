package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<NotifyTransactionStatusRequest>
{
  static void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramNotifyTransactionStatusRequest.iM);
    b.a(paramParcel, 2, paramNotifyTransactionStatusRequest.tH, false);
    b.c(paramParcel, 3, paramNotifyTransactionStatusRequest.status);
    b.a(paramParcel, 4, paramNotifyTransactionStatusRequest.uj, false);
    b.C(paramParcel, i);
  }
  
  public NotifyTransactionStatusRequest V(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.j(paramParcel);
    String str2 = null;
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
        str2 = a.l(paramParcel, m);
        break;
      case 3: 
        i = a.f(paramParcel, m);
        break;
      case 4: 
        str1 = a.l(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new NotifyTransactionStatusRequest(k, str2, i, str1);
  }
  
  public NotifyTransactionStatusRequest[] aA(int paramInt)
  {
    return new NotifyTransactionStatusRequest[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.i
 * JD-Core Version:    0.7.0.1
 */