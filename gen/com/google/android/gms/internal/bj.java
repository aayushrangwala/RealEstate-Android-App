package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class bj
  extends FrameLayout
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener
{
  private final cq fG;
  private final MediaController gb;
  private final a gc;
  private final VideoView gd;
  private long ge;
  private String gf;
  
  public bj(Context paramContext, cq paramcq)
  {
    super(paramContext);
    this.fG = paramcq;
    this.gd = new VideoView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    addView(this.gd, localLayoutParams);
    this.gb = new MediaController(paramContext);
    this.gc = new a(this);
    this.gc.ab();
    this.gd.setOnCompletionListener(this);
    this.gd.setOnPreparedListener(this);
    this.gd.setOnErrorListener(this);
  }
  
  private static void a(cq paramcq, String paramString)
  {
    a(paramcq, paramString, new HashMap(1));
  }
  
  public static void a(cq paramcq, String paramString1, String paramString2)
  {
    int i;
    if (paramString2 == null)
    {
      i = 1;
      if (i == 0) {
        break label60;
      }
    }
    label60:
    for (int j = 2;; j = 3)
    {
      HashMap localHashMap = new HashMap(j);
      localHashMap.put("what", paramString1);
      if (i == 0) {
        localHashMap.put("extra", paramString2);
      }
      a(paramcq, "error", localHashMap);
      return;
      i = 0;
      break;
    }
  }
  
  private static void a(cq paramcq, String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put(paramString2, paramString3);
    a(paramcq, paramString1, localHashMap);
  }
  
  private static void a(cq paramcq, String paramString, Map<String, String> paramMap)
  {
    paramMap.put("event", paramString);
    paramcq.a("onVideoEvent", paramMap);
  }
  
  public void Z()
  {
    if (!TextUtils.isEmpty(this.gf))
    {
      this.gd.setVideoPath(this.gf);
      return;
    }
    a(this.fG, "no_src", null);
  }
  
  public void aa()
  {
    long l = this.gd.getCurrentPosition();
    if (this.ge != l)
    {
      float f = (float)l / 1000.0F;
      a(this.fG, "timeupdate", "time", String.valueOf(f));
      this.ge = l;
    }
  }
  
  public void b(MotionEvent paramMotionEvent)
  {
    this.gd.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void destroy()
  {
    this.gc.cancel();
    this.gd.stopPlayback();
  }
  
  public void f(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.gd.setMediaController(this.gb);
      return;
    }
    this.gb.hide();
    this.gd.setMediaController(null);
  }
  
  public void i(String paramString)
  {
    this.gf = paramString;
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    a(this.fG, "ended");
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    a(this.fG, String.valueOf(paramInt1), String.valueOf(paramInt2));
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    float f = this.gd.getDuration() / 1000.0F;
    a(this.fG, "canplaythrough", "duration", String.valueOf(f));
  }
  
  public void pause()
  {
    this.gd.pause();
  }
  
  public void play()
  {
    this.gd.start();
  }
  
  public void seekTo(int paramInt)
  {
    this.gd.seekTo(paramInt);
  }
  
  private static final class a
  {
    private final Runnable el;
    private volatile boolean gg = false;
    
    public a(final bj parambj)
    {
      this.el = new Runnable()
      {
        private final WeakReference<bj> gh = new WeakReference(parambj);
        
        public void run()
        {
          bj localbj = (bj)this.gh.get();
          if ((!bj.a.a(bj.a.this)) && (localbj != null))
          {
            localbj.aa();
            bj.a.this.ab();
          }
        }
      };
    }
    
    public void ab()
    {
      cm.hO.postDelayed(this.el, 250L);
    }
    
    public void cancel()
    {
      this.gg = true;
      cm.hO.removeCallbacks(this.el);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bj
 * JD-Core Version:    0.7.0.1
 */