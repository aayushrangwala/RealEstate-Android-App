package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.fu;

public final class MomentBuffer
  extends DataBuffer<Moment>
{
  public MomentBuffer(d paramd)
  {
    super(paramd);
  }
  
  public Moment get(int paramInt)
  {
    return new fu(this.jf, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.MomentBuffer
 * JD-Core Version:    0.7.0.1
 */