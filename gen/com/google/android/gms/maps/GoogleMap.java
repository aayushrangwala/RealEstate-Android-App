package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate.a;
import com.google.android.gms.maps.internal.b.a;
import com.google.android.gms.maps.internal.d.a;
import com.google.android.gms.maps.internal.e.a;
import com.google.android.gms.maps.internal.f.a;
import com.google.android.gms.maps.internal.g;
import com.google.android.gms.maps.internal.h.a;
import com.google.android.gms.maps.internal.i.a;
import com.google.android.gms.maps.internal.j.a;
import com.google.android.gms.maps.internal.k.a;
import com.google.android.gms.maps.internal.l.a;
import com.google.android.gms.maps.internal.m.a;
import com.google.android.gms.maps.internal.n.a;
import com.google.android.gms.maps.internal.o.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.d;
import com.google.android.gms.maps.model.internal.f;

public final class GoogleMap
{
  public static final int MAP_TYPE_HYBRID = 4;
  public static final int MAP_TYPE_NONE = 0;
  public static final int MAP_TYPE_NORMAL = 1;
  public static final int MAP_TYPE_SATELLITE = 2;
  public static final int MAP_TYPE_TERRAIN = 3;
  private final IGoogleMapDelegate pf;
  private UiSettings pg;
  
  protected GoogleMap(IGoogleMapDelegate paramIGoogleMapDelegate)
  {
    this.pf = ((IGoogleMapDelegate)dm.e(paramIGoogleMapDelegate));
  }
  
  public final Circle addCircle(CircleOptions paramCircleOptions)
  {
    try
    {
      Circle localCircle = new Circle(this.pf.addCircle(paramCircleOptions));
      return localCircle;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final GroundOverlay addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
  {
    try
    {
      com.google.android.gms.maps.model.internal.c localc = this.pf.addGroundOverlay(paramGroundOverlayOptions);
      if (localc != null)
      {
        GroundOverlay localGroundOverlay = new GroundOverlay(localc);
        return localGroundOverlay;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    try
    {
      d locald = this.pf.addMarker(paramMarkerOptions);
      if (locald != null)
      {
        Marker localMarker = new Marker(locald);
        return localMarker;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    try
    {
      Polygon localPolygon = new Polygon(this.pf.addPolygon(paramPolygonOptions));
      return localPolygon;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    try
    {
      Polyline localPolyline = new Polyline(this.pf.addPolyline(paramPolylineOptions));
      return localPolyline;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final TileOverlay addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
  {
    try
    {
      f localf = this.pf.addTileOverlay(paramTileOverlayOptions);
      if (localf != null)
      {
        TileOverlay localTileOverlay = new TileOverlay(localf);
        return localTileOverlay;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void animateCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.pf.animateCamera(paramCameraUpdate.cs());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  /* Error */
  public final void animateCamera(CameraUpdate paramCameraUpdate, int paramInt, CancelableCallback paramCancelableCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:pf	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore 5
    //   6: aload_1
    //   7: invokevirtual 109	com/google/android/gms/maps/CameraUpdate:cs	()Lcom/google/android/gms/dynamic/b;
    //   10: astore 6
    //   12: aload_3
    //   13: ifnonnull +19 -> 32
    //   16: aconst_null
    //   17: astore 7
    //   19: aload 5
    //   21: aload 6
    //   23: iload_2
    //   24: aload 7
    //   26: invokeinterface 117 4 0
    //   31: return
    //   32: new 119	com/google/android/gms/maps/GoogleMap$a
    //   35: dup
    //   36: aload_3
    //   37: invokespecial 122	com/google/android/gms/maps/GoogleMap$a:<init>	(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //   40: astore 7
    //   42: goto -23 -> 19
    //   45: astore 4
    //   47: new 48	com/google/android/gms/maps/model/RuntimeRemoteException
    //   50: dup
    //   51: aload 4
    //   53: invokespecial 51	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	GoogleMap
    //   0	57	1	paramCameraUpdate	CameraUpdate
    //   0	57	2	paramInt	int
    //   0	57	3	paramCancelableCallback	CancelableCallback
    //   45	7	4	localRemoteException	RemoteException
    //   4	16	5	localIGoogleMapDelegate	IGoogleMapDelegate
    //   10	12	6	localb	b
    //   17	24	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	45	android/os/RemoteException
    //   19	31	45	android/os/RemoteException
    //   32	42	45	android/os/RemoteException
  }
  
  /* Error */
  public final void animateCamera(CameraUpdate paramCameraUpdate, CancelableCallback paramCancelableCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:pf	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore 4
    //   6: aload_1
    //   7: invokevirtual 109	com/google/android/gms/maps/CameraUpdate:cs	()Lcom/google/android/gms/dynamic/b;
    //   10: astore 5
    //   12: aload_2
    //   13: ifnonnull +18 -> 31
    //   16: aconst_null
    //   17: astore 6
    //   19: aload 4
    //   21: aload 5
    //   23: aload 6
    //   25: invokeinterface 127 3 0
    //   30: return
    //   31: new 119	com/google/android/gms/maps/GoogleMap$a
    //   34: dup
    //   35: aload_2
    //   36: invokespecial 122	com/google/android/gms/maps/GoogleMap$a:<init>	(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //   39: astore 6
    //   41: goto -22 -> 19
    //   44: astore_3
    //   45: new 48	com/google/android/gms/maps/model/RuntimeRemoteException
    //   48: dup
    //   49: aload_3
    //   50: invokespecial 51	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	GoogleMap
    //   0	54	1	paramCameraUpdate	CameraUpdate
    //   0	54	2	paramCancelableCallback	CancelableCallback
    //   44	6	3	localRemoteException	RemoteException
    //   4	16	4	localIGoogleMapDelegate	IGoogleMapDelegate
    //   10	12	5	localb	b
    //   17	23	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	44	android/os/RemoteException
    //   19	30	44	android/os/RemoteException
    //   31	41	44	android/os/RemoteException
  }
  
  public final void clear()
  {
    try
    {
      this.pf.clear();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  IGoogleMapDelegate cu()
  {
    return this.pf;
  }
  
  public final CameraPosition getCameraPosition()
  {
    try
    {
      CameraPosition localCameraPosition = this.pf.getCameraPosition();
      return localCameraPosition;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final int getMapType()
  {
    try
    {
      int i = this.pf.getMapType();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final float getMaxZoomLevel()
  {
    try
    {
      float f = this.pf.getMaxZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final float getMinZoomLevel()
  {
    try
    {
      float f = this.pf.getMinZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  @Deprecated
  public final Location getMyLocation()
  {
    try
    {
      Location localLocation = this.pf.getMyLocation();
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final Projection getProjection()
  {
    try
    {
      Projection localProjection = new Projection(this.pf.getProjection());
      return localProjection;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final UiSettings getUiSettings()
  {
    try
    {
      if (this.pg == null) {
        this.pg = new UiSettings(this.pf.getUiSettings());
      }
      UiSettings localUiSettings = this.pg;
      return localUiSettings;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isBuildingsEnabled()
  {
    try
    {
      boolean bool = this.pf.isBuildingsEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isIndoorEnabled()
  {
    try
    {
      boolean bool = this.pf.isIndoorEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isMyLocationEnabled()
  {
    try
    {
      boolean bool = this.pf.isMyLocationEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean isTrafficEnabled()
  {
    try
    {
      boolean bool = this.pf.isTrafficEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void moveCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.pf.moveCamera(paramCameraUpdate.cs());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setBuildingsEnabled(boolean paramBoolean)
  {
    try
    {
      this.pf.setBuildingsEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final boolean setIndoorEnabled(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.pf.setIndoorEnabled(paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setInfoWindowAdapter(final InfoWindowAdapter paramInfoWindowAdapter)
  {
    if (paramInfoWindowAdapter == null) {}
    try
    {
      this.pf.setInfoWindowAdapter(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setInfoWindowAdapter(new d.a()
    {
      public b f(d paramAnonymousd)
      {
        return com.google.android.gms.dynamic.c.g(paramInfoWindowAdapter.getInfoWindow(new Marker(paramAnonymousd)));
      }
      
      public b g(d paramAnonymousd)
      {
        return com.google.android.gms.dynamic.c.g(paramInfoWindowAdapter.getInfoContents(new Marker(paramAnonymousd)));
      }
    });
  }
  
  public final void setLocationSource(final LocationSource paramLocationSource)
  {
    if (paramLocationSource == null) {}
    try
    {
      this.pf.setLocationSource(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setLocationSource(new ILocationSourceDelegate.a()
    {
      public void activate(final g paramAnonymousg)
      {
        paramLocationSource.activate(new LocationSource.OnLocationChangedListener()
        {
          public void onLocationChanged(Location paramAnonymous2Location)
          {
            try
            {
              paramAnonymousg.g(com.google.android.gms.dynamic.c.g(paramAnonymous2Location));
              return;
            }
            catch (RemoteException localRemoteException)
            {
              throw new RuntimeRemoteException(localRemoteException);
            }
          }
        });
      }
      
      public void deactivate()
      {
        paramLocationSource.deactivate();
      }
    });
  }
  
  public final void setMapType(int paramInt)
  {
    try
    {
      this.pf.setMapType(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setMyLocationEnabled(boolean paramBoolean)
  {
    try
    {
      this.pf.setMyLocationEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setOnCameraChangeListener(final OnCameraChangeListener paramOnCameraChangeListener)
  {
    if (paramOnCameraChangeListener == null) {}
    try
    {
      this.pf.setOnCameraChangeListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnCameraChangeListener(new e.a()
    {
      public void onCameraChange(CameraPosition paramAnonymousCameraPosition)
      {
        paramOnCameraChangeListener.onCameraChange(paramAnonymousCameraPosition);
      }
    });
  }
  
  public final void setOnInfoWindowClickListener(final OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    if (paramOnInfoWindowClickListener == null) {}
    try
    {
      this.pf.setOnInfoWindowClickListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnInfoWindowClickListener(new f.a()
    {
      public void e(d paramAnonymousd)
      {
        paramOnInfoWindowClickListener.onInfoWindowClick(new Marker(paramAnonymousd));
      }
    });
  }
  
  public final void setOnMapClickListener(final OnMapClickListener paramOnMapClickListener)
  {
    if (paramOnMapClickListener == null) {}
    try
    {
      this.pf.setOnMapClickListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMapClickListener(new h.a()
    {
      public void onMapClick(LatLng paramAnonymousLatLng)
      {
        paramOnMapClickListener.onMapClick(paramAnonymousLatLng);
      }
    });
  }
  
  public void setOnMapLoadedCallback(final OnMapLoadedCallback paramOnMapLoadedCallback)
  {
    if (paramOnMapLoadedCallback == null) {}
    try
    {
      this.pf.setOnMapLoadedCallback(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMapLoadedCallback(new i.a()
    {
      public void onMapLoaded()
        throws RemoteException
      {
        paramOnMapLoadedCallback.onMapLoaded();
      }
    });
  }
  
  public final void setOnMapLongClickListener(final OnMapLongClickListener paramOnMapLongClickListener)
  {
    if (paramOnMapLongClickListener == null) {}
    try
    {
      this.pf.setOnMapLongClickListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMapLongClickListener(new j.a()
    {
      public void onMapLongClick(LatLng paramAnonymousLatLng)
      {
        paramOnMapLongClickListener.onMapLongClick(paramAnonymousLatLng);
      }
    });
  }
  
  public final void setOnMarkerClickListener(final OnMarkerClickListener paramOnMarkerClickListener)
  {
    if (paramOnMarkerClickListener == null) {}
    try
    {
      this.pf.setOnMarkerClickListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMarkerClickListener(new k.a()
    {
      public boolean a(d paramAnonymousd)
      {
        return paramOnMarkerClickListener.onMarkerClick(new Marker(paramAnonymousd));
      }
    });
  }
  
  public final void setOnMarkerDragListener(final OnMarkerDragListener paramOnMarkerDragListener)
  {
    if (paramOnMarkerDragListener == null) {}
    try
    {
      this.pf.setOnMarkerDragListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMarkerDragListener(new l.a()
    {
      public void b(d paramAnonymousd)
      {
        paramOnMarkerDragListener.onMarkerDragStart(new Marker(paramAnonymousd));
      }
      
      public void c(d paramAnonymousd)
      {
        paramOnMarkerDragListener.onMarkerDragEnd(new Marker(paramAnonymousd));
      }
      
      public void d(d paramAnonymousd)
      {
        paramOnMarkerDragListener.onMarkerDrag(new Marker(paramAnonymousd));
      }
    });
  }
  
  public final void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener paramOnMyLocationButtonClickListener)
  {
    if (paramOnMyLocationButtonClickListener == null) {}
    try
    {
      this.pf.setOnMyLocationButtonClickListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMyLocationButtonClickListener(new m.a()
    {
      public boolean onMyLocationButtonClick()
        throws RemoteException
      {
        return paramOnMyLocationButtonClickListener.onMyLocationButtonClick();
      }
    });
  }
  
  @Deprecated
  public final void setOnMyLocationChangeListener(final OnMyLocationChangeListener paramOnMyLocationChangeListener)
  {
    if (paramOnMyLocationChangeListener == null) {}
    try
    {
      this.pf.setOnMyLocationChangeListener(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    this.pf.setOnMyLocationChangeListener(new n.a()
    {
      public void d(b paramAnonymousb)
      {
        paramOnMyLocationChangeListener.onMyLocationChange((Location)com.google.android.gms.dynamic.c.b(paramAnonymousb));
      }
    });
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      this.pf.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void setTrafficEnabled(boolean paramBoolean)
  {
    try
    {
      this.pf.setTrafficEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void snapshot(SnapshotReadyCallback paramSnapshotReadyCallback)
  {
    snapshot(paramSnapshotReadyCallback, null);
  }
  
  public final void snapshot(final SnapshotReadyCallback paramSnapshotReadyCallback, Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    for (b localb = com.google.android.gms.dynamic.c.g(paramBitmap);; localb = null)
    {
      com.google.android.gms.dynamic.c localc = (com.google.android.gms.dynamic.c)localb;
      try
      {
        this.pf.snapshot(new o.a()
        {
          public void c(b paramAnonymousb)
            throws RemoteException
          {
            paramSnapshotReadyCallback.onSnapshotReady((Bitmap)com.google.android.gms.dynamic.c.b(paramAnonymousb));
          }
          
          public void onSnapshotReady(Bitmap paramAnonymousBitmap)
            throws RemoteException
          {
            paramSnapshotReadyCallback.onSnapshotReady(paramAnonymousBitmap);
          }
        }, localc);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  public final void stopAnimation()
  {
    try
    {
      this.pf.stopAnimation();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public static abstract interface CancelableCallback
  {
    public abstract void onCancel();
    
    public abstract void onFinish();
  }
  
  public static abstract interface InfoWindowAdapter
  {
    public abstract View getInfoContents(Marker paramMarker);
    
    public abstract View getInfoWindow(Marker paramMarker);
  }
  
  public static abstract interface OnCameraChangeListener
  {
    public abstract void onCameraChange(CameraPosition paramCameraPosition);
  }
  
  public static abstract interface OnInfoWindowClickListener
  {
    public abstract void onInfoWindowClick(Marker paramMarker);
  }
  
  public static abstract interface OnMapClickListener
  {
    public abstract void onMapClick(LatLng paramLatLng);
  }
  
  public static abstract interface OnMapLoadedCallback
  {
    public abstract void onMapLoaded();
  }
  
  public static abstract interface OnMapLongClickListener
  {
    public abstract void onMapLongClick(LatLng paramLatLng);
  }
  
  public static abstract interface OnMarkerClickListener
  {
    public abstract boolean onMarkerClick(Marker paramMarker);
  }
  
  public static abstract interface OnMarkerDragListener
  {
    public abstract void onMarkerDrag(Marker paramMarker);
    
    public abstract void onMarkerDragEnd(Marker paramMarker);
    
    public abstract void onMarkerDragStart(Marker paramMarker);
  }
  
  public static abstract interface OnMyLocationButtonClickListener
  {
    public abstract boolean onMyLocationButtonClick();
  }
  
  @Deprecated
  public static abstract interface OnMyLocationChangeListener
  {
    public abstract void onMyLocationChange(Location paramLocation);
  }
  
  public static abstract interface SnapshotReadyCallback
  {
    public abstract void onSnapshotReady(Bitmap paramBitmap);
  }
  
  private static final class a
    extends b.a
  {
    private final GoogleMap.CancelableCallback pw;
    
    a(GoogleMap.CancelableCallback paramCancelableCallback)
    {
      this.pw = paramCancelableCallback;
    }
    
    public void onCancel()
    {
      this.pw.onCancel();
    }
    
    public void onFinish()
    {
      this.pw.onFinish();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMap
 * JD-Core Version:    0.7.0.1
 */