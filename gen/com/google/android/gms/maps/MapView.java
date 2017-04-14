package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView
  extends FrameLayout
{
  private GoogleMap pI;
  private final b pM;
  
  public MapView(Context paramContext)
  {
    super(paramContext);
    this.pM = new b(this, paramContext, null);
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.pM = new b(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.pM = new b(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
  }
  
  public MapView(Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    super(paramContext);
    this.pM = new b(this, paramContext, paramGoogleMapOptions);
  }
  
  public final GoogleMap getMap()
  {
    if (this.pI != null) {
      return this.pI;
    }
    this.pM.cE();
    if (this.pM.bP() == null) {
      return null;
    }
    try
    {
      this.pI = new GoogleMap(((a)this.pM.bP()).cF().getMap());
      return this.pI;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    this.pM.onCreate(paramBundle);
    if (this.pM.bP() == null) {
      this.pM.a(this);
    }
  }
  
  public final void onDestroy()
  {
    this.pM.onDestroy();
  }
  
  public final void onLowMemory()
  {
    this.pM.onLowMemory();
  }
  
  public final void onPause()
  {
    this.pM.onPause();
  }
  
  public final void onResume()
  {
    this.pM.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    this.pM.onSaveInstanceState(paramBundle);
  }
  
  static class a
    implements LifecycleDelegate
  {
    private final ViewGroup pN;
    private final IMapViewDelegate pO;
    private View pP;
    
    public a(ViewGroup paramViewGroup, IMapViewDelegate paramIMapViewDelegate)
    {
      this.pO = ((IMapViewDelegate)dm.e(paramIMapViewDelegate));
      this.pN = ((ViewGroup)dm.e(paramViewGroup));
    }
    
    public IMapViewDelegate cF()
    {
      return this.pO;
    }
    
    public void onCreate(Bundle paramBundle)
    {
      try
      {
        this.pO.onCreate(paramBundle);
        this.pP = ((View)com.google.android.gms.dynamic.c.b(this.pO.getView()));
        this.pN.removeAllViews();
        this.pN.addView(this.pP);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }
    
    public void onDestroy()
    {
      try
      {
        this.pO.onDestroy();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onDestroyView()
    {
      throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }
    
    public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
    {
      throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }
    
    public void onLowMemory()
    {
      try
      {
        this.pO.onLowMemory();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onPause()
    {
      try
      {
        this.pO.onPause();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onResume()
    {
      try
      {
        this.pO.onResume();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onSaveInstanceState(Bundle paramBundle)
    {
      try
      {
        this.pO.onSaveInstanceState(paramBundle);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  static class b
    extends a<MapView.a>
  {
    private final Context mContext;
    protected d<MapView.a> pL;
    private final ViewGroup pQ;
    private final GoogleMapOptions pR;
    
    b(ViewGroup paramViewGroup, Context paramContext, GoogleMapOptions paramGoogleMapOptions)
    {
      this.pQ = paramViewGroup;
      this.mContext = paramContext;
      this.pR = paramGoogleMapOptions;
    }
    
    protected void a(d<MapView.a> paramd)
    {
      this.pL = paramd;
      cE();
    }
    
    public void cE()
    {
      if ((this.pL != null) && (bP() == null)) {}
      try
      {
        IMapViewDelegate localIMapViewDelegate = q.u(this.mContext).a(com.google.android.gms.dynamic.c.g(this.mContext), this.pR);
        this.pL.a(new MapView.a(this.pQ, localIMapViewDelegate));
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
      catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapView
 * JD-Core Version:    0.7.0.1
 */