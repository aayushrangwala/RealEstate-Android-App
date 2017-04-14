package com.google.android.gms.wallet;

import android.app.Activity;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.gj;

public class WalletClient
  implements GooglePlayServicesClient
{
  private final gj uq;
  
  public WalletClient(Activity paramActivity, int paramInt1, String paramString, int paramInt2, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.uq = new gj(paramActivity, paramConnectionCallbacks, paramOnConnectionFailedListener, paramInt1, paramString, paramInt2);
  }
  
  public WalletClient(Activity paramActivity, int paramInt, String paramString, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramActivity, paramInt, paramString, 0, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public void changeMaskedWallet(String paramString1, String paramString2, int paramInt)
  {
    this.uq.changeMaskedWallet(paramString1, paramString2, paramInt);
  }
  
  public void checkForPreAuthorization(int paramInt)
  {
    this.uq.checkForPreAuthorization(paramInt);
  }
  
  public void connect()
  {
    this.uq.connect();
  }
  
  public void disconnect()
  {
    this.uq.disconnect();
  }
  
  public boolean isConnected()
  {
    return this.uq.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.uq.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.uq.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.uq.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void loadFullWallet(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    this.uq.loadFullWallet(paramFullWalletRequest, paramInt);
  }
  
  public void loadMaskedWallet(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    this.uq.loadMaskedWallet(paramMaskedWalletRequest, paramInt);
  }
  
  public void notifyTransactionStatus(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    this.uq.notifyTransactionStatus(paramNotifyTransactionStatusRequest);
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.uq.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.uq.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.uq.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.uq.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.WalletClient
 * JD-Core Version:    0.7.0.1
 */