package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
  private final int iM;
  private final List<LatLng> qK;
  private final List<List<LatLng>> qL;
  private boolean qM = false;
  private float qh = 10.0F;
  private int qi = -16777216;
  private int qj = 0;
  private float qk = 0.0F;
  private boolean ql = true;
  
  public PolygonOptions()
  {
    this.iM = 1;
    this.qK = new ArrayList();
    this.qL = new ArrayList();
  }
  
  PolygonOptions(int paramInt1, List<LatLng> paramList, List paramList1, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.iM = paramInt1;
    this.qK = paramList;
    this.qL = paramList1;
    this.qh = paramFloat1;
    this.qi = paramInt2;
    this.qj = paramInt3;
    this.qk = paramFloat2;
    this.ql = paramBoolean1;
    this.qM = paramBoolean2;
  }
  
  public PolygonOptions add(LatLng paramLatLng)
  {
    this.qK.add(paramLatLng);
    return this;
  }
  
  public PolygonOptions add(LatLng... paramVarArgs)
  {
    this.qK.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public PolygonOptions addAll(Iterable<LatLng> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      LatLng localLatLng = (LatLng)localIterator.next();
      this.qK.add(localLatLng);
    }
    return this;
  }
  
  public PolygonOptions addHole(Iterable<LatLng> paramIterable)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((LatLng)localIterator.next());
    }
    this.qL.add(localArrayList);
    return this;
  }
  
  List cO()
  {
    return this.qL;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PolygonOptions fillColor(int paramInt)
  {
    this.qj = paramInt;
    return this;
  }
  
  public PolygonOptions geodesic(boolean paramBoolean)
  {
    this.qM = paramBoolean;
    return this;
  }
  
  public int getFillColor()
  {
    return this.qj;
  }
  
  public List<List<LatLng>> getHoles()
  {
    return this.qL;
  }
  
  public List<LatLng> getPoints()
  {
    return this.qK;
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
  
  public boolean isGeodesic()
  {
    return this.qM;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public PolygonOptions strokeColor(int paramInt)
  {
    this.qi = paramInt;
    return this;
  }
  
  public PolygonOptions strokeWidth(float paramFloat)
  {
    this.qh = paramFloat;
    return this;
  }
  
  public PolygonOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      g.a(this, paramParcel, paramInt);
      return;
    }
    PolygonOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public PolygonOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.PolygonOptions
 * JD-Core Version:    0.7.0.1
 */