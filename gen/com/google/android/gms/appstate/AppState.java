package com.google.android.gms.appstate;

import com.google.android.gms.common.data.Freezable;

public abstract interface AppState
  extends Freezable<AppState>
{
  public abstract byte[] getConflictData();
  
  public abstract String getConflictVersion();
  
  public abstract int getKey();
  
  public abstract byte[] getLocalData();
  
  public abstract String getLocalVersion();
  
  public abstract boolean hasConflict();
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppState
 * JD-Core Version:    0.7.0.1
 */