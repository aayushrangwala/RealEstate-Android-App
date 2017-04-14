package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ViewSwitcher;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;

public final class r
  extends ac.a
  implements ag, aq, bi, bl, bp.a, q
{
  private final aw dZ;
  private final a ea;
  private final s eb;
  
  public r(Context paramContext, x paramx, String paramString, aw paramaw, co paramco)
  {
    this.ea = new a(paramContext, paramx, paramString, paramco);
    this.dZ = paramaw;
    this.eb = new s(this);
    cn.o("Use AdRequest.Builder.addTestDevice(\"" + cm.l(paramContext) + "\") to get test ads on this device.");
    ci.i(paramContext);
  }
  
  private void I()
  {
    cn.o("Ad closing.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdClosed().", localRemoteException);
    }
  }
  
  private void J()
  {
    cn.o("Ad leaving application.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdLeftApplication().", localRemoteException);
    }
  }
  
  private void K()
  {
    cn.o("Ad opening.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdOpened().", localRemoteException);
    }
  }
  
  private void L()
  {
    cn.o("Ad finished loading.");
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdLoaded().", localRemoteException);
    }
  }
  
  private boolean M()
  {
    boolean bool = true;
    if (!ci.a(this.ea.ee.getPackageManager(), this.ea.ee.getPackageName(), "android.permission.INTERNET"))
    {
      if (!this.ea.ed.ex) {
        cm.a(this.ea.ec, this.ea.ed, "Missing internet permission in AndroidManifest.xml.");
      }
      bool = false;
    }
    if (!ci.h(this.ea.ee))
    {
      if (!this.ea.ed.ex) {
        cm.a(this.ea.ec, this.ea.ed, "Missing AdActivity with android:configChanges in AndroidManifest.xml.");
      }
      bool = false;
    }
    if (!bool) {
      this.ea.ec.setVisibility(0);
    }
    return bool;
  }
  
  private void N()
  {
    if (this.ea.ej == null) {
      cn.q("Ad state was null when trying to ping click URLs.");
    }
    do
    {
      return;
      cn.m("Pinging click URLs.");
      if (this.ea.ej.eW != null) {
        ci.a(this.ea.ee, this.ea.eg.hP, this.ea.ej.eW);
      }
    } while ((this.ea.ej.hA == null) || (this.ea.ej.hA.eW == null));
    au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, false, this.ea.ej.hA.eW);
  }
  
  private void O()
  {
    if (this.ea.ej != null)
    {
      this.ea.ej.fU.destroy();
      this.ea.ej = null;
    }
  }
  
  private void a(int paramInt)
  {
    cn.q("Failed to load ad: " + paramInt);
    if (this.ea.eh != null) {}
    try
    {
      this.ea.eh.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call AdListener.onAdFailedToLoad().", localRemoteException);
    }
  }
  
  private void b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    this.ea.ec.addView(paramView, localLayoutParams);
  }
  
  private void b(boolean paramBoolean)
  {
    if (this.ea.ej == null) {
      cn.q("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      cn.m("Pinging Impression URLs.");
      if (this.ea.ej.eX != null) {
        ci.a(this.ea.ee, this.ea.eg.hP, this.ea.ej.eX);
      }
      if ((this.ea.ej.hA != null) && (this.ea.ej.hA.eX != null)) {
        au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, paramBoolean, this.ea.ej.hA.eX);
      }
    } while ((this.ea.ej.fm == null) || (this.ea.ej.fm.eT == null));
    au.a(this.ea.ee, this.ea.eg.hP, this.ea.ej, this.ea.adUnitId, paramBoolean, this.ea.ej.fm.eT);
  }
  
  /* Error */
  private boolean b(ce paramce)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 275	com/google/android/gms/internal/ce:gI	Z
    //   4: ifeq +55 -> 59
    //   7: aload_1
    //   8: getfield 279	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   11: invokeinterface 285 1 0
    //   16: invokestatic 290	com/google/android/gms/dynamic/c:b	(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;
    //   19: checkcast 292	android/view/View
    //   22: astore 5
    //   24: aload_0
    //   25: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   28: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   31: invokevirtual 296	android/widget/ViewSwitcher:getNextView	()Landroid/view/View;
    //   34: astore 6
    //   36: aload 6
    //   38: ifnull +15 -> 53
    //   41: aload_0
    //   42: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   45: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   48: aload 6
    //   50: invokevirtual 299	android/widget/ViewSwitcher:removeView	(Landroid/view/View;)V
    //   53: aload_0
    //   54: aload 5
    //   56: invokespecial 301	com/google/android/gms/internal/r:b	(Landroid/view/View;)V
    //   59: aload_0
    //   60: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   63: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   66: invokevirtual 305	android/widget/ViewSwitcher:getChildCount	()I
    //   69: iconst_1
    //   70: if_icmple +13 -> 83
    //   73: aload_0
    //   74: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   77: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   80: invokevirtual 308	android/widget/ViewSwitcher:showNext	()V
    //   83: aload_0
    //   84: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   87: getfield 177	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   90: ifnull +70 -> 160
    //   93: aload_0
    //   94: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   97: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   100: invokevirtual 296	android/widget/ViewSwitcher:getNextView	()Landroid/view/View;
    //   103: astore_2
    //   104: aload_2
    //   105: instanceof 228
    //   108: ifeq +89 -> 197
    //   111: aload_2
    //   112: checkcast 228	com/google/android/gms/internal/cq
    //   115: aload_0
    //   116: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   119: getfield 126	com/google/android/gms/internal/r$a:ee	Landroid/content/Context;
    //   122: aload_0
    //   123: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   126: getfield 145	com/google/android/gms/internal/r$a:ed	Lcom/google/android/gms/internal/x;
    //   129: invokevirtual 311	com/google/android/gms/internal/cq:a	(Landroid/content/Context;Lcom/google/android/gms/internal/x;)V
    //   132: aload_0
    //   133: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   136: getfield 177	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   139: getfield 279	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   142: ifnull +18 -> 160
    //   145: aload_0
    //   146: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   149: getfield 177	com/google/android/gms/internal/r$a:ej	Lcom/google/android/gms/internal/ce;
    //   152: getfield 279	com/google/android/gms/internal/ce:fn	Lcom/google/android/gms/internal/ax;
    //   155: invokeinterface 312 1 0
    //   160: aload_0
    //   161: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   164: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   167: iconst_0
    //   168: invokevirtual 172	android/widget/ViewSwitcher:setVisibility	(I)V
    //   171: iconst_1
    //   172: ireturn
    //   173: astore 4
    //   175: ldc_w 314
    //   178: aload 4
    //   180: invokestatic 96	com/google/android/gms/internal/cn:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   183: iconst_0
    //   184: ireturn
    //   185: astore 7
    //   187: ldc_w 316
    //   190: aload 7
    //   192: invokestatic 96	com/google/android/gms/internal/cn:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   195: iconst_0
    //   196: ireturn
    //   197: aload_2
    //   198: ifnull -66 -> 132
    //   201: aload_0
    //   202: getfield 34	com/google/android/gms/internal/r:ea	Lcom/google/android/gms/internal/r$a;
    //   205: getfield 155	com/google/android/gms/internal/r$a:ec	Landroid/widget/ViewSwitcher;
    //   208: aload_2
    //   209: invokevirtual 299	android/widget/ViewSwitcher:removeView	(Landroid/view/View;)V
    //   212: goto -80 -> 132
    //   215: astore_3
    //   216: ldc_w 318
    //   219: invokestatic 182	com/google/android/gms/internal/cn:q	(Ljava/lang/String;)V
    //   222: goto -62 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	r
    //   0	225	1	paramce	ce
    //   103	106	2	localView1	View
    //   215	1	3	localRemoteException1	RemoteException
    //   173	6	4	localRemoteException2	RemoteException
    //   22	33	5	localView2	View
    //   34	15	6	localView3	View
    //   185	6	7	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   7	24	173	android/os/RemoteException
    //   53	59	185	java/lang/Throwable
    //   145	160	215	android/os/RemoteException
  }
  
  private bu.a c(v paramv)
  {
    ApplicationInfo localApplicationInfo = this.ea.ee.getApplicationInfo();
    try
    {
      PackageInfo localPackageInfo2 = this.ea.ee.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0);
      localPackageInfo1 = localPackageInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int[] arrayOfInt;
        int i;
        int j;
        DisplayMetrics localDisplayMetrics;
        int k;
        int m;
        PackageInfo localPackageInfo1 = null;
        continue;
        int n = 0;
        continue;
        Bundle localBundle = null;
      }
    }
    if ((!this.ea.ed.ex) && (this.ea.ec.getParent() != null))
    {
      arrayOfInt = new int[2];
      this.ea.ec.getLocationOnScreen(arrayOfInt);
      i = arrayOfInt[0];
      j = arrayOfInt[1];
      localDisplayMetrics = this.ea.ee.getResources().getDisplayMetrics();
      k = this.ea.ec.getWidth();
      m = this.ea.ec.getHeight();
      if ((this.ea.ec.isShown()) && (i + k > 0) && (j + m > 0) && (i <= localDisplayMetrics.widthPixels) && (j <= localDisplayMetrics.heightPixels))
      {
        n = 1;
        localBundle = new Bundle(5);
        localBundle.putInt("x", i);
        localBundle.putInt("y", j);
        localBundle.putInt("width", k);
        localBundle.putInt("height", m);
        localBundle.putInt("visible", n);
        return new bu.a(localBundle, paramv, this.ea.ed, this.ea.adUnitId, localApplicationInfo, localPackageInfo1, cf.al(), cf.hB, this.ea.eg);
      }
    }
  }
  
  public void A()
  {
    J();
  }
  
  public void B()
  {
    if (this.ea.ed.ex) {
      O();
    }
    I();
  }
  
  public void C()
  {
    if (this.ea.ed.ex) {
      b(false);
    }
    K();
  }
  
  public void D()
  {
    y();
  }
  
  public void E()
  {
    B();
  }
  
  public void F()
  {
    A();
  }
  
  public void G()
  {
    C();
  }
  
  public void H()
  {
    if (this.ea.ej != null) {
      cn.q("Mediation adapter " + this.ea.ej.fo + " refreshed, but mediation adapters should never refresh.");
    }
    b(true);
    L();
  }
  
  public void a(ab paramab)
  {
    dm.w("setAdListener must be called on the main UI thread.");
    this.ea.eh = paramab;
  }
  
  public void a(ae paramae)
  {
    dm.w("setAppEventListener must be called on the main UI thread.");
    this.ea.ek = paramae;
  }
  
  public void a(ce paramce)
  {
    this.ea.ei = null;
    if (paramce.errorCode == -1) {
      return;
    }
    boolean bool;
    if (paramce.gB.extras != null)
    {
      bool = paramce.gB.extras.getBoolean("_noRefresh", false);
      if (!this.ea.ed.ex) {
        break label152;
      }
      ci.a(paramce.fU);
    }
    for (;;)
    {
      if ((paramce.errorCode == 3) && (paramce.hA != null) && (paramce.hA.eY != null))
      {
        cn.m("Pinging no fill URLs.");
        au.a(this.ea.ee, this.ea.eg.hP, paramce, this.ea.adUnitId, false, paramce.hA.eY);
      }
      if (paramce.errorCode == -2) {
        break label252;
      }
      a(paramce.errorCode);
      return;
      bool = false;
      break;
      label152:
      if (!bool) {
        if (paramce.fa > 0L) {
          this.eb.a(paramce.gB, paramce.fa);
        } else if ((paramce.hA != null) && (paramce.hA.fa > 0L)) {
          this.eb.a(paramce.gB, paramce.hA.fa);
        } else if ((!paramce.gI) && (paramce.errorCode == 2)) {
          this.eb.d(paramce.gB);
        }
      }
    }
    label252:
    if ((!this.ea.ed.ex) && (!b(paramce)))
    {
      a(0);
      return;
    }
    if ((this.ea.ej != null) && (this.ea.ej.fp != null)) {
      this.ea.ej.fp.a(null);
    }
    if (paramce.fp != null) {
      paramce.fp.a(this);
    }
    this.ea.ej = paramce;
    if (!this.ea.ed.ex) {
      b(false);
    }
    L();
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (this.ea.ek != null) {}
    try
    {
      this.ea.ek.a(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      cn.b("Could not call the AppEventListener.", localRemoteException);
    }
  }
  
  public boolean a(v paramv)
  {
    dm.w("loadAd must be called on the main UI thread.");
    if (this.ea.ei != null) {
      cn.q("An ad request is already in progress. Aborting.");
    }
    do
    {
      return false;
      if ((this.ea.ed.ex) && (this.ea.ej != null))
      {
        cn.q("An interstitial is already loading. Aborting.");
        return false;
      }
    } while (!M());
    cn.o("Starting ad request.");
    this.eb.cancel();
    bu.a locala = c(paramv);
    Object localObject;
    if (this.ea.ed.ex)
    {
      cq localcq2 = cq.a(this.ea.ee, this.ea.ed, false, false, this.ea.ef, this.ea.eg);
      localcq2.aw().a(this, null, this, this, true);
      localObject = localcq2;
      this.ea.ei = bp.a(this.ea.ee, locala, this.ea.ef, (cq)localObject, this.dZ, this);
      return true;
    }
    View localView = this.ea.ec.getNextView();
    cq localcq1;
    if ((localView instanceof cq))
    {
      localcq1 = (cq)localView;
      localcq1.a(this.ea.ee, this.ea.ed);
    }
    for (;;)
    {
      localcq1.aw().a(this, this, this, this, false);
      localObject = localcq1;
      break;
      if (localView != null) {
        this.ea.ec.removeView(localView);
      }
      localcq1 = cq.a(this.ea.ee, this.ea.ed, false, false, this.ea.ef, this.ea.eg);
      b(localcq1);
    }
  }
  
  public void b(v paramv)
  {
    ViewParent localViewParent = this.ea.ec.getParent();
    if (((localViewParent instanceof View)) && (((View)localViewParent).isShown()) && (ci.am()))
    {
      a(paramv);
      return;
    }
    cn.o("Ad is not visible. Not refreshing ad.");
    this.eb.d(paramv);
  }
  
  public void destroy()
  {
    dm.w("destroy must be called on the main UI thread.");
    this.ea.eh = null;
    this.ea.ek = null;
    this.eb.cancel();
    stopLoading();
    if (this.ea.ec != null) {
      this.ea.ec.removeAllViews();
    }
    if ((this.ea.ej != null) && (this.ea.ej.fU != null)) {
      this.ea.ej.fU.destroy();
    }
  }
  
  public boolean isReady()
  {
    dm.w("isReady must be called on the main UI thread.");
    return (this.ea.ei == null) && (this.ea.ej != null);
  }
  
  public void pause()
  {
    dm.w("pause must be called on the main UI thread.");
    if (this.ea.ej != null) {
      ci.a(this.ea.ej.fU);
    }
  }
  
  public void resume()
  {
    dm.w("resume must be called on the main UI thread.");
    if (this.ea.ej != null) {
      ci.b(this.ea.ej.fU);
    }
  }
  
  public void showInterstitial()
  {
    dm.w("showInterstitial must be called on the main UI thread.");
    if (!this.ea.ed.ex)
    {
      cn.q("Cannot call showInterstitial on a banner ad.");
      return;
    }
    if (this.ea.ej == null)
    {
      cn.q("The interstitial has not loaded.");
      return;
    }
    if (this.ea.ej.fU.az())
    {
      cn.q("The interstitial is already showing.");
      return;
    }
    this.ea.ej.fU.i(true);
    if (this.ea.ej.gI) {
      try
      {
        this.ea.ej.fn.showInterstitial();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        cn.b("Could not show interstitial.", localRemoteException);
        O();
        return;
      }
    }
    bh localbh = new bh(this, this, this, this.ea.ej.fU, this.ea.ej.orientation, this.ea.eg);
    bf.a(this.ea.ee, localbh);
  }
  
  public void stopLoading()
  {
    dm.w("stopLoading must be called on the main UI thread.");
    if (this.ea.ej != null)
    {
      this.ea.ej.fU.stopLoading();
      this.ea.ej = null;
    }
    if (this.ea.ei != null) {
      this.ea.ei.cancel();
    }
  }
  
  public void y()
  {
    N();
  }
  
  public b z()
  {
    dm.w("getAdFrame must be called on the main UI thread.");
    return c.g(this.ea.ec);
  }
  
  private static final class a
  {
    public final String adUnitId;
    public final ViewSwitcher ec;
    public final x ed;
    public final Context ee;
    public final h ef;
    public final co eg;
    public ab eh;
    public cg ei;
    public ce ej;
    public ae ek;
    
    public a(Context paramContext, x paramx, String paramString, co paramco)
    {
      if (paramx.ex) {
        this.ec = null;
      }
      for (;;)
      {
        this.ed = paramx;
        this.adUnitId = paramString;
        this.ee = paramContext;
        this.ef = new h(g.a(paramco.hP, paramContext));
        this.eg = paramco;
        return;
        this.ec = new ViewSwitcher(paramContext);
        this.ec.setMinimumWidth(paramx.widthPixels);
        this.ec.setMinimumHeight(paramx.heightPixels);
        this.ec.setVisibility(4);
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.r
 * JD-Core Version:    0.7.0.1
 */