package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWallet> CREATOR = new c();
  private final int iM;
  String tH;
  String tI;
  ProxyCard tJ;
  String tK;
  Address tL;
  Address tM;
  String[] tN;
  
  public FullWallet()
  {
    this.iM = 1;
  }
  
  FullWallet(int paramInt, String paramString1, String paramString2, ProxyCard paramProxyCard, String paramString3, Address paramAddress1, Address paramAddress2, String[] paramArrayOfString)
  {
    this.iM = paramInt;
    this.tH = paramString1;
    this.tI = paramString2;
    this.tJ = paramProxyCard;
    this.tK = paramString3;
    this.tL = paramAddress1;
    this.tM = paramAddress2;
    this.tN = paramArrayOfString;
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
  
  public String getMerchantTransactionId()
  {
    return this.tI;
  }
  
  public String[] getPaymentDescriptions()
  {
    return this.tN;
  }
  
  public ProxyCard getProxyCard()
  {
    return this.tJ;
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
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWallet
 * JD-Core Version:    0.7.0.1
 */