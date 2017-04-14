package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.fj.a;
import com.google.android.gms.internal.fm;

public final class PlusOneButtonWithPopup
  extends ViewGroup
{
  private String hN;
  private String it;
  private int mSize;
  private View re;
  private int rf;
  private View.OnClickListener rk;
  
  public PlusOneButtonWithPopup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PlusOneButtonWithPopup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mSize = PlusOneButton.getSize(paramContext, paramAttributeSet);
    this.rf = PlusOneButton.getAnnotation(paramContext, paramAttributeSet);
    this.re = new PlusOneDummyView(paramContext, this.mSize);
    addView(this.re);
  }
  
  private int c(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    switch (i)
    {
    default: 
      return paramInt1;
    }
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2, i);
  }
  
  private void cS()
  {
    if (this.re != null) {
      removeView(this.re);
    }
    this.re = fm.a(getContext(), this.mSize, this.rf, this.hN, this.it);
    if (this.rk != null) {
      setOnClickListener(this.rk);
    }
    addView(this.re);
  }
  
  private fj cT()
    throws RemoteException
  {
    fj localfj = fj.a.ap((IBinder)this.re.getTag());
    if (localfj == null)
    {
      if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
        Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
      }
      throw new RemoteException();
    }
    return localfj;
  }
  
  public void cancelClick()
  {
    if (this.re != null) {}
    try
    {
      cT().cancelClick();
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public PendingIntent getResolution()
  {
    if (this.re != null) {
      try
      {
        PendingIntent localPendingIntent = cT().getResolution();
        return localPendingIntent;
      }
      catch (RemoteException localRemoteException) {}
    }
    return null;
  }
  
  public void initialize(String paramString1, String paramString2)
  {
    dm.a(paramString1, "Url must not be null");
    this.hN = paramString1;
    this.it = paramString2;
    cS();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.re.layout(getPaddingLeft(), getPaddingTop(), paramInt3 - paramInt1 - getPaddingRight(), paramInt4 - paramInt2 - getPaddingBottom());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    this.re.measure(c(paramInt1, i), c(paramInt2, j));
    setMeasuredDimension(i + this.re.getMeasuredWidth(), j + this.re.getMeasuredHeight());
  }
  
  public void reinitialize()
  {
    if (this.re != null) {}
    try
    {
      cT().reinitialize();
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public void setAnnotation(int paramInt)
  {
    this.rf = paramInt;
    cS();
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.rk = paramOnClickListener;
    this.re.setOnClickListener(paramOnClickListener);
  }
  
  public void setSize(int paramInt)
  {
    this.mSize = paramInt;
    cS();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneButtonWithPopup
 * JD-Core Version:    0.7.0.1
 */