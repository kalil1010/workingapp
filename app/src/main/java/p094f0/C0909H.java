package p094f0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.H */
/* loaded from: classes.dex */
public final class C0909H {

    /* renamed from: a */
    public final /* synthetic */ int f3746a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0911J f3747b;

    public /* synthetic */ C0909H(AbstractC0911J abstractC0911J, int i2) {
        this.f3746a = i2;
        this.f3747b = abstractC0911J;
    }

    /* renamed from: a */
    public final int m2341a(View view) {
        switch (this.f3746a) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                this.f3747b.getClass();
                return view.getRight() + ((C0912K) view.getLayoutParams()).f3768b.right + ((ViewGroup.MarginLayoutParams) c0912k).rightMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                this.f3747b.getClass();
                return view.getBottom() + ((C0912K) view.getLayoutParams()).f3768b.bottom + ((ViewGroup.MarginLayoutParams) c0912k2).bottomMargin;
        }
    }

    /* renamed from: b */
    public final int m2342b(View view) {
        switch (this.f3746a) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                this.f3747b.getClass();
                return (view.getLeft() - ((C0912K) view.getLayoutParams()).f3768b.left) - ((ViewGroup.MarginLayoutParams) c0912k).leftMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                this.f3747b.getClass();
                return (view.getTop() - ((C0912K) view.getLayoutParams()).f3768b.top) - ((ViewGroup.MarginLayoutParams) c0912k2).topMargin;
        }
    }

    /* renamed from: c */
    public final int m2343c() {
        switch (this.f3746a) {
            case 0:
                AbstractC0911J abstractC0911J = this.f3747b;
                return abstractC0911J.f3765n - abstractC0911J.m2357F();
            default:
                AbstractC0911J abstractC0911J2 = this.f3747b;
                return abstractC0911J2.f3766o - abstractC0911J2.m2355D();
        }
    }

    /* renamed from: d */
    public final int m2344d() {
        switch (this.f3746a) {
            case 0:
                return this.f3747b.m2356E();
            default:
                return this.f3747b.m2358G();
        }
    }
}
