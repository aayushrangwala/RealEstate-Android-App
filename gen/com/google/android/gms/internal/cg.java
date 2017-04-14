package com.google.android.gms.internal;

public abstract class cg
{
  private final Runnable el = new Runnable()
  {
    public final void run()
    {
      cg.a(cg.this, Thread.currentThread());
      cg.this.ac();
    }
  };
  private volatile Thread hD;
  
  public abstract void ac();
  
  public final void cancel()
  {
    onStop();
    if (this.hD != null) {
      this.hD.interrupt();
    }
  }
  
  public abstract void onStop();
  
  public final void start()
  {
    ch.execute(this.el);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cg
 * JD-Core Version:    0.7.0.1
 */