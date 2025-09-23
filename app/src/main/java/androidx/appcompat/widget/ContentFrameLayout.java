package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p028K.C0248X;
import p090e.C0880m;
import p090e.LayoutInflaterFactory2C0888u;
import p102i.MenuC1006l;
import p105j.C1089f;
import p105j.C1104k;
import p105j.C1112m1;
import p105j.InterfaceC1108l0;
import p105j.InterfaceC1111m0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f2147a;

    /* renamed from: b */
    public TypedValue f2148b;

    /* renamed from: c */
    public TypedValue f2149c;

    /* renamed from: d */
    public TypedValue f2150d;

    /* renamed from: e */
    public TypedValue f2151e;

    /* renamed from: f */
    public TypedValue f2152f;

    /* renamed from: g */
    public final Rect f2153g;

    /* renamed from: h */
    public InterfaceC1108l0 f2154h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2153g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2151e == null) {
            this.f2151e = new TypedValue();
        }
        return this.f2151e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2152f == null) {
            this.f2152f = new TypedValue();
        }
        return this.f2152f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2149c == null) {
            this.f2149c = new TypedValue();
        }
        return this.f2149c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2150d == null) {
            this.f2150d = new TypedValue();
        }
        return this.f2150d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2147a == null) {
            this.f2147a = new TypedValue();
        }
        return this.f2147a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2148b == null) {
            this.f2148b = new TypedValue();
        }
        return this.f2148b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1108l0 interfaceC1108l0 = this.f2154h;
        if (interfaceC1108l0 != null) {
            interfaceC1108l0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1104k c1104k;
        super.onDetachedFromWindow();
        InterfaceC1108l0 interfaceC1108l0 = this.f2154h;
        if (interfaceC1108l0 != null) {
            LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = ((C0880m) interfaceC1108l0).f3625b;
            InterfaceC1111m0 interfaceC1111m0 = layoutInflaterFactory2C0888u.f3698r;
            if (interfaceC1111m0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1111m0;
                actionBarOverlayLayout.m1490k();
                ActionMenuView actionMenuView = ((C1112m1) actionBarOverlayLayout.f2110e).f4568a.f2217a;
                if (actionMenuView != null && (c1104k = actionMenuView.f2136t) != null) {
                    c1104k.m2725f();
                    C1089f c1089f = c1104k.f4550u;
                    if (c1089f != null && c1089f.m2594b()) {
                        c1089f.f4327i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0888u.f3703w != null) {
                layoutInflaterFactory2C0888u.f3692l.getDecorView().removeCallbacks(layoutInflaterFactory2C0888u.f3704x);
                if (layoutInflaterFactory2C0888u.f3703w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0888u.f3703w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0888u.f3703w = null;
            }
            C0248X c0248x = layoutInflaterFactory2C0888u.f3705y;
            if (c0248x != null) {
                c0248x.m718b();
            }
            MenuC1006l menuC1006l = layoutInflaterFactory2C0888u.m2270z(0).f3644h;
            if (menuC1006l != null) {
                menuC1006l.m2572c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1108l0 interfaceC1108l0) {
        this.f2154h = interfaceC1108l0;
    }
}
