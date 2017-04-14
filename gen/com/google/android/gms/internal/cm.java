package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class cm
{
  public static final Handler hO = new Handler(Looper.getMainLooper());
  
  public static int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }
  
  public static void a(ViewGroup paramViewGroup, x paramx, String paramString)
  {
    cn.q(paramString);
    a(paramViewGroup, paramx, paramString, -65536, -16777216);
  }
  
  private static void a(ViewGroup paramViewGroup, x paramx, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0) {
      return;
    }
    Context localContext = paramViewGroup.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setGravity(17);
    localTextView.setText(paramString);
    localTextView.setTextColor(paramInt1);
    localTextView.setBackgroundColor(paramInt2);
    FrameLayout localFrameLayout = new FrameLayout(localContext);
    localFrameLayout.setBackgroundColor(paramInt1);
    int i = a(localContext, 3);
    localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(paramx.widthPixels - i, paramx.heightPixels - i, 17));
    paramViewGroup.addView(localFrameLayout, paramx.widthPixels, paramx.heightPixels);
  }
  
  public static boolean aq()
  {
    return Build.DEVICE.startsWith("generic");
  }
  
  public static boolean ar()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static void b(ViewGroup paramViewGroup, x paramx, String paramString)
  {
    a(paramViewGroup, paramx, paramString, -16777216, -1);
  }
  
  public static String l(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    if ((str == null) || (aq())) {
      str = "emulator";
    }
    return l(str);
  }
  
  public static String l(String paramString)
  {
    int i = 0;
    while (i < 2) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes());
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
        String str = String.format(localLocale, "%032X", arrayOfObject);
        return str;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    }
    return null;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cm
 * JD-Core Version:    0.7.0.1
 */