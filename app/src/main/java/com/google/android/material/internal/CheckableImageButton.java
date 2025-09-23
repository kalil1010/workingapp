package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p010D0.C0107e;
import p028K.AbstractC0241P;
import p035M0.C0372a;
import p105j.C1140x;

/* loaded from: classes.dex */
public class CheckableImageButton extends C1140x implements Checkable {

    /* renamed from: g */
    public static final int[] f3267g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f3268d;

    /* renamed from: e */
    public boolean f3269e;

    /* renamed from: f */
    public boolean f3270f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.imageButtonStyle);
        this.f3269e = true;
        this.f3270f = true;
        AbstractC0241P.m701m(this, new C0107e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3268d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f3268d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f3267g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0372a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0372a c0372a = (C0372a) parcelable;
        super.onRestoreInstanceState(c0372a.f1521a);
        setChecked(c0372a.f1141c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0372a c0372a = new C0372a(super.onSaveInstanceState());
        c0372a.f1141c = this.f3268d;
        return c0372a;
    }

    public void setCheckable(boolean z2) {
        if (this.f3269e != z2) {
            this.f3269e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f3269e || this.f3268d == z2) {
            return;
        }
        this.f3268d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f3270f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f3270f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3268d);
    }
}
