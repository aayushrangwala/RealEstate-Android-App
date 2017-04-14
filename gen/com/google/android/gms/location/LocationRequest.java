package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;

public final class LocationRequest
  implements SafeParcelable
{
  public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
  public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
  public static final int PRIORITY_HIGH_ACCURACY = 100;
  public static final int PRIORITY_LOW_POWER = 104;
  public static final int PRIORITY_NO_POWER = 105;
  private final int iM;
  int mPriority;
  long oC;
  long oJ;
  long oK;
  boolean oL;
  int oM;
  float oN;
  
  public LocationRequest()
  {
    this.iM = 1;
    this.mPriority = 102;
    this.oJ = 3600000L;
    this.oK = 600000L;
    this.oL = false;
    this.oC = 9223372036854775807L;
    this.oM = 2147483647;
    this.oN = 0.0F;
  }
  
  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat)
  {
    this.iM = paramInt1;
    this.mPriority = paramInt2;
    this.oJ = paramLong1;
    this.oK = paramLong2;
    this.oL = paramBoolean;
    this.oC = paramLong3;
    this.oM = paramInt3;
    this.oN = paramFloat;
  }
  
  private static void X(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    }
  }
  
  public static String Y(int paramInt)
  {
    switch (paramInt)
    {
    case 101: 
    case 103: 
    default: 
      return "???";
    case 100: 
      return "PRIORITY_HIGH_ACCURACY";
    case 102: 
      return "PRIORITY_BALANCED_POWER_ACCURACY";
    case 104: 
      return "PRIORITY_LOW_POWER";
    }
    return "PRIORITY_NO_POWER";
  }
  
  private static void a(float paramFloat)
  {
    if (paramFloat < 0.0F) {
      throw new IllegalArgumentException("invalid displacement: " + paramFloat);
    }
  }
  
  public static LocationRequest create()
  {
    return new LocationRequest();
  }
  
  private static void h(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("invalid interval: " + paramLong);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest)) {
        return false;
      }
      localLocationRequest = (LocationRequest)paramObject;
    } while ((this.mPriority == localLocationRequest.mPriority) && (this.oJ == localLocationRequest.oJ) && (this.oK == localLocationRequest.oK) && (this.oL == localLocationRequest.oL) && (this.oC == localLocationRequest.oC) && (this.oM == localLocationRequest.oM) && (this.oN == localLocationRequest.oN));
    return false;
  }
  
  public long getExpirationTime()
  {
    return this.oC;
  }
  
  public long getFastestInterval()
  {
    return this.oK;
  }
  
  public long getInterval()
  {
    return this.oJ;
  }
  
  public int getNumUpdates()
  {
    return this.oM;
  }
  
  public int getPriority()
  {
    return this.mPriority;
  }
  
  public float getSmallestDisplacement()
  {
    return this.oN;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.mPriority);
    arrayOfObject[1] = Long.valueOf(this.oJ);
    arrayOfObject[2] = Long.valueOf(this.oK);
    arrayOfObject[3] = Boolean.valueOf(this.oL);
    arrayOfObject[4] = Long.valueOf(this.oC);
    arrayOfObject[5] = Integer.valueOf(this.oM);
    arrayOfObject[6] = Float.valueOf(this.oN);
    return dl.hashCode(arrayOfObject);
  }
  
  public LocationRequest setExpirationDuration(long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    if (paramLong > 9223372036854775807L - l) {}
    for (this.oC = 9223372036854775807L;; this.oC = (l + paramLong))
    {
      if (this.oC < 0L) {
        this.oC = 0L;
      }
      return this;
    }
  }
  
  public LocationRequest setExpirationTime(long paramLong)
  {
    this.oC = paramLong;
    if (this.oC < 0L) {
      this.oC = 0L;
    }
    return this;
  }
  
  public LocationRequest setFastestInterval(long paramLong)
  {
    h(paramLong);
    this.oL = true;
    this.oK = paramLong;
    return this;
  }
  
  public LocationRequest setInterval(long paramLong)
  {
    h(paramLong);
    this.oJ = paramLong;
    if (!this.oL) {
      this.oK = ((this.oJ / 6.0D));
    }
    return this;
  }
  
  public LocationRequest setNumUpdates(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("invalid numUpdates: " + paramInt);
    }
    this.oM = paramInt;
    return this;
  }
  
  public LocationRequest setPriority(int paramInt)
  {
    X(paramInt);
    this.mPriority = paramInt;
    return this;
  }
  
  public LocationRequest setSmallestDisplacement(float paramFloat)
  {
    a(paramFloat);
    this.oN = paramFloat;
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Request[").append(Y(this.mPriority));
    if (this.mPriority != 105)
    {
      localStringBuilder.append(" requested=");
      localStringBuilder.append(this.oJ + "ms");
    }
    localStringBuilder.append(" fastest=");
    localStringBuilder.append(this.oK + "ms");
    if (this.oC != 9223372036854775807L)
    {
      long l = this.oC - SystemClock.elapsedRealtime();
      localStringBuilder.append(" expireIn=");
      localStringBuilder.append(l + "ms");
    }
    if (this.oM != 2147483647) {
      localStringBuilder.append(" num=").append(this.oM);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationRequestCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * JD-Core Version:    0.7.0.1
 */