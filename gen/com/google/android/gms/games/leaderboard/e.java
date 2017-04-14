package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eu;
import com.google.android.gms.internal.ev;

public final class e
  extends b
  implements LeaderboardVariant
{
  e(d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public String ce()
  {
    return getString("top_page_token_next");
  }
  
  public String cf()
  {
    return getString("window_page_token_prev");
  }
  
  public String cg()
  {
    return getString("window_page_token_next");
  }
  
  public int getCollection()
  {
    return getInteger("collection");
  }
  
  public String getDisplayPlayerRank()
  {
    return getString("player_display_rank");
  }
  
  public String getDisplayPlayerScore()
  {
    return getString("player_display_score");
  }
  
  public long getNumScores()
  {
    if (v("total_scores")) {
      return -1L;
    }
    return getLong("total_scores");
  }
  
  public long getPlayerRank()
  {
    if (v("player_rank")) {
      return -1L;
    }
    return getLong("player_rank");
  }
  
  public String getPlayerScoreTag()
  {
    return getString("player_score_tag");
  }
  
  public long getRawPlayerScore()
  {
    if (v("player_raw_score")) {
      return -1L;
    }
    return getLong("player_raw_score");
  }
  
  public int getTimeSpan()
  {
    return getInteger("timespan");
  }
  
  public boolean hasPlayerInfo()
  {
    return !v("player_raw_score");
  }
  
  public String toString()
  {
    dl.a locala1 = dl.d(this).a("TimeSpan", ev.R(getTimeSpan())).a("Collection", eu.R(getCollection()));
    Object localObject1;
    String str1;
    label65:
    Object localObject2;
    label91:
    dl.a locala4;
    if (hasPlayerInfo())
    {
      localObject1 = Long.valueOf(getRawPlayerScore());
      dl.a locala2 = locala1.a("RawPlayerScore", localObject1);
      if (!hasPlayerInfo()) {
        break label173;
      }
      str1 = getDisplayPlayerScore();
      dl.a locala3 = locala2.a("DisplayPlayerScore", str1);
      if (!hasPlayerInfo()) {
        break label180;
      }
      localObject2 = Long.valueOf(getPlayerRank());
      locala4 = locala3.a("PlayerRank", localObject2);
      if (!hasPlayerInfo()) {
        break label187;
      }
    }
    label173:
    label180:
    label187:
    for (String str2 = getDisplayPlayerRank();; str2 = "none")
    {
      return locala4.a("DisplayPlayerRank", str2).a("NumScores", Long.valueOf(getNumScores())).a("TopPageNextToken", ce()).a("WindowPageNextToken", cg()).a("WindowPagePrevToken", cf()).toString();
      localObject1 = "none";
      break;
      str1 = "none";
      break label65;
      localObject2 = "none";
      break label91;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.e
 * JD-Core Version:    0.7.0.1
 */