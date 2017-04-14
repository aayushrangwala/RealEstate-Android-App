package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class GameEntity
  extends en
  implements Game
{
  public static final Parcelable.Creator<GameEntity> CREATOR = new a();
  private final int iM;
  private final String mk;
  private final String ml;
  private final String mm;
  private final String mn;
  private final String mo;
  private final String mp;
  private final Uri mq;
  private final Uri mr;
  private final Uri ms;
  private final boolean mt;
  private final boolean mu;
  private final String mv;
  private final int mw;
  private final int mx;
  private final int my;
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4)
  {
    this.iM = paramInt1;
    this.mk = paramString1;
    this.ml = paramString2;
    this.mm = paramString3;
    this.mn = paramString4;
    this.mo = paramString5;
    this.mp = paramString6;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.ms = paramUri3;
    this.mt = paramBoolean1;
    this.mu = paramBoolean2;
    this.mv = paramString7;
    this.mw = paramInt2;
    this.mx = paramInt3;
    this.my = paramInt4;
  }
  
  public GameEntity(Game paramGame)
  {
    this.iM = 1;
    this.mk = paramGame.getApplicationId();
    this.mm = paramGame.getPrimaryCategory();
    this.mn = paramGame.getSecondaryCategory();
    this.mo = paramGame.getDescription();
    this.mp = paramGame.getDeveloperName();
    this.ml = paramGame.getDisplayName();
    this.mq = paramGame.getIconImageUri();
    this.mr = paramGame.getHiResImageUri();
    this.ms = paramGame.getFeaturedImageUri();
    this.mt = paramGame.isPlayEnabledGame();
    this.mu = paramGame.isInstanceInstalled();
    this.mv = paramGame.getInstancePackageName();
    this.mw = paramGame.getGameplayAclStatus();
    this.mx = paramGame.getAchievementTotalCount();
    this.my = paramGame.getLeaderboardCount();
  }
  
  static int a(Game paramGame)
  {
    Object[] arrayOfObject = new Object[15];
    arrayOfObject[0] = paramGame.getApplicationId();
    arrayOfObject[1] = paramGame.getDisplayName();
    arrayOfObject[2] = paramGame.getPrimaryCategory();
    arrayOfObject[3] = paramGame.getSecondaryCategory();
    arrayOfObject[4] = paramGame.getDescription();
    arrayOfObject[5] = paramGame.getDeveloperName();
    arrayOfObject[6] = paramGame.getIconImageUri();
    arrayOfObject[7] = paramGame.getHiResImageUri();
    arrayOfObject[8] = paramGame.getFeaturedImageUri();
    arrayOfObject[9] = Boolean.valueOf(paramGame.isPlayEnabledGame());
    arrayOfObject[10] = Boolean.valueOf(paramGame.isInstanceInstalled());
    arrayOfObject[11] = paramGame.getInstancePackageName();
    arrayOfObject[12] = Integer.valueOf(paramGame.getGameplayAclStatus());
    arrayOfObject[13] = Integer.valueOf(paramGame.getAchievementTotalCount());
    arrayOfObject[14] = Integer.valueOf(paramGame.getLeaderboardCount());
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(Game paramGame, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Game)) {
      bool = false;
    }
    Game localGame;
    do
    {
      do
      {
        return bool;
      } while (paramGame == paramObject);
      localGame = (Game)paramObject;
    } while ((dl.equal(localGame.getApplicationId(), paramGame.getApplicationId())) && (dl.equal(localGame.getDisplayName(), paramGame.getDisplayName())) && (dl.equal(localGame.getPrimaryCategory(), paramGame.getPrimaryCategory())) && (dl.equal(localGame.getSecondaryCategory(), paramGame.getSecondaryCategory())) && (dl.equal(localGame.getDescription(), paramGame.getDescription())) && (dl.equal(localGame.getDeveloperName(), paramGame.getDeveloperName())) && (dl.equal(localGame.getIconImageUri(), paramGame.getIconImageUri())) && (dl.equal(localGame.getHiResImageUri(), paramGame.getHiResImageUri())) && (dl.equal(localGame.getFeaturedImageUri(), paramGame.getFeaturedImageUri())) && (dl.equal(Boolean.valueOf(localGame.isPlayEnabledGame()), Boolean.valueOf(paramGame.isPlayEnabledGame()))) && (dl.equal(Boolean.valueOf(localGame.isInstanceInstalled()), Boolean.valueOf(paramGame.isInstanceInstalled()))) && (dl.equal(localGame.getInstancePackageName(), paramGame.getInstancePackageName())) && (dl.equal(Integer.valueOf(localGame.getGameplayAclStatus()), Integer.valueOf(paramGame.getGameplayAclStatus()))) && (dl.equal(Integer.valueOf(localGame.getAchievementTotalCount()), Integer.valueOf(paramGame.getAchievementTotalCount()))) && (dl.equal(Integer.valueOf(localGame.getLeaderboardCount()), Integer.valueOf(paramGame.getLeaderboardCount()))));
    return false;
  }
  
  static String b(Game paramGame)
  {
    return dl.d(paramGame).a("ApplicationId", paramGame.getApplicationId()).a("DisplayName", paramGame.getDisplayName()).a("PrimaryCategory", paramGame.getPrimaryCategory()).a("SecondaryCategory", paramGame.getSecondaryCategory()).a("Description", paramGame.getDescription()).a("DeveloperName", paramGame.getDeveloperName()).a("IconImageUri", paramGame.getIconImageUri()).a("HiResImageUri", paramGame.getHiResImageUri()).a("FeaturedImageUri", paramGame.getFeaturedImageUri()).a("PlayEnabledGame", Boolean.valueOf(paramGame.isPlayEnabledGame())).a("InstanceInstalled", Boolean.valueOf(paramGame.isInstanceInstalled())).a("InstancePackageName", paramGame.getInstancePackageName()).a("GameplayAclStatus", Integer.valueOf(paramGame.getGameplayAclStatus())).a("AchievementTotalCount", Integer.valueOf(paramGame.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(paramGame.getLeaderboardCount())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Game freeze()
  {
    return this;
  }
  
  public int getAchievementTotalCount()
  {
    return this.mx;
  }
  
  public String getApplicationId()
  {
    return this.mk;
  }
  
  public String getDescription()
  {
    return this.mo;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.mo, paramCharArrayBuffer);
  }
  
  public String getDeveloperName()
  {
    return this.mp;
  }
  
  public void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.mp, paramCharArrayBuffer);
  }
  
  public String getDisplayName()
  {
    return this.ml;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ml, paramCharArrayBuffer);
  }
  
  public Uri getFeaturedImageUri()
  {
    return this.ms;
  }
  
  public int getGameplayAclStatus()
  {
    return this.mw;
  }
  
  public Uri getHiResImageUri()
  {
    return this.mr;
  }
  
  public Uri getIconImageUri()
  {
    return this.mq;
  }
  
  public String getInstancePackageName()
  {
    return this.mv;
  }
  
  public int getLeaderboardCount()
  {
    return this.my;
  }
  
  public String getPrimaryCategory()
  {
    return this.mm;
  }
  
  public String getSecondaryCategory()
  {
    return this.mn;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isInstanceInstalled()
  {
    return this.mu;
  }
  
  public boolean isPlayEnabledGame()
  {
    return this.mt;
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    if (!aX())
    {
      a.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.mk);
    paramParcel.writeString(this.ml);
    paramParcel.writeString(this.mm);
    paramParcel.writeString(this.mn);
    paramParcel.writeString(this.mo);
    paramParcel.writeString(this.mp);
    String str1;
    String str2;
    label90:
    String str3;
    label110:
    int j;
    if (this.mq == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      if (this.mr != null) {
        break label189;
      }
      str2 = null;
      paramParcel.writeString(str2);
      Uri localUri = this.ms;
      str3 = null;
      if (localUri != null) {
        break label201;
      }
      paramParcel.writeString(str3);
      if (!this.mt) {
        break label213;
      }
      j = i;
      label126:
      paramParcel.writeInt(j);
      if (!this.mu) {
        break label219;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      paramParcel.writeString(this.mv);
      paramParcel.writeInt(this.mw);
      paramParcel.writeInt(this.mx);
      paramParcel.writeInt(this.my);
      return;
      str1 = this.mq.toString();
      break;
      label189:
      str2 = this.mr.toString();
      break label90;
      label201:
      str3 = this.ms.toString();
      break label110;
      label213:
      j = 0;
      break label126;
      label219:
      i = 0;
    }
  }
  
  static final class a
    extends a
  {
    public GameEntity t(Parcel paramParcel)
    {
      if ((GameEntity.b(GameEntity.bQ())) || (GameEntity.J(GameEntity.class.getCanonicalName()))) {
        return super.t(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str3 = paramParcel.readString();
      String str4 = paramParcel.readString();
      String str5 = paramParcel.readString();
      String str6 = paramParcel.readString();
      String str7 = paramParcel.readString();
      Uri localUri1;
      String str8;
      Uri localUri2;
      label88:
      String str9;
      Uri localUri3;
      label102:
      boolean bool1;
      if (str7 == null)
      {
        localUri1 = null;
        str8 = paramParcel.readString();
        if (str8 != null) {
          break label177;
        }
        localUri2 = null;
        str9 = paramParcel.readString();
        if (str9 != null) {
          break label187;
        }
        localUri3 = null;
        if (paramParcel.readInt() <= 0) {
          break label197;
        }
        bool1 = true;
        label112:
        if (paramParcel.readInt() <= 0) {
          break label203;
        }
      }
      label177:
      label187:
      label197:
      label203:
      for (boolean bool2 = true;; bool2 = false)
      {
        return new GameEntity(1, str1, str2, str3, str4, str5, str6, localUri1, localUri2, localUri3, bool1, bool2, paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt());
        localUri1 = Uri.parse(str7);
        break;
        localUri2 = Uri.parse(str8);
        break label88;
        localUri3 = Uri.parse(str9);
        break label102;
        bool1 = false;
        break label112;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GameEntity
 * JD-Core Version:    0.7.0.1
 */