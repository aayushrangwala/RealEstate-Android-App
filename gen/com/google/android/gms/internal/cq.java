package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cq
  extends WebView
  implements DownloadListener
{
  private final Object eJ = new Object();
  private x fg;
  private final h go;
  private final cr hT;
  private final MutableContextWrapper hU;
  private final co hV;
  private bf hW;
  private boolean hX;
  private boolean hY;
  
  private cq(MutableContextWrapper paramMutableContextWrapper, x paramx, boolean paramBoolean1, boolean paramBoolean2, h paramh, co paramco)
  {
    super(paramMutableContextWrapper);
    this.hU = paramMutableContextWrapper;
    this.fg = paramx;
    this.hX = paramBoolean1;
    this.go = paramh;
    this.hV = paramco;
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    ci.a(paramMutableContextWrapper, paramco.hP, localWebSettings);
    if (Build.VERSION.SDK_INT >= 17)
    {
      ck.a(getContext(), localWebSettings);
      setDownloadListener(this);
      if (Build.VERSION.SDK_INT < 11) {
        break label174;
      }
      this.hT = new ct(this, paramBoolean2);
      label121:
      setWebViewClient(this.hT);
      if (Build.VERSION.SDK_INT < 14) {
        break label191;
      }
      setWebChromeClient(new cu(this));
    }
    for (;;)
    {
      aA();
      return;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      cj.a(getContext(), localWebSettings);
      break;
      label174:
      this.hT = new cr(this, paramBoolean2);
      break label121;
      label191:
      if (Build.VERSION.SDK_INT >= 11) {
        setWebChromeClient(new cs(this));
      }
    }
  }
  
  public static cq a(Context paramContext, x paramx, boolean paramBoolean1, boolean paramBoolean2, h paramh, co paramco)
  {
    return new cq(new MutableContextWrapper(paramContext), paramx, paramBoolean1, paramBoolean2, paramh, paramco);
  }
  
  private void aA()
  {
    for (;;)
    {
      synchronized (this.eJ)
      {
        if ((this.hX) || (this.fg.ex))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            cn.m("Disabling hardware acceleration on an overlay.");
            aB();
            return;
          }
          cn.m("Enabling hardware acceleration on an overlay.");
          aC();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        cn.m("Disabling hardware acceleration on an AdView.");
        aB();
      }
      else
      {
        cn.m("Enabling hardware acceleration on an AdView.");
        aC();
      }
    }
  }
  
  private void aB()
  {
    synchronized (this.eJ)
    {
      if ((!this.hY) && (Build.VERSION.SDK_INT >= 11)) {
        cj.c(this);
      }
      this.hY = true;
      return;
    }
  }
  
  private void aC()
  {
    synchronized (this.eJ)
    {
      if ((this.hY) && (Build.VERSION.SDK_INT >= 11)) {
        cj.d(this);
      }
      this.hY = false;
      return;
    }
  }
  
  public void a(Context paramContext, x paramx)
  {
    synchronized (this.eJ)
    {
      this.hU.setBaseContext(paramContext);
      this.hW = null;
      this.fg = paramx;
      this.hX = false;
      ci.b(this);
      loadUrl("about:blank");
      this.hT.reset();
      return;
    }
  }
  
  public void a(bf parambf)
  {
    synchronized (this.eJ)
    {
      this.hW = parambf;
      return;
    }
  }
  
  public void a(String paramString, Map<String, ?> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    if (paramMap != null) {}
    try
    {
      String str = ci.l(paramMap).toString();
      localStringBuilder.append(",");
      localStringBuilder.append(str);
      localStringBuilder.append(");");
      cn.p("Dispatching AFMA event: " + localStringBuilder);
      loadUrl(localStringBuilder.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
      cn.q("Could not convert AFMA event parameters to JSON.");
    }
  }
  
  public void as()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.hV.hP);
    a("onhide", localHashMap);
  }
  
  public void at()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.hV.hP);
    a("onshow", localHashMap);
  }
  
  public bf au()
  {
    synchronized (this.eJ)
    {
      bf localbf = this.hW;
      return localbf;
    }
  }
  
  public x av()
  {
    synchronized (this.eJ)
    {
      x localx = this.fg;
      return localx;
    }
  }
  
  public cr aw()
  {
    return this.hT;
  }
  
  public h ax()
  {
    return this.go;
  }
  
  public co ay()
  {
    return this.hV;
  }
  
  public boolean az()
  {
    synchronized (this.eJ)
    {
      boolean bool = this.hX;
      return bool;
    }
  }
  
  public void i(boolean paramBoolean)
  {
    synchronized (this.eJ)
    {
      this.hX = paramBoolean;
      aA();
      return;
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      getContext().startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      cn.m("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n;
    for (int i = 2147483647;; i = n)
    {
      int m;
      label243:
      do
      {
        int k;
        for (;;)
        {
          synchronized (this.eJ)
          {
            if ((isInEditMode()) || (this.hX))
            {
              super.onMeasure(paramInt1, paramInt2);
              return;
            }
            int j = View.MeasureSpec.getMode(paramInt1);
            k = View.MeasureSpec.getSize(paramInt1);
            m = View.MeasureSpec.getMode(paramInt2);
            n = View.MeasureSpec.getSize(paramInt2);
            if (j == -2147483648) {
              break label243;
            }
            if (j != 1073741824) {
              break;
            }
            break label243;
            if ((this.fg.widthPixels > i1) || (this.fg.heightPixels > i))
            {
              cn.q("Not enough space to show ad. Needs " + this.fg.widthPixels + "x" + this.fg.heightPixels + ", but only has " + k + "x" + n);
              if (getVisibility() != 8) {
                setVisibility(4);
              }
              setMeasuredDimension(0, 0);
              return;
            }
          }
          if (getVisibility() != 8) {
            setVisibility(0);
          }
          setMeasuredDimension(this.fg.widthPixels, this.fg.heightPixels);
        }
        int i1 = i;
        continue;
        i1 = k;
      } while ((m != -2147483648) && (m != 1073741824));
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.go != null) {
      this.go.a(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setContext(Context paramContext)
  {
    this.hU.setBaseContext(paramContext);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cq
 * JD-Core Version:    0.7.0.1
 */