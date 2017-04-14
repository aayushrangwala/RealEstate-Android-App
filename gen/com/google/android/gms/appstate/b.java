package com.google.android.gms.appstate;

import com.google.android.gms.common.data.d;

public final class b
  extends com.google.android.gms.common.data.b
  implements AppState
{
  b(d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public AppState aE()
  {
    return new a(this);
  }
  
  public boolean equals(Object paramObject)
  {
    return a.a(this, paramObject);
  }
  
  public byte[] getConflictData()
  {
    return getByteArray("conflict_data");
  }
  
  public String getConflictVersion()
  {
    return getString("conflict_version");
  }
  
  public int getKey()
  {
    return getInteger("key");
  }
  
  public byte[] getLocalData()
  {
    return getByteArray("local_data");
  }
  
  public String getLocalVersion()
  {
    return getString("local_version");
  }
  
  public boolean hasConflict()
  {
    return !v("conflict_version");
  }
  
  public int hashCode()
  {
    return a.a(this);
  }
  
  public String toString()
  {
    return a.b(this);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.b
 * JD-Core Version:    0.7.0.1
 */