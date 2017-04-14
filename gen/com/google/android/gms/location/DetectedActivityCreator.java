package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class DetectedActivityCreator
  implements Parcelable.Creator<DetectedActivity>
{
  public static final int CONTENT_DESCRIPTION;
  
  static void a(DetectedActivity paramDetectedActivity, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    b.c(paramParcel, 1, paramDetectedActivity.oy);
    b.c(paramParcel, 1000, paramDetectedActivity.getVersionCode());
    b.c(paramParcel, 2, paramDetectedActivity.oz);
    b.C(paramParcel, i);
  }
  
  public DetectedActivity createFromParcel(Parcel paramParcel)
  {
    int i = 0;
    int j = a.j(paramParcel);
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.i(paramParcel);
      switch (a.y(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.f(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new DetectedActivity(m, k, i);
  }
  
  public DetectedActivity[] newArray(int paramInt)
  {
    return new DetectedActivity[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivityCreator
 * JD-Core Version:    0.7.0.1
 */