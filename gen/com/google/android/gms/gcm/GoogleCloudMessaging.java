package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
  static GoogleCloudMessaging oo;
  private Context ee;
  private PendingIntent op;
  final BlockingQueue<Intent> oq = new LinkedBlockingQueue();
  private Handler or = new Handler(Looper.getMainLooper())
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      Intent localIntent = (Intent)paramAnonymousMessage.obj;
      GoogleCloudMessaging.this.oq.add(localIntent);
    }
  };
  private Messenger os = new Messenger(this.or);
  
  private void b(String... paramVarArgs)
  {
    String str = c(paramVarArgs);
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.messenger", this.os);
    d(localIntent);
    localIntent.putExtra("sender", str);
    this.ee.startService(localIntent);
  }
  
  private void cj()
  {
    Intent localIntent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
    localIntent.setPackage("com.google.android.gms");
    this.oq.clear();
    localIntent.putExtra("google.messenger", this.os);
    d(localIntent);
    this.ee.startService(localIntent);
  }
  
  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    try
    {
      if (oo == null)
      {
        oo = new GoogleCloudMessaging();
        oo.ee = paramContext;
      }
      GoogleCloudMessaging localGoogleCloudMessaging = oo;
      return localGoogleCloudMessaging;
    }
    finally {}
  }
  
  String c(String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      throw new IllegalArgumentException("No senderIds");
    }
    StringBuilder localStringBuilder = new StringBuilder(paramVarArgs[0]);
    for (int i = 1; i < paramVarArgs.length; i++) {
      localStringBuilder.append(',').append(paramVarArgs[i]);
    }
    return localStringBuilder.toString();
  }
  
  void ck()
  {
    try
    {
      if (this.op != null)
      {
        this.op.cancel();
        this.op = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void close()
  {
    ck();
  }
  
  void d(Intent paramIntent)
  {
    try
    {
      if (this.op == null) {
        this.op = PendingIntent.getBroadcast(this.ee, 0, new Intent(), 0);
      }
      paramIntent.putExtra("app", this.op);
      return;
    }
    finally {}
  }
  
  public String getMessageType(Intent paramIntent)
  {
    String str;
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      str = null;
    }
    do
    {
      return str;
      str = paramIntent.getStringExtra("message_type");
    } while (str != null);
    return "gcm";
  }
  
  public String register(String... paramVarArgs)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    this.oq.clear();
    b(paramVarArgs);
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.oq.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null) {
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    String str1 = localIntent.getStringExtra("registration_id");
    if (str1 != null) {
      return str1;
    }
    localIntent.getStringExtra("error");
    String str2 = localIntent.getStringExtra("error");
    if (str2 != null) {
      throw new IOException(str2);
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    if (paramString1 == null) {
      throw new IllegalArgumentException("Missing 'to'");
    }
    Intent localIntent = new Intent("com.google.android.gcm.intent.SEND");
    localIntent.putExtras(paramBundle);
    d(localIntent);
    localIntent.putExtra("google.to", paramString1);
    localIntent.putExtra("google.message_id", paramString2);
    localIntent.putExtra("google.ttl", Long.toString(paramLong));
    this.ee.sendOrderedBroadcast(localIntent, null);
  }
  
  public void send(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    send(paramString1, paramString2, -1L, paramBundle);
  }
  
  public void unregister()
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    cj();
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.oq.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null) {
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    if (localIntent.getStringExtra("unregistered") != null) {
      return;
    }
    String str = localIntent.getStringExtra("error");
    if (str != null) {
      throw new IOException(str);
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GoogleCloudMessaging
 * JD-Core Version:    0.7.0.1
 */