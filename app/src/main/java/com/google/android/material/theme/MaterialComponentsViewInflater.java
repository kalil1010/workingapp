package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import p015F0.C0149d;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p043P0.C0432a;
import p045Q.AbstractC0438b;
import p064W0.C0576v;
import p067X0.C0598a;
import p070Y0.AbstractC0601a;
import p090e.C0891x;
import p093e2.AbstractC0901d;
import p105j.C1027C;
import p105j.C1081c0;
import p105j.C1116o;
import p105j.C1119p;
import p105j.C1122q;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0891x {
    @Override // p090e.C0891x
    /* renamed from: a */
    public final C1116o mo2137a(Context context, AttributeSet attributeSet) {
        return new C0576v(context, attributeSet);
    }

    @Override // p090e.C0891x
    /* renamed from: b */
    public final C1119p mo2138b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p090e.C0891x
    /* renamed from: c */
    public final C1122q mo2139c(Context context, AttributeSet attributeSet) {
        return new C0149d(context, attributeSet);
    }

    @Override // p090e.C0891x
    /* renamed from: d */
    public final C1027C mo2140d(Context context, AttributeSet attributeSet) {
        C0432a c0432a = new C0432a(AbstractC0601a.m1405a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0432a.getContext();
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(context2, attributeSet, AbstractC1395a.f6046o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM1041f.hasValue(0)) {
            AbstractC0438b.m1104c(c0432a, AbstractC0901d.m2318t(context2, typedArrayM1041f, 0));
        }
        c0432a.f1320f = typedArrayM1041f.getBoolean(1, false);
        typedArrayM1041f.recycle();
        return c0432a;
    }

    @Override // p090e.C0891x
    /* renamed from: e */
    public final C1081c0 mo2141e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C0598a c0598a = new C0598a(AbstractC0601a.m1405a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0598a.getContext();
        if (AbstractC0364l.m996c0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1395a.f6049r;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM1403g = C0598a.m1403g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1403g == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1395a.f6048q);
                    int iM1403g2 = C0598a.m1403g(c0598a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM1403g2 >= 0) {
                        c0598a.setLineHeight(iM1403g2);
                    }
                }
            }
        }
        return c0598a;
    }
}
