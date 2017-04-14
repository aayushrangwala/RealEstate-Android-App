package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class LatLngCreator
  implements Parcelable.Creator<LatLng>
{
  public static final int CONTENT_DESCRIPTION;
  
  static void a(LatLng paramLatLng, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramLatLng.getVersionCode());
    b.a(paramParcel, 2, paramLatLng.latitude);
    b.a(paramParcel, 3, paramLatLng.longitude);
    b.C(paramParcel, i);
  }
  
  public LatLng createFromParcel(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int i = a.j(paramParcel);
    int j = 0;
    double d2 = d1;
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
        d2 = a.j(paramParcel, k);
        break;
      case 3: 
        d1 = a.j(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new LatLng(j, d2, d1);
  }
  
  public LatLng[] newArray(int paramInt)
  {
    return new LatLng[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngCreator
 * JD-Core Version:    0.7.0.1
 */