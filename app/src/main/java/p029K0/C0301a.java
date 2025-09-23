package p029K0;

import android.content.Context;
import p033L1.AbstractC0364l;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K0.a */
/* loaded from: classes.dex */
public final class C0301a {

    /* renamed from: f */
    public static final int f921f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f922a;

    /* renamed from: b */
    public final int f923b;

    /* renamed from: c */
    public final int f924c;

    /* renamed from: d */
    public final int f925d;

    /* renamed from: e */
    public final float f926e;

    public C0301a(Context context) {
        boolean zM996c0 = AbstractC0364l.m996c0(context, R.attr.elevationOverlayEnabled, false);
        int iM982F = AbstractC0364l.m982F(context, R.attr.elevationOverlayColor, 0);
        int iM982F2 = AbstractC0364l.m982F(context, R.attr.elevationOverlayAccentColor, 0);
        int iM982F3 = AbstractC0364l.m982F(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f922a = zM996c0;
        this.f923b = iM982F;
        this.f924c = iM982F2;
        this.f925d = iM982F3;
        this.f926e = f;
    }
}
