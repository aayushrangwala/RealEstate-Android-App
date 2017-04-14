package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public class h
{
  private final c dA = new c();
  private String dw = "googleads.g.doubleclick.net";
  private String dx = "/pagead/ads";
  private String[] dy = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private d dz;
  
  public h(d paramd)
  {
    this.dz = paramd;
  }
  
  private Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
    throws i
  {
    try
    {
      if (paramUri.getQueryParameter("ms") != null) {
        throw new i("Query parameter already exists: ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new i("Provided Uri is not in a valid state");
    }
    if (paramBoolean) {}
    String str;
    for (Object localObject = this.dz.a(paramContext, paramString);; localObject = str)
    {
      return a(paramUri, "ms", (String)localObject);
      str = this.dz.a(paramContext);
    }
  }
  
  private Uri a(Uri paramUri, String paramString1, String paramString2)
    throws UnsupportedOperationException
  {
    String str = paramUri.toString();
    int i = str.indexOf("&adurl");
    if (i == -1) {
      i = str.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + "&" + str.substring(i + 1));
    }
    return paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }
  
  public Uri a(Uri paramUri, Context paramContext)
    throws i
  {
    try
    {
      Uri localUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new i("Provided Uri is not in a valid state");
    }
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    this.dz.a(paramMotionEvent);
  }
  
  public boolean a(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.dy;
      int i = arrayOfString.length;
      for (int j = 0;; j++)
      {
        boolean bool1 = false;
        if (j < i)
        {
          boolean bool2 = str.endsWith(arrayOfString[j]);
          if (bool2) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
      }
      return false;
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  public d g()
  {
    return this.dz;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.h
 * JD-Core Version:    0.7.0.1
 */