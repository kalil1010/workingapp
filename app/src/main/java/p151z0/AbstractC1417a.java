package p151z0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C0819k;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p144x.AbstractC1388a;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1417a extends AbstractC1388a {

    /* renamed from: a */
    public C0819k f6099a;

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        mo2035v(coordinatorLayout, view, i2);
        if (this.f6099a == null) {
            this.f6099a = new C0819k(view);
        }
        C0819k c0819k = this.f6099a;
        View view2 = c0819k.f3196a;
        c0819k.f3197b = view2.getTop();
        c0819k.f3198c = view2.getLeft();
        C0819k c0819k2 = this.f6099a;
        View view3 = c0819k2.f3196a;
        int top = 0 - (view3.getTop() - c0819k2.f3197b);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0819k2.f3198c));
        return true;
    }

    /* renamed from: v */
    public void mo2035v(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.m1560p(view, i2);
    }
}
