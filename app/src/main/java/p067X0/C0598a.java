package p067X0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import p033L1.AbstractC0364l;
import p105j.C1081c0;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: X0.a */
/* loaded from: classes.dex */
public final class C0598a extends C1081c0 {
    /* renamed from: g */
    public static int m1403g(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i2 = 0; i2 < iArr.length && dimensionPixelSize < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p105j.C1081c0, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) throws Resources.NotFoundException {
        super.setTextAppearance(context, i2);
        if (AbstractC0364l.m996c0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, AbstractC1395a.f6048q);
            int iM1403g = m1403g(getContext(), typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1403g >= 0) {
                setLineHeight(iM1403g);
            }
        }
    }
}
