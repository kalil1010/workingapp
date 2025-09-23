package p094f0;

import android.view.View;
import androidx.emoji2.text.AbstractC0668g;

/* renamed from: f0.s */
/* loaded from: classes.dex */
public final class C0954s {

    /* renamed from: a */
    public AbstractC0668g f3989a;

    /* renamed from: b */
    public int f3990b;

    /* renamed from: c */
    public int f3991c;

    /* renamed from: d */
    public boolean f3992d;

    /* renamed from: e */
    public boolean f3993e;

    public C0954s() {
        m2461d();
    }

    /* renamed from: a */
    public final void m2458a() {
        this.f3991c = this.f3992d ? this.f3989a.mo1616g() : this.f3989a.mo1620k();
    }

    /* renamed from: b */
    public final void m2459b(View view, int i2) {
        if (this.f3992d) {
            int iMo1611b = this.f3989a.mo1611b(view);
            AbstractC0668g abstractC0668g = this.f3989a;
            this.f3991c = (Integer.MIN_VALUE == abstractC0668g.f2390a ? 0 : abstractC0668g.mo1621l() - abstractC0668g.f2390a) + iMo1611b;
        } else {
            this.f3991c = this.f3989a.mo1614e(view);
        }
        this.f3990b = i2;
    }

    /* renamed from: c */
    public final void m2460c(View view, int i2) {
        AbstractC0668g abstractC0668g = this.f3989a;
        int iMo1621l = Integer.MIN_VALUE == abstractC0668g.f2390a ? 0 : abstractC0668g.mo1621l() - abstractC0668g.f2390a;
        if (iMo1621l >= 0) {
            m2459b(view, i2);
            return;
        }
        this.f3990b = i2;
        if (!this.f3992d) {
            int iMo1614e = this.f3989a.mo1614e(view);
            int iMo1620k = iMo1614e - this.f3989a.mo1620k();
            this.f3991c = iMo1614e;
            if (iMo1620k > 0) {
                int iMo1616g = (this.f3989a.mo1616g() - Math.min(0, (this.f3989a.mo1616g() - iMo1621l) - this.f3989a.mo1611b(view))) - (this.f3989a.mo1612c(view) + iMo1614e);
                if (iMo1616g < 0) {
                    this.f3991c -= Math.min(iMo1620k, -iMo1616g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo1616g2 = (this.f3989a.mo1616g() - iMo1621l) - this.f3989a.mo1611b(view);
        this.f3991c = this.f3989a.mo1616g() - iMo1616g2;
        if (iMo1616g2 > 0) {
            int iMo1612c = this.f3991c - this.f3989a.mo1612c(view);
            int iMo1620k2 = this.f3989a.mo1620k();
            int iMin = iMo1612c - (Math.min(this.f3989a.mo1614e(view) - iMo1620k2, 0) + iMo1620k2);
            if (iMin < 0) {
                this.f3991c = Math.min(iMo1616g2, -iMin) + this.f3991c;
            }
        }
    }

    /* renamed from: d */
    public final void m2461d() {
        this.f3990b = -1;
        this.f3991c = Integer.MIN_VALUE;
        this.f3992d = false;
        this.f3993e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3990b + ", mCoordinate=" + this.f3991c + ", mLayoutFromEnd=" + this.f3992d + ", mValid=" + this.f3993e + '}';
    }
}
