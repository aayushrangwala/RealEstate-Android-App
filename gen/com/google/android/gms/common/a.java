package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a
  implements ServiceConnection
{
  boolean iN = false;
  private final BlockingQueue<IBinder> iO = new LinkedBlockingQueue();
  
  public IBinder aG()
    throws InterruptedException
  {
    if (this.iN) {
      throw new IllegalStateException();
    }
    this.iN = true;
    return (IBinder)this.iO.take();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.iO.put(paramIBinder);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.7.0.1
 */