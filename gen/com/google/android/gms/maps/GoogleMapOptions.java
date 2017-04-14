package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();
  private final int iM;
  private CameraPosition pA;
  private Boolean pB;
  private Boolean pC;
  private Boolean pD;
  private Boolean pE;
  private Boolean pF;
  private Boolean pG;
  private Boolean px;
  private Boolean py;
  private int pz = -1;
  
  public GoogleMapOptions()
  {
    this.iM = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    this.iM = paramInt1;
    this.px = com.google.android.gms.maps.internal.a.a(paramByte1);
    this.py = com.google.android.gms.maps.internal.a.a(paramByte2);
    this.pz = paramInt2;
    this.pA = paramCameraPosition;
    this.pB = com.google.android.gms.maps.internal.a.a(paramByte3);
    this.pC = com.google.android.gms.maps.internal.a.a(paramByte4);
    this.pD = com.google.android.gms.maps.internal.a.a(paramByte5);
    this.pE = com.google.android.gms.maps.internal.a.a(paramByte6);
    this.pF = com.google.android.gms.maps.internal.a.a(paramByte7);
    this.pG = com.google.android.gms.maps.internal.a.a(paramByte8);
  }
  
  public static GoogleMapOptions createFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.MapAttrs);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(0)) {
      localGoogleMapOptions.mapType(localTypedArray.getInt(0, -1));
    }
    if (localTypedArray.hasValue(13)) {
      localGoogleMapOptions.zOrderOnTop(localTypedArray.getBoolean(13, false));
    }
    if (localTypedArray.hasValue(12)) {
      localGoogleMapOptions.useViewLifecycleInFragment(localTypedArray.getBoolean(12, false));
    }
    if (localTypedArray.hasValue(6)) {
      localGoogleMapOptions.compassEnabled(localTypedArray.getBoolean(6, true));
    }
    if (localTypedArray.hasValue(7)) {
      localGoogleMapOptions.rotateGesturesEnabled(localTypedArray.getBoolean(7, true));
    }
    if (localTypedArray.hasValue(8)) {
      localGoogleMapOptions.scrollGesturesEnabled(localTypedArray.getBoolean(8, true));
    }
    if (localTypedArray.hasValue(9)) {
      localGoogleMapOptions.tiltGesturesEnabled(localTypedArray.getBoolean(9, true));
    }
    if (localTypedArray.hasValue(11)) {
      localGoogleMapOptions.zoomGesturesEnabled(localTypedArray.getBoolean(11, true));
    }
    if (localTypedArray.hasValue(10)) {
      localGoogleMapOptions.zoomControlsEnabled(localTypedArray.getBoolean(10, true));
    }
    localGoogleMapOptions.camera(CameraPosition.createFromAttributes(paramContext, paramAttributeSet));
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  byte cA()
  {
    return com.google.android.gms.maps.internal.a.b(this.pE);
  }
  
  byte cB()
  {
    return com.google.android.gms.maps.internal.a.b(this.pF);
  }
  
  byte cC()
  {
    return com.google.android.gms.maps.internal.a.b(this.pG);
  }
  
  public GoogleMapOptions camera(CameraPosition paramCameraPosition)
  {
    this.pA = paramCameraPosition;
    return this;
  }
  
  public GoogleMapOptions compassEnabled(boolean paramBoolean)
  {
    this.pC = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte cv()
  {
    return com.google.android.gms.maps.internal.a.b(this.px);
  }
  
  byte cw()
  {
    return com.google.android.gms.maps.internal.a.b(this.py);
  }
  
  byte cx()
  {
    return com.google.android.gms.maps.internal.a.b(this.pB);
  }
  
  byte cy()
  {
    return com.google.android.gms.maps.internal.a.b(this.pC);
  }
  
  byte cz()
  {
    return com.google.android.gms.maps.internal.a.b(this.pD);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public CameraPosition getCamera()
  {
    return this.pA;
  }
  
  public Boolean getCompassEnabled()
  {
    return this.pC;
  }
  
  public int getMapType()
  {
    return this.pz;
  }
  
  public Boolean getRotateGesturesEnabled()
  {
    return this.pG;
  }
  
  public Boolean getScrollGesturesEnabled()
  {
    return this.pD;
  }
  
  public Boolean getTiltGesturesEnabled()
  {
    return this.pF;
  }
  
  public Boolean getUseViewLifecycleInFragment()
  {
    return this.py;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public Boolean getZOrderOnTop()
  {
    return this.px;
  }
  
  public Boolean getZoomControlsEnabled()
  {
    return this.pB;
  }
  
  public Boolean getZoomGesturesEnabled()
  {
    return this.pE;
  }
  
  public GoogleMapOptions mapType(int paramInt)
  {
    this.pz = paramInt;
    return this;
  }
  
  public GoogleMapOptions rotateGesturesEnabled(boolean paramBoolean)
  {
    this.pG = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public GoogleMapOptions scrollGesturesEnabled(boolean paramBoolean)
  {
    this.pD = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public GoogleMapOptions tiltGesturesEnabled(boolean paramBoolean)
  {
    this.pF = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public GoogleMapOptions useViewLifecycleInFragment(boolean paramBoolean)
  {
    this.py = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      a.a(this, paramParcel, paramInt);
      return;
    }
    GoogleMapOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public GoogleMapOptions zOrderOnTop(boolean paramBoolean)
  {
    this.px = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public GoogleMapOptions zoomControlsEnabled(boolean paramBoolean)
  {
    this.pB = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public GoogleMapOptions zoomGesturesEnabled(boolean paramBoolean)
  {
    this.pE = Boolean.valueOf(paramBoolean);
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * JD-Core Version:    0.7.0.1
 */