package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class df
  implements Handler.Callback
{
  private static final Object kU = new Object();
  private static df kV;
  private final Context kW;
  private final HashMap<String, a> kX = new HashMap();
  private final Handler mHandler = new Handler(paramContext.getMainLooper(), this);
  
  private df(Context paramContext)
  {
    this.kW = paramContext.getApplicationContext();
  }
  
  public static df s(Context paramContext)
  {
    synchronized (kU)
    {
      if (kV == null) {
        kV = new df(paramContext.getApplicationContext());
      }
      return kV;
    }
  }
  
  public boolean a(String paramString, de<?>.e paramde)
  {
    for (;;)
    {
      a locala;
      synchronized (this.kX)
      {
        locala = (a)this.kX.get(paramString);
        if (locala == null)
        {
          locala = new a(paramString);
          locala.a(paramde);
          Intent localIntent1 = new Intent(paramString).setPackage("com.google.android.gms");
          locala.l(this.kW.bindService(localIntent1, locala.bg(), 129));
          this.kX.put(paramString, locala);
          boolean bool = locala.isBound();
          return bool;
        }
        this.mHandler.removeMessages(0, locala);
        if (locala.c(paramde)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
        }
      }
      locala.a(paramde);
      switch (locala.getState())
      {
      case 1: 
        paramde.onServiceConnected(locala.getComponentName(), locala.getBinder());
        break;
      case 2: 
        Intent localIntent2 = new Intent(paramString).setPackage("com.google.android.gms");
        locala.l(this.kW.bindService(localIntent2, locala.bg(), 129));
      }
    }
  }
  
  public void b(String paramString, de<?>.e paramde)
  {
    a locala;
    synchronized (this.kX)
    {
      locala = (a)this.kX.get(paramString);
      if (locala == null) {
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
      }
    }
    if (!locala.c(paramde)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    }
    locala.b(paramde);
    if (locala.bi())
    {
      Message localMessage = this.mHandler.obtainMessage(0, locala);
      this.mHandler.sendMessageDelayed(localMessage, 5000L);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    a locala = (a)paramMessage.obj;
    synchronized (this.kX)
    {
      if (locala.bi())
      {
        this.kW.unbindService(locala.bg());
        this.kX.remove(locala.bh());
      }
      return true;
    }
  }
  
  final class a
  {
    private final String kY;
    private final a kZ;
    private final HashSet<de<?>.e> la;
    private boolean lb;
    private IBinder lc;
    private ComponentName ld;
    private int mState;
    
    public a(String paramString)
    {
      this.kY = paramString;
      this.kZ = new a();
      this.la = new HashSet();
      this.mState = 0;
    }
    
    public void a(de<?>.e paramde)
    {
      this.la.add(paramde);
    }
    
    public void b(de<?>.e paramde)
    {
      this.la.remove(paramde);
    }
    
    public a bg()
    {
      return this.kZ;
    }
    
    public String bh()
    {
      return this.kY;
    }
    
    public boolean bi()
    {
      return this.la.isEmpty();
    }
    
    public boolean c(de<?>.e paramde)
    {
      return this.la.contains(paramde);
    }
    
    public IBinder getBinder()
    {
      return this.lc;
    }
    
    public ComponentName getComponentName()
    {
      return this.ld;
    }
    
    public int getState()
    {
      return this.mState;
    }
    
    public boolean isBound()
    {
      return this.lb;
    }
    
    public void l(boolean paramBoolean)
    {
      this.lb = paramBoolean;
    }
    
    public class a
      implements ServiceConnection
    {
      public a() {}
      
      public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
      {
        synchronized (df.a(df.this))
        {
          df.a.a(df.a.this, paramIBinder);
          df.a.a(df.a.this, paramComponentName);
          Iterator localIterator = df.a.a(df.a.this).iterator();
          if (localIterator.hasNext()) {
            ((de.e)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
          }
        }
        df.a.a(df.a.this, 1);
      }
      
      public void onServiceDisconnected(ComponentName paramComponentName)
      {
        synchronized (df.a(df.this))
        {
          df.a.a(df.a.this, null);
          df.a.a(df.a.this, paramComponentName);
          Iterator localIterator = df.a.a(df.a.this).iterator();
          if (localIterator.hasNext()) {
            ((de.e)localIterator.next()).onServiceDisconnected(paramComponentName);
          }
        }
        df.a.a(df.a.this, 2);
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.df
 * JD-Core Version:    0.7.0.1
 */