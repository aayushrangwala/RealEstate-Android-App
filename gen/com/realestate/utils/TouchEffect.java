package com.realestate.utils;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class TouchEffect
  implements View.OnTouchListener
{
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      Drawable localDrawable2 = paramView.getBackground();
      localDrawable2.mutate();
      localDrawable2.setAlpha(150);
      paramView.setBackgroundDrawable(localDrawable2);
    }
    for (;;)
    {
      return false;
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        Drawable localDrawable1 = paramView.getBackground();
        localDrawable1.setAlpha(255);
        paramView.setBackgroundDrawable(localDrawable1);
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.utils.TouchEffect
 * JD-Core Version:    0.7.0.1
 */