package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public class dc
  implements DialogInterface.OnClickListener
{
  private final Activity fD;
  private final int ky;
  private final Intent mIntent;
  
  public dc(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.fD = paramActivity;
    this.mIntent = paramIntent;
    this.ky = paramInt;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if (this.mIntent != null) {
        this.fD.startActivityForResult(this.mIntent, this.ky);
      }
      paramDialogInterface.dismiss();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dc
 * JD-Core Version:    0.7.0.1
 */