package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

public final class db
{
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(String.valueOf(paramObject));
    }
  }
  
  public static void c(Object paramObject)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("null reference");
    }
  }
  
  public static void k(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalStateException();
    }
  }
  
  public static void w(String paramString)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
      throw new IllegalStateException(paramString);
    }
  }
  
  public static void x(String paramString)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
      throw new IllegalStateException(paramString);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.db
 * JD-Core Version:    0.7.0.1
 */