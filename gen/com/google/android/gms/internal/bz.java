package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bz
  extends by.a
{
  private static final Object gL = new Object();
  private static bz gM;
  private final al gN;
  private final Context mContext;
  
  private bz(Context paramContext, al paramal)
  {
    this.mContext = paramContext;
    this.gN = paramal;
  }
  
  private static bw a(Context paramContext, al paramal, final bu parambu)
  {
    cn.m("Starting ad request from service.");
    paramal.init();
    cd localcd = new cd(paramContext);
    if (localcd.hs == -1)
    {
      cn.m("Device is offline.");
      return new bw(2);
    }
    final cb localcb = new cb();
    final String str1 = ca.a(parambu, localcd, paramal.a(250L));
    if (str1 == null) {
      return new bw(0);
    }
    cm.hO.post(new Runnable()
    {
      public void run()
      {
        cq localcq = cq.a(this.gO, new x(), false, false, null, parambu.eg);
        localcq.setWillNotDraw(true);
        localcb.b(localcq);
        cr localcr = localcq.aw();
        localcr.a("/invalidRequest", localcb.gU);
        localcr.a("/loadAdURL", localcb.gV);
        localcr.a("/log", ah.eE);
        cn.m("Getting the ad request URL.");
        localcq.loadDataWithBaseURL("http://googleads.g.doubleclick.net", "<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + str1 + ");</script></head><body></body></html>", "text/html", "UTF-8", null);
      }
    });
    String str2 = localcb.aj();
    if (TextUtils.isEmpty(str2)) {
      return new bw(localcb.getErrorCode());
    }
    return a(paramContext, parambu.eg.hP, str2);
  }
  
  private static bw a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      localcc = new cc();
      localURL = new URL(paramString2);
      i = 0;
    }
    catch (IOException localIOException)
    {
      try
      {
        for (;;)
        {
          cc localcc;
          URL localURL;
          int i;
          ci.a(paramContext, paramString1, false, localHttpURLConnection);
          int j = localHttpURLConnection.getResponseCode();
          Map localMap = localHttpURLConnection.getHeaderFields();
          if ((j >= 200) && (j < 300))
          {
            String str2 = localURL.toString();
            String str3 = ci.a(new InputStreamReader(localHttpURLConnection.getInputStream()));
            a(str2, localMap, str3, j);
            localcc.a(str2, localMap, str3);
            bw localbw4 = localcc.ak();
            return localbw4;
          }
          a(localURL.toString(), localMap, null, j);
          if ((j >= 300) && (j < 400))
          {
            String str1 = localHttpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(str1))
            {
              cn.q("No location header to follow redirect.");
              bw localbw3 = new bw(0);
              return localbw3;
            }
            localURL = new URL(str1);
            i++;
            if (i > 5)
            {
              cn.q("Too many redirects.");
              bw localbw2 = new bw(0);
              return localbw2;
            }
          }
          else
          {
            cn.q("Received error HTTP response code: " + j);
            bw localbw1 = new bw(0);
            return localbw1;
          }
          localcc.d(localMap);
          localHttpURLConnection.disconnect();
        }
      }
      finally
      {
        HttpURLConnection localHttpURLConnection;
        localHttpURLConnection.disconnect();
      }
      localIOException = localIOException;
      cn.q("Error while connecting to ad server: " + localIOException.getMessage());
      return new bw(2);
    }
    localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
  }
  
  public static bz a(Context paramContext, al paramal)
  {
    synchronized (gL)
    {
      if (gM == null) {
        gM = new bz(paramContext.getApplicationContext(), paramal);
      }
      bz localbz = gM;
      return localbz;
    }
  }
  
  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (cn.k(2))
    {
      cn.p("Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          cn.p("    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            cn.p("      " + str2);
          }
        }
      }
      cn.p("  Body:");
      if (paramString2 != null) {
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000) {
          cn.p(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
        }
      }
      cn.p("    null");
      cn.p("  Response Code:\n    " + paramInt + "\n}");
    }
  }
  
  public bw a(bu parambu)
  {
    return a(this.mContext, this.gN, parambu);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bz
 * JD-Core Version:    0.7.0.1
 */