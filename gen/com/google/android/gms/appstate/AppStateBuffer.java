package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

public final class AppStateBuffer
  extends DataBuffer<AppState>
{
  public AppStateBuffer(d paramd)
  {
    super(paramd);
  }
  
  public AppState get(int paramInt)
  {
    return new b(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateBuffer
 * JD-Core Version:    0.7.0.1
 */