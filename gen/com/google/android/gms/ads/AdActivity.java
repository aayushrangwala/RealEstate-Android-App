package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.cn;

public final class AdActivity
  extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  public static final String SIMPLE_CLASS_NAME = "AdActivity";
  private bn dH;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dH = bm.a(this);
    if (this.dH == null)
    {
      cn.q("Could not create ad overlay.");
      finish();
      return;
    }
    try
    {
      this.dH.onCreate(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not forward onCreate to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      if (this.dH != null) {
        this.dH.onDestroy();
      }
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        cn.b("Could not forward onDestroy to ad overlay:", localRemoteException);
      }
    }
  }
  
  protected void onPause()
  {
    try
    {
      if (this.dH != null) {
        this.dH.onPause();
      }
      super.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        cn.b("Could not forward onPause to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.dH != null) {
        this.dH.onRestart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not forward onRestart to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    try
    {
      if (this.dH != null) {
        this.dH.onResume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not forward onResume to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (this.dH != null) {
        this.dH.onSaveInstanceState(paramBundle);
      }
      super.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        cn.b("Could not forward onSaveInstanceState to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    try
    {
      if (this.dH != null) {
        this.dH.onStart();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not forward onStart to ad overlay:", localRemoteException);
      finish();
    }
  }
  
  protected void onStop()
  {
    try
    {
      if (this.dH != null) {
        this.dH.onStop();
      }
      super.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        cn.b("Could not forward onStop to ad overlay:", localRemoteException);
        finish();
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdActivity
 * JD-Core Version:    0.7.0.1
 */