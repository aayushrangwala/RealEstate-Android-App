package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class bc
{
  public static boolean a(Context paramContext, be parambe, bl parambl)
  {
    if (parambe == null)
    {
      cn.q("No intent data for launcher overlay.");
      return false;
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(parambe.fz))
    {
      cn.q("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(parambe.mimeType)) {
      localIntent.setDataAndType(Uri.parse(parambe.fz), parambe.mimeType);
    }
    String[] arrayOfString;
    for (;;)
    {
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(parambe.packageName)) {
        localIntent.setPackage(parambe.packageName);
      }
      if (TextUtils.isEmpty(parambe.fA)) {
        break label172;
      }
      arrayOfString = parambe.fA.split("/", 2);
      if (arrayOfString.length >= 2) {
        break;
      }
      cn.q("Could not parse component name from open GMSG: " + parambe.fA);
      return false;
      localIntent.setData(Uri.parse(parambe.fz));
    }
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    try
    {
      label172:
      cn.p("Launching an intent: " + localIntent);
      paramContext.startActivity(localIntent);
      parambl.A();
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      cn.q(localActivityNotFoundException.getMessage());
    }
    return false;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bc
 * JD-Core Version:    0.7.0.1
 */