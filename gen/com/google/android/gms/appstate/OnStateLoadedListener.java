package com.google.android.gms.appstate;

public abstract interface OnStateLoadedListener
{
  public abstract void onStateConflict(int paramInt, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract void onStateLoaded(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.OnStateLoadedListener
 * JD-Core Version:    0.7.0.1
 */