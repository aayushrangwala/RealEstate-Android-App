package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.a;
import java.io.IOException;

public final class AdvertisingIdClient
{
  private static a g(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      a locala;
      Intent localIntent;
      throw new IOException("Connection failure");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        GooglePlayServicesUtil.m(paramContext);
        locala = new a();
        localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
        localIntent.setPackage("com.google.android.gms");
        if (!paramContext.bindService(localIntent, locala, 1)) {
          break label79;
        }
        return locala;
      }
      catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
      {
        throw new IOException(localGooglePlayServicesNotAvailableException);
      }
      localNameNotFoundException = localNameNotFoundException;
      throw new GooglePlayServicesNotAvailableException(9);
    }
  }
  
  /* Error */
  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, java.lang.IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: ldc 77
    //   2: invokestatic 82	com/google/android/gms/internal/dm:x	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: invokestatic 84	com/google/android/gms/ads/identifier/AdvertisingIdClient:g	(Landroid/content/Context;)Lcom/google/android/gms/common/a;
    //   9: astore_1
    //   10: aload_1
    //   11: invokevirtual 88	com/google/android/gms/common/a:aG	()Landroid/os/IBinder;
    //   14: invokestatic 94	com/google/android/gms/internal/p$a:b	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/p;
    //   17: astore 6
    //   19: new 96	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   22: dup
    //   23: aload 6
    //   25: invokeinterface 102 1 0
    //   30: aload 6
    //   32: iconst_1
    //   33: invokeinterface 106 2 0
    //   38: invokespecial 109	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   41: astore 7
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual 113	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   48: aload 7
    //   50: areturn
    //   51: astore 4
    //   53: ldc 115
    //   55: ldc 117
    //   57: aload 4
    //   59: invokestatic 123	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   62: pop
    //   63: new 12	java/io/IOException
    //   66: dup
    //   67: ldc 125
    //   69: invokespecial 67	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   72: athrow
    //   73: astore_3
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual 113	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   79: aload_3
    //   80: athrow
    //   81: astore_2
    //   82: new 12	java/io/IOException
    //   85: dup
    //   86: ldc 127
    //   88: invokespecial 67	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	paramContext	Context
    //   9	67	1	locala	a
    //   81	1	2	localInterruptedException	java.lang.InterruptedException
    //   73	7	3	localObject	Object
    //   51	7	4	localRemoteException	android.os.RemoteException
    //   17	14	6	localp	com.google.android.gms.internal.p
    //   41	8	7	localInfo	Info
    // Exception table:
    //   from	to	target	type
    //   10	43	51	android/os/RemoteException
    //   10	43	73	finally
    //   53	73	73	finally
    //   82	92	73	finally
    //   10	43	81	java/lang/InterruptedException
  }
  
  public static final class Info
  {
    private final String dX;
    private final boolean dY;
    
    Info(String paramString, boolean paramBoolean)
    {
      this.dX = paramString;
      this.dY = paramBoolean;
    }
    
    public String getId()
    {
      return this.dX;
    }
    
    public boolean isLimitAdTrackingEnabled()
    {
      return this.dY;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.7.0.1
 */