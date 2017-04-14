package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

public final class GameBuffer
  extends DataBuffer<Game>
{
  public GameBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Game get(int paramInt)
  {
    return new b(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GameBuffer
 * JD-Core Version:    0.7.0.1
 */