package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class LocationRequestCreator
  implements Parcelable.Creator<LocationRequest>
{
  public static final int CONTENT_DESCRIPTION;
  
  static void a(LocationRequest paramLocationRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramLocationRequest.mPriority);
    b.c(paramParcel, 1000, paramLocationRequest.getVersionCode());
    b.a(paramParcel, 2, paramLocationRequest.oJ);
    b.a(paramParcel, 3, paramLocationRequest.oK);
    b.a(paramParcel, 4, paramLocationRequest.oL);
    b.a(paramParcel, 5, paramLocationRequest.oC);
    b.c(paramParcel, 6, paramLocationRequest.oM);
    b.a(paramParcel, 7, paramLocationRequest.oN);
    b.C(paramParcel, i);
  }
  
  public LocationRequest createFromParcel(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.j(paramParcel);
    int j = 102;
    long l1 = 3600000L;
    long l2 = 600000L;
    long l3 = 9223372036854775807L;
    int k = 2147483647;
    float f = 0.0F;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.f(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        l1 = a.g(paramParcel, n);
        break;
      case 3: 
        l2 = a.g(paramParcel, n);
        break;
      case 4: 
        bool = a.c(paramParcel, n);
        break;
      case 5: 
        l3 = a.g(paramParcel, n);
        break;
      case 6: 
        k = a.f(paramParcel, n);
        break;
      case 7: 
        f = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequest(m, j, l1, l2, bool, l3, k, f);
  }
  
  public LocationRequest[] newArray(int paramInt)
  {
    return new LocationRequest[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequestCreator
 * JD-Core Version:    0.7.0.1
 */