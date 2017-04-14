package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.b.a;
import com.google.android.gms.maps.internal.r;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
  private final int iM;
  private float mAlpha = 1.0F;
  private LatLng qA;
  private String qB;
  private String qC;
  private BitmapDescriptor qD;
  private boolean qE;
  private boolean qF = false;
  private float qG = 0.0F;
  private float qH = 0.5F;
  private float qI = 0.0F;
  private boolean ql = true;
  private float qt = 0.5F;
  private float qu = 1.0F;
  
  public MarkerOptions()
  {
    this.iM = 1;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.iM = paramInt;
    this.qA = paramLatLng;
    this.qB = paramString1;
    this.qC = paramString2;
    if (paramIBinder == null) {}
    for (BitmapDescriptor localBitmapDescriptor = null;; localBitmapDescriptor = new BitmapDescriptor(b.a.z(paramIBinder)))
    {
      this.qD = localBitmapDescriptor;
      this.qt = paramFloat1;
      this.qu = paramFloat2;
      this.qE = paramBoolean1;
      this.ql = paramBoolean2;
      this.qF = paramBoolean3;
      this.qG = paramFloat3;
      this.qH = paramFloat4;
      this.qI = paramFloat5;
      this.mAlpha = paramFloat6;
      return;
    }
  }
  
  public MarkerOptions alpha(float paramFloat)
  {
    this.mAlpha = paramFloat;
    return this;
  }
  
  public MarkerOptions anchor(float paramFloat1, float paramFloat2)
  {
    this.qt = paramFloat1;
    this.qu = paramFloat2;
    return this;
  }
  
  IBinder cN()
  {
    if (this.qD == null) {
      return null;
    }
    return this.qD.cs().asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public MarkerOptions draggable(boolean paramBoolean)
  {
    this.qE = paramBoolean;
    return this;
  }
  
  public MarkerOptions flat(boolean paramBoolean)
  {
    this.qF = paramBoolean;
    return this;
  }
  
  public float getAlpha()
  {
    return this.mAlpha;
  }
  
  public float getAnchorU()
  {
    return this.qt;
  }
  
  public float getAnchorV()
  {
    return this.qu;
  }
  
  public BitmapDescriptor getIcon()
  {
    return this.qD;
  }
  
  public float getInfoWindowAnchorU()
  {
    return this.qH;
  }
  
  public float getInfoWindowAnchorV()
  {
    return this.qI;
  }
  
  public LatLng getPosition()
  {
    return this.qA;
  }
  
  public float getRotation()
  {
    return this.qG;
  }
  
  public String getSnippet()
  {
    return this.qC;
  }
  
  public String getTitle()
  {
    return this.qB;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public MarkerOptions icon(BitmapDescriptor paramBitmapDescriptor)
  {
    this.qD = paramBitmapDescriptor;
    return this;
  }
  
  public MarkerOptions infoWindowAnchor(float paramFloat1, float paramFloat2)
  {
    this.qH = paramFloat1;
    this.qI = paramFloat2;
    return this;
  }
  
  public boolean isDraggable()
  {
    return this.qE;
  }
  
  public boolean isFlat()
  {
    return this.qF;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public MarkerOptions position(LatLng paramLatLng)
  {
    this.qA = paramLatLng;
    return this;
  }
  
  public MarkerOptions rotation(float paramFloat)
  {
    this.qG = paramFloat;
    return this;
  }
  
  public MarkerOptions snippet(String paramString)
  {
    this.qC = paramString;
    return this;
  }
  
  public MarkerOptions title(String paramString)
  {
    this.qB = paramString;
    return this;
  }
  
  public MarkerOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      f.a(this, paramParcel, paramInt);
      return;
    }
    MarkerOptionsCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * JD-Core Version:    0.7.0.1
 */