package p027J1;

import java.util.concurrent.TimeUnit;
import p011D1.C0126p;
import p014E1.AbstractC0145b;
import p021H1.C0194m;
import p021H1.C0197p;
import p131s1.AbstractC1326c;

/* renamed from: J1.d */
/* loaded from: classes.dex */
public final class C0222d extends AbstractC0220b {

    /* renamed from: d */
    public long f791d;

    /* renamed from: e */
    public boolean f792e;

    /* renamed from: f */
    public final C0126p f793f;

    /* renamed from: g */
    public final /* synthetic */ C0197p f794g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0222d(C0197p c0197p, C0126p c0126p) {
        super(c0197p);
        AbstractC1326c.m3062e(c0126p, "url");
        this.f794g = c0197p;
        this.f793f = c0126p;
        this.f791d = -1L;
        this.f792e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r10.f792e == false) goto L30;
     */
    @Override // p027J1.AbstractC0220b, p050R1.InterfaceC0494v
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo486b(p050R1.C0479g r11, long r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027J1.C0222d.mo486b(R1.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f786b) {
            return;
        }
        if (this.f792e) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!AbstractC0145b.m396i(this)) {
                ((C0194m) this.f794g.f738e).m516k();
                m608g();
            }
        }
        this.f786b = true;
    }
}
