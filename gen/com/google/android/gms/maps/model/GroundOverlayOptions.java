package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.b.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.r;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
  public static final float NO_DIMENSION = -1.0F;
  private final int iM;
  private float qd;
  private float qk;
  private boolean ql = true;
  private BitmapDescriptor qn;
  private LatLng qo;
  private float qp;
  private float qq;
  private LatLngBounds qr;
  private float qs = 0.0F;
  private float qt = 0.5F;
  private float qu = 0.5F;
  
  public GroundOverlayOptions()
  {
    this.iM = 1;
  }
  
  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.iM = paramInt;
    this.qn = new BitmapDescriptor(b.a.z(paramIBinder));
    this.qo = paramLatLng;
    this.qp = paramFloat1;
    this.qq = paramFloat2;
    this.qr = paramLatLngBounds;
    this.qd = paramFloat3;
    this.qk = paramFloat4;
    this.ql = paramBoolean;
    this.qs = paramFloat5;
    this.qt = paramFloat6;
    this.qu = paramFloat7;
  }
  
  private GroundOverlayOptions a(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    this.qo = paramLatLng;
    this.qp = paramFloat1;
    this.qq = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions anchor(float paramFloat1, float paramFloat2)
  {
    this.qt = paramFloat1;
    this.qu = paramFloat2;
    return this;
  }
  
  public GroundOverlayOptions bearing(float paramFloat)
  {
    this.qd = ((360.0F + paramFloat % 360.0F) % 360.0F);
    return this;
  }
  
  IBinder cM()
  {
    return this.qn.cs().asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float getAnchorU()
  {
    return this.qt;
  }
  
  public float getAnchorV()
  {
    return this.qu;
  }
  
  public float getBearing()
  {
    return this.qd;
  }
  
  public LatLngBounds getBounds()
  {
    return this.qr;
  }
  
  public float getHeight()
  {
    return this.qq;
  }
  
  public BitmapDescriptor getImage()
  {
    return this.qn;
  }
  
  public LatLng getLocation()
  {
    return this.qo;
  }
  
  public float getTransparency()
  {
    return this.qs;
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
  
  public GroundOverlayOptions image(BitmapDescriptor paramBitmapDescriptor)
  {
    this.qn = paramBitmapDescriptor;
    return this;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (this.qr == null)
    {
      bool2 = bool1;
      dm.a(bool2, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label60;
      }
      bool3 = bool1;
      label26:
      dm.b(bool3, "Location must be specified");
      if (paramFloat < 0.0F) {
        break label66;
      }
    }
    for (;;)
    {
      dm.b(bool1, "Width must be non-negative");
      return a(paramLatLng, paramFloat, -1.0F);
      bool2 = false;
      break;
      label60:
      bool3 = false;
      break label26;
      label66:
      bool1 = false;
    }
  }
  
  public GroundOverlayOptions position(LatLng paramLatLng, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label29:
    boolean bool4;
    if (this.qr == null)
    {
      bool2 = bool1;
      dm.a(bool2, "Position has already been set using positionFromBounds");
      if (paramLatLng == null) {
        break label80;
      }
      bool3 = bool1;
      dm.b(bool3, "Location must be specified");
      if (paramFloat1 < 0.0F) {
        break label86;
      }
      bool4 = bool1;
      label46:
      dm.b(bool4, "Width must be non-negative");
      if (paramFloat2 < 0.0F) {
        break label92;
      }
    }
    for (;;)
    {
      dm.b(bool1, "Height must be non-negative");
      return a(paramLatLng, paramFloat1, paramFloat2);
      bool2 = false;
      break;
      label80:
      bool3 = false;
      break label29;
      label86:
      bool4 = false;
      break label46;
      label92:
      bool1 = false;
    }
  }
  
  public GroundOverlayOptions positionFromBounds(LatLngBounds paramLatLngBounds)
  {
    if (this.qo == null) {}
    for (boolean bool = true;; bool = false)
    {
      dm.a(bool, "Position has already been set using position: " + this.qo);
      this.qr = paramLatLngBounds;
      return this;
    }
  }
  
  public GroundOverlayOptions transparency(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {}
    for (boolean bool = true;; bool = false)
    {
      dm.b(bool, "Transparency must be in the range [0..1]");
      this.qs = paramFloat;
      return this;
    }
  }
  
  public GroundOverlayOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      c.a(this, paramParcel, paramInt);
      return;
    }
    GroundOverlayOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public GroundOverlayOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlayOptions
 * JD-Core Version:    0.7.0.1
 */