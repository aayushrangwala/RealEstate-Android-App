package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
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

public class SupportMapFragment
  extends Fragment
{
  private GoogleMap pI;
  private final b pT = new b(this);
  
  public static SupportMapFragment newInstance()
  {
    return new SupportMapFragment();
  }
  
  public static SupportMapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    SupportMapFragment localSupportMapFragment = new SupportMapFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localSupportMapFragment.setArguments(localBundle);
    return localSupportMapFragment;
  }
  
  protected IMapFragmentDelegate cD()
  {
    this.pT.cE();
    if (this.pT.bP() == null) {
      return null;
    }
    return ((a)this.pT.bP()).cD();
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
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    b.a(this.pT, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pT.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.pT.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onDestroy()
  {
    this.pT.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    this.pT.onDestroyView();
    super.onDestroyView();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    b.a(this.pT, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.pT.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    this.pT.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    this.pT.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.pT.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.onSaveInstanceState(paramBundle);
    this.pT.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  static class a
    implements LifecycleDelegate
  {
    private final IMapFragmentDelegate pK;
    private final Fragment pU;
    
    public a(Fragment paramFragment, IMapFragmentDelegate paramIMapFragmentDelegate)
    {
      this.pK = ((IMapFragmentDelegate)dm.e(paramIMapFragmentDelegate));
      this.pU = ((Fragment)dm.e(paramFragment));
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
        Bundle localBundle = this.pU.getArguments();
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
    extends a<SupportMapFragment.a>
  {
    private Activity fD;
    protected d<SupportMapFragment.a> pL;
    private final Fragment pU;
    
    b(Fragment paramFragment)
    {
      this.pU = paramFragment;
    }
    
    private void setActivity(Activity paramActivity)
    {
      this.fD = paramActivity;
      cE();
    }
    
    protected void a(d<SupportMapFragment.a> paramd)
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
        this.pL.a(new SupportMapFragment.a(this.pU, localIMapFragmentDelegate));
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
 * Qualified Name:     com.google.android.gms.maps.SupportMapFragment
 * JD-Core Version:    0.7.0.1
 */