package p046Q0;

import android.graphics.Typeface;
import p001A0.C0004c;
import p033L1.AbstractC0356d;
import p035M0.C0373b;

/* renamed from: Q0.a */
/* loaded from: classes.dex */
public final class C0455a extends AbstractC0356d {

    /* renamed from: n */
    public final Typeface f1359n;

    /* renamed from: o */
    public final C0004c f1360o;

    /* renamed from: p */
    public boolean f1361p;

    public C0455a(C0004c c0004c, Typeface typeface) {
        this.f1359n = typeface;
        this.f1360o = c0004c;
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: y */
    public final void mo427y(int i2) {
        if (this.f1361p) {
            return;
        }
        C0373b c0373b = (C0373b) this.f1360o.f7b;
        if (c0373b.m1052j(this.f1359n)) {
            c0373b.m1050h(false);
        }
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: z */
    public final void mo428z(Typeface typeface, boolean z2) {
        if (this.f1361p) {
            return;
        }
        C0373b c0373b = (C0373b) this.f1360o.f7b;
        if (c0373b.m1052j(typeface)) {
            c0373b.m1050h(false);
        }
    }
}
