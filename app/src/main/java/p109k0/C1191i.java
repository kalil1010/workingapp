package p109k0;

import android.graphics.Paint;
import p003B.C0048d;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public final class C1191i extends AbstractC1194l {

    /* renamed from: d */
    public C0048d f4825d;

    /* renamed from: e */
    public float f4826e;

    /* renamed from: f */
    public C0048d f4827f;

    /* renamed from: g */
    public float f4828g;

    /* renamed from: h */
    public float f4829h;

    /* renamed from: i */
    public float f4830i;

    /* renamed from: j */
    public float f4831j;

    /* renamed from: k */
    public float f4832k;

    /* renamed from: l */
    public Paint.Cap f4833l;

    /* renamed from: m */
    public Paint.Join f4834m;

    /* renamed from: n */
    public float f4835n;

    @Override // p109k0.AbstractC1193k
    /* renamed from: a */
    public final boolean mo2832a() {
        return this.f4827f.m178c() || this.f4825d.m178c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p109k0.AbstractC1193k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2833b(int[] r7) {
        /*
            r6 = this;
            B.d r0 = r6.f4827f
            boolean r1 = r0.m178c()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f117d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f115b
            if (r1 == r4) goto L1e
            r0.f115b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            B.d r1 = r6.f4825d
            boolean r4 = r1.m178c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f117d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f115b
            if (r7 == r4) goto L3a
            r1.f115b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p109k0.C1191i.mo2833b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f4829h;
    }

    public int getFillColor() {
        return this.f4827f.f115b;
    }

    public float getStrokeAlpha() {
        return this.f4828g;
    }

    public int getStrokeColor() {
        return this.f4825d.f115b;
    }

    public float getStrokeWidth() {
        return this.f4826e;
    }

    public float getTrimPathEnd() {
        return this.f4831j;
    }

    public float getTrimPathOffset() {
        return this.f4832k;
    }

    public float getTrimPathStart() {
        return this.f4830i;
    }

    public void setFillAlpha(float f) {
        this.f4829h = f;
    }

    public void setFillColor(int i2) {
        this.f4827f.f115b = i2;
    }

    public void setStrokeAlpha(float f) {
        this.f4828g = f;
    }

    public void setStrokeColor(int i2) {
        this.f4825d.f115b = i2;
    }

    public void setStrokeWidth(float f) {
        this.f4826e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f4831j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f4832k = f;
    }

    public void setTrimPathStart(float f) {
        this.f4830i = f;
    }
}
