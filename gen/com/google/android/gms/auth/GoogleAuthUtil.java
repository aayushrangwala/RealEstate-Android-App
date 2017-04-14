package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.net.URISyntaxException;

public final class GoogleAuthUtil
{
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  public static final String KEY_ANDROID_PACKAGE_NAME;
  public static final String KEY_CALLER_UID;
  public static final String KEY_CLIENT_PACKAGE_NAME = "clientPackageName";
  public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
  @Deprecated
  public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  private static final ComponentName iH;
  private static final ComponentName iI;
  private static final Intent iJ;
  private static final Intent iK;
  
  static
  {
    String str1;
    if (Build.VERSION.SDK_INT >= 11)
    {
      str1 = "callerUid";
      KEY_CALLER_UID = str1;
      if (Build.VERSION.SDK_INT < 14) {
        break label107;
      }
    }
    label107:
    for (String str2 = "androidPackageName";; str2 = "androidPackageName")
    {
      KEY_ANDROID_PACKAGE_NAME = str2;
      iH = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
      iI = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
      iJ = new Intent().setPackage("com.google.android.gms").setComponent(iH);
      iK = new Intent().setPackage("com.google.android.gms").setComponent(iI);
      return;
      str1 = "callerUid";
      break;
    }
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    try
    {
      String str3 = getToken(paramContext, paramString1, paramString2, paramBundle);
      return str3;
    }
    catch (GooglePlayServicesAvailabilityException localGooglePlayServicesAvailabilityException)
    {
      PendingIntent localPendingIntent = GooglePlayServicesUtil.getErrorPendingIntent(localGooglePlayServicesAvailabilityException.getConnectionStatusCode(), paramContext, 0);
      Resources localResources = paramContext.getResources();
      Notification localNotification = new Notification(17301642, localResources.getString(R.string.auth_client_play_services_err_notification_msg), System.currentTimeMillis());
      localNotification.flags = (0x10 | localNotification.flags);
      String str1 = paramContext.getApplicationInfo().name;
      if (TextUtils.isEmpty(str1)) {
        str1 = paramContext.getPackageName();
      }
      String str2 = localResources.getString(R.string.auth_client_requested_by_msg, new Object[] { str1 });
      int i;
      switch (localGooglePlayServicesAvailabilityException.getConnectionStatusCode())
      {
      default: 
        i = R.string.auth_client_using_bad_version_title;
      }
      for (;;)
      {
        localNotification.setLatestEventInfo(paramContext, localResources.getString(i), str2, localPendingIntent);
        ((NotificationManager)paramContext.getSystemService("notification")).notify(39789, localNotification);
        throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        i = R.string.auth_client_needs_installation_title;
        continue;
        i = R.string.auth_client_needs_update_title;
        continue;
        i = R.string.auth_client_needs_enabling_title;
      }
    }
    catch (UserRecoverableAuthException localUserRecoverableAuthException)
    {
      throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
    }
  }
  
  private static void b(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IllegalArgumentException("Callack cannot be null.");
    }
    String str = paramIntent.toUri(1);
    try
    {
      Intent.parseUri(str, 1);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
    }
  }
  
  public static String getToken(Context paramContext, String paramString1, String paramString2)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    return getToken(paramContext, paramString1, paramString2, new Bundle());
  }
  
  /* Error */
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 222	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 4
    //   6: ldc 224
    //   8: invokestatic 229	com/google/android/gms/internal/dm:x	(Ljava/lang/String;)V
    //   11: aload 4
    //   13: invokestatic 233	com/google/android/gms/auth/GoogleAuthUtil:m	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +125 -> 142
    //   20: new 90	android/os/Bundle
    //   23: dup
    //   24: invokespecial 91	android/os/Bundle:<init>	()V
    //   27: astore 5
    //   29: aload_0
    //   30: invokevirtual 140	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   33: getfield 236	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 5
    //   40: ldc 13
    //   42: aload 6
    //   44: invokevirtual 239	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: aload 5
    //   49: getstatic 43	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   52: invokevirtual 243	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   55: ifne +13 -> 68
    //   58: aload 5
    //   60: getstatic 43	com/google/android/gms/auth/GoogleAuthUtil:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   63: aload 6
    //   65: invokevirtual 239	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: new 245	com/google/android/gms/common/a
    //   71: dup
    //   72: invokespecial 246	com/google/android/gms/common/a:<init>	()V
    //   75: astore 7
    //   77: aload 4
    //   79: getstatic 73	com/google/android/gms/auth/GoogleAuthUtil:iJ	Landroid/content/Intent;
    //   82: aload 7
    //   84: iconst_1
    //   85: invokevirtual 250	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   88: ifeq +188 -> 276
    //   91: aload 7
    //   93: invokevirtual 254	com/google/android/gms/common/a:aG	()Landroid/os/IBinder;
    //   96: invokestatic 259	com/google/android/gms/internal/o$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/o;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 5
    //   103: invokeinterface 264 4 0
    //   108: astore 12
    //   110: aload 12
    //   112: ldc_w 266
    //   115: invokevirtual 269	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore 13
    //   120: aload 13
    //   122: invokestatic 151	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   125: istore 14
    //   127: iload 14
    //   129: ifne +26 -> 155
    //   132: aload 4
    //   134: aload 7
    //   136: invokevirtual 273	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   139: aload 13
    //   141: areturn
    //   142: new 90	android/os/Bundle
    //   145: dup
    //   146: aload_3
    //   147: invokespecial 276	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   150: astore 5
    //   152: goto -123 -> 29
    //   155: aload 12
    //   157: ldc_w 278
    //   160: invokevirtual 269	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 15
    //   165: aload 12
    //   167: ldc_w 280
    //   170: invokevirtual 284	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   173: checkcast 61	android/content/Intent
    //   176: astore 16
    //   178: aload 15
    //   180: invokestatic 287	com/google/android/gms/auth/GoogleAuthUtil:s	(Ljava/lang/String;)Z
    //   183: ifeq +52 -> 235
    //   186: new 88	com/google/android/gms/auth/UserRecoverableAuthException
    //   189: dup
    //   190: aload 15
    //   192: aload 16
    //   194: invokespecial 290	com/google/android/gms/auth/UserRecoverableAuthException:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   197: athrow
    //   198: astore 10
    //   200: ldc_w 292
    //   203: ldc_w 294
    //   206: aload 10
    //   208: invokestatic 300	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: new 80	java/io/IOException
    //   215: dup
    //   216: ldc_w 302
    //   219: invokespecial 303	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   222: athrow
    //   223: astore 9
    //   225: aload 4
    //   227: aload 7
    //   229: invokevirtual 273	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   232: aload 9
    //   234: athrow
    //   235: aload 15
    //   237: invokestatic 306	com/google/android/gms/auth/GoogleAuthUtil:r	(Ljava/lang/String;)Z
    //   240: ifeq +26 -> 266
    //   243: new 80	java/io/IOException
    //   246: dup
    //   247: aload 15
    //   249: invokespecial 303	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   252: athrow
    //   253: astore 8
    //   255: new 84	com/google/android/gms/auth/GoogleAuthException
    //   258: dup
    //   259: ldc_w 308
    //   262: invokespecial 309	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   265: athrow
    //   266: new 84	com/google/android/gms/auth/GoogleAuthException
    //   269: dup
    //   270: aload 15
    //   272: invokespecial 309	com/google/android/gms/auth/GoogleAuthException:<init>	(Ljava/lang/String;)V
    //   275: athrow
    //   276: new 80	java/io/IOException
    //   279: dup
    //   280: ldc_w 311
    //   283: invokespecial 303	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   286: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	paramContext	Context
    //   0	287	1	paramString1	String
    //   0	287	2	paramString2	String
    //   0	287	3	paramBundle	Bundle
    //   4	222	4	localContext	Context
    //   27	124	5	localBundle1	Bundle
    //   36	28	6	str1	String
    //   75	153	7	locala	com.google.android.gms.common.a
    //   253	1	8	localInterruptedException	java.lang.InterruptedException
    //   223	10	9	localObject	Object
    //   198	9	10	localRemoteException	android.os.RemoteException
    //   108	58	12	localBundle2	Bundle
    //   118	22	13	str2	String
    //   125	3	14	bool	boolean
    //   163	108	15	str3	String
    //   176	17	16	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   91	127	198	android/os/RemoteException
    //   155	198	198	android/os/RemoteException
    //   235	253	198	android/os/RemoteException
    //   266	276	198	android/os/RemoteException
    //   91	127	223	finally
    //   155	198	223	finally
    //   200	223	223	finally
    //   235	253	223	finally
    //   255	266	223	finally
    //   266	276	223	finally
    //   91	127	253	java/lang/InterruptedException
    //   155	198	253	java/lang/InterruptedException
    //   235	253	253	java/lang/InterruptedException
    //   266	276	253	java/lang/InterruptedException
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    paramBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, Intent paramIntent)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    b(paramIntent);
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    paramBundle.putParcelable("callback_intent", paramIntent);
    paramBundle.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle);
  }
  
  public static String getTokenWithNotification(Context paramContext, String paramString1, String paramString2, Bundle paramBundle1, String paramString3, Bundle paramBundle2)
    throws IOException, UserRecoverableNotifiedException, GoogleAuthException
  {
    if (TextUtils.isEmpty(paramString3)) {
      throw new IllegalArgumentException("Authority cannot be empty or null.");
    }
    if (paramBundle1 == null) {
      paramBundle1 = new Bundle();
    }
    if (paramBundle2 == null) {
      paramBundle2 = new Bundle();
    }
    ContentResolver.validateSyncExtrasBundle(paramBundle2);
    paramBundle1.putString("authority", paramString3);
    paramBundle1.putBundle("sync_extras", paramBundle2);
    paramBundle1.putBoolean("handle_notification", true);
    return a(paramContext, paramString1, paramString2, paramBundle1);
  }
  
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  private static void m(Context paramContext)
    throws GooglePlayServicesAvailabilityException, GoogleAuthException
  {
    try
    {
      GooglePlayServicesUtil.m(paramContext);
      return;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      throw new GooglePlayServicesAvailabilityException(localGooglePlayServicesRepairableException.getConnectionStatusCode(), localGooglePlayServicesRepairableException.getMessage(), localGooglePlayServicesRepairableException.getIntent());
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      throw new GoogleAuthException(localGooglePlayServicesNotAvailableException.getMessage());
    }
  }
  
  private static boolean r(String paramString)
  {
    return ("NetworkError".equals(paramString)) || ("ServiceUnavailable".equals(paramString)) || ("Timeout".equals(paramString));
  }
  
  private static boolean s(String paramString)
  {
    return ("BadAuthentication".equals(paramString)) || ("CaptchaRequired".equals(paramString)) || ("DeviceManagementRequiredOrSyncDisabled".equals(paramString)) || ("NeedPermission".equals(paramString)) || ("NeedsBrowser".equals(paramString)) || ("UserCancel".equals(paramString)) || ("AppDownloadRequired".equals(paramString));
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GoogleAuthUtil
 * JD-Core Version:    0.7.0.1
 */