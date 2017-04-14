package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;

public final class LeaderboardScoreBuffer
  extends DataBuffer<LeaderboardScore>
{
  private final b nv;
  
  public LeaderboardScoreBuffer(com.google.android.gms.common.data.d paramd)
  {
    super(paramd);
    this.nv = new b(paramd.aM());
  }
  
  public b cb()
  {
    return this.nv;
  }
  
  public LeaderboardScore get(int paramInt)
  {
    return new d(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
 * JD-Core Version:    0.7.0.1
 */