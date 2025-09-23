package p105j;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;
import p064W0.C0574t;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.O */
/* loaded from: classes.dex */
public final class C1051O extends C1034F0 implements InterfaceC1055Q {

    /* renamed from: C */
    public CharSequence f4407C;

    /* renamed from: D */
    public C1047M f4408D;

    /* renamed from: E */
    public final Rect f4409E;

    /* renamed from: F */
    public int f4410F;

    /* renamed from: G */
    public final /* synthetic */ C1058S f4411G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051O(C1058S c1058s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f4411G = c1058s;
        this.f4409E = new Rect();
        this.f4365o = c1058s;
        this.f4375y = true;
        this.f4376z.setFocusable(true);
        this.f4366p = new C0574t(1, this);
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: a */
    public final CharSequence mo2645a() {
        return this.f4407C;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: e */
    public final void mo2649e(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C1023A c1023a = this.f4376z;
        boolean zIsShowing = c1023a.isShowing();
        m2663s();
        this.f4376z.setInputMethodMode(2);
        mo2543i();
        C1135u0 c1135u0 = this.f4353c;
        c1135u0.setChoiceMode(1);
        AbstractC1041J.m2642d(c1135u0, i2);
        AbstractC1041J.m2641c(c1135u0, i3);
        C1058S c1058s = this.f4411G;
        int selectedItemPosition = c1058s.getSelectedItemPosition();
        C1135u0 c1135u02 = this.f4353c;
        if (c1023a.isShowing() && c1135u02 != null) {
            c1135u02.setListSelectionHidden(false);
            c1135u02.setSelection(selectedItemPosition);
            if (c1135u02.getChoiceMode() != 0) {
                c1135u02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c1058s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0427c viewTreeObserverOnGlobalLayoutListenerC0427c = new ViewTreeObserverOnGlobalLayoutListenerC0427c(4, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0427c);
        this.f4376z.setOnDismissListener(new C1049N(this, viewTreeObserverOnGlobalLayoutListenerC0427c));
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: h */
    public final void mo2650h(CharSequence charSequence) {
        this.f4407C = charSequence;
    }

    @Override // p105j.C1034F0, p105j.InterfaceC1055Q
    /* renamed from: o */
    public final void mo2630o(ListAdapter listAdapter) {
        super.mo2630o(listAdapter);
        this.f4408D = (C1047M) listAdapter;
    }

    @Override // p105j.InterfaceC1055Q
    /* renamed from: p */
    public final void mo2655p(int i2) {
        this.f4410F = i2;
    }

    /* renamed from: s */
    public final void m2663s() {
        int i2;
        C1023A c1023a = this.f4376z;
        Drawable background = c1023a.getBackground();
        C1058S c1058s = this.f4411G;
        if (background != null) {
            background.getPadding(c1058s.f4430h);
            boolean zM2754a = AbstractC1133t1.m2754a(c1058s);
            Rect rect = c1058s.f4430h;
            i2 = zM2754a ? rect.right : -rect.left;
        } else {
            Rect rect2 = c1058s.f4430h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = c1058s.getPaddingLeft();
        int paddingRight = c1058s.getPaddingRight();
        int width = c1058s.getWidth();
        int i3 = c1058s.f4429g;
        if (i3 == -2) {
            int iM2665a = c1058s.m2665a(this.f4408D, c1023a.getBackground());
            int i4 = c1058s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1058s.f4430h;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iM2665a > i5) {
                iM2665a = i5;
            }
            m2632r(Math.max(iM2665a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m2632r((width - paddingLeft) - paddingRight);
        } else {
            m2632r(i3);
        }
        this.f4356f = AbstractC1133t1.m2754a(c1058s) ? (((width - paddingRight) - this.f4355e) - this.f4410F) + i2 : paddingLeft + this.f4410F + i2;
    }
}
