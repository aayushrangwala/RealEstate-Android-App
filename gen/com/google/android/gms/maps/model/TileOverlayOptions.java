package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;
import com.google.android.gms.maps.model.internal.g;
import com.google.android.gms.maps.model.internal.g.a;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final TileOverlayOptionsCreator CREATOR = new TileOverlayOptionsCreator();
  private final int iM;
  private g qP;
  private TileProvider qQ;
  private float qk;
  private boolean ql = true;
  
  public TileOverlayOptions()
  {
    this.iM = 1;
  }
  
  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean, float paramFloat)
  {
    this.iM = paramInt;
    this.qP = g.a.aj(paramIBinder);
    if (this.qP == null) {}
    for (TileProvider local1 = null;; local1 = new TileProvider()
        {
          private final g qR = TileOverlayOptions.a(TileOverlayOptions.this);
          
          public Tile getTile(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            try
            {
              Tile localTile = this.qR.getTile(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
              return localTile;
            }
            catch (RemoteException localRemoteException) {}
            return null;
          }
        })
    {
      this.qQ = local1;
      this.ql = paramBoolean;
      this.qk = paramFloat;
      return;
    }
  }
  
  IBinder cP()
  {
    return this.qP.asBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public TileProvider getTileProvider()
  {
    return this.qQ;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public float getZIndex()
  {
    return this.qk;
  }
  
  public boolean isVisible()
  {
    return this.ql;
  }
  
  public TileOverlayOptions tileProvider(final TileProvider paramTileProvider)
  {
    this.qQ = paramTileProvider;
    if (this.qQ == null) {}
    for (g.a local2 = null;; local2 = new g.a()
        {
          public Tile getTile(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            return paramTileProvider.getTile(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
          }
        })
    {
      this.qP = local2;
      return this;
    }
  }
  
  public TileOverlayOptions visible(boolean paramBoolean)
  {
    this.ql = paramBoolean;
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (r.cK())
    {
      j.a(this, paramParcel, paramInt);
      return;
    }
    TileOverlayOptionsCreator.a(this, paramParcel, paramInt);
  }
  
  public TileOverlayOptions zIndex(float paramFloat)
  {
    this.qk = paramFloat;
    return this;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * JD-Core Version:    0.7.0.1
 */