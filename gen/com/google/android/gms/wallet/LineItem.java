package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LineItem
  implements SafeParcelable
{
  public static final Parcelable.Creator<LineItem> CREATOR = new e();
  String description;
  private final int iM;
  String tD;
  String tE;
  String tQ;
  String tR;
  int tS = 0;
  
  public LineItem()
  {
    this.iM = 1;
  }
  
  LineItem(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, String paramString5)
  {
    this.iM = paramInt1;
    this.description = paramString1;
    this.tQ = paramString2;
    this.tR = paramString3;
    this.tD = paramString4;
    this.tS = paramInt2;
    this.tE = paramString5;
  }
  
  public static Builder newBuilder()
  {
    LineItem localLineItem = new LineItem();
    localLineItem.getClass();
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
  
  public String getDescription()
  {
    return this.description;
  }
  
  public String getQuantity()
  {
    return this.tQ;
  }
  
  public int getRole()
  {
    return this.tS;
  }
  
  public String getTotalPrice()
  {
    return this.tD;
  }
  
  public String getUnitPrice()
  {
    return this.tR;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
  
  public final class Builder
  {
    private Builder() {}
    
    public LineItem build()
    {
      return LineItem.this;
    }
    
    public Builder setCurrencyCode(String paramString)
    {
      LineItem.this.tE = paramString;
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      LineItem.this.description = paramString;
      return this;
    }
    
    public Builder setQuantity(String paramString)
    {
      LineItem.this.tQ = paramString;
      return this;
    }
    
    public Builder setRole(int paramInt)
    {
      LineItem.this.tS = paramInt;
      return this;
    }
    
    public Builder setTotalPrice(String paramString)
    {
      LineItem.this.tD = paramString;
      return this;
    }
    
    public Builder setUnitPrice(String paramString)
    {
      LineItem.this.tR = paramString;
      return this;
    }
  }
  
  public static abstract interface Role
  {
    public static final int REGULAR = 0;
    public static final int SHIPPING = 2;
    public static final int TAX = 1;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.LineItem
 * JD-Core Version:    0.7.0.1
 */