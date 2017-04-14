package com.google.android.gms.internal;

import java.io.IOException;

class m
  implements k
{
  private gl dD;
  private byte[] dE;
  private final int dF;
  
  public m(int paramInt)
  {
    this.dF = paramInt;
    reset();
  }
  
  public void b(int paramInt, long paramLong)
    throws IOException
  {
    this.dD.b(paramInt, paramLong);
  }
  
  public void b(int paramInt, String paramString)
    throws IOException
  {
    this.dD.b(paramInt, paramString);
  }
  
  public byte[] h()
    throws IOException
  {
    int i = this.dD.ec();
    if (i < 0) {
      throw new IOException();
    }
    if (i == 0) {
      return this.dE;
    }
    byte[] arrayOfByte = new byte[this.dE.length - i];
    System.arraycopy(this.dE, 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public void reset()
  {
    this.dE = new byte[this.dF];
    this.dD = gl.g(this.dE);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.m
 * JD-Core Version:    0.7.0.1
 */