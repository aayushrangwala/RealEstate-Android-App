package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

public final class ParticipantEntity
  extends en
  implements Participant
{
  public static final Parcelable.Creator<ParticipantEntity> CREATOR = new a();
  private final int iM;
  private final String ml;
  private final Uri mq;
  private final Uri mr;
  private final int nU;
  private final String nV;
  private final boolean nW;
  private final PlayerEntity nX;
  private final int nY;
  private final String nd;
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3)
  {
    this.iM = paramInt1;
    this.nd = paramString1;
    this.ml = paramString2;
    this.mq = paramUri1;
    this.mr = paramUri2;
    this.nU = paramInt2;
    this.nV = paramString3;
    this.nW = paramBoolean;
    this.nX = paramPlayerEntity;
    this.nY = paramInt3;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    this.iM = 1;
    this.nd = paramParticipant.getParticipantId();
    this.ml = paramParticipant.getDisplayName();
    this.mq = paramParticipant.getIconImageUri();
    this.mr = paramParticipant.getHiResImageUri();
    this.nU = paramParticipant.getStatus();
    this.nV = paramParticipant.ci();
    this.nW = paramParticipant.isConnectedToRoom();
    Player localPlayer = paramParticipant.getPlayer();
    if (localPlayer == null) {}
    for (PlayerEntity localPlayerEntity = null;; localPlayerEntity = new PlayerEntity(localPlayer))
    {
      this.nX = localPlayerEntity;
      this.nY = paramParticipant.getCapabilities();
      return;
    }
  }
  
  static int a(Participant paramParticipant)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramParticipant.getPlayer();
    arrayOfObject[1] = Integer.valueOf(paramParticipant.getStatus());
    arrayOfObject[2] = paramParticipant.ci();
    arrayOfObject[3] = Boolean.valueOf(paramParticipant.isConnectedToRoom());
    arrayOfObject[4] = paramParticipant.getDisplayName();
    arrayOfObject[5] = paramParticipant.getIconImageUri();
    arrayOfObject[6] = paramParticipant.getHiResImageUri();
    arrayOfObject[7] = Integer.valueOf(paramParticipant.getCapabilities());
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(Participant paramParticipant, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Participant)) {
      bool = false;
    }
    Participant localParticipant;
    do
    {
      do
      {
        return bool;
      } while (paramParticipant == paramObject);
      localParticipant = (Participant)paramObject;
    } while ((dl.equal(localParticipant.getPlayer(), paramParticipant.getPlayer())) && (dl.equal(Integer.valueOf(localParticipant.getStatus()), Integer.valueOf(paramParticipant.getStatus()))) && (dl.equal(localParticipant.ci(), paramParticipant.ci())) && (dl.equal(Boolean.valueOf(localParticipant.isConnectedToRoom()), Boolean.valueOf(paramParticipant.isConnectedToRoom()))) && (dl.equal(localParticipant.getDisplayName(), paramParticipant.getDisplayName())) && (dl.equal(localParticipant.getIconImageUri(), paramParticipant.getIconImageUri())) && (dl.equal(localParticipant.getHiResImageUri(), paramParticipant.getHiResImageUri())) && (dl.equal(Integer.valueOf(localParticipant.getCapabilities()), Integer.valueOf(paramParticipant.getCapabilities()))));
    return false;
  }
  
  static String b(Participant paramParticipant)
  {
    return dl.d(paramParticipant).a("Player", paramParticipant.getPlayer()).a("Status", Integer.valueOf(paramParticipant.getStatus())).a("ClientAddress", paramParticipant.ci()).a("ConnectedToRoom", Boolean.valueOf(paramParticipant.isConnectedToRoom())).a("DisplayName", paramParticipant.getDisplayName()).a("IconImage", paramParticipant.getIconImageUri()).a("HiResImage", paramParticipant.getHiResImageUri()).a("Capabilities", Integer.valueOf(paramParticipant.getCapabilities())).toString();
  }
  
  public String ci()
  {
    return this.nV;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Participant freeze()
  {
    return this;
  }
  
  public int getCapabilities()
  {
    return this.nY;
  }
  
  public String getDisplayName()
  {
    if (this.nX == null) {
      return this.ml;
    }
    return this.nX.getDisplayName();
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (this.nX == null)
    {
      eg.b(this.ml, paramCharArrayBuffer);
      return;
    }
    this.nX.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    if (this.nX == null) {
      return this.mr;
    }
    return this.nX.getHiResImageUri();
  }
  
  public Uri getIconImageUri()
  {
    if (this.nX == null) {
      return this.mq;
    }
    return this.nX.getIconImageUri();
  }
  
  public String getParticipantId()
  {
    return this.nd;
  }
  
  public Player getPlayer()
  {
    return this.nX;
  }
  
  public int getStatus()
  {
    return this.nU;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isConnectedToRoom()
  {
    return this.nW;
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
    paramParcel.writeString(this.nd);
    paramParcel.writeString(this.ml);
    String str1;
    label39:
    String str2;
    label58:
    int i;
    label90:
    int j;
    if (this.mq == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.mr;
      str2 = null;
      if (localUri != null) {
        break label144;
      }
      paramParcel.writeString(str2);
      paramParcel.writeInt(this.nU);
      paramParcel.writeString(this.nV);
      if (!this.nW) {
        break label156;
      }
      i = 1;
      paramParcel.writeInt(i);
      PlayerEntity localPlayerEntity = this.nX;
      j = 0;
      if (localPlayerEntity != null) {
        break label162;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(j);
      if (this.nX == null) {
        break;
      }
      this.nX.writeToParcel(paramParcel, paramInt);
      return;
      str1 = this.mq.toString();
      break label39;
      label144:
      str2 = this.mr.toString();
      break label58;
      label156:
      i = 0;
      break label90;
      label162:
      j = 1;
    }
  }
  
  static final class a
    extends c
  {
    public ParticipantEntity w(Parcel paramParcel)
    {
      if ((ParticipantEntity.b(ParticipantEntity.bQ())) || (ParticipantEntity.J(ParticipantEntity.class.getCanonicalName()))) {
        return super.w(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str3 = paramParcel.readString();
      Uri localUri1;
      String str4;
      Uri localUri2;
      label64:
      int i;
      String str5;
      boolean bool;
      if (str3 == null)
      {
        localUri1 = null;
        str4 = paramParcel.readString();
        if (str4 != null) {
          break label157;
        }
        localUri2 = null;
        i = paramParcel.readInt();
        str5 = paramParcel.readString();
        if (paramParcel.readInt() <= 0) {
          break label167;
        }
        bool = true;
        label86:
        int j = paramParcel.readInt();
        int k = 0;
        if (j > 0) {
          k = 1;
        }
        if (k == 0) {
          break label173;
        }
      }
      label157:
      label167:
      label173:
      for (PlayerEntity localPlayerEntity = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(paramParcel);; localPlayerEntity = null)
      {
        return new ParticipantEntity(1, str1, str2, localUri1, localUri2, i, str5, bool, localPlayerEntity, 7);
        localUri1 = Uri.parse(str3);
        break;
        localUri2 = Uri.parse(str4);
        break label64;
        bool = false;
        break label86;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantEntity
 * JD-Core Version:    0.7.0.1
 */