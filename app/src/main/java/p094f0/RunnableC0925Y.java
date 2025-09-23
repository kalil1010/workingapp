package p094f0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p054T.InterpolatorC0505d;

/* renamed from: f0.Y */
/* loaded from: classes.dex */
public final class RunnableC0925Y implements Runnable {

    /* renamed from: a */
    public int f3807a;

    /* renamed from: b */
    public int f3808b;

    /* renamed from: c */
    public OverScroller f3809c;

    /* renamed from: d */
    public Interpolator f3810d;

    /* renamed from: e */
    public boolean f3811e;

    /* renamed from: f */
    public boolean f3812f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f3813g;

    public RunnableC0925Y(RecyclerView recyclerView) {
        this.f3813g = recyclerView;
        InterpolatorC0505d interpolatorC0505d = RecyclerView.f2779w0;
        this.f3810d = interpolatorC0505d;
        this.f3811e = false;
        this.f3812f = false;
        this.f3809c = new OverScroller(recyclerView.getContext(), interpolatorC0505d);
    }

    /* renamed from: a */
    public final void m2392a() {
        if (this.f3811e) {
            this.f3812f = true;
            return;
        }
        RecyclerView recyclerView = this.f3813g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m2393b(int i2, int i3, int i4, BaseInterpolator baseInterpolator) {
        int iRound;
        RecyclerView recyclerView = this.f3813g;
        if (i4 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            i4 = Math.min(iRound, 2000);
        }
        int i6 = i4;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f2779w0;
        }
        if (this.f3810d != interpolator) {
            this.f3810d = interpolator;
            this.f3809c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3808b = 0;
        this.f3807a = 0;
        recyclerView.setScrollState(2);
        this.f3809c.startScroll(0, 0, i2, i3, i6);
        m2392a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f3813g;
        if (recyclerView.f2827m == null) {
            recyclerView.removeCallbacks(this);
            this.f3809c.abortAnimation();
            return;
        }
        this.f3812f = false;
        this.f3811e = true;
        recyclerView.m1918m();
        OverScroller overScroller = this.f3809c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f3807a;
            int i7 = currY - this.f3808b;
            this.f3807a = currX;
            this.f3808b = currY;
            int[] iArr = recyclerView.f2836q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM1923r = recyclerView.m1923r(i6, i7, iArr, null, 1);
            int[] iArr2 = recyclerView.f2836q0;
            if (zM1923r) {
                i2 = i6 - iArr2[0];
                i3 = i7 - iArr2[1];
            } else {
                i2 = i6;
                i3 = i7;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1917l(i2, i3);
            }
            if (recyclerView.f2825l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1906a0(i2, i3, iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
                i2 -= i4;
                i3 -= i5;
                C0958w c0958w = recyclerView.f2827m.f3756e;
                if (c0958w != null && !c0958w.f4016d && c0958w.f4017e) {
                    int iM2391b = recyclerView.f2812e0.m2391b();
                    if (iM2391b == 0) {
                        c0958w.m2466i();
                    } else if (c0958w.f4013a >= iM2391b) {
                        c0958w.f4013a = iM2391b - 1;
                        c0958w.m2465g(i4, i5);
                    } else {
                        c0958w.m2465g(i4, i5);
                    }
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (!recyclerView.f2829n.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2836q0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1924s(i4, i5, i2, i3, null, 1, iArr3);
            int i8 = i2 - iArr2[0];
            int i9 = i3 - iArr2[1];
            if (i4 != 0 || i5 != 0) {
                recyclerView.m1925t(i4, i5);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
            C0958w c0958w2 = recyclerView.f2827m.f3756e;
            if ((c0958w2 == null || !c0958w2.f4016d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i10 = i8 < 0 ? -currVelocity : i8 > 0 ? currVelocity : 0;
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i10 < 0) {
                        recyclerView.m1927v();
                        if (recyclerView.f2785F.isFinished()) {
                            recyclerView.f2785F.onAbsorb(-i10);
                        }
                    } else if (i10 > 0) {
                        recyclerView.m1928w();
                        if (recyclerView.f2787H.isFinished()) {
                            recyclerView.f2787H.onAbsorb(i10);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1929x();
                        if (recyclerView.f2786G.isFinished()) {
                            recyclerView.f2786G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1926u();
                        if (recyclerView.f2788I.isFinished()) {
                            recyclerView.f2788I.onAbsorb(currVelocity);
                        }
                    }
                    if (i10 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0241P.f815a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0949n c0949n = recyclerView.f2810d0;
                int[] iArr4 = c0949n.f3965c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0949n.f3966d = 0;
            } else {
                m2392a();
                RunnableC0951p runnableC0951p = recyclerView.f2808c0;
                if (runnableC0951p != null) {
                    runnableC0951p.m2456a(recyclerView, i4, i5);
                }
            }
        }
        C0958w c0958w3 = recyclerView.f2827m.f3756e;
        if (c0958w3 != null && c0958w3.f4016d) {
            c0958w3.m2465g(0, 0);
        }
        this.f3811e = false;
        if (!this.f3812f) {
            recyclerView.setScrollState(0);
            recyclerView.m1912f0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
            recyclerView.postOnAnimation(this);
        }
    }
}
