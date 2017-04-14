package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

public final class LeaderboardBuffer
  extends f<Leaderboard>
{
  public LeaderboardBuffer(d paramd)
  {
    super(paramd);
  }
  
  protected Leaderboard getEntry(int paramInt1, int paramInt2)
  {
    return new a(this.jf, paramInt1, paramInt2);
  }
  
  protected String getPrimaryDataMarkerColumn()
  {
    return "external_leaderboard_id";
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardBuffer
 * JD-Core Version:    0.7.0.1
 */