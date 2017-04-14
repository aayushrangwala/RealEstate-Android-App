package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;
import java.util.ArrayList;

public final class RoomEntity
  extends en
  implements Room
{
  public static final Parcelable.Creator<RoomEntity> CREATOR = new a();
  private final int iM;
  private final String mo;
  private final long nN;
  private final ArrayList<ParticipantEntity> nQ;
  private final int nR;
  private final String nb;
  private final Bundle oh;
  private final String ol;
  private final int om;
  private final int on;
  
  RoomEntity(int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, String paramString3, int paramInt3, Bundle paramBundle, ArrayList<ParticipantEntity> paramArrayList, int paramInt4)
  {
    this.iM = paramInt1;
    this.nb = paramString1;
    this.ol = paramString2;
    this.nN = paramLong;
    this.om = paramInt2;
    this.mo = paramString3;
    this.nR = paramInt3;
    this.oh = paramBundle;
    this.nQ = paramArrayList;
    this.on = paramInt4;
  }
  
  public RoomEntity(Room paramRoom)
  {
    this.iM = 2;
    this.nb = paramRoom.getRoomId();
    this.ol = paramRoom.getCreatorId();
    this.nN = paramRoom.getCreationTimestamp();
    this.om = paramRoom.getStatus();
    this.mo = paramRoom.getDescription();
    this.nR = paramRoom.getVariant();
    this.oh = paramRoom.getAutoMatchCriteria();
    ArrayList localArrayList = paramRoom.getParticipants();
    int i = localArrayList.size();
    this.nQ = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      this.nQ.add((ParticipantEntity)((Participant)localArrayList.get(j)).freeze());
    }
    this.on = paramRoom.getAutoMatchWaitEstimateSeconds();
  }
  
  static int a(Room paramRoom)
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = paramRoom.getRoomId();
    arrayOfObject[1] = paramRoom.getCreatorId();
    arrayOfObject[2] = Long.valueOf(paramRoom.getCreationTimestamp());
    arrayOfObject[3] = Integer.valueOf(paramRoom.getStatus());
    arrayOfObject[4] = paramRoom.getDescription();
    arrayOfObject[5] = Integer.valueOf(paramRoom.getVariant());
    arrayOfObject[6] = paramRoom.getAutoMatchCriteria();
    arrayOfObject[7] = paramRoom.getParticipants();
    arrayOfObject[8] = Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds());
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(Room paramRoom, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Room)) {
      bool = false;
    }
    Room localRoom;
    do
    {
      do
      {
        return bool;
      } while (paramRoom == paramObject);
      localRoom = (Room)paramObject;
    } while ((dl.equal(localRoom.getRoomId(), paramRoom.getRoomId())) && (dl.equal(localRoom.getCreatorId(), paramRoom.getCreatorId())) && (dl.equal(Long.valueOf(localRoom.getCreationTimestamp()), Long.valueOf(paramRoom.getCreationTimestamp()))) && (dl.equal(Integer.valueOf(localRoom.getStatus()), Integer.valueOf(paramRoom.getStatus()))) && (dl.equal(localRoom.getDescription(), paramRoom.getDescription())) && (dl.equal(Integer.valueOf(localRoom.getVariant()), Integer.valueOf(paramRoom.getVariant()))) && (dl.equal(localRoom.getAutoMatchCriteria(), paramRoom.getAutoMatchCriteria())) && (dl.equal(localRoom.getParticipants(), paramRoom.getParticipants())) && (dl.equal(Integer.valueOf(localRoom.getAutoMatchWaitEstimateSeconds()), Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds()))));
    return false;
  }
  
  static String b(Room paramRoom)
  {
    return dl.d(paramRoom).a("RoomId", paramRoom.getRoomId()).a("CreatorId", paramRoom.getCreatorId()).a("CreationTimestamp", Long.valueOf(paramRoom.getCreationTimestamp())).a("RoomStatus", Integer.valueOf(paramRoom.getStatus())).a("Description", paramRoom.getDescription()).a("Variant", Integer.valueOf(paramRoom.getVariant())).a("AutoMatchCriteria", paramRoom.getAutoMatchCriteria()).a("Participants", paramRoom.getParticipants()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds())).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Room freeze()
  {
    return this;
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.oh;
  }
  
  public int getAutoMatchWaitEstimateSeconds()
  {
    return this.on;
  }
  
  public long getCreationTimestamp()
  {
    return this.nN;
  }
  
  public String getCreatorId()
  {
    return this.ol;
  }
  
  public String getDescription()
  {
    return this.mo;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    eg.b(this.mo, paramCharArrayBuffer);
  }
  
  public String getParticipantId(String paramString)
  {
    int i = this.nQ.size();
    for (int j = 0; j < i; j++)
    {
      Participant localParticipant = (Participant)this.nQ.get(j);
      Player localPlayer = localParticipant.getPlayer();
      if ((localPlayer != null) && (localPlayer.getPlayerId().equals(paramString))) {
        return localParticipant.getParticipantId();
      }
    }
    return null;
  }
  
  public ArrayList<String> getParticipantIds()
  {
    int i = this.nQ.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(((ParticipantEntity)this.nQ.get(j)).getParticipantId());
    }
    return localArrayList;
  }
  
  public int getParticipantStatus(String paramString)
  {
    int i = this.nQ.size();
    for (int j = 0; j < i; j++)
    {
      Participant localParticipant = (Participant)this.nQ.get(j);
      if (localParticipant.getParticipantId().equals(paramString)) {
        return localParticipant.getStatus();
      }
    }
    throw new IllegalStateException("Participant " + paramString + " is not in room " + getRoomId());
  }
  
  public ArrayList<Participant> getParticipants()
  {
    return new ArrayList(this.nQ);
  }
  
  public String getRoomId()
  {
    return this.nb;
  }
  
  public int getStatus()
  {
    return this.om;
  }
  
  public int getVariant()
  {
    return this.nR;
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
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!aX()) {
      b.a(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      paramParcel.writeString(this.nb);
      paramParcel.writeString(this.ol);
      paramParcel.writeLong(this.nN);
      paramParcel.writeInt(this.om);
      paramParcel.writeString(this.mo);
      paramParcel.writeInt(this.nR);
      paramParcel.writeBundle(this.oh);
      int i = this.nQ.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++) {
        ((ParticipantEntity)this.nQ.get(j)).writeToParcel(paramParcel, paramInt);
      }
    }
  }
  
  static final class a
    extends b
  {
    public RoomEntity y(Parcel paramParcel)
    {
      if ((RoomEntity.b(RoomEntity.bQ())) || (RoomEntity.J(RoomEntity.class.getCanonicalName()))) {
        return super.y(paramParcel);
      }
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      long l = paramParcel.readLong();
      int i = paramParcel.readInt();
      String str3 = paramParcel.readString();
      int j = paramParcel.readInt();
      Bundle localBundle = paramParcel.readBundle();
      int k = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(k);
      for (int m = 0; m < k; m++) {
        localArrayList.add(ParticipantEntity.CREATOR.createFromParcel(paramParcel));
      }
      return new RoomEntity(2, str1, str2, l, i, str3, j, localBundle, localArrayList, -1);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomEntity
 * JD-Core Version:    0.7.0.1
 */