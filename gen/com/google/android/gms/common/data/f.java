package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class f<T>
  extends DataBuffer<T>
{
  private boolean jA = false;
  private ArrayList<Integer> jB;
  
  protected f(d paramd)
  {
    super(paramd);
  }
  
  private void aN()
  {
    for (;;)
    {
      int k;
      try
      {
        if (!this.jA)
        {
          int i = this.jf.getCount();
          this.jB = new ArrayList();
          if (i > 0)
          {
            this.jB.add(Integer.valueOf(0));
            String str = getPrimaryDataMarkerColumn();
            int j = this.jf.q(0);
            localObject2 = this.jf.c(str, 0, j);
            k = 1;
            if (k < i)
            {
              int m = this.jf.q(k);
              localObject3 = this.jf.c(str, k, m);
              if (((String)localObject3).equals(localObject2)) {
                break label148;
              }
              this.jB.add(Integer.valueOf(k));
              break label152;
            }
          }
          this.jA = true;
        }
        else
        {
          return;
        }
      }
      finally {}
      label148:
      Object localObject3 = localObject2;
      label152:
      k++;
      Object localObject2 = localObject3;
    }
  }
  
  private int u(int paramInt)
  {
    if ((paramInt < 0) || (paramInt == this.jB.size())) {
      return 0;
    }
    if (paramInt == -1 + this.jB.size()) {
      return this.jf.getCount() - ((Integer)this.jB.get(paramInt)).intValue();
    }
    return ((Integer)this.jB.get(paramInt + 1)).intValue() - ((Integer)this.jB.get(paramInt)).intValue();
  }
  
  protected abstract T a(int paramInt1, int paramInt2);
  
  public final T get(int paramInt)
  {
    aN();
    return a(t(paramInt), u(paramInt));
  }
  
  public int getCount()
  {
    aN();
    return this.jB.size();
  }
  
  protected abstract String getPrimaryDataMarkerColumn();
  
  int t(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jB.size())) {
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.jB.get(paramInt)).intValue();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.f
 * JD-Core Version:    0.7.0.1
 */