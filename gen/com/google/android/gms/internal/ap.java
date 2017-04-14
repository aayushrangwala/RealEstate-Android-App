package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap
{
  public final List<ao> eU;
  public final long eV;
  public final List<String> eW;
  public final List<String> eX;
  public final List<String> eY;
  public final String eZ;
  public final long fa;
  
  public ap(String paramString)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    if (cn.k(2)) {
      cn.p("Mediation Response JSON: " + localJSONObject1.toString(2));
    }
    JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++) {
      localArrayList.add(new ao(localJSONArray.getJSONObject(i)));
    }
    this.eU = Collections.unmodifiableList(localArrayList);
    this.eZ = localJSONObject1.getString("qdata");
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    if (localJSONObject2 != null)
    {
      this.eV = localJSONObject2.optLong("ad_network_timeout_millis", -1L);
      this.eW = au.a(localJSONObject2, "click_urls");
      this.eX = au.a(localJSONObject2, "imp_urls");
      this.eY = au.a(localJSONObject2, "nofill_urls");
      long l1 = localJSONObject2.optLong("refresh", -1L);
      if (l1 > 0L) {}
      for (long l2 = 1000L * l1;; l2 = -1L)
      {
        this.fa = l2;
        return;
      }
    }
    this.eV = -1L;
    this.eW = null;
    this.eX = null;
    this.eY = null;
    this.fa = -1L;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ap
 * JD-Core Version:    0.7.0.1
 */