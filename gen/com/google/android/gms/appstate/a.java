package com.google.android.gms.appstate;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dl.a;

public final class a
  implements AppState
{
  private final int iu;
  private final String iv;
  private final byte[] iw;
  private final boolean ix;
  private final String iy;
  private final byte[] iz;
  
  public a(AppState paramAppState)
  {
    this.iu = paramAppState.getKey();
    this.iv = paramAppState.getLocalVersion();
    this.iw = paramAppState.getLocalData();
    this.ix = paramAppState.hasConflict();
    this.iy = paramAppState.getConflictVersion();
    this.iz = paramAppState.getConflictData();
  }
  
  static int a(AppState paramAppState)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(paramAppState.getKey());
    arrayOfObject[1] = paramAppState.getLocalVersion();
    arrayOfObject[2] = paramAppState.getLocalData();
    arrayOfObject[3] = Boolean.valueOf(paramAppState.hasConflict());
    arrayOfObject[4] = paramAppState.getConflictVersion();
    arrayOfObject[5] = paramAppState.getConflictData();
    return dl.hashCode(arrayOfObject);
  }
  
  static boolean a(AppState paramAppState, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof AppState)) {
      bool = false;
    }
    AppState localAppState;
    do
    {
      do
      {
        return bool;
      } while (paramAppState == paramObject);
      localAppState = (AppState)paramObject;
    } while ((dl.equal(Integer.valueOf(localAppState.getKey()), Integer.valueOf(paramAppState.getKey()))) && (dl.equal(localAppState.getLocalVersion(), paramAppState.getLocalVersion())) && (dl.equal(localAppState.getLocalData(), paramAppState.getLocalData())) && (dl.equal(Boolean.valueOf(localAppState.hasConflict()), Boolean.valueOf(paramAppState.hasConflict()))) && (dl.equal(localAppState.getConflictVersion(), paramAppState.getConflictVersion())) && (dl.equal(localAppState.getConflictData(), paramAppState.getConflictData())));
    return false;
  }
  
  static String b(AppState paramAppState)
  {
    return dl.d(paramAppState).a("Key", Integer.valueOf(paramAppState.getKey())).a("LocalVersion", paramAppState.getLocalVersion()).a("LocalData", paramAppState.getLocalData()).a("HasConflict", Boolean.valueOf(paramAppState.hasConflict())).a("ConflictVersion", paramAppState.getConflictVersion()).a("ConflictData", paramAppState.getConflictData()).toString();
  }
  
  public AppState aE()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public byte[] getConflictData()
  {
    return this.iz;
  }
  
  public String getConflictVersion()
  {
    return this.iy;
  }
  
  public int getKey()
  {
    return this.iu;
  }
  
  public byte[] getLocalData()
  {
    return this.iw;
  }
  
  public String getLocalVersion()
  {
    return this.iv;
  }
  
  public boolean hasConflict()
  {
    return this.ix;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return b(this);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.a
 * JD-Core Version:    0.7.0.1
 */