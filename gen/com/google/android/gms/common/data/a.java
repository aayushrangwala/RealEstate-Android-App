package com.google.android.gms.common.data;

import com.google.android.gms.internal.dm;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T>
  implements Iterator<T>
{
  private final DataBuffer<T> jg;
  private int jh;
  
  public a(DataBuffer<T> paramDataBuffer)
  {
    this.jg = ((DataBuffer)dm.e(paramDataBuffer));
    this.jh = -1;
  }
  
  public boolean hasNext()
  {
    return this.jh < -1 + this.jg.getCount();
  }
  
  public T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.jh);
    }
    DataBuffer localDataBuffer = this.jg;
    int i = 1 + this.jh;
    this.jh = i;
    return localDataBuffer.get(i);
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.a
 * JD-Core Version:    0.7.0.1
 */