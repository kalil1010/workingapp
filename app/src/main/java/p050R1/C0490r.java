package p050R1;

import p110k1.AbstractC1206h;
import p131s1.AbstractC1326c;

/* renamed from: R1.r */
/* loaded from: classes.dex */
public final class C0490r {

    /* renamed from: a */
    public final byte[] f1504a;

    /* renamed from: b */
    public int f1505b;

    /* renamed from: c */
    public int f1506c;

    /* renamed from: d */
    public boolean f1507d;

    /* renamed from: e */
    public final boolean f1508e;

    /* renamed from: f */
    public C0490r f1509f;

    /* renamed from: g */
    public C0490r f1510g;

    public C0490r() {
        this.f1504a = new byte[8192];
        this.f1508e = true;
        this.f1507d = false;
    }

    /* renamed from: a */
    public final C0490r m1234a() {
        C0490r c0490r = this.f1509f;
        if (c0490r == this) {
            c0490r = null;
        }
        C0490r c0490r2 = this.f1510g;
        AbstractC1326c.m3059b(c0490r2);
        c0490r2.f1509f = this.f1509f;
        C0490r c0490r3 = this.f1509f;
        AbstractC1326c.m3059b(c0490r3);
        c0490r3.f1510g = this.f1510g;
        this.f1509f = null;
        this.f1510g = null;
        return c0490r;
    }

    /* renamed from: b */
    public final void m1235b(C0490r c0490r) {
        AbstractC1326c.m3062e(c0490r, "segment");
        c0490r.f1510g = this;
        c0490r.f1509f = this.f1509f;
        C0490r c0490r2 = this.f1509f;
        AbstractC1326c.m3059b(c0490r2);
        c0490r2.f1510g = c0490r;
        this.f1509f = c0490r;
    }

    /* renamed from: c */
    public final C0490r m1236c() {
        this.f1507d = true;
        return new C0490r(this.f1504a, this.f1505b, this.f1506c, true, false);
    }

    /* renamed from: d */
    public final void m1237d(C0490r c0490r, int i2) {
        AbstractC1326c.m3062e(c0490r, "sink");
        if (!c0490r.f1508e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = c0490r.f1506c;
        int i4 = i3 + i2;
        byte[] bArr = c0490r.f1504a;
        if (i4 > 8192) {
            if (c0490r.f1507d) {
                throw new IllegalArgumentException();
            }
            int i5 = c0490r.f1505b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC1206h.m2842m0(0, i5, i3, bArr, bArr);
            c0490r.f1506c -= c0490r.f1505b;
            c0490r.f1505b = 0;
        }
        int i6 = c0490r.f1506c;
        int i7 = this.f1505b;
        AbstractC1206h.m2842m0(i6, i7, i7 + i2, this.f1504a, bArr);
        c0490r.f1506c += i2;
        this.f1505b += i2;
    }

    public C0490r(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        AbstractC1326c.m3062e(bArr, "data");
        this.f1504a = bArr;
        this.f1505b = i2;
        this.f1506c = i3;
        this.f1507d = z2;
        this.f1508e = z3;
    }
}
