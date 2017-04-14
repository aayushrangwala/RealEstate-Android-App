package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

public class g
  extends f
{
  private g(Context paramContext, j paramj, k paramk)
  {
    super(paramContext, paramj, paramk);
  }
  
  public static g a(String paramString, Context paramContext)
  {
    a locala = new a();
    a(paramString, paramContext, locala);
    return new g(paramContext, locala, new m(239));
  }
  
  protected void b(Context paramContext)
  {
    long l = 1L;
    super.b(paramContext);
    try
    {
      a locala = f(paramContext);
      String str;
      label63:
      return;
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          if (!locala.isLimitAdTrackingEnabled()) {
            break label63;
          }
          a(28, l);
          str = locala.getId();
          if (str == null) {
            break;
          }
          a(30, str);
          return;
        }
        catch (IOException localIOException2)
        {
          return;
        }
        localIOException1 = localIOException1;
        a(28, 1L);
        return;
        l = 0L;
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
  }
  
  a f(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException
  {
    int i = 0;
    AdvertisingIdClient.Info localInfo;
    String str1;
    try
    {
      localInfo = AdvertisingIdClient.getAdvertisingIdInfo(paramContext);
      str1 = localInfo.getId();
      if ((str1 != null) && (str1.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")))
      {
        byte[] arrayOfByte = new byte[16];
        int j = 0;
        while (i < str1.length())
        {
          if ((i == 8) || (i == 13) || (i == 18) || (i == 23)) {
            i++;
          }
          arrayOfByte[j] = ((byte)((Character.digit(str1.charAt(i), 16) << 4) + Character.digit(str1.charAt(i + 1), 16)));
          j++;
          i += 2;
        }
        str2 = this.di.a(arrayOfByte, true);
      }
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      throw new IOException(localGooglePlayServicesRepairableException);
    }
    for (;;)
    {
      return new a(str2, localInfo.isLimitAdTrackingEnabled());
      String str2 = str1;
    }
  }
  
  class a
  {
    private String dt;
    private boolean du;
    
    public a(String paramString, boolean paramBoolean)
    {
      this.dt = paramString;
      this.du = paramBoolean;
    }
    
    public String getId()
    {
      return this.dt;
    }
    
    public boolean isLimitAdTrackingEnabled()
    {
      return this.du;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.g
 * JD-Core Version:    0.7.0.1
 */