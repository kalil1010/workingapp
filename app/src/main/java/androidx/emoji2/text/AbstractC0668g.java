package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p094f0.AbstractC0911J;
import p094f0.C0959x;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public abstract class AbstractC0668g {

    /* renamed from: a */
    public int f2390a;

    /* renamed from: b */
    public final Object f2391b;

    /* renamed from: c */
    public final Object f2392c;

    public AbstractC0668g(AbstractC0911J abstractC0911J) {
        this.f2390a = Integer.MIN_VALUE;
        this.f2392c = new Rect();
        this.f2391b = abstractC0911J;
    }

    /* renamed from: a */
    public static AbstractC0668g m1610a(AbstractC0911J abstractC0911J, int i2) {
        if (i2 == 0) {
            return new C0959x(abstractC0911J, 0);
        }
        if (i2 == 1) {
            return new C0959x(abstractC0911J, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1611b(View view);

    /* renamed from: c */
    public abstract int mo1612c(View view);

    /* renamed from: d */
    public abstract int mo1613d(View view);

    /* renamed from: e */
    public abstract int mo1614e(View view);

    /* renamed from: f */
    public abstract int mo1615f();

    /* renamed from: g */
    public abstract int mo1616g();

    /* renamed from: h */
    public abstract int mo1617h();

    /* renamed from: i */
    public abstract int mo1618i();

    /* renamed from: j */
    public abstract int mo1619j();

    /* renamed from: k */
    public abstract int mo1620k();

    /* renamed from: l */
    public abstract int mo1621l();

    /* renamed from: m */
    public abstract int mo1622m(View view);

    /* renamed from: n */
    public abstract int mo1623n(View view);

    /* renamed from: o */
    public abstract void mo1624o(int i2);

    public AbstractC0668g(InterfaceC0670i interfaceC0670i) {
        this.f2390a = 0;
        this.f2392c = new C0665d();
        this.f2391b = interfaceC0670i;
    }
}
