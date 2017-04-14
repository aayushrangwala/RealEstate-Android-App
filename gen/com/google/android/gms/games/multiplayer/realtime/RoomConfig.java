package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomConfig
{
  private final String nM;
  private final int nR;
  private final RoomUpdateListener od;
  private final RoomStatusUpdateListener oe;
  private final RealTimeMessageReceivedListener of;
  private final String[] og;
  private final Bundle oh;
  private final boolean oi;
  
  private RoomConfig(Builder paramBuilder)
  {
    this.od = paramBuilder.od;
    this.oe = paramBuilder.oe;
    this.of = paramBuilder.of;
    this.nM = paramBuilder.oj;
    this.nR = paramBuilder.nR;
    this.oh = paramBuilder.oh;
    this.oi = paramBuilder.oi;
    int i = paramBuilder.ok.size();
    this.og = ((String[])paramBuilder.ok.toArray(new String[i]));
    if (this.of == null) {
      dm.a(this.oi, "Must either enable sockets OR specify a message listener");
    }
  }
  
  public static Builder builder(RoomUpdateListener paramRoomUpdateListener)
  {
    return new Builder(paramRoomUpdateListener, null);
  }
  
  public static Bundle createAutoMatchCriteria(int paramInt1, int paramInt2, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("min_automatch_players", paramInt1);
    localBundle.putInt("max_automatch_players", paramInt2);
    localBundle.putLong("exclusive_bit_mask", paramLong);
    return localBundle;
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.oh;
  }
  
  public String getInvitationId()
  {
    return this.nM;
  }
  
  public String[] getInvitedPlayerIds()
  {
    return this.og;
  }
  
  public RealTimeMessageReceivedListener getMessageReceivedListener()
  {
    return this.of;
  }
  
  public RoomStatusUpdateListener getRoomStatusUpdateListener()
  {
    return this.oe;
  }
  
  public RoomUpdateListener getRoomUpdateListener()
  {
    return this.od;
  }
  
  public int getVariant()
  {
    return this.nR;
  }
  
  public boolean isSocketEnabled()
  {
    return this.oi;
  }
  
  public static final class Builder
  {
    int nR = -1;
    final RoomUpdateListener od;
    RoomStatusUpdateListener oe;
    RealTimeMessageReceivedListener of;
    Bundle oh;
    boolean oi = false;
    String oj = null;
    ArrayList<String> ok = new ArrayList();
    
    private Builder(RoomUpdateListener paramRoomUpdateListener)
    {
      this.od = ((RoomUpdateListener)dm.a(paramRoomUpdateListener, "Must provide a RoomUpdateListener"));
    }
    
    public Builder addPlayersToInvite(ArrayList<String> paramArrayList)
    {
      dm.e(paramArrayList);
      this.ok.addAll(paramArrayList);
      return this;
    }
    
    public Builder addPlayersToInvite(String... paramVarArgs)
    {
      dm.e(paramVarArgs);
      this.ok.addAll(Arrays.asList(paramVarArgs));
      return this;
    }
    
    public RoomConfig build()
    {
      return new RoomConfig(this, null);
    }
    
    public Builder setAutoMatchCriteria(Bundle paramBundle)
    {
      this.oh = paramBundle;
      return this;
    }
    
    public Builder setInvitationIdToAccept(String paramString)
    {
      dm.e(paramString);
      this.oj = paramString;
      return this;
    }
    
    public Builder setMessageReceivedListener(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
    {
      this.of = paramRealTimeMessageReceivedListener;
      return this;
    }
    
    public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener paramRoomStatusUpdateListener)
    {
      this.oe = paramRoomStatusUpdateListener;
      return this;
    }
    
    public Builder setSocketCommunicationEnabled(boolean paramBoolean)
    {
      this.oi = paramBoolean;
      return this;
    }
    
    public Builder setVariant(int paramInt)
    {
      this.nR = paramInt;
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomConfig
 * JD-Core Version:    0.7.0.1
 */