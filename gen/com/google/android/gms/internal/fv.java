package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fv
  extends dw
  implements SafeParcelable, Person
{
  public static final fw CREATOR = new fw();
  private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
  private int dI;
  private String hN;
  private final int iM;
  private String ml;
  private final Set<Integer> rI;
  private String sJ;
  private a sK;
  private String sL;
  private String sM;
  private int sN;
  private b sO;
  private String sP;
  private c sQ;
  private boolean sR;
  private String sS;
  private d sT;
  private String sU;
  private int sV;
  private List<f> sW;
  private List<g> sX;
  private int sY;
  private int sZ;
  private String sm;
  private String ta;
  private List<h> tb;
  private boolean tc;
  
  static
  {
    rH.put("aboutMe", dw.a.g("aboutMe", 2));
    rH.put("ageRange", dw.a.a("ageRange", 3, a.class));
    rH.put("birthday", dw.a.g("birthday", 4));
    rH.put("braggingRights", dw.a.g("braggingRights", 5));
    rH.put("circledByCount", dw.a.d("circledByCount", 6));
    rH.put("cover", dw.a.a("cover", 7, b.class));
    rH.put("currentLocation", dw.a.g("currentLocation", 8));
    rH.put("displayName", dw.a.g("displayName", 9));
    rH.put("gender", dw.a.a("gender", 12, new dt().c("male", 0).c("female", 1).c("other", 2), false));
    rH.put("id", dw.a.g("id", 14));
    rH.put("image", dw.a.a("image", 15, c.class));
    rH.put("isPlusUser", dw.a.f("isPlusUser", 16));
    rH.put("language", dw.a.g("language", 18));
    rH.put("name", dw.a.a("name", 19, d.class));
    rH.put("nickname", dw.a.g("nickname", 20));
    rH.put("objectType", dw.a.a("objectType", 21, new dt().c("person", 0).c("page", 1), false));
    rH.put("organizations", dw.a.b("organizations", 22, f.class));
    rH.put("placesLived", dw.a.b("placesLived", 23, g.class));
    rH.put("plusOneCount", dw.a.d("plusOneCount", 24));
    rH.put("relationshipStatus", dw.a.a("relationshipStatus", 25, new dt().c("single", 0).c("in_a_relationship", 1).c("engaged", 2).c("married", 3).c("its_complicated", 4).c("open_relationship", 5).c("widowed", 6).c("in_domestic_partnership", 7).c("in_civil_union", 8), false));
    rH.put("tagline", dw.a.g("tagline", 26));
    rH.put("url", dw.a.g("url", 27));
    rH.put("urls", dw.a.b("urls", 28, h.class));
    rH.put("verified", dw.a.f("verified", 29));
  }
  
  public fv()
  {
    this.iM = 2;
    this.rI = new HashSet();
  }
  
  public fv(String paramString1, String paramString2, c paramc, int paramInt, String paramString3)
  {
    this.iM = 2;
    this.rI = new HashSet();
    this.ml = paramString1;
    this.rI.add(Integer.valueOf(9));
    this.sm = paramString2;
    this.rI.add(Integer.valueOf(14));
    this.sQ = paramc;
    this.rI.add(Integer.valueOf(15));
    this.sV = paramInt;
    this.rI.add(Integer.valueOf(21));
    this.hN = paramString3;
    this.rI.add(Integer.valueOf(27));
  }
  
  fv(Set<Integer> paramSet, int paramInt1, String paramString1, a parama, String paramString2, String paramString3, int paramInt2, b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, c paramc, boolean paramBoolean1, String paramString7, d paramd, String paramString8, int paramInt4, List<f> paramList, List<g> paramList1, int paramInt5, int paramInt6, String paramString9, String paramString10, List<h> paramList2, boolean paramBoolean2)
  {
    this.rI = paramSet;
    this.iM = paramInt1;
    this.sJ = paramString1;
    this.sK = parama;
    this.sL = paramString2;
    this.sM = paramString3;
    this.sN = paramInt2;
    this.sO = paramb;
    this.sP = paramString4;
    this.ml = paramString5;
    this.dI = paramInt3;
    this.sm = paramString6;
    this.sQ = paramc;
    this.sR = paramBoolean1;
    this.sS = paramString7;
    this.sT = paramd;
    this.sU = paramString8;
    this.sV = paramInt4;
    this.sW = paramList;
    this.sX = paramList1;
    this.sY = paramInt5;
    this.sZ = paramInt6;
    this.ta = paramString9;
    this.hN = paramString10;
    this.tb = paramList2;
    this.tc = paramBoolean2;
  }
  
  public static fv e(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    fv localfv = CREATOR.D(localParcel);
    localParcel.recycle();
    return localfv;
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
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
    case 2: 
      return this.sJ;
    case 3: 
      return this.sK;
    case 4: 
      return this.sL;
    case 5: 
      return this.sM;
    case 6: 
      return Integer.valueOf(this.sN);
    case 7: 
      return this.sO;
    case 8: 
      return this.sP;
    case 9: 
      return this.ml;
    case 12: 
      return Integer.valueOf(this.dI);
    case 14: 
      return this.sm;
    case 15: 
      return this.sQ;
    case 16: 
      return Boolean.valueOf(this.sR);
    case 18: 
      return this.sS;
    case 19: 
      return this.sT;
    case 20: 
      return this.sU;
    case 21: 
      return Integer.valueOf(this.sV);
    case 22: 
      return this.sW;
    case 23: 
      return this.sX;
    case 24: 
      return Integer.valueOf(this.sY);
    case 25: 
      return Integer.valueOf(this.sZ);
    case 26: 
      return this.ta;
    case 27: 
      return this.hN;
    case 28: 
      return this.tb;
    }
    return Boolean.valueOf(this.tc);
  }
  
  public HashMap<String, dw.a<?, ?>> bp()
  {
    return rH;
  }
  
  a dD()
  {
    return this.sK;
  }
  
  b dE()
  {
    return this.sO;
  }
  
  c dF()
  {
    return this.sQ;
  }
  
  d dG()
  {
    return this.sT;
  }
  
  List<f> dH()
  {
    return this.sW;
  }
  
  List<g> dI()
  {
    return this.sX;
  }
  
  List<h> dJ()
  {
    return this.tb;
  }
  
  public fv dK()
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
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fv)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    fv localfv = (fv)paramObject;
    Iterator localIterator = rH.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localfv.a(locala))
        {
          if (!b(locala).equals(localfv.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localfv.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  public String getAboutMe()
  {
    return this.sJ;
  }
  
  public Person.AgeRange getAgeRange()
  {
    return this.sK;
  }
  
  public String getBirthday()
  {
    return this.sL;
  }
  
  public String getBraggingRights()
  {
    return this.sM;
  }
  
  public int getCircledByCount()
  {
    return this.sN;
  }
  
  public Person.Cover getCover()
  {
    return this.sO;
  }
  
  public String getCurrentLocation()
  {
    return this.sP;
  }
  
  public String getDisplayName()
  {
    return this.ml;
  }
  
  public int getGender()
  {
    return this.dI;
  }
  
  public String getId()
  {
    return this.sm;
  }
  
  public Person.Image getImage()
  {
    return this.sQ;
  }
  
  public String getLanguage()
  {
    return this.sS;
  }
  
  public Person.Name getName()
  {
    return this.sT;
  }
  
  public String getNickname()
  {
    return this.sU;
  }
  
  public int getObjectType()
  {
    return this.sV;
  }
  
  public List<Person.Organizations> getOrganizations()
  {
    return (ArrayList)this.sW;
  }
  
  public List<Person.PlacesLived> getPlacesLived()
  {
    return (ArrayList)this.sX;
  }
  
  public int getPlusOneCount()
  {
    return this.sY;
  }
  
  public int getRelationshipStatus()
  {
    return this.sZ;
  }
  
  public String getTagline()
  {
    return this.ta;
  }
  
  public String getUrl()
  {
    return this.hN;
  }
  
  public List<Person.Urls> getUrls()
  {
    return (ArrayList)this.tb;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public boolean hasAboutMe()
  {
    return this.rI.contains(Integer.valueOf(2));
  }
  
  public boolean hasAgeRange()
  {
    return this.rI.contains(Integer.valueOf(3));
  }
  
  public boolean hasBirthday()
  {
    return this.rI.contains(Integer.valueOf(4));
  }
  
  public boolean hasBraggingRights()
  {
    return this.rI.contains(Integer.valueOf(5));
  }
  
  public boolean hasCircledByCount()
  {
    return this.rI.contains(Integer.valueOf(6));
  }
  
  public boolean hasCover()
  {
    return this.rI.contains(Integer.valueOf(7));
  }
  
  public boolean hasCurrentLocation()
  {
    return this.rI.contains(Integer.valueOf(8));
  }
  
  public boolean hasDisplayName()
  {
    return this.rI.contains(Integer.valueOf(9));
  }
  
  public boolean hasGender()
  {
    return this.rI.contains(Integer.valueOf(12));
  }
  
  public boolean hasId()
  {
    return this.rI.contains(Integer.valueOf(14));
  }
  
  public boolean hasImage()
  {
    return this.rI.contains(Integer.valueOf(15));
  }
  
  public boolean hasIsPlusUser()
  {
    return this.rI.contains(Integer.valueOf(16));
  }
  
  public boolean hasLanguage()
  {
    return this.rI.contains(Integer.valueOf(18));
  }
  
  public boolean hasName()
  {
    return this.rI.contains(Integer.valueOf(19));
  }
  
  public boolean hasNickname()
  {
    return this.rI.contains(Integer.valueOf(20));
  }
  
  public boolean hasObjectType()
  {
    return this.rI.contains(Integer.valueOf(21));
  }
  
  public boolean hasOrganizations()
  {
    return this.rI.contains(Integer.valueOf(22));
  }
  
  public boolean hasPlacesLived()
  {
    return this.rI.contains(Integer.valueOf(23));
  }
  
  public boolean hasPlusOneCount()
  {
    return this.rI.contains(Integer.valueOf(24));
  }
  
  public boolean hasRelationshipStatus()
  {
    return this.rI.contains(Integer.valueOf(25));
  }
  
  public boolean hasTagline()
  {
    return this.rI.contains(Integer.valueOf(26));
  }
  
  public boolean hasUrl()
  {
    return this.rI.contains(Integer.valueOf(27));
  }
  
  public boolean hasUrls()
  {
    return this.rI.contains(Integer.valueOf(28));
  }
  
  public boolean hasVerified()
  {
    return this.rI.contains(Integer.valueOf(29));
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
  
  public boolean isPlusUser()
  {
    return this.sR;
  }
  
  public boolean isVerified()
  {
    return this.tc;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fw.a(this, paramParcel, paramInt);
  }
  
  public static final class a
    extends dw
    implements SafeParcelable, Person.AgeRange
  {
    public static final fx CREATOR = new fx();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private final Set<Integer> rI;
    private int td;
    private int te;
    
    static
    {
      rH.put("max", dw.a.d("max", 2));
      rH.put("min", dw.a.d("min", 3));
    }
    
    public a()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
    {
      this.rI = paramSet;
      this.iM = paramInt1;
      this.td = paramInt2;
      this.te = paramInt3;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 2: 
        return Integer.valueOf(this.td);
      }
      return Integer.valueOf(this.te);
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    public a dL()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      a locala = (a)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala1 = (dw.a)localIterator.next();
        if (a(locala1))
        {
          if (locala.a(locala1))
          {
            if (!b(locala1).equals(locala.b(locala1))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (locala.a(locala1)) {
          return false;
        }
      }
      return true;
    }
    
    public int getMax()
    {
      return this.td;
    }
    
    public int getMin()
    {
      return this.te;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasMax()
    {
      return this.rI.contains(Integer.valueOf(2));
    }
    
    public boolean hasMin()
    {
      return this.rI.contains(Integer.valueOf(3));
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
      fx.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class b
    extends dw
    implements SafeParcelable, Person.Cover
  {
    public static final fy CREATOR = new fy();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private final Set<Integer> rI;
    private a tf;
    private b tg;
    private int th;
    
    static
    {
      rH.put("coverInfo", dw.a.a("coverInfo", 2, a.class));
      rH.put("coverPhoto", dw.a.a("coverPhoto", 3, b.class));
      rH.put("layout", dw.a.a("layout", 4, new dt().c("banner", 0), false));
    }
    
    public b()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    b(Set<Integer> paramSet, int paramInt1, a parama, b paramb, int paramInt2)
    {
      this.rI = paramSet;
      this.iM = paramInt1;
      this.tf = parama;
      this.tg = paramb;
      this.th = paramInt2;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 2: 
        return this.tf;
      case 3: 
        return this.tg;
      }
      return Integer.valueOf(this.th);
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    a dM()
    {
      return this.tf;
    }
    
    b dN()
    {
      return this.tg;
    }
    
    public b dO()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof b)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      b localb = (b)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (localb.a(locala))
          {
            if (!b(locala).equals(localb.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (localb.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public Person.Cover.CoverInfo getCoverInfo()
    {
      return this.tf;
    }
    
    public Person.Cover.CoverPhoto getCoverPhoto()
    {
      return this.tg;
    }
    
    public int getLayout()
    {
      return this.th;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasCoverInfo()
    {
      return this.rI.contains(Integer.valueOf(2));
    }
    
    public boolean hasCoverPhoto()
    {
      return this.rI.contains(Integer.valueOf(3));
    }
    
    public boolean hasLayout()
    {
      return this.rI.contains(Integer.valueOf(4));
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
      fy.a(this, paramParcel, paramInt);
    }
    
    public static final class a
      extends dw
      implements SafeParcelable, Person.Cover.CoverInfo
    {
      public static final fz CREATOR = new fz();
      private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
      private final int iM;
      private final Set<Integer> rI;
      private int ti;
      private int tj;
      
      static
      {
        rH.put("leftImageOffset", dw.a.d("leftImageOffset", 2));
        rH.put("topImageOffset", dw.a.d("topImageOffset", 3));
      }
      
      public a()
      {
        this.iM = 1;
        this.rI = new HashSet();
      }
      
      a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
      {
        this.rI = paramSet;
        this.iM = paramInt1;
        this.ti = paramInt2;
        this.tj = paramInt3;
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
        default: 
          throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
        case 2: 
          return Integer.valueOf(this.ti);
        }
        return Integer.valueOf(this.tj);
      }
      
      public HashMap<String, dw.a<?, ?>> bp()
      {
        return rH;
      }
      
      public a dP()
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
      
      public boolean equals(Object paramObject)
      {
        if (!(paramObject instanceof a)) {
          return false;
        }
        if (this == paramObject) {
          return true;
        }
        a locala = (a)paramObject;
        Iterator localIterator = rH.values().iterator();
        while (localIterator.hasNext())
        {
          dw.a locala1 = (dw.a)localIterator.next();
          if (a(locala1))
          {
            if (locala.a(locala1))
            {
              if (!b(locala1).equals(locala.b(locala1))) {
                return false;
              }
            }
            else {
              return false;
            }
          }
          else if (locala.a(locala1)) {
            return false;
          }
        }
        return true;
      }
      
      public int getLeftImageOffset()
      {
        return this.ti;
      }
      
      public int getTopImageOffset()
      {
        return this.tj;
      }
      
      int getVersionCode()
      {
        return this.iM;
      }
      
      public boolean hasLeftImageOffset()
      {
        return this.rI.contains(Integer.valueOf(2));
      }
      
      public boolean hasTopImageOffset()
      {
        return this.rI.contains(Integer.valueOf(3));
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
        fz.a(this, paramParcel, paramInt);
      }
    }
    
    public static final class b
      extends dw
      implements SafeParcelable, Person.Cover.CoverPhoto
    {
      public static final ga CREATOR = new ga();
      private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
      private int dP;
      private int dQ;
      private String hN;
      private final int iM;
      private final Set<Integer> rI;
      
      static
      {
        rH.put("height", dw.a.d("height", 2));
        rH.put("url", dw.a.g("url", 3));
        rH.put("width", dw.a.d("width", 4));
      }
      
      public b()
      {
        this.iM = 1;
        this.rI = new HashSet();
      }
      
      b(Set<Integer> paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
      {
        this.rI = paramSet;
        this.iM = paramInt1;
        this.dQ = paramInt2;
        this.hN = paramString;
        this.dP = paramInt3;
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
        default: 
          throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
        case 2: 
          return Integer.valueOf(this.dQ);
        case 3: 
          return this.hN;
        }
        return Integer.valueOf(this.dP);
      }
      
      public HashMap<String, dw.a<?, ?>> bp()
      {
        return rH;
      }
      
      public b dQ()
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
      
      public boolean equals(Object paramObject)
      {
        if (!(paramObject instanceof b)) {
          return false;
        }
        if (this == paramObject) {
          return true;
        }
        b localb = (b)paramObject;
        Iterator localIterator = rH.values().iterator();
        while (localIterator.hasNext())
        {
          dw.a locala = (dw.a)localIterator.next();
          if (a(locala))
          {
            if (localb.a(locala))
            {
              if (!b(locala).equals(localb.b(locala))) {
                return false;
              }
            }
            else {
              return false;
            }
          }
          else if (localb.a(locala)) {
            return false;
          }
        }
        return true;
      }
      
      public int getHeight()
      {
        return this.dQ;
      }
      
      public String getUrl()
      {
        return this.hN;
      }
      
      int getVersionCode()
      {
        return this.iM;
      }
      
      public int getWidth()
      {
        return this.dP;
      }
      
      public boolean hasHeight()
      {
        return this.rI.contains(Integer.valueOf(2));
      }
      
      public boolean hasUrl()
      {
        return this.rI.contains(Integer.valueOf(3));
      }
      
      public boolean hasWidth()
      {
        return this.rI.contains(Integer.valueOf(4));
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
        ga.a(this, paramParcel, paramInt);
      }
    }
  }
  
  public static final class c
    extends dw
    implements SafeParcelable, Person.Image
  {
    public static final gb CREATOR = new gb();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private String hN;
    private final int iM;
    private final Set<Integer> rI;
    
    static
    {
      rH.put("url", dw.a.g("url", 2));
    }
    
    public c()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    public c(String paramString)
    {
      this.rI = new HashSet();
      this.iM = 1;
      this.hN = paramString;
      this.rI.add(Integer.valueOf(2));
    }
    
    c(Set<Integer> paramSet, int paramInt, String paramString)
    {
      this.rI = paramSet;
      this.iM = paramInt;
      this.hN = paramString;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      }
      return this.hN;
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    public c dR()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof c)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      c localc = (c)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (localc.a(locala))
          {
            if (!b(locala).equals(localc.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (localc.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public String getUrl()
    {
      return this.hN;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasUrl()
    {
      return this.rI.contains(Integer.valueOf(2));
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
      gb.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class d
    extends dw
    implements SafeParcelable, Person.Name
  {
    public static final gc CREATOR = new gc();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private final Set<Integer> rI;
    private String sh;
    private String sk;
    private String tk;
    private String tl;
    private String tm;
    private String tn;
    
    static
    {
      rH.put("familyName", dw.a.g("familyName", 2));
      rH.put("formatted", dw.a.g("formatted", 3));
      rH.put("givenName", dw.a.g("givenName", 4));
      rH.put("honorificPrefix", dw.a.g("honorificPrefix", 5));
      rH.put("honorificSuffix", dw.a.g("honorificSuffix", 6));
      rH.put("middleName", dw.a.g("middleName", 7));
    }
    
    public d()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    d(Set<Integer> paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
    {
      this.rI = paramSet;
      this.iM = paramInt;
      this.sh = paramString1;
      this.tk = paramString2;
      this.sk = paramString3;
      this.tl = paramString4;
      this.tm = paramString5;
      this.tn = paramString6;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 2: 
        return this.sh;
      case 3: 
        return this.tk;
      case 4: 
        return this.sk;
      case 5: 
        return this.tl;
      case 6: 
        return this.tm;
      }
      return this.tn;
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    public d dS()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof d)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      d locald = (d)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (locald.a(locala))
          {
            if (!b(locala).equals(locald.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (locald.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public String getFamilyName()
    {
      return this.sh;
    }
    
    public String getFormatted()
    {
      return this.tk;
    }
    
    public String getGivenName()
    {
      return this.sk;
    }
    
    public String getHonorificPrefix()
    {
      return this.tl;
    }
    
    public String getHonorificSuffix()
    {
      return this.tm;
    }
    
    public String getMiddleName()
    {
      return this.tn;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasFamilyName()
    {
      return this.rI.contains(Integer.valueOf(2));
    }
    
    public boolean hasFormatted()
    {
      return this.rI.contains(Integer.valueOf(3));
    }
    
    public boolean hasGivenName()
    {
      return this.rI.contains(Integer.valueOf(4));
    }
    
    public boolean hasHonorificPrefix()
    {
      return this.rI.contains(Integer.valueOf(5));
    }
    
    public boolean hasHonorificSuffix()
    {
      return this.rI.contains(Integer.valueOf(6));
    }
    
    public boolean hasMiddleName()
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
      gc.a(this, paramParcel, paramInt);
    }
  }
  
  public static class e
  {
    public static int aa(String paramString)
    {
      if (paramString.equals("person")) {
        return 0;
      }
      if (paramString.equals("page")) {
        return 1;
      }
      throw new IllegalArgumentException("Unknown objectType string: " + paramString);
    }
  }
  
  public static final class f
    extends dw
    implements SafeParcelable, Person.Organizations
  {
    public static final gd CREATOR = new gd();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private int jV;
    private String mName;
    private String mo;
    private String qB;
    private final Set<Integer> rI;
    private String sg;
    private String sx;
    private String to;
    private String tp;
    private boolean tq;
    
    static
    {
      rH.put("department", dw.a.g("department", 2));
      rH.put("description", dw.a.g("description", 3));
      rH.put("endDate", dw.a.g("endDate", 4));
      rH.put("location", dw.a.g("location", 5));
      rH.put("name", dw.a.g("name", 6));
      rH.put("primary", dw.a.f("primary", 7));
      rH.put("startDate", dw.a.g("startDate", 8));
      rH.put("title", dw.a.g("title", 9));
      rH.put("type", dw.a.a("type", 10, new dt().c("work", 0).c("school", 1), false));
    }
    
    public f()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    f(Set<Integer> paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
    {
      this.rI = paramSet;
      this.iM = paramInt1;
      this.to = paramString1;
      this.mo = paramString2;
      this.sg = paramString3;
      this.tp = paramString4;
      this.mName = paramString5;
      this.tq = paramBoolean;
      this.sx = paramString6;
      this.qB = paramString7;
      this.jV = paramInt2;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 2: 
        return this.to;
      case 3: 
        return this.mo;
      case 4: 
        return this.sg;
      case 5: 
        return this.tp;
      case 6: 
        return this.mName;
      case 7: 
        return Boolean.valueOf(this.tq);
      case 8: 
        return this.sx;
      case 9: 
        return this.qB;
      }
      return Integer.valueOf(this.jV);
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    public f dT()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof f)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      f localf = (f)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (localf.a(locala))
          {
            if (!b(locala).equals(localf.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (localf.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public String getDepartment()
    {
      return this.to;
    }
    
    public String getDescription()
    {
      return this.mo;
    }
    
    public String getEndDate()
    {
      return this.sg;
    }
    
    public String getLocation()
    {
      return this.tp;
    }
    
    public String getName()
    {
      return this.mName;
    }
    
    public String getStartDate()
    {
      return this.sx;
    }
    
    public String getTitle()
    {
      return this.qB;
    }
    
    public int getType()
    {
      return this.jV;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasDepartment()
    {
      return this.rI.contains(Integer.valueOf(2));
    }
    
    public boolean hasDescription()
    {
      return this.rI.contains(Integer.valueOf(3));
    }
    
    public boolean hasEndDate()
    {
      return this.rI.contains(Integer.valueOf(4));
    }
    
    public boolean hasLocation()
    {
      return this.rI.contains(Integer.valueOf(5));
    }
    
    public boolean hasName()
    {
      return this.rI.contains(Integer.valueOf(6));
    }
    
    public boolean hasPrimary()
    {
      return this.rI.contains(Integer.valueOf(7));
    }
    
    public boolean hasStartDate()
    {
      return this.rI.contains(Integer.valueOf(8));
    }
    
    public boolean hasTitle()
    {
      return this.rI.contains(Integer.valueOf(9));
    }
    
    public boolean hasType()
    {
      return this.rI.contains(Integer.valueOf(10));
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
    
    public boolean isPrimary()
    {
      return this.tq;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      gd.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class g
    extends dw
    implements SafeParcelable, Person.PlacesLived
  {
    public static final ge CREATOR = new ge();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private String mValue;
    private final Set<Integer> rI;
    private boolean tq;
    
    static
    {
      rH.put("primary", dw.a.f("primary", 2));
      rH.put("value", dw.a.g("value", 3));
    }
    
    public g()
    {
      this.iM = 1;
      this.rI = new HashSet();
    }
    
    g(Set<Integer> paramSet, int paramInt, boolean paramBoolean, String paramString)
    {
      this.rI = paramSet;
      this.iM = paramInt;
      this.tq = paramBoolean;
      this.mValue = paramString;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 2: 
        return Boolean.valueOf(this.tq);
      }
      return this.mValue;
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    public g dU()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof g)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      g localg = (g)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (localg.a(locala))
          {
            if (!b(locala).equals(localg.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (localg.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public String getValue()
    {
      return this.mValue;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasPrimary()
    {
      return this.rI.contains(Integer.valueOf(2));
    }
    
    public boolean hasValue()
    {
      return this.rI.contains(Integer.valueOf(3));
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
    
    public boolean isPrimary()
    {
      return this.tq;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      ge.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class h
    extends dw
    implements SafeParcelable, Person.Urls
  {
    public static final gf CREATOR = new gf();
    private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
    private final int iM;
    private int jV;
    private String mValue;
    private final Set<Integer> rI;
    private String tr;
    private final int ts = 4;
    
    static
    {
      rH.put("label", dw.a.g("label", 5));
      rH.put("type", dw.a.a("type", 6, new dt().c("home", 0).c("work", 1).c("blog", 2).c("profile", 3).c("other", 4).c("otherProfile", 5).c("contributor", 6).c("website", 7), false));
      rH.put("value", dw.a.g("value", 4));
    }
    
    public h()
    {
      this.iM = 2;
      this.rI = new HashSet();
    }
    
    h(Set<Integer> paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
    {
      this.rI = paramSet;
      this.iM = paramInt1;
      this.tr = paramString1;
      this.jV = paramInt2;
      this.mValue = paramString2;
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
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
      case 5: 
        return this.tr;
      case 6: 
        return Integer.valueOf(this.jV);
      }
      return this.mValue;
    }
    
    public HashMap<String, dw.a<?, ?>> bp()
    {
      return rH;
    }
    
    @Deprecated
    public int dV()
    {
      return 4;
    }
    
    public h dW()
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
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof h)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      h localh = (h)paramObject;
      Iterator localIterator = rH.values().iterator();
      while (localIterator.hasNext())
      {
        dw.a locala = (dw.a)localIterator.next();
        if (a(locala))
        {
          if (localh.a(locala))
          {
            if (!b(locala).equals(localh.b(locala))) {
              return false;
            }
          }
          else {
            return false;
          }
        }
        else if (localh.a(locala)) {
          return false;
        }
      }
      return true;
    }
    
    public String getLabel()
    {
      return this.tr;
    }
    
    public int getType()
    {
      return this.jV;
    }
    
    public String getValue()
    {
      return this.mValue;
    }
    
    int getVersionCode()
    {
      return this.iM;
    }
    
    public boolean hasLabel()
    {
      return this.rI.contains(Integer.valueOf(5));
    }
    
    public boolean hasType()
    {
      return this.rI.contains(Integer.valueOf(6));
    }
    
    public boolean hasValue()
    {
      return this.rI.contains(Integer.valueOf(4));
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
      gf.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv
 * JD-Core Version:    0.7.0.1
 */