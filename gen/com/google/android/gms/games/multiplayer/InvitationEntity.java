package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.en;
import java.util.ArrayList;

public final class InvitationEntity
  extends en
  implements Invitation
{
  public static final Parcelable.Creator<InvitationEntity> CREATOR = new a();
  private final int iM;
  private final GameEntity nL;
  private final String nM;
  private final long nN;
  private final int nO;
  private final ParticipantEntity nP;
  private final ArrayList<ParticipantEntity> nQ;
  private final int nR;
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList<ParticipantEntity> paramArrayList, int paramInt3)
  {
    this.iM = paramInt1;
    this.nL = paramGameEntity;
    this.nM = paramString;
    this.nN = paramLong;
    this.nO = paramInt2;
    this.nP = paramParticipantEntity;
    this.nQ = paramArrayList;
    this.nR = paramInt3;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    this.iM = 1;
    this.nL = new GameEntity(paramInvitation.getGame());
    this.nM = paramInvitation.getInvitationId();
    this.nN = paramInvitation.getCreationTimestamp();
    this.nO = paramInvitation.ch();
    this.nR = paramInvitation.getVariant();
    String str = paramInvitation.getInviter().getParticipantId();
    Object localObject = null;
    ArrayList localArrayList = paramInvitation.getParticipants();
    int i = localArrayList.size();
    this.nQ = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      Participant localParticipant = (Participant)localArrayList.get(j);
      if (localParticipant.getParticipantId().equals(str)) {
        localObject = localParticipant;
      }
      this.nQ.add((ParticipantEntity)localParticipant.freeze());
    }
    dm.a(localObject, "Must have a valid inviter!");
    this.nP = ((ParticipantEntity)localObject.freeze());
  }
  
  static int a(Invitation paramInvitation)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramInvitation.getGame();
    arrayOfObject[1] = paramInvitation.getInvitationId();
    arrayOfObject[2] = Long.valueOf(paramInvitation.getCreationTimestamp());
    arrayOfObject[3] = Integer.valueOf(paramInvitation.ch());
    arrayOfObject[4] = paramInvitation.getInviter();
    arrayOfObject[5] = paramInvitation.getParticipants();
    arrayOfObject[6] = Integer.valueOf(paramInvitation.getVariant());
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(Invitation paramInvitation, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Invitation)) {
      bool = false;
    }
    Invitation localInvitation;
    do
    {
      do
      {
        return bool;
      } while (paramInvitation == paramObject);
      localInvitation = (Invitation)paramObject;
    } while ((dl.equal(localInvitation.getGame(), paramInvitation.getGame())) && (dl.equal(localInvitation.getInvitationId(), paramInvitation.getInvitationId())) && (dl.equal(Long.valueOf(localInvitation.getCreationTimestamp()), Long.valueOf(paramInvitation.getCreationTimestamp()))) && (dl.equal(Integer.valueOf(localInvitation.ch()), Integer.valueOf(paramInvitation.ch()))) && (dl.equal(localInvitation.getInviter(), paramInvitation.getInviter())) && (dl.equal(localInvitation.getParticipants(), paramInvitation.getParticipants())) && (dl.equal(Integer.valueOf(localInvitation.getVariant()), Integer.valueOf(paramInvitation.getVariant()))));
    return false;
  }
  
  static String b(Invitation paramInvitation)
  {
    return dl.d(paramInvitation).a("Game", paramInvitation.getGame()).a("InvitationId", paramInvitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(paramInvitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(paramInvitation.ch())).a("Inviter", paramInvitation.getInviter()).a("Participants", paramInvitation.getParticipants()).a("Variant", Integer.valueOf(paramInvitation.getVariant())).toString();
  }
  
  public int ch()
  {
    return this.nO;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public Invitation freeze()
  {
    return this;
  }
  
  public long getCreationTimestamp()
  {
    return this.nN;
  }
  
  public Game getGame()
  {
    return this.nL;
  }
  
  public String getInvitationId()
  {
    return this.nM;
  }
  
  public Participant getInviter()
  {
    return this.nP;
  }
  
  public ArrayList<Participant> getParticipants()
  {
    return new ArrayList(this.nQ);
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
      a.a(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      this.nL.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.nM);
      paramParcel.writeLong(this.nN);
      paramParcel.writeInt(this.nO);
      this.nP.writeToParcel(paramParcel, paramInt);
      int i = this.nQ.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++) {
        ((ParticipantEntity)this.nQ.get(j)).writeToParcel(paramParcel, paramInt);
      }
    }
  }
  
  static final class a
    extends a
  {
    public InvitationEntity v(Parcel paramParcel)
    {
      if ((InvitationEntity.b(InvitationEntity.bQ())) || (InvitationEntity.J(InvitationEntity.class.getCanonicalName()))) {
        return super.v(paramParcel);
      }
      GameEntity localGameEntity = (GameEntity)GameEntity.CREATOR.createFromParcel(paramParcel);
      String str = paramParcel.readString();
      long l = paramParcel.readLong();
      int i = paramParcel.readInt();
      ParticipantEntity localParticipantEntity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(paramParcel);
      int j = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(j);
      for (int k = 0; k < j; k++) {
        localArrayList.add(ParticipantEntity.CREATOR.createFromParcel(paramParcel));
      }
      return new InvitationEntity(1, localGameEntity, str, l, i, localParticipantEntity, localArrayList, -1);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationEntity
 * JD-Core Version:    0.7.0.1
 */