package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.internal.c;

public final class GroundOverlay
{
  private final c qm;
  
  public GroundOverlay(c paramc)
  {
    this.qm = ((c)dm.e(paramc));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GroundOverlay)) {
      return false;
    }
    try
    {
      boolean bool = this.qm.a(((GroundOverlay)paramObject).qm);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getBearing()
  {
    try
    {
      float f = this.qm.getBearing();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public LatLngBounds getBounds()
  {
    try
    {
      LatLngBounds localLatLngBounds = this.qm.getBounds();
      return localLatLngBounds;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getHeight()
  {
    try
    {
      float f = this.qm.getHeight();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public String getId()
  {
    try
    {
      String str = this.qm.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public LatLng getPosition()
  {
    try
    {
      LatLng localLatLng = this.qm.getPosition();
      return localLatLng;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getTransparency()
  {
    try
    {
      float f = this.qm.getTransparency();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getWidth()
  {
    try
    {
      float f = this.qm.getWidth();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getZIndex()
  {
    try
    {
      float f = this.qm.getZIndex();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public int hashCode()
  {
    try
    {
      int i = this.qm.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public boolean isVisible()
  {
    try
    {
      boolean bool = this.qm.isVisible();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void remove()
  {
    try
    {
      this.qm.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setBearing(float paramFloat)
  {
    try
    {
      this.qm.setBearing(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setDimensions(float paramFloat)
  {
    try
    {
      this.qm.setDimensions(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setDimensions(float paramFloat1, float paramFloat2)
  {
    try
    {
      this.qm.a(paramFloat1, paramFloat2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setImage(BitmapDescriptor paramBitmapDescriptor)
  {
    try
    {
      this.qm.h(paramBitmapDescriptor.cs());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setPosition(LatLng paramLatLng)
  {
    try
    {
      this.qm.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setPositionFromBounds(LatLngBounds paramLatLngBounds)
  {
    try
    {
      this.qm.setPositionFromBounds(paramLatLngBounds);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setTransparency(float paramFloat)
  {
    try
    {
      this.qm.setTransparency(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setVisible(boolean paramBoolean)
  {
    try
    {
      this.qm.setVisible(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setZIndex(float paramFloat)
  {
    try
    {
      this.qm.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlay
 * JD-Core Version:    0.7.0.1
 */