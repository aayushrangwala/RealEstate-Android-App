package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class au
{
  public static List<String> a(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray != null)
    {
      ArrayList localArrayList = new ArrayList(localJSONArray.length());
      for (int i = 0; i < localJSONArray.length(); i++) {
        localArrayList.add(localJSONArray.getString(i));
      }
      return Collections.unmodifiableList(localArrayList);
    }
    return null;
  }
  
  public static void a(Context paramContext, String paramString1, ce paramce, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if (paramBoolean) {}
    for (String str1 = "1";; str1 = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str1).replaceAll("@gw_qdata@", paramce.hA.eZ).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", cf.hB).replaceAll("@gw_seqnum@", paramce.gE);
        if (paramce.fm != null) {
          str2 = str2.replaceAll("@gw_adnetid@", paramce.fm.eP).replaceAll("@gw_allocid@", paramce.fm.eR);
        }
        new cl(paramContext, paramString1, str2).start();
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.au
 * JD-Core Version:    0.7.0.1
 */