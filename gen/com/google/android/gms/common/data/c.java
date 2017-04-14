package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class c<T extends SafeParcelable>
  extends DataBuffer<T>
{
  private static final String[] jk = { "data" };
  private final Parcelable.Creator<T> jl;
  
  public c(d paramd, Parcelable.Creator<T> paramCreator)
  {
    super(paramd);
    this.jl = paramCreator;
  }
  
  public T p(int paramInt)
  {
    byte[] arrayOfByte = this.jf.e("data", paramInt, 0);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
    localParcel.setDataPosition(0);
    SafeParcelable localSafeParcelable = (SafeParcelable)this.jl.createFromParcel(localParcel);
    localParcel.recycle();
    return localSafeParcelable;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.7.0.1
 */