package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

public final class d
  extends b
  implements Participant
{
  private final com.google.android.gms.games.d nZ;
  
  public d(com.google.android.gms.common.data.d paramd, int paramInt)
  {
    super(paramd, paramInt);
    this.nZ = new com.google.android.gms.games.d(paramd, paramInt);
  }
  
  public String ci()
  {
    return getString("client_address");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return ParticipantEntity.a(this, paramObject);
  }
  
  public Participant freeze()
  {
    return new ParticipantEntity(this);
  }
  
  public int getCapabilities()
  {
    return getInteger("capabilities");
  }
  
  public String getDisplayName()
  {
    if (v("external_player_id")) {
      return getString("default_display_name");
    }
    return this.nZ.getDisplayName();
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (v("external_player_id"))
    {
      a("default_display_name", paramCharArrayBuffer);
      return;
    }
    this.nZ.getDisplayName(paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    if (v("external_player_id")) {
      return null;
    }
    return this.nZ.getHiResImageUri();
  }
  
  public Uri getIconImageUri()
  {
    if (v("external_player_id")) {
      return u("default_display_image_uri");
    }
    return this.nZ.getIconImageUri();
  }
  
  public String getParticipantId()
  {
    return getString("external_participant_id");
  }
  
  public Player getPlayer()
  {
    if (v("external_player_id")) {
      return null;
    }
    return this.nZ;
  }
  
  public int getStatus()
  {
    return getInteger("player_status");
  }
  
  public int hashCode()
  {
    return ParticipantEntity.a(this);
  }
  
  public boolean isConnectedToRoom()
  {
    return getInteger("connected") > 0;
  }
  
  public String toString()
  {
    return ParticipantEntity.b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((ParticipantEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.d
 * JD-Core Version:    0.7.0.1
 */