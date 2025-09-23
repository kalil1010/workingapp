package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.InterfaceC0735L;
import androidx.lifecycle.InterfaceC0753r;
import p002A1.AbstractActivityC0021c;
import p033L1.AbstractC0364l;
import p090e.AbstractActivityC0874g;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C0715r extends AbstractC0364l implements InterfaceC0735L, InterfaceC0753r, InterfaceC0689G {

    /* renamed from: f */
    public final AbstractActivityC0874g f2658f;

    /* renamed from: g */
    public final AbstractActivityC0874g f2659g;

    /* renamed from: h */
    public final Handler f2660h;

    /* renamed from: i */
    public final C0686D f2661i;

    /* renamed from: j */
    public final /* synthetic */ AbstractActivityC0021c f2662j;

    public C0715r(AbstractActivityC0021c abstractActivityC0021c) {
        this.f2662j = abstractActivityC0021c;
        Handler handler = new Handler();
        this.f2661i = new C0686D();
        this.f2658f = abstractActivityC0021c;
        this.f2659g = abstractActivityC0021c;
        this.f2660h = handler;
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: V */
    public final View mo1021V(int i2) {
        return this.f2662j.findViewById(i2);
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: W */
    public final boolean mo1022W() {
        Window window = this.f2662j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.InterfaceC0735L
    /* renamed from: c */
    public final C0734K mo1452c() {
        return this.f2662j.mo1452c();
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        return this.f2662j.f3608q;
    }

    @Override // androidx.fragment.app.InterfaceC0689G
    /* renamed from: f */
    public final void mo1697f() {
    }
}
