package p138v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p124q.AbstractC1271e;
import p129s.AbstractC1321j;
import p129s.C1314c;
import p129s.C1315d;
import p129s.C1316e;
import p129s.C1318g;
import p132t.C1333b;

/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C1361f {

    /* renamed from: a */
    public final ConstraintLayout f5838a;

    /* renamed from: b */
    public int f5839b;

    /* renamed from: c */
    public int f5840c;

    /* renamed from: d */
    public int f5841d;

    /* renamed from: e */
    public int f5842e;

    /* renamed from: f */
    public int f5843f;

    /* renamed from: g */
    public int f5844g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f5845h;

    public C1361f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5845h = constraintLayout;
        this.f5838a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m3125a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    /* renamed from: b */
    public final void m3126b(C1315d c1315d, C1333b c1333b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c1315d == null) {
            return;
        }
        if (c1315d.f5525g0 == 8) {
            c1333b.f5656e = 0;
            c1333b.f5657f = 0;
            c1333b.f5658g = 0;
            return;
        }
        if (c1315d.f5505T == null) {
            return;
        }
        int i4 = c1333b.f5652a;
        int i5 = c1333b.f5653b;
        int i6 = c1333b.f5654c;
        int i7 = c1333b.f5655d;
        int i8 = this.f5839b + this.f5840c;
        int i9 = this.f5841d;
        View view = c1315d.f5523f0;
        int iM2966a = AbstractC1271e.m2966a(i4);
        C1314c c1314c = c1315d.f5496K;
        C1314c c1314c2 = c1315d.f5494I;
        if (iM2966a == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iM2966a == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5843f, i9, -2);
        } else if (iM2966a == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5843f, i9, -2);
            boolean z3 = c1315d.f5545r == 1;
            int i10 = c1333b.f5661j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c1315d.m3017k();
                if (c1333b.f5661j == 2 || !z3 || ((z3 && z4) || c1315d.mo2974A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1315d.m3021q(), 1073741824);
                }
            }
        } else if (iM2966a != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i11 = this.f5843f;
            int i12 = c1314c2 != null ? c1314c2.f5483g : 0;
            if (c1314c != null) {
                i12 += c1314c.f5483g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int iM2966a2 = AbstractC1271e.m2966a(i5);
        if (iM2966a2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iM2966a2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5844g, i8, -2);
        } else if (iM2966a2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5844g, i8, -2);
            boolean z5 = c1315d.f5546s == 1;
            int i13 = c1333b.f5661j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c1315d.m3021q();
                if (c1333b.f5661j == 2 || !z5 || ((z5 && z6) || c1315d.mo2975B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1315d.m3017k(), 1073741824);
                }
            }
        } else if (iM2966a2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i14 = this.f5844g;
            int i15 = c1314c2 != null ? c1315d.f5495J.f5483g : 0;
            if (c1314c != null) {
                i15 += c1315d.f5497L.f5483g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C1316e c1316e = (C1316e) c1315d.f5505T;
        ConstraintLayout constraintLayout = this.f5845h;
        if (c1316e != null && AbstractC1321j.m3052c(constraintLayout.f2267i, 256) && view.getMeasuredWidth() == c1315d.m3021q() && view.getMeasuredWidth() < c1316e.m3021q() && view.getMeasuredHeight() == c1315d.m3017k() && view.getMeasuredHeight() < c1316e.m3017k() && view.getBaseline() == c1315d.f5513a0 && !c1315d.m3030z() && m3125a(c1315d.f5492G, iMakeMeasureSpec, c1315d.m3021q()) && m3125a(c1315d.f5493H, iMakeMeasureSpec2, c1315d.m3017k())) {
            c1333b.f5656e = c1315d.m3021q();
            c1333b.f5657f = c1315d.m3017k();
            c1333b.f5658g = c1315d.f5513a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c1315d.f5508W > 0.0f;
        boolean z12 = z8 && c1315d.f5508W > 0.0f;
        if (view == null) {
            return;
        }
        C1360e c1360e = (C1360e) view.getLayoutParams();
        int i16 = c1333b.f5661j;
        if (i16 != 1 && i16 != 2 && z7 && c1315d.f5545r == 0 && z8 && c1315d.f5546s == 0) {
            z2 = false;
            measuredWidth = 0;
            baseline = 0;
            i3 = -1;
            iMax = 0;
        } else {
            if ((view instanceof AbstractC1374s) && (c1315d instanceof C1318g)) {
                ((AbstractC1374s) view).mo1542j((C1318g) c1315d, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c1315d.f5492G = iMakeMeasureSpec;
            c1315d.f5493H = iMakeMeasureSpec2;
            c1315d.f5524g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c1315d.f5548u;
            int iMax2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c1315d.f5549v;
            if (i18 > 0) {
                iMax2 = Math.min(i18, iMax2);
            }
            int i19 = c1315d.f5551x;
            iMax = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            boolean z13 = z10;
            int i20 = c1315d.f5552y;
            if (i20 > 0) {
                iMax = Math.min(i20, iMax);
            }
            if (!AbstractC1321j.m3052c(constraintLayout.f2267i, 1)) {
                if (z11 && z9) {
                    iMax2 = (int) ((iMax * c1315d.f5508W) + 0.5f);
                } else if (z12 && z13) {
                    iMax = (int) ((iMax2 / c1315d.f5508W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z2 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i2 = 1073741824;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i2 = 1073741824;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i2);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                c1315d.f5492G = iMakeMeasureSpec;
                c1315d.f5493H = iMakeMeasureSpec2;
                z2 = false;
                c1315d.f5524g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z14 = baseline != i3 ? true : z2;
        if (measuredWidth != c1333b.f5654c || iMax != c1333b.f5655d) {
            z2 = true;
        }
        c1333b.f5660i = z2;
        boolean z15 = c1360e.f5801c0 ? true : z14;
        if (z15 && baseline != -1 && c1315d.f5513a0 != baseline) {
            c1333b.f5660i = true;
        }
        c1333b.f5656e = measuredWidth;
        c1333b.f5657f = iMax;
        c1333b.f5659h = z15;
        c1333b.f5658g = baseline;
    }
}
