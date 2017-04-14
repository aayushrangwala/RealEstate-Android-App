package com.google.android.gms.internal;

import java.util.Map;

public final class cb
{
  private final Object eJ = new Object();
  private cq fG;
  private String gT;
  public final ai gU = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      synchronized (cb.a(cb.this))
      {
        String str1 = (String)paramAnonymousMap.get("type");
        String str2 = (String)paramAnonymousMap.get("errors");
        cn.q("Invalid " + str1 + " request error: " + str2);
        cb.a(cb.this, 1);
        cb.a(cb.this).notify();
        return;
      }
    }
  };
  public final ai gV = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      synchronized (cb.a(cb.this))
      {
        String str = (String)paramAnonymousMap.get("url");
        if (str == null)
        {
          cn.q("URL missing in loadAdUrl GMSG.");
          return;
        }
        cb.a(cb.this, str);
        cb.a(cb.this).notify();
        return;
      }
    }
  };
  private int gw = -2;
  
  public String aj()
  {
    synchronized (this.eJ)
    {
      while (this.gT == null)
      {
        int i = this.gw;
        if (i == -2) {
          try
          {
            this.eJ.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            cn.q("Ad request service was interrupted.");
            return null;
          }
        }
      }
      String str = this.gT;
      return str;
    }
  }
  
  public void b(cq paramcq)
  {
    synchronized (this.eJ)
    {
      this.fG = paramcq;
      return;
    }
  }
  
  public int getErrorCode()
  {
    synchronized (this.eJ)
    {
      int i = this.gw;
      return i;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cb
 * JD-Core Version:    0.7.0.1
 */