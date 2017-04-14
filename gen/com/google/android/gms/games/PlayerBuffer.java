package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;

public final class PlayerBuffer
  extends DataBuffer<Player>
{
  public PlayerBuffer(com.google.android.gms.common.data.d paramd)
  {
    super(paramd);
  }
  
  public Player get(int paramInt)
  {
    return new d(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.PlayerBuffer
 * JD-Core Version:    0.7.0.1
 */