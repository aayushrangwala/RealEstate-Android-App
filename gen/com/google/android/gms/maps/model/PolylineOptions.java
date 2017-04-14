package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
  private final int iM;
  private int jc = -16777216;
  private final List<LatLng> qK;
  private boolean qM = false;
  private float qk = 0.0F;
  private boolean ql = true;
  private float qp = 10.0F;
  
  public PolylineOptions()
  {
    this.iM = 1;
    this.qK = new ArrayList();
  }
  
  PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.iM = paramInt1;
    this.qK = paramList;
    this.qp = paramFloat1;
    this.jc = paramInt2;
    this.qk = paramFloat2;
    this.ql = paramBoolean1;
    this.qM = paramBoolean2;
  }
  
  public PolylineOptions add(LatLng paramLatLng)
  {
    this.qK.add(paramLatLng);
    return this;
  }
  
  public PolylineOptions add(LatLng... paramVarArgs)
  {
    this.qK.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public PolylineOptions addAll(Iterable<LatLng> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      LatLng localLatLng = (LatLng)localIterator.next();
      this.qK.add(localLatLng);
    }
    return this;
  }
  
  public PolylineOptions color(int paramInt)
  {
    this.jc = paramInt;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PolylineOptions geodesic(boolean paramBoolean)
  {
    this.qM = paramBoolean;
    return this;
  }
  
  public int getColor()
  {
    return this.jc;
  }
  
  public List<LatLng> getPoints()
  {
    return this.qK;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public float getWidth()
  {
    return this.qp;
  }
  
  public float getZIndex()
  {
    return this.qk;
  }
  
  public boolean isGeodesic()
  {
    return this.qM;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public PolylineOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public PolylineOptions width(float paramFloat)
  {
    this.qp = paramFloat;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      h.a(this, paramParcel, paramInt);
      return;
    }
    PolylineOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public PolylineOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolylineOptions
 * JD-Core Version:    0.7.0.1
 */