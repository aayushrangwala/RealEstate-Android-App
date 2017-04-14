package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ci
{
  private static final Object gL = new Object();
  private static boolean hJ = true;
  private static String hK;
  private static boolean hL = false;
  
  public static String a(Readable paramReadable)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharBuffer localCharBuffer = CharBuffer.allocate(2048);
    for (;;)
    {
      int i = paramReadable.read(localCharBuffer);
      if (i == -1) {
        break;
      }
      localCharBuffer.flip();
      localStringBuilder.append(localCharBuffer, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  private static JSONArray a(Collection<?> paramCollection)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      a(localJSONArray, localIterator.next());
    }
    return localJSONArray;
  }
  
  private static JSONArray a(Object[] paramArrayOfObject)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++) {
      a(localJSONArray, paramArrayOfObject[j]);
    }
    return localJSONArray;
  }
  
  private static JSONObject a(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }
  
  public static void a(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(b(paramContext, paramString));
  }
  
  public static void a(Context paramContext, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      new cl(paramContext, paramString, (String)localIterator.next()).start();
    }
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", b(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public static void a(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      cj.a(paramWebView);
    }
  }
  
  private static void a(JSONArray paramJSONArray, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(l((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONArray.put(a((Object[])paramObject));
      return;
    }
    paramJSONArray.put(paramObject);
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, l((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString != null) {}
      for (;;)
      {
        paramJSONObject.put(paramString, a((Collection)paramObject));
        return;
        paramString = "null";
      }
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }
  
  public static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    return paramPackageManager.checkPermission(paramString2, paramString1) == 0;
  }
  
  public static boolean am()
  {
    return hJ;
  }
  
  public static int an()
  {
    if (Build.VERSION.SDK_INT >= 9) {
      return 6;
    }
    return 0;
  }
  
  public static int ao()
  {
    if (Build.VERSION.SDK_INT >= 9) {
      return 7;
    }
    return 1;
  }
  
  private static String b(Context paramContext, String paramString)
  {
    for (;;)
    {
      synchronized (gL)
      {
        if (hK != null)
        {
          String str4 = hK;
          return str4;
        }
        if (Build.VERSION.SDK_INT >= 17)
        {
          hK = ck.getDefaultUserAgent(paramContext);
          hK = hK + " (Mobile; " + paramString + ")";
          String str1 = hK;
          return str1;
        }
      }
      if (!cm.ar())
      {
        cm.hO.post(new Runnable()
        {
          public void run()
          {
            synchronized ()
            {
              ci.k(ci.k(this.gO));
              ci.ap().notifyAll();
              return;
            }
          }
        });
        for (;;)
        {
          String str2 = hK;
          if (str2 != null) {
            break;
          }
          try
          {
            gL.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            String str3 = hK;
            return str3;
          }
        }
      }
      hK = j(paramContext);
    }
  }
  
  public static void b(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      cj.b(paramWebView);
    }
  }
  
  public static boolean h(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 65536);
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
    {
      cn.q("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      return false;
    }
    if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0) {
      cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboard" }));
    }
    for (boolean bool = false;; bool = true)
    {
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboardHidden" }));
        bool = false;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "orientation" }));
        bool = false;
      }
      if ((0x100 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenLayout" }));
        bool = false;
      }
      if ((0x200 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "uiMode" }));
        bool = false;
      }
      if ((0x400 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenSize" }));
        bool = false;
      }
      if ((0x800 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        cn.q(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "smallestScreenSize" }));
        return false;
      }
      return bool;
    }
  }
  
  public static void i(Context paramContext)
  {
    if (hL) {
      return;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new a(null), localIntentFilter);
    hL = true;
  }
  
  private static String j(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }
  
  public static String j(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
  
  public static JSONObject l(Map<String, ?> paramMap)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(localJSONObject, str, paramMap.get(str));
      }
      return localJSONObject;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new JSONException("Could not convert map to JSON: " + localClassCastException.getMessage());
    }
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
        ci.h(true);
      }
      while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) {
        return;
      }
      ci.h(false);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ci
 * JD-Core Version:    0.7.0.1
 */