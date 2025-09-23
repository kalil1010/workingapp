package p148y0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p119o.C1249k;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C1401b {

    /* renamed from: a */
    public final C1249k f6070a = new C1249k();

    /* renamed from: b */
    public final C1249k f6071b = new C1249k();

    /* renamed from: a */
    public static C1401b m3167a(Context context, int i2) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m3168b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m3168b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i2);
            return null;
        }
    }

    /* renamed from: b */
    public static C1401b m3168b(ArrayList arrayList) {
        C1401b c1401b = new C1401b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1401b.f6071b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1400a.f6067b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1400a.f6068c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1400a.f6069d;
            }
            C1402c c1402c = new C1402c();
            c1402c.f6075d = 0;
            c1402c.f6076e = 1;
            c1402c.f6072a = startDelay;
            c1402c.f6073b = duration;
            c1402c.f6074c = interpolator;
            c1402c.f6075d = objectAnimator.getRepeatCount();
            c1402c.f6076e = objectAnimator.getRepeatMode();
            c1401b.f6070a.put(propertyName, c1402c);
        }
        return c1401b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1401b) {
            return this.f6070a.equals(((C1401b) obj).f6070a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6070a.hashCode();
    }

    public final String toString() {
        return "\n" + C1401b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f6070a + "}\n";
    }
}
