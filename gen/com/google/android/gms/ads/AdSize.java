package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.x;

public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
  public static final int FULL_WIDTH = -1;
  public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
  public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
  public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
  private final int dP;
  private final int dQ;
  private final String dR;
  
  public AdSize(int paramInt1, int paramInt2) {}
  
  public AdSize(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1)) {
      throw new IllegalArgumentException("Invalid width for AdSize: " + paramInt1);
    }
    if ((paramInt2 < 0) && (paramInt2 != -2)) {
      throw new IllegalArgumentException("Invalid height for AdSize: " + paramInt2);
    }
    this.dP = paramInt1;
    this.dQ = paramInt2;
    this.dR = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    AdSize localAdSize;
    do
    {
      return true;
      if (!(paramObject instanceof AdSize)) {
        return false;
      }
      localAdSize = (AdSize)paramObject;
    } while ((this.dP == localAdSize.dP) && (this.dQ == localAdSize.dQ) && (this.dR.equals(localAdSize.dR)));
    return false;
  }
  
  public int getHeight()
  {
    return this.dQ;
  }
  
  public int getHeightInPixels(Context paramContext)
  {
    if (this.dQ == -2) {
      return x.b(paramContext.getResources().getDisplayMetrics());
    }
    return cm.a(paramContext, this.dQ);
  }
  
  public int getWidth()
  {
    return this.dP;
  }
  
  public int getWidthInPixels(Context paramContext)
  {
    if (this.dP == -1) {
      return x.a(paramContext.getResources().getDisplayMetrics());
    }
    return cm.a(paramContext, this.dP);
  }
  
  public int hashCode()
  {
    return this.dR.hashCode();
  }
  
  public boolean isAutoHeight()
  {
    return this.dQ == -2;
  }
  
  public boolean isFullWidth()
  {
    return this.dP == -1;
  }
  
  public String toString()
  {
    return this.dR;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdSize
 * JD-Core Version:    0.7.0.1
 */