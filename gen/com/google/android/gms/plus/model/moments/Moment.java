package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.fs;
import java.util.HashSet;
import java.util.Set;

public abstract interface Moment
  extends Freezable<Moment>
{
  public abstract String getId();
  
  public abstract ItemScope getResult();
  
  public abstract String getStartDate();
  
  public abstract ItemScope getTarget();
  
  public abstract String getType();
  
  public abstract boolean hasId();
  
  public abstract boolean hasResult();
  
  public abstract boolean hasStartDate();
  
  public abstract boolean hasTarget();
  
  public abstract boolean hasType();
  
  public static class Builder
  {
    private final Set<Integer> rI = new HashSet();
    private String sD;
    private fq sG;
    private fq sH;
    private String sm;
    private String sx;
    
    public Moment build()
    {
      return new fs(this.rI, this.sm, this.sG, this.sx, this.sH, this.sD);
    }
    
    public Builder setId(String paramString)
    {
      this.sm = paramString;
      this.rI.add(Integer.valueOf(2));
      return this;
    }
    
    public Builder setResult(ItemScope paramItemScope)
    {
      this.sG = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(4));
      return this;
    }
    
    public Builder setStartDate(String paramString)
    {
      this.sx = paramString;
      this.rI.add(Integer.valueOf(5));
      return this;
    }
    
    public Builder setTarget(ItemScope paramItemScope)
    {
      this.sH = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(6));
      return this;
    }
    
    public Builder setType(String paramString)
    {
      this.sD = paramString;
      this.rI.add(Integer.valueOf(7));
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.Moment
 * JD-Core Version:    0.7.0.1
 */