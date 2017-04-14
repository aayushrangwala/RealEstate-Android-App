package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.em;
import java.util.List;

public final class GamesClient
  implements GooglePlayServicesClient
{
  public static final String EXTRA_EXCLUSIVE_BIT_MASK = "exclusive_bit_mask";
  public static final String EXTRA_INVITATION = "invitation";
  public static final String EXTRA_MAX_AUTOMATCH_PLAYERS = "max_automatch_players";
  public static final String EXTRA_MIN_AUTOMATCH_PLAYERS = "min_automatch_players";
  public static final String EXTRA_PLAYERS = "players";
  public static final String EXTRA_ROOM = "room";
  public static final int MAX_RELIABLE_MESSAGE_LEN = 1400;
  public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
  public static final int NOTIFICATION_TYPES_ALL = -1;
  public static final int NOTIFICATION_TYPES_MULTIPLAYER = 1;
  public static final int NOTIFICATION_TYPE_INVITATION = 1;
  public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
  public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
  public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
  public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
  public static final int STATUS_APP_MISCONFIGURED = 8;
  public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
  public static final int STATUS_INTERNAL_ERROR = 1;
  public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
  public static final int STATUS_LICENSE_CHECK_FAILED = 7;
  public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
  public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
  public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
  public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
  public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
  public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
  public static final int STATUS_OK = 0;
  public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
  public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
  public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
  public static final int STATUS_REAL_TIME_MESSAGE_FAILED = -1;
  public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
  public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;
  private final em mz;
  
  private GamesClient(Context paramContext, String paramString1, String paramString2, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String[] paramArrayOfString, int paramInt, View paramView)
  {
    this.mz = new em(paramContext, paramString1, paramString2, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString, paramInt, paramView, false);
  }
  
  public void clearAllNotifications()
  {
    this.mz.clearNotifications(-1);
  }
  
  public void clearNotifications(int paramInt)
  {
    this.mz.clearNotifications(paramInt);
  }
  
  public void connect()
  {
    this.mz.connect();
  }
  
  public void createRoom(RoomConfig paramRoomConfig)
  {
    this.mz.createRoom(paramRoomConfig);
  }
  
  public void declineRoomInvitation(String paramString)
  {
    this.mz.j(paramString, 0);
  }
  
  public void disconnect()
  {
    this.mz.disconnect();
  }
  
  public void dismissRoomInvitation(String paramString)
  {
    this.mz.i(paramString, 0);
  }
  
  public Intent getAchievementsIntent()
  {
    return this.mz.getAchievementsIntent();
  }
  
  public Intent getAllLeaderboardsIntent()
  {
    return this.mz.getAllLeaderboardsIntent();
  }
  
  public String getAppId()
  {
    return this.mz.getAppId();
  }
  
  public String getCurrentAccountName()
  {
    return this.mz.getCurrentAccountName();
  }
  
  public Game getCurrentGame()
  {
    return this.mz.getCurrentGame();
  }
  
  public Player getCurrentPlayer()
  {
    return this.mz.getCurrentPlayer();
  }
  
  public String getCurrentPlayerId()
  {
    return this.mz.getCurrentPlayerId();
  }
  
  public Intent getInvitationInboxIntent()
  {
    return this.mz.getInvitationInboxIntent();
  }
  
  public Intent getLeaderboardIntent(String paramString)
  {
    return this.mz.getLeaderboardIntent(paramString);
  }
  
  public RealTimeSocket getRealTimeSocketForParticipant(String paramString1, String paramString2)
  {
    return this.mz.getRealTimeSocketForParticipant(paramString1, paramString2);
  }
  
  public Intent getRealTimeWaitingRoomIntent(Room paramRoom, int paramInt)
  {
    return this.mz.getRealTimeWaitingRoomIntent(paramRoom, paramInt);
  }
  
  public Intent getSelectPlayersIntent(int paramInt1, int paramInt2)
  {
    return this.mz.getSelectPlayersIntent(paramInt1, paramInt2);
  }
  
  public Intent getSettingsIntent()
  {
    return this.mz.getSettingsIntent();
  }
  
  public void incrementAchievement(String paramString, int paramInt)
  {
    this.mz.a(null, paramString, paramInt);
  }
  
  public void incrementAchievementImmediate(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString, int paramInt)
  {
    this.mz.a(paramOnAchievementUpdatedListener, paramString, paramInt);
  }
  
  public boolean isConnected()
  {
    return this.mz.isConnected();
  }
  
  public boolean isConnecting()
  {
    return this.mz.isConnecting();
  }
  
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.mz.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }
  
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.mz.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }
  
  public void joinRoom(RoomConfig paramRoomConfig)
  {
    this.mz.joinRoom(paramRoomConfig);
  }
  
  public void leaveRoom(RoomUpdateListener paramRoomUpdateListener, String paramString)
  {
    this.mz.leaveRoom(paramRoomUpdateListener, paramString);
  }
  
  public void loadAchievements(OnAchievementsLoadedListener paramOnAchievementsLoadedListener, boolean paramBoolean)
  {
    this.mz.loadAchievements(paramOnAchievementsLoadedListener, paramBoolean);
  }
  
  public void loadGame(OnGamesLoadedListener paramOnGamesLoadedListener)
  {
    this.mz.loadGame(paramOnGamesLoadedListener);
  }
  
  public void loadInvitablePlayers(OnPlayersLoadedListener paramOnPlayersLoadedListener, int paramInt, boolean paramBoolean)
  {
    this.mz.a(paramOnPlayersLoadedListener, paramInt, false, paramBoolean);
  }
  
  public void loadInvitations(OnInvitationsLoadedListener paramOnInvitationsLoadedListener)
  {
    this.mz.loadInvitations(paramOnInvitationsLoadedListener);
  }
  
  @Deprecated
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener)
  {
    loadLeaderboardMetadata(paramOnLeaderboardMetadataLoadedListener, false);
  }
  
  @Deprecated
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, String paramString)
  {
    loadLeaderboardMetadata(paramOnLeaderboardMetadataLoadedListener, paramString, false);
  }
  
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, String paramString, boolean paramBoolean)
  {
    this.mz.loadLeaderboardMetadata(paramOnLeaderboardMetadataLoadedListener, paramString, paramBoolean);
  }
  
  public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener paramOnLeaderboardMetadataLoadedListener, boolean paramBoolean)
  {
    this.mz.loadLeaderboardMetadata(paramOnLeaderboardMetadataLoadedListener, paramBoolean);
  }
  
  public void loadMoreInvitablePlayers(OnPlayersLoadedListener paramOnPlayersLoadedListener, int paramInt)
  {
    this.mz.a(paramOnPlayersLoadedListener, paramInt, true, false);
  }
  
  public void loadMoreScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    this.mz.loadMoreScores(paramOnLeaderboardScoresLoadedListener, paramLeaderboardScoreBuffer, paramInt1, paramInt2);
  }
  
  public void loadPlayer(OnPlayersLoadedListener paramOnPlayersLoadedListener, String paramString)
  {
    this.mz.loadPlayer(paramOnPlayersLoadedListener, paramString);
  }
  
  public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mz.loadPlayerCenteredScores(paramOnLeaderboardScoresLoadedListener, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.mz.loadPlayerCenteredScores(paramOnLeaderboardScoresLoadedListener, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void loadTopScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mz.loadTopScores(paramOnLeaderboardScoresLoadedListener, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public void loadTopScores(OnLeaderboardScoresLoadedListener paramOnLeaderboardScoresLoadedListener, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.mz.loadTopScores(paramOnLeaderboardScoresLoadedListener, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void reconnect()
  {
    this.mz.disconnect();
    this.mz.connect();
  }
  
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.mz.registerConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.mz.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void registerInvitationListener(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    this.mz.registerInvitationListener(paramOnInvitationReceivedListener);
  }
  
  public void revealAchievement(String paramString)
  {
    this.mz.a(null, paramString);
  }
  
  public void revealAchievementImmediate(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString)
  {
    this.mz.a(paramOnAchievementUpdatedListener, paramString);
  }
  
  public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener paramRealTimeReliableMessageSentListener, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    return this.mz.sendReliableRealTimeMessage(paramRealTimeReliableMessageSentListener, paramArrayOfByte, paramString1, paramString2);
  }
  
  public int sendUnreliableRealTimeMessage(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    return this.mz.a(paramArrayOfByte, paramString1, new String[] { paramString2 });
  }
  
  public int sendUnreliableRealTimeMessage(byte[] paramArrayOfByte, String paramString, List<String> paramList)
  {
    String[] arrayOfString = (String[])paramList.toArray(new String[paramList.size()]);
    return this.mz.a(paramArrayOfByte, paramString, arrayOfString);
  }
  
  public int sendUnreliableRealTimeMessageToAll(byte[] paramArrayOfByte, String paramString)
  {
    return this.mz.sendUnreliableRealTimeMessageToAll(paramArrayOfByte, paramString);
  }
  
  public void setAchievementSteps(String paramString, int paramInt)
  {
    this.mz.b(null, paramString, paramInt);
  }
  
  public void setAchievementStepsImmediate(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString, int paramInt)
  {
    this.mz.b(paramOnAchievementUpdatedListener, paramString, paramInt);
  }
  
  public void setGravityForPopups(int paramInt)
  {
    this.mz.setGravityForPopups(paramInt);
  }
  
  public void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
  {
    this.mz.setUseNewPlayerNotificationsFirstParty(paramBoolean);
  }
  
  public void setViewForPopups(View paramView)
  {
    dm.e(paramView);
    this.mz.setViewForPopups(paramView);
  }
  
  public void signOut()
  {
    this.mz.signOut(null);
  }
  
  public void signOut(OnSignOutCompleteListener paramOnSignOutCompleteListener)
  {
    this.mz.signOut(paramOnSignOutCompleteListener);
  }
  
  public void submitScore(String paramString, long paramLong)
  {
    this.mz.a(null, paramString, paramLong, null);
  }
  
  public void submitScore(String paramString1, long paramLong, String paramString2)
  {
    this.mz.a(null, paramString1, paramLong, paramString2);
  }
  
  public void submitScoreImmediate(OnScoreSubmittedListener paramOnScoreSubmittedListener, String paramString, long paramLong)
  {
    this.mz.a(paramOnScoreSubmittedListener, paramString, paramLong, null);
  }
  
  public void submitScoreImmediate(OnScoreSubmittedListener paramOnScoreSubmittedListener, String paramString1, long paramLong, String paramString2)
  {
    this.mz.a(paramOnScoreSubmittedListener, paramString1, paramLong, paramString2);
  }
  
  public void unlockAchievement(String paramString)
  {
    this.mz.b(null, paramString);
  }
  
  public void unlockAchievementImmediate(OnAchievementUpdatedListener paramOnAchievementUpdatedListener, String paramString)
  {
    this.mz.b(paramOnAchievementUpdatedListener, paramString);
  }
  
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.mz.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }
  
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.mz.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
  
  public void unregisterInvitationListener()
  {
    this.mz.unregisterInvitationListener();
  }
  
  public static final class Builder
  {
    private final GooglePlayServicesClient.ConnectionCallbacks iq;
    private final GooglePlayServicesClient.OnConnectionFailedListener ir;
    private String[] is = { "https://www.googleapis.com/auth/games" };
    private String it = "<<default account>>";
    private String mA;
    private int mB = 49;
    private View mC;
    private final Context mContext;
    
    public Builder(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this.mContext = paramContext;
      this.mA = paramContext.getPackageName();
      this.iq = paramConnectionCallbacks;
      this.ir = paramOnConnectionFailedListener;
    }
    
    public GamesClient create()
    {
      return new GamesClient(this.mContext, this.mA, this.it, this.iq, this.ir, this.is, this.mB, this.mC, null);
    }
    
    public Builder setAccountName(String paramString)
    {
      this.it = ((String)dm.e(paramString));
      return this;
    }
    
    public Builder setGravityForPopups(int paramInt)
    {
      this.mB = paramInt;
      return this;
    }
    
    public Builder setScopes(String... paramVarArgs)
    {
      this.is = paramVarArgs;
      return this;
    }
    
    public Builder setViewForPopups(View paramView)
    {
      this.mC = ((View)dm.e(paramView));
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GamesClient
 * JD-Core Version:    0.7.0.1
 */