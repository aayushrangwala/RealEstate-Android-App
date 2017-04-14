package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public class fa
  implements SafeParcelable, Geofence
{
  public static final fb CREATOR = new fb();
  private final int iM;
  private final String oA;
  private final int oB;
  private final short oD;
  private final double oE;
  private final double oF;
  private final float oG;
  private final int oH;
  private final int oI;
  private final long pc;
  
  public fa(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    R(paramString);
    b(paramFloat);
    a(paramDouble1, paramDouble2);
    int i = aa(paramInt2);
    this.iM = paramInt1;
    this.oD = paramShort;
    this.oA = paramString;
    this.oE = paramDouble1;
    this.oF = paramDouble2;
    this.oG = paramFloat;
    this.pc = paramLong;
    this.oB = i;
    this.oH = paramInt3;
    this.oI = paramInt4;
  }
  
  public fa(String paramString, int paramInt1, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt2, int paramInt3)
  {
    this(1, paramString, paramInt1, paramShort, paramDouble1, paramDouble2, paramFloat, paramLong, paramInt2, paramInt3);
  }
  
  private static void R(String paramString)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
  }
  
  private static void a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
  }
  
  private static int aa(int paramInt)
  {
    int i = paramInt & 0x7;
    if (i == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt);
    }
    return i;
  }
  
  private static String ab(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return "CIRCLE";
  }
  
  private static void b(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
  }
  
  public static fa d(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    fa localfa = CREATOR.z(localParcel);
    localParcel.recycle();
    return localfa;
  }
  
  public short co()
  {
    return this.oD;
  }
  
  public float cp()
  {
    return this.oG;
  }
  
  public int cq()
  {
    return this.oB;
  }
  
  public int cr()
  {
    return this.oI;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    fa localfa;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof fa)) {
        return false;
      }
      localfa = (fa)paramObject;
      if (this.oG != localfa.oG) {
        return false;
      }
      if (this.oE != localfa.oE) {
        return false;
      }
      if (this.oF != localfa.oF) {
        return false;
      }
    } while (this.oD == localfa.oD);
    return false;
  }
  
  public long getExpirationTime()
  {
    return this.pc;
  }
  
  public double getLatitude()
  {
    return this.oE;
  }
  
  public double getLongitude()
  {
    return this.oF;
  }
  
  public int getNotificationResponsiveness()
  {
    return this.oH;
  }
  
  public String getRequestId()
  {
    return this.oA;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.oE);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.oF);
    return 31 * (31 * (31 * (i * 31 + (int)(l2 ^ l2 >>> 32)) + Float.floatToIntBits(this.oG)) + this.oD) + this.oB;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = ab(this.oD);
    arrayOfObject[1] = this.oA;
    arrayOfObject[2] = Integer.valueOf(this.oB);
    arrayOfObject[3] = Double.valueOf(this.oE);
    arrayOfObject[4] = Double.valueOf(this.oF);
    arrayOfObject[5] = Float.valueOf(this.oG);
    arrayOfObject[6] = Integer.valueOf(this.oH / 1000);
    arrayOfObject[7] = Integer.valueOf(this.oI);
    arrayOfObject[8] = Long.valueOf(this.pc);
    return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fb.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fa
 * JD-Core Version:    0.7.0.1
 */