package p105j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;
import p093e2.AbstractC0901d;
import p094f0.C0929b;

/* renamed from: j.S */
/* loaded from: classes.dex */
public final class C1058S extends Spinner {

    /* renamed from: i */
    public static final int[] f4422i = {R.attr.spinnerMode};

    /* renamed from: a */
    public final C0929b f4423a;

    /* renamed from: b */
    public final Context f4424b;

    /* renamed from: c */
    public final C1037H f4425c;

    /* renamed from: d */
    public SpinnerAdapter f4426d;

    /* renamed from: e */
    public final boolean f4427e;

    /* renamed from: f */
    public final InterfaceC1055Q f4428f;

    /* renamed from: g */
    public int f4429g;

    /* renamed from: h */
    public final Rect f4430h;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1058S(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130904025(0x7f0303d9, float:1.7414885E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f4430h = r1
            android.content.Context r1 = r12.getContext()
            p105j.AbstractC1079b1.m2695a(r12, r1)
            int[] r1 = p086d.AbstractC0843a.f3473w
            A1.i r2 = p002A1.C0027i.m98N(r13, r14, r1, r0)
            f0.b r3 = new f0.b
            r3.<init>(r12)
            r12.f4423a = r3
            java.lang.Object r3 = r2.f66c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            h.d r6 = new h.d
            r6.<init>(r13, r4)
            r12.f4424b = r6
            goto L37
        L35:
            r12.f4424b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = p105j.C1058S.f4422i     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            if (r8 == 0) goto L4d
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            goto L4d
        L4a:
            r13 = move-exception
            r6 = r7
            goto L55
        L4d:
            r7.recycle()
            goto L5e
        L51:
            r13 = move-exception
            goto L55
        L53:
            r7 = r6
            goto L5b
        L55:
            if (r6 == 0) goto L5a
            r6.recycle()
        L5a:
            throw r13
        L5b:
            if (r7 == 0) goto L5e
            goto L4d
        L5e:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L98
            if (r4 == r8) goto L65
            goto La5
        L65:
            j.O r4 = new j.O
            android.content.Context r9 = r12.f4424b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f4424b
            A1.i r1 = p002A1.C0027i.m98N(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f66c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f4429g = r9
            android.graphics.drawable.Drawable r9 = r1.m100B(r8)
            r4.m2627l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f4407C = r7
            r1.m114R()
            r12.f4428f = r4
            j.H r1 = new j.H
            r1.<init>(r12, r12, r4)
            r12.f4425c = r1
            goto La5
        L98:
            j.L r1 = new j.L
            r1.<init>(r12)
            r12.f4428f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f4391c = r4
        La5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427439(0x7f0b006f, float:1.8476494E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lbc:
            r2.m114R()
            r12.f4427e = r8
            android.widget.SpinnerAdapter r13 = r12.f4426d
            if (r13 == 0) goto Lca
            r12.setAdapter(r13)
            r12.f4426d = r6
        Lca:
            f0.b r13 = r12.f4423a
            r13.m2420k(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.C1058S.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final int m2665a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f4430h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            c0929b.m2410a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        return interfaceC1055Q != null ? interfaceC1055Q.mo2648d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        return interfaceC1055Q != null ? interfaceC1055Q.mo2651j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4428f != null ? this.f4429g : super.getDropDownWidth();
    }

    public final InterfaceC1055Q getInternalPopup() {
        return this.f4428f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        return interfaceC1055Q != null ? interfaceC1055Q.mo2654n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4424b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        return interfaceC1055Q != null ? interfaceC1055Q.mo2645a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            return c0929b.m2417h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            return c0929b.m2418i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q == null || !interfaceC1055Q.mo2646b()) {
            return;
        }
        interfaceC1055Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f4428f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2665a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1053P c1053p = (C1053P) parcelable;
        super.onRestoreInstanceState(c1053p.getSuperState());
        if (!c1053p.f4412a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0427c(3, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1053P c1053p = new C1053P(super.onSaveInstanceState());
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        c1053p.f4412a = interfaceC1055Q != null && interfaceC1055Q.mo2646b();
        return c1053p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1037H c1037h = this.f4425c;
        if (c1037h == null || !c1037h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q == null) {
            return super.performClick();
        }
        if (interfaceC1055Q.mo2646b()) {
            return true;
        }
        this.f4428f.mo2649e(AbstractC1041J.m2640b(this), AbstractC1041J.m2639a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            c0929b.m2422m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            c0929b.m2423n(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC1055Q.mo2655p(i2);
            interfaceC1055Q.mo2647c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q != null) {
            interfaceC1055Q.mo2653m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f4428f != null) {
            this.f4429g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q != null) {
            interfaceC1055Q.mo2652l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0901d.m2321x(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q != null) {
            interfaceC1055Q.mo2650h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            c0929b.m2428s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0929b c0929b = this.f4423a;
        if (c0929b != null) {
            c0929b.m2429t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4427e) {
            this.f4426d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1055Q interfaceC1055Q = this.f4428f;
        if (interfaceC1055Q != null) {
            Context context = this.f4424b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1047M c1047m = new C1047M();
            c1047m.f4395a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1047m.f4396b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1043K.m2644a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1055Q.mo2630o(c1047m);
        }
    }
}
