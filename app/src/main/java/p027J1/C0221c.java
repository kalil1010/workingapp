package p027J1;

import p021H1.C0197p;
import p050R1.C0479g;
import p050R1.C0483k;
import p050R1.C0488p;
import p050R1.C0496x;
import p050R1.InterfaceC0493u;

/* renamed from: J1.c */
/* loaded from: classes.dex */
public final class C0221c implements InterfaceC0493u {

    /* renamed from: a */
    public final C0483k f788a;

    /* renamed from: b */
    public boolean f789b;

    /* renamed from: c */
    public final /* synthetic */ C0197p f790c;

    public C0221c(C0197p c0197p) {
        this.f790c = c0197p;
        this.f788a = new C0483k(((C0488p) c0197p.f740g).f1500c.mo480a());
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: a */
    public final C0496x mo480a() {
        return this.f788a;
    }

    @Override // p050R1.InterfaceC0493u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f789b) {
            return;
        }
        this.f789b = true;
        ((C0488p) this.f790c.f740g).mo1173d("0\r\n\r\n");
        C0197p c0197p = this.f790c;
        C0483k c0483k = this.f788a;
        c0197p.getClass();
        C0496x c0496x = c0483k.f1485e;
        c0483k.f1485e = C0496x.f1516d;
        c0496x.mo1206a();
        c0496x.mo1207b();
        this.f790c.f734a = 3;
    }

    @Override // p050R1.InterfaceC0493u
    /* renamed from: f */
    public final void mo481f(C0479g c0479g, long j2) {
        if (this.f789b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        C0197p c0197p = this.f790c;
        C0488p c0488p = (C0488p) c0197p.f740g;
        if (c0488p.f1499b) {
            throw new IllegalStateException("closed");
        }
        c0488p.f1498a.m1166A(j2);
        c0488p.m1218g();
        C0488p c0488p2 = (C0488p) c0197p.f740g;
        c0488p2.mo1173d("\r\n");
        c0488p2.mo481f(c0479g, j2);
        c0488p2.mo1173d("\r\n");
    }

    @Override // p050R1.InterfaceC0493u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f789b) {
            return;
        }
        ((C0488p) this.f790c.f740g).flush();
    }
}
