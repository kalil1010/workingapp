package p055T0;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import p018G0.C0163c;

/* renamed from: T0.y */
/* loaded from: classes.dex */
public final class C0531y extends AbstractC0529w {
    public C0531y(NavigationView navigationView) {
        m1314d(navigationView);
    }

    /* renamed from: d */
    private void m1314d(View view) {
        view.setOutlineProvider(new C0163c(2, this));
    }

    @Override // p055T0.AbstractC0529w
    /* renamed from: a */
    public final void mo1310a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f1686a);
        if (this.f1686a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // p055T0.AbstractC0529w
    /* renamed from: b */
    public final boolean mo1311b() {
        return this.f1686a;
    }
}
