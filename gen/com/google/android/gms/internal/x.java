package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class x
  implements SafeParcelable
{
  public static final y CREATOR = new y();
  public final String ew;
  public final boolean ex;
  public final int height;
  public final int heightPixels;
  public final int versionCode;
  public final int width;
  public final int widthPixels;
  
  public x()
  {
    this(1, "interstitial_mb", 0, 0, true, 0, 0);
  }
  
  x(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    this.versionCode = paramInt1;
    this.ew = paramString;
    this.height = paramInt2;
    this.heightPixels = paramInt3;
    this.ex = paramBoolean;
    this.width = paramInt4;
    this.widthPixels = paramInt5;
  }
  
  public x(Context paramContext, AdSize paramAdSize)
  {
    this.versionCode = i;
    this.ex = false;
    this.width = paramAdSize.getWidth();
    this.height = paramAdSize.getHeight();
    int j;
    label52:
    DisplayMetrics localDisplayMetrics;
    int m;
    if (this.width == -1)
    {
      j = i;
      if (this.height != -2) {
        break label161;
      }
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (j == 0) {
        break label166;
      }
      this.widthPixels = a(localDisplayMetrics);
      m = (int)(this.widthPixels / localDisplayMetrics.density);
      label89:
      if (i == 0) {
        break label192;
      }
    }
    label161:
    label166:
    label192:
    for (int n = c(localDisplayMetrics);; n = this.height)
    {
      this.heightPixels = cm.a(localDisplayMetrics, n);
      if ((j == 0) && (i == 0)) {
        break label201;
      }
      this.ew = (m + "x" + n + "_as");
      return;
      j = 0;
      break;
      i = 0;
      break label52;
      int k = this.width;
      this.widthPixels = cm.a(localDisplayMetrics, this.width);
      m = k;
      break label89;
    }
    label201:
    this.ew = paramAdSize.toString();
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (i <= 400) {
      return 32;
    }
    if (i <= 720) {
      return 50;
    }
    return 90;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    y.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.x
 * JD-Core Version:    0.7.0.1
 */