package com.google.ads.mediation.admob;

import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.Parameter;

public final class AdMobServerParameters
  extends MediationServerParameters
{
  @MediationServerParameters.Parameter(name="pubid")
  public String adUnitId;
  @MediationServerParameters.Parameter(name="mad_hac", required=false)
  public String allowHouseAds = null;
  public int tagForChildDirectedTreatment = -1;
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobServerParameters
 * JD-Core Version:    0.7.0.1
 */