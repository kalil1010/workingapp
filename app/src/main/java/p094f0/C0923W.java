package p094f0;

/* renamed from: f0.W */
/* loaded from: classes.dex */
public final class C0923W {

    /* renamed from: a */
    public int f3793a;

    /* renamed from: b */
    public int f3794b;

    /* renamed from: c */
    public int f3795c;

    /* renamed from: d */
    public int f3796d;

    /* renamed from: e */
    public int f3797e;

    /* renamed from: f */
    public boolean f3798f;

    /* renamed from: g */
    public boolean f3799g;

    /* renamed from: h */
    public boolean f3800h;

    /* renamed from: i */
    public boolean f3801i;

    /* renamed from: j */
    public boolean f3802j;

    /* renamed from: k */
    public boolean f3803k;

    /* renamed from: l */
    public int f3804l;

    /* renamed from: m */
    public long f3805m;

    /* renamed from: n */
    public int f3806n;

    /* renamed from: a */
    public final void m2390a(int i2) {
        if ((this.f3796d & i2) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f3796d));
    }

    /* renamed from: b */
    public final int m2391b() {
        return this.f3799g ? this.f3794b - this.f3795c : this.f3797e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3793a + ", mData=null, mItemCount=" + this.f3797e + ", mIsMeasuring=" + this.f3801i + ", mPreviousLayoutItemCount=" + this.f3794b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3795c + ", mStructureChanged=" + this.f3798f + ", mInPreLayout=" + this.f3799g + ", mRunSimpleAnimations=" + this.f3802j + ", mRunPredictiveAnimations=" + this.f3803k + '}';
    }
}
