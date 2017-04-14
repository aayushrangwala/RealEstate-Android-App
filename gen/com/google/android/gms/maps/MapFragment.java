package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.p;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapFragment
  extends Fragment
{
  private final b pH = new b(this);
  private GoogleMap pI;
  
  public static MapFragment newInstance()
  {
    return new MapFragment();
  }
  
  public static MapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    MapFragment localMapFragment = new MapFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localMapFragment.setArguments(localBundle);
    return localMapFragment;
  }
  
  protected IMapFragmentDelegate cD()
  {
    this.pH.cE();
    if (this.pH.bP() == null) {
      return null;
    }
    return ((a)this.pH.bP()).cD();
  }
  
  public final GoogleMap getMap()
  {
    IMapFragmentDelegate localIMapFragmentDelegate = cD();
    if (localIMapFragmentDelegate == null) {}
    for (;;)
    {
      return null;
      try
      {
        IGoogleMapDelegate localIGoogleMapDelegate = localIMapFragmentDelegate.getMap();
        if (localIGoogleMapDelegate == null) {
          continue;
        }
        if ((this.pI == null) || (this.pI.cu().asBinder() != localIGoogleMapDelegate.asBinder())) {
          this.pI = new GoogleMap(localIGoogleMapDelegate);
        }
        return this.pI;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    b.a(this.pH, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pH.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.pH.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    this.pH.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.pH.onDestroyView();
    super.onDestroyView();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    b.a(this.pH, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.pH.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.pH.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.pH.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.pH.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    }
    super.onSaveInstanceState(paramBundle);
    this.pH.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  static class a
    implements LifecycleDelegate
  {
    private final Fragment pJ;
    private final IMapFragmentDelegate pK;
    
    public a(Fragment paramFragment, IMapFragmentDelegate paramIMapFragmentDelegate)
    {
      this.pK = ((IMapFragmentDelegate)dm.e(paramIMapFragmentDelegate));
      this.pJ = ((Fragment)dm.e(paramFragment));
    }
    
    public IMapFragmentDelegate cD()
    {
      return this.pK;
    }
    
    public void onCreate(Bundle paramBundle)
    {
      if (paramBundle == null) {}
      try
      {
        paramBundle = new Bundle();
        Bundle localBundle = this.pJ.getArguments();
        if ((localBundle != null) && (localBundle.containsKey("MapOptions"))) {
          p.a(paramBundle, "MapOptions", localBundle.getParcelable("MapOptions"));
        }
        this.pK.onCreate(paramBundle);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      try
      {
        b localb = this.pK.onCreateView(com.google.android.gms.dynamic.c.g(paramLayoutInflater), com.google.android.gms.dynamic.c.g(paramViewGroup), paramBundle);
        return (View)com.google.android.gms.dynamic.c.b(localb);
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onDestroy()
    {
      try
      {
        this.pK.onDestroy();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onDestroyView()
    {
      try
      {
        this.pK.onDestroyView();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
    {
      GoogleMapOptions localGoogleMapOptions = (GoogleMapOptions)paramBundle1.getParcelable("MapOptions");
      try
      {
        this.pK.onInflate(com.google.android.gms.dynamic.c.g(paramActivity), localGoogleMapOptions, paramBundle2);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
    
    public void onLowMemory()
    {
      try
      {
        this.pK.onLowMemory();
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
        this.pK.onPause();
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
        this.pK.onResume();
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
        this.pK.onSaveInstanceState(paramBundle);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  static class b
    extends a<MapFragment.a>
  {
    private Activity fD;
    private final Fragment pJ;
    protected d<MapFragment.a> pL;
    
    b(Fragment paramFragment)
    {
      this.pJ = paramFragment;
    }
    
    private void setActivity(Activity paramActivity)
    {
      this.fD = paramActivity;
      cE();
    }
    
    protected void a(d<MapFragment.a> paramd)
    {
      this.pL = paramd;
      cE();
    }
    
    public void cE()
    {
      if ((this.fD != null) && (this.pL != null) && (bP() == null)) {}
      try
      {
        MapsInitializer.initialize(this.fD);
        IMapFragmentDelegate localIMapFragmentDelegate = q.u(this.fD).f(com.google.android.gms.dynamic.c.g(this.fD));
        this.pL.a(new MapFragment.a(this.pJ, localIMapFragmentDelegate));
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
 * Qualified Name:     com.google.android.gms.maps.MapFragment
 * JD-Core Version:    0.7.0.1
 */