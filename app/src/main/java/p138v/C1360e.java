package p138v;

import android.view.ViewGroup;
import p129s.C1315d;
import p129s.C1319h;

/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C1360e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f5770A;

    /* renamed from: B */
    public int f5771B;

    /* renamed from: C */
    public int f5772C;

    /* renamed from: D */
    public int f5773D;

    /* renamed from: E */
    public float f5774E;

    /* renamed from: F */
    public float f5775F;

    /* renamed from: G */
    public String f5776G;

    /* renamed from: H */
    public float f5777H;

    /* renamed from: I */
    public float f5778I;

    /* renamed from: J */
    public int f5779J;

    /* renamed from: K */
    public int f5780K;

    /* renamed from: L */
    public int f5781L;

    /* renamed from: M */
    public int f5782M;

    /* renamed from: N */
    public int f5783N;

    /* renamed from: O */
    public int f5784O;

    /* renamed from: P */
    public int f5785P;

    /* renamed from: Q */
    public int f5786Q;

    /* renamed from: R */
    public float f5787R;

    /* renamed from: S */
    public float f5788S;

    /* renamed from: T */
    public int f5789T;

    /* renamed from: U */
    public int f5790U;

    /* renamed from: V */
    public int f5791V;

    /* renamed from: W */
    public boolean f5792W;

    /* renamed from: X */
    public boolean f5793X;

    /* renamed from: Y */
    public String f5794Y;

    /* renamed from: Z */
    public int f5795Z;

    /* renamed from: a */
    public int f5796a;

    /* renamed from: a0 */
    public boolean f5797a0;

    /* renamed from: b */
    public int f5798b;

    /* renamed from: b0 */
    public boolean f5799b0;

    /* renamed from: c */
    public float f5800c;

    /* renamed from: c0 */
    public boolean f5801c0;

    /* renamed from: d */
    public boolean f5802d;

    /* renamed from: d0 */
    public boolean f5803d0;

    /* renamed from: e */
    public int f5804e;

    /* renamed from: e0 */
    public boolean f5805e0;

    /* renamed from: f */
    public int f5806f;

    /* renamed from: f0 */
    public int f5807f0;

    /* renamed from: g */
    public int f5808g;

    /* renamed from: g0 */
    public int f5809g0;

    /* renamed from: h */
    public int f5810h;

    /* renamed from: h0 */
    public int f5811h0;

    /* renamed from: i */
    public int f5812i;

    /* renamed from: i0 */
    public int f5813i0;

    /* renamed from: j */
    public int f5814j;

    /* renamed from: j0 */
    public int f5815j0;

    /* renamed from: k */
    public int f5816k;

    /* renamed from: k0 */
    public int f5817k0;

    /* renamed from: l */
    public int f5818l;

    /* renamed from: l0 */
    public float f5819l0;

    /* renamed from: m */
    public int f5820m;

    /* renamed from: m0 */
    public int f5821m0;

    /* renamed from: n */
    public int f5822n;

    /* renamed from: n0 */
    public int f5823n0;

    /* renamed from: o */
    public int f5824o;

    /* renamed from: o0 */
    public float f5825o0;

    /* renamed from: p */
    public int f5826p;

    /* renamed from: p0 */
    public C1315d f5827p0;

    /* renamed from: q */
    public int f5828q;

    /* renamed from: r */
    public float f5829r;

    /* renamed from: s */
    public int f5830s;

    /* renamed from: t */
    public int f5831t;

    /* renamed from: u */
    public int f5832u;

    /* renamed from: v */
    public int f5833v;

    /* renamed from: w */
    public int f5834w;

    /* renamed from: x */
    public int f5835x;

    /* renamed from: y */
    public int f5836y;

    /* renamed from: z */
    public int f5837z;

    /* renamed from: a */
    public final void m3124a() {
        this.f5803d0 = false;
        this.f5797a0 = true;
        this.f5799b0 = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.f5792W) {
            this.f5797a0 = false;
            if (this.f5781L == 0) {
                this.f5781L = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f5793X) {
            this.f5799b0 = false;
            if (this.f5782M == 0) {
                this.f5782M = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f5797a0 = false;
            if (i2 == 0 && this.f5781L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f5792W = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f5799b0 = false;
            if (i3 == 0 && this.f5782M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f5793X = true;
            }
        }
        if (this.f5800c == -1.0f && this.f5796a == -1 && this.f5798b == -1) {
            return;
        }
        this.f5803d0 = true;
        this.f5797a0 = true;
        this.f5799b0 = true;
        if (!(this.f5827p0 instanceof C1319h)) {
            this.f5827p0 = new C1319h();
        }
        ((C1319h) this.f5827p0).m3048S(this.f5791V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p138v.C1360e.resolveLayoutDirection(int):void");
    }
}
