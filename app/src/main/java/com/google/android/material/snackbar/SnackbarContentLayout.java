package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f3325a;

    /* renamed from: b */
    public Button f3326b;

    /* renamed from: c */
    public int f3327c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0901d.m2306l0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6067b);
    }

    /* renamed from: a */
    public final boolean m2112a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3325a.getPaddingTop() == i3 && this.f3325a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f3325a;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f3326b;
    }

    public TextView getMessageView() {
        return this.f3325a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3325a = (TextView) findViewById(R.id.snackbar_text);
        this.f3326b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f3325a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f3327c <= 0 || this.f3326b.getMeasuredWidth() <= this.f3327c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m2112a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m2112a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f3327c = i2;
    }
}
