package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

public final class ck
{
  public static void a(Context paramContext, WebSettings paramWebSettings)
  {
    cj.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }
  
  public static String getDefaultUserAgent(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ck
 * JD-Core Version:    0.7.0.1
 */