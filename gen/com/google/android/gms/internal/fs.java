package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fs
  extends dw
  implements SafeParcelable, Moment
{
  public static final ft CREATOR = new ft();
  private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
  private final int iM;
  private final Set<Integer> rI;
  private String sD;
  private fq sG;
  private fq sH;
  private String sm;
  private String sx;
  
  static
  {
    rH.put("id", dw.a.g("id", 2));
    rH.put("result", dw.a.a("result", 4, fq.class));
    rH.put("startDate", dw.a.g("startDate", 5));
    rH.put("target", dw.a.a("target", 6, fq.class));
    rH.put("type", dw.a.g("type", 7));
  }
  
  public fs()
  {
    this.iM = 1;
    this.rI = new HashSet();
  }
  
  fs(Set<Integer> paramSet, int paramInt, String paramString1, fq paramfq1, String paramString2, fq paramfq2, String paramString3)
  {
    this.rI = paramSet;
    this.iM = paramInt;
    this.sm = paramString1;
    this.sG = paramfq1;
    this.sx = paramString2;
    this.sH = paramfq2;
    this.sD = paramString3;
  }
  
  public fs(Set<Integer> paramSet, String paramString1, fq paramfq1, String paramString2, fq paramfq2, String paramString3)
  {
    this.rI = paramSet;
    this.iM = 1;
    this.sm = paramString1;
    this.sG = paramfq1;
    this.sx = paramString2;
    this.sH = paramfq2;
    this.sD = paramString3;
  }
  
  protected Object D(String paramString)
  {
    return null;
  }
  
  protected boolean E(String paramString)
  {
    return false;
  }
  
  protected boolean a(dw.a parama)
  {
    return this.rI.contains(Integer.valueOf(parama.bw()));
  }
  
  protected Object b(dw.a parama)
  {
    switch (parama.bw())
    {
    case 3: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
    case 2: 
      return this.sm;
    case 4: 
      return this.sG;
    case 5: 
      return this.sx;
    case 6: 
      return this.sH;
    }
    return this.sD;
  }
  
  public HashMap<String, dw.a<?, ?>> bp()
  {
    return rH;
  }
  
  fq dA()
  {
    return this.sH;
  }
  
  public fs dB()
  {
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  Set<Integer> di()
  {
    return this.rI;
  }
  
  fq dz()
  {
    return this.sG;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fs)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    fs localfs = (fs)paramObject;
    Iterator localIterator = rH.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localfs.a(locala))
        {
          if (!b(locala).equals(localfs.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localfs.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  public String getId()
  {
    return this.sm;
  }
  
  public ItemScope getResult()
  {
    return this.sG;
  }
  
  public String getStartDate()
  {
    return this.sx;
  }
  
  public ItemScope getTarget()
  {
    return this.sH;
  }
  
  public String getType()
  {
    return this.sD;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean hasId()
  {
    return this.rI.contains(Integer.valueOf(2));
  }
  
  public boolean hasResult()
  {
    return this.rI.contains(Integer.valueOf(4));
  }
  
  public boolean hasStartDate()
  {
    return this.rI.contains(Integer.valueOf(5));
  }
  
  public boolean hasTarget()
  {
    return this.rI.contains(Integer.valueOf(6));
  }
  
  public boolean hasType()
  {
    return this.rI.contains(Integer.valueOf(7));
  }
  
  public int hashCode()
  {
    Iterator localIterator = rH.values().iterator();
    int i = 0;
    dw.a locala;
    if (localIterator.hasNext())
    {
      locala = (dw.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int j = i + locala.bw() + b(locala).hashCode();; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ft.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fs
 * JD-Core Version:    0.7.0.1
 */