package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class bw
  implements SafeParcelable
{
  public static final bx CREATOR = new bx();
  public final List<String> eW;
  public final List<String> eX;
  public final int errorCode;
  public final String fW;
  public final long fa;
  public final String gG;
  public final long gH;
  public final boolean gI;
  public final long gJ;
  public final List<String> gK;
  public final int orientation;
  public final int versionCode;
  
  public bw(int paramInt)
  {
    this(1, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1);
  }
  
  bw(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.fW = paramString1;
    this.gG = paramString2;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.eW = localList1;
      this.errorCode = paramInt2;
      if (paramList2 == null) {
        break label116;
      }
      localList2 = Collections.unmodifiableList(paramList2);
      label55:
      this.eX = localList2;
      this.gH = paramLong1;
      this.gI = paramBoolean;
      this.gJ = paramLong2;
      if (paramList3 == null) {
        break label122;
      }
    }
    label116:
    label122:
    for (List localList3 = Collections.unmodifiableList(paramList3);; localList3 = null)
    {
      this.gK = localList3;
      this.fa = paramLong3;
      this.orientation = paramInt3;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label55;
    }
  }
  
  public bw(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt)
  {
    this(1, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean, paramLong2, paramList3, paramLong3, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bx.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bw
 * JD-Core Version:    0.7.0.1
 */