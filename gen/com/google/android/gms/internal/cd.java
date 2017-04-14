package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class cd
{
  public final int hh;
  public final boolean hi;
  public final boolean hj;
  public final String hk;
  public final String hl;
  public final boolean hm;
  public final boolean hn;
  public final boolean ho;
  public final String hp;
  public final String hq;
  public final int hr;
  public final int hs;
  public final int ht;
  public final int hu;
  public final int hv;
  public final int hw;
  public final float hx;
  public final int hy;
  public final int hz;
  
  public cd(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Locale localLocale = Locale.getDefault();
    PackageManager localPackageManager = paramContext.getPackageManager();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    this.hh = localAudioManager.getMode();
    boolean bool2;
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool2 = bool1;
      this.hi = bool2;
      if (a(localPackageManager, "http://www.google.com") == null) {
        break label249;
      }
    }
    for (;;)
    {
      this.hj = bool1;
      this.hk = localTelephonyManager.getNetworkOperator();
      this.hl = localLocale.getCountry();
      this.hm = cm.aq();
      this.hn = localAudioManager.isMusicActive();
      this.ho = localAudioManager.isSpeakerphoneOn();
      this.hp = localLocale.getLanguage();
      this.hq = a(localPackageManager);
      this.hr = localAudioManager.getStreamVolume(3);
      this.hs = a(paramContext, localConnectivityManager, localPackageManager);
      this.ht = localTelephonyManager.getNetworkType();
      this.hu = localTelephonyManager.getPhoneType();
      this.hv = localAudioManager.getRingerMode();
      this.hw = localAudioManager.getStreamVolume(2);
      this.hx = localDisplayMetrics.density;
      this.hy = localDisplayMetrics.widthPixels;
      this.hz = localDisplayMetrics.heightPixels;
      return;
      bool2 = false;
      break;
      label249:
      bool1 = false;
    }
  }
  
  private static int a(Context paramContext, ConnectivityManager paramConnectivityManager, PackageManager paramPackageManager)
  {
    int i = -2;
    if (ci.a(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo != null) {
        i = localNetworkInfo.getType();
      }
    }
    else
    {
      return i;
    }
    return -1;
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }
  
  private static String a(PackageManager paramPackageManager)
  {
    ResolveInfo localResolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localResolveInfo == null) {}
    for (;;)
    {
      return null;
      ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
      if (localActivityInfo != null) {
        try
        {
          PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(localActivityInfo.packageName, 0);
          if (localPackageInfo != null)
          {
            String str = localPackageInfo.versionCode + "." + localActivityInfo.packageName;
            return str;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
    }
    return null;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cd
 * JD-Core Version:    0.7.0.1
 */