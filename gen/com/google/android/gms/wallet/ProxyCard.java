package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new k();
  private final int iM;
  String um;
  String un;
  int uo;
  int up;
  
  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.iM = paramInt1;
    this.um = paramString1;
    this.un = paramString2;
    this.uo = paramInt2;
    this.up = paramInt3;
  }
  
  public ProxyCard(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.iM = 1;
    this.um = paramString1;
    this.un = paramString2;
    this.uo = paramInt1;
    this.up = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCvn()
  {
    return this.un;
  }
  
  public int getExpirationMonth()
  {
    return this.uo;
  }
  
  public int getExpirationYear()
  {
    return this.up;
  }
  
  public String getPan()
  {
    return this.um;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * JD-Core Version:    0.7.0.1
 */