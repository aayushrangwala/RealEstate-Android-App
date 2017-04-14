package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.ads.AdSize;

public final class aa
{
  private final AdSize c;
  private final String dV;
  
  public aa(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.AdsAttrs);
    String str = localTypedArray.getString(0);
    if (TextUtils.isEmpty(str)) {
      throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
    }
    this.c = f(str)[0];
    this.dV = localTypedArray.getString(1);
    if (TextUtils.isEmpty(this.dV)) {
      throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
    }
  }
  
  private static AdSize[] f(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\\s*,\\s*");
    AdSize[] arrayOfAdSize = new AdSize[arrayOfString1.length];
    int i = 0;
    if (i < arrayOfString1.length)
    {
      String str = arrayOfString1[i].trim();
      String[] arrayOfString2;
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        arrayOfString2 = str.split("[xX]");
        arrayOfString2[0] = arrayOfString2[0].trim();
        arrayOfString2[1] = arrayOfString2[1].trim();
      }
      for (;;)
      {
        try
        {
          if ("FULL_WIDTH".equals(arrayOfString2[0]))
          {
            j = -1;
            boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
            if (!bool) {
              continue;
            }
            m = -2;
            arrayOfAdSize[i] = new AdSize(j, m);
            i++;
            break;
          }
          int j = Integer.parseInt(arrayOfString2[0]);
          continue;
          int k = Integer.parseInt(arrayOfString2[1]);
          int m = k;
          continue;
          if (!"BANNER".equals(str)) {
            break label202;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
        }
        arrayOfAdSize[i] = AdSize.BANNER;
        continue;
        label202:
        if ("FULL_BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.FULL_BANNER;
        }
        else if ("LEADERBOARD".equals(str))
        {
          arrayOfAdSize[i] = AdSize.LEADERBOARD;
        }
        else if ("MEDIUM_RECTANGLE".equals(str))
        {
          arrayOfAdSize[i] = AdSize.MEDIUM_RECTANGLE;
        }
        else if ("SMART_BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.SMART_BANNER;
        }
        else
        {
          if (!"WIDE_SKYSCRAPER".equals(str)) {
            break label297;
          }
          arrayOfAdSize[i] = AdSize.WIDE_SKYSCRAPER;
        }
      }
      label297:
      throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }
    if (arrayOfAdSize.length == 0) {
      throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + paramString);
    }
    return arrayOfAdSize;
  }
  
  public AdSize getAdSize()
  {
    return this.c;
  }
  
  public String getAdUnitId()
  {
    return this.dV;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aa
 * JD-Core Version:    0.7.0.1
 */