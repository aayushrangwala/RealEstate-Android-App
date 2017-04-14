package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public abstract class f
  extends e
{
  private static Method dk;
  private static Method dl;
  private static Method dm;
  private static Method dn;
  private static Method jdField_do;
  private static Method dp;
  private static String dq;
  private static l dr;
  static boolean ds = false;
  private static long startTime = 0L;
  
  protected f(Context paramContext, j paramj, k paramk)
  {
    super(paramContext, paramj, paramk);
  }
  
  static String a(Context paramContext, j paramj)
    throws f.a
  {
    if (dm == null) {
      throw new a();
    }
    try
    {
      localByteBuffer = (ByteBuffer)dm.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null) {
        throw new a();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ByteBuffer localByteBuffer;
      throw new a(localIllegalAccessException);
      String str = paramj.a(localByteBuffer.array(), true);
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
  }
  
  static ArrayList<Long> a(MotionEvent paramMotionEvent, DisplayMetrics paramDisplayMetrics)
    throws f.a
  {
    if ((dn == null) || (paramMotionEvent == null)) {
      throw new a();
    }
    try
    {
      ArrayList localArrayList = (ArrayList)dn.invoke(null, new Object[] { paramMotionEvent, paramDisplayMetrics });
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
  }
  
  /* Error */
  protected static void a(String paramString, Context paramContext, j paramj)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 25	com/google/android/gms/internal/f:ds	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifne +36 -> 46
    //   13: new 73	com/google/android/gms/internal/l
    //   16: dup
    //   17: aload_2
    //   18: aconst_null
    //   19: invokespecial 76	com/google/android/gms/internal/l:<init>	(Lcom/google/android/gms/internal/j;Ljava/security/SecureRandom;)V
    //   22: putstatic 78	com/google/android/gms/internal/f:dr	Lcom/google/android/gms/internal/l;
    //   25: aload_0
    //   26: putstatic 80	com/google/android/gms/internal/f:dq	Ljava/lang/String;
    //   29: aload_1
    //   30: invokestatic 84	com/google/android/gms/internal/f:e	(Landroid/content/Context;)V
    //   33: invokestatic 87	com/google/android/gms/internal/f:e	()Ljava/lang/Long;
    //   36: invokevirtual 93	java/lang/Long:longValue	()J
    //   39: putstatic 23	com/google/android/gms/internal/f:startTime	J
    //   42: iconst_1
    //   43: putstatic 25	com/google/android/gms/internal/f:ds	Z
    //   46: ldc 2
    //   48: monitorexit
    //   49: return
    //   50: astore_3
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    //   56: astore 6
    //   58: goto -12 -> 46
    //   61: astore 5
    //   63: goto -17 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	paramString	String
    //   0	66	1	paramContext	Context
    //   0	66	2	paramj	j
    //   50	5	3	localObject	Object
    //   6	3	4	bool	boolean
    //   61	1	5	locala	a
    //   56	1	6	localUnsupportedOperationException	java.lang.UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   3	8	50	finally
    //   13	46	50	finally
    //   13	46	56	java/lang/UnsupportedOperationException
    //   13	46	61	com/google/android/gms/internal/f$a
  }
  
  static String b(Context paramContext, j paramj)
    throws f.a
  {
    if (dp == null) {
      throw new a();
    }
    try
    {
      localByteBuffer = (ByteBuffer)dp.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null) {
        throw new a();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ByteBuffer localByteBuffer;
      throw new a(localIllegalAccessException);
      String str = paramj.a(localByteBuffer.array(), true);
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
  }
  
  private static String b(byte[] paramArrayOfByte, String paramString)
    throws f.a
  {
    try
    {
      String str = new String(dr.c(paramArrayOfByte, paramString), "UTF-8");
      return str;
    }
    catch (l.a locala)
    {
      throw new a(locala);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new a(localUnsupportedEncodingException);
    }
  }
  
  static String d()
    throws f.a
  {
    if (dq == null) {
      throw new a();
    }
    return dq;
  }
  
  static String d(Context paramContext)
    throws f.a
  {
    if (jdField_do == null) {
      throw new a();
    }
    String str;
    try
    {
      str = (String)jdField_do.invoke(null, new Object[] { paramContext });
      if (str == null) {
        throw new a();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
    return str;
  }
  
  static Long e()
    throws f.a
  {
    if (dk == null) {
      throw new a();
    }
    try
    {
      Long localLong = (Long)dk.invoke(null, new Object[0]);
      return localLong;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
  }
  
  private static void e(Context paramContext)
    throws f.a
  {
    try
    {
      arrayOfByte1 = dr.b(n.getKey());
      arrayOfByte2 = dr.c(arrayOfByte1, n.i());
      localFile1 = paramContext.getCacheDir();
      if (localFile1 == null)
      {
        localFile1 = paramContext.getDir("dex", 0);
        if (localFile1 == null) {
          throw new a();
        }
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      File localFile1;
      throw new a(localFileNotFoundException);
      File localFile2 = File.createTempFile("ads", ".jar", localFile1);
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
      localFileOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      localFileOutputStream.close();
      DexClassLoader localDexClassLoader = new DexClassLoader(localFile2.getAbsolutePath(), localFile1.getAbsolutePath(), null, paramContext.getClassLoader());
      Class localClass1 = localDexClassLoader.loadClass(b(arrayOfByte1, n.j()));
      Class localClass2 = localDexClassLoader.loadClass(b(arrayOfByte1, n.p()));
      Class localClass3 = localDexClassLoader.loadClass(b(arrayOfByte1, n.n()));
      Class localClass4 = localDexClassLoader.loadClass(b(arrayOfByte1, n.t()));
      Class localClass5 = localDexClassLoader.loadClass(b(arrayOfByte1, n.l()));
      Class localClass6 = localDexClassLoader.loadClass(b(arrayOfByte1, n.r()));
      dk = localClass1.getMethod(b(arrayOfByte1, n.k()), new Class[0]);
      dl = localClass2.getMethod(b(arrayOfByte1, n.q()), new Class[0]);
      dm = localClass3.getMethod(b(arrayOfByte1, n.o()), new Class[] { Context.class });
      dn = localClass4.getMethod(b(arrayOfByte1, n.u()), new Class[] { MotionEvent.class, DisplayMetrics.class });
      jdField_do = localClass5.getMethod(b(arrayOfByte1, n.m()), new Class[] { Context.class });
      dp = localClass6.getMethod(b(arrayOfByte1, n.s()), new Class[] { Context.class });
      String str = localFile2.getName();
      localFile2.delete();
      new File(localFile1, str.replace(".jar", ".dex")).delete();
      return;
    }
    catch (IOException localIOException)
    {
      throw new a(localIOException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a(localClassNotFoundException);
    }
    catch (l.a locala)
    {
      throw new a(locala);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new a(localNoSuchMethodException);
    }
    catch (NullPointerException localNullPointerException)
    {
      throw new a(localNullPointerException);
    }
  }
  
  static String f()
    throws f.a
  {
    if (dl == null) {
      throw new a();
    }
    try
    {
      String str = (String)dl.invoke(null, new Object[0]);
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new a(localInvocationTargetException);
    }
  }
  
  /* Error */
  protected void b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokestatic 259	com/google/android/gms/internal/f:f	()Ljava/lang/String;
    //   5: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   8: aload_0
    //   9: iconst_2
    //   10: invokestatic 264	com/google/android/gms/internal/f:d	()Ljava/lang/String;
    //   13: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   16: aload_0
    //   17: bipush 25
    //   19: invokestatic 87	com/google/android/gms/internal/f:e	()Ljava/lang/Long;
    //   22: invokevirtual 93	java/lang/Long:longValue	()J
    //   25: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   28: aload_0
    //   29: bipush 24
    //   31: aload_1
    //   32: invokestatic 269	com/google/android/gms/internal/f:d	(Landroid/content/Context;)Ljava/lang/String;
    //   35: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   38: return
    //   39: astore 6
    //   41: return
    //   42: astore 5
    //   44: return
    //   45: astore 4
    //   47: goto -19 -> 28
    //   50: astore_3
    //   51: goto -35 -> 16
    //   54: astore_2
    //   55: goto -47 -> 8
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	f
    //   0	58	1	paramContext	Context
    //   54	1	2	locala1	a
    //   50	1	3	locala2	a
    //   45	1	4	locala3	a
    //   42	1	5	locala4	a
    //   39	1	6	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   0	8	39	java/io/IOException
    //   8	16	39	java/io/IOException
    //   16	28	39	java/io/IOException
    //   28	38	39	java/io/IOException
    //   28	38	42	com/google/android/gms/internal/f$a
    //   16	28	45	com/google/android/gms/internal/f$a
    //   8	16	50	com/google/android/gms/internal/f$a
    //   0	8	54	com/google/android/gms/internal/f$a
  }
  
  /* Error */
  protected void c(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: invokestatic 264	com/google/android/gms/internal/f:d	()Ljava/lang/String;
    //   5: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   8: aload_0
    //   9: iconst_1
    //   10: invokestatic 259	com/google/android/gms/internal/f:f	()Ljava/lang/String;
    //   13: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   16: invokestatic 87	com/google/android/gms/internal/f:e	()Ljava/lang/Long;
    //   19: invokevirtual 93	java/lang/Long:longValue	()J
    //   22: lstore 10
    //   24: aload_0
    //   25: bipush 25
    //   27: lload 10
    //   29: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   32: getstatic 23	com/google/android/gms/internal/f:startTime	J
    //   35: lconst_0
    //   36: lcmp
    //   37: ifeq +24 -> 61
    //   40: aload_0
    //   41: bipush 17
    //   43: lload 10
    //   45: getstatic 23	com/google/android/gms/internal/f:startTime	J
    //   48: lsub
    //   49: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   52: aload_0
    //   53: bipush 23
    //   55: getstatic 23	com/google/android/gms/internal/f:startTime	J
    //   58: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   61: aload_0
    //   62: getfield 273	com/google/android/gms/internal/f:dg	Landroid/view/MotionEvent;
    //   65: aload_0
    //   66: getfield 277	com/google/android/gms/internal/f:dh	Landroid/util/DisplayMetrics;
    //   69: invokestatic 279	com/google/android/gms/internal/f:a	(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;
    //   72: astore 9
    //   74: aload_0
    //   75: bipush 14
    //   77: aload 9
    //   79: iconst_0
    //   80: invokevirtual 283	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   83: checkcast 89	java/lang/Long
    //   86: invokevirtual 93	java/lang/Long:longValue	()J
    //   89: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   92: aload_0
    //   93: bipush 15
    //   95: aload 9
    //   97: iconst_1
    //   98: invokevirtual 283	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   101: checkcast 89	java/lang/Long
    //   104: invokevirtual 93	java/lang/Long:longValue	()J
    //   107: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   110: aload 9
    //   112: invokevirtual 287	java/util/ArrayList:size	()I
    //   115: iconst_3
    //   116: if_icmplt +21 -> 137
    //   119: aload_0
    //   120: bipush 16
    //   122: aload 9
    //   124: iconst_2
    //   125: invokevirtual 283	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   128: checkcast 89	java/lang/Long
    //   131: invokevirtual 93	java/lang/Long:longValue	()J
    //   134: invokevirtual 267	com/google/android/gms/internal/f:a	(IJ)V
    //   137: aload_0
    //   138: bipush 27
    //   140: aload_1
    //   141: aload_0
    //   142: getfield 291	com/google/android/gms/internal/f:di	Lcom/google/android/gms/internal/j;
    //   145: invokestatic 293	com/google/android/gms/internal/f:a	(Landroid/content/Context;Lcom/google/android/gms/internal/j;)Ljava/lang/String;
    //   148: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   151: aload_0
    //   152: bipush 29
    //   154: aload_1
    //   155: aload_0
    //   156: getfield 291	com/google/android/gms/internal/f:di	Lcom/google/android/gms/internal/j;
    //   159: invokestatic 295	com/google/android/gms/internal/f:b	(Landroid/content/Context;Lcom/google/android/gms/internal/j;)Ljava/lang/String;
    //   162: invokevirtual 262	com/google/android/gms/internal/f:a	(ILjava/lang/String;)V
    //   165: return
    //   166: astore 8
    //   168: return
    //   169: astore 7
    //   171: return
    //   172: astore 6
    //   174: goto -23 -> 151
    //   177: astore 5
    //   179: goto -42 -> 137
    //   182: astore 4
    //   184: goto -123 -> 61
    //   187: astore_3
    //   188: goto -172 -> 16
    //   191: astore_2
    //   192: goto -184 -> 8
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	this	f
    //   0	195	1	paramContext	Context
    //   191	1	2	locala1	a
    //   187	1	3	locala2	a
    //   182	1	4	locala3	a
    //   177	1	5	locala4	a
    //   172	1	6	locala5	a
    //   169	1	7	locala6	a
    //   166	1	8	localIOException	IOException
    //   72	51	9	localArrayList	ArrayList
    //   22	22	10	l	long
    // Exception table:
    //   from	to	target	type
    //   0	8	166	java/io/IOException
    //   8	16	166	java/io/IOException
    //   16	61	166	java/io/IOException
    //   61	137	166	java/io/IOException
    //   137	151	166	java/io/IOException
    //   151	165	166	java/io/IOException
    //   151	165	169	com/google/android/gms/internal/f$a
    //   137	151	172	com/google/android/gms/internal/f$a
    //   61	137	177	com/google/android/gms/internal/f$a
    //   16	61	182	com/google/android/gms/internal/f$a
    //   8	16	187	com/google/android/gms/internal/f$a
    //   0	8	191	com/google/android/gms/internal/f$a
  }
  
  static class a
    extends Exception
  {
    public a() {}
    
    public a(Throwable paramThrowable)
    {
      super();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.f
 * JD-Core Version:    0.7.0.1
 */