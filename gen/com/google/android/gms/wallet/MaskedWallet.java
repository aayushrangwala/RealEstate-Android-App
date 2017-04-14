package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MaskedWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator<MaskedWallet> CREATOR = new g();
  private final int iM;
  String tH;
  String tI;
  String tK;
  Address tL;
  Address tM;
  String[] tN;
  LoyaltyWalletObject[] tZ;
  OfferWalletObject[] ua;
  
  public MaskedWallet()
  {
    this.iM = 2;
  }
  
  MaskedWallet(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Address paramAddress1, Address paramAddress2, LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject, OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    this.iM = paramInt;
    this.tH = paramString1;
    this.tI = paramString2;
    this.tN = paramArrayOfString;
    this.tK = paramString3;
    this.tL = paramAddress1;
    this.tM = paramAddress2;
    this.tZ = paramArrayOfLoyaltyWalletObject;
    this.ua = paramArrayOfOfferWalletObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Address getBillingAddress()
  {
    return this.tL;
  }
  
  public String getEmail()
  {
    return this.tK;
  }
  
  public String getGoogleTransactionId()
  {
    return this.tH;
  }
  
  public LoyaltyWalletObject[] getLoyaltyWalletObjects()
  {
    return this.tZ;
  }
  
  public String getMerchantTransactionId()
  {
    return this.tI;
  }
  
  public OfferWalletObject[] getOfferWalletObjects()
  {
    return this.ua;
  }
  
  public String[] getPaymentDescriptions()
  {
    return this.tN;
  }
  
  public Address getShippingAddress()
  {
    return this.tM;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet
 * JD-Core Version:    0.7.0.1
 */