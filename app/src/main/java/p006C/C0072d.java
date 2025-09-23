package p006C;

import android.graphics.Insets;

/* renamed from: C.d */
/* loaded from: classes.dex */
public final class C0072d {

    /* renamed from: e */
    public static final C0072d f171e = new C0072d(0, 0, 0, 0);

    /* renamed from: a */
    public final int f172a;

    /* renamed from: b */
    public final int f173b;

    /* renamed from: c */
    public final int f174c;

    /* renamed from: d */
    public final int f175d;

    public C0072d(int i2, int i3, int i4, int i5) {
        this.f172a = i2;
        this.f173b = i3;
        this.f174c = i4;
        this.f175d = i5;
    }

    /* renamed from: a */
    public static C0072d m227a(C0072d c0072d, C0072d c0072d2) {
        return m228b(Math.max(c0072d.f172a, c0072d2.f172a), Math.max(c0072d.f173b, c0072d2.f173b), Math.max(c0072d.f174c, c0072d2.f174c), Math.max(c0072d.f175d, c0072d2.f175d));
    }

    /* renamed from: b */
    public static C0072d m228b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f171e : new C0072d(i2, i3, i4, i5);
    }

    /* renamed from: c */
    public static C0072d m229c(Insets insets) {
        return m228b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: d */
    public final Insets m230d() {
        return AbstractC0071c.m226a(this.f172a, this.f173b, this.f174c, this.f175d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0072d.class != obj.getClass()) {
            return false;
        }
        C0072d c0072d = (C0072d) obj;
        return this.f175d == c0072d.f175d && this.f172a == c0072d.f172a && this.f174c == c0072d.f174c && this.f173b == c0072d.f173b;
    }

    public final int hashCode() {
        return (((((this.f172a * 31) + this.f173b) * 31) + this.f174c) * 31) + this.f175d;
    }

    public final String toString() {
        return "Insets{left=" + this.f172a + ", top=" + this.f173b + ", right=" + this.f174c + ", bottom=" + this.f175d + '}';
    }
}
