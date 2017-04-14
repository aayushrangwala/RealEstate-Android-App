package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

public class gj
  extends de<gh>
{
  private final Activity fD;
  private final String it;
  private final int mTheme;
  private final int us;
  
  public gj(Activity paramActivity, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt1, String paramString, int paramInt2)
  {
    super(paramActivity, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.fD = paramActivity;
    this.us = paramInt1;
    this.it = paramString;
    this.mTheme = paramInt2;
  }
  
  private Bundle eb()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.us);
    localBundle.putString("androidPackageName", this.fD.getPackageName());
    if (!TextUtils.isEmpty(this.it)) {
      localBundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(this.it, "com.google"));
    }
    localBundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.mTheme);
    return localBundle;
  }
  
  protected void a(dj paramdj, de.d paramd)
    throws RemoteException
  {
    paramdj.a(paramd, 4030500);
  }
  
  protected String ag()
  {
    return "com.google.android.gms.wallet.service.BIND";
  }
  
  protected String ah()
  {
    return "com.google.android.gms.wallet.internal.IOwService";
  }
  
  protected gh au(IBinder paramIBinder)
  {
    return gh.a.as(paramIBinder);
  }
  
  public void changeMaskedWallet(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle = eb();
    a locala = new a(paramInt);
    try
    {
      ((gh)bd()).a(paramString1, paramString2, localBundle, locala);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException changing masked wallet", localRemoteException);
      locala.a(8, null, null);
    }
  }
  
  public void checkForPreAuthorization(int paramInt)
  {
    Bundle localBundle = eb();
    a locala = new a(paramInt);
    try
    {
      ((gh)bd()).a(localBundle, locala);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", localRemoteException);
      locala.a(8, false, null);
    }
  }
  
  public void loadFullWallet(FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    a locala = new a(paramInt);
    Bundle localBundle = eb();
    try
    {
      ((gh)bd()).a(paramFullWalletRequest, localBundle, locala);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException getting full wallet", localRemoteException);
      locala.a(8, null, null);
    }
  }
  
  public void loadMaskedWallet(MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Bundle localBundle = eb();
    a locala = new a(paramInt);
    try
    {
      ((gh)bd()).a(paramMaskedWalletRequest, localBundle, locala);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("WalletClientImpl", "RemoteException getting masked wallet", localRemoteException);
      locala.a(8, null, null);
    }
  }
  
  public void notifyTransactionStatus(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Bundle localBundle = eb();
    try
    {
      ((gh)bd()).a(paramNotifyTransactionStatusRequest, localBundle);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  final class a
    extends gi.a
  {
    private final int ky;
    
    public a(int paramInt)
    {
      this.ky = paramInt;
    }
    
    public void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
    {
      PendingIntent localPendingIntent = null;
      if (paramBundle != null) {
        localPendingIntent = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
      }
      ConnectionResult localConnectionResult = new ConnectionResult(paramInt, localPendingIntent);
      if (localConnectionResult.hasResolution()) {
        try
        {
          localConnectionResult.startResolutionForResult(gj.a(gj.this), this.ky);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          Log.w("WalletClientImpl", "Exception starting pending intent", localSendIntentException);
          return;
        }
      }
      Intent localIntent;
      if (localConnectionResult.isSuccess())
      {
        i = -1;
        localIntent = new Intent();
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", paramFullWallet);
        try
        {
          gj.a(gj.this).createPendingResult(this.ky, localIntent, 1073741824).send(i);
          return;
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          Log.w("WalletClientImpl", "Exception setting pending result", localCanceledException);
          return;
        }
      }
      if (paramInt == 408) {}
      for (int i = 0;; i = 1)
      {
        localIntent = new Intent();
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    
    public void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
    {
      PendingIntent localPendingIntent = null;
      if (paramBundle != null) {
        localPendingIntent = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
      }
      ConnectionResult localConnectionResult = new ConnectionResult(paramInt, localPendingIntent);
      if (localConnectionResult.hasResolution()) {
        try
        {
          localConnectionResult.startResolutionForResult(gj.a(gj.this), this.ky);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          Log.w("WalletClientImpl", "Exception starting pending intent", localSendIntentException);
          return;
        }
      }
      Intent localIntent;
      if (localConnectionResult.isSuccess())
      {
        i = -1;
        localIntent = new Intent();
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", paramMaskedWallet);
        try
        {
          gj.a(gj.this).createPendingResult(this.ky, localIntent, 1073741824).send(i);
          return;
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          Log.w("WalletClientImpl", "Exception setting pending result", localCanceledException);
          return;
        }
      }
      if (paramInt == 408) {}
      for (int i = 0;; i = 1)
      {
        localIntent = new Intent();
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    
    public void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", paramBoolean);
      try
      {
        gj.a(gj.this).createPendingResult(this.ky, localIntent, 1073741824).send(-1);
        return;
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        Log.w("WalletClientImpl", "Exception setting pending result", localCanceledException);
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gj
 * JD-Core Version:    0.7.0.1
 */