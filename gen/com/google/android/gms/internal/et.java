package com.google.android.gms.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class et
  implements RealTimeSocket
{
  private ParcelFileDescriptor jN;
  private final String nd;
  private final LocalSocket nt;
  
  et(LocalSocket paramLocalSocket, String paramString)
  {
    this.nt = paramLocalSocket;
    this.nd = paramString;
  }
  
  public void close()
    throws IOException
  {
    this.nt.close();
  }
  
  public InputStream getInputStream()
    throws IOException
  {
    return this.nt.getInputStream();
  }
  
  public OutputStream getOutputStream()
    throws IOException
  {
    return this.nt.getOutputStream();
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
    throws IOException
  {
    if ((this.jN == null) && (!isClosed()))
    {
      Parcel localParcel = Parcel.obtain();
      localParcel.writeFileDescriptor(this.nt.getFileDescriptor());
      localParcel.setDataPosition(0);
      this.jN = localParcel.readFileDescriptor();
    }
    return this.jN;
  }
  
  public boolean isClosed()
  {
    return (!this.nt.isConnected()) && (!this.nt.isBound());
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.et
 * JD-Core Version:    0.7.0.1
 */