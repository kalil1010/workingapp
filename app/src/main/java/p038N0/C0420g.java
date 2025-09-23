package p038N0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p072Z.C0603a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: N0.g */
/* loaded from: classes.dex */
public final class C0420g extends AbstractC0414a {

    /* renamed from: g */
    public final float f1303g;

    /* renamed from: h */
    public final float f1304h;

    public C0420g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1303g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f1304h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final AnimatorSet m1092a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f1293b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0603a(1));
        return animatorSet;
    }

    /* renamed from: b */
    public final void m1093b(float f) {
        float interpolation = this.f1292a.getInterpolation(f);
        View view = this.f1293b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f1303g / width;
        float f3 = this.f1304h / height;
        float fM3164a = 1.0f - AbstractC1400a.m3164a(0.0f, f2, interpolation);
        float fM3164a2 = 1.0f - AbstractC1400a.m3164a(0.0f, f3, interpolation);
        view.setScaleX(fM3164a);
        view.setPivotY(height);
        view.setScaleY(fM3164a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM3164a2 != 0.0f ? fM3164a / fM3164a2 : 1.0f);
            }
        }
    }
}
