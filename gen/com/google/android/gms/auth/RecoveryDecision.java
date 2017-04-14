package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecoveryDecision
  implements SafeParcelable
{
  public static final RecoveryDecisionCreator CREATOR = new RecoveryDecisionCreator();
  final int iM;
  public boolean isRecoveryInfoNeeded;
  public boolean isRecoveryInterstitialAllowed;
  public PendingIntent recoveryIntent;
  public PendingIntent recoveryIntentWithoutIntro;
  public boolean showRecoveryInterstitial;
  
  public RecoveryDecision()
  {
    this.iM = 1;
  }
  
  RecoveryDecision(int paramInt, PendingIntent paramPendingIntent1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, PendingIntent paramPendingIntent2)
  {
    this.iM = paramInt;
    this.recoveryIntent = paramPendingIntent1;
    this.showRecoveryInterstitial = paramBoolean1;
    this.isRecoveryInfoNeeded = paramBoolean2;
    this.isRecoveryInterstitialAllowed = paramBoolean3;
    this.recoveryIntentWithoutIntro = paramPendingIntent2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    RecoveryDecisionCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.RecoveryDecision
 * JD-Core Version:    0.7.0.1
 */