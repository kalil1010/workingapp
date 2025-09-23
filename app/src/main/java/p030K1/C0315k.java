package p030K1;

import java.io.IOException;
import p014E1.AbstractC0145b;
import p107j1.C1180c;
import p128r1.InterfaceC1290a;

/* renamed from: K1.k */
/* loaded from: classes.dex */
public final class C0315k implements InterfaceC1290a {

    /* renamed from: a */
    public final C0324t f968a;

    /* renamed from: b */
    public final /* synthetic */ C0320p f969b;

    public C0315k(C0320p c0320p, C0324t c0324t) {
        this.f969b = c0320p;
        this.f968a = c0324t;
    }

    @Override // p128r1.InterfaceC1290a
    /* renamed from: a */
    public final Object mo349a() throws IOException {
        C0320p c0320p = this.f969b;
        C0324t c0324t = this.f968a;
        try {
        } catch (IOException e3) {
            c0320p.m844g(2, 2, e3);
        } catch (Throwable th) {
            c0320p.m844g(3, 3, null);
            AbstractC0145b.m391d(c0324t);
            throw th;
        }
        if (!c0324t.m853g(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (c0324t.m853g(false, this)) {
        }
        c0320p.m844g(1, 9, null);
        AbstractC0145b.m391d(c0324t);
        return C1180c.f4801c;
    }
}
