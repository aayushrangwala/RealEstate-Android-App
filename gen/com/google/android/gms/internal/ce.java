package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

public final class ce
{
  public final List<String> eW;
  public final List<String> eX;
  public final int errorCode;
  public final cq fU;
  public final long fa;
  public final ao fm;
  public final ax fn;
  public final String fo;
  public final ar fp;
  public final v gB;
  public final String gE;
  public final long gH;
  public final boolean gI;
  public final long gJ;
  public final List<String> gK;
  public final ap hA;
  public final int orientation;
  
  public ce(v paramv, cq paramcq, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean, ao paramao, ax paramax, String paramString2, ap paramap, ar paramar, long paramLong2, long paramLong3)
  {
    this.gB = paramv;
    this.fU = paramcq;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.eW = localList1;
      this.errorCode = paramInt1;
      if (paramList2 == null) {
        break label145;
      }
      localList2 = Collections.unmodifiableList(paramList2);
      label48:
      this.eX = localList2;
      if (paramList3 == null) {
        break label151;
      }
    }
    label145:
    label151:
    for (List localList3 = Collections.unmodifiableList(paramList3);; localList3 = null)
    {
      this.gK = localList3;
      this.orientation = paramInt2;
      this.fa = paramLong1;
      this.gE = paramString1;
      this.gI = paramBoolean;
      this.fm = paramao;
      this.fn = paramax;
      this.fo = paramString2;
      this.hA = paramap;
      this.fp = paramar;
      this.gJ = paramLong2;
      this.gH = paramLong3;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label48;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ce
 * JD-Core Version:    0.7.0.1
 */