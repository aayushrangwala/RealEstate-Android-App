package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException
  extends UserRecoverableException
{
  private final int iL;
  
  GooglePlayServicesRepairableException(int paramInt, String paramString, Intent paramIntent)
  {
    super(paramString, paramIntent);
    this.iL = paramInt;
  }
  
  public int getConnectionStatusCode()
  {
    return this.iL;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesRepairableException
 * JD-Core Version:    0.7.0.1
 */