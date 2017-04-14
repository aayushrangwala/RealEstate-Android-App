package com.realestate.model;

public class Data
{
  private String desc;
  private int image1;
  private int image2;
  private String title1;
  private String title2;
  
  public Data(String paramString, int paramInt1, int paramInt2)
  {
    this.title1 = paramString;
    this.image1 = paramInt1;
    this.image2 = paramInt2;
  }
  
  public Data(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.title1 = paramString1;
    this.title2 = paramString2;
    this.desc = paramString3;
    this.image1 = paramInt;
  }
  
  public String getDesc()
  {
    return this.desc;
  }
  
  public int getImage1()
  {
    return this.image1;
  }
  
  public int getImage2()
  {
    return this.image2;
  }
  
  public String getTitle1()
  {
    return this.title1;
  }
  
  public String getTitle2()
  {
    return this.title2;
  }
  
  public void setDesc(String paramString)
  {
    this.desc = paramString;
  }
  
  public void setImage1(int paramInt)
  {
    this.image1 = paramInt;
  }
  
  public void setImage2(int paramInt)
  {
    this.image2 = paramInt;
  }
  
  public void setTitle1(String paramString)
  {
    this.title1 = paramString;
  }
  
  public void setTitle2(String paramString)
  {
    this.title2 = paramString;
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.model.Data
 * JD-Core Version:    0.7.0.1
 */