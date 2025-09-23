package p041O0;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;
import p002A1.C0027i;
import p002A1.RunnableC0030l;
import p038N0.C0417d;
import p060V.InterfaceC0541c;

/* renamed from: O0.b */
/* loaded from: classes.dex */
public final class C0426b implements InterfaceC0541c {

    /* renamed from: a */
    public final /* synthetic */ NavigationView f1313a;

    public C0426b(NavigationView navigationView) {
        this.f1313a = navigationView;
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: a */
    public final void mo155a(float f) {
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: b */
    public final void mo156b(View view) {
        NavigationView navigationView = this.f1313a;
        if (view == navigationView) {
            C0027i c0027i = navigationView.f3299u;
            Objects.requireNonNull(c0027i);
            view.post(new RunnableC0030l(3, c0027i));
        }
    }

    @Override // p060V.InterfaceC0541c
    /* renamed from: c */
    public final void mo157c(View view) {
        NavigationView navigationView = this.f1313a;
        if (view == navigationView) {
            C0027i c0027i = navigationView.f3299u;
            C0417d c0417d = (C0417d) c0027i.f65b;
            if (c0417d != null) {
                c0417d.m1091c((NavigationView) c0027i.f67d);
            }
            if (!navigationView.f3295q || navigationView.f3294p == 0) {
                return;
            }
            navigationView.f3294p = 0;
            navigationView.m2105g(navigationView.getWidth(), navigationView.getHeight());
        }
    }
}
