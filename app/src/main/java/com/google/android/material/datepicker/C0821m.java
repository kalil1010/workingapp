package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0821m<S> extends AbstractC0827s {

    /* renamed from: S */
    public int f3223S;

    /* renamed from: T */
    public C0810b f3224T;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: l */
    public final void mo1742l(Bundle bundle) {
        super.mo1742l(bundle);
        if (bundle == null) {
            bundle = this.f2633f;
        }
        this.f3223S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3224T = (C0810b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: m */
    public final View mo1757m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1754h(), this.f3223S));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0712o
    /* renamed from: q */
    public final void mo1746q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3223S);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3224T);
    }
}
