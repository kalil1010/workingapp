package p054T;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import p002A1.RunnableC0042x;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;

/* renamed from: T.e */
/* loaded from: classes.dex */
public final class C0506e {

    /* renamed from: x */
    public static final InterpolatorC0505d f1555x = new InterpolatorC0505d(0);

    /* renamed from: a */
    public int f1556a;

    /* renamed from: b */
    public int f1557b;

    /* renamed from: d */
    public float[] f1559d;

    /* renamed from: e */
    public float[] f1560e;

    /* renamed from: f */
    public float[] f1561f;

    /* renamed from: g */
    public float[] f1562g;

    /* renamed from: h */
    public int[] f1563h;

    /* renamed from: i */
    public int[] f1564i;

    /* renamed from: j */
    public int[] f1565j;

    /* renamed from: k */
    public int f1566k;

    /* renamed from: l */
    public VelocityTracker f1567l;

    /* renamed from: m */
    public final float f1568m;

    /* renamed from: n */
    public float f1569n;

    /* renamed from: o */
    public int f1570o;

    /* renamed from: p */
    public final int f1571p;

    /* renamed from: q */
    public int f1572q;

    /* renamed from: r */
    public final OverScroller f1573r;

    /* renamed from: s */
    public final AbstractC0901d f1574s;

    /* renamed from: t */
    public View f1575t;

    /* renamed from: u */
    public boolean f1576u;

    /* renamed from: v */
    public final ViewGroup f1577v;

    /* renamed from: c */
    public int f1558c = -1;

    /* renamed from: w */
    public final RunnableC0042x f1578w = new RunnableC0042x(5, this);

    public C0506e(Context context, ViewGroup viewGroup, AbstractC0901d abstractC0901d) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0901d == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1577v = viewGroup;
        this.f1574s = abstractC0901d;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1571p = i2;
        this.f1570o = i2;
        this.f1557b = viewConfiguration.getScaledTouchSlop();
        this.f1568m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1569n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1573r = new OverScroller(context, f1555x);
    }

    /* renamed from: a */
    public final void m1251a() {
        this.f1558c = -1;
        float[] fArr = this.f1559d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1560e, 0.0f);
            Arrays.fill(this.f1561f, 0.0f);
            Arrays.fill(this.f1562g, 0.0f);
            Arrays.fill(this.f1563h, 0);
            Arrays.fill(this.f1564i, 0);
            Arrays.fill(this.f1565j, 0);
            this.f1566k = 0;
        }
        VelocityTracker velocityTracker = this.f1567l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1567l = null;
        }
    }

    /* renamed from: b */
    public final void m1252b(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1577v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1575t = view;
        this.f1558c = i2;
        this.f1574s.mo7Z(view, i2);
        m1265o(1);
    }

    /* renamed from: c */
    public final boolean m1253c(float f, float f2, int i2, int i3) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f1563h[i2] & i3) != i3 || (this.f1572q & i3) == 0 || (this.f1565j[i2] & i3) == i3 || (this.f1564i[i2] & i3) == i3) {
            return false;
        }
        float f3 = this.f1557b;
        if (fAbs <= f3 && fAbs2 <= f3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f1574s.getClass();
        }
        return (this.f1564i[i2] & i3) == 0 && fAbs > ((float) this.f1557b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1254d(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            e2.d r1 = r3.f1574s
            int r4 = r1.mo6J(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo280K()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f1557b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f1557b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f1557b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054T.C0506e.m1254d(android.view.View, float, float):boolean");
    }

    /* renamed from: e */
    public final void m1255e(int i2) {
        float[] fArr = this.f1559d;
        if (fArr != null) {
            int i3 = this.f1566k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f1560e[i2] = 0.0f;
                this.f1561f[i2] = 0.0f;
                this.f1562g[i2] = 0.0f;
                this.f1563h[i2] = 0;
                this.f1564i[i2] = 0;
                this.f1565j[i2] = 0;
                this.f1566k = (~i4) & i3;
            }
        }
    }

    /* renamed from: f */
    public final int m1256f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1577v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: g */
    public final boolean m1257g() {
        if (this.f1556a == 2) {
            OverScroller overScroller = this.f1573r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1575t.getLeft();
            int top = currY - this.f1575t.getTop();
            if (left != 0) {
                View view = this.f1575t;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1575t;
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1574s.mo9b0(this.f1575t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1577v.post(this.f1578w);
            }
        }
        return this.f1556a == 2;
    }

    /* renamed from: h */
    public final View m1258h(int i2, int i3) {
        ViewGroup viewGroup = this.f1577v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1574s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m1259i(int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f1575t.getLeft();
        int top = this.f1575t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f1573r;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            m1265o(0);
            return false;
        }
        View view = this.f1575t;
        int i8 = (int) this.f1569n;
        int i9 = (int) this.f1568m;
        int iAbs = Math.abs(i4);
        if (iAbs < i8) {
            i4 = 0;
        } else if (iAbs > i9) {
            i4 = i4 > 0 ? i9 : -i9;
        }
        int i10 = (int) this.f1569n;
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i10) {
            i5 = 0;
        } else if (iAbs2 > i9) {
            i5 = i5 > 0 ? i9 : -i9;
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f = iAbs5;
            f2 = i11;
        } else {
            f = iAbs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i5 != 0) {
            f3 = iAbs6;
            f4 = i11;
        } else {
            f3 = iAbs4;
            f4 = i12;
        }
        float f6 = f3 / f4;
        AbstractC0901d abstractC0901d = this.f1574s;
        overScroller.startScroll(left, top, i6, i7, (int) ((m1256f(i7, i5, abstractC0901d.mo280K()) * f6) + (m1256f(i6, i4, abstractC0901d.mo6J(view)) * f5)));
        m1265o(2);
        return true;
    }

    /* renamed from: j */
    public final void m1260j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1251a();
        }
        if (this.f1567l == null) {
            this.f1567l = VelocityTracker.obtain();
        }
        this.f1567l.addMovement(motionEvent);
        AbstractC0901d abstractC0901d = this.f1574s;
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1258h = m1258h((int) x2, (int) y2);
            m1263m(x2, y2, pointerId);
            m1269s(viewM1258h, pointerId);
            if ((this.f1563h[pointerId] & this.f1572q) != 0) {
                abstractC0901d.mo1332X();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1556a == 1) {
                m1261k();
            }
            m1251a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1556a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    int pointerId2 = motionEvent.getPointerId(i4);
                    if ((this.f1566k & (1 << pointerId2)) != 0) {
                        float x3 = motionEvent.getX(i4);
                        float y3 = motionEvent.getY(i4);
                        float f = x3 - this.f1559d[pointerId2];
                        float f2 = y3 - this.f1560e[pointerId2];
                        m1262l(f, f2, pointerId2);
                        if (this.f1556a == 1) {
                            break;
                        }
                        View viewM1258h2 = m1258h((int) x3, (int) y3);
                        if (m1254d(viewM1258h2, f, f2) && m1269s(viewM1258h2, pointerId2)) {
                            break;
                        }
                    }
                }
                m1264n(motionEvent);
                return;
            }
            int i5 = this.f1558c;
            if ((this.f1566k & (1 << i5)) != 0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f1561f;
                int i6 = this.f1558c;
                int i7 = (int) (x4 - fArr[i6]);
                int i8 = (int) (y4 - this.f1562g[i6]);
                int left = this.f1575t.getLeft() + i7;
                int top = this.f1575t.getTop() + i8;
                int left2 = this.f1575t.getLeft();
                int top2 = this.f1575t.getTop();
                if (i7 != 0) {
                    left = abstractC0901d.mo11i(this.f1575t, left);
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    this.f1575t.offsetLeftAndRight(left - left2);
                }
                if (i8 != 0) {
                    top = abstractC0901d.mo12j(this.f1575t, top);
                    WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                    this.f1575t.offsetTopAndBottom(top - top2);
                }
                if (i7 != 0 || i8 != 0) {
                    abstractC0901d.mo9b0(this.f1575t, left, top);
                }
                m1264n(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1556a == 1) {
                this.f1576u = true;
                abstractC0901d.mo10c0(this.f1575t, 0.0f, 0.0f);
                this.f1576u = false;
                if (this.f1556a == 1) {
                    m1265o(0);
                }
            }
            m1251a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y5 = motionEvent.getY(actionIndex);
            m1263m(x5, y5, pointerId3);
            if (this.f1556a == 0) {
                m1269s(m1258h((int) x5, (int) y5), pointerId3);
                if ((this.f1563h[pointerId3] & this.f1572q) != 0) {
                    abstractC0901d.mo1332X();
                    return;
                }
                return;
            }
            int i9 = (int) x5;
            int i10 = (int) y5;
            View view = this.f1575t;
            if (view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom()) {
                m1269s(this.f1575t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1556a == 1 && pointerId4 == this.f1558c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f1558c) {
                    View viewM1258h3 = m1258h((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view2 = this.f1575t;
                    if (viewM1258h3 == view2 && m1269s(view2, pointerId5)) {
                        i2 = this.f1558c;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                m1261k();
            }
        }
        m1255e(pointerId4);
    }

    /* renamed from: k */
    public final void m1261k() {
        VelocityTracker velocityTracker = this.f1567l;
        float f = this.f1568m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f1567l.getXVelocity(this.f1558c);
        float f2 = this.f1569n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f1567l.getYVelocity(this.f1558c);
        float f3 = this.f1569n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f1576u = true;
        this.f1574s.mo10c0(this.f1575t, xVelocity, f);
        this.f1576u = false;
        if (this.f1556a == 1) {
            m1265o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [e2.d] */
    /* renamed from: l */
    public final void m1262l(float f, float f2, int i2) {
        boolean zM1253c = m1253c(f, f2, i2, 1);
        boolean z2 = zM1253c;
        if (m1253c(f2, f, i2, 4)) {
            z2 = (zM1253c ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (m1253c(f, f2, i2, 2)) {
            z3 = (z2 ? 1 : 0) | 2;
        }
        ?? r02 = z3;
        if (m1253c(f2, f, i2, 8)) {
            r02 = (z3 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1564i;
            iArr[i2] = iArr[i2] | r02;
            this.f1574s.mo1331W(r02, i2);
        }
    }

    /* renamed from: m */
    public final void m1263m(float f, float f2, int i2) {
        float[] fArr = this.f1559d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1560e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1561f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1562g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1563h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1564i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1565j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1559d = fArr2;
            this.f1560e = fArr3;
            this.f1561f = fArr4;
            this.f1562g = fArr5;
            this.f1563h = iArr;
            this.f1564i = iArr2;
            this.f1565j = iArr3;
        }
        float[] fArr9 = this.f1559d;
        this.f1561f[i2] = f;
        fArr9[i2] = f;
        float[] fArr10 = this.f1560e;
        this.f1562g[i2] = f2;
        fArr10[i2] = f2;
        int[] iArr7 = this.f1563h;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.f1577v;
        int i6 = i4 < viewGroup.getLeft() + this.f1570o ? 1 : 0;
        if (i5 < viewGroup.getTop() + this.f1570o) {
            i6 |= 4;
        }
        if (i4 > viewGroup.getRight() - this.f1570o) {
            i6 |= 2;
        }
        if (i5 > viewGroup.getBottom() - this.f1570o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f1566k |= 1 << i2;
    }

    /* renamed from: n */
    public final void m1264n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if ((this.f1566k & (1 << pointerId)) != 0) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f1561f[pointerId] = x2;
                this.f1562g[pointerId] = y2;
            }
        }
    }

    /* renamed from: o */
    public final void m1265o(int i2) {
        this.f1577v.removeCallbacks(this.f1578w);
        if (this.f1556a != i2) {
            this.f1556a = i2;
            this.f1574s.mo8a0(i2);
            if (this.f1556a == 0) {
                this.f1575t = null;
            }
        }
    }

    /* renamed from: p */
    public final boolean m1266p(int i2, int i3) {
        if (this.f1576u) {
            return m1259i(i2, i3, (int) this.f1567l.getXVelocity(this.f1558c), (int) this.f1567l.getYVelocity(this.f1558c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1267q(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p054T.C0506e.m1267q(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final boolean m1268r(View view, int i2, int i3) {
        this.f1575t = view;
        this.f1558c = -1;
        boolean zM1259i = m1259i(i2, i3, 0, 0);
        if (!zM1259i && this.f1556a == 0 && this.f1575t != null) {
            this.f1575t = null;
        }
        return zM1259i;
    }

    /* renamed from: s */
    public final boolean m1269s(View view, int i2) {
        if (view == this.f1575t && this.f1558c == i2) {
            return true;
        }
        if (view == null || !this.f1574s.mo13t0(view, i2)) {
            return false;
        }
        this.f1558c = i2;
        m1252b(view, i2);
        return true;
    }
}
