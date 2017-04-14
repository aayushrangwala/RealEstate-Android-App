package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class br
{
  public static cg a(Context paramContext, bu parambu, a parama)
  {
    if (parambu.eg.hS) {
      return b(paramContext, parambu, parama);
    }
    return c(paramContext, parambu, parama);
  }
  
  private static cg b(Context paramContext, bu parambu, a parama)
  {
    cn.m("Fetching ad response from local ad request service.");
    bs.a locala = new bs.a(paramContext, parambu, parama);
    locala.start();
    return locala;
  }
  
  private static cg c(Context paramContext, bu parambu, a parama)
  {
    cn.m("Fetching ad response from remote ad request service.");
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      cn.q("Failed to connect to remote ad request service.");
      return null;
    }
    return new bs.b(paramContext, parambu, parama);
  }
  
  public static abstract interface a
  {
    public abstract void a(bw parambw);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.br
 * JD-Core Version:    0.7.0.1
 */