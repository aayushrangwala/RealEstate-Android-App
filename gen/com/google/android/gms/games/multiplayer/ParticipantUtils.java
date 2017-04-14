package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;

public final class ParticipantUtils
{
  public static boolean Q(String paramString)
  {
    dm.a(paramString, "Participant ID must not be null");
    return paramString.startsWith("p_");
  }
  
  public static String getParticipantId(ArrayList<Participant> paramArrayList, String paramString)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      Participant localParticipant = (Participant)paramArrayList.get(j);
      Player localPlayer = localParticipant.getPlayer();
      if ((localPlayer != null) && (localPlayer.getPlayerId().equals(paramString))) {
        return localParticipant.getParticipantId();
      }
    }
    return null;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantUtils
 * JD-Core Version:    0.7.0.1
 */