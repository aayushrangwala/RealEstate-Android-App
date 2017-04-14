package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cr
  extends WebViewClient
{
  private final Object eJ = new Object();
  private ag ey;
  protected final cq fG;
  private final HashMap<String, ai> hZ = new HashMap();
  private q ia;
  private bi ib;
  private a ic;
  private boolean id = false;
  private boolean ie;
  private bl jdField_if;
  
  public cr(cq paramcq, boolean paramBoolean)
  {
    this.fG = paramcq;
    this.ie = paramBoolean;
  }
  
  private void a(bh parambh)
  {
    bf.a(this.fG.getContext(), parambh);
  }
  
  private static boolean b(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return ("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str));
  }
  
  private void c(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    ai localai = (ai)this.hZ.get(str1);
    if (localai != null)
    {
      HashMap localHashMap = new HashMap();
      UrlQuerySanitizer localUrlQuerySanitizer = new UrlQuerySanitizer();
      localUrlQuerySanitizer.setAllowUnregisteredParamaters(true);
      localUrlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
      localUrlQuerySanitizer.parseUrl(paramUri.toString());
      Iterator localIterator1 = localUrlQuerySanitizer.getParameterList().iterator();
      while (localIterator1.hasNext())
      {
        UrlQuerySanitizer.ParameterValuePair localParameterValuePair = (UrlQuerySanitizer.ParameterValuePair)localIterator1.next();
        localHashMap.put(localParameterValuePair.mParameter, localParameterValuePair.mValue);
      }
      if (cn.k(2))
      {
        cn.p("Received GMSG: " + str1);
        Iterator localIterator2 = localHashMap.keySet().iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          cn.p("  " + str2 + ": " + (String)localHashMap.get(str2));
        }
      }
      localai.a(this.fG, localHashMap);
      return;
    }
    cn.q("No GMSG handler found for GMSG: " + paramUri);
  }
  
  public final void S()
  {
    synchronized (this.eJ)
    {
      this.id = false;
      this.ie = true;
      final bf localbf = this.fG.au();
      if (localbf != null)
      {
        if (!cm.ar()) {
          cm.hO.post(new Runnable()
          {
            public void run()
            {
              localbf.S();
            }
          });
        }
      }
      else {
        return;
      }
      localbf.S();
    }
  }
  
  public final void a(be parambe)
  {
    boolean bool = this.fG.az();
    q localq;
    bi localbi;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      localbi = null;
      if (!bool) {
        break label69;
      }
    }
    for (;;)
    {
      a(new bh(parambe, localq, localbi, this.jdField_if, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label69:
      localbi = this.ib;
    }
  }
  
  public final void a(a parama)
  {
    this.ic = parama;
  }
  
  public void a(q paramq, bi parambi, ag paramag, bl parambl, boolean paramBoolean)
  {
    a("/appEvent", new af(paramag));
    a("/canOpenURLs", ah.ez);
    a("/click", ah.eA);
    a("/close", ah.eB);
    a("/customClose", ah.eC);
    a("/httpTrack", ah.eD);
    a("/log", ah.eE);
    a("/open", ah.eF);
    a("/touch", ah.eG);
    a("/video", ah.eH);
    this.ia = paramq;
    this.ib = parambi;
    this.ey = paramag;
    this.jdField_if = parambl;
    j(paramBoolean);
  }
  
  public final void a(String paramString, ai paramai)
  {
    this.hZ.put(paramString, paramai);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.fG.az()) && (!this.fG.av().ex)) {}
    for (q localq = null;; localq = this.ia)
    {
      a(new bh(localq, this.ib, this.jdField_if, this.fG, paramBoolean, paramInt, this.fG.ay()));
      return;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    boolean bool = this.fG.az();
    q localq;
    bi localbi;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      localbi = null;
      if (!bool) {
        break label85;
      }
    }
    for (;;)
    {
      a(new bh(localq, localbi, this.ey, this.jdField_if, this.fG, paramBoolean, paramInt, paramString, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label85:
      localbi = this.ib;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.fG.az();
    q localq;
    bi localbi;
    if ((bool) && (!this.fG.av().ex))
    {
      localq = null;
      localbi = null;
      if (!bool) {
        break label87;
      }
    }
    for (;;)
    {
      a(new bh(localq, localbi, this.ey, this.jdField_if, this.fG, paramBoolean, paramInt, paramString1, paramString2, this.fG.ay()));
      return;
      localq = this.ia;
      break;
      label87:
      localbi = this.ib;
    }
  }
  
  public boolean aD()
  {
    synchronized (this.eJ)
    {
      boolean bool = this.ie;
      return bool;
    }
  }
  
  public final void j(boolean paramBoolean)
  {
    this.id = paramBoolean;
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.ic != null)
    {
      this.ic.a(this.fG);
      this.ic = null;
    }
  }
  
  public final void reset()
  {
    synchronized (this.eJ)
    {
      this.hZ.clear();
      this.ia = null;
      this.ib = null;
      this.ic = null;
      this.ey = null;
      this.id = false;
      this.ie = false;
      this.jdField_if = null;
      return;
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    cn.p("AdWebView shouldOverrideUrlLoading: " + paramString);
    Object localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost()))) {
      c((Uri)localObject1);
    }
    for (;;)
    {
      return true;
      if ((this.id) && (b((Uri)localObject1))) {
        return super.shouldOverrideUrlLoading(paramWebView, paramString);
      }
      if (!this.fG.willNotDraw())
      {
        try
        {
          h localh = this.fG.ax();
          if ((localh != null) && (localh.a((Uri)localObject1)))
          {
            Uri localUri = localh.a((Uri)localObject1, this.fG.getContext());
            localObject1 = localUri;
          }
          localObject2 = localObject1;
        }
        catch (i locali)
        {
          for (;;)
          {
            cn.q("Unable to append parameter to URL: " + paramString);
            Object localObject2 = localObject1;
          }
        }
        a(new be("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
        continue;
      }
      cn.q("AdWebView unable to handle URL: " + paramString);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(cq paramcq);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cr
 * JD-Core Version:    0.7.0.1
 */