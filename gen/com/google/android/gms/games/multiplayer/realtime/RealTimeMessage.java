package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dm;

public final class RealTimeMessage
  implements Parcelable
{
  public static final Parcelable.Creator<RealTimeMessage> CREATOR = new Parcelable.Creator()
  {
    public RealTimeMessage[] U(int paramAnonymousInt)
    {
      return new RealTimeMessage[paramAnonymousInt];
    }
    
    public RealTimeMessage x(Parcel paramAnonymousParcel)
    {
      return new RealTimeMessage(paramAnonymousParcel, null);
    }
  };
  public static final int RELIABLE = 1;
  public static final int UNRELIABLE;
  private final String oa;
  private final byte[] ob;
  private final int oc;
  
  private RealTimeMessage(Parcel paramParcel)
  {
    this(paramParcel.readString(), paramParcel.createByteArray(), paramParcel.readInt());
  }
  
  public RealTimeMessage(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    this.oa = ((String)dm.e(paramString));
    this.ob = ((byte[])((byte[])dm.e(paramArrayOfByte)).clone());
    this.oc = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public byte[] getMessageData()
  {
    return this.ob;
  }
  
  public String getSenderParticipantId()
  {
    return this.oa;
  }
  
  public boolean isReliable()
  {
    return this.oc == 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.oa);
    paramParcel.writeByteArray(this.ob);
    paramParcel.writeInt(this.oc);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RealTimeMessage
 * JD-Core Version:    0.7.0.1
 */