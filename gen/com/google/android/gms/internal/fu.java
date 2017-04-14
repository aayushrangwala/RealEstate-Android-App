package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class fu
  extends b
  implements Moment
{
  private fs sI;
  
  public fu(d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  private fs dC()
  {
    try
    {
      if (this.sI == null)
      {
        byte[] arrayOfByte = getByteArray("momentImpl");
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        this.sI = fs.CREATOR.C(localParcel);
        localParcel.recycle();
      }
      return this.sI;
    }
    finally {}
  }
  
  public fs dB()
  {
    return dC();
  }
  
  public String getId()
  {
    return dC().getId();
  }
  
  public ItemScope getResult()
  {
    return dC().getResult();
  }
  
  public String getStartDate()
  {
    return dC().getStartDate();
  }
  
  public ItemScope getTarget()
  {
    return dC().getTarget();
  }
  
  public String getType()
  {
    return dC().getType();
  }
  
  public boolean hasId()
  {
    return dC().hasId();
  }
  
  public boolean hasResult()
  {
    return dC().hasId();
  }
  
  public boolean hasStartDate()
  {
    return dC().hasStartDate();
  }
  
  public boolean hasTarget()
  {
    return dC().hasTarget();
  }
  
  public boolean hasType()
  {
    return dC().hasType();
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fu
 * JD-Core Version:    0.7.0.1
 */