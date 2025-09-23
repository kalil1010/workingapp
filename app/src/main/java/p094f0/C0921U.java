package p094f0;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.U */
/* loaded from: classes.dex */
public final class C0921U {

    /* renamed from: a */
    public int f3787a;

    /* renamed from: b */
    public int f3788b;

    /* renamed from: c */
    public int f3789c;

    /* renamed from: d */
    public int f3790d;

    /* renamed from: e */
    public BaseInterpolator f3791e;

    /* renamed from: f */
    public boolean f3792f;

    /* renamed from: a */
    public final void m2389a(RecyclerView recyclerView) {
        int i2 = this.f3790d;
        if (i2 >= 0) {
            this.f3790d = -1;
            recyclerView.m1893N(i2);
            this.f3792f = false;
        } else if (this.f3792f) {
            BaseInterpolator baseInterpolator = this.f3791e;
            if (baseInterpolator != null && this.f3789c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i3 = this.f3789c;
            if (i3 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f2806b0.m2393b(this.f3787a, this.f3788b, i3, baseInterpolator);
            this.f3792f = false;
        }
    }
}
