package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.r;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
  private final int iM;
  public final LatLng northeast;
  public final LatLng southwest;
  
  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    dm.a(paramLatLng1, "null southwest");
    dm.a(paramLatLng2, "null northeast");
    if (paramLatLng2.latitude >= paramLatLng1.latitude) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.latitude);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.latitude);
      dm.a(bool, "southern latitude exceeds northern latitude (%s > %s)", arrayOfObject);
      this.iM = paramInt;
      this.southwest = paramLatLng1;
      this.northeast = paramLatLng2;
      return;
    }
  }
  
  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }
  
  private boolean a(double paramDouble)
  {
    return (this.southwest.latitude <= paramDouble) && (paramDouble <= this.northeast.latitude);
  }
  
  private static double b(double paramDouble1, double paramDouble2)
  {
    return (360.0D + (paramDouble1 - paramDouble2)) % 360.0D;
  }
  
  private boolean b(double paramDouble)
  {
    if (this.southwest.longitude <= this.northeast.longitude) {
      return (this.southwest.longitude <= paramDouble) && (paramDouble <= this.northeast.longitude);
    }
    boolean bool1;
    if (this.southwest.longitude > paramDouble)
    {
      boolean bool2 = paramDouble < this.northeast.longitude;
      bool1 = false;
      if (bool2) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public static Builder builder()
  {
    return new Builder();
  }
  
  private static double c(double paramDouble1, double paramDouble2)
  {
    return (360.0D + (paramDouble2 - paramDouble1)) % 360.0D;
  }
  
  public boolean contains(LatLng paramLatLng)
  {
    return (a(paramLatLng.latitude)) && (b(paramLatLng.longitude));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds)) {
        return false;
      }
      localLatLngBounds = (LatLngBounds)paramObject;
    } while ((this.southwest.equals(localLatLngBounds.southwest)) && (this.northeast.equals(localLatLngBounds.northeast)));
    return false;
  }
  
  public LatLng getCenter()
  {
    double d1 = (this.southwest.latitude + this.northeast.latitude) / 2.0D;
    double d2 = this.northeast.longitude;
    double d3 = this.southwest.longitude;
    if (d3 <= d2) {}
    for (double d4 = (d2 + d3) / 2.0D;; d4 = (d3 + (d2 + 360.0D)) / 2.0D) {
      return new LatLng(d1, d4);
    }
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.southwest;
    arrayOfObject[1] = this.northeast;
    return dl.hashCode(arrayOfObject);
  }
  
  public LatLngBounds including(LatLng paramLatLng)
  {
    double d1 = Math.min(this.southwest.latitude, paramLatLng.latitude);
    double d2 = Math.max(this.northeast.latitude, paramLatLng.latitude);
    double d3 = this.northeast.longitude;
    double d4 = this.southwest.longitude;
    double d5 = paramLatLng.longitude;
    double d6;
    if (!b(d5)) {
      if (b(d4, d5) < c(d3, d5)) {
        d6 = d3;
      }
    }
    for (;;)
    {
      return new LatLngBounds(new LatLng(d1, d5), new LatLng(d2, d6));
      d6 = d5;
      d5 = d4;
      continue;
      d5 = d4;
      d6 = d3;
    }
  }
  
  public String toString()
  {
    return dl.d(this).a("southwest", this.southwest).a("northeast", this.northeast).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      d.a(this, paramParcel, paramInt);
      return;
    }
    LatLngBoundsCreator.a(this, paramParcel, paramInt);
  }
  
  public static final class Builder
  {
    private double qv = (1.0D / 0.0D);
    private double qw = (-1.0D / 0.0D);
    private double qx = (0.0D / 0.0D);
    private double qy = (0.0D / 0.0D);
    
    private boolean b(double paramDouble)
    {
      if (this.qx <= this.qy) {
        return (this.qx <= paramDouble) && (paramDouble <= this.qy);
      }
      boolean bool1;
      if (this.qx > paramDouble)
      {
        boolean bool2 = paramDouble < this.qy;
        bool1 = false;
        if (bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    
    public LatLngBounds build()
    {
      if (!Double.isNaN(this.qx)) {}
      for (boolean bool = true;; bool = false)
      {
        dm.a(bool, "no included points");
        return new LatLngBounds(new LatLng(this.qv, this.qx), new LatLng(this.qw, this.qy));
      }
    }
    
    public Builder include(LatLng paramLatLng)
    {
      this.qv = Math.min(this.qv, paramLatLng.latitude);
      this.qw = Math.max(this.qw, paramLatLng.latitude);
      double d = paramLatLng.longitude;
      if (Double.isNaN(this.qx))
      {
        this.qx = d;
        this.qy = d;
      }
      while (b(d)) {
        return this;
      }
      if (LatLngBounds.d(this.qx, d) < LatLngBounds.e(this.qy, d))
      {
        this.qx = d;
        return this;
      }
      this.qy = d;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * JD-Core Version:    0.7.0.1
 */