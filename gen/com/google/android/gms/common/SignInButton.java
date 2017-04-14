package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.e.a;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private int jc;
  private View jd;
  private View.OnClickListener je = null;
  private int mSize;
  
  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setStyle(0, 0);
  }
  
  private static Button c(Context paramContext, int paramInt1, int paramInt2)
  {
    do localdo = new do(paramContext);
    localdo.a(paramContext.getResources(), paramInt1, paramInt2);
    return localdo;
  }
  
  private void p(Context paramContext)
  {
    if (this.jd != null) {
      removeView(this.jd);
    }
    try
    {
      this.jd = dn.d(paramContext, this.mSize, this.jc);
      addView(this.jd);
      this.jd.setEnabled(isEnabled());
      this.jd.setOnClickListener(this);
      return;
    }
    catch (e.a locala)
    {
      for (;;)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        this.jd = c(paramContext, this.mSize, this.jc);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    if ((this.je != null) && (paramView == this.jd)) {
      this.je.onClick(this);
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    setStyle(this.mSize, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.jd.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.je = paramOnClickListener;
    if (this.jd != null) {
      this.jd.setOnClickListener(this);
    }
  }
  
  public void setSize(int paramInt)
  {
    setStyle(paramInt, this.jc);
  }
  
  public void setStyle(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool2 = bool1;
      dm.a(bool2, "Unknown button size " + paramInt1);
      if ((paramInt2 < 0) || (paramInt2 >= 2)) {
        break label95;
      }
    }
    for (;;)
    {
      dm.a(bool1, "Unknown color scheme " + paramInt2);
      this.mSize = paramInt1;
      this.jc = paramInt2;
      p(getContext());
      return;
      bool2 = false;
      break;
      label95:
      bool1 = false;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.7.0.1
 */