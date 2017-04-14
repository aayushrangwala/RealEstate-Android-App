package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

public final class d
  extends b
  implements LeaderboardScore
{
  private final com.google.android.gms.games.d nH;
  
  d(com.google.android.gms.common.data.d paramd, int paramInt)
  {
    super(paramd, paramInt);
    this.nH = new com.google.android.gms.games.d(paramd, paramInt);
  }
  
  public LeaderboardScore cd()
  {
    return new c(this);
  }
  
  public boolean equals(Object paramObject)
  {
    return c.a(this, paramObject);
  }
  
  public String getDisplayRank()
  {
    return getString("display_rank");
  }
  
  public void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    a("display_rank", paramCharArrayBuffer);
  }
  
  public String getDisplayScore()
  {
    return getString("display_score");
  }
  
  public void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    a("display_score", paramCharArrayBuffer);
  }
  
  public long getRank()
  {
    return getLong("rank");
  }
  
  public long getRawScore()
  {
    return getLong("raw_score");
  }
  
  public Player getScoreHolder()
  {
    if (v("external_player_id")) {
      return null;
    }
    return this.nH;
  }
  
  public String getScoreHolderDisplayName()
  {
    if (v("external_player_id")) {
      return getString("default_display_name");
    }
    return this.nH.getDisplayName();
  }
  
  public void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (v("external_player_id"))
    {
      a("default_display_name", paramCharArrayBuffer);
      return;
    }
    this.nH.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getScoreHolderHiResImageUri()
  {
    if (v("external_player_id")) {
      return null;
    }
    return this.nH.getHiResImageUri();
  }
  
  public Uri getScoreHolderIconImageUri()
  {
    if (v("external_player_id")) {
      return u("default_display_image_uri");
    }
    return this.nH.getIconImageUri();
  }
  
  public String getScoreTag()
  {
    return getString("score_tag");
  }
  
  public long getTimestampMillis()
  {
    return getLong("achieved_timestamp");
  }
  
  public int hashCode()
  {
    return c.a(this);
  }
  
  public String toString()
  {
    return c.b(this);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.d
 * JD-Core Version:    0.7.0.1
 */