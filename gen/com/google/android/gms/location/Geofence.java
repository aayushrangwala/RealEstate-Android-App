package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.fa;

public abstract interface Geofence
{
  public static final int GEOFENCE_TRANSITION_DWELL = 4;
  public static final int GEOFENCE_TRANSITION_ENTER = 1;
  public static final int GEOFENCE_TRANSITION_EXIT = 2;
  public static final long NEVER_EXPIRE = -1L;
  
  public abstract String getRequestId();
  
  public static final class Builder
  {
    private String oA = null;
    private int oB = 0;
    private long oC = -9223372036854775808L;
    private short oD = -1;
    private double oE;
    private double oF;
    private float oG;
    private int oH = 0;
    private int oI = -1;
    
    public Geofence build()
    {
      if (this.oA == null) {
        throw new IllegalArgumentException("Request ID not set.");
      }
      if (this.oB == 0) {
        throw new IllegalArgumentException("Transitions types not set.");
      }
      if (((0x4 & this.oB) != 0) && (this.oI < 0)) {
        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
      }
      if (this.oC == -9223372036854775808L) {
        throw new IllegalArgumentException("Expiration not set.");
      }
      if (this.oD == -1) {
        throw new IllegalArgumentException("Geofence region not set.");
      }
      if (this.oH < 0) {
        throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
      }
      return new fa(this.oA, this.oB, (short)1, this.oE, this.oF, this.oG, this.oC, this.oH, this.oI);
    }
    
    public Builder setCircularRegion(double paramDouble1, double paramDouble2, float paramFloat)
    {
      this.oD = 1;
      this.oE = paramDouble1;
      this.oF = paramDouble2;
      this.oG = paramFloat;
      return this;
    }
    
    public Builder setExpirationDuration(long paramLong)
    {
      if (paramLong < 0L)
      {
        this.oC = -1L;
        return this;
      }
      this.oC = (paramLong + SystemClock.elapsedRealtime());
      return this;
    }
    
    public Builder setLoiteringDelay(int paramInt)
    {
      this.oI = paramInt;
      return this;
    }
    
    public Builder setNotificationResponsiveness(int paramInt)
    {
      this.oH = paramInt;
      return this;
    }
    
    public Builder setRequestId(String paramString)
    {
      this.oA = paramString;
      return this;
    }
    
    public Builder setTransitionTypes(int paramInt)
    {
      this.oB = paramInt;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.Geofence
 * JD-Core Version:    0.7.0.1
 */