package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class ct
  extends cr
{
  public ct(cq paramcq, boolean paramBoolean)
  {
    super(paramcq, paramBoolean);
  }
  
  private static WebResourceResponse b(Context paramContext, String paramString1, String paramString2)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString2).openConnection();
    try
    {
      ci.a(paramContext, paramString1, true, localHttpURLConnection);
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(ci.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName())) {
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      if (!(paramWebView instanceof cq))
      {
        cn.q("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      cq localcq = (cq)paramWebView;
      localcq.aw().S();
      if (localcq.av().ex)
      {
        cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
        return b(localcq.getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
      }
      if (localcq.az())
      {
        cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
        return b(localcq.getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
      }
      cn.p("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
      WebResourceResponse localWebResourceResponse = b(localcq.getContext(), this.fG.ay().hP, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
      return localWebResourceResponse;
    }
    catch (IOException localIOException)
    {
      cn.q("Could not fetching MRAID JS. " + localIOException.getMessage());
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct
 * JD-Core Version:    0.7.0.1
 */