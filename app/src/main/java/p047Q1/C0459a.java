package p047Q1;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import p027J1.C0224f;
import p050R1.C0479g;
import p050R1.C0485m;
import p050R1.C0489q;

/* renamed from: Q1.a */
/* loaded from: classes.dex */
public final class C0459a implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f1382a;

    /* renamed from: b */
    public final C0479g f1383b;

    /* renamed from: c */
    public final boolean f1384c;

    /* renamed from: d */
    public final Object f1385d;

    /* renamed from: e */
    public final Closeable f1386e;

    public C0459a(int i2, boolean z2) {
        this.f1382a = i2;
        switch (i2) {
            case 1:
                this.f1384c = z2;
                C0479g c0479g = new C0479g();
                this.f1383b = c0479g;
                Inflater inflater = new Inflater(true);
                this.f1385d = inflater;
                this.f1386e = new C0485m(new C0489q(c0479g), inflater);
                break;
            default:
                this.f1384c = z2;
                C0479g c0479g2 = new C0479g();
                this.f1383b = c0479g2;
                Deflater deflater = new Deflater(-1, true);
                this.f1385d = deflater;
                this.f1386e = new C0224f(c0479g2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f1382a) {
            case 0:
                ((C0224f) this.f1386e).close();
                break;
            default:
                ((C0485m) this.f1386e).close();
                break;
        }
    }
}
