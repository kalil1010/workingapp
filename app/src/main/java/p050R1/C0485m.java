package p050R1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p131s1.AbstractC1326c;

/* renamed from: R1.m */
/* loaded from: classes.dex */
public final class C0485m implements InterfaceC0494v {

    /* renamed from: a */
    public int f1491a;

    /* renamed from: b */
    public boolean f1492b;

    /* renamed from: c */
    public final C0489q f1493c;

    /* renamed from: d */
    public final Inflater f1494d;

    public C0485m(C0489q c0489q, Inflater inflater) {
        this.f1493c = c0489q;
        this.f1494d = inflater;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f1493c.f1503c.mo485a();
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public final long mo486b(C0479g c0479g, long j2) throws DataFormatException, IOException {
        AbstractC1326c.m3062e(c0479g, "sink");
        do {
            long jM1216g = m1216g(c0479g, j2);
            if (jM1216g > 0) {
                return jM1216g;
            }
            Inflater inflater = this.f1494d;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f1493c.m1221g());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1492b) {
            return;
        }
        this.f1494d.end();
        this.f1492b = true;
        this.f1493c.close();
    }

    /* renamed from: g */
    public final long m1216g(C0479g c0479g, long j2) throws DataFormatException, IOException {
        Inflater inflater = this.f1494d;
        AbstractC1326c.m3062e(c0479g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f1492b) {
            throw new IllegalStateException("closed");
        }
        if (j2 != 0) {
            try {
                C0490r c0490rM1189u = c0479g.m1189u(1);
                int iMin = (int) Math.min(j2, 8192 - c0490rM1189u.f1506c);
                boolean zNeedsInput = inflater.needsInput();
                C0489q c0489q = this.f1493c;
                if (zNeedsInput && !c0489q.m1221g()) {
                    C0490r c0490r = c0489q.f1501a.f1479a;
                    AbstractC1326c.m3059b(c0490r);
                    int i2 = c0490r.f1506c;
                    int i3 = c0490r.f1505b;
                    int i4 = i2 - i3;
                    this.f1491a = i4;
                    inflater.setInput(c0490r.f1504a, i3, i4);
                }
                int iInflate = inflater.inflate(c0490rM1189u.f1504a, c0490rM1189u.f1506c, iMin);
                int i5 = this.f1491a;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.f1491a -= remaining;
                    c0489q.m1233s(remaining);
                }
                if (iInflate > 0) {
                    c0490rM1189u.f1506c += iInflate;
                    long j3 = iInflate;
                    c0479g.f1480b += j3;
                    return j3;
                }
                if (c0490rM1189u.f1505b == c0490rM1189u.f1506c) {
                    c0479g.f1479a = c0490rM1189u.m1234a();
                    AbstractC0491s.m1238a(c0490rM1189u);
                }
            } catch (DataFormatException e3) {
                throw new IOException(e3);
            }
        }
        return 0L;
    }
}
