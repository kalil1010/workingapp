package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import p002A1.RunnableC0030l;
import p028K.AbstractC0241P;
import p055T0.C0513g;
import p055T0.C0514h;
import p055T0.C0516j;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public abstract class AbstractC0838e extends ConstraintLayout {

    /* renamed from: s */
    public final RunnableC0030l f3443s;

    /* renamed from: t */
    public int f3444t;

    /* renamed from: u */
    public final C0513g f3445u;

    public AbstractC0838e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0513g c0513g = new C0513g();
        this.f3445u = c0513g;
        C0514h c0514h = new C0514h(0.5f);
        C0516j c0516jM1300e = c0513g.f1601a.f1584a.m1300e();
        c0516jM1300e.f1628e = c0514h;
        c0516jM1300e.f1629f = c0514h;
        c0516jM1300e.f1630g = c0514h;
        c0516jM1300e.f1631h = c0514h;
        c0513g.setShapeAppearanceModel(c0516jM1300e.m1295a());
        this.f3445u.m1290j(ColorStateList.valueOf(-1));
        C0513g c0513g2 = this.f3445u;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setBackground(c0513g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6052u, R.attr.materialClockStyle, 0);
        this.f3444t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3443s = new RunnableC0030l(13, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0030l runnableC0030l = this.f3443s;
            handler.removeCallbacks(runnableC0030l);
            handler.post(runnableC0030l);
        }
    }

    /* renamed from: m */
    public abstract void mo2143m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2143m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0030l runnableC0030l = this.f3443s;
            handler.removeCallbacks(runnableC0030l);
            handler.post(runnableC0030l);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f3445u.m1290j(ColorStateList.valueOf(i2));
    }
}
