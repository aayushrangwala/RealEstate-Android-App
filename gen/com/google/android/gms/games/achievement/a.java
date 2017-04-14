package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;

public final class a
  extends b
  implements Achievement
{
  a(com.google.android.gms.common.data.d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public String getAchievementId()
  {
    return getString("external_achievement_id");
  }
  
  public int getCurrentSteps()
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      return getInteger("current_steps");
      int j = 0;
    }
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    a("description", paramCharArrayBuffer);
  }
  
  public String getFormattedCurrentSteps()
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      return getString("formatted_current_steps");
      int j = 0;
    }
  }
  
  public void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      a("formatted_current_steps", paramCharArrayBuffer);
      return;
      int j = 0;
    }
  }
  
  public String getFormattedTotalSteps()
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      return getString("formatted_total_steps");
      int j = 0;
    }
  }
  
  public void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      a("formatted_total_steps", paramCharArrayBuffer);
      return;
      int j = 0;
    }
  }
  
  public long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public String getName()
  {
    return getString("name");
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    a("name", paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    return new com.google.android.gms.games.d(this.jf, this.ji);
  }
  
  public Uri getRevealedImageUri()
  {
    return u("revealed_icon_image_uri");
  }
  
  public int getState()
  {
    return getInteger("state");
  }
  
  public int getTotalSteps()
  {
    int i = 1;
    if (getType() == i) {}
    for (;;)
    {
      db.k(i);
      return getInteger("total_steps");
      int j = 0;
    }
  }
  
  public int getType()
  {
    return getInteger("type");
  }
  
  public Uri getUnlockedImageUri()
  {
    return u("unlocked_icon_image_uri");
  }
  
  public String toString()
  {
    dl.a locala = dl.d(this).a("id", getAchievementId()).a("name", getName()).a("state", Integer.valueOf(getState())).a("type", Integer.valueOf(getType()));
    if (getType() == 1) {
      locala.a("steps", getCurrentSteps() + "/" + getTotalSteps());
    }
    return locala.toString();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.achievement.a
 * JD-Core Version:    0.7.0.1
 */