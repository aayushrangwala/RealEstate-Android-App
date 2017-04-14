package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class fr
  implements Parcelable.Creator<fq>
{
  static void a(fq paramfq, Parcel paramParcel, int paramInt)
  {
    int i = b.k(paramParcel);
    Set localSet = paramfq.di();
    if (localSet.contains(Integer.valueOf(1))) {
      b.c(paramParcel, 1, paramfq.getVersionCode());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      b.a(paramParcel, 2, paramfq.dj(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      b.a(paramParcel, 3, paramfq.getAdditionalName(), true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      b.a(paramParcel, 4, paramfq.dk(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      b.a(paramParcel, 5, paramfq.getAddressCountry(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      b.a(paramParcel, 6, paramfq.getAddressLocality(), true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      b.a(paramParcel, 7, paramfq.getAddressRegion(), true);
    }
    if (localSet.contains(Integer.valueOf(8))) {
      b.b(paramParcel, 8, paramfq.dl(), true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      b.c(paramParcel, 9, paramfq.getAttendeeCount());
    }
    if (localSet.contains(Integer.valueOf(10))) {
      b.b(paramParcel, 10, paramfq.dm(), true);
    }
    if (localSet.contains(Integer.valueOf(11))) {
      b.a(paramParcel, 11, paramfq.dn(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(12))) {
      b.b(paramParcel, 12, paramfq.jdMethod_do(), true);
    }
    if (localSet.contains(Integer.valueOf(13))) {
      b.a(paramParcel, 13, paramfq.getBestRating(), true);
    }
    if (localSet.contains(Integer.valueOf(14))) {
      b.a(paramParcel, 14, paramfq.getBirthDate(), true);
    }
    if (localSet.contains(Integer.valueOf(15))) {
      b.a(paramParcel, 15, paramfq.dp(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(17))) {
      b.a(paramParcel, 17, paramfq.getContentSize(), true);
    }
    if (localSet.contains(Integer.valueOf(16))) {
      b.a(paramParcel, 16, paramfq.getCaption(), true);
    }
    if (localSet.contains(Integer.valueOf(19))) {
      b.b(paramParcel, 19, paramfq.dq(), true);
    }
    if (localSet.contains(Integer.valueOf(18))) {
      b.a(paramParcel, 18, paramfq.getContentUrl(), true);
    }
    if (localSet.contains(Integer.valueOf(21))) {
      b.a(paramParcel, 21, paramfq.getDateModified(), true);
    }
    if (localSet.contains(Integer.valueOf(20))) {
      b.a(paramParcel, 20, paramfq.getDateCreated(), true);
    }
    if (localSet.contains(Integer.valueOf(23))) {
      b.a(paramParcel, 23, paramfq.getDescription(), true);
    }
    if (localSet.contains(Integer.valueOf(22))) {
      b.a(paramParcel, 22, paramfq.getDatePublished(), true);
    }
    if (localSet.contains(Integer.valueOf(25))) {
      b.a(paramParcel, 25, paramfq.getEmbedUrl(), true);
    }
    if (localSet.contains(Integer.valueOf(24))) {
      b.a(paramParcel, 24, paramfq.getDuration(), true);
    }
    if (localSet.contains(Integer.valueOf(27))) {
      b.a(paramParcel, 27, paramfq.getFamilyName(), true);
    }
    if (localSet.contains(Integer.valueOf(26))) {
      b.a(paramParcel, 26, paramfq.getEndDate(), true);
    }
    if (localSet.contains(Integer.valueOf(29))) {
      b.a(paramParcel, 29, paramfq.dr(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(28))) {
      b.a(paramParcel, 28, paramfq.getGender(), true);
    }
    if (localSet.contains(Integer.valueOf(31))) {
      b.a(paramParcel, 31, paramfq.getHeight(), true);
    }
    if (localSet.contains(Integer.valueOf(30))) {
      b.a(paramParcel, 30, paramfq.getGivenName(), true);
    }
    if (localSet.contains(Integer.valueOf(34))) {
      b.a(paramParcel, 34, paramfq.ds(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(32))) {
      b.a(paramParcel, 32, paramfq.getId(), true);
    }
    if (localSet.contains(Integer.valueOf(33))) {
      b.a(paramParcel, 33, paramfq.getImage(), true);
    }
    if (localSet.contains(Integer.valueOf(38))) {
      b.a(paramParcel, 38, paramfq.getLongitude());
    }
    if (localSet.contains(Integer.valueOf(39))) {
      b.a(paramParcel, 39, paramfq.getName(), true);
    }
    if (localSet.contains(Integer.valueOf(36))) {
      b.a(paramParcel, 36, paramfq.getLatitude());
    }
    if (localSet.contains(Integer.valueOf(37))) {
      b.a(paramParcel, 37, paramfq.dt(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(42))) {
      b.a(paramParcel, 42, paramfq.getPlayerType(), true);
    }
    if (localSet.contains(Integer.valueOf(43))) {
      b.a(paramParcel, 43, paramfq.getPostOfficeBoxNumber(), true);
    }
    if (localSet.contains(Integer.valueOf(40))) {
      b.a(paramParcel, 40, paramfq.du(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(41))) {
      b.b(paramParcel, 41, paramfq.dv(), true);
    }
    if (localSet.contains(Integer.valueOf(46))) {
      b.a(paramParcel, 46, paramfq.dw(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(47))) {
      b.a(paramParcel, 47, paramfq.getStartDate(), true);
    }
    if (localSet.contains(Integer.valueOf(44))) {
      b.a(paramParcel, 44, paramfq.getPostalCode(), true);
    }
    if (localSet.contains(Integer.valueOf(45))) {
      b.a(paramParcel, 45, paramfq.getRatingValue(), true);
    }
    if (localSet.contains(Integer.valueOf(51))) {
      b.a(paramParcel, 51, paramfq.getThumbnailUrl(), true);
    }
    if (localSet.contains(Integer.valueOf(50))) {
      b.a(paramParcel, 50, paramfq.dx(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(49))) {
      b.a(paramParcel, 49, paramfq.getText(), true);
    }
    if (localSet.contains(Integer.valueOf(48))) {
      b.a(paramParcel, 48, paramfq.getStreetAddress(), true);
    }
    if (localSet.contains(Integer.valueOf(55))) {
      b.a(paramParcel, 55, paramfq.getWidth(), true);
    }
    if (localSet.contains(Integer.valueOf(54))) {
      b.a(paramParcel, 54, paramfq.getUrl(), true);
    }
    if (localSet.contains(Integer.valueOf(53))) {
      b.a(paramParcel, 53, paramfq.getType(), true);
    }
    if (localSet.contains(Integer.valueOf(52))) {
      b.a(paramParcel, 52, paramfq.getTickerSymbol(), true);
    }
    if (localSet.contains(Integer.valueOf(56))) {
      b.a(paramParcel, 56, paramfq.getWorstRating(), true);
    }
    b.C(paramParcel, i);
  }
  
  public fq B(Parcel paramParcel)
  {
    int i = a.j(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    Object localObject1 = null;
    ArrayList localArrayList1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    ArrayList localArrayList2 = null;
    int k = 0;
    ArrayList localArrayList3 = null;
    Object localObject3 = null;
    ArrayList localArrayList4 = null;
    String str4 = null;
    String str5 = null;
    Object localObject4 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    ArrayList localArrayList5 = null;
    String str9 = null;
    String str10 = null;
    String str11 = null;
    String str12 = null;
    String str13 = null;
    String str14 = null;
    String str15 = null;
    String str16 = null;
    String str17 = null;
    Object localObject5 = null;
    String str18 = null;
    String str19 = null;
    String str20 = null;
    String str21 = null;
    Object localObject6 = null;
    double d1 = 0.0D;
    Object localObject7 = null;
    double d2 = 0.0D;
    String str22 = null;
    Object localObject8 = null;
    ArrayList localArrayList6 = null;
    String str23 = null;
    String str24 = null;
    String str25 = null;
    String str26 = null;
    Object localObject9 = null;
    String str27 = null;
    String str28 = null;
    String str29 = null;
    Object localObject10 = null;
    String str30 = null;
    String str31 = null;
    String str32 = null;
    String str33 = null;
    String str34 = null;
    String str35 = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.i(paramParcel);
      switch (a.y(m))
      {
      case 35: 
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.f(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        fq localfq10 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(2));
        localObject1 = localfq10;
        break;
      case 3: 
        localArrayList1 = a.x(paramParcel, m);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        fq localfq9 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(4));
        localObject2 = localfq9;
        break;
      case 5: 
        str1 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        str2 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        str3 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(7));
        break;
      case 8: 
        localArrayList2 = a.c(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(8));
        break;
      case 9: 
        k = a.f(paramParcel, m);
        localHashSet.add(Integer.valueOf(9));
        break;
      case 10: 
        localArrayList3 = a.c(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(10));
        break;
      case 11: 
        fq localfq8 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(11));
        localObject3 = localfq8;
        break;
      case 12: 
        localArrayList4 = a.c(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(12));
        break;
      case 13: 
        str4 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(13));
        break;
      case 14: 
        str5 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(14));
        break;
      case 15: 
        fq localfq7 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(15));
        localObject4 = localfq7;
        break;
      case 17: 
        str7 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(17));
        break;
      case 16: 
        str6 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(16));
        break;
      case 19: 
        localArrayList5 = a.c(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(19));
        break;
      case 18: 
        str8 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(18));
        break;
      case 21: 
        str10 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(21));
        break;
      case 20: 
        str9 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(20));
        break;
      case 23: 
        str12 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(23));
        break;
      case 22: 
        str11 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(22));
        break;
      case 25: 
        str14 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(25));
        break;
      case 24: 
        str13 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(24));
        break;
      case 27: 
        str16 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(27));
        break;
      case 26: 
        str15 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(26));
        break;
      case 29: 
        fq localfq6 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(29));
        localObject5 = localfq6;
        break;
      case 28: 
        str17 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(28));
        break;
      case 31: 
        str19 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(31));
        break;
      case 30: 
        str18 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(30));
        break;
      case 34: 
        fq localfq5 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(34));
        localObject6 = localfq5;
        break;
      case 32: 
        str20 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(32));
        break;
      case 33: 
        str21 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(33));
        break;
      case 38: 
        d2 = a.j(paramParcel, m);
        localHashSet.add(Integer.valueOf(38));
        break;
      case 39: 
        str22 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(39));
        break;
      case 36: 
        d1 = a.j(paramParcel, m);
        localHashSet.add(Integer.valueOf(36));
        break;
      case 37: 
        fq localfq4 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(37));
        localObject7 = localfq4;
        break;
      case 42: 
        str23 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(42));
        break;
      case 43: 
        str24 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(43));
        break;
      case 40: 
        fq localfq3 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(40));
        localObject8 = localfq3;
        break;
      case 41: 
        localArrayList6 = a.c(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(41));
        break;
      case 46: 
        fq localfq2 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(46));
        localObject9 = localfq2;
        break;
      case 47: 
        str27 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(47));
        break;
      case 44: 
        str25 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(44));
        break;
      case 45: 
        str26 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(45));
        break;
      case 51: 
        str30 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(51));
        break;
      case 50: 
        fq localfq1 = (fq)a.a(paramParcel, m, fq.CREATOR);
        localHashSet.add(Integer.valueOf(50));
        localObject10 = localfq1;
        break;
      case 49: 
        str29 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(49));
        break;
      case 48: 
        str28 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(48));
        break;
      case 55: 
        str34 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(55));
        break;
      case 54: 
        str33 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(54));
        break;
      case 53: 
        str32 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(53));
        break;
      case 52: 
        str31 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(52));
        break;
      case 56: 
        str35 = a.l(paramParcel, m);
        localHashSet.add(Integer.valueOf(56));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new fq(localHashSet, j, localObject1, localArrayList1, localObject2, str1, str2, str3, localArrayList2, k, localArrayList3, localObject3, localArrayList4, str4, str5, localObject4, str6, str7, str8, localArrayList5, str9, str10, str11, str12, str13, str14, str15, str16, str17, localObject5, str18, str19, str20, str21, localObject6, d1, localObject7, d2, str22, localObject8, localArrayList6, str23, str24, str25, str26, localObject9, str27, str28, str29, localObject10, str30, str31, str32, str33, str34, str35);
  }
  
  public fq[] ag(int paramInt)
  {
    return new fq[paramInt];
  }
}


/* Location:           C:\Users\Aayush Rangwala\Desktop\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fr
 * JD-Core Version:    0.7.0.1
 */