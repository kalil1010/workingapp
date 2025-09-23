package p038N0;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0636b;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p072Z.C0603a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: N0.i */
/* loaded from: classes.dex */
public final class C0422i extends AbstractC0414a {

    /* renamed from: g */
    public final float f1308g;

    /* renamed from: h */
    public final float f1309h;

    /* renamed from: i */
    public final float f1310i;

    public C0422i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1308g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f1309h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f1310i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final void m1094a() {
        C0636b c0636b = this.f1297f;
        this.f1297f = null;
        if (c0636b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f1293b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f1296e);
        animatorSet.start();
    }

    /* renamed from: b */
    public final void m1095b(C0636b c0636b, int i2, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i3;
        boolean z2 = c0636b.f1982d == 0;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        View view = this.f1293b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        float f = scaleX + i3;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C0603a(1));
        objectAnimatorOfFloat.setDuration(AbstractC1400a.m3166c(this.f1294c, this.f1295d, c0636b.f1981c));
        objectAnimatorOfFloat.addListener(new C0421h(this, z2, i2));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public final void m1096c(float f, boolean z2, int i2) {
        float interpolation = this.f1292a.getInterpolation(f);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        View view = this.f1293b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        boolean z4 = z2 == z3;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.f1308g / f2;
            float f5 = this.f1309h / f2;
            float f6 = this.f1310i / f3;
            if (z3) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z4) {
                f5 = -f4;
            }
            float fM3164a = AbstractC1400a.m3164a(0.0f, f5, interpolation);
            float f7 = fM3164a + 1.0f;
            view.setScaleX(f7);
            float fM3164a2 = 1.0f - AbstractC1400a.m3164a(0.0f, f6, interpolation);
            view.setScaleY(fM3164a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    childAt.setPivotX(z3 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z4 ? 1.0f - fM3164a : 1.0f;
                    float f9 = fM3164a2 != 0.0f ? (f7 / fM3164a2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
