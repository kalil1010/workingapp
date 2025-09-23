package p094f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.b0 */
/* loaded from: classes.dex */
public final class C0930b0 extends AbstractC0914M {

    /* renamed from: a */
    public boolean f3844a = false;

    /* renamed from: b */
    public final /* synthetic */ C0960y f3845b;

    public C0930b0(C0960y c0960y) {
        this.f3845b = c0960y;
    }

    @Override // p094f0.AbstractC0914M
    /* renamed from: a */
    public final void mo2083a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f3844a) {
            this.f3844a = false;
            this.f3845b.m2472f();
        }
    }

    @Override // p094f0.AbstractC0914M
    /* renamed from: b */
    public final void mo2084b(RecyclerView recyclerView, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.f3844a = true;
    }
}
