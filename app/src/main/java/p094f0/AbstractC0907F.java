package p094f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p002A1.C0027i;
import p027J1.C0219a;
import p028K.C0281p;

/* renamed from: f0.F */
/* loaded from: classes.dex */
public abstract class AbstractC0907F {

    /* renamed from: a */
    public C0902A f3740a;

    /* renamed from: b */
    public ArrayList f3741b;

    /* renamed from: c */
    public long f3742c;

    /* renamed from: d */
    public long f3743d;

    /* renamed from: e */
    public long f3744e;

    /* renamed from: f */
    public long f3745f;

    /* renamed from: b */
    public static void m2334b(AbstractC0926Z abstractC0926Z) {
        RecyclerView recyclerView;
        int i2 = abstractC0926Z.f3824j;
        if (abstractC0926Z.m2399f() || (i2 & 4) != 0 || (recyclerView = abstractC0926Z.f3832r) == null) {
            return;
        }
        recyclerView.m1887F(abstractC0926Z);
    }

    /* renamed from: a */
    public abstract boolean mo2335a(AbstractC0926Z abstractC0926Z, AbstractC0926Z abstractC0926Z2, C0281p c0281p, C0281p c0281p2);

    /* renamed from: c */
    public final void m2336c(AbstractC0926Z abstractC0926Z) {
        C0902A c0902a = this.f3740a;
        if (c0902a != null) {
            boolean z2 = true;
            abstractC0926Z.m2407n(true);
            if (abstractC0926Z.f3822h != null && abstractC0926Z.f3823i == null) {
                abstractC0926Z.f3822h = null;
            }
            abstractC0926Z.f3823i = null;
            if ((abstractC0926Z.f3824j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0902a.f3737a;
            recyclerView.m1909d0();
            C0027i c0027i = recyclerView.f2811e;
            C0902A c0902a2 = (C0902A) c0027i.f65b;
            RecyclerView recyclerView2 = c0902a2.f3737a;
            View view = abstractC0926Z.f3815a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0027i.m116T(view);
            } else {
                C0219a c0219a = (C0219a) c0027i.f66c;
                if (c0219a.m602d(iIndexOfChild)) {
                    c0219a.m605g(iIndexOfChild);
                    c0027i.m116T(view);
                    c0902a2.m2330h(iIndexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
                C0917P c0917p = recyclerView.f2805b;
                c0917p.m2387j(abstractC0926ZM1876I);
                c0917p.m2384g(abstractC0926ZM1876I);
            }
            recyclerView.m1910e0(!z2);
            if (z2 || !abstractC0926Z.m2403j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo2337d(AbstractC0926Z abstractC0926Z);

    /* renamed from: e */
    public abstract void mo2338e();

    /* renamed from: f */
    public abstract boolean mo2339f();
}
