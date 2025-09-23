package p055T0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: T0.u */
/* loaded from: classes.dex */
public final class C0527u {

    /* renamed from: a */
    public float f1679a;

    /* renamed from: b */
    public float f1680b;

    /* renamed from: c */
    public float f1681c;

    /* renamed from: d */
    public float f1682d;

    /* renamed from: e */
    public float f1683e;

    /* renamed from: f */
    public final ArrayList f1684f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f1685g = new ArrayList();

    public C0527u() {
        m1309d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m1306a(float f) {
        float f2 = this.f1682d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f1680b;
        float f5 = this.f1681c;
        C0523q c0523q = new C0523q(f4, f5, f4, f5);
        c0523q.f1672f = this.f1682d;
        c0523q.f1673g = f3;
        this.f1685g.add(new C0521o(c0523q));
        this.f1682d = f;
    }

    /* renamed from: b */
    public final void m1307b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1684f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0525s) arrayList.get(i2)).mo1305a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m1308c(float f, float f2) {
        C0524r c0524r = new C0524r();
        c0524r.f1674b = f;
        c0524r.f1675c = f2;
        this.f1684f.add(c0524r);
        C0522p c0522p = new C0522p(c0524r, this.f1680b, this.f1681c);
        float fM1304b = c0522p.m1304b() + 270.0f;
        float fM1304b2 = c0522p.m1304b() + 270.0f;
        m1306a(fM1304b);
        this.f1685g.add(c0522p);
        this.f1682d = fM1304b2;
        this.f1680b = f;
        this.f1681c = f2;
    }

    /* renamed from: d */
    public final void m1309d(float f, float f2, float f3) {
        this.f1679a = f;
        this.f1680b = 0.0f;
        this.f1681c = f;
        this.f1682d = f2;
        this.f1683e = (f2 + f3) % 360.0f;
        this.f1684f.clear();
        this.f1685g.clear();
    }
}
