package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.ek;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object jC = new Object();
  private static HashSet<Uri> jD = new HashSet();
  private static ImageManager jE;
  private static ImageManager jF;
  private final ExecutorService jG;
  private final b jH;
  private final Map<a, ImageReceiver> jI;
  private final Map<Uri, ImageReceiver> jJ;
  private final Context mContext;
  private final Handler mHandler;
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mHandler = new Handler(Looper.getMainLooper());
    this.jG = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      this.jH = new b(this.mContext);
      if (ek.bM()) {
        aO();
      }
    }
    for (;;)
    {
      this.jI = new HashMap();
      this.jJ = new HashMap();
      return;
      this.jH = null;
    }
  }
  
  private Bitmap a(a.a parama)
  {
    if (this.jH == null) {
      return null;
    }
    return (Bitmap)this.jH.get(parama);
  }
  
  public static ImageManager a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (jF == null) {
        jF = new ImageManager(paramContext, true);
      }
      return jF;
    }
    if (jE == null) {
      jE = new ImageManager(paramContext, false);
    }
    return jE;
  }
  
  private void aO()
  {
    this.mContext.registerComponentCallbacks(new e(this.jH));
  }
  
  private boolean b(a parama)
  {
    db.w("ImageManager.cleanupHashMaps() must be called in the main thread");
    if (parama.jV == 1) {
      return true;
    }
    ImageReceiver localImageReceiver = (ImageReceiver)this.jI.get(parama);
    if (localImageReceiver == null) {
      return true;
    }
    if (localImageReceiver.jL) {
      return false;
    }
    this.jI.remove(parama);
    localImageReceiver.d(parama);
    return true;
  }
  
  public static ImageManager create(Context paramContext)
  {
    return a(paramContext, false);
  }
  
  public void a(a parama)
  {
    db.w("ImageManager.loadImage() must be called in the main thread");
    boolean bool = b(parama);
    d locald = new d(parama);
    if (bool)
    {
      locald.run();
      return;
    }
    this.mHandler.post(locald);
  }
  
  public void loadImage(ImageView paramImageView, int paramInt)
  {
    a locala = new a(paramInt);
    locala.a(paramImageView);
    a(locala);
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri)
  {
    a locala = new a(paramUri);
    locala.a(paramImageView);
    a(locala);
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    a locala = new a(paramUri);
    locala.v(paramInt);
    locala.a(paramImageView);
    a(locala);
  }
  
  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    a locala = new a(paramUri);
    locala.a(paramOnImageLoadedListener);
    a(locala);
  }
  
  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    a locala = new a(paramUri);
    locala.v(paramInt);
    locala.a(paramOnImageLoadedListener);
    a(locala);
  }
  
  private final class ImageReceiver
    extends ResultReceiver
  {
    private final ArrayList<a> jK;
    boolean jL = false;
    private final Uri mUri;
    
    ImageReceiver(Uri paramUri)
    {
      super();
      this.mUri = paramUri;
      this.jK = new ArrayList();
    }
    
    public void aR()
    {
      Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
      localIntent.putExtra("com.google.android.gms.extras.uri", this.mUri);
      localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
      localIntent.putExtra("com.google.android.gms.extras.priority", 3);
      ImageManager.a(ImageManager.this).sendBroadcast(localIntent);
    }
    
    public void c(a parama)
    {
      if (!this.jL) {}
      for (boolean bool = true;; bool = false)
      {
        db.a(bool, "Cannot add an ImageRequest when mHandlingRequests is true");
        db.w("ImageReceiver.addImageRequest() must be called in the main thread");
        this.jK.add(parama);
        return;
      }
    }
    
    public void d(a parama)
    {
      if (!this.jL) {}
      for (boolean bool = true;; bool = false)
      {
        db.a(bool, "Cannot remove an ImageRequest when mHandlingRequests is true");
        db.w("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.jK.remove(parama);
        return;
      }
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.d(ImageManager.this).execute(new ImageManager.c(ImageManager.this, this.mUri, localParcelFileDescriptor));
    }
  }
  
  public static abstract interface OnImageLoadedListener
  {
    public abstract void onImageLoaded(Uri paramUri, Drawable paramDrawable);
  }
  
  private static final class a
  {
    static int a(ActivityManager paramActivityManager)
    {
      return paramActivityManager.getLargeMemoryClass();
    }
  }
  
  private static final class b
    extends dq<a.a, Bitmap>
  {
    public b(Context paramContext)
    {
      super();
    }
    
    private static int q(Context paramContext)
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      int i;
      if ((0x100000 & paramContext.getApplicationInfo().flags) != 0)
      {
        i = 1;
        if ((i == 0) || (!ek.bJ())) {
          break label55;
        }
      }
      label55:
      for (int j = ImageManager.a.a(localActivityManager);; j = localActivityManager.getMemoryClass())
      {
        return (int)(0.33F * (j * 1048576));
        i = 0;
        break;
      }
    }
    
    protected int a(a.a parama, Bitmap paramBitmap)
    {
      return paramBitmap.getHeight() * paramBitmap.getRowBytes();
    }
    
    protected void a(boolean paramBoolean, a.a parama, Bitmap paramBitmap1, Bitmap paramBitmap2)
    {
      super.entryRemoved(paramBoolean, parama, paramBitmap1, paramBitmap2);
    }
  }
  
  private final class c
    implements Runnable
  {
    private final ParcelFileDescriptor jN;
    private final Uri mUri;
    
    public c(Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.mUri = paramUri;
      this.jN = paramParcelFileDescriptor;
    }
    
    public void run()
    {
      db.x("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      ParcelFileDescriptor localParcelFileDescriptor = this.jN;
      Object localObject = null;
      boolean bool = false;
      if (localParcelFileDescriptor != null) {}
      try
      {
        Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(this.jN.getFileDescriptor());
        localObject = localBitmap;
        CountDownLatch localCountDownLatch;
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        try
        {
          for (;;)
          {
            this.jN.close();
            localCountDownLatch = new CountDownLatch(1);
            ImageManager.e(ImageManager.this).post(new ImageManager.f(ImageManager.this, this.mUri, localObject, bool, localCountDownLatch));
            try
            {
              localCountDownLatch.await();
              return;
            }
            catch (InterruptedException localInterruptedException)
            {
              Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
            }
            localOutOfMemoryError = localOutOfMemoryError;
            Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, localOutOfMemoryError);
            bool = true;
            localObject = null;
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.e("ImageManager", "closed failed", localIOException);
          }
        }
      }
    }
  }
  
  private final class d
    implements Runnable
  {
    private final a jO;
    
    public d(a parama)
    {
      this.jO = parama;
    }
    
    public void run()
    {
      db.w("LoadImageRunnable must be executed on the main thread");
      ImageManager.a(ImageManager.this, this.jO);
      a.a locala = this.jO.jS;
      if (locala.uri == null)
      {
        this.jO.b(ImageManager.a(ImageManager.this), true);
        return;
      }
      Bitmap localBitmap = ImageManager.a(ImageManager.this, locala);
      if (localBitmap != null)
      {
        this.jO.a(ImageManager.a(ImageManager.this), localBitmap, true);
        return;
      }
      this.jO.r(ImageManager.a(ImageManager.this));
      ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.b(ImageManager.this).get(locala.uri);
      if (localImageReceiver == null)
      {
        localImageReceiver = new ImageManager.ImageReceiver(ImageManager.this, locala.uri);
        ImageManager.b(ImageManager.this).put(locala.uri, localImageReceiver);
      }
      localImageReceiver.c(this.jO);
      if (this.jO.jV != 1) {
        ImageManager.c(ImageManager.this).put(this.jO, localImageReceiver);
      }
      synchronized (ImageManager.aP())
      {
        if (!ImageManager.aQ().contains(locala.uri))
        {
          ImageManager.aQ().add(locala.uri);
          localImageReceiver.aR();
        }
        return;
      }
    }
  }
  
  private static final class e
    implements ComponentCallbacks2
  {
    private final ImageManager.b jH;
    
    public e(ImageManager.b paramb)
    {
      this.jH = paramb;
    }
    
    public void onConfigurationChanged(Configuration paramConfiguration) {}
    
    public void onLowMemory()
    {
      this.jH.evictAll();
    }
    
    public void onTrimMemory(int paramInt)
    {
      if (paramInt >= 60) {
        this.jH.evictAll();
      }
      while (paramInt < 20) {
        return;
      }
      this.jH.trimToSize(this.jH.size() / 2);
    }
  }
  
  private final class f
    implements Runnable
  {
    private final Bitmap jP;
    private final CountDownLatch jQ;
    private boolean jR;
    private final Uri mUri;
    
    public f(Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
    {
      this.mUri = paramUri;
      this.jP = paramBitmap;
      this.jR = paramBoolean;
      this.jQ = paramCountDownLatch;
    }
    
    private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
    {
      paramImageReceiver.jL = true;
      ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
      int i = localArrayList.size();
      int j = 0;
      if (j < i)
      {
        a locala = (a)localArrayList.get(j);
        if (paramBoolean) {
          locala.a(ImageManager.a(ImageManager.this), this.jP, false);
        }
        for (;;)
        {
          if (locala.jV != 1) {
            ImageManager.c(ImageManager.this).remove(locala);
          }
          j++;
          break;
          locala.b(ImageManager.a(ImageManager.this), false);
        }
      }
      paramImageReceiver.jL = false;
    }
    
    public void run()
    {
      db.w("OnBitmapLoadedRunnable must be executed in the main thread");
      boolean bool;
      if (this.jP != null) {
        bool = true;
      }
      while (ImageManager.f(ImageManager.this) != null) {
        if (this.jR)
        {
          ImageManager.f(ImageManager.this).evictAll();
          System.gc();
          this.jR = false;
          ImageManager.e(ImageManager.this).post(this);
          return;
          bool = false;
        }
        else if (bool)
        {
          ImageManager.f(ImageManager.this).put(new a.a(this.mUri), this.jP);
        }
      }
      ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.b(ImageManager.this).remove(this.mUri);
      if (localImageReceiver != null) {
        a(localImageReceiver, bool);
      }
      this.jQ.countDown();
      synchronized (ImageManager.aP())
      {
        ImageManager.aQ().remove(this.mUri);
        return;
      }
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.7.0.1
 */