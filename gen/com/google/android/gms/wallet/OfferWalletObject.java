package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OfferWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator<OfferWalletObject> CREATOR = new j();
  private final int iM;
  String tU;
  String ul;
  
  public OfferWalletObject()
  {
    this.iM = 2;
  }
  
  OfferWalletObject(int paramInt, String paramString1, String paramString2)
  {
    this.iM = paramInt;
    this.tU = paramString1;
    this.ul = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getId()
  {
    return this.tU;
  }
  
  public String getRedemptionCode()
  {
    return this.ul;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.OfferWalletObject
 * JD-Core Version:    0.7.0.1
 */