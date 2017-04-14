package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fn
  implements SafeParcelable
{
  public static final fp CREATOR = new fp();
  private final int iM;
  private final String it;
  private final String[] rA;
  private final String rB;
  private final String rC;
  private final String rD;
  private final String rE;
  private final String[] ry;
  private final String[] rz;
  
  fn(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.iM = paramInt;
    this.it = paramString1;
    this.ry = paramArrayOfString1;
    this.rz = paramArrayOfString2;
    this.rA = paramArrayOfString3;
    this.rB = paramString2;
    this.rC = paramString3;
    this.rD = paramString4;
    this.rE = paramString5;
  }
  
  fn(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.iM = 1;
    this.it = paramString1;
    this.ry = paramArrayOfString1;
    this.rz = paramArrayOfString2;
    this.rA = paramArrayOfString3;
    this.rB = paramString2;
    this.rC = paramString3;
    this.rD = paramString4;
    this.rE = paramString5;
  }
  
  public String[] cZ()
  {
    return this.ry;
  }
  
  public String[] da()
  {
    return this.rz;
  }
  
  public String[] db()
  {
    return this.rA;
  }
  
  public String dc()
  {
    return this.rB;
  }
  
  public String dd()
  {
    return this.rC;
  }
  
  public String de()
  {
    return this.rD;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String df()
  {
    return this.rE;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fn)) {}
    fn localfn;
    do
    {
      return false;
      localfn = (fn)paramObject;
    } while ((this.iM != localfn.iM) || (!dl.equal(this.it, localfn.it)) || (!dl.equal(this.ry, localfn.ry)) || (!dl.equal(this.rz, localfn.rz)) || (!dl.equal(this.rA, localfn.rA)) || (!dl.equal(this.rB, localfn.rB)) || (!dl.equal(this.rC, localfn.rC)) || (!dl.equal(this.rD, localfn.rD)) || (!dl.equal(this.rE, localfn.rE)));
    return true;
  }
  
  public String getAccountName()
  {
    return this.it;
  }
  
  public int getVersionCode()
  {
    return this.iM;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = Integer.valueOf(this.iM);
    arrayOfObject[1] = this.it;
    arrayOfObject[2] = this.ry;
    arrayOfObject[3] = this.rz;
    arrayOfObject[4] = this.rA;
    arrayOfObject[5] = this.rB;
    arrayOfObject[6] = this.rC;
    arrayOfObject[7] = this.rD;
    arrayOfObject[8] = this.rE;
    return dl.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return dl.d(this).a("versionCode", Integer.valueOf(this.iM)).a("accountName", this.it).a("requestedScopes", this.ry).a("visibleActivities", this.rz).a("requiredFeatures", this.rA).a("packageNameForAuth", this.rB).a("callingPackageName", this.rC).a("applicationName", this.rD).a("clientId", this.rE).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fp.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fn
 * JD-Core Version:    0.7.0.1
 */