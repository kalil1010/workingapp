package p030K1;

import java.io.IOException;
import p019G1.AbstractC0167a;
import p050R1.C0479g;

/* renamed from: K1.l */
/* loaded from: classes.dex */
public final class C0316l extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ C0320p f970e;

    /* renamed from: f */
    public final /* synthetic */ int f971f;

    /* renamed from: g */
    public final /* synthetic */ C0479g f972g;

    /* renamed from: h */
    public final /* synthetic */ int f973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316l(String str, C0320p c0320p, int i2, C0479g c0479g, int i3, boolean z2) {
        super(str, true);
        this.f970e = c0320p;
        this.f971f = i2;
        this.f972g = c0479g;
        this.f973h = i3;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() {
        try {
            C0302A c0302a = this.f970e.f995k;
            C0479g c0479g = this.f972g;
            int i2 = this.f973h;
            c0302a.getClass();
            c0479g.m1187s(i2);
            this.f970e.f1008x.m877m(this.f971f, 9);
            synchronized (this.f970e) {
                this.f970e.f1010z.remove(Integer.valueOf(this.f971f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
