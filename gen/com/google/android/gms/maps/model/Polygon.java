package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.model.internal.e;
import java.util.List;

public final class Polygon
{
  private final e qJ;
  
  public Polygon(e parame)
  {
    this.qJ = ((e)dm.e(parame));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Polygon)) {
      return false;
    }
    try
    {
      boolean bool = this.qJ.a(((Polygon)paramObject).qJ);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public int getFillColor()
  {
    try
    {
      int i = this.qJ.getFillColor();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public List<List<LatLng>> getHoles()
  {
    try
    {
      List localList = this.qJ.getHoles();
      return localList;
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
      String str = this.qJ.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public List<LatLng> getPoints()
  {
    try
    {
      List localList = this.qJ.getPoints();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public int getStrokeColor()
  {
    try
    {
      int i = this.qJ.getStrokeColor();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public float getStrokeWidth()
  {
    try
    {
      float f = this.qJ.getStrokeWidth();
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
      float f = this.qJ.getZIndex();
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
      int i = this.qJ.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public boolean isGeodesic()
  {
    try
    {
      boolean bool = this.qJ.isGeodesic();
      return bool;
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
      boolean bool = this.qJ.isVisible();
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
      this.qJ.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setFillColor(int paramInt)
  {
    try
    {
      this.qJ.setFillColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setGeodesic(boolean paramBoolean)
  {
    try
    {
      this.qJ.setGeodesic(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setHoles(List<? extends List<LatLng>> paramList)
  {
    try
    {
      this.qJ.setHoles(paramList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setPoints(List<LatLng> paramList)
  {
    try
    {
      this.qJ.setPoints(paramList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setStrokeColor(int paramInt)
  {
    try
    {
      this.qJ.setStrokeColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    try
    {
      this.qJ.setStrokeWidth(paramFloat);
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
      this.qJ.setVisible(paramBoolean);
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
      this.qJ.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.Polygon
 * JD-Core Version:    0.7.0.1
 */