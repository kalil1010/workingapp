package p106j0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p033L1.AbstractC0356d;
import p080b1.C0767e;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C1157f extends AbstractC1164m {

    /* renamed from: A */
    public static final String[] f4733A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C1153b f4734B = new C1153b(PointF.class, "topLeft", 0);

    /* renamed from: C */
    public static final C1153b f4735C = new C1153b(PointF.class, "bottomRight", 1);

    /* renamed from: D */
    public static final C1153b f4736D = new C1153b(PointF.class, "bottomRight", 2);

    /* renamed from: E */
    public static final C1153b f4737E = new C1153b(PointF.class, "topLeft", 3);

    /* renamed from: F */
    public static final C1153b f4738F = new C1153b(PointF.class, "position", 4);

    /* renamed from: I */
    public static void m2793I(C1172u c1172u) {
        View view = c1172u.f4791b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c1172u.f4790a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c1172u.f4791b.getParent());
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: d */
    public final void mo2784d(C1172u c1172u) {
        m2793I(c1172u);
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: g */
    public final void mo2786g(C1172u c1172u) {
        m2793I(c1172u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p106j0.AbstractC1164m
    /* renamed from: k */
    public final Animator mo2794k(ViewGroup viewGroup, C1172u c1172u, C1172u c1172u2) {
        int i2;
        C1157f c1157f;
        ObjectAnimator objectAnimatorM2802a;
        if (c1172u != null && c1172u2 != null) {
            HashMap map = c1172u.f4790a;
            HashMap map2 = c1172u2.f4790a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) map.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                    i2 = 0;
                } else {
                    i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                if (i2 > 0) {
                    View view = c1172u2.f4791b;
                    AbstractC1174w.m2822a(view, i3, i5, i7, i9);
                    if (i2 != 2) {
                        c1157f = this;
                        if (i3 == i4 && i5 == i6) {
                            c1157f.f4779v.getClass();
                            objectAnimatorM2802a = AbstractC1160i.m2802a(view, f4736D, C0767e.m1975h(i7, i9, i8, i10));
                        } else {
                            c1157f.f4779v.getClass();
                            objectAnimatorM2802a = AbstractC1160i.m2802a(view, f4737E, C0767e.m1975h(i3, i5, i4, i6));
                        }
                    } else if (i11 == i13 && i12 == i14) {
                        c1157f = this;
                        c1157f.f4779v.getClass();
                        objectAnimatorM2802a = AbstractC1160i.m2802a(view, f4738F, C0767e.m1975h(i3, i5, i4, i6));
                    } else {
                        c1157f = this;
                        C1156e c1156e = new C1156e(view);
                        c1157f.f4779v.getClass();
                        ObjectAnimator objectAnimatorM2802a2 = AbstractC1160i.m2802a(c1156e, f4734B, C0767e.m1975h(i3, i5, i4, i6));
                        c1157f.f4779v.getClass();
                        ObjectAnimator objectAnimatorM2802a3 = AbstractC1160i.m2802a(c1156e, f4735C, C0767e.m1975h(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM2802a2, objectAnimatorM2802a3);
                        animatorSet.addListener(new C1154c(c1156e));
                        objectAnimatorM2802a = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        AbstractC0356d.m948I(viewGroup4, true);
                        c1157f.m2813o().m2807a(new C1155d(viewGroup4));
                    }
                    return objectAnimatorM2802a;
                }
            }
        }
        return null;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: q */
    public final String[] mo2795q() {
        return f4733A;
    }
}
