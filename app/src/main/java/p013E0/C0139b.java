package p013E0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import p094f0.C0921U;
import p094f0.C0958w;
import p094f0.C0960y;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public final class C0139b extends C0958w {

    /* renamed from: p */
    public final /* synthetic */ int f484p;

    /* renamed from: q */
    public final /* synthetic */ Object f485q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139b(Object obj, Context context, int i2) {
        super(context);
        this.f484p = i2;
        this.f485q = obj;
    }

    @Override // p094f0.C0958w
    /* renamed from: b */
    public int mo378b(View view, int i2) {
        switch (this.f484p) {
            case 0:
                ((CarouselLayoutManager) this.f485q).getClass();
                return 0;
            default:
                return super.mo378b(view, i2);
        }
    }

    @Override // p094f0.C0958w
    /* renamed from: c */
    public int mo379c(View view, int i2) {
        switch (this.f484p) {
            case 0:
                ((CarouselLayoutManager) this.f485q).getClass();
                return 0;
            default:
                return super.mo379c(view, i2);
        }
    }

    @Override // p094f0.C0958w
    /* renamed from: d */
    public float mo380d(DisplayMetrics displayMetrics) {
        switch (this.f484p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo380d(displayMetrics);
        }
    }

    @Override // p094f0.C0958w
    /* renamed from: e */
    public int mo381e(int i2) {
        switch (this.f484p) {
            case 1:
                return Math.min(100, super.mo381e(i2));
            default:
                return super.mo381e(i2);
        }
    }

    @Override // p094f0.C0958w
    /* renamed from: f */
    public PointF mo382f(int i2) {
        switch (this.f484p) {
            case 0:
                ((CarouselLayoutManager) this.f485q).getClass();
                return null;
            default:
                return super.mo382f(i2);
        }
    }

    @Override // p094f0.C0958w
    /* renamed from: h */
    public void mo383h(View view, C0921U c0921u) {
        switch (this.f484p) {
            case 1:
                C0960y c0960y = (C0960y) this.f485q;
                int[] iArrM2469a = c0960y.m2469a(c0960y.f4029a.getLayoutManager(), view);
                int i2 = iArrM2469a[0];
                int i3 = iArrM2469a[1];
                int iCeil = (int) Math.ceil(mo381e(Math.max(Math.abs(i2), Math.abs(i3))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f4021i;
                    c0921u.f3787a = i2;
                    c0921u.f3788b = i3;
                    c0921u.f3789c = iCeil;
                    c0921u.f3791e = decelerateInterpolator;
                    c0921u.f3792f = true;
                    break;
                }
                break;
            default:
                super.mo383h(view, c0921u);
                break;
        }
    }
}
