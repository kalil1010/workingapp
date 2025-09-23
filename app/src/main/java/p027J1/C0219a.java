package p027J1;

import p001A0.C0004c;
import p011D1.C0124n;
import p050R1.C0489q;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: J1.a */
/* loaded from: classes.dex */
public final class C0219a {

    /* renamed from: a */
    public final /* synthetic */ int f782a;

    /* renamed from: b */
    public long f783b;

    /* renamed from: c */
    public Object f784c;

    public C0219a(C0489q c0489q) {
        this.f782a = 0;
        AbstractC1326c.m3062e(c0489q, "source");
        this.f784c = c0489q;
        this.f783b = 262144;
    }

    /* renamed from: a */
    public void m599a(int i2) {
        if (i2 < 64) {
            this.f783b &= ~(1 << i2);
            return;
        }
        C0219a c0219a = (C0219a) this.f784c;
        if (c0219a != null) {
            c0219a.m599a(i2 - 64);
        }
    }

    /* renamed from: b */
    public int m600b(int i2) {
        C0219a c0219a = (C0219a) this.f784c;
        if (c0219a == null) {
            return i2 >= 64 ? Long.bitCount(this.f783b) : Long.bitCount(this.f783b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f783b & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f783b) + c0219a.m600b(i2 - 64);
    }

    /* renamed from: c */
    public void m601c() {
        if (((C0219a) this.f784c) == null) {
            this.f784c = new C0219a();
        }
    }

    /* renamed from: d */
    public boolean m602d(int i2) {
        if (i2 < 64) {
            return (this.f783b & (1 << i2)) != 0;
        }
        m601c();
        return ((C0219a) this.f784c).m602d(i2 - 64);
    }

    /* renamed from: e */
    public void m603e(int i2, boolean z2) {
        if (i2 >= 64) {
            m601c();
            ((C0219a) this.f784c).m603e(i2 - 64, z2);
            return;
        }
        long j2 = this.f783b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f783b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m607i(i2);
        } else {
            m599a(i2);
        }
        if (z3 || ((C0219a) this.f784c) != null) {
            m601c();
            ((C0219a) this.f784c).m603e(0, z3);
        }
    }

    /* renamed from: f */
    public C0124n m604f() {
        C0004c c0004c = new C0004c(8);
        while (true) {
            String strM1230p = ((C0489q) this.f784c).m1230p(this.f783b);
            this.f783b -= strM1230p.length();
            if (strM1230p.length() == 0) {
                return c0004c.m29p();
            }
            int iM3177R = AbstractC1411i.m3177R(strM1230p, ':', 1, 4);
            if (iM3177R != -1) {
                String strSubstring = strM1230p.substring(0, iM3177R);
                AbstractC1326c.m3061d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = strM1230p.substring(iM3177R + 1);
                AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                c0004c.m28o(strSubstring, strSubstring2);
            } else if (strM1230p.charAt(0) == ':') {
                String strSubstring3 = strM1230p.substring(1);
                AbstractC1326c.m3061d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                c0004c.m28o("", strSubstring3);
            } else {
                c0004c.m28o("", strM1230p);
            }
        }
    }

    /* renamed from: g */
    public boolean m605g(int i2) {
        if (i2 >= 64) {
            m601c();
            return ((C0219a) this.f784c).m605g(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f783b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f783b = j4;
        long j5 = j2 - 1;
        this.f783b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0219a c0219a = (C0219a) this.f784c;
        if (c0219a != null) {
            if (c0219a.m602d(0)) {
                m607i(63);
            }
            ((C0219a) this.f784c).m605g(0);
        }
        return z2;
    }

    /* renamed from: h */
    public void m606h() {
        this.f783b = 0L;
        C0219a c0219a = (C0219a) this.f784c;
        if (c0219a != null) {
            c0219a.m606h();
        }
    }

    /* renamed from: i */
    public void m607i(int i2) {
        if (i2 < 64) {
            this.f783b |= 1 << i2;
        } else {
            m601c();
            ((C0219a) this.f784c).m607i(i2 - 64);
        }
    }

    public String toString() {
        switch (this.f782a) {
            case 1:
                if (((C0219a) this.f784c) == null) {
                    return Long.toBinaryString(this.f783b);
                }
                return ((C0219a) this.f784c).toString() + "xx" + Long.toBinaryString(this.f783b);
            default:
                return super.toString();
        }
    }

    public C0219a() {
        this.f782a = 1;
        this.f783b = 0L;
    }
}
