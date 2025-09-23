package p060V;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p002A1.RunnableC0042x;
import p054T.C0506e;
import p093e2.AbstractC0901d;

/* renamed from: V.f */
/* loaded from: classes.dex */
public final class C0544f extends AbstractC0901d {

    /* renamed from: c */
    public final int f1717c;

    /* renamed from: d */
    public C0506e f1718d;

    /* renamed from: e */
    public final RunnableC0042x f1719e = new RunnableC0042x(6, this);

    /* renamed from: f */
    public final /* synthetic */ DrawerLayout f1720f;

    public C0544f(DrawerLayout drawerLayout, int i2) {
        this.f1720f = drawerLayout;
        this.f1717c = i2;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: J */
    public final int mo6J(View view) {
        if (DrawerLayout.m1586p(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: W */
    public final void mo1331W(int i2, int i3) {
        int i4 = i2 & 1;
        DrawerLayout drawerLayout = this.f1720f;
        View viewM1593f = i4 == 1 ? drawerLayout.m1593f(3) : drawerLayout.m1593f(5);
        if (viewM1593f == null || drawerLayout.m1597j(viewM1593f) != 0) {
            return;
        }
        this.f1718d.m1252b(viewM1593f, i3);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: X */
    public final void mo1332X() {
        this.f1720f.postDelayed(this.f1719e, 160L);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: Z */
    public final void mo7Z(View view, int i2) {
        ((C0542d) view.getLayoutParams()).f1710c = false;
        int i3 = this.f1717c == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f1720f;
        View viewM1593f = drawerLayout.m1593f(i3);
        if (viewM1593f != null) {
            drawerLayout.m1590c(viewM1593f, true);
        }
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: a0 */
    public final void mo8a0(int i2) {
        this.f1720f.m1605x(this.f1718d.f1575t, i2);
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: b0 */
    public final void mo9b0(View view, int i2, int i3) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f1720f;
        float width2 = (drawerLayout.m1589b(view, 3) ? i2 + width : drawerLayout.getWidth() - i2) / width;
        drawerLayout.m1602u(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: c0 */
    public final void mo10c0(View view, float f, float f2) {
        int i2;
        DrawerLayout drawerLayout = this.f1720f;
        int[] iArr = DrawerLayout.f2348D;
        float f3 = ((C0542d) view.getLayoutParams()).f1709b;
        int width = view.getWidth();
        if (drawerLayout.m1589b(view, 3)) {
            i2 = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i2 = width2;
        }
        this.f1718d.m1266p(i2, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: i */
    public final int mo11i(View view, int i2) {
        DrawerLayout drawerLayout = this.f1720f;
        if (drawerLayout.m1589b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i2, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i2, width));
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: j */
    public final int mo12j(View view, int i2) {
        return view.getTop();
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: t0 */
    public final boolean mo13t0(View view, int i2) {
        DrawerLayout drawerLayout = this.f1720f;
        return DrawerLayout.m1586p(view) && drawerLayout.m1589b(view, this.f1717c) && drawerLayout.m1597j(view) == 0;
    }
}
