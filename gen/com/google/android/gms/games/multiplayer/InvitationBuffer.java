package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

public final class InvitationBuffer
  extends f<Invitation>
{
  public InvitationBuffer(d paramd)
  {
    super(paramd);
  }
  
  protected Invitation getEntry(int paramInt1, int paramInt2)
  {
    return new b(this.jf, paramInt1, paramInt2);
  }
  
  protected String getPrimaryDataMarkerColumn()
  {
    return "external_invitation_id";
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationBuffer
 * JD-Core Version:    0.7.0.1
 */