package p028K;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: K.m */
/* loaded from: classes.dex */
public final class C0275m {

    /* renamed from: a */
    public ViewParent f880a;

    /* renamed from: b */
    public ViewParent f881b;

    /* renamed from: c */
    public final ViewGroup f882c;

    /* renamed from: d */
    public boolean f883d;

    /* renamed from: e */
    public int[] f884e;

    public C0275m(ViewGroup viewGroup) {
        this.f882c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m774a(float f, float f2, boolean z2) {
        ViewParent viewParentM778e;
        if (this.f883d && (viewParentM778e = m778e(0)) != null) {
            try {
                return AbstractC0246V.m710a(viewParentM778e, this.f882c, f, f2, z2);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM778e);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m775b(float f, float f2) {
        ViewParent viewParentM778e;
        if (this.f883d && (viewParentM778e = m778e(0)) != null) {
            try {
                return AbstractC0246V.m711b(viewParentM778e, this.f882c, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM778e);
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m776c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentM778e;
        int i5;
        int i6;
        if (!this.f883d || (viewParentM778e = m778e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f882c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f884e == null) {
                this.f884e = new int[2];
            }
            iArr = this.f884e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM778e instanceof InterfaceC0277n) {
            ((InterfaceC0277n) viewParentM778e).mo786e(viewGroup, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                AbstractC0246V.m712c(viewParentM778e, viewGroup, i2, i3, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM778e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m777d(int r14, int r15, int r16, int r17, int[] r18, int r19, int[] r20) {
        /*
            r13 = this;
            r0 = r18
            r7 = r19
            boolean r1 = r13.f883d
            r9 = 0
            if (r1 == 0) goto L99
            android.view.ViewParent r2 = r13.m778e(r7)
            if (r2 != 0) goto L11
            goto L99
        L11:
            r10 = 1
            if (r14 != 0) goto L22
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 == 0) goto L1b
            goto L22
        L1b:
            if (r0 == 0) goto L99
            r0[r9] = r9
            r0[r10] = r9
            return r9
        L22:
            android.view.ViewGroup r3 = r13.f882c
            if (r0 == 0) goto L30
            r3.getLocationInWindow(r0)
            r1 = r0[r9]
            r4 = r0[r10]
            r11 = r1
            r12 = r4
            goto L32
        L30:
            r11 = r9
            r12 = r11
        L32:
            if (r20 != 0) goto L45
            int[] r1 = r13.f884e
            if (r1 != 0) goto L3d
            r1 = 2
            int[] r1 = new int[r1]
            r13.f884e = r1
        L3d:
            int[] r1 = r13.f884e
            r1[r9] = r9
            r1[r10] = r9
            r8 = r1
            goto L47
        L45:
            r8 = r20
        L47:
            boolean r1 = r2 instanceof p028K.InterfaceC0279o
            if (r1 == 0) goto L5a
            r1 = r2
            K.o r1 = (p028K.InterfaceC0279o) r1
            r4 = r15
            r5 = r16
            r6 = r17
            r2 = r3
            r3 = r14
            r1.mo801b(r2, r3, r4, r5, r6, r7, r8)
        L58:
            r3 = r2
            goto L89
        L5a:
            r1 = r8[r9]
            int r1 = r1 + r16
            r8[r9] = r1
            r1 = r8[r10]
            int r1 = r1 + r17
            r8[r10] = r1
            boolean r1 = r2 instanceof p028K.InterfaceC0277n
            if (r1 == 0) goto L7a
            r1 = r2
            K.n r1 = (p028K.InterfaceC0277n) r1
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            r2 = r3
            r3 = r14
            r1.mo784c(r2, r3, r4, r5, r6, r7)
            goto L58
        L7a:
            if (r19 != 0) goto L89
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            p028K.AbstractC0246V.m713d(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L86
            goto L89
        L86:
            java.util.Objects.toString(r2)
        L89:
            if (r0 == 0) goto L98
            r3.getLocationInWindow(r0)
            r14 = r0[r9]
            int r14 = r14 - r11
            r0[r9] = r14
            r14 = r0[r10]
            int r14 = r14 - r12
            r0[r10] = r14
        L98:
            return r10
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p028K.C0275m.m777d(int, int, int, int, int[], int, int[]):boolean");
    }

    /* renamed from: e */
    public final ViewParent m778e(int i2) {
        if (i2 == 0) {
            return this.f880a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f881b;
    }

    /* renamed from: f */
    public final boolean m779f(int i2) {
        return m778e(i2) != null;
    }

    /* renamed from: g */
    public final boolean m780g(int i2, int i3) {
        boolean zM715f;
        if (!m779f(i3)) {
            if (this.f883d) {
                ViewGroup viewGroup = this.f882c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof InterfaceC0277n;
                    if (z2) {
                        zM715f = ((InterfaceC0277n) parent).mo787f(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            zM715f = AbstractC0246V.m715f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    } else {
                        zM715f = false;
                    }
                    if (zM715f) {
                        if (i3 == 0) {
                            this.f880a = parent;
                        } else if (i3 == 1) {
                            this.f881b = parent;
                        }
                        if (z2) {
                            ((InterfaceC0277n) parent).mo783a(view, viewGroup, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                AbstractC0246V.m714e(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m781h(int i2) {
        ViewParent viewParentM778e = m778e(i2);
        if (viewParentM778e != null) {
            boolean z2 = viewParentM778e instanceof InterfaceC0277n;
            ViewGroup viewGroup = this.f882c;
            if (z2) {
                ((InterfaceC0277n) viewParentM778e).mo785d(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    AbstractC0246V.m716g(viewParentM778e, viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM778e);
                }
            }
            if (i2 == 0) {
                this.f880a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f881b = null;
            }
        }
    }
}
