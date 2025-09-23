package p046Q0;

import android.graphics.Typeface;
import p003B.AbstractC0046b;
import p033L1.AbstractC0356d;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C0456b extends AbstractC0046b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0356d f1362h;

    /* renamed from: i */
    public final /* synthetic */ C0458d f1363i;

    public C0456b(C0458d c0458d, AbstractC0356d abstractC0356d) {
        this.f1363i = c0458d;
        this.f1362h = abstractC0356d;
    }

    @Override // p003B.AbstractC0046b
    /* renamed from: g */
    public final void mo172g(int i2) {
        this.f1363i.f1380m = true;
        this.f1362h.mo427y(i2);
    }

    @Override // p003B.AbstractC0046b
    /* renamed from: h */
    public final void mo173h(Typeface typeface) {
        C0458d c0458d = this.f1363i;
        c0458d.f1381n = Typeface.create(typeface, c0458d.f1370c);
        c0458d.f1380m = true;
        this.f1362h.mo428z(c0458d.f1381n, false);
    }
}
