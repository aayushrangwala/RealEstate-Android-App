package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class MaskedWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new h();
  private final int iM;
  String tE;
  String tI;
  Cart tO;
  boolean ub;
  boolean uc;
  boolean ud;
  String ue;
  String uf;
  boolean ug;
  boolean uh;
  
  public MaskedWalletRequest()
  {
    this.iM = 2;
  }
  
  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5)
  {
    this.iM = paramInt;
    this.tI = paramString1;
    this.ub = paramBoolean1;
    this.uc = paramBoolean2;
    this.ud = paramBoolean3;
    this.ue = paramString2;
    this.tE = paramString3;
    this.uf = paramString4;
    this.tO = paramCart;
    this.ug = paramBoolean4;
    this.uh = paramBoolean5;
  }
  
  public static Builder newBuilder()
  {
    MaskedWalletRequest localMaskedWalletRequest = new MaskedWalletRequest();
    localMaskedWalletRequest.getClass();
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
  
  public String getCurrencyCode()
  {
    return this.tE;
  }
  
  public String getEstimatedTotalPrice()
  {
    return this.ue;
  }
  
  public String getMerchantName()
  {
    return this.uf;
  }
  
  public String getMerchantTransactionId()
  {
    return this.tI;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean isBillingAgreement()
  {
    return this.uh;
  }
  
  public boolean isPhoneNumberRequired()
  {
    return this.ub;
  }
  
  public boolean isShippingAddressRequired()
  {
    return this.uc;
  }
  
  public boolean shouldRetrieveWalletObjects()
  {
    return this.ug;
  }
  
  public boolean useMinimalBillingAddress()
  {
    return this.ud;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
  
  public final class Builder
  {
    private Builder() {}
    
    public MaskedWalletRequest build()
    {
      return MaskedWalletRequest.this;
    }
    
    public Builder setCart(Cart paramCart)
    {
      MaskedWalletRequest.this.tO = paramCart;
      return this;
    }
    
    public Builder setCurrencyCode(String paramString)
    {
      MaskedWalletRequest.this.tE = paramString;
      return this;
    }
    
    public Builder setEstimatedTotalPrice(String paramString)
    {
      MaskedWalletRequest.this.ue = paramString;
      return this;
    }
    
    public Builder setIsBillingAgreement(boolean paramBoolean)
    {
      MaskedWalletRequest.this.uh = paramBoolean;
      return this;
    }
    
    public Builder setMerchantName(String paramString)
    {
      MaskedWalletRequest.this.uf = paramString;
      return this;
    }
    
    public Builder setMerchantTransactionId(String paramString)
    {
      MaskedWalletRequest.this.tI = paramString;
      return this;
    }
    
    public Builder setPhoneNumberRequired(boolean paramBoolean)
    {
      MaskedWalletRequest.this.ub = paramBoolean;
      return this;
    }
    
    public Builder setShippingAddressRequired(boolean paramBoolean)
    {
      MaskedWalletRequest.this.uc = paramBoolean;
      return this;
    }
    
    public Builder setShouldRetrieveWalletObjects(boolean paramBoolean)
    {
      MaskedWalletRequest.this.ug = paramBoolean;
      return this;
    }
    
    public Builder setUseMinimalBillingAddress(boolean paramBoolean)
    {
      MaskedWalletRequest.this.ud = paramBoolean;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest
 * JD-Core Version:    0.7.0.1
 */