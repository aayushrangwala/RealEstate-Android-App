package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LoyaltyWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new f();
  private final int iM;
  String tU;
  String tV;
  String tW;
  String tX;
  String tY;
  
  public LoyaltyWalletObject()
  {
    this.iM = 2;
  }
  
  LoyaltyWalletObject(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.iM = paramInt;
    this.tU = paramString1;
    this.tV = paramString2;
    this.tW = paramString3;
    this.tX = paramString4;
    this.tY = paramString5;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAccountId()
  {
    return this.tV;
  }
  
  public String getAccountName()
  {
    return this.tY;
  }
  
  public String getId()
  {
    return this.tU;
  }
  
  public String getIssuerName()
  {
    return this.tW;
  }
  
  public String getProgramName()
  {
    return this.tX;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.LoyaltyWalletObject
 * JD-Core Version:    0.7.0.1
 */