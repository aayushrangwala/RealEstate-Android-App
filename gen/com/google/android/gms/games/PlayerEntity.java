package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class PlayerEntity
  extends en
  implements Player
{
  public static final Parcelable.Creator<PlayerEntity> CREATOR = new a();
  private final int iM;
  private final String mD;
  private final long mE;
  private final String ml;
  private final Uri mq;
  private final Uri mr;
  
  PlayerEntity(int paramInt, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong)
  {
    this.iM = paramInt;
    this.mD = paramString1;
    this.ml = paramString2;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.mE = paramLong;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this.iM = i;
    this.mD = paramPlayer.getPlayerId();
    this.ml = paramPlayer.getDisplayName();
    this.mq = paramPlayer.getIconImageUri();
    this.mr = paramPlayer.getHiResImageUri();
    this.mE = paramPlayer.getRetrievedTimestamp();
    db.c(this.mD);
    db.c(this.ml);
    if (this.mE > 0L) {}
    for (;;)
    {
      db.k(i);
      return;
      i = 0;
    }
  }
  
  static int a(Player paramPlayer)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramPlayer.getPlayerId();
    arrayOfObject[1] = paramPlayer.getDisplayName();
    arrayOfObject[2] = paramPlayer.getIconImageUri();
    arrayOfObject[3] = paramPlayer.getHiResImageUri();
    arrayOfObject[4] = Long.valueOf(paramPlayer.getRetrievedTimestamp());
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(Player paramPlayer, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Player)) {
      bool = false;
    }
    Player localPlayer;
    do
    {
      do
      {
        return bool;
      } while (paramPlayer == paramObject);
      localPlayer = (Player)paramObject;
    } while ((dl.equal(localPlayer.getPlayerId(), paramPlayer.getPlayerId())) && (dl.equal(localPlayer.getDisplayName(), paramPlayer.getDisplayName())) && (dl.equal(localPlayer.getIconImageUri(), paramPlayer.getIconImageUri())) && (dl.equal(localPlayer.getHiResImageUri(), paramPlayer.getHiResImageUri())) && (dl.equal(Long.valueOf(localPlayer.getRetrievedTimestamp()), Long.valueOf(paramPlayer.getRetrievedTimestamp()))));
    return false;
  }
  
  static String b(Player paramPlayer)
  {
    return dl.d(paramPlayer).a("PlayerId", paramPlayer.getPlayerId()).a("DisplayName", paramPlayer.getDisplayName()).a("IconImageUri", paramPlayer.getIconImageUri()).a("HiResImageUri", paramPlayer.getHiResImageUri()).a("RetrievedTimestamp", Long.valueOf(paramPlayer.getRetrievedTimestamp())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Player freeze()
  {
    return this;
  }
  
  public String getDisplayName()
  {
    return this.ml;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.ml, paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    return this.mr;
  }
  
  public Uri getIconImageUri()
  {
    return this.mq;
  }
  
  public String getPlayerId()
  {
    return this.mD;
  }
  
  public long getRetrievedTimestamp()
  {
    return this.mE;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean hasHiResImage()
  {
    return getHiResImageUri() != null;
  }
  
  public boolean hasIconImage()
  {
    return getIconImageUri() != null;
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
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!aX())
    {
      c.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.mD);
    paramParcel.writeString(this.ml);
    String str1;
    String str2;
    if (this.mq == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.mr;
      str2 = null;
      if (localUri != null) {
        break label84;
      }
    }
    for (;;)
    {
      paramParcel.writeString(str2);
      paramParcel.writeLong(this.mE);
      return;
      str1 = this.mq.toString();
      break;
      label84:
      str2 = this.mr.toString();
    }
  }
  
  static final class a
    extends c
  {
    public PlayerEntity u(Parcel paramParcel)
    {
      if ((PlayerEntity.b(PlayerEntity.bQ())) || (PlayerEntity.J(PlayerEntity.class.getCanonicalName()))) {
        return super.u(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str3 = paramParcel.readString();
      String str4 = paramParcel.readString();
      Uri localUri1;
      Uri localUri2;
      if (str3 == null)
      {
        localUri1 = null;
        localUri2 = null;
        if (str4 != null) {
          break label93;
        }
      }
      for (;;)
      {
        return new PlayerEntity(1, str1, str2, localUri1, localUri2, paramParcel.readLong());
        localUri1 = Uri.parse(str3);
        break;
        label93:
        localUri2 = Uri.parse(str4);
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.PlayerEntity
 * JD-Core Version:    0.7.0.1
 */