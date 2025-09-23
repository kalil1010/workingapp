package p046Q0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p033L1.AbstractC0356d;

/* renamed from: Q0.c */
/* loaded from: classes.dex */
public final class C0457c extends AbstractC0356d {

    /* renamed from: n */
    public final /* synthetic */ Context f1364n;

    /* renamed from: o */
    public final /* synthetic */ TextPaint f1365o;

    /* renamed from: p */
    public final /* synthetic */ AbstractC0356d f1366p;

    /* renamed from: q */
    public final /* synthetic */ C0458d f1367q;

    public C0457c(C0458d c0458d, Context context, TextPaint textPaint, AbstractC0356d abstractC0356d) {
        this.f1367q = c0458d;
        this.f1364n = context;
        this.f1365o = textPaint;
        this.f1366p = abstractC0356d;
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: y */
    public final void mo427y(int i2) {
        this.f1366p.mo427y(i2);
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: z */
    public final void mo428z(Typeface typeface, boolean z2) {
        this.f1367q.m1145g(this.f1364n, this.f1365o, typeface);
        this.f1366p.mo428z(typeface, z2);
    }
}
