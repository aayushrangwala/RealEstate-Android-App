package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class DrawableCompat
{
  static final DrawableImpl IMPL = new BaseDrawableImpl();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      IMPL = new HoneycombDrawableImpl();
      return;
    }
  }
  
  public static void jumpToCurrentState(Drawable paramDrawable)
  {
    IMPL.jumpToCurrentState(paramDrawable);
  }
  
  static class BaseDrawableImpl
    implements DrawableCompat.DrawableImpl
  {
    public void jumpToCurrentState(Drawable paramDrawable) {}
  }
  
  static abstract interface DrawableImpl
  {
    public abstract void jumpToCurrentState(Drawable paramDrawable);
  }
  
  static class HoneycombDrawableImpl
    implements DrawableCompat.DrawableImpl
  {
    public void jumpToCurrentState(Drawable paramDrawable)
    {
      DrawableCompatHoneycomb.jumpToCurrentState(paramDrawable);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.graphics.drawable.DrawableCompat
 * JD-Core Version:    0.7.0.1
 */