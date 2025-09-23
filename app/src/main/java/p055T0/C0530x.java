package p055T0;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import p018G0.C0163c;

/* renamed from: T0.x */
/* loaded from: classes.dex */
public final class C0530x extends AbstractC0529w {

    /* renamed from: f */
    public boolean f1691f = false;

    /* renamed from: g */
    public float f1692g = 0.0f;

    public C0530x(NavigationView navigationView) {
        m1313d(navigationView);
    }

    /* renamed from: d */
    private void m1313d(View view) {
        view.setOutlineProvider(new C0163c(1, this));
    }

    @Override // p055T0.AbstractC0529w
    /* renamed from: a */
    public final void mo1310a(NavigationView navigationView) {
        C0517k c0517k;
        C0517k c0517k2;
        RectF rectF;
        C0517k c0517k3 = this.f1688c;
        this.f1692g = (c0517k3 == null || (rectF = this.f1689d) == null) ? 0.0f : c0517k3.f1641f.mo1270a(rectF);
        boolean z2 = false;
        if ((this.f1689d.isEmpty() || (c0517k2 = this.f1688c) == null) ? false : c0517k2.m1299d(this.f1689d)) {
            z2 = true;
        } else if (!this.f1689d.isEmpty() && (c0517k = this.f1688c) != null && this.f1687b && !c0517k.m1299d(this.f1689d)) {
            C0517k c0517k4 = this.f1688c;
            if ((c0517k4.f1636a instanceof C0515i) && (c0517k4.f1637b instanceof C0515i) && (c0517k4.f1639d instanceof C0515i) && (c0517k4.f1638c instanceof C0515i)) {
                float fMo1270a = c0517k4.f1640e.mo1270a(this.f1689d);
                float fMo1270a2 = this.f1688c.f1641f.mo1270a(this.f1689d);
                float fMo1270a3 = this.f1688c.f1643h.mo1270a(this.f1689d);
                float fMo1270a4 = this.f1688c.f1642g.mo1270a(this.f1689d);
                if (fMo1270a == 0.0f && fMo1270a3 == 0.0f && fMo1270a2 == fMo1270a4) {
                    RectF rectF2 = this.f1689d;
                    rectF2.set(rectF2.left - fMo1270a2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.f1692g = fMo1270a2;
                } else if (fMo1270a == 0.0f && fMo1270a2 == 0.0f && fMo1270a3 == fMo1270a4) {
                    RectF rectF3 = this.f1689d;
                    rectF3.set(rectF3.left, rectF3.top - fMo1270a3, rectF3.right, rectF3.bottom);
                    this.f1692g = fMo1270a3;
                } else if (fMo1270a2 == 0.0f && fMo1270a4 == 0.0f && fMo1270a == fMo1270a3) {
                    RectF rectF4 = this.f1689d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fMo1270a, rectF4.bottom);
                    this.f1692g = fMo1270a;
                } else if (fMo1270a3 == 0.0f && fMo1270a4 == 0.0f && fMo1270a == fMo1270a2) {
                    RectF rectF5 = this.f1689d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fMo1270a);
                    this.f1692g = fMo1270a;
                }
                z2 = true;
            }
        }
        this.f1691f = z2;
        navigationView.setClipToOutline(!mo1311b());
        if (mo1311b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // p055T0.AbstractC0529w
    /* renamed from: b */
    public final boolean mo1311b() {
        return !this.f1691f || this.f1686a;
    }
}
