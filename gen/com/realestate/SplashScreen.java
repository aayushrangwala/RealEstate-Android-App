package com.realestate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class SplashScreen
  extends Activity
{
  private boolean isRunning;
  
  private void doFinish()
  {
    try
    {
      if (this.isRunning)
      {
        this.isRunning = false;
        Intent localIntent = new Intent(this, MainActivity.class);
        localIntent.addFlags(67108864);
        startActivity(localIntent);
        finish();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void startSplash()
  {
    new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          Thread.sleep(3000L);
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          return;
        }
        finally
        {
          SplashScreen.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              SplashScreen.this.doFinish();
            }
          });
        }
      }
    }).start();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903051);
    this.isRunning = true;
    startSplash();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      this.isRunning = false;
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.realestate.SplashScreen
 * JD-Core Version:    0.7.0.1
 */