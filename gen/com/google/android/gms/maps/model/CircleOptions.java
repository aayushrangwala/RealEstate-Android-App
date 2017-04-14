package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;

public final class CircleOptions
  implements SafeParcelable
{
  public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
  private final int iM;
  private LatLng qf = null;
  private double qg = 0.0D;
  private float qh = 10.0F;
  private int qi = -16777216;
  private int qj = 0;
  private float qk = 0.0F;
  private boolean ql = true;
  
  public CircleOptions()
  {
    this.iM = 1;
  }
  
  CircleOptions(int paramInt1, LatLng paramLatLng, double paramDouble, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    this.iM = paramInt1;
    this.qf = paramLatLng;
    this.qg = paramDouble;
    this.qh = paramFloat1;
    this.qi = paramInt2;
    this.qj = paramInt3;
    this.qk = paramFloat2;
    this.ql = paramBoolean;
  }
  
  public CircleOptions center(LatLng paramLatLng)
  {
    this.qf = paramLatLng;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public CircleOptions fillColor(int paramInt)
  {
    this.qj = paramInt;
    return this;
  }
  
  public LatLng getCenter()
  {
    return this.qf;
  }
  
  public int getFillColor()
  {
    return this.qj;
  }
  
  public double getRadius()
  {
    return this.qg;
  }
  
  public int getStrokeColor()
  {
    return this.qi;
  }
  
  public float getStrokeWidth()
  {
    return this.qh;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public float getZIndex()
  {
    return this.qk;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public CircleOptions radius(double paramDouble)
  {
    this.qg = paramDouble;
    return this;
  }
  
  public CircleOptions strokeColor(int paramInt)
  {
    this.qi = paramInt;
    return this;
  }
  
  public CircleOptions strokeWidth(float paramFloat)
  {
    this.qh = paramFloat;
    return this;
  }
  
  public CircleOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      b.a(this, paramParcel, paramInt);
      return;
    }
    CircleOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public CircleOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CircleOptions
 * JD-Core Version:    0.7.0.1
 */