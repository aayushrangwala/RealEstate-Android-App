package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class ca
{
  private static final SimpleDateFormat gS = new SimpleDateFormat("yyyyMMdd");
  
  public static String a(bu parambu, cd paramcd, Location paramLocation)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      if (parambu.gA != null) {
        localHashMap.put("ad_pos", parambu.gA);
      }
      a(localHashMap, parambu.gB);
      localHashMap.put("format", parambu.ed.ew);
      if (parambu.ed.width == -1) {
        localHashMap.put("smart_w", "full");
      }
      if (parambu.ed.height == -2) {
        localHashMap.put("smart_h", "auto");
      }
      localHashMap.put("slotname", parambu.adUnitId);
      localHashMap.put("pn", parambu.applicationInfo.packageName);
      if (parambu.gC != null) {
        localHashMap.put("vc", Integer.valueOf(parambu.gC.versionCode));
      }
      localHashMap.put("ms", parambu.gD);
      localHashMap.put("seq_num", parambu.gE);
      localHashMap.put("session_id", parambu.gF);
      localHashMap.put("js", parambu.eg.hP);
      a(localHashMap, paramcd);
      a(localHashMap, paramLocation);
      if (cn.k(2))
      {
        String str2 = ci.l(localHashMap).toString(2);
        cn.p("Ad Request JSON: " + str2);
      }
      String str1 = ci.l(localHashMap).toString();
      return str1;
    }
    catch (JSONException localJSONException)
    {
      cn.q("Problem serializing ad request to JSON: " + localJSONException.getMessage());
    }
    return null;
  }
  
  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    if (paramLocation == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(1000.0F * paramLocation.getAccuracy());
    Long localLong1 = Long.valueOf(1000L * paramLocation.getTime());
    Long localLong2 = Long.valueOf((10000000.0D * paramLocation.getLatitude()));
    Long localLong3 = Long.valueOf((10000000.0D * paramLocation.getLongitude()));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("loc", localHashMap);
  }
  
  private static void a(HashMap<String, Object> paramHashMap, cd paramcd)
  {
    paramHashMap.put("am", Integer.valueOf(paramcd.hh));
    paramHashMap.put("cog", g(paramcd.hi));
    paramHashMap.put("coh", g(paramcd.hj));
    if (!TextUtils.isEmpty(paramcd.hk)) {
      paramHashMap.put("carrier", paramcd.hk);
    }
    paramHashMap.put("gl", paramcd.hl);
    if (paramcd.hm) {
      paramHashMap.put("simulator", Integer.valueOf(1));
    }
    paramHashMap.put("ma", g(paramcd.hn));
    paramHashMap.put("sp", g(paramcd.ho));
    paramHashMap.put("hl", paramcd.hp);
    if (!TextUtils.isEmpty(paramcd.hq)) {
      paramHashMap.put("mv", paramcd.hq);
    }
    paramHashMap.put("muv", Integer.valueOf(paramcd.hr));
    if (paramcd.hs != -2) {
      paramHashMap.put("cnt", Integer.valueOf(paramcd.hs));
    }
    paramHashMap.put("gnt", Integer.valueOf(paramcd.ht));
    paramHashMap.put("pt", Integer.valueOf(paramcd.hu));
    paramHashMap.put("rm", Integer.valueOf(paramcd.hv));
    paramHashMap.put("riv", Integer.valueOf(paramcd.hw));
    paramHashMap.put("u_sd", Float.valueOf(paramcd.hx));
    paramHashMap.put("sh", Integer.valueOf(paramcd.hz));
    paramHashMap.put("sw", Integer.valueOf(paramcd.hy));
  }
  
  private static void a(HashMap<String, Object> paramHashMap, v paramv)
  {
    if (paramv.es != -1L) {
      paramHashMap.put("cust_age", gS.format(new Date(paramv.es)));
    }
    if (paramv.extras != null) {
      paramHashMap.put("extras", paramv.extras);
    }
    if (paramv.et != -1) {
      paramHashMap.put("cust_gender", Integer.valueOf(paramv.et));
    }
    if (paramv.eu != null) {
      paramHashMap.put("kw", paramv.eu);
    }
    if (paramv.tagForChildDirectedTreatment != -1) {
      paramHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(paramv.tagForChildDirectedTreatment));
    }
    if (paramv.ev) {
      paramHashMap.put("adtest", "on");
    }
  }
  
  private static Integer g(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ca
 * JD-Core Version:    0.7.0.1
 */