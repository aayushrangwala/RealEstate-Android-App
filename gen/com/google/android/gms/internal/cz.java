package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class cz
  extends Drawable
  implements Drawable.Callback
{
  private boolean kb = true;
  private int kd = 0;
  private long ke;
  private int kf;
  private int kg;
  private int kh = 255;
  private int ki;
  private int kj = 0;
  private boolean kk;
  private b kl;
  private Drawable km;
  private Drawable kn;
  private boolean ko;
  private boolean kp;
  private boolean kq;
  private int kr;
  
  public cz(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    if (paramDrawable1 == null) {
      paramDrawable1 = a.aT();
    }
    this.km = paramDrawable1;
    paramDrawable1.setCallback(this);
    b localb1 = this.kl;
    localb1.kv |= paramDrawable1.getChangingConfigurations();
    if (paramDrawable2 == null) {
      paramDrawable2 = a.aT();
    }
    this.kn = paramDrawable2;
    paramDrawable2.setCallback(this);
    b localb2 = this.kl;
    localb2.kv |= paramDrawable2.getChangingConfigurations();
  }
  
  cz(b paramb)
  {
    this.kl = new b(paramb);
  }
  
  public Drawable aS()
  {
    return this.kn;
  }
  
  public boolean canConstantState()
  {
    if (!this.ko) {
      if ((this.km.getConstantState() == null) || (this.kn.getConstantState() == null)) {
        break label44;
      }
    }
    label44:
    for (boolean bool = true;; bool = false)
    {
      this.kp = bool;
      this.ko = true;
      return this.kp;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    switch (this.kd)
    {
    }
    int k;
    boolean bool;
    Drawable localDrawable1;
    Drawable localDrawable2;
    do
    {
      for (int j = i;; j = 0)
      {
        k = this.kj;
        bool = this.kb;
        localDrawable1 = this.km;
        localDrawable2 = this.kn;
        if (j == 0) {
          break;
        }
        if ((!bool) || (k == 0)) {
          localDrawable1.draw(paramCanvas);
        }
        if (k == this.kh)
        {
          localDrawable2.setAlpha(this.kh);
          localDrawable2.draw(paramCanvas);
        }
        return;
        this.ke = SystemClock.uptimeMillis();
        this.kd = 2;
      }
    } while (this.ke < 0L);
    float f1 = (float)(SystemClock.uptimeMillis() - this.ke) / this.ki;
    if (f1 >= 1.0F) {}
    for (;;)
    {
      if (i != 0) {
        this.kd = 0;
      }
      float f2 = Math.min(f1, 1.0F);
      this.kj = ((int)(this.kf + f2 * (this.kg - this.kf)));
      break;
      i = 0;
    }
    if (bool) {
      localDrawable1.setAlpha(this.kh - k);
    }
    localDrawable1.draw(paramCanvas);
    if (bool) {
      localDrawable1.setAlpha(this.kh);
    }
    if (k > 0)
    {
      localDrawable2.setAlpha(k);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(this.kh);
    }
    invalidateSelf();
  }
  
  public int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | this.kl.ku | this.kl.kv;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (canConstantState())
    {
      this.kl.ku = getChangingConfigurations();
      return this.kl;
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    return Math.max(this.km.getIntrinsicHeight(), this.kn.getIntrinsicHeight());
  }
  
  public int getIntrinsicWidth()
  {
    return Math.max(this.km.getIntrinsicWidth(), this.kn.getIntrinsicWidth());
  }
  
  public int getOpacity()
  {
    if (!this.kq)
    {
      this.kr = Drawable.resolveOpacity(this.km.getOpacity(), this.kn.getOpacity());
      this.kq = true;
    }
    return this.kr;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (ek.bJ())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.invalidateDrawable(this);
      }
    }
  }
  
  public Drawable mutate()
  {
    if ((!this.kk) && (super.mutate() == this))
    {
      if (!canConstantState()) {
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      }
      this.km.mutate();
      this.kn.mutate();
      this.kk = true;
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.km.setBounds(paramRect);
    this.kn.setBounds(paramRect);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (ek.bJ())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.scheduleDrawable(this, paramRunnable, paramLong);
      }
    }
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.kj == this.kh) {
      this.kj = paramInt;
    }
    this.kh = paramInt;
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.km.setColorFilter(paramColorFilter);
    this.kn.setColorFilter(paramColorFilter);
  }
  
  public void startTransition(int paramInt)
  {
    this.kf = 0;
    this.kg = this.kh;
    this.kj = 0;
    this.ki = paramInt;
    this.kd = 1;
    invalidateSelf();
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (ek.bJ())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.unscheduleDrawable(this, paramRunnable);
      }
    }
  }
  
  private static final class a
    extends Drawable
  {
    private static final a ks = new a();
    private static final a kt = new a(null);
    
    public void draw(Canvas paramCanvas) {}
    
    public Drawable.ConstantState getConstantState()
    {
      return kt;
    }
    
    public int getOpacity()
    {
      return -2;
    }
    
    public void setAlpha(int paramInt) {}
    
    public void setColorFilter(ColorFilter paramColorFilter) {}
    
    private static final class a
      extends Drawable.ConstantState
    {
      public int getChangingConfigurations()
      {
        return 0;
      }
      
      public Drawable newDrawable()
      {
        return cz.a.aT();
      }
    }
  }
  
  static final class b
    extends Drawable.ConstantState
  {
    int ku;
    int kv;
    
    b(b paramb)
    {
      if (paramb != null)
      {
        this.ku = paramb.ku;
        this.kv = paramb.kv;
      }
    }
    
    public int getChangingConfigurations()
    {
      return this.ku;
    }
    
    public Drawable newDrawable()
    {
      return new cz(this);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cz
 * JD-Core Version:    0.7.0.1
 */