package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ao
{
  public final String eP;
  public final List<String> eQ;
  public final String eR;
  public final String eS;
  public final List<String> eT;
  
  public ao(JSONObject paramJSONObject)
    throws JSONException
  {
    this.eP = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++) {
      localArrayList.add(localJSONArray.getString(i));
    }
    this.eQ = Collections.unmodifiableList(localArrayList);
    this.eR = paramJSONObject.optString("allocation_id", null);
    this.eT = au.a(paramJSONObject, "imp_urls");
    JSONObject localJSONObject = paramJSONObject.optJSONObject("data");
    if (localJSONObject != null) {}
    for (String str = localJSONObject.toString();; str = null)
    {
      this.eS = str;
      return;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ao
 * JD-Core Version:    0.7.0.1
 */