package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public final class bf
  extends bn.a
{
  private final Activity fD;
  private bh fE;
  private bj fF;
  private cq fG;
  private b fH;
  private bk fI;
  private FrameLayout fJ;
  private WebChromeClient.CustomViewCallback fK;
  private boolean fL = false;
  private boolean fM = false;
  private RelativeLayout fN;
  
  public bf(Activity paramActivity)
  {
    this.fD = paramActivity;
  }
  
  private void T()
  {
    if ((!this.fD.isFinishing()) || (this.fM)) {}
    do
    {
      do
      {
        return;
        this.fM = true;
      } while (!this.fD.isFinishing());
      if (this.fG != null)
      {
        this.fG.as();
        this.fN.removeView(this.fG);
        if (this.fH != null)
        {
          this.fG.i(false);
          this.fH.fQ.addView(this.fG, this.fH.index, this.fH.fP);
        }
      }
    } while ((this.fE == null) || (this.fE.fT == null));
    this.fE.fT.B();
  }
  
  private static RelativeLayout.LayoutParams a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }
  
  public static void a(Context paramContext, bh parambh)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", parambh.eg.hS);
    bh.a(localIntent, parambh);
    localIntent.addFlags(524288);
    paramContext.startActivity(localIntent);
  }
  
  private void e(boolean paramBoolean)
    throws bf.a
  {
    this.fD.requestWindowFeature(1);
    Window localWindow = this.fD.getWindow();
    localWindow.setFlags(1024, 1024);
    setRequestedOrientation(this.fE.orientation);
    if (Build.VERSION.SDK_INT >= 11)
    {
      cn.m("Enabling hardware acceleration on the AdActivity window.");
      cj.a(localWindow);
    }
    this.fN = new RelativeLayout(this.fD);
    this.fN.setBackgroundColor(-16777216);
    this.fD.setContentView(this.fN);
    boolean bool = this.fE.fU.aw().aD();
    if (paramBoolean)
    {
      this.fG = cq.a(this.fD, this.fE.fU.av(), true, bool, null, this.fE.eg);
      this.fG.aw().a(null, null, this.fE.fV, this.fE.fZ, true);
      this.fG.aw().a(new cr.a()
      {
        public void a(cq paramAnonymouscq)
        {
          paramAnonymouscq.at();
        }
      });
      if (this.fE.fz != null) {
        this.fG.loadUrl(this.fE.fz);
      }
    }
    for (;;)
    {
      this.fG.a(this);
      this.fN.addView(this.fG, -1, -1);
      if (!paramBoolean) {
        this.fG.at();
      }
      c(bool);
      return;
      if (this.fE.fY != null)
      {
        this.fG.loadDataWithBaseURL(this.fE.fW, this.fE.fY, "text/html", "UTF-8", null);
      }
      else
      {
        throw new a("No URL or HTML to display in ad overlay.");
        this.fG = this.fE.fU;
        this.fG.setContext(this.fD);
      }
    }
  }
  
  public bj Q()
  {
    return this.fF;
  }
  
  public void R()
  {
    if (this.fE != null) {
      setRequestedOrientation(this.fE.orientation);
    }
    if (this.fJ != null)
    {
      this.fD.setContentView(this.fN);
      this.fJ.removeAllViews();
      this.fJ = null;
    }
    if (this.fK != null)
    {
      this.fK.onCustomViewHidden();
      this.fK = null;
    }
  }
  
  public void S()
  {
    this.fN.removeView(this.fI);
    c(true);
  }
  
  public void a(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.fJ = new FrameLayout(this.fD);
    this.fJ.setBackgroundColor(-16777216);
    this.fJ.addView(paramView, -1, -1);
    this.fD.setContentView(this.fJ);
    this.fK = paramCustomViewCallback;
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.fF != null) {
      this.fF.setLayoutParams(a(paramInt1, paramInt2, paramInt3, paramInt4));
    }
  }
  
  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.fF == null)
    {
      this.fF = new bj(this.fD, this.fG);
      this.fN.addView(this.fF, 0, a(paramInt1, paramInt2, paramInt3, paramInt4));
      this.fG.aw().j(false);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    int i;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i = 50;
      this.fI = new bk(this.fD, i);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean) {
        break label88;
      }
    }
    label88:
    for (int j = 11;; j = 9)
    {
      localLayoutParams.addRule(j);
      this.fI.d(this.fE.fX);
      this.fN.addView(this.fI, localLayoutParams);
      return;
      i = 32;
      break;
    }
  }
  
  public void close()
  {
    this.fD.finish();
  }
  
  public void d(boolean paramBoolean)
  {
    if (this.fI != null) {
      this.fI.d(paramBoolean);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    this.fL = bool;
    do
    {
      try
      {
        this.fE = bh.a(this.fD.getIntent());
        if (this.fE == null) {
          throw new a("Could not get info for ad overlay.");
        }
      }
      catch (a locala)
      {
        cn.q(locala.getMessage());
        this.fD.finish();
        return;
      }
      if (paramBundle == null)
      {
        if (this.fE.fT != null) {
          this.fE.fT.C();
        }
        if ((this.fE.ga != 1) && (this.fE.fS != null)) {
          this.fE.fS.y();
        }
      }
      switch (this.fE.ga)
      {
      default: 
        throw new a("Could not determine ad overlay type.");
      case 1: 
        e(false);
        return;
      case 2: 
        this.fH = new b(this.fE.fU);
        e(false);
        return;
      case 3: 
        e(true);
        return;
      }
      if (this.fL)
      {
        this.fD.finish();
        return;
      }
    } while (bc.a(this.fD, this.fE.fR, this.fE.fZ));
    this.fD.finish();
  }
  
  public void onDestroy()
  {
    if (this.fF != null) {
      this.fF.destroy();
    }
    if (this.fG != null) {
      this.fN.removeView(this.fG);
    }
    T();
  }
  
  public void onPause()
  {
    if (this.fF != null) {
      this.fF.pause();
    }
    R();
    if ((this.fG != null) && ((!this.fD.isFinishing()) || (this.fH == null))) {
      ci.a(this.fG);
    }
    T();
  }
  
  public void onRestart() {}
  
  public void onResume()
  {
    if ((this.fE != null) && (this.fE.ga == 4))
    {
      if (!this.fL) {
        break label47;
      }
      this.fD.finish();
    }
    for (;;)
    {
      if (this.fG != null) {
        ci.b(this.fG);
      }
      return;
      label47:
      this.fL = true;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.fL);
  }
  
  public void onStart() {}
  
  public void onStop()
  {
    T();
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    this.fD.setRequestedOrientation(paramInt);
  }
  
  private static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  private static final class b
  {
    public final ViewGroup.LayoutParams fP;
    public final ViewGroup fQ;
    public final int index;
    
    public b(cq paramcq)
      throws bf.a
    {
      this.fP = paramcq.getLayoutParams();
      ViewParent localViewParent = paramcq.getParent();
      if ((localViewParent instanceof ViewGroup))
      {
        this.fQ = ((ViewGroup)localViewParent);
        this.index = this.fQ.indexOfChild(paramcq);
        this.fQ.removeView(paramcq);
        paramcq.i(true);
        return;
      }
      throw new bf.a("Could not get the parent of the WebView for an overlay.");
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bf
 * JD-Core Version:    0.7.0.1
 */