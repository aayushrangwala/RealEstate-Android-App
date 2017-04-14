package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;

public abstract class b
{
  protected final d jf;
  protected final int ji;
  private final int jj;
  
  public b(d paramd, int paramInt)
  {
    this.jf = ((d)dm.e(paramd));
    if ((paramInt >= 0) && (paramInt < paramd.getCount())) {}
    for (boolean bool = true;; bool = false)
    {
      dm.k(bool);
      this.ji = paramInt;
      this.jj = paramd.q(this.ji);
      return;
    }
  }
  
  protected void a(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.jf.a(paramString, this.ji, this.jj, paramCharArrayBuffer);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (bool1)
    {
      b localb = (b)paramObject;
      boolean bool3 = dl.equal(Integer.valueOf(localb.ji), Integer.valueOf(this.ji));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = dl.equal(Integer.valueOf(localb.jj), Integer.valueOf(this.jj));
        bool2 = false;
        if (bool4)
        {
          d locald1 = localb.jf;
          d locald2 = this.jf;
          bool2 = false;
          if (locald1 == locald2) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  protected boolean getBoolean(String paramString)
  {
    return this.jf.d(paramString, this.ji, this.jj);
  }
  
  protected byte[] getByteArray(String paramString)
  {
    return this.jf.e(paramString, this.ji, this.jj);
  }
  
  protected int getInteger(String paramString)
  {
    return this.jf.b(paramString, this.ji, this.jj);
  }
  
  protected long getLong(String paramString)
  {
    return this.jf.a(paramString, this.ji, this.jj);
  }
  
  protected String getString(String paramString)
  {
    return this.jf.c(paramString, this.ji, this.jj);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.ji);
    arrayOfObject[1] = Integer.valueOf(this.jj);
    arrayOfObject[2] = this.jf;
    return dl.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    return !this.jf.isClosed();
  }
  
  protected Uri u(String paramString)
  {
    return this.jf.f(paramString, this.ji, this.jj);
  }
  
  protected boolean v(String paramString)
  {
    return this.jf.g(paramString, this.ji, this.jj);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.b
 * JD-Core Version:    0.7.0.1
 */