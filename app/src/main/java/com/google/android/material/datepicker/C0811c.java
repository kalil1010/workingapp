package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p033L1.AbstractC0364l;
import p080b1.C0767e;
import p093e2.AbstractC0901d;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0811c {

    /* renamed from: a */
    public final C0767e f3169a;

    /* renamed from: b */
    public final C0767e f3170b;

    public C0811c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0364l.m997d0(context, R.attr.materialCalendarStyle, C0818j.class.getCanonicalName()).data, AbstractC1395a.f6043l);
        C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM2318t = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 7);
        this.f3169a = C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f3170b = C0767e.m1974d(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM2318t.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
