package p094f0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;

/* renamed from: f0.C */
/* loaded from: classes.dex */
public final class C0904C extends Observable {
    /* renamed from: a */
    public final boolean m2331a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m2332b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0919S) ((Observable) this).mObservers.get(size)).f3785a;
            recyclerView.m1915i(null);
            recyclerView.f2812e0.f3798f = true;
            recyclerView.m1901V(true);
            if (!recyclerView.f2809d.m2419j()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public final void m2333c(int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0919S) ((Observable) this).mObservers.get(size)).f3785a;
            recyclerView.m1915i(null);
            C0929b c0929b = recyclerView.f2809d;
            ArrayList arrayList = (ArrayList) c0929b.f3840c;
            arrayList.add(c0929b.m2421l(1, i2, 1));
            c0929b.f3838a |= 1;
            if (arrayList.size() == 1) {
                int[] iArr = RecyclerView.f2777u0;
                if (recyclerView.f2837r && recyclerView.f2835q) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    recyclerView.postOnAnimation(recyclerView.f2817h);
                } else {
                    recyclerView.f2847y = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
