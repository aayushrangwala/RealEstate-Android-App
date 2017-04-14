package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fq
  extends dw
  implements SafeParcelable, ItemScope
{
  public static final fr CREATOR = new fr();
  private static final HashMap<String, dw.a<?, ?>> rH = new HashMap();
  private String hN;
  private final int iM;
  private String mName;
  private String mo;
  private double oE;
  private double oF;
  private final Set<Integer> rI;
  private fq rJ;
  private List<String> rK;
  private fq rL;
  private String rM;
  private String rN;
  private String rO;
  private List<fq> rP;
  private int rQ;
  private List<fq> rR;
  private fq rS;
  private List<fq> rT;
  private String rU;
  private String rV;
  private fq rW;
  private String rX;
  private String rY;
  private String rZ;
  private fq sA;
  private String sB;
  private String sC;
  private String sD;
  private String sE;
  private String sF;
  private List<fq> sa;
  private String sb;
  private String sc;
  private String sd;
  private String se;
  private String sf;
  private String sg;
  private String sh;
  private String si;
  private fq sj;
  private String sk;
  private String sl;
  private String sm;
  private String sn;
  private fq so;
  private fq sp;
  private fq sq;
  private List<fq> sr;
  private String ss;
  private String st;
  private String su;
  private String sv;
  private fq sw;
  private String sx;
  private String sy;
  private String sz;
  
  static
  {
    rH.put("about", dw.a.a("about", 2, fq.class));
    rH.put("additionalName", dw.a.h("additionalName", 3));
    rH.put("address", dw.a.a("address", 4, fq.class));
    rH.put("addressCountry", dw.a.g("addressCountry", 5));
    rH.put("addressLocality", dw.a.g("addressLocality", 6));
    rH.put("addressRegion", dw.a.g("addressRegion", 7));
    rH.put("associated_media", dw.a.b("associated_media", 8, fq.class));
    rH.put("attendeeCount", dw.a.d("attendeeCount", 9));
    rH.put("attendees", dw.a.b("attendees", 10, fq.class));
    rH.put("audio", dw.a.a("audio", 11, fq.class));
    rH.put("author", dw.a.b("author", 12, fq.class));
    rH.put("bestRating", dw.a.g("bestRating", 13));
    rH.put("birthDate", dw.a.g("birthDate", 14));
    rH.put("byArtist", dw.a.a("byArtist", 15, fq.class));
    rH.put("caption", dw.a.g("caption", 16));
    rH.put("contentSize", dw.a.g("contentSize", 17));
    rH.put("contentUrl", dw.a.g("contentUrl", 18));
    rH.put("contributor", dw.a.b("contributor", 19, fq.class));
    rH.put("dateCreated", dw.a.g("dateCreated", 20));
    rH.put("dateModified", dw.a.g("dateModified", 21));
    rH.put("datePublished", dw.a.g("datePublished", 22));
    rH.put("description", dw.a.g("description", 23));
    rH.put("duration", dw.a.g("duration", 24));
    rH.put("embedUrl", dw.a.g("embedUrl", 25));
    rH.put("endDate", dw.a.g("endDate", 26));
    rH.put("familyName", dw.a.g("familyName", 27));
    rH.put("gender", dw.a.g("gender", 28));
    rH.put("geo", dw.a.a("geo", 29, fq.class));
    rH.put("givenName", dw.a.g("givenName", 30));
    rH.put("height", dw.a.g("height", 31));
    rH.put("id", dw.a.g("id", 32));
    rH.put("image", dw.a.g("image", 33));
    rH.put("inAlbum", dw.a.a("inAlbum", 34, fq.class));
    rH.put("latitude", dw.a.e("latitude", 36));
    rH.put("location", dw.a.a("location", 37, fq.class));
    rH.put("longitude", dw.a.e("longitude", 38));
    rH.put("name", dw.a.g("name", 39));
    rH.put("partOfTVSeries", dw.a.a("partOfTVSeries", 40, fq.class));
    rH.put("performers", dw.a.b("performers", 41, fq.class));
    rH.put("playerType", dw.a.g("playerType", 42));
    rH.put("postOfficeBoxNumber", dw.a.g("postOfficeBoxNumber", 43));
    rH.put("postalCode", dw.a.g("postalCode", 44));
    rH.put("ratingValue", dw.a.g("ratingValue", 45));
    rH.put("reviewRating", dw.a.a("reviewRating", 46, fq.class));
    rH.put("startDate", dw.a.g("startDate", 47));
    rH.put("streetAddress", dw.a.g("streetAddress", 48));
    rH.put("text", dw.a.g("text", 49));
    rH.put("thumbnail", dw.a.a("thumbnail", 50, fq.class));
    rH.put("thumbnailUrl", dw.a.g("thumbnailUrl", 51));
    rH.put("tickerSymbol", dw.a.g("tickerSymbol", 52));
    rH.put("type", dw.a.g("type", 53));
    rH.put("url", dw.a.g("url", 54));
    rH.put("width", dw.a.g("width", 55));
    rH.put("worstRating", dw.a.g("worstRating", 56));
  }
  
  public fq()
  {
    this.iM = 1;
    this.rI = new HashSet();
  }
  
  fq(Set<Integer> paramSet, int paramInt1, fq paramfq1, List<String> paramList, fq paramfq2, String paramString1, String paramString2, String paramString3, List<fq> paramList1, int paramInt2, List<fq> paramList2, fq paramfq3, List<fq> paramList3, String paramString4, String paramString5, fq paramfq4, String paramString6, String paramString7, String paramString8, List<fq> paramList4, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, fq paramfq5, String paramString18, String paramString19, String paramString20, String paramString21, fq paramfq6, double paramDouble1, fq paramfq7, double paramDouble2, String paramString22, fq paramfq8, List<fq> paramList5, String paramString23, String paramString24, String paramString25, String paramString26, fq paramfq9, String paramString27, String paramString28, String paramString29, fq paramfq10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.rI = paramSet;
    this.iM = paramInt1;
    this.rJ = paramfq1;
    this.rK = paramList;
    this.rL = paramfq2;
    this.rM = paramString1;
    this.rN = paramString2;
    this.rO = paramString3;
    this.rP = paramList1;
    this.rQ = paramInt2;
    this.rR = paramList2;
    this.rS = paramfq3;
    this.rT = paramList3;
    this.rU = paramString4;
    this.rV = paramString5;
    this.rW = paramfq4;
    this.rX = paramString6;
    this.rY = paramString7;
    this.rZ = paramString8;
    this.sa = paramList4;
    this.sb = paramString9;
    this.sc = paramString10;
    this.sd = paramString11;
    this.mo = paramString12;
    this.se = paramString13;
    this.sf = paramString14;
    this.sg = paramString15;
    this.sh = paramString16;
    this.si = paramString17;
    this.sj = paramfq5;
    this.sk = paramString18;
    this.sl = paramString19;
    this.sm = paramString20;
    this.sn = paramString21;
    this.so = paramfq6;
    this.oE = paramDouble1;
    this.sp = paramfq7;
    this.oF = paramDouble2;
    this.mName = paramString22;
    this.sq = paramfq8;
    this.sr = paramList5;
    this.ss = paramString23;
    this.st = paramString24;
    this.su = paramString25;
    this.sv = paramString26;
    this.sw = paramfq9;
    this.sx = paramString27;
    this.sy = paramString28;
    this.sz = paramString29;
    this.sA = paramfq10;
    this.sB = paramString30;
    this.sC = paramString31;
    this.sD = paramString32;
    this.hN = paramString33;
    this.sE = paramString34;
    this.sF = paramString35;
  }
  
  public fq(Set<Integer> paramSet, fq paramfq1, List<String> paramList, fq paramfq2, String paramString1, String paramString2, String paramString3, List<fq> paramList1, int paramInt, List<fq> paramList2, fq paramfq3, List<fq> paramList3, String paramString4, String paramString5, fq paramfq4, String paramString6, String paramString7, String paramString8, List<fq> paramList4, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, fq paramfq5, String paramString18, String paramString19, String paramString20, String paramString21, fq paramfq6, double paramDouble1, fq paramfq7, double paramDouble2, String paramString22, fq paramfq8, List<fq> paramList5, String paramString23, String paramString24, String paramString25, String paramString26, fq paramfq9, String paramString27, String paramString28, String paramString29, fq paramfq10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.rI = paramSet;
    this.iM = 1;
    this.rJ = paramfq1;
    this.rK = paramList;
    this.rL = paramfq2;
    this.rM = paramString1;
    this.rN = paramString2;
    this.rO = paramString3;
    this.rP = paramList1;
    this.rQ = paramInt;
    this.rR = paramList2;
    this.rS = paramfq3;
    this.rT = paramList3;
    this.rU = paramString4;
    this.rV = paramString5;
    this.rW = paramfq4;
    this.rX = paramString6;
    this.rY = paramString7;
    this.rZ = paramString8;
    this.sa = paramList4;
    this.sb = paramString9;
    this.sc = paramString10;
    this.sd = paramString11;
    this.mo = paramString12;
    this.se = paramString13;
    this.sf = paramString14;
    this.sg = paramString15;
    this.sh = paramString16;
    this.si = paramString17;
    this.sj = paramfq5;
    this.sk = paramString18;
    this.sl = paramString19;
    this.sm = paramString20;
    this.sn = paramString21;
    this.so = paramfq6;
    this.oE = paramDouble1;
    this.sp = paramfq7;
    this.oF = paramDouble2;
    this.mName = paramString22;
    this.sq = paramfq8;
    this.sr = paramList5;
    this.ss = paramString23;
    this.st = paramString24;
    this.su = paramString25;
    this.sv = paramString26;
    this.sw = paramfq9;
    this.sx = paramString27;
    this.sy = paramString28;
    this.sz = paramString29;
    this.sA = paramfq10;
    this.sB = paramString30;
    this.sC = paramString31;
    this.sD = paramString32;
    this.hN = paramString33;
    this.sE = paramString34;
    this.sF = paramString35;
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
    case 35: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.bw());
    case 2: 
      return this.rJ;
    case 3: 
      return this.rK;
    case 4: 
      return this.rL;
    case 5: 
      return this.rM;
    case 6: 
      return this.rN;
    case 7: 
      return this.rO;
    case 8: 
      return this.rP;
    case 9: 
      return Integer.valueOf(this.rQ);
    case 10: 
      return this.rR;
    case 11: 
      return this.rS;
    case 12: 
      return this.rT;
    case 13: 
      return this.rU;
    case 14: 
      return this.rV;
    case 15: 
      return this.rW;
    case 16: 
      return this.rX;
    case 17: 
      return this.rY;
    case 18: 
      return this.rZ;
    case 19: 
      return this.sa;
    case 20: 
      return this.sb;
    case 21: 
      return this.sc;
    case 22: 
      return this.sd;
    case 23: 
      return this.mo;
    case 24: 
      return this.se;
    case 25: 
      return this.sf;
    case 26: 
      return this.sg;
    case 27: 
      return this.sh;
    case 28: 
      return this.si;
    case 29: 
      return this.sj;
    case 30: 
      return this.sk;
    case 31: 
      return this.sl;
    case 32: 
      return this.sm;
    case 33: 
      return this.sn;
    case 34: 
      return this.so;
    case 36: 
      return Double.valueOf(this.oE);
    case 37: 
      return this.sp;
    case 38: 
      return Double.valueOf(this.oF);
    case 39: 
      return this.mName;
    case 40: 
      return this.sq;
    case 41: 
      return this.sr;
    case 42: 
      return this.ss;
    case 43: 
      return this.st;
    case 44: 
      return this.su;
    case 45: 
      return this.sv;
    case 46: 
      return this.sw;
    case 47: 
      return this.sx;
    case 48: 
      return this.sy;
    case 49: 
      return this.sz;
    case 50: 
      return this.sA;
    case 51: 
      return this.sB;
    case 52: 
      return this.sC;
    case 53: 
      return this.sD;
    case 54: 
      return this.hN;
    case 55: 
      return this.sE;
    }
    return this.sF;
  }
  
  public HashMap<String, dw.a<?, ?>> bp()
  {
    return rH;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  Set<Integer> di()
  {
    return this.rI;
  }
  
  fq dj()
  {
    return this.rJ;
  }
  
  fq dk()
  {
    return this.rL;
  }
  
  List<fq> dl()
  {
    return this.rP;
  }
  
  List<fq> dm()
  {
    return this.rR;
  }
  
  fq dn()
  {
    return this.rS;
  }
  
  List<fq> jdMethod_do()
  {
    return this.rT;
  }
  
  fq dp()
  {
    return this.rW;
  }
  
  List<fq> dq()
  {
    return this.sa;
  }
  
  fq dr()
  {
    return this.sj;
  }
  
  fq ds()
  {
    return this.so;
  }
  
  fq dt()
  {
    return this.sp;
  }
  
  fq du()
  {
    return this.sq;
  }
  
  List<fq> dv()
  {
    return this.sr;
  }
  
  fq dw()
  {
    return this.sw;
  }
  
  fq dx()
  {
    return this.sA;
  }
  
  public fq dy()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fq)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    fq localfq = (fq)paramObject;
    Iterator localIterator = rH.values().iterator();
    while (localIterator.hasNext())
    {
      dw.a locala = (dw.a)localIterator.next();
      if (a(locala))
      {
        if (localfq.a(locala))
        {
          if (!b(locala).equals(localfq.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localfq.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  public ItemScope getAbout()
  {
    return this.rJ;
  }
  
  public List<String> getAdditionalName()
  {
    return this.rK;
  }
  
  public ItemScope getAddress()
  {
    return this.rL;
  }
  
  public String getAddressCountry()
  {
    return this.rM;
  }
  
  public String getAddressLocality()
  {
    return this.rN;
  }
  
  public String getAddressRegion()
  {
    return this.rO;
  }
  
  public List<ItemScope> getAssociated_media()
  {
    return (ArrayList)this.rP;
  }
  
  public int getAttendeeCount()
  {
    return this.rQ;
  }
  
  public List<ItemScope> getAttendees()
  {
    return (ArrayList)this.rR;
  }
  
  public ItemScope getAudio()
  {
    return this.rS;
  }
  
  public List<ItemScope> getAuthor()
  {
    return (ArrayList)this.rT;
  }
  
  public String getBestRating()
  {
    return this.rU;
  }
  
  public String getBirthDate()
  {
    return this.rV;
  }
  
  public ItemScope getByArtist()
  {
    return this.rW;
  }
  
  public String getCaption()
  {
    return this.rX;
  }
  
  public String getContentSize()
  {
    return this.rY;
  }
  
  public String getContentUrl()
  {
    return this.rZ;
  }
  
  public List<ItemScope> getContributor()
  {
    return (ArrayList)this.sa;
  }
  
  public String getDateCreated()
  {
    return this.sb;
  }
  
  public String getDateModified()
  {
    return this.sc;
  }
  
  public String getDatePublished()
  {
    return this.sd;
  }
  
  public String getDescription()
  {
    return this.mo;
  }
  
  public String getDuration()
  {
    return this.se;
  }
  
  public String getEmbedUrl()
  {
    return this.sf;
  }
  
  public String getEndDate()
  {
    return this.sg;
  }
  
  public String getFamilyName()
  {
    return this.sh;
  }
  
  public String getGender()
  {
    return this.si;
  }
  
  public ItemScope getGeo()
  {
    return this.sj;
  }
  
  public String getGivenName()
  {
    return this.sk;
  }
  
  public String getHeight()
  {
    return this.sl;
  }
  
  public String getId()
  {
    return this.sm;
  }
  
  public String getImage()
  {
    return this.sn;
  }
  
  public ItemScope getInAlbum()
  {
    return this.so;
  }
  
  public double getLatitude()
  {
    return this.oE;
  }
  
  public ItemScope getLocation()
  {
    return this.sp;
  }
  
  public double getLongitude()
  {
    return this.oF;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public ItemScope getPartOfTVSeries()
  {
    return this.sq;
  }
  
  public List<ItemScope> getPerformers()
  {
    return (ArrayList)this.sr;
  }
  
  public String getPlayerType()
  {
    return this.ss;
  }
  
  public String getPostOfficeBoxNumber()
  {
    return this.st;
  }
  
  public String getPostalCode()
  {
    return this.su;
  }
  
  public String getRatingValue()
  {
    return this.sv;
  }
  
  public ItemScope getReviewRating()
  {
    return this.sw;
  }
  
  public String getStartDate()
  {
    return this.sx;
  }
  
  public String getStreetAddress()
  {
    return this.sy;
  }
  
  public String getText()
  {
    return this.sz;
  }
  
  public ItemScope getThumbnail()
  {
    return this.sA;
  }
  
  public String getThumbnailUrl()
  {
    return this.sB;
  }
  
  public String getTickerSymbol()
  {
    return this.sC;
  }
  
  public String getType()
  {
    return this.sD;
  }
  
  public String getUrl()
  {
    return this.hN;
  }
  
  int getVersionCode()
  {
    return this.iM;
  }
  
  public String getWidth()
  {
    return this.sE;
  }
  
  public String getWorstRating()
  {
    return this.sF;
  }
  
  public boolean hasAbout()
  {
    return this.rI.contains(Integer.valueOf(2));
  }
  
  public boolean hasAdditionalName()
  {
    return this.rI.contains(Integer.valueOf(3));
  }
  
  public boolean hasAddress()
  {
    return this.rI.contains(Integer.valueOf(4));
  }
  
  public boolean hasAddressCountry()
  {
    return this.rI.contains(Integer.valueOf(5));
  }
  
  public boolean hasAddressLocality()
  {
    return this.rI.contains(Integer.valueOf(6));
  }
  
  public boolean hasAddressRegion()
  {
    return this.rI.contains(Integer.valueOf(7));
  }
  
  public boolean hasAssociated_media()
  {
    return this.rI.contains(Integer.valueOf(8));
  }
  
  public boolean hasAttendeeCount()
  {
    return this.rI.contains(Integer.valueOf(9));
  }
  
  public boolean hasAttendees()
  {
    return this.rI.contains(Integer.valueOf(10));
  }
  
  public boolean hasAudio()
  {
    return this.rI.contains(Integer.valueOf(11));
  }
  
  public boolean hasAuthor()
  {
    return this.rI.contains(Integer.valueOf(12));
  }
  
  public boolean hasBestRating()
  {
    return this.rI.contains(Integer.valueOf(13));
  }
  
  public boolean hasBirthDate()
  {
    return this.rI.contains(Integer.valueOf(14));
  }
  
  public boolean hasByArtist()
  {
    return this.rI.contains(Integer.valueOf(15));
  }
  
  public boolean hasCaption()
  {
    return this.rI.contains(Integer.valueOf(16));
  }
  
  public boolean hasContentSize()
  {
    return this.rI.contains(Integer.valueOf(17));
  }
  
  public boolean hasContentUrl()
  {
    return this.rI.contains(Integer.valueOf(18));
  }
  
  public boolean hasContributor()
  {
    return this.rI.contains(Integer.valueOf(19));
  }
  
  public boolean hasDateCreated()
  {
    return this.rI.contains(Integer.valueOf(20));
  }
  
  public boolean hasDateModified()
  {
    return this.rI.contains(Integer.valueOf(21));
  }
  
  public boolean hasDatePublished()
  {
    return this.rI.contains(Integer.valueOf(22));
  }
  
  public boolean hasDescription()
  {
    return this.rI.contains(Integer.valueOf(23));
  }
  
  public boolean hasDuration()
  {
    return this.rI.contains(Integer.valueOf(24));
  }
  
  public boolean hasEmbedUrl()
  {
    return this.rI.contains(Integer.valueOf(25));
  }
  
  public boolean hasEndDate()
  {
    return this.rI.contains(Integer.valueOf(26));
  }
  
  public boolean hasFamilyName()
  {
    return this.rI.contains(Integer.valueOf(27));
  }
  
  public boolean hasGender()
  {
    return this.rI.contains(Integer.valueOf(28));
  }
  
  public boolean hasGeo()
  {
    return this.rI.contains(Integer.valueOf(29));
  }
  
  public boolean hasGivenName()
  {
    return this.rI.contains(Integer.valueOf(30));
  }
  
  public boolean hasHeight()
  {
    return this.rI.contains(Integer.valueOf(31));
  }
  
  public boolean hasId()
  {
    return this.rI.contains(Integer.valueOf(32));
  }
  
  public boolean hasImage()
  {
    return this.rI.contains(Integer.valueOf(33));
  }
  
  public boolean hasInAlbum()
  {
    return this.rI.contains(Integer.valueOf(34));
  }
  
  public boolean hasLatitude()
  {
    return this.rI.contains(Integer.valueOf(36));
  }
  
  public boolean hasLocation()
  {
    return this.rI.contains(Integer.valueOf(37));
  }
  
  public boolean hasLongitude()
  {
    return this.rI.contains(Integer.valueOf(38));
  }
  
  public boolean hasName()
  {
    return this.rI.contains(Integer.valueOf(39));
  }
  
  public boolean hasPartOfTVSeries()
  {
    return this.rI.contains(Integer.valueOf(40));
  }
  
  public boolean hasPerformers()
  {
    return this.rI.contains(Integer.valueOf(41));
  }
  
  public boolean hasPlayerType()
  {
    return this.rI.contains(Integer.valueOf(42));
  }
  
  public boolean hasPostOfficeBoxNumber()
  {
    return this.rI.contains(Integer.valueOf(43));
  }
  
  public boolean hasPostalCode()
  {
    return this.rI.contains(Integer.valueOf(44));
  }
  
  public boolean hasRatingValue()
  {
    return this.rI.contains(Integer.valueOf(45));
  }
  
  public boolean hasReviewRating()
  {
    return this.rI.contains(Integer.valueOf(46));
  }
  
  public boolean hasStartDate()
  {
    return this.rI.contains(Integer.valueOf(47));
  }
  
  public boolean hasStreetAddress()
  {
    return this.rI.contains(Integer.valueOf(48));
  }
  
  public boolean hasText()
  {
    return this.rI.contains(Integer.valueOf(49));
  }
  
  public boolean hasThumbnail()
  {
    return this.rI.contains(Integer.valueOf(50));
  }
  
  public boolean hasThumbnailUrl()
  {
    return this.rI.contains(Integer.valueOf(51));
  }
  
  public boolean hasTickerSymbol()
  {
    return this.rI.contains(Integer.valueOf(52));
  }
  
  public boolean hasType()
  {
    return this.rI.contains(Integer.valueOf(53));
  }
  
  public boolean hasUrl()
  {
    return this.rI.contains(Integer.valueOf(54));
  }
  
  public boolean hasWidth()
  {
    return this.rI.contains(Integer.valueOf(55));
  }
  
  public boolean hasWorstRating()
  {
    return this.rI.contains(Integer.valueOf(56));
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
    fr.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fq
 * JD-Core Version:    0.7.0.1
 */