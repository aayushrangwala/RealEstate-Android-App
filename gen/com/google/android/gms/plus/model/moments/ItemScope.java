package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.fq;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract interface ItemScope
  extends Freezable<ItemScope>
{
  public abstract ItemScope getAbout();
  
  public abstract List<String> getAdditionalName();
  
  public abstract ItemScope getAddress();
  
  public abstract String getAddressCountry();
  
  public abstract String getAddressLocality();
  
  public abstract String getAddressRegion();
  
  public abstract List<ItemScope> getAssociated_media();
  
  public abstract int getAttendeeCount();
  
  public abstract List<ItemScope> getAttendees();
  
  public abstract ItemScope getAudio();
  
  public abstract List<ItemScope> getAuthor();
  
  public abstract String getBestRating();
  
  public abstract String getBirthDate();
  
  public abstract ItemScope getByArtist();
  
  public abstract String getCaption();
  
  public abstract String getContentSize();
  
  public abstract String getContentUrl();
  
  public abstract List<ItemScope> getContributor();
  
  public abstract String getDateCreated();
  
  public abstract String getDateModified();
  
  public abstract String getDatePublished();
  
  public abstract String getDescription();
  
  public abstract String getDuration();
  
  public abstract String getEmbedUrl();
  
  public abstract String getEndDate();
  
  public abstract String getFamilyName();
  
  public abstract String getGender();
  
  public abstract ItemScope getGeo();
  
  public abstract String getGivenName();
  
  public abstract String getHeight();
  
  public abstract String getId();
  
  public abstract String getImage();
  
  public abstract ItemScope getInAlbum();
  
  public abstract double getLatitude();
  
  public abstract ItemScope getLocation();
  
  public abstract double getLongitude();
  
  public abstract String getName();
  
  public abstract ItemScope getPartOfTVSeries();
  
  public abstract List<ItemScope> getPerformers();
  
  public abstract String getPlayerType();
  
  public abstract String getPostOfficeBoxNumber();
  
  public abstract String getPostalCode();
  
  public abstract String getRatingValue();
  
  public abstract ItemScope getReviewRating();
  
  public abstract String getStartDate();
  
  public abstract String getStreetAddress();
  
  public abstract String getText();
  
  public abstract ItemScope getThumbnail();
  
  public abstract String getThumbnailUrl();
  
  public abstract String getTickerSymbol();
  
  public abstract String getType();
  
  public abstract String getUrl();
  
  public abstract String getWidth();
  
  public abstract String getWorstRating();
  
  public abstract boolean hasAbout();
  
  public abstract boolean hasAdditionalName();
  
  public abstract boolean hasAddress();
  
  public abstract boolean hasAddressCountry();
  
  public abstract boolean hasAddressLocality();
  
  public abstract boolean hasAddressRegion();
  
  public abstract boolean hasAssociated_media();
  
  public abstract boolean hasAttendeeCount();
  
  public abstract boolean hasAttendees();
  
  public abstract boolean hasAudio();
  
  public abstract boolean hasAuthor();
  
  public abstract boolean hasBestRating();
  
  public abstract boolean hasBirthDate();
  
  public abstract boolean hasByArtist();
  
  public abstract boolean hasCaption();
  
  public abstract boolean hasContentSize();
  
  public abstract boolean hasContentUrl();
  
  public abstract boolean hasContributor();
  
  public abstract boolean hasDateCreated();
  
  public abstract boolean hasDateModified();
  
  public abstract boolean hasDatePublished();
  
  public abstract boolean hasDescription();
  
  public abstract boolean hasDuration();
  
  public abstract boolean hasEmbedUrl();
  
  public abstract boolean hasEndDate();
  
  public abstract boolean hasFamilyName();
  
  public abstract boolean hasGender();
  
  public abstract boolean hasGeo();
  
  public abstract boolean hasGivenName();
  
  public abstract boolean hasHeight();
  
  public abstract boolean hasId();
  
  public abstract boolean hasImage();
  
  public abstract boolean hasInAlbum();
  
  public abstract boolean hasLatitude();
  
  public abstract boolean hasLocation();
  
  public abstract boolean hasLongitude();
  
  public abstract boolean hasName();
  
  public abstract boolean hasPartOfTVSeries();
  
  public abstract boolean hasPerformers();
  
  public abstract boolean hasPlayerType();
  
  public abstract boolean hasPostOfficeBoxNumber();
  
  public abstract boolean hasPostalCode();
  
  public abstract boolean hasRatingValue();
  
  public abstract boolean hasReviewRating();
  
  public abstract boolean hasStartDate();
  
  public abstract boolean hasStreetAddress();
  
  public abstract boolean hasText();
  
  public abstract boolean hasThumbnail();
  
  public abstract boolean hasThumbnailUrl();
  
  public abstract boolean hasTickerSymbol();
  
  public abstract boolean hasType();
  
  public abstract boolean hasUrl();
  
  public abstract boolean hasWidth();
  
  public abstract boolean hasWorstRating();
  
  public static class Builder
  {
    private String hN;
    private String mName;
    private String mo;
    private double oE;
    private double oF;
    private final Set<Integer> rI = new HashSet();
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
    
    public ItemScope build()
    {
      return new fq(this.rI, this.rJ, this.rK, this.rL, this.rM, this.rN, this.rO, this.rP, this.rQ, this.rR, this.rS, this.rT, this.rU, this.rV, this.rW, this.rX, this.rY, this.rZ, this.sa, this.sb, this.sc, this.sd, this.mo, this.se, this.sf, this.sg, this.sh, this.si, this.sj, this.sk, this.sl, this.sm, this.sn, this.so, this.oE, this.sp, this.oF, this.mName, this.sq, this.sr, this.ss, this.st, this.su, this.sv, this.sw, this.sx, this.sy, this.sz, this.sA, this.sB, this.sC, this.sD, this.hN, this.sE, this.sF);
    }
    
    public Builder setAbout(ItemScope paramItemScope)
    {
      this.rJ = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(2));
      return this;
    }
    
    public Builder setAdditionalName(List<String> paramList)
    {
      this.rK = paramList;
      this.rI.add(Integer.valueOf(3));
      return this;
    }
    
    public Builder setAddress(ItemScope paramItemScope)
    {
      this.rL = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(4));
      return this;
    }
    
    public Builder setAddressCountry(String paramString)
    {
      this.rM = paramString;
      this.rI.add(Integer.valueOf(5));
      return this;
    }
    
    public Builder setAddressLocality(String paramString)
    {
      this.rN = paramString;
      this.rI.add(Integer.valueOf(6));
      return this;
    }
    
    public Builder setAddressRegion(String paramString)
    {
      this.rO = paramString;
      this.rI.add(Integer.valueOf(7));
      return this;
    }
    
    public Builder setAssociated_media(List<ItemScope> paramList)
    {
      this.rP = paramList;
      this.rI.add(Integer.valueOf(8));
      return this;
    }
    
    public Builder setAttendeeCount(int paramInt)
    {
      this.rQ = paramInt;
      this.rI.add(Integer.valueOf(9));
      return this;
    }
    
    public Builder setAttendees(List<ItemScope> paramList)
    {
      this.rR = paramList;
      this.rI.add(Integer.valueOf(10));
      return this;
    }
    
    public Builder setAudio(ItemScope paramItemScope)
    {
      this.rS = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(11));
      return this;
    }
    
    public Builder setAuthor(List<ItemScope> paramList)
    {
      this.rT = paramList;
      this.rI.add(Integer.valueOf(12));
      return this;
    }
    
    public Builder setBestRating(String paramString)
    {
      this.rU = paramString;
      this.rI.add(Integer.valueOf(13));
      return this;
    }
    
    public Builder setBirthDate(String paramString)
    {
      this.rV = paramString;
      this.rI.add(Integer.valueOf(14));
      return this;
    }
    
    public Builder setByArtist(ItemScope paramItemScope)
    {
      this.rW = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(15));
      return this;
    }
    
    public Builder setCaption(String paramString)
    {
      this.rX = paramString;
      this.rI.add(Integer.valueOf(16));
      return this;
    }
    
    public Builder setContentSize(String paramString)
    {
      this.rY = paramString;
      this.rI.add(Integer.valueOf(17));
      return this;
    }
    
    public Builder setContentUrl(String paramString)
    {
      this.rZ = paramString;
      this.rI.add(Integer.valueOf(18));
      return this;
    }
    
    public Builder setContributor(List<ItemScope> paramList)
    {
      this.sa = paramList;
      this.rI.add(Integer.valueOf(19));
      return this;
    }
    
    public Builder setDateCreated(String paramString)
    {
      this.sb = paramString;
      this.rI.add(Integer.valueOf(20));
      return this;
    }
    
    public Builder setDateModified(String paramString)
    {
      this.sc = paramString;
      this.rI.add(Integer.valueOf(21));
      return this;
    }
    
    public Builder setDatePublished(String paramString)
    {
      this.sd = paramString;
      this.rI.add(Integer.valueOf(22));
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      this.mo = paramString;
      this.rI.add(Integer.valueOf(23));
      return this;
    }
    
    public Builder setDuration(String paramString)
    {
      this.se = paramString;
      this.rI.add(Integer.valueOf(24));
      return this;
    }
    
    public Builder setEmbedUrl(String paramString)
    {
      this.sf = paramString;
      this.rI.add(Integer.valueOf(25));
      return this;
    }
    
    public Builder setEndDate(String paramString)
    {
      this.sg = paramString;
      this.rI.add(Integer.valueOf(26));
      return this;
    }
    
    public Builder setFamilyName(String paramString)
    {
      this.sh = paramString;
      this.rI.add(Integer.valueOf(27));
      return this;
    }
    
    public Builder setGender(String paramString)
    {
      this.si = paramString;
      this.rI.add(Integer.valueOf(28));
      return this;
    }
    
    public Builder setGeo(ItemScope paramItemScope)
    {
      this.sj = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(29));
      return this;
    }
    
    public Builder setGivenName(String paramString)
    {
      this.sk = paramString;
      this.rI.add(Integer.valueOf(30));
      return this;
    }
    
    public Builder setHeight(String paramString)
    {
      this.sl = paramString;
      this.rI.add(Integer.valueOf(31));
      return this;
    }
    
    public Builder setId(String paramString)
    {
      this.sm = paramString;
      this.rI.add(Integer.valueOf(32));
      return this;
    }
    
    public Builder setImage(String paramString)
    {
      this.sn = paramString;
      this.rI.add(Integer.valueOf(33));
      return this;
    }
    
    public Builder setInAlbum(ItemScope paramItemScope)
    {
      this.so = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(34));
      return this;
    }
    
    public Builder setLatitude(double paramDouble)
    {
      this.oE = paramDouble;
      this.rI.add(Integer.valueOf(36));
      return this;
    }
    
    public Builder setLocation(ItemScope paramItemScope)
    {
      this.sp = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(37));
      return this;
    }
    
    public Builder setLongitude(double paramDouble)
    {
      this.oF = paramDouble;
      this.rI.add(Integer.valueOf(38));
      return this;
    }
    
    public Builder setName(String paramString)
    {
      this.mName = paramString;
      this.rI.add(Integer.valueOf(39));
      return this;
    }
    
    public Builder setPartOfTVSeries(ItemScope paramItemScope)
    {
      this.sq = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(40));
      return this;
    }
    
    public Builder setPerformers(List<ItemScope> paramList)
    {
      this.sr = paramList;
      this.rI.add(Integer.valueOf(41));
      return this;
    }
    
    public Builder setPlayerType(String paramString)
    {
      this.ss = paramString;
      this.rI.add(Integer.valueOf(42));
      return this;
    }
    
    public Builder setPostOfficeBoxNumber(String paramString)
    {
      this.st = paramString;
      this.rI.add(Integer.valueOf(43));
      return this;
    }
    
    public Builder setPostalCode(String paramString)
    {
      this.su = paramString;
      this.rI.add(Integer.valueOf(44));
      return this;
    }
    
    public Builder setRatingValue(String paramString)
    {
      this.sv = paramString;
      this.rI.add(Integer.valueOf(45));
      return this;
    }
    
    public Builder setReviewRating(ItemScope paramItemScope)
    {
      this.sw = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(46));
      return this;
    }
    
    public Builder setStartDate(String paramString)
    {
      this.sx = paramString;
      this.rI.add(Integer.valueOf(47));
      return this;
    }
    
    public Builder setStreetAddress(String paramString)
    {
      this.sy = paramString;
      this.rI.add(Integer.valueOf(48));
      return this;
    }
    
    public Builder setText(String paramString)
    {
      this.sz = paramString;
      this.rI.add(Integer.valueOf(49));
      return this;
    }
    
    public Builder setThumbnail(ItemScope paramItemScope)
    {
      this.sA = ((fq)paramItemScope);
      this.rI.add(Integer.valueOf(50));
      return this;
    }
    
    public Builder setThumbnailUrl(String paramString)
    {
      this.sB = paramString;
      this.rI.add(Integer.valueOf(51));
      return this;
    }
    
    public Builder setTickerSymbol(String paramString)
    {
      this.sC = paramString;
      this.rI.add(Integer.valueOf(52));
      return this;
    }
    
    public Builder setType(String paramString)
    {
      this.sD = paramString;
      this.rI.add(Integer.valueOf(53));
      return this;
    }
    
    public Builder setUrl(String paramString)
    {
      this.hN = paramString;
      this.rI.add(Integer.valueOf(54));
      return this;
    }
    
    public Builder setWidth(String paramString)
    {
      this.sE = paramString;
      this.rI.add(Integer.valueOf(55));
      return this;
    }
    
    public Builder setWorstRating(String paramString)
    {
      this.sF = paramString;
      this.rI.add(Integer.valueOf(56));
      return this;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.ItemScope
 * JD-Core Version:    0.7.0.1
 */