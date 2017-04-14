package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class Cart
  implements SafeParcelable
{
  public static final Parcelable.Creator<Cart> CREATOR = new b();
  private final int iM;
  String tD;
  String tE;
  ArrayList<LineItem> tF;
  
  public Cart()
  {
    this.iM = 1;
    this.tF = new ArrayList();
  }
  
  Cart(int paramInt, String paramString1, String paramString2, ArrayList<LineItem> paramArrayList)
  {
    this.iM = paramInt;
    this.tD = paramString1;
    this.tE = paramString2;
    this.tF = paramArrayList;
  }
  
  public static Builder newBuilder()
  {
    Cart localCart = new Cart();
    localCart.getClass();
    return new Builder(null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCurrencyCode()
  {
    return this.tE;
  }
  
  public ArrayList<LineItem> getLineItems()
  {
    return this.tF;
  }
  
  public String getTotalPrice()
  {
    return this.tD;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
  
  public final class Builder
  {
    private Builder() {}
    
    public Builder addLineItem(LineItem paramLineItem)
    {
      Cart.this.tF.add(paramLineItem);
      return this;
    }
    
    public Cart build()
    {
      return Cart.this;
    }
    
    public Builder setCurrencyCode(String paramString)
    {
      Cart.this.tE = paramString;
      return this;
    }
    
    public Builder setLineItems(List<LineItem> paramList)
    {
      Cart.this.tF.clear();
      Cart.this.tF.addAll(paramList);
      return this;
    }
    
    public Builder setTotalPrice(String paramString)
    {
      Cart.this.tD = paramString;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart
 * JD-Core Version:    0.7.0.1
 */