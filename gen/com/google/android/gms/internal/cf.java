package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class cf
{
  private static final Object gL = new Object();
  public static final String hB;
  private static BigInteger hC = BigInteger.ONE;
  
  static
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    Object localObject = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (i < 2) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        String str = new BigInteger(1, arrayOfByte3).toString();
        localObject = str;
        label105:
        i++;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label105;
      }
    }
    hB = (String)localObject;
  }
  
  public static String al()
  {
    synchronized (gL)
    {
      String str = hC.toString();
      hC.add(BigInteger.ONE);
      return str;
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf
 * JD-Core Version:    0.7.0.1
 */