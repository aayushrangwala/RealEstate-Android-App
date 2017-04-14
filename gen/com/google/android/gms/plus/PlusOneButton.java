package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.fm;

public final class PlusOneButton
  extends FrameLayout
{
  public static final int ANNOTATION_BUBBLE = 1;
  public static final int ANNOTATION_INLINE = 2;
  public static final int ANNOTATION_NONE = 0;
  public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
  public static final int SIZE_MEDIUM = 1;
  public static final int SIZE_SMALL = 0;
  public static final int SIZE_STANDARD = 3;
  public static final int SIZE_TALL = 2;
  private String hN;
  private int mSize;
  private View re;
  private int rf;
  private int rg;
  private OnPlusOneClickListener rh;
  
  public PlusOneButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mSize = getSize(paramContext, paramAttributeSet);
    this.rf = getAnnotation(paramContext, paramAttributeSet);
    this.rg = -1;
    p(getContext());
    if (isInEditMode()) {}
  }
  
  protected static int getAnnotation(Context paramContext, AttributeSet paramAttributeSet)
  {
    String str = dp.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    int i;
    if ("INLINE".equalsIgnoreCase(str)) {
      i = 2;
    }
    boolean bool;
    do
    {
      return i;
      bool = "NONE".equalsIgnoreCase(str);
      i = 0;
    } while (bool);
    return 1;
  }
  
  protected static int getSize(Context paramContext, AttributeSet paramAttributeSet)
  {
    String str = dp.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("SMALL".equalsIgnoreCase(str)) {
      return 0;
    }
    if ("MEDIUM".equalsIgnoreCase(str)) {
      return 1;
    }
    if ("TALL".equalsIgnoreCase(str)) {
      return 2;
    }
    return 3;
  }
  
  private void p(Context paramContext)
  {
    if (this.re != null) {
      removeView(this.re);
    }
    this.re = fm.a(paramContext, this.mSize, this.rf, this.hN, this.rg);
    setOnPlusOneClickListener(this.rh);
    addView(this.re);
  }
  
  public void initialize(String paramString, int paramInt)
  {
    dm.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(PlusClient, String, OnPlusOneClickListener).");
    this.hN = paramString;
    this.rg = paramInt;
    p(getContext());
  }
  
  public void initialize(String paramString, OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.hN = paramString;
    this.rg = 0;
    p(getContext());
    setOnPlusOneClickListener(paramOnPlusOneClickListener);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.re.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.re;
    measureChild(localView, paramInt1, paramInt2);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }
  
  public void setAnnotation(int paramInt)
  {
    this.rf = paramInt;
    p(getContext());
  }
  
  public void setOnPlusOneClickListener(OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.rh = paramOnPlusOneClickListener;
    this.re.setOnClickListener(new DefaultOnPlusOneClickListener(paramOnPlusOneClickListener));
  }
  
  public void setSize(int paramInt)
  {
    this.mSize = paramInt;
    p(getContext());
  }
  
  protected class DefaultOnPlusOneClickListener
    implements View.OnClickListener, PlusOneButton.OnPlusOneClickListener
  {
    private final PlusOneButton.OnPlusOneClickListener ri;
    
    public DefaultOnPlusOneClickListener(PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
    {
      this.ri = paramOnPlusOneClickListener;
    }
    
    public void onClick(View paramView)
    {
      Intent localIntent = (Intent)PlusOneButton.a(PlusOneButton.this).getTag();
      if (this.ri != null)
      {
        this.ri.onPlusOneClick(localIntent);
        return;
      }
      onPlusOneClick(localIntent);
    }
    
    public void onPlusOneClick(Intent paramIntent)
    {
      Context localContext = PlusOneButton.this.getContext();
      if (((localContext instanceof Activity)) && (paramIntent != null)) {
        ((Activity)localContext).startActivityForResult(paramIntent, PlusOneButton.b(PlusOneButton.this));
      }
    }
  }
  
  public static abstract interface OnPlusOneClickListener
  {
    public abstract void onPlusOneClick(Intent paramIntent);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneButton
 * JD-Core Version:    0.7.0.1
 */