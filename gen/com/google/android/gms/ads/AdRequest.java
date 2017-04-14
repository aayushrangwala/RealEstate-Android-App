package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.cm;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class AdRequest
{
  public static final String DEVICE_ID_EMULATOR = cm.l("emulator");
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN;
  private final Date d;
  private final int dI;
  private final Map<Class<? extends NetworkExtras>, NetworkExtras> dJ;
  private final int dK;
  private final Set<String> dL;
  private final Set<String> f;
  
  private AdRequest(Builder paramBuilder)
  {
    this.d = Builder.a(paramBuilder);
    this.dI = Builder.b(paramBuilder);
    this.f = Collections.unmodifiableSet(Builder.c(paramBuilder));
    this.dJ = Collections.unmodifiableMap(Builder.d(paramBuilder));
    this.dK = Builder.e(paramBuilder);
    this.dL = Collections.unmodifiableSet(Builder.f(paramBuilder));
  }
  
  public Date getBirthday()
  {
    return this.d;
  }
  
  public int getGender()
  {
    return this.dI;
  }
  
  public Set<String> getKeywords()
  {
    return this.f;
  }
  
  public <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return (NetworkExtras)this.dJ.get(paramClass);
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.dL.contains(cm.l(paramContext));
  }
  
  Map<Class<? extends NetworkExtras>, NetworkExtras> v()
  {
    return this.dJ;
  }
  
  public int w()
  {
    return this.dK;
  }
  
  public static final class Builder
  {
    private Date d;
    private int dI = -1;
    private int dK = -1;
    private final HashSet<String> dM = new HashSet();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> dN = new HashMap();
    private final HashSet<String> dO = new HashSet();
    
    public Builder addKeyword(String paramString)
    {
      this.dM.add(paramString);
      return this;
    }
    
    public Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
    {
      this.dN.put(paramNetworkExtras.getClass(), paramNetworkExtras);
      return this;
    }
    
    public Builder addTestDevice(String paramString)
    {
      this.dO.add(paramString);
      return this;
    }
    
    public AdRequest build()
    {
      return new AdRequest(this, null);
    }
    
    public Builder setBirthday(Date paramDate)
    {
      this.d = paramDate;
      return this;
    }
    
    public Builder setGender(int paramInt)
    {
      this.dI = paramInt;
      return this;
    }
    
    public Builder tagForChildDirectedTreatment(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        this.dK = i;
        return this;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdRequest
 * JD-Core Version:    0.7.0.1
 */