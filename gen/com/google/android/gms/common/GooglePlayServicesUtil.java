package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.ek;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class GooglePlayServicesUtil
{
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 4030500;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  static final byte[][] iQ;
  static final byte[][] iR;
  static final byte[][] iS;
  static final byte[][] iT;
  private static final byte[][] iU;
  private static final byte[][] iV;
  static final byte[][] iW;
  public static boolean iX = false;
  public static boolean iY = false;
  static boolean iZ = false;
  private static int ja = -1;
  private static final Object jb = new Object();
  
  static
  {
    byte[][] arrayOfByte1 = new byte[2][];
    arrayOfByte1[0] = t("");
    arrayOfByte1[1] = t("");
    iQ = arrayOfByte1;
    byte[][] arrayOfByte2 = new byte[2][];
    arrayOfByte2[0] = t("");
    arrayOfByte2[1] = t("");
    iR = arrayOfByte2;
    byte[][] arrayOfByte3 = new byte[1][];
    arrayOfByte3[0] = t("");
    iS = arrayOfByte3;
    byte[][] arrayOfByte4 = new byte[2][];
    arrayOfByte4[0] = t("");
    arrayOfByte4[1] = t("");
    iT = arrayOfByte4;
    byte[][][] arrayOfByte = new byte[4][][];
    arrayOfByte[0] = iQ;
    arrayOfByte[1] = iR;
    arrayOfByte[2] = iS;
    arrayOfByte[3] = iT;
    iU = a(arrayOfByte);
    byte[][] arrayOfByte5 = new byte[3][];
    arrayOfByte5[0] = iQ[0];
    arrayOfByte5[1] = iR[0];
    arrayOfByte5[2] = iT[0];
    iV = arrayOfByte5;
    byte[][] arrayOfByte6 = new byte[1][];
    arrayOfByte6[0] = t("");
    iW = arrayOfByte6;
  }
  
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener, int paramInt3)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity).setMessage(b(paramActivity, paramInt1, paramInt3));
    if (paramOnCancelListener != null) {
      localBuilder.setOnCancelListener(paramOnCancelListener);
    }
    dc localdc = new dc(paramActivity, a(paramActivity, paramInt1, paramInt3), paramInt2);
    String str = b(paramActivity, paramInt1);
    if (str != null) {
      localBuilder.setPositiveButton(str, localdc);
    }
    switch (paramInt1)
    {
    default: 
      Log.e("GooglePlayServicesUtil", "Unexpected error code " + paramInt1);
      return localBuilder.setTitle(R.string.common_google_play_services_unknown_issue).create();
    case 0: 
      return null;
    case 4: 
    case 6: 
      return localBuilder.setTitle(R.string.common_google_play_services_unknown_issue).create();
    case 1: 
      return localBuilder.setTitle(R.string.common_google_play_services_install_title).create();
    case 3: 
      return localBuilder.setTitle(R.string.common_google_play_services_enable_title).create();
    case 2: 
      return localBuilder.setTitle(R.string.common_google_play_services_update_title).create();
    case 9: 
      Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
      return localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
    case 7: 
      Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
      return localBuilder.setTitle(R.string.common_google_play_services_network_error_title).create();
    case 8: 
      Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
      return localBuilder.setTitle(R.string.common_google_play_services_unknown_issue).create();
    case 10: 
      Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
      return localBuilder.setTitle(R.string.common_google_play_services_unknown_issue).create();
    case 5: 
      Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
      return localBuilder.setTitle(R.string.common_google_play_services_invalid_account_title).create();
    case 11: 
      Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
      return localBuilder.setTitle(R.string.common_google_play_services_unknown_issue).create();
    }
    Log.e("GooglePlayServicesUtil", "The date of the device is not valid.");
    return localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
  }
  
  public static Intent a(Context paramContext, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      if (n(paramInt2))
      {
        if (o(paramContext)) {
          return dg.C("com.google.android.gms");
        }
        return dg.B("com.google.android.apps.bazaar");
      }
      return dg.B("com.google.android.gms");
    case 3: 
      return dg.z("com.google.android.gms");
    }
    return dg.bj();
  }
  
  public static boolean a(Resources paramResources)
  {
    if ((0xF & paramResources.getConfiguration().screenLayout) > 3) {}
    for (int i = 1;; i = 0)
    {
      boolean bool2;
      if ((!ek.bJ()) || (i == 0))
      {
        boolean bool1 = b(paramResources);
        bool2 = false;
        if (!bool1) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
  }
  
  private static byte[] a(PackageInfo paramPackageInfo, byte[]... paramVarArgs)
  {
    CertificateFactory localCertificateFactory;
    try
    {
      localCertificateFactory = CertificateFactory.getInstance("X509");
      if (paramPackageInfo.signatures.length != 1)
      {
        Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
        return null;
      }
    }
    catch (CertificateException localCertificateException1)
    {
      Log.w("GooglePlayServicesUtil", "Could not get certificate instance.");
      return null;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramPackageInfo.signatures[0].toByteArray());
    byte[] arrayOfByte1;
    label153:
    for (;;)
    {
      try
      {
        X509Certificate localX509Certificate = (X509Certificate)localCertificateFactory.generateCertificate(localByteArrayInputStream);
        int i;
        byte[] arrayOfByte2;
        i++;
      }
      catch (CertificateException localCertificateException2)
      {
        try
        {
          localX509Certificate.checkValidity();
          arrayOfByte1 = paramPackageInfo.signatures[0].toByteArray();
          i = 0;
          if (i >= paramVarArgs.length) {
            break;
          }
          arrayOfByte2 = paramVarArgs[i];
          if (!Arrays.equals(arrayOfByte2, arrayOfByte1)) {
            break label153;
          }
          return arrayOfByte2;
        }
        catch (CertificateExpiredException localCertificateExpiredException)
        {
          Log.w("GooglePlayServicesUtil", "Certificate has expired.");
          return null;
        }
        catch (CertificateNotYetValidException localCertificateNotYetValidException)
        {
          Log.w("GooglePlayServicesUtil", "Certificate is not yet valid.");
          return null;
        }
        localCertificateException2 = localCertificateException2;
        Log.w("GooglePlayServicesUtil", "Could not generate certificate.");
        return null;
      }
    }
    if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
      Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte1, 0));
    }
    return null;
  }
  
  private static byte[][] a(byte[][]... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += paramVarArgs[j].length;
      j++;
    }
    byte[][] arrayOfByte = new byte[k][];
    int m = paramVarArgs.length;
    int n = 0;
    int i2;
    for (int i1 = 0; n < m; i1 = i2)
    {
      byte[][] arrayOfByte1 = paramVarArgs[n];
      i2 = i1;
      int i3 = 0;
      while (i3 < arrayOfByte1.length)
      {
        int i4 = i2 + 1;
        arrayOfByte[i2] = arrayOfByte1[i3];
        i3++;
        i2 = i4;
      }
      n++;
    }
    return arrayOfByte;
  }
  
  public static boolean aI()
  {
    if (iX) {
      return iY;
    }
    return "user".equals(Build.TYPE);
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(17039370);
    case 1: 
      return localResources.getString(R.string.common_google_play_services_install_button);
    case 3: 
      return localResources.getString(R.string.common_google_play_services_enable_button);
    }
    return localResources.getString(R.string.common_google_play_services_update_button);
  }
  
  public static String b(Context paramContext, int paramInt1, int paramInt2)
  {
    Resources localResources = paramContext.getResources();
    String str;
    switch (paramInt1)
    {
    case 4: 
    case 6: 
    case 8: 
    case 10: 
    case 11: 
    default: 
      str = localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1: 
    case 3: 
    case 2: 
      do
      {
        return str;
        if (a(paramContext.getResources())) {}
        for (str = localResources.getString(R.string.common_google_play_services_install_text_tablet); n(paramInt2); str = localResources.getString(R.string.common_google_play_services_install_text_phone)) {
          return str + " (via Bazaar)";
        }
        return localResources.getString(R.string.common_google_play_services_enable_text);
        str = localResources.getString(R.string.common_google_play_services_update_text);
      } while (!n(paramInt2));
      return str + " (via Bazaar)";
    case 9: 
      return localResources.getString(R.string.common_google_play_services_unsupported_text);
    case 7: 
      return localResources.getString(R.string.common_google_play_services_network_error_text);
    case 5: 
      return localResources.getString(R.string.common_google_play_services_invalid_account_text);
    }
    return localResources.getString(R.string.common_google_play_services_unsupported_date_text);
  }
  
  private static boolean b(Resources paramResources)
  {
    Configuration localConfiguration = paramResources.getConfiguration();
    boolean bool1 = ek.bL();
    boolean bool2 = false;
    if (bool1)
    {
      int i = 0xF & localConfiguration.screenLayout;
      bool2 = false;
      if (i <= 3)
      {
        int j = localConfiguration.smallestScreenWidthDp;
        bool2 = false;
        if (j >= 600) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return a(paramInt1, paramActivity, paramInt2, null, -1);
  }
  
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramInt1, paramActivity, paramInt2, paramOnCancelListener, -1);
  }
  
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    Intent localIntent = a(paramContext, paramInt1, -1);
    if (localIntent == null) {
      return null;
    }
    return PendingIntent.getActivity(paramContext, paramInt2, localIntent, 268435456);
  }
  
  public static String getErrorString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN_ERROR_CODE";
    case 0: 
      return "SUCCESS";
    case 1: 
      return "SERVICE_MISSING";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 7: 
      return "NETWORK_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 9: 
      return "SERVICE_INVALID";
    case 10: 
      return "DEVELOPER_ERROR";
    case 11: 
      return "LICENSE_CHECK_FAILED";
    }
    return "DATE_INVALID";
  }
  
  /* Error */
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    // Byte code:
    //   0: new 426	android/net/Uri$Builder
    //   3: dup
    //   4: invokespecial 427	android/net/Uri$Builder:<init>	()V
    //   7: ldc_w 429
    //   10: invokevirtual 433	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   13: ldc 8
    //   15: invokevirtual 436	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   18: ldc_w 438
    //   21: invokevirtual 441	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   24: ldc_w 443
    //   27: invokevirtual 441	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   30: invokevirtual 447	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   33: astore_1
    //   34: aload_0
    //   35: invokevirtual 451	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: aload_1
    //   39: invokevirtual 457	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   42: astore 4
    //   44: new 459	java/util/Scanner
    //   47: dup
    //   48: aload 4
    //   50: invokespecial 462	java/util/Scanner:<init>	(Ljava/io/InputStream;)V
    //   53: ldc_w 464
    //   56: invokevirtual 468	java/util/Scanner:useDelimiter	(Ljava/lang/String;)Ljava/util/Scanner;
    //   59: invokevirtual 471	java/util/Scanner:next	()Ljava/lang/String;
    //   62: astore 7
    //   64: aload 7
    //   66: astore_3
    //   67: aload 4
    //   69: ifnull +43 -> 112
    //   72: aload 4
    //   74: invokevirtual 476	java/io/InputStream:close	()V
    //   77: aload_3
    //   78: areturn
    //   79: astore 6
    //   81: aload 4
    //   83: ifnull +31 -> 114
    //   86: aload 4
    //   88: invokevirtual 476	java/io/InputStream:close	()V
    //   91: goto +23 -> 114
    //   94: astore 5
    //   96: aload 4
    //   98: ifnull +8 -> 106
    //   101: aload 4
    //   103: invokevirtual 476	java/io/InputStream:close	()V
    //   106: aload 5
    //   108: athrow
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_3
    //   112: aload_3
    //   113: areturn
    //   114: aconst_null
    //   115: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	paramContext	Context
    //   33	6	1	localUri	android.net.Uri
    //   109	1	2	localException	java.lang.Exception
    //   66	47	3	str1	String
    //   42	60	4	localInputStream	java.io.InputStream
    //   94	13	5	localObject	Object
    //   79	1	6	localNoSuchElementException	java.util.NoSuchElementException
    //   62	3	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   44	64	79	java/util/NoSuchElementException
    //   44	64	94	finally
    //   34	44	109	java/lang/Exception
    //   72	77	109	java/lang/Exception
    //   86	91	109	java/lang/Exception
    //   101	106	109	java/lang/Exception
    //   106	109	109	java/lang/Exception
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      Resources localResources = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return localResources;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
      if (System.currentTimeMillis() < 1227312000288L) {
        return 12;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
      }
      n(paramContext);
      byte[] arrayOfByte;
      try
      {
        PackageInfo localPackageInfo1 = localPackageManager.getPackageInfo("com.android.vending", 64);
        arrayOfByte = a(localPackageInfo1, iQ);
        if (arrayOfByte == null)
        {
          Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          return 9;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
        return 9;
      }
      PackageInfo localPackageInfo2;
      try
      {
        localPackageInfo2 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
        if (a(localPackageInfo2, new byte[][] { arrayOfByte }) == null)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
          return 9;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        return 1;
      }
      if (localPackageInfo2.versionCode < 4030500)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 4030500 but found " + localPackageInfo2.versionCode);
        return 2;
      }
      try
      {
        ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
        if (!localApplicationInfo.enabled) {
          return 3;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException3)
      {
        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
        localNameNotFoundException3.printStackTrace();
        return 1;
      }
    }
    return 0;
  }
  
  public static boolean isUserRecoverableError(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static void m(Context paramContext)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    int i = isGooglePlayServicesAvailable(paramContext);
    if (i != 0)
    {
      Intent localIntent = a(paramContext, i, -1);
      Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + i);
      if (localIntent == null) {
        throw new GooglePlayServicesNotAvailableException(i);
      }
      throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", localIntent);
    }
  }
  
  private static void n(Context paramContext)
  {
    try
    {
      ApplicationInfo localApplicationInfo2 = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localApplicationInfo1 = localApplicationInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Bundle localBundle;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException);
        ApplicationInfo localApplicationInfo1 = null;
      }
    }
    localBundle = localApplicationInfo1.metaData;
    if (localBundle != null)
    {
      int i = localBundle.getInt("com.google.android.gms.version");
      if (i == 4030500) {
        return;
      }
      throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 4030500 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    }
    throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
  }
  
  static boolean n(int paramInt)
  {
    boolean bool = true;
    switch (o(paramInt))
    {
    default: 
      bool = false;
    case 1: 
    case 0: 
      do
      {
        return bool;
      } while (!aI());
      return false;
    }
    return false;
  }
  
  private static int o(int paramInt)
  {
    if (paramInt == -1) {
      paramInt = 2;
    }
    return paramInt;
  }
  
  private static boolean o(Context paramContext)
  {
    boolean bool;
    if (iX) {
      bool = iZ;
    }
    for (;;)
    {
      return bool;
      try
      {
        byte[] arrayOfByte = a(paramContext.getPackageManager().getPackageInfo("com.google.android.apps.bazaar", 64), iW);
        bool = false;
        if (arrayOfByte != null) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    return false;
  }
  
  private static byte[] t(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesUtil
 * JD-Core Version:    0.7.0.1
 */