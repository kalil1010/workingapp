package p070Y0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p099h.C0974d;

/* renamed from: Y0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0601a {

    /* renamed from: a */
    public static final int[] f1909a = {R.attr.theme, tkbmmn.ghwbbf.irvjzy.R.attr.theme};

    /* renamed from: b */
    public static final int[] f1910b = {tkbmmn.ghwbbf.irvjzy.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m1405a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1910b, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0974d) && ((C0974d) context).f4070a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0974d c0974d = new C0974d(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1909a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0974d.getTheme().applyStyle(resourceId2, true);
        }
        return c0974d;
    }
}
