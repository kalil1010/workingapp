package p027J1;

import java.io.IOException;
import p021H1.C0194m;
import p021H1.C0197p;
import p050R1.C0479g;
import p050R1.C0483k;
import p050R1.C0489q;
import p050R1.C0496x;
import p050R1.InterfaceC0494v;
import p131s1.AbstractC1326c;

/* renamed from: J1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0220b implements InterfaceC0494v {

    /* renamed from: a */
    public final C0483k f785a;

    /* renamed from: b */
    public boolean f786b;

    /* renamed from: c */
    public final /* synthetic */ C0197p f787c;

    public AbstractC0220b(C0197p c0197p) {
        this.f787c = c0197p;
        this.f785a = new C0483k(((C0489q) c0197p.f739f).f1503c.mo485a());
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: a */
    public final C0496x mo485a() {
        return this.f785a;
    }

    @Override // p050R1.InterfaceC0494v
    /* renamed from: b */
    public long mo486b(C0479g c0479g, long j2) throws IOException {
        C0197p c0197p = this.f787c;
        AbstractC1326c.m3062e(c0479g, "sink");
        try {
            return ((C0489q) c0197p.f739f).mo486b(c0479g, j2);
        } catch (IOException e3) {
            ((C0194m) c0197p.f738e).m516k();
            m608g();
            throw e3;
        }
    }

    /* renamed from: g */
    public final void m608g() {
        C0197p c0197p = this.f787c;
        int i2 = c0197p.f734a;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException("state: " + c0197p.f734a);
        }
        C0483k c0483k = this.f785a;
        C0496x c0496x = c0483k.f1485e;
        c0483k.f1485e = C0496x.f1516d;
        c0496x.mo1206a();
        c0496x.mo1207b();
        c0197p.f734a = 6;
    }
}
