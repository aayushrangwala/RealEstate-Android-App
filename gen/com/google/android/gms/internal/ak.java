package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

public final class ak
  implements ai
{
  private static int a(DisplayMetrics paramDisplayMetrics, Map<String, String> paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    if (str != null) {}
    try
    {
      int i = cm.a(paramDisplayMetrics, Integer.parseInt(str));
      paramInt = i;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      cn.q("Could not parse " + paramString + " in a video GMSG: " + str);
    }
    return paramInt;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if (str1 == null)
    {
      cn.q("Action missing from video GMSG.");
      return;
    }
    bf localbf = paramcq.au();
    if (localbf == null)
    {
      cn.q("Could not get ad overlay for a video GMSG.");
      return;
    }
    boolean bool1 = "new".equalsIgnoreCase(str1);
    boolean bool2 = "position".equalsIgnoreCase(str1);
    if ((bool1) || (bool2))
    {
      DisplayMetrics localDisplayMetrics1 = paramcq.getContext().getResources().getDisplayMetrics();
      int i = a(localDisplayMetrics1, paramMap, "x", 0);
      int j = a(localDisplayMetrics1, paramMap, "y", 0);
      int k = a(localDisplayMetrics1, paramMap, "w", -1);
      int m = a(localDisplayMetrics1, paramMap, "h", -1);
      if ((bool1) && (localbf.Q() == null))
      {
        localbf.c(i, j, k, m);
        return;
      }
      localbf.b(i, j, k, m);
      return;
    }
    bj localbj = localbf.Q();
    if (localbj == null)
    {
      bj.a(paramcq, "no_video_view", null);
      return;
    }
    if ("click".equalsIgnoreCase(str1))
    {
      DisplayMetrics localDisplayMetrics2 = paramcq.getContext().getResources().getDisplayMetrics();
      int n = a(localDisplayMetrics2, paramMap, "x", 0);
      int i1 = a(localDisplayMetrics2, paramMap, "y", 0);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, n, i1, 0);
      localbj.b(localMotionEvent);
      localMotionEvent.recycle();
      return;
    }
    if ("controls".equalsIgnoreCase(str1))
    {
      String str3 = (String)paramMap.get("enabled");
      if (str3 == null)
      {
        cn.q("Enabled parameter missing from controls video GMSG.");
        return;
      }
      localbj.f(Boolean.parseBoolean(str3));
      return;
    }
    if ("currentTime".equalsIgnoreCase(str1))
    {
      String str2 = (String)paramMap.get("time");
      if (str2 == null)
      {
        cn.q("Time parameter missing from currentTime video GMSG.");
        return;
      }
      try
      {
        localbj.seekTo((int)(1000.0F * Float.parseFloat(str2)));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        cn.q("Could not parse time parameter from currentTime video GMSG: " + str2);
        return;
      }
    }
    if ("hide".equalsIgnoreCase(str1))
    {
      localbj.setVisibility(4);
      return;
    }
    if ("load".equalsIgnoreCase(str1))
    {
      localbj.Z();
      return;
    }
    if ("pause".equalsIgnoreCase(str1))
    {
      localbj.pause();
      return;
    }
    if ("play".equalsIgnoreCase(str1))
    {
      localbj.play();
      return;
    }
    if ("show".equalsIgnoreCase(str1))
    {
      localbj.setVisibility(0);
      return;
    }
    if ("src".equalsIgnoreCase(str1))
    {
      localbj.i((String)paramMap.get("src"));
      return;
    }
    cn.q("Unknown video action: " + str1);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ak
 * JD-Core Version:    0.7.0.1
 */