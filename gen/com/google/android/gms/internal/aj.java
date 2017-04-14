package com.google.android.gms.internal;

import java.util.Map;

public final class aj
  implements ai
{
  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int b(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str)) {
        return ci.ao();
      }
      if ("l".equalsIgnoreCase(str)) {
        return ci.an();
      }
    }
    return -1;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("a");
    if (str1 == null)
    {
      cn.q("Action missing from an open GMSG.");
      return;
    }
    cr localcr = paramcq.aw();
    if ("expand".equalsIgnoreCase(str1))
    {
      if (paramcq.az())
      {
        cn.q("Cannot expand WebView that is already expanded.");
        return;
      }
      localcr.a(a(paramMap), b(paramMap));
      return;
    }
    if ("webapp".equalsIgnoreCase(str1))
    {
      String str2 = (String)paramMap.get("u");
      if (str2 != null)
      {
        localcr.a(a(paramMap), b(paramMap), str2);
        return;
      }
      localcr.a(a(paramMap), b(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
      return;
    }
    localcr.a(new be((String)paramMap.get("i"), (String)paramMap.get("u"), (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aj
 * JD-Core Version:    0.7.0.1
 */