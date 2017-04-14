package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.cw;
import com.google.android.gms.internal.dm;

public final class AppStateClient
  implements GooglePlayServicesClient
{
  public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
  public static final int STATUS_DEVELOPER_ERROR = 7;
  public static final int STATUS_INTERNAL_ERROR = 1;
  public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
  public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
  public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
  public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
  public static final int STATUS_OK = 0;
  public static final int STATUS_STATE_KEY_LIMIT_EXCEEDED = 2003;
  public static final int STATUS_STATE_KEY_NOT_FOUND = 2002;
  public static final int STATUS_WRITE_OUT_OF_DATE_VERSION = 2000;
  public static final int STATUS_WRITE_SIZE_EXCEEDED = 2001;
  private final cw io;
  
  private AppStateClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    this.io = new cw(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, paramArrayOfString);
  }
  
  public void connect()
  {
    this.io.connect();
  }
  
  public void deleteState(OnStateDeletedListener paramOnStateDeletedListener, int paramInt)
  {
    this.io.deleteState(paramOnStateDeletedListener, paramInt);
  }
  
  public void disconnect()
  {
    this.io.disconnect();
  }
  
  public int getMaxNumKeys()
  {
    return this.io.getMaxNumKeys();
  }
  
  public int getMaxStateSize()
  {
    return this.io.getMaxStateSize();
  }
  
  public boolean isConnected()
  {
    return this.io.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.io.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.io.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.io.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void listStates(OnStateListLoadedListener paramOnStateListLoadedListener)
  {
    this.io.listStates(paramOnStateListLoadedListener);
  }
  
  public void loadState(OnStateLoadedListener paramOnStateLoadedListener, int paramInt)
  {
    this.io.loadState(paramOnStateLoadedListener, paramInt);
  }
  
  public void reconnect()
  {
    this.io.disconnect();
    this.io.connect();
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.io.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.io.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void resolveState(OnStateLoadedListener paramOnStateLoadedListener, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    this.io.resolveState(paramOnStateLoadedListener, paramInt, paramString, paramArrayOfByte);
  }
  
  public void signOut()
  {
    this.io.signOut(null);
  }
  
  public void signOut(OnSignOutCompleteListener paramOnSignOutCompleteListener)
  {
    dm.a(paramOnSignOutCompleteListener, "Must provide a valid listener");
    this.io.signOut(paramOnSignOutCompleteListener);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.io.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.io.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void updateState(int paramInt, byte[] paramArrayOfByte)
  {
    this.io.a(null, paramInt, paramArrayOfByte);
  }
  
  public void updateStateImmediate(OnStateLoadedListener paramOnStateLoadedListener, int paramInt, byte[] paramArrayOfByte)
  {
    dm.a(paramOnStateLoadedListener, "Must provide a valid listener");
    this.io.a(paramOnStateLoadedListener, paramInt, paramArrayOfByte);
  }
  
  public static final class Builder
  {
    private static final String[] ip = { "https://www.googleapis.com/auth/appstate" };
    private GooglePlayServicesClient.ConnectionCallbacks iq;
    private GooglePlayServicesClient.OnConnectionFailedListener ir;
    private String[] is;
    private String it;
    private Context mContext;
    
    public Builder(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this.mContext = paramContext;
      this.iq = paramConnectionCallbacks;
      this.ir = paramOnConnectionFailedListener;
      this.is = ip;
      this.it = "<<default account>>";
    }
    
    public AppStateClient create()
    {
      return new AppStateClient(this.mContext, this.iq, this.ir, this.it, this.is, null);
    }
    
    public Builder setAccountName(String paramString)
    {
      this.it = ((String)dm.e(paramString));
      return this;
    }
    
    public Builder setScopes(String... paramVarArgs)
    {
      this.is = paramVarArgs;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateClient
 * JD-Core Version:    0.7.0.1
 */