package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class cc
{
  private String gX;
  private String gY;
  private List<String> gZ;
  private List<String> ha;
  private long hb = -1L;
  private boolean hc = false;
  private final long hd = -1L;
  private List<String> he;
  private long hf = -1L;
  private int hg = -1;
  
  private static long a(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      try
      {
        float f = Float.parseFloat(str);
        return (f * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        cn.q("Could not parse float from " + paramString + " header: " + str);
      }
    }
    return -1L;
  }
  
  private static List<String> b(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if (str != null) {
        return Arrays.asList(str.trim().split("\\s+"));
      }
    }
    return null;
  }
  
  private void e(Map<String, List<String>> paramMap)
  {
    List localList = b(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList != null) {
      this.gZ = localList;
    }
  }
  
  private void f(Map<String, List<String>> paramMap)
  {
    List localList = b(paramMap, "X-Afma-Tracking-Urls");
    if (localList != null) {
      this.ha = localList;
    }
  }
  
  private void g(Map<String, List<String>> paramMap)
  {
    long l = a(paramMap, "X-Afma-Interstitial-Timeout");
    if (l != -1L) {
      this.hb = l;
    }
  }
  
  private void h(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Mediation");
    if ((localList != null) && (!localList.isEmpty())) {
      this.hc = Boolean.valueOf((String)localList.get(0)).booleanValue();
    }
  }
  
  private void i(Map<String, List<String>> paramMap)
  {
    List localList = b(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList != null) {
      this.he = localList;
    }
  }
  
  private void j(Map<String, List<String>> paramMap)
  {
    long l = a(paramMap, "X-Afma-Refresh-Rate");
    if (l != -1L) {
      this.hf = l;
    }
  }
  
  private void k(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Orientation");
    String str;
    if ((localList != null) && (!localList.isEmpty()))
    {
      str = (String)localList.get(0);
      if (!"portrait".equalsIgnoreCase(str)) {
        break label53;
      }
      this.hg = ci.ao();
    }
    label53:
    while (!"landscape".equalsIgnoreCase(str)) {
      return;
    }
    this.hg = ci.an();
  }
  
  public void a(String paramString1, Map<String, List<String>> paramMap, String paramString2)
  {
    this.gX = paramString1;
    this.gY = paramString2;
    d(paramMap);
  }
  
  public bw ak()
  {
    return new bw(this.gX, this.gY, this.gZ, this.ha, this.hb, this.hc, -1L, this.he, this.hf, this.hg);
  }
  
  public void d(Map<String, List<String>> paramMap)
  {
    e(paramMap);
    f(paramMap);
    g(paramMap);
    h(paramMap);
    i(paramMap);
    j(paramMap);
    k(paramMap);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc
 * JD-Core Version:    0.7.0.1
 */