package p124q;

import java.util.ArrayList;
import p002A1.C0027i;

/* renamed from: q.b */
/* loaded from: classes.dex */
public class C1268b {

    /* renamed from: d */
    public final C1267a f5154d;

    /* renamed from: a */
    public C1272f f5151a = null;

    /* renamed from: b */
    public float f5152b = 0.0f;

    /* renamed from: c */
    public final ArrayList f5153c = new ArrayList();

    /* renamed from: e */
    public boolean f5155e = false;

    public C1268b(C0027i c0027i) {
        this.f5154d = new C1267a(this, c0027i);
    }

    /* renamed from: a */
    public final void m2935a(C1269c c1269c, int i2) {
        this.f5154d.m2933g(c1269c.m2954j(i2), 1.0f);
        this.f5154d.m2933g(c1269c.m2954j(i2), -1.0f);
    }

    /* renamed from: b */
    public final void m2936b(C1272f c1272f, C1272f c1272f2, C1272f c1272f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f5152b = i2;
        }
        if (z2) {
            this.f5154d.m2933g(c1272f, 1.0f);
            this.f5154d.m2933g(c1272f2, -1.0f);
            this.f5154d.m2933g(c1272f3, -1.0f);
        } else {
            this.f5154d.m2933g(c1272f, -1.0f);
            this.f5154d.m2933g(c1272f2, 1.0f);
            this.f5154d.m2933g(c1272f3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m2937c(C1272f c1272f, C1272f c1272f2, C1272f c1272f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f5152b = i2;
        }
        if (z2) {
            this.f5154d.m2933g(c1272f, 1.0f);
            this.f5154d.m2933g(c1272f2, -1.0f);
            this.f5154d.m2933g(c1272f3, 1.0f);
        } else {
            this.f5154d.m2933g(c1272f, -1.0f);
            this.f5154d.m2933g(c1272f2, 1.0f);
            this.f5154d.m2933g(c1272f3, -1.0f);
        }
    }

    /* renamed from: d */
    public C1272f mo2938d(boolean[] zArr) {
        return m2940f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo2939e() {
        return this.f5151a == null && this.f5152b == 0.0f && this.f5154d.m2930d() == 0;
    }

    /* renamed from: f */
    public final C1272f m2940f(boolean[] zArr, C1272f c1272f) {
        int i2;
        int iM2930d = this.f5154d.m2930d();
        C1272f c1272f2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < iM2930d; i3++) {
            float fM2932f = this.f5154d.m2932f(i3);
            if (fM2932f < 0.0f) {
                C1272f c1272fM2931e = this.f5154d.m2931e(i3);
                if ((zArr == null || !zArr[c1272fM2931e.f5179b]) && c1272fM2931e != c1272f && (((i2 = c1272fM2931e.f5189l) == 3 || i2 == 4) && fM2932f < f)) {
                    f = fM2932f;
                    c1272f2 = c1272fM2931e;
                }
            }
        }
        return c1272f2;
    }

    /* renamed from: g */
    public final void m2941g(C1272f c1272f) {
        C1272f c1272f2 = this.f5151a;
        if (c1272f2 != null) {
            this.f5154d.m2933g(c1272f2, -1.0f);
            this.f5151a.f5180c = -1;
            this.f5151a = null;
        }
        float fM2934h = this.f5154d.m2934h(c1272f, true) * (-1.0f);
        this.f5151a = c1272f;
        if (fM2934h == 1.0f) {
            return;
        }
        this.f5152b /= fM2934h;
        C1267a c1267a = this.f5154d;
        int i2 = c1267a.f5148h;
        for (int i3 = 0; i2 != -1 && i3 < c1267a.f5141a; i3++) {
            float[] fArr = c1267a.f5147g;
            fArr[i2] = fArr[i2] / fM2934h;
            i2 = c1267a.f5146f[i2];
        }
    }

    /* renamed from: h */
    public final void m2942h(C1269c c1269c, C1272f c1272f, boolean z2) {
        if (c1272f == null || !c1272f.f5183f) {
            return;
        }
        float fM2929c = this.f5154d.m2929c(c1272f);
        this.f5152b = (c1272f.f5182e * fM2929c) + this.f5152b;
        this.f5154d.m2934h(c1272f, z2);
        if (z2) {
            c1272f.m2969b(this);
        }
        if (this.f5154d.m2930d() == 0) {
            this.f5155e = true;
            c1269c.f5158a = true;
        }
    }

    /* renamed from: i */
    public void mo2943i(C1269c c1269c, C1268b c1268b, boolean z2) {
        C1267a c1267a = this.f5154d;
        c1267a.getClass();
        float fM2929c = c1267a.m2929c(c1268b.f5151a);
        c1267a.m2934h(c1268b.f5151a, z2);
        C1267a c1267a2 = c1268b.f5154d;
        int iM2930d = c1267a2.m2930d();
        for (int i2 = 0; i2 < iM2930d; i2++) {
            C1272f c1272fM2931e = c1267a2.m2931e(i2);
            c1267a.m2927a(c1272fM2931e, c1267a2.m2929c(c1272fM2931e) * fM2929c, z2);
        }
        this.f5152b = (c1268b.f5152b * fM2929c) + this.f5152b;
        if (z2) {
            c1268b.f5151a.m2969b(this);
        }
        if (this.f5151a == null || this.f5154d.m2930d() != 0) {
            return;
        }
        this.f5155e = true;
        c1269c.f5158a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.f r0 = r10.f5151a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.f r1 = r10.f5151a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r1)
            float r1 = r10.f5152b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f5152b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            q.a r5 = r10.f5154d
            int r5 = r5.m2930d()
        L40:
            if (r4 >= r5) goto La0
            q.a r6 = r10.f5154d
            q.f r6 = r6.m2931e(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            q.a r7 = r10.f5154d
            float r7 = r7.m2932f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p006C.AbstractC0075g.m237f(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124q.C1268b.toString():java.lang.String");
    }
}
