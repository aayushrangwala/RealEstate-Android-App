package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ek;
import java.lang.ref.WeakReference;

public final class a
{
  final a jS;
  private int jT = 0;
  private int jU = 0;
  int jV;
  private int jW;
  private WeakReference<ImageManager.OnImageLoadedListener> jX;
  private WeakReference<ImageView> jY;
  private WeakReference<TextView> jZ;
  private int ka = -1;
  private boolean kb = true;
  private boolean kc = false;
  
  public a(int paramInt)
  {
    this.jS = new a(null);
    this.jU = paramInt;
  }
  
  public a(Uri paramUri)
  {
    this.jS = new a(paramUri);
    this.jU = 0;
  }
  
  private cz a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null) {
      if (!(paramDrawable1 instanceof cz)) {}
    }
    for (paramDrawable1 = ((cz)paramDrawable1).aS();; paramDrawable1 = null) {
      return new cz(paramDrawable1, paramDrawable2);
    }
  }
  
  private void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    switch (this.jV)
    {
    }
    TextView localTextView;
    do
    {
      ImageView localImageView;
      do
      {
        ImageManager.OnImageLoadedListener localOnImageLoadedListener;
        do
        {
          do
          {
            return;
          } while (paramBoolean2);
          localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.jX.get();
        } while (localOnImageLoadedListener == null);
        localOnImageLoadedListener.onImageLoaded(this.jS.uri, paramDrawable);
        return;
        localImageView = (ImageView)this.jY.get();
      } while (localImageView == null);
      a(localImageView, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
      return;
      localTextView = (TextView)this.jZ.get();
    } while (localTextView == null);
    a(localTextView, this.ka, paramDrawable, paramBoolean1, paramBoolean2);
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean2) && (!paramBoolean3)) {}
    for (int i = 1; (i != 0) && ((paramImageView instanceof da)); i = 0)
    {
      int k = ((da)paramImageView).aU();
      if ((this.jU == 0) || (k != this.jU)) {
        break;
      }
      return;
    }
    boolean bool = a(paramBoolean1, paramBoolean2);
    if (bool) {}
    for (Object localObject = a(paramImageView.getDrawable(), paramDrawable);; localObject = paramDrawable)
    {
      paramImageView.setImageDrawable((Drawable)localObject);
      da localda;
      Uri localUri;
      if ((paramImageView instanceof da))
      {
        localda = (da)paramImageView;
        if (!paramBoolean3) {
          break label157;
        }
        localUri = this.jS.uri;
        label115:
        localda.d(localUri);
        if (i == 0) {
          break label163;
        }
      }
      label157:
      label163:
      for (int j = this.jU;; j = 0)
      {
        localda.w(j);
        if (!bool) {
          break;
        }
        ((cz)localObject).startTransition(250);
        return;
        localUri = null;
        break label115;
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = a(paramBoolean1, paramBoolean2);
    Drawable[] arrayOfDrawable;
    Drawable localDrawable;
    if (ek.bO())
    {
      arrayOfDrawable = paramTextView.getCompoundDrawablesRelative();
      localDrawable = arrayOfDrawable[paramInt];
      if (!bool) {
        break label172;
      }
    }
    label130:
    label139:
    label148:
    label157:
    label172:
    for (Object localObject1 = a(localDrawable, paramDrawable);; localObject1 = paramDrawable)
    {
      Object localObject2;
      label50:
      Object localObject3;
      label59:
      Object localObject4;
      label68:
      Object localObject5;
      if (paramInt == 0)
      {
        localObject2 = localObject1;
        if (paramInt != 1) {
          break label130;
        }
        localObject3 = localObject1;
        if (paramInt != 2) {
          break label139;
        }
        localObject4 = localObject1;
        if (paramInt != 3) {
          break label148;
        }
        localObject5 = localObject1;
        label77:
        if (!ek.bO()) {
          break label157;
        }
        paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
      }
      for (;;)
      {
        if (bool) {
          ((cz)localObject1).startTransition(250);
        }
        return;
        arrayOfDrawable = paramTextView.getCompoundDrawables();
        break;
        localObject2 = arrayOfDrawable[0];
        break label50;
        localObject3 = arrayOfDrawable[1];
        break label59;
        localObject4 = arrayOfDrawable[2];
        break label68;
        localObject5 = arrayOfDrawable[3];
        break label77;
        paramTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
      }
    }
  }
  
  private boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.kb) && (!paramBoolean2) && ((!paramBoolean1) || (this.kc));
  }
  
  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    db.c(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  public void a(ImageView paramImageView)
  {
    db.c(paramImageView);
    this.jX = null;
    this.jY = new WeakReference(paramImageView);
    this.jZ = null;
    this.ka = -1;
    this.jV = 2;
    this.jW = paramImageView.hashCode();
  }
  
  public void a(ImageManager.OnImageLoadedListener paramOnImageLoadedListener)
  {
    db.c(paramOnImageLoadedListener);
    this.jX = new WeakReference(paramOnImageLoadedListener);
    this.jY = null;
    this.jZ = null;
    this.ka = -1;
    this.jV = 1;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramOnImageLoadedListener;
    arrayOfObject[1] = this.jS;
    this.jW = dl.hashCode(arrayOfObject);
  }
  
  void b(Context paramContext, boolean paramBoolean)
  {
    int i = this.jU;
    Drawable localDrawable = null;
    if (i != 0) {
      localDrawable = paramContext.getResources().getDrawable(this.jU);
    }
    a(localDrawable, paramBoolean, false, false);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof a)) {
      bool = false;
    }
    while ((this == paramObject) || (((a)paramObject).hashCode() == hashCode())) {
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.jW;
  }
  
  void r(Context paramContext)
  {
    int i = this.jT;
    Drawable localDrawable = null;
    if (i != 0) {
      localDrawable = paramContext.getResources().getDrawable(this.jT);
    }
    a(localDrawable, false, true, false);
  }
  
  public void v(int paramInt)
  {
    this.jU = paramInt;
  }
  
  public static final class a
  {
    public final Uri uri;
    
    public a(Uri paramUri)
    {
      this.uri = paramUri;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (!(paramObject instanceof a)) {
        bool = false;
      }
      while ((this == paramObject) || (((a)paramObject).hashCode() == hashCode())) {
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.uri;
      return dl.hashCode(arrayOfObject);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a
 * JD-Core Version:    0.7.0.1
 */