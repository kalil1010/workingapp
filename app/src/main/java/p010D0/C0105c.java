package p010D0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p009D.AbstractC0098a;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p049R0.AbstractC0472a;
import p055T0.C0512f;
import p055T0.C0513g;
import p055T0.C0517k;
import p055T0.InterfaceC0528v;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: D0.c */
/* loaded from: classes.dex */
public final class C0105c {

    /* renamed from: a */
    public final MaterialButton f241a;

    /* renamed from: b */
    public C0517k f242b;

    /* renamed from: c */
    public int f243c;

    /* renamed from: d */
    public int f244d;

    /* renamed from: e */
    public int f245e;

    /* renamed from: f */
    public int f246f;

    /* renamed from: g */
    public int f247g;

    /* renamed from: h */
    public int f248h;

    /* renamed from: i */
    public PorterDuff.Mode f249i;

    /* renamed from: j */
    public ColorStateList f250j;

    /* renamed from: k */
    public ColorStateList f251k;

    /* renamed from: l */
    public ColorStateList f252l;

    /* renamed from: m */
    public C0513g f253m;

    /* renamed from: q */
    public boolean f257q;

    /* renamed from: s */
    public RippleDrawable f259s;

    /* renamed from: t */
    public int f260t;

    /* renamed from: n */
    public boolean f254n = false;

    /* renamed from: o */
    public boolean f255o = false;

    /* renamed from: p */
    public boolean f256p = false;

    /* renamed from: r */
    public boolean f258r = true;

    public C0105c(MaterialButton materialButton, C0517k c0517k) {
        this.f241a = materialButton;
        this.f242b = c0517k;
    }

    /* renamed from: a */
    public final InterfaceC0528v m309a() {
        RippleDrawable rippleDrawable = this.f259s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f259s.getNumberOfLayers() > 2 ? (InterfaceC0528v) this.f259s.getDrawable(2) : (InterfaceC0528v) this.f259s.getDrawable(1);
    }

    /* renamed from: b */
    public final C0513g m310b(boolean z2) {
        RippleDrawable rippleDrawable = this.f259s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0513g) ((LayerDrawable) ((InsetDrawable) this.f259s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m311c(C0517k c0517k) {
        this.f242b = c0517k;
        if (m310b(false) != null) {
            m310b(false).setShapeAppearanceModel(c0517k);
        }
        if (m310b(true) != null) {
            m310b(true).setShapeAppearanceModel(c0517k);
        }
        if (m309a() != null) {
            m309a().setShapeAppearanceModel(c0517k);
        }
    }

    /* renamed from: d */
    public final void m312d(int i2, int i3) {
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        MaterialButton materialButton = this.f241a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f245e;
        int i5 = this.f246f;
        this.f246f = i3;
        this.f245e = i2;
        if (!this.f255o) {
            m313e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    /* renamed from: e */
    public final void m313e() {
        C0513g c0513g = new C0513g(this.f242b);
        MaterialButton materialButton = this.f241a;
        c0513g.m1288h(materialButton.getContext());
        AbstractC0098a.m300h(c0513g, this.f250j);
        PorterDuff.Mode mode = this.f249i;
        if (mode != null) {
            AbstractC0098a.m301i(c0513g, mode);
        }
        float f = this.f248h;
        ColorStateList colorStateList = this.f251k;
        c0513g.f1601a.f1593j = f;
        c0513g.invalidateSelf();
        C0512f c0512f = c0513g.f1601a;
        if (c0512f.f1587d != colorStateList) {
            c0512f.f1587d = colorStateList;
            c0513g.onStateChange(c0513g.getState());
        }
        C0513g c0513g2 = new C0513g(this.f242b);
        c0513g2.setTint(0);
        float f2 = this.f248h;
        int iM983G = this.f254n ? AbstractC0364l.m983G(materialButton, R.attr.colorSurface) : 0;
        c0513g2.f1601a.f1593j = f2;
        c0513g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM983G);
        C0512f c0512f2 = c0513g2.f1601a;
        if (c0512f2.f1587d != colorStateListValueOf) {
            c0512f2.f1587d = colorStateListValueOf;
            c0513g2.onStateChange(c0513g2.getState());
        }
        C0513g c0513g3 = new C0513g(this.f242b);
        this.f253m = c0513g3;
        AbstractC0098a.m299g(c0513g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0472a.m1161a(this.f252l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0513g2, c0513g}), this.f243c, this.f245e, this.f244d, this.f246f), this.f253m);
        this.f259s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0513g c0513gM310b = m310b(false);
        if (c0513gM310b != null) {
            c0513gM310b.m1289i(this.f260t);
            c0513gM310b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m314f() {
        C0513g c0513gM310b = m310b(false);
        C0513g c0513gM310b2 = m310b(true);
        if (c0513gM310b != null) {
            float f = this.f248h;
            ColorStateList colorStateList = this.f251k;
            c0513gM310b.f1601a.f1593j = f;
            c0513gM310b.invalidateSelf();
            C0512f c0512f = c0513gM310b.f1601a;
            if (c0512f.f1587d != colorStateList) {
                c0512f.f1587d = colorStateList;
                c0513gM310b.onStateChange(c0513gM310b.getState());
            }
            if (c0513gM310b2 != null) {
                float f2 = this.f248h;
                int iM983G = this.f254n ? AbstractC0364l.m983G(this.f241a, R.attr.colorSurface) : 0;
                c0513gM310b2.f1601a.f1593j = f2;
                c0513gM310b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM983G);
                C0512f c0512f2 = c0513gM310b2.f1601a;
                if (c0512f2.f1587d != colorStateListValueOf) {
                    c0512f2.f1587d = colorStateListValueOf;
                    c0513gM310b2.onStateChange(c0513gM310b2.getState());
                }
            }
        }
    }
}
