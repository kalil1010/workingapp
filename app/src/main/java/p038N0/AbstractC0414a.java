package p038N0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.activity.C0636b;
import p034M.AbstractC0367a;
import p093e2.AbstractC0901d;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0414a {

    /* renamed from: a */
    public final TimeInterpolator f1292a;

    /* renamed from: b */
    public final View f1293b;

    /* renamed from: c */
    public final int f1294c;

    /* renamed from: d */
    public final int f1295d;

    /* renamed from: e */
    public final int f1296e;

    /* renamed from: f */
    public C0636b f1297f;

    public AbstractC0414a(View view) {
        this.f1293b = view;
        Context context = view.getContext();
        this.f1292a = AbstractC0901d.m2306l0(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0367a.m1034b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f1294c = AbstractC0901d.m2304k0(context, R.attr.motionDurationMedium2, 300);
        this.f1295d = AbstractC0901d.m2304k0(context, R.attr.motionDurationShort3, 150);
        this.f1296e = AbstractC0901d.m2304k0(context, R.attr.motionDurationShort2, 100);
    }
}
