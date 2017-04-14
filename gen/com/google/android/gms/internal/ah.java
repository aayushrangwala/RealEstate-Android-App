package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public final class ah
{
  public static final ai eA = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      str1 = (String)paramAnonymousMap.get("u");
      if (str1 == null)
      {
        cn.q("URL missing from click GMSG.");
        return;
      }
      localUri1 = Uri.parse(str1);
      try
      {
        h localh = paramAnonymouscq.ax();
        if ((localh == null) || (!localh.a(localUri1))) {
          break label121;
        }
        Uri localUri3 = localh.a(localUri1, paramAnonymouscq.getContext());
        localUri2 = localUri3;
      }
      catch (i locali)
      {
        for (;;)
        {
          String str2;
          cn.q("Unable to append parameter to URL: " + str1);
          Uri localUri2 = localUri1;
        }
      }
      str2 = localUri2.toString();
      new cl(paramAnonymouscq.getContext(), paramAnonymouscq.ay().hP, str2).start();
    }
  };
  public static final ai eB = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      bf localbf = paramAnonymouscq.au();
      if (localbf == null)
      {
        cn.q("A GMSG tried to close something that wasn't an overlay.");
        return;
      }
      localbf.close();
    }
  };
  public static final ai eC = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      bf localbf = paramAnonymouscq.au();
      if (localbf == null)
      {
        cn.q("A GMSG tried to use a custom close button on something that wasn't an overlay.");
        return;
      }
      localbf.d("1".equals(paramAnonymousMap.get("custom_close")));
    }
  };
  public static final ai eD = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      String str = (String)paramAnonymousMap.get("u");
      if (str == null)
      {
        cn.q("URL missing from httpTrack GMSG.");
        return;
      }
      new cl(paramAnonymouscq.getContext(), paramAnonymouscq.ay().hP, str).start();
    }
  };
  public static final ai eE = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      cn.o("Received log message: " + (String)paramAnonymousMap.get("string"));
    }
  };
  public static final ai eF = new aj();
  public static final ai eG = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("tx");
      String str2 = (String)paramAnonymousMap.get("ty");
      String str3 = (String)paramAnonymousMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(str3);
        h localh = paramAnonymouscq.ax();
        if (localh != null) {
          localh.g().a(i, j, k);
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        cn.q("Could not parse touch parameters from gmsg.");
      }
    }
  };
  public static final ai eH = new ak();
  public static final ai ez = new ai()
  {
    public void a(cq paramAnonymouscq, Map<String, String> paramAnonymousMap)
    {
      String str1 = (String)paramAnonymousMap.get("urls");
      if (str1 == null)
      {
        cn.q("URLs missing in canOpenURLs GMSG.");
        return;
      }
      String[] arrayOfString1 = str1.split(",");
      HashMap localHashMap = new HashMap();
      PackageManager localPackageManager = paramAnonymouscq.getContext().getPackageManager();
      int i = arrayOfString1.length;
      int j = 0;
      if (j < i)
      {
        String str2 = arrayOfString1[j];
        String[] arrayOfString2 = str2.split(";", 2);
        String str3 = arrayOfString2[0].trim();
        String str4;
        if (arrayOfString2.length > 1)
        {
          str4 = arrayOfString2[1].trim();
          label105:
          if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null) {
            break label158;
          }
        }
        label158:
        for (boolean bool = true;; bool = false)
        {
          localHashMap.put(str2, Boolean.valueOf(bool));
          j++;
          break;
          str4 = "android.intent.action.VIEW";
          break label105;
        }
      }
      paramAnonymouscq.a("openableURLs", localHashMap);
    }
  };
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ah
 * JD-Core Version:    0.7.0.1
 */