package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

public final class AchievementBuffer
  extends DataBuffer<Achievement>
{
  public AchievementBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Achievement get(int paramInt)
  {
    return new a(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.achievement.AchievementBuffer
 * JD-Core Version:    0.7.0.1
 */