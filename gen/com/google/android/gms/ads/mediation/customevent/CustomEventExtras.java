package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
  implements NetworkExtras
{
  private final HashMap<String, Object> in = new HashMap();
  
  public Object getExtra(String paramString)
  {
    return this.in.get(paramString);
  }
  
  public void setExtra(String paramString, Object paramObject)
  {
    this.in.put(paramString, paramObject);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventExtras
 * JD-Core Version:    0.7.0.1
 */