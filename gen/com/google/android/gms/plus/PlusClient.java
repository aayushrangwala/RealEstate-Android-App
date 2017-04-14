package com.google.android.gms.plus;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fo;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public class PlusClient
  implements GooglePlayServicesClient
{
  final fl rb;
  
  PlusClient(fl paramfl)
  {
    this.rb = paramfl;
  }
  
  fl cR()
  {
    return this.rb;
  }
  
  public void clearDefaultAccount()
  {
    this.rb.clearDefaultAccount();
  }
  
  public void connect()
  {
    this.rb.connect();
  }
  
  public void disconnect()
  {
    this.rb.disconnect();
  }
  
  public String getAccountName()
  {
    return this.rb.getAccountName();
  }
  
  public Person getCurrentPerson()
  {
    return this.rb.getCurrentPerson();
  }
  
  public boolean isConnected()
  {
    return this.rb.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.rb.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.rb.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.rb.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void loadMoments(OnMomentsLoadedListener paramOnMomentsLoadedListener)
  {
    this.rb.loadMoments(paramOnMomentsLoadedListener);
  }
  
  public void loadMoments(OnMomentsLoadedListener paramOnMomentsLoadedListener, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    this.rb.loadMoments(paramOnMomentsLoadedListener, paramInt, paramString1, paramUri, paramString2, paramString3);
  }
  
  public void loadPeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, Collection<String> paramCollection)
  {
    this.rb.a(paramOnPeopleLoadedListener, paramCollection);
  }
  
  public void loadPeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, String... paramVarArgs)
  {
    this.rb.a(paramOnPeopleLoadedListener, paramVarArgs);
  }
  
  public void loadVisiblePeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, int paramInt, String paramString)
  {
    this.rb.loadVisiblePeople(paramOnPeopleLoadedListener, paramInt, paramString);
  }
  
  public void loadVisiblePeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, String paramString)
  {
    this.rb.loadVisiblePeople(paramOnPeopleLoadedListener, paramString);
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.rb.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.rb.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void removeMoment(String paramString)
  {
    this.rb.removeMoment(paramString);
  }
  
  public void revokeAccessAndDisconnect(OnAccessRevokedListener paramOnAccessRevokedListener)
  {
    this.rb.revokeAccessAndDisconnect(paramOnAccessRevokedListener);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.rb.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.rb.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void writeMoment(Moment paramMoment)
  {
    this.rb.writeMoment(paramMoment);
  }
  
  public static class Builder
  {
    private final GooglePlayServicesClient.OnConnectionFailedListener ir;
    private final Context mContext;
    private final GooglePlayServicesClient.ConnectionCallbacks rc;
    private final fo rd;
    
    public Builder(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this.mContext = paramContext;
      this.rc = paramConnectionCallbacks;
      this.ir = paramOnConnectionFailedListener;
      this.rd = new fo(this.mContext);
    }
    
    public PlusClient build()
    {
      return new PlusClient(new fl(this.mContext, this.rd.dh(), this.rc, this.ir));
    }
    
    public Builder clearScopes()
    {
      this.rd.dg();
      return this;
    }
    
    public Builder setAccountName(String paramString)
    {
      this.rd.Z(paramString);
      return this;
    }
    
    public Builder setActions(String... paramVarArgs)
    {
      this.rd.e(paramVarArgs);
      return this;
    }
    
    public Builder setScopes(String... paramVarArgs)
    {
      this.rd.d(paramVarArgs);
      return this;
    }
  }
  
  public static abstract interface OnAccessRevokedListener
  {
    public abstract void onAccessRevoked(ConnectionResult paramConnectionResult);
  }
  
  public static abstract interface OnMomentsLoadedListener
  {
    public abstract void onMomentsLoaded(ConnectionResult paramConnectionResult, MomentBuffer paramMomentBuffer, String paramString1, String paramString2);
  }
  
  public static abstract interface OnPeopleLoadedListener
  {
    public abstract void onPeopleLoaded(ConnectionResult paramConnectionResult, PersonBuffer paramPersonBuffer, String paramString);
  }
  
  public static abstract interface OrderBy
  {
    public static final int ALPHABETICAL = 0;
    public static final int BEST = 1;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusClient
 * JD-Core Version:    0.7.0.1
 */