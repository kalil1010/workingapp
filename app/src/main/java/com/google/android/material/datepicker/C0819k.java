package com.google.android.material.datepicker;

import android.view.View;
import p028K.C0292u0;
import p028K.InterfaceC0283q;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0819k implements InterfaceC0283q {

    /* renamed from: a */
    public final View f3196a;

    /* renamed from: b */
    public int f3197b;

    /* renamed from: c */
    public int f3198c;

    public C0819k(View view) {
        this.f3196a = view;
    }

    @Override // p028K.InterfaceC0283q
    /* renamed from: d */
    public C0292u0 mo67d(View view, C0292u0 c0292u0) {
        int i2 = c0292u0.f910a.mo793f(7).f173b;
        View view2 = this.f3196a;
        int i3 = this.f3197b;
        if (i3 >= 0) {
            view2.getLayoutParams().height = i3 + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f3198c + i2, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0292u0;
    }

    public C0819k(View view, int i2, int i3) {
        this.f3197b = i2;
        this.f3196a = view;
        this.f3198c = i3;
    }
}
