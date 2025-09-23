package p028K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p006C.C0072d;
import p026J0.AbstractC0217b;

/* renamed from: K.e0 */
/* loaded from: classes.dex */
public final class C0260e0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final C0257d f848a;

    /* renamed from: b */
    public List f849b;

    /* renamed from: c */
    public ArrayList f850c;

    /* renamed from: d */
    public final HashMap f851d;

    public C0260e0(C0257d c0257d) {
        super(0);
        this.f851d = new HashMap();
        this.f848a = c0257d;
    }

    /* renamed from: a */
    public final C0266h0 m740a(WindowInsetsAnimation windowInsetsAnimation) {
        C0266h0 c0266h0 = (C0266h0) this.f851d.get(windowInsetsAnimation);
        if (c0266h0 == null) {
            c0266h0 = new C0266h0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0266h0.f867a = new C0262f0(windowInsetsAnimation);
            }
            this.f851d.put(windowInsetsAnimation, c0266h0);
        }
        return c0266h0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0257d c0257d = this.f848a;
        m740a(windowInsetsAnimation);
        ((View) c0257d.f843e).setTranslationY(0.0f);
        this.f851d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0257d c0257d = this.f848a;
        m740a(windowInsetsAnimation);
        View view = (View) c0257d.f843e;
        int[] iArr = (int[]) c0257d.f844f;
        view.getLocationOnScreen(iArr);
        c0257d.f841c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f850c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f850c = arrayList2;
            this.f849b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM581j = AbstractC0217b.m581j(list.get(size));
            C0266h0 c0266h0M740a = m740a(windowInsetsAnimationM581j);
            c0266h0M740a.f867a.mo744d(windowInsetsAnimationM581j.getFraction());
            this.f850c.add(c0266h0M740a);
        }
        C0257d c0257d = this.f848a;
        C0292u0 c0292u0M817g = C0292u0.m817g(null, windowInsets);
        c0257d.m733d(c0292u0M817g, this.f849b);
        return c0292u0M817g.m822f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0257d c0257d = this.f848a;
        m740a(windowInsetsAnimation);
        C0072d c0072dM229c = C0072d.m229c(bounds.getLowerBound());
        C0072d c0072dM229c2 = C0072d.m229c(bounds.getUpperBound());
        View view = (View) c0257d.f843e;
        int[] iArr = (int[]) c0257d.f844f;
        view.getLocationOnScreen(iArr);
        int i2 = c0257d.f841c - iArr[1];
        c0257d.f842d = i2;
        view.setTranslationY(i2);
        AbstractC0217b.m584m();
        return AbstractC0217b.m579h(c0072dM229c.m230d(), c0072dM229c2.m230d());
    }
}
