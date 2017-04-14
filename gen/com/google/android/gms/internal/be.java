package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class be
  implements SafeParcelable
{
  public static final bd CREATOR = new bd();
  public final String fA;
  public final String fB;
  public final String fC;
  public final String fy;
  public final String fz;
  public final String mimeType;
  public final String packageName;
  public final int versionCode;
  
  public be(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.versionCode = paramInt;
    this.fy = paramString1;
    this.fz = paramString2;
    this.mimeType = paramString3;
    this.packageName = paramString4;
    this.fA = paramString5;
    this.fB = paramString6;
    this.fC = paramString7;
  }
  
  public be(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(1, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bd.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.be
 * JD-Core Version:    0.7.0.1
 */