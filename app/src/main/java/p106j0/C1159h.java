package p106j0;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C1159h extends AbstractC1164m {

    /* renamed from: B */
    public static final String[] f4741B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A */
    public final int f4742A;

    public C1159h(int i2) {
        this();
        this.f4742A = i2;
    }

    /* renamed from: I */
    public static void m2797I(C1172u c1172u) {
        int visibility = c1172u.f4791b.getVisibility();
        HashMap map = c1172u.f4790a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1172u.f4791b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: K */
    public static float m2798K(C1172u c1172u, float f) {
        Float f2;
        return (c1172u == null || (f2 = (Float) c1172u.f4790a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p106j0.C1151F m2799L(p106j0.C1172u r8, p106j0.C1172u r9) {
        /*
            j0.F r0 = new j0.F
            r0.<init>()
            r1 = 0
            r0.f4712a = r1
            r0.f4713b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f4790a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f4714c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4716e = r6
            goto L33
        L2f:
            r0.f4714c = r3
            r0.f4716e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f4790a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f4715d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4717f = r2
            goto L56
        L52:
            r0.f4715d = r3
            r0.f4717f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f4714c
            int r9 = r0.f4715d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f4716e
            android.view.ViewGroup r4 = r0.f4717f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f4713b = r1
            r0.f4712a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f4713b = r2
            r0.f4712a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f4717f
            if (r8 != 0) goto L81
            r0.f4713b = r1
            r0.f4712a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f4716e
            if (r8 != 0) goto L9f
            r0.f4713b = r2
            r0.f4712a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f4715d
            if (r8 != 0) goto L95
            r0.f4713b = r2
            r0.f4712a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f4714c
            if (r8 != 0) goto L9f
            r0.f4713b = r1
            r0.f4712a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p106j0.C1159h.m2799L(j0.u, j0.u):j0.F");
    }

    /* renamed from: J */
    public final ObjectAnimator m2800J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC1174w.f4793a.mo1026h0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC1174w.f4794b, f2);
        C1158g c1158g = new C1158g(view);
        objectAnimatorOfFloat.addListener(c1158g);
        m2813o().m2807a(c1158g);
        return objectAnimatorOfFloat;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: d */
    public final void mo2784d(C1172u c1172u) {
        m2797I(c1172u);
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: g */
    public final void mo2786g(C1172u c1172u) {
        m2797I(c1172u);
        View view = c1172u.f4791b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC1174w.f4793a.mo1018L(view)) : Float.valueOf(0.0f);
        }
        c1172u.f4790a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (m2799L(m2812n(r3, false), m2814r(r3, false)).f4712a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    @Override // p106j0.AbstractC1164m
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo2794k(android.view.ViewGroup r24, p106j0.C1172u r25, p106j0.C1172u r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p106j0.C1159h.mo2794k(android.view.ViewGroup, j0.u, j0.u):android.animation.Animator");
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: q */
    public final String[] mo2795q() {
        return f4741B;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: s */
    public final boolean mo2801s(C1172u c1172u, C1172u c1172u2) {
        if (c1172u == null && c1172u2 == null) {
            return false;
        }
        if (c1172u != null && c1172u2 != null && c1172u2.f4790a.containsKey("android:visibility:visibility") != c1172u.f4790a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1151F c1151fM2799L = m2799L(c1172u, c1172u2);
        if (c1151fM2799L.f4712a) {
            return c1151fM2799L.f4714c == 0 || c1151fM2799L.f4715d == 0;
        }
        return false;
    }

    public C1159h() {
        this.f4742A = 3;
    }
}
