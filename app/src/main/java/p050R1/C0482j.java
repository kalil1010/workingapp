package p050R1;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import p033L1.AbstractC0356d;
import p053S1.AbstractC0501b;
import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1403a;
import p149y1.AbstractC1411i;

/* renamed from: R1.j */
/* loaded from: classes.dex */
public class C0482j implements Serializable, Comparable {

    /* renamed from: d */
    public static final C0482j f1481d = new C0482j(new byte[0]);

    /* renamed from: a */
    public transient int f1482a;

    /* renamed from: b */
    public transient String f1483b;

    /* renamed from: c */
    public final byte[] f1484c;

    public C0482j(byte[] bArr) {
        AbstractC1326c.m3062e(bArr, "data");
        this.f1484c = bArr;
    }

    /* renamed from: a */
    public String mo1195a() {
        byte[] bArr = AbstractC0473a.f1459a;
        byte[] bArr2 = this.f1484c;
        AbstractC1326c.m3062e(bArr2, "$this$encodeBase64");
        AbstractC1326c.m3062e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = bArr2[i2];
            int i4 = i2 + 2;
            byte b3 = bArr2[i2 + 1];
            i2 += 3;
            byte b4 = bArr2[i4];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr3[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr3[i5] = bArr[b4 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b5 = bArr2[i2];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i3 + 2] = b6;
            bArr3[i3 + 3] = b6;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b7 = bArr2[i2];
            byte b8 = bArr2[i6];
            bArr3[i3] = bArr[(b7 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b8 & 15) << 2];
            bArr3[i3 + 3] = (byte) 61;
        }
        return new String(bArr3, AbstractC1403a.f6077a);
    }

    /* renamed from: b */
    public C0482j mo1196b(String str) {
        byte[] bArrDigest = MessageDigest.getInstance(str).digest(this.f1484c);
        AbstractC1326c.m3061d(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C0482j(bArrDigest);
    }

    /* renamed from: c */
    public int mo1197c() {
        return this.f1484c.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0482j c0482j = (C0482j) obj;
        AbstractC1326c.m3062e(c0482j, "other");
        int iMo1197c = mo1197c();
        int iMo1197c2 = c0482j.mo1197c();
        int iMin = Math.min(iMo1197c, iMo1197c2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iMo1200f = mo1200f(i2) & 255;
            int iMo1200f2 = c0482j.mo1200f(i2) & 255;
            if (iMo1200f != iMo1200f2) {
                return iMo1200f < iMo1200f2 ? -1 : 1;
            }
        }
        if (iMo1197c == iMo1197c2) {
            return 0;
        }
        return iMo1197c < iMo1197c2 ? -1 : 1;
    }

    /* renamed from: d */
    public String mo1198d() {
        byte[] bArr = this.f1484c;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = AbstractC0501b.f1535a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public byte[] mo1199e() {
        return this.f1484c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0482j) {
            C0482j c0482j = (C0482j) obj;
            int iMo1197c = c0482j.mo1197c();
            byte[] bArr = this.f1484c;
            if (iMo1197c == bArr.length && c0482j.mo1202h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte mo1200f(int i2) {
        return this.f1484c[i2];
    }

    /* renamed from: g */
    public boolean mo1201g(int i2, C0482j c0482j) {
        AbstractC1326c.m3062e(c0482j, "other");
        return c0482j.mo1202h(0, this.f1484c, 0, i2);
    }

    /* renamed from: h */
    public boolean mo1202h(int i2, byte[] bArr, int i3, int i4) {
        AbstractC1326c.m3062e(bArr, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.f1484c;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && AbstractC0356d.m953c(i2, i3, i4, bArr2, bArr);
    }

    public int hashCode() {
        int i2 = this.f1482a;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f1484c);
        this.f1482a = iHashCode;
        return iHashCode;
    }

    /* renamed from: i */
    public C0482j mo1203i() {
        byte b;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f1484c;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1326c.m3061d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b5 = bArrCopyOf[i3];
                    if (b5 >= b4 && b5 <= b) {
                        bArrCopyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new C0482j(bArrCopyOf);
            }
            i2++;
        }
    }

    /* renamed from: j */
    public final String m1204j() {
        String str = this.f1483b;
        if (str != null) {
            return str;
        }
        byte[] bArrMo1199e = mo1199e();
        AbstractC1326c.m3062e(bArrMo1199e, "$this$toUtf8String");
        String str2 = new String(bArrMo1199e, AbstractC1403a.f6077a);
        this.f1483b = str2;
        return str2;
    }

    /* renamed from: k */
    public void mo1205k(C0479g c0479g, int i2) {
        AbstractC1326c.m3062e(c0479g, "buffer");
        c0479g.m1192x(this.f1484c, i2);
    }

    public String toString() {
        byte b;
        int i2;
        byte[] bArr = this.f1484c;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && 31 >= b3) || (127 <= b3 && 159 >= b3))) || b3 == 65533) {
                    break;
                }
                i4 += b3 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && 31 >= b) || (127 <= b && 159 >= b))) || b == 65533) {
                            break loop0;
                        }
                        i4 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b4 = bArr[i7];
                    if ((b4 & 192) == 128) {
                        int i8 = (b4 ^ 3968) ^ (b3 << 6);
                        if (i8 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && 31 >= i8) || (127 <= i8 && 159 >= i8))) || i8 == 65533) {
                                break;
                            }
                            i4 += i8 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b3 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b5 = bArr[i3 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i9];
                        if ((b6 & 192) == 128) {
                            int i10 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << 12);
                            if (i10 >= 2048) {
                                if (55296 > i10 || 57343 < i10) {
                                    i2 = i5 + 1;
                                    if (i5 == 64) {
                                        break;
                                    }
                                    if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && 31 >= i10) || (127 <= i10 && 159 >= i10))) || i10 == 65533) {
                                        break;
                                    }
                                    i4 += i10 < 65536 ? 1 : 2;
                                    i3 += 3;
                                    i5 = i2;
                                } else if (i5 != 64) {
                                    break;
                                }
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b3 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b7 = bArr[i3 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i3 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i11];
                            if ((b9 & 192) == 128) {
                                int i12 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b3 << 18);
                                if (i12 <= 1114111) {
                                    if (55296 > i12 || 57343 < i12) {
                                        if (i12 >= 65536) {
                                            i2 = i5 + 1;
                                            if (i5 == 64) {
                                                break;
                                            }
                                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && 31 >= i12) || (127 <= i12 && 159 >= i12))) || i12 == 65533) {
                                                break;
                                            }
                                            i4 += i12 < 65536 ? 1 : 2;
                                            i3 += 4;
                                            i5 = i2;
                                        } else if (i5 != 64) {
                                            break;
                                        }
                                    } else if (i5 != 64) {
                                        break;
                                    }
                                } else if (i5 != 64) {
                                    break;
                                }
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if (i5 != 64) {
                break;
            }
        }
        i4 = -1;
        if (i4 != -1) {
            String strM1204j = m1204j();
            String strSubstring = strM1204j.substring(0, i4);
            AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strM3185Z = AbstractC1411i.m3185Z(AbstractC1411i.m3185Z(AbstractC1411i.m3185Z(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= strM1204j.length()) {
                return "[text=" + strM3185Z + ']';
            }
            return "[size=" + bArr.length + " text=" + strM3185Z + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo1198d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new C0482j(AbstractC1206h.m2844o0(bArr, 64))).mo1198d());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
