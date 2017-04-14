package com.google.android.gms.internal;

import java.io.IOException;

public final class gl
{
  private final byte[] buffer;
  private int position;
  private final int ux;
  
  private gl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = paramInt1;
    this.ux = (paramInt1 + paramInt2);
  }
  
  public static gl a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new gl(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static gl g(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void aD(int paramInt)
    throws IOException
  {
    b((byte)paramInt);
  }
  
  public void aE(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        aD(paramInt);
        return;
      }
      aD(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
  
  public void ab(String paramString)
    throws IOException
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    aE(arrayOfByte.length);
    h(arrayOfByte);
  }
  
  public void b(byte paramByte)
    throws IOException
  {
    if (this.position == this.ux) {
      throw new a(this.position, this.ux);
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = paramByte;
  }
  
  public void b(int paramInt, long paramLong)
    throws IOException
  {
    d(paramInt, 0);
    i(paramLong);
  }
  
  public void b(int paramInt, String paramString)
    throws IOException
  {
    d(paramInt, 2);
    ab(paramString);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.ux - this.position >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.position, paramInt2);
      this.position = (paramInt2 + this.position);
      return;
    }
    throw new a(this.position, this.ux);
  }
  
  public void d(int paramInt1, int paramInt2)
    throws IOException
  {
    aE(gm.e(paramInt1, paramInt2));
  }
  
  public int ec()
  {
    return this.ux - this.position;
  }
  
  public void h(byte[] paramArrayOfByte)
    throws IOException
  {
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void i(long paramLong)
    throws IOException
  {
    j(paramLong);
  }
  
  public void j(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        aD((int)paramLong);
        return;
      }
      aD(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public static class a
    extends IOException
  {
    a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gl
 * JD-Core Version:    0.7.0.1
 */