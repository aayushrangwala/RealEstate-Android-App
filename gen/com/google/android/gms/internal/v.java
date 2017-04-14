package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class v
  implements SafeParcelable
{
  public static final w CREATOR = new w();
  public final long es;
  public final int et;
  public final List<String> eu;
  public final boolean ev;
  public final Bundle extras;
  public final int tagForChildDirectedTreatment;
  public final int versionCode;
  
  v(int paramInt1, long paramLong, Bundle paramBundle, int paramInt2, List<String> paramList, boolean paramBoolean, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.es = paramLong;
    this.extras = paramBundle;
    this.et = paramInt2;
    this.eu = paramList;
    this.ev = paramBoolean;
    this.tagForChildDirectedTreatment = paramInt3;
  }
  
  public v(Context paramContext, AdRequest paramAdRequest)
  {
    this.versionCode = 1;
    Date localDate = paramAdRequest.getBirthday();
    long l;
    Set localSet;
    if (localDate != null)
    {
      l = localDate.getTime();
      this.es = l;
      this.et = paramAdRequest.getGender();
      localSet = paramAdRequest.getKeywords();
      if (localSet.isEmpty()) {
        break label132;
      }
    }
    label132:
    for (List localList = Collections.unmodifiableList(new ArrayList(localSet));; localList = null)
    {
      this.eu = localList;
      this.ev = paramAdRequest.isTestDevice(paramContext);
      this.tagForChildDirectedTreatment = paramAdRequest.w();
      AdMobExtras localAdMobExtras = (AdMobExtras)paramAdRequest.getNetworkExtras(AdMobExtras.class);
      Bundle localBundle = null;
      if (localAdMobExtras != null) {
        localBundle = localAdMobExtras.getExtras();
      }
      this.extras = localBundle;
      return;
      l = -1L;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v
 * JD-Core Version:    0.7.0.1
 */