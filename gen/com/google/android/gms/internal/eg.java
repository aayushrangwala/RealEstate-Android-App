package com.google.android.gms.internal;

import android.database.CharArrayBuffer;

public final class eg
{
  public static void b(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    if ((paramCharArrayBuffer.data == null) || (paramCharArrayBuffer.data.length < paramString.length())) {
      paramCharArrayBuffer.data = paramString.toCharArray();
    }
    for (;;)
    {
      paramCharArrayBuffer.sizeCopied = paramString.length();
      return;
      paramString.getChars(0, paramString.length(), paramCharArrayBuffer.data, 0);
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg
 * JD-Core Version:    0.7.0.1
 */