package com.google.android.gms.internal;

public class gk
{
  private final byte[] uu = new byte[256];
  private int uv;
  private int uw;
  
  public gk(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++) {
      this.uu[i] = ((byte)i);
    }
    int j = 0;
    for (int k = 0; k < 256; k++)
    {
      j = 0xFF & j + this.uu[k] + paramArrayOfByte[(k % paramArrayOfByte.length)];
      int m = this.uu[k];
      this.uu[k] = this.uu[j];
      this.uu[j] = m;
    }
    this.uv = 0;
    this.uw = 0;
  }
  
  public void f(byte[] paramArrayOfByte)
  {
    int i = this.uv;
    int j = this.uw;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = 0xFF & i + 1;
      j = 0xFF & j + this.uu[i];
      int m = this.uu[i];
      this.uu[i] = this.uu[j];
      this.uu[j] = m;
      paramArrayOfByte[k] = ((byte)(paramArrayOfByte[k] ^ this.uu[(0xFF & this.uu[i] + this.uu[j])]));
    }
    this.uv = i;
    this.uw = j;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gk
 * JD-Core Version:    0.7.0.1
 */