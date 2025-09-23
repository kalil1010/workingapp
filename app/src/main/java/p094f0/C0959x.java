package p094f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0668g;

/* renamed from: f0.x */
/* loaded from: classes.dex */
public final class C0959x extends AbstractC0668g {

    /* renamed from: d */
    public final /* synthetic */ int f4028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0959x(AbstractC0911J abstractC0911J, int i2) {
        super(abstractC0911J);
        this.f4028d = i2;
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: b */
    public final int mo1611b(View view) {
        switch (this.f4028d) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return view.getRight() + ((C0912K) view.getLayoutParams()).f3768b.right + ((ViewGroup.MarginLayoutParams) c0912k).rightMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return view.getBottom() + ((C0912K) view.getLayoutParams()).f3768b.bottom + ((ViewGroup.MarginLayoutParams) c0912k2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: c */
    public final int mo1612c(View view) {
        switch (this.f4028d) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return AbstractC0911J.m2345A(view) + ((ViewGroup.MarginLayoutParams) c0912k).leftMargin + ((ViewGroup.MarginLayoutParams) c0912k).rightMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return AbstractC0911J.m2352z(view) + ((ViewGroup.MarginLayoutParams) c0912k2).topMargin + ((ViewGroup.MarginLayoutParams) c0912k2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: d */
    public final int mo1613d(View view) {
        switch (this.f4028d) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return AbstractC0911J.m2352z(view) + ((ViewGroup.MarginLayoutParams) c0912k).topMargin + ((ViewGroup.MarginLayoutParams) c0912k).bottomMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return AbstractC0911J.m2345A(view) + ((ViewGroup.MarginLayoutParams) c0912k2).leftMargin + ((ViewGroup.MarginLayoutParams) c0912k2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: e */
    public final int mo1614e(View view) {
        switch (this.f4028d) {
            case 0:
                C0912K c0912k = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return (view.getLeft() - ((C0912K) view.getLayoutParams()).f3768b.left) - ((ViewGroup.MarginLayoutParams) c0912k).leftMargin;
            default:
                C0912K c0912k2 = (C0912K) view.getLayoutParams();
                ((AbstractC0911J) this.f2391b).getClass();
                return (view.getTop() - ((C0912K) view.getLayoutParams()).f3768b.top) - ((ViewGroup.MarginLayoutParams) c0912k2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: f */
    public final int mo1615f() {
        switch (this.f4028d) {
            case 0:
                return ((AbstractC0911J) this.f2391b).f3765n;
            default:
                return ((AbstractC0911J) this.f2391b).f3766o;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: g */
    public final int mo1616g() {
        switch (this.f4028d) {
            case 0:
                AbstractC0911J abstractC0911J = (AbstractC0911J) this.f2391b;
                return abstractC0911J.f3765n - abstractC0911J.m2357F();
            default:
                AbstractC0911J abstractC0911J2 = (AbstractC0911J) this.f2391b;
                return abstractC0911J2.f3766o - abstractC0911J2.m2355D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: h */
    public final int mo1617h() {
        switch (this.f4028d) {
            case 0:
                return ((AbstractC0911J) this.f2391b).m2357F();
            default:
                return ((AbstractC0911J) this.f2391b).m2355D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: i */
    public final int mo1618i() {
        switch (this.f4028d) {
            case 0:
                return ((AbstractC0911J) this.f2391b).f3763l;
            default:
                return ((AbstractC0911J) this.f2391b).f3764m;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: j */
    public final int mo1619j() {
        switch (this.f4028d) {
            case 0:
                return ((AbstractC0911J) this.f2391b).f3764m;
            default:
                return ((AbstractC0911J) this.f2391b).f3763l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: k */
    public final int mo1620k() {
        switch (this.f4028d) {
            case 0:
                return ((AbstractC0911J) this.f2391b).m2356E();
            default:
                return ((AbstractC0911J) this.f2391b).m2358G();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: l */
    public final int mo1621l() {
        switch (this.f4028d) {
            case 0:
                AbstractC0911J abstractC0911J = (AbstractC0911J) this.f2391b;
                return (abstractC0911J.f3765n - abstractC0911J.m2356E()) - abstractC0911J.m2357F();
            default:
                AbstractC0911J abstractC0911J2 = (AbstractC0911J) this.f2391b;
                return (abstractC0911J2.f3766o - abstractC0911J2.m2358G()) - abstractC0911J2.m2355D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: m */
    public final int mo1622m(View view) {
        switch (this.f4028d) {
            case 0:
                AbstractC0911J abstractC0911J = (AbstractC0911J) this.f2391b;
                Rect rect = (Rect) this.f2392c;
                abstractC0911J.m2359K(rect, view);
                return rect.right;
            default:
                AbstractC0911J abstractC0911J2 = (AbstractC0911J) this.f2391b;
                Rect rect2 = (Rect) this.f2392c;
                abstractC0911J2.m2359K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: n */
    public final int mo1623n(View view) {
        switch (this.f4028d) {
            case 0:
                AbstractC0911J abstractC0911J = (AbstractC0911J) this.f2391b;
                Rect rect = (Rect) this.f2392c;
                abstractC0911J.m2359K(rect, view);
                return rect.left;
            default:
                AbstractC0911J abstractC0911J2 = (AbstractC0911J) this.f2391b;
                Rect rect2 = (Rect) this.f2392c;
                abstractC0911J2.m2359K(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0668g
    /* renamed from: o */
    public final void mo1624o(int i2) {
        switch (this.f4028d) {
            case 0:
                ((AbstractC0911J) this.f2391b).mo1947O(i2);
                break;
            default:
                ((AbstractC0911J) this.f2391b).mo1949P(i2);
                break;
        }
    }
}
