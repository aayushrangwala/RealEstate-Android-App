package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class dt
  implements SafeParcelable, dw.b<String, Integer>
{
  public static final du CREATOR = new du();
  private final int iM;
  private final HashMap<String, Integer> lu;
  private final HashMap<Integer, String> lv;
  private final ArrayList<a> lw;
  
  public dt()
  {
    this.iM = 1;
    this.lu = new HashMap();
    this.lv = new HashMap();
    this.lw = null;
  }
  
  dt(int paramInt, ArrayList<a> paramArrayList)
  {
    this.iM = paramInt;
    this.lu = new HashMap();
    this.lv = new HashMap();
    this.lw = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList<a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      c(locala.lx, locala.ly);
    }
  }
  
  public String a(Integer paramInteger)
  {
    String str = (String)this.lv.get(paramInteger);
    if ((str == null) && (this.lu.containsKey("gms_unknown"))) {
      str = "gms_unknown";
    }
    return str;
  }
  
  ArrayList<a> bm()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.lu.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new a(str, ((Integer)this.lu.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public int bn()
  {
    return 7;
  }
  
  public int bo()
  {
    return 0;
  }
  
  public dt c(String paramString, int paramInt)
  {
    this.lu.put(paramString, Integer.valueOf(paramInt));
    this.lv.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    du.a(this, paramParcel, paramInt);
  }
  
  public static final class a
    implements SafeParcelable
  {
    public static final dv CREATOR = new dv();
    final String lx;
    final int ly;
    final int versionCode;
    
    a(int paramInt1, String paramString, int paramInt2)
    {
      this.versionCode = paramInt1;
      this.lx = paramString;
      this.ly = paramInt2;
    }
    
    a(String paramString, int paramInt)
    {
      this.versionCode = 1;
      this.lx = paramString;
      this.ly = paramInt;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      dv.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dt
 * JD-Core Version:    0.7.0.1
 */