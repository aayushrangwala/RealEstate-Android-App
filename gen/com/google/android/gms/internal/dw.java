package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class dw
{
  private void a(StringBuilder paramStringBuilder, a parama, Object paramObject)
  {
    if (parama.bn() == 11)
    {
      paramStringBuilder.append(((dw)parama.bx().cast(paramObject)).toString());
      return;
    }
    if (parama.bn() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(ei.I((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private void a(StringBuilder paramStringBuilder, a parama, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        a(paramStringBuilder, parama, localObject);
      }
      i++;
    }
    paramStringBuilder.append("]");
  }
  
  protected abstract Object D(String paramString);
  
  protected abstract boolean E(String paramString);
  
  protected boolean F(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }
  
  protected boolean G(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }
  
  protected <O, I> I a(a<I, O> parama, Object paramObject)
  {
    if (a.c(parama) != null) {
      paramObject = parama.f(paramObject);
    }
    return paramObject;
  }
  
  protected boolean a(a parama)
  {
    if (parama.bo() == 11)
    {
      if (parama.bu()) {
        return G(parama.bv());
      }
      return F(parama.bv());
    }
    return E(parama.bv());
  }
  
  protected Object b(a parama)
  {
    boolean bool = true;
    String str1 = parama.bv();
    if (parama.bx() != null)
    {
      if (D(parama.bv()) == null)
      {
        dm.a(bool, "Concrete field shouldn't be value object: " + parama.bv());
        if (!parama.bu()) {
          break label83;
        }
      }
      label83:
      for (HashMap localHashMap = br();; localHashMap = bq())
      {
        if (localHashMap == null) {
          break label92;
        }
        return localHashMap.get(str1);
        bool = false;
        break;
      }
      try
      {
        label92:
        String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
        return localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    return D(parama.bv());
  }
  
  public abstract HashMap<String, a<?, ?>> bp();
  
  public HashMap<String, Object> bq()
  {
    return null;
  }
  
  public HashMap<String, Object> br()
  {
    return null;
  }
  
  public String toString()
  {
    HashMap localHashMap = bp();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a locala = (a)localHashMap.get(str);
      if (a(locala))
      {
        Object localObject = a(locala, b(locala));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label135;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label135:
        switch (locala.bo())
        {
        default: 
          if (locala.bt()) {
            a(localStringBuilder, locala, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(ef.b((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(ef.c((byte[])localObject)).append("\"");
          break;
        case 10: 
          ej.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, locala, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
  
  public static class a<I, O>
    implements SafeParcelable
  {
    public static final dx CREATOR = new dx();
    private final int iM;
    protected final boolean lA;
    protected final int lB;
    protected final boolean lC;
    protected final String lD;
    protected final int lE;
    protected final Class<? extends dw> lF;
    protected final String lG;
    private dz lH;
    private dw.b<I, O> lI;
    protected final int lz;
    
    a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, dr paramdr)
    {
      this.iM = paramInt1;
      this.lz = paramInt2;
      this.lA = paramBoolean1;
      this.lB = paramInt3;
      this.lC = paramBoolean2;
      this.lD = paramString1;
      this.lE = paramInt4;
      if (paramString2 == null) {
        this.lF = null;
      }
      for (this.lG = null; paramdr == null; this.lG = paramString2)
      {
        this.lI = null;
        return;
        this.lF = ec.class;
      }
      this.lI = paramdr.bl();
    }
    
    protected a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class<? extends dw> paramClass, dw.b<I, O> paramb)
    {
      this.iM = 1;
      this.lz = paramInt1;
      this.lA = paramBoolean1;
      this.lB = paramInt2;
      this.lC = paramBoolean2;
      this.lD = paramString;
      this.lE = paramInt3;
      this.lF = paramClass;
      if (paramClass == null) {}
      for (this.lG = null;; this.lG = paramClass.getCanonicalName())
      {
        this.lI = paramb;
        return;
      }
    }
    
    public static a a(String paramString, int paramInt, dw.b<?, ?> paramb, boolean paramBoolean)
    {
      return new a(paramb.bn(), paramBoolean, paramb.bo(), false, paramString, paramInt, null, paramb);
    }
    
    public static <T extends dw> a<T, T> a(String paramString, int paramInt, Class<T> paramClass)
    {
      return new a(11, false, 11, false, paramString, paramInt, paramClass, null);
    }
    
    public static <T extends dw> a<ArrayList<T>, ArrayList<T>> b(String paramString, int paramInt, Class<T> paramClass)
    {
      return new a(11, true, 11, true, paramString, paramInt, paramClass, null);
    }
    
    public static a<Integer, Integer> d(String paramString, int paramInt)
    {
      return new a(0, false, 0, false, paramString, paramInt, null, null);
    }
    
    public static a<Double, Double> e(String paramString, int paramInt)
    {
      return new a(4, false, 4, false, paramString, paramInt, null, null);
    }
    
    public static a<Boolean, Boolean> f(String paramString, int paramInt)
    {
      return new a(6, false, 6, false, paramString, paramInt, null, null);
    }
    
    public static a<String, String> g(String paramString, int paramInt)
    {
      return new a(7, false, 7, false, paramString, paramInt, null, null);
    }
    
    public static a<ArrayList<String>, ArrayList<String>> h(String paramString, int paramInt)
    {
      return new a(7, true, 7, true, paramString, paramInt, null, null);
    }
    
    public void a(dz paramdz)
    {
      this.lH = paramdz;
    }
    
    dr bA()
    {
      if (this.lI == null) {
        return null;
      }
      return dr.a(this.lI);
    }
    
    public HashMap<String, a<?, ?>> bB()
    {
      dm.e(this.lG);
      dm.e(this.lH);
      return this.lH.H(this.lG);
    }
    
    public int bn()
    {
      return this.lz;
    }
    
    public int bo()
    {
      return this.lB;
    }
    
    public a<I, O> bs()
    {
      return new a(this.iM, this.lz, this.lA, this.lB, this.lC, this.lD, this.lE, this.lG, bA());
    }
    
    public boolean bt()
    {
      return this.lA;
    }
    
    public boolean bu()
    {
      return this.lC;
    }
    
    public String bv()
    {
      return this.lD;
    }
    
    public int bw()
    {
      return this.lE;
    }
    
    public Class<? extends dw> bx()
    {
      return this.lF;
    }
    
    String by()
    {
      if (this.lG == null) {
        return null;
      }
      return this.lG;
    }
    
    public boolean bz()
    {
      return this.lI != null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public I f(O paramO)
    {
      return this.lI.f(paramO);
    }
    
    public int getVersionCode()
    {
      return this.iM;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Field\n");
      localStringBuilder1.append("            versionCode=").append(this.iM).append('\n');
      localStringBuilder1.append("                 typeIn=").append(this.lz).append('\n');
      localStringBuilder1.append("            typeInArray=").append(this.lA).append('\n');
      localStringBuilder1.append("                typeOut=").append(this.lB).append('\n');
      localStringBuilder1.append("           typeOutArray=").append(this.lC).append('\n');
      localStringBuilder1.append("        outputFieldName=").append(this.lD).append('\n');
      localStringBuilder1.append("      safeParcelFieldId=").append(this.lE).append('\n');
      localStringBuilder1.append("       concreteTypeName=").append(by()).append('\n');
      if (bx() != null) {
        localStringBuilder1.append("     concreteType.class=").append(bx().getCanonicalName()).append('\n');
      }
      StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
      if (this.lI == null) {}
      for (String str = "null";; str = this.lI.getClass().getCanonicalName())
      {
        localStringBuilder2.append(str).append('\n');
        return localStringBuilder1.toString();
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      dx.a(this, paramParcel, paramInt);
    }
  }
  
  public static abstract interface b<I, O>
  {
    public abstract int bn();
    
    public abstract int bo();
    
    public abstract I f(O paramO);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw
 * JD-Core Version:    0.7.0.1
 */