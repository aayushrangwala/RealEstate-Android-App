package com.google.android.gms.internal;

import java.util.Map;

public final class af
  implements ai
{
  private final ag ey;
  
  public af(ag paramag)
  {
    this.ey = paramag;
  }
  
  public void a(cq paramcq, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      cn.q("App event with no name parameter.");
      return;
    }
    this.ey.a(str, (String)paramMap.get("info"));
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.af
 * JD-Core Version:    0.7.0.1
 */