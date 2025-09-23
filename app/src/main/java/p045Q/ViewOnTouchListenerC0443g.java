package p045Q;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p002A1.RunnableC0042x;
import p105j.C1135u0;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0443g implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f1333r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C0437a f1334a;

    /* renamed from: b */
    public final AccelerateInterpolator f1335b;

    /* renamed from: c */
    public final ListView f1336c;

    /* renamed from: d */
    public RunnableC0042x f1337d;

    /* renamed from: e */
    public final float[] f1338e;

    /* renamed from: f */
    public final float[] f1339f;

    /* renamed from: g */
    public final int f1340g;

    /* renamed from: h */
    public final int f1341h;

    /* renamed from: i */
    public final float[] f1342i;

    /* renamed from: j */
    public final float[] f1343j;

    /* renamed from: k */
    public final float[] f1344k;

    /* renamed from: l */
    public boolean f1345l;

    /* renamed from: m */
    public boolean f1346m;

    /* renamed from: n */
    public boolean f1347n;

    /* renamed from: o */
    public boolean f1348o;

    /* renamed from: p */
    public boolean f1349p;

    /* renamed from: q */
    public final C1135u0 f1350q;

    public ViewOnTouchListenerC0443g(C1135u0 c1135u0) {
        C0437a c0437a = new C0437a();
        c0437a.f1328e = Long.MIN_VALUE;
        c0437a.f1330g = -1L;
        c0437a.f1329f = 0L;
        this.f1334a = c0437a;
        this.f1335b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1338e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1339f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1342i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1343j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1344k = fArr5;
        this.f1336c = c1135u0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1340g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1341h = f1333r;
        c0437a.f1324a = 500;
        c0437a.f1325b = 500;
        this.f1350q = c1135u0;
    }

    /* renamed from: b */
    public static float m1115b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m1116a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1338e
            r0 = r0[r4]
            float[] r1 = r3.f1339f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m1115b(r0, r2, r1)
            float r1 = r3.m1117c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m1117c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1335b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m1115b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1342i
            r0 = r0[r4]
            float[] r1 = r3.f1343j
            r1 = r1[r4]
            float[] r2 = r3.f1344k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = m1115b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m1115b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p045Q.ViewOnTouchListenerC0443g.m1116a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float m1117c(float f, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.f1340g;
            if (i2 == 0 || i2 == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f1348o && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m1118d() {
        int i2 = 0;
        if (this.f1346m) {
            this.f1348o = false;
            return;
        }
        C0437a c0437a = this.f1334a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - c0437a.f1328e);
        int i4 = c0437a.f1325b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0437a.f1332i = i2;
        c0437a.f1331h = c0437a.m1101a(jCurrentAnimationTimeMillis);
        c0437a.f1330g = jCurrentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m1119e() {
        C1135u0 c1135u0;
        int count;
        C0437a c0437a = this.f1334a;
        float f = c0437a.f1327d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0437a.f1326c);
        if (iAbs != 0 && (count = (c1135u0 = this.f1350q).getCount()) != 0) {
            int childCount = c1135u0.getChildCount();
            int firstVisiblePosition = c1135u0.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1135u0.getChildAt(0).getTop() >= 0)) : !(i2 >= count && c1135u0.getChildAt(childCount - 1).getBottom() <= c1135u0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f1349p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.m1118d()
            return r1
        L1b:
            r7.f1347n = r2
            r7.f1345l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f1336c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m1116a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m1116a(r2, r9, r8, r3)
            Q.a r9 = r7.f1334a
            r9.f1326c = r0
            r9.f1327d = r8
            boolean r8 = r7.f1348o
            if (r8 != 0) goto L7d
            boolean r8 = r7.m1119e()
            if (r8 == 0) goto L7d
            A1.x r8 = r7.f1337d
            if (r8 != 0) goto L61
            A1.x r8 = new A1.x
            r9 = 4
            r8.<init>(r9, r7)
            r7.f1337d = r8
        L61:
            r7.f1348o = r2
            r7.f1346m = r2
            boolean r8 = r7.f1345l
            if (r8 != 0) goto L76
            int r8 = r7.f1341h
            if (r8 <= 0) goto L76
            A1.x r9 = r7.f1337d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p028K.AbstractC0241P.f815a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            A1.x r8 = r7.f1337d
            r8.run()
        L7b:
            r7.f1345l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p045Q.ViewOnTouchListenerC0443g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
