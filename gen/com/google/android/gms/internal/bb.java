package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

public final class bb
{
  public static int a(AdRequest.ErrorCode paramErrorCode)
  {
    switch (1.fx[paramErrorCode.ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static int a(AdRequest.Gender paramGender)
  {
    switch (1.fw[paramGender.ordinal()])
    {
    default: 
      return 0;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  public static com.google.ads.AdSize a(x paramx)
  {
    return new com.google.ads.AdSize(new com.google.android.gms.ads.AdSize(paramx.width, paramx.height, paramx.ew));
  }
  
  public static AdRequest.Gender e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return AdRequest.Gender.UNKNOWN;
    case 2: 
      return AdRequest.Gender.FEMALE;
    }
    return AdRequest.Gender.MALE;
  }
  
  public static MediationAdRequest e(v paramv)
  {
    if (paramv.eu != null) {}
    for (HashSet localHashSet = new HashSet(paramv.eu);; localHashSet = null) {
      return new MediationAdRequest(new Date(paramv.es), e(paramv.et), localHashSet, paramv.ev);
    }
  }
  
  public static final AdRequest.ErrorCode f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return AdRequest.ErrorCode.INTERNAL_ERROR;
    case 1: 
      return AdRequest.ErrorCode.INVALID_REQUEST;
    case 2: 
      return AdRequest.ErrorCode.NETWORK_ERROR;
    }
    return AdRequest.ErrorCode.NO_FILL;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bb
 * JD-Core Version:    0.7.0.1
 */