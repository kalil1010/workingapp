package p030K1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006C.AbstractC0075g;
import p014E1.AbstractC0145b;
import p050R1.C0479g;
import p050R1.C0488p;
import p110k1.AbstractC1206h;
import p124q.AbstractC1271e;
import p131s1.AbstractC1326c;

/* renamed from: K1.x */
/* loaded from: classes.dex */
public final class C0328x implements Closeable {

    /* renamed from: f */
    public static final Logger f1053f = Logger.getLogger(AbstractC0310f.class.getName());

    /* renamed from: a */
    public final C0479g f1054a;

    /* renamed from: b */
    public int f1055b;

    /* renamed from: c */
    public boolean f1056c;

    /* renamed from: d */
    public final C0308d f1057d;

    /* renamed from: e */
    public final C0488p f1058e;

    public C0328x(C0488p c0488p) {
        AbstractC1326c.m3062e(c0488p, "sink");
        this.f1058e = c0488p;
        C0479g c0479g = new C0479g();
        this.f1054a = c0479g;
        this.f1055b = 16384;
        this.f1057d = new C0308d(c0479g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1056c = true;
        this.f1058e.close();
    }

    public final synchronized void flush() {
        if (this.f1056c) {
            throw new IOException("closed");
        }
        this.f1058e.flush();
    }

    /* renamed from: g */
    public final synchronized void m871g(C0303B c0303b) {
        try {
            AbstractC1326c.m3062e(c0303b, "peerSettings");
            if (this.f1056c) {
                throw new IOException("closed");
            }
            int i2 = this.f1055b;
            int i3 = c0303b.f928a;
            if ((i3 & 32) != 0) {
                i2 = c0303b.f929b[5];
            }
            this.f1055b = i2;
            if (((i3 & 2) != 0 ? c0303b.f929b[1] : -1) != -1) {
                C0308d c0308d = this.f1057d;
                int i4 = (i3 & 2) != 0 ? c0303b.f929b[1] : -1;
                c0308d.getClass();
                int iMin = Math.min(i4, 16384);
                int i5 = c0308d.f949c;
                if (i5 != iMin) {
                    if (iMin < i5) {
                        c0308d.f947a = Math.min(c0308d.f947a, iMin);
                    }
                    c0308d.f948b = true;
                    c0308d.f949c = iMin;
                    int i6 = c0308d.f953g;
                    if (iMin < i6) {
                        if (iMin == 0) {
                            C0306b[] c0306bArr = c0308d.f950d;
                            AbstractC1206h.m2845p0(c0306bArr, 0, c0306bArr.length);
                            c0308d.f951e = c0308d.f950d.length - 1;
                            c0308d.f952f = 0;
                            c0308d.f953g = 0;
                        } else {
                            c0308d.m837a(i6 - iMin);
                        }
                    }
                }
            }
            m873i(0, 0, 4, 1);
            this.f1058e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final synchronized void m872h(boolean z2, int i2, C0479g c0479g, int i3) {
        if (this.f1056c) {
            throw new IOException("closed");
        }
        m873i(i2, i3, 0, z2 ? 1 : 0);
        if (i3 > 0) {
            AbstractC1326c.m3059b(c0479g);
            this.f1058e.mo481f(c0479g, i3);
        }
    }

    /* renamed from: i */
    public final void m873i(int i2, int i3, int i4, int i5) {
        Level level = Level.FINE;
        Logger logger = f1053f;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC0310f.m843a(false, i2, i3, i4, i5));
        }
        if (i3 > this.f1055b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1055b + ": " + i3).toString());
        }
        if ((((int) 2147483648L) & i2) != 0) {
            throw new IllegalArgumentException(AbstractC0075g.m236e("reserved bit set: ", i2).toString());
        }
        byte[] bArr = AbstractC0145b.f495a;
        C0488p c0488p = this.f1058e;
        AbstractC1326c.m3062e(c0488p, "$this$writeMedium");
        c0488p.m1219h((i3 >>> 16) & 255);
        c0488p.m1219h((i3 >>> 8) & 255);
        c0488p.m1219h(i3 & 255);
        c0488p.m1219h(i4 & 255);
        c0488p.m1219h(i5 & 255);
        c0488p.m1220i(i2 & Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final synchronized void m874j(int i2, int i3, byte[] bArr) {
        AbstractC0075g.m240i("errorCode", i3);
        if (this.f1056c) {
            throw new IOException("closed");
        }
        if (AbstractC1271e.m2966a(i3) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m873i(0, bArr.length + 8, 7, 0);
        this.f1058e.m1220i(i2);
        this.f1058e.m1220i(AbstractC1271e.m2966a(i3));
        if (bArr.length != 0) {
            C0488p c0488p = this.f1058e;
            if (c0488p.f1499b) {
                throw new IllegalStateException("closed");
            }
            c0488p.f1498a.m1191w(bArr);
            c0488p.m1218g();
        }
        this.f1058e.flush();
    }

    /* renamed from: k */
    public final synchronized void m875k(boolean z2, int i2, ArrayList arrayList) {
        if (this.f1056c) {
            throw new IOException("closed");
        }
        this.f1057d.m840d(arrayList);
        long j2 = this.f1054a.f1480b;
        long jMin = Math.min(this.f1055b, j2);
        int i3 = j2 == jMin ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        m873i(i2, (int) jMin, 1, i3);
        this.f1058e.mo481f(this.f1054a, jMin);
        if (j2 > jMin) {
            long j3 = j2 - jMin;
            while (j3 > 0) {
                long jMin2 = Math.min(this.f1055b, j3);
                j3 -= jMin2;
                m873i(i2, (int) jMin2, 9, j3 == 0 ? 4 : 0);
                this.f1058e.mo481f(this.f1054a, jMin2);
            }
        }
    }

    /* renamed from: l */
    public final synchronized void m876l(int i2, int i3, boolean z2) {
        if (this.f1056c) {
            throw new IOException("closed");
        }
        m873i(0, 8, 6, z2 ? 1 : 0);
        this.f1058e.m1220i(i2);
        this.f1058e.m1220i(i3);
        this.f1058e.flush();
    }

    /* renamed from: m */
    public final synchronized void m877m(int i2, int i3) {
        AbstractC0075g.m240i("errorCode", i3);
        if (this.f1056c) {
            throw new IOException("closed");
        }
        if (AbstractC1271e.m2966a(i3) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m873i(i2, 4, 3, 0);
        this.f1058e.m1220i(AbstractC1271e.m2966a(i3));
        this.f1058e.flush();
    }

    /* renamed from: n */
    public final synchronized void m878n(int i2, long j2) {
        if (this.f1056c) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        m873i(i2, 4, 8, 0);
        this.f1058e.m1220i((int) j2);
        this.f1058e.flush();
    }
}
