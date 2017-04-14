package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ev;
import java.util.HashMap;

public final class SubmitScoreResult
{
  private static final String[] nI = { "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag" };
  private int iC;
  private String mD;
  private String nJ;
  private HashMap<Integer, Result> nK;
  
  public SubmitScoreResult(int paramInt, String paramString1, String paramString2)
  {
    this(paramInt, paramString1, paramString2, new HashMap());
  }
  
  public SubmitScoreResult(int paramInt, String paramString1, String paramString2, HashMap<Integer, Result> paramHashMap)
  {
    this.iC = paramInt;
    this.nJ = paramString1;
    this.mD = paramString2;
    this.nK = paramHashMap;
  }
  
  public SubmitScoreResult(d paramd)
  {
    this.iC = paramd.getStatusCode();
    this.nK = new HashMap();
    int i = paramd.getCount();
    if (i == 3) {}
    for (boolean bool = true;; bool = false)
    {
      dm.m(bool);
      for (int j = 0; j < i; j++)
      {
        int k = paramd.q(j);
        if (j == 0)
        {
          this.nJ = paramd.c("leaderboardId", j, k);
          this.mD = paramd.c("playerId", j, k);
        }
        if (paramd.d("hasResult", j, k)) {
          a(new Result(paramd.a("rawScore", j, k), paramd.c("formattedScore", j, k), paramd.c("scoreTag", j, k), paramd.d("newBest", j, k)), paramd.b("timeSpan", j, k));
        }
      }
    }
  }
  
  private void a(Result paramResult, int paramInt)
  {
    this.nK.put(Integer.valueOf(paramInt), paramResult);
  }
  
  public String getLeaderboardId()
  {
    return this.nJ;
  }
  
  public String getPlayerId()
  {
    return this.mD;
  }
  
  public Result getScoreResult(int paramInt)
  {
    return (Result)this.nK.get(Integer.valueOf(paramInt));
  }
  
  public int getStatusCode()
  {
    return this.iC;
  }
  
  public String toString()
  {
    dl.a locala = dl.d(this).a("PlayerId", this.mD).a("StatusCode", Integer.valueOf(this.iC));
    int i = 0;
    if (i < 3)
    {
      Result localResult = (Result)this.nK.get(Integer.valueOf(i));
      locala.a("TimesSpan", ev.R(i));
      if (localResult == null) {}
      for (String str = "null";; str = localResult.toString())
      {
        locala.a("Result", str);
        i++;
        break;
      }
    }
    return locala.toString();
  }
  
  public static final class Result
  {
    public final String formattedScore;
    public final boolean newBest;
    public final long rawScore;
    public final String scoreTag;
    
    public Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
    {
      this.rawScore = paramLong;
      this.formattedScore = paramString1;
      this.scoreTag = paramString2;
      this.newBest = paramBoolean;
    }
    
    public String toString()
    {
      return dl.d(this).a("RawScore", Long.valueOf(this.rawScore)).a("FormattedScore", this.formattedScore).a("ScoreTag", this.scoreTag).a("NewBest", Boolean.valueOf(this.newBest)).toString();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.SubmitScoreResult
 * JD-Core Version:    0.7.0.1
 */