package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException
  extends UserRecoverableAuthException
{
  private final int iL;
  
  GooglePlayServicesAvailabilityException(int paramInt, String paramString, Intent paramIntent)
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
 * Qualified Name:     com.google.android.gms.auth.GooglePlayServicesAvailabilityException
 * JD-Core Version:    0.7.0.1
 */