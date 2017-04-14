package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;

public final class d
  extends b
  implements Player
{
  public d(com.google.android.gms.common.data.d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return PlayerEntity.a(this, paramObject);
  }
  
  public Player freeze()
  {
    return new PlayerEntity(this);
  }
  
  public String getDisplayName()
  {
    return getString("profile_name");
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    a("profile_name", paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    return u("profile_hi_res_image_uri");
  }
  
  public Uri getIconImageUri()
  {
    return u("profile_icon_image_uri");
  }
  
  public String getPlayerId()
  {
    return getString("external_player_id");
  }
  
  public long getRetrievedTimestamp()
  {
    return getLong("last_updated");
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
    return PlayerEntity.a(this);
  }
  
  public String toString()
  {
    return PlayerEntity.b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((PlayerEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.d
 * JD-Core Version:    0.7.0.1
 */