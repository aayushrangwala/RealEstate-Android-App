package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.eg;

public final class c
  implements LeaderboardScore
{
  private final long nA;
  private final long nB;
  private final String nC;
  private final Uri nD;
  private final Uri nE;
  private final PlayerEntity nF;
  private final String nG;
  private final long nx;
  private final String ny;
  private final String nz;
  
  public c(LeaderboardScore paramLeaderboardScore)
  {
    this.nx = paramLeaderboardScore.getRank();
    this.ny = ((String)dm.e(paramLeaderboardScore.getDisplayRank()));
    this.nz = ((String)dm.e(paramLeaderboardScore.getDisplayScore()));
    this.nA = paramLeaderboardScore.getRawScore();
    this.nB = paramLeaderboardScore.getTimestampMillis();
    this.nC = paramLeaderboardScore.getScoreHolderDisplayName();
    this.nD = paramLeaderboardScore.getScoreHolderIconImageUri();
    this.nE = paramLeaderboardScore.getScoreHolderHiResImageUri();
    Player localPlayer = paramLeaderboardScore.getScoreHolder();
    if (localPlayer == null) {}
    for (PlayerEntity localPlayerEntity = null;; localPlayerEntity = (PlayerEntity)localPlayer.freeze())
    {
      this.nF = localPlayerEntity;
      this.nG = paramLeaderboardScore.getScoreTag();
      return;
    }
  }
  
  static int a(LeaderboardScore paramLeaderboardScore)
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = Long.valueOf(paramLeaderboardScore.getRank());
    arrayOfObject[1] = paramLeaderboardScore.getDisplayRank();
    arrayOfObject[2] = Long.valueOf(paramLeaderboardScore.getRawScore());
    arrayOfObject[3] = paramLeaderboardScore.getDisplayScore();
    arrayOfObject[4] = Long.valueOf(paramLeaderboardScore.getTimestampMillis());
    arrayOfObject[5] = paramLeaderboardScore.getScoreHolderDisplayName();
    arrayOfObject[6] = paramLeaderboardScore.getScoreHolderIconImageUri();
    arrayOfObject[7] = paramLeaderboardScore.getScoreHolderHiResImageUri();
    arrayOfObject[8] = paramLeaderboardScore.getScoreHolder();
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(LeaderboardScore paramLeaderboardScore, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof LeaderboardScore)) {
      bool = false;
    }
    LeaderboardScore localLeaderboardScore;
    do
    {
      do
      {
        return bool;
      } while (paramLeaderboardScore == paramObject);
      localLeaderboardScore = (LeaderboardScore)paramObject;
    } while ((dl.equal(Long.valueOf(localLeaderboardScore.getRank()), Long.valueOf(paramLeaderboardScore.getRank()))) && (dl.equal(localLeaderboardScore.getDisplayRank(), paramLeaderboardScore.getDisplayRank())) && (dl.equal(Long.valueOf(localLeaderboardScore.getRawScore()), Long.valueOf(paramLeaderboardScore.getRawScore()))) && (dl.equal(localLeaderboardScore.getDisplayScore(), paramLeaderboardScore.getDisplayScore())) && (dl.equal(Long.valueOf(localLeaderboardScore.getTimestampMillis()), Long.valueOf(paramLeaderboardScore.getTimestampMillis()))) && (dl.equal(localLeaderboardScore.getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderDisplayName())) && (dl.equal(localLeaderboardScore.getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderIconImageUri())) && (dl.equal(localLeaderboardScore.getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri())) && (dl.equal(localLeaderboardScore.getScoreHolder(), paramLeaderboardScore.getScoreHolder())) && (dl.equal(localLeaderboardScore.getScoreTag(), paramLeaderboardScore.getScoreTag())));
    return false;
  }
  
  static String b(LeaderboardScore paramLeaderboardScore)
  {
    dl.a locala = dl.d(paramLeaderboardScore).a("Rank", Long.valueOf(paramLeaderboardScore.getRank())).a("DisplayRank", paramLeaderboardScore.getDisplayRank()).a("Score", Long.valueOf(paramLeaderboardScore.getRawScore())).a("DisplayScore", paramLeaderboardScore.getDisplayScore()).a("Timestamp", Long.valueOf(paramLeaderboardScore.getTimestampMillis())).a("DisplayName", paramLeaderboardScore.getScoreHolderDisplayName()).a("IconImageUri", paramLeaderboardScore.getScoreHolderIconImageUri()).a("HiResImageUri", paramLeaderboardScore.getScoreHolderHiResImageUri());
    if (paramLeaderboardScore.getScoreHolder() == null) {}
    for (Object localObject = null;; localObject = paramLeaderboardScore.getScoreHolder()) {
      return locala.a("Player", localObject).a("ScoreTag", paramLeaderboardScore.getScoreTag()).toString();
    }
  }
  
  public LeaderboardScore cd()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public String getDisplayRank()
  {
    return this.ny;
  }
  
  public void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ny, paramCharArrayBuffer);
  }
  
  public String getDisplayScore()
  {
    return this.nz;
  }
  
  public void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.nz, paramCharArrayBuffer);
  }
  
  public long getRank()
  {
    return this.nx;
  }
  
  public long getRawScore()
  {
    return this.nA;
  }
  
  public Player getScoreHolder()
  {
    return this.nF;
  }
  
  public String getScoreHolderDisplayName()
  {
    if (this.nF == null) {
      return this.nC;
    }
    return this.nF.getDisplayName();
  }
  
  public void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (this.nF == null)
    {
      eg.b(this.nC, paramCharArrayBuffer);
      return;
    }
    this.nF.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getScoreHolderHiResImageUri()
  {
    if (this.nF == null) {
      return this.nE;
    }
    return this.nF.getHiResImageUri();
  }
  
  public Uri getScoreHolderIconImageUri()
  {
    if (this.nF == null) {
      return this.nD;
    }
    return this.nF.getIconImageUri();
  }
  
  public String getScoreTag()
  {
    return this.nG;
  }
  
  public long getTimestampMillis()
  {
    return this.nB;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return b(this);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.c
 * JD-Core Version:    0.7.0.1
 */