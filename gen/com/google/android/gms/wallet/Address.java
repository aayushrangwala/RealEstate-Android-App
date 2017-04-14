package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Address
  implements SafeParcelable
{
  public static final Parcelable.Creator<Address> CREATOR = new a();
  String hl;
  private final int iM;
  String name;
  String tA;
  boolean tB;
  String tC;
  String tu;
  String tv;
  String tw;
  String tx;
  String ty;
  String tz;
  
  public Address()
  {
    this.iM = 1;
  }
  
  Address(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10)
  {
    this.iM = paramInt;
    this.name = paramString1;
    this.tu = paramString2;
    this.tv = paramString3;
    this.tw = paramString4;
    this.hl = paramString5;
    this.tx = paramString6;
    this.ty = paramString7;
    this.tz = paramString8;
    this.tA = paramString9;
    this.tB = paramBoolean;
    this.tC = paramString10;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress1()
  {
    return this.tu;
  }
  
  public String getAddress2()
  {
    return this.tv;
  }
  
  public String getAddress3()
  {
    return this.tw;
  }
  
  public String getCity()
  {
    return this.tx;
  }
  
  public String getCompanyName()
  {
    return this.tC;
  }
  
  public String getCountryCode()
  {
    return this.hl;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPhoneNumber()
  {
    return this.tA;
  }
  
  public String getPostalCode()
  {
    return this.tz;
  }
  
  public String getState()
  {
    return this.ty;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean isPostBox()
  {
    return this.tB;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Address
 * JD-Core Version:    0.7.0.1
 */