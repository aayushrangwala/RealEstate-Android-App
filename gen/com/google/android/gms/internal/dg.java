package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

public class dg
{
  private static final Uri lg = Uri.parse("http://plus.google.com/");
  private static final Uri lh = lg.buildUpon().appendPath("circles").appendPath("find").build();
  
  private static Uri A(String paramString)
  {
    return Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString).build();
  }
  
  public static Intent B(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(A(paramString));
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
  
  public static Intent C(String paramString)
  {
    Uri localUri = Uri.parse("bazaar://search?q=pname:" + paramString);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(localUri);
    localIntent.setFlags(524288);
    return localIntent;
  }
  
  public static Intent bj()
  {
    return new Intent("android.settings.DATE_SETTINGS");
  }
  
  public static Intent z(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dg
 * JD-Core Version:    0.7.0.1
 */