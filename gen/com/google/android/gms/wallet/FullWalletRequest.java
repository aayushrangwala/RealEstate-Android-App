package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FullWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWalletRequest> CREATOR = new d();
  private final int iM;
  String tH;
  String tI;
  Cart tO;
  
  public FullWalletRequest()
  {
    this.iM = 1;
  }
  
  FullWalletRequest(int paramInt, String paramString1, String paramString2, Cart paramCart)
  {
    this.iM = paramInt;
    this.tH = paramString1;
    this.tI = paramString2;
    this.tO = paramCart;
  }
  
  public static Builder newBuilder()
  {
    FullWalletRequest localFullWalletRequest = new FullWalletRequest();
    localFullWalletRequest.getClass();
    return new Builder(null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Cart getCart()
  {
    return this.tO;
  }
  
  public String getGoogleTransactionId()
  {
    return this.tH;
  }
  
  public String getMerchantTransactionId()
  {
    return this.tI;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
  
  public final class Builder
  {
    private Builder() {}
    
    public FullWalletRequest build()
    {
      return FullWalletRequest.this;
    }
    
    public Builder setCart(Cart paramCart)
    {
      FullWalletRequest.this.tO = paramCart;
      return this;
    }
    
    public Builder setGoogleTransactionId(String paramString)
    {
      FullWalletRequest.this.tH = paramString;
      return this;
    }
    
    public Builder setMerchantTransactionId(String paramString)
    {
      FullWalletRequest.this.tI = paramString;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest
 * JD-Core Version:    0.7.0.1
 */