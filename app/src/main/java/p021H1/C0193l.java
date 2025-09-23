package p021H1;

import java.io.Closeable;
import p011D1.C0121k;
import p050R1.C0488p;
import p050R1.C0489q;
import p131s1.AbstractC1326c;

/* renamed from: H1.l */
/* loaded from: classes.dex */
public final class C0193l implements Closeable {

    /* renamed from: a */
    public final C0489q f709a;

    /* renamed from: b */
    public final C0488p f710b;

    /* renamed from: c */
    public final /* synthetic */ C0121k f711c;

    public C0193l(C0121k c0121k, C0489q c0489q, C0488p c0488p) {
        this.f711c = c0121k;
        AbstractC1326c.m3062e(c0489q, "source");
        AbstractC1326c.m3062e(c0488p, "sink");
        this.f709a = c0489q;
        this.f710b = c0488p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f711c.m333a(true, true, null);
    }
}
