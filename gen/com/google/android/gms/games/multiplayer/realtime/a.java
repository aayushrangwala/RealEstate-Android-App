package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

public final class a
  extends f<Room>
{
  public a(d paramd)
  {
    super(paramd);
  }
  
  protected Room b(int paramInt1, int paramInt2)
  {
    return new c(this.jf, paramInt1, paramInt2);
  }
  
  protected String getPrimaryDataMarkerColumn()
  {
    return "external_match_id";
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.a
 * JD-Core Version:    0.7.0.1
 */