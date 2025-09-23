package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p109k0.C1198p;
import p119o.AbstractC1242d;
import p119o.C1243e;
import p119o.C1250l;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.N0 */
/* loaded from: classes.dex */
public final class C1050N0 {

    /* renamed from: g */
    public static C1050N0 f4400g;

    /* renamed from: a */
    public WeakHashMap f4402a;

    /* renamed from: b */
    public final WeakHashMap f4403b = new WeakHashMap(0);

    /* renamed from: c */
    public TypedValue f4404c;

    /* renamed from: d */
    public boolean f4405d;

    /* renamed from: e */
    public C1128s f4406e;

    /* renamed from: f */
    public static final PorterDuff.Mode f4399f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final C1048M0 f4401h = new C1048M0(6);

    /* renamed from: b */
    public static synchronized C1050N0 m2656b() {
        try {
            if (f4400g == null) {
                f4400g = new C1050N0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4400g;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m2657e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1048M0 c1048m0 = f4401h;
        c1048m0.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1048m0.m2903a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final Drawable m2658a(Context context, int i2) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f4404c == null) {
            this.f4404c = new TypedValue();
        }
        TypedValue typedValue = this.f4404c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1243e c1243e = (C1243e) this.f4403b.get(context);
            drawableNewDrawable = null;
            if (c1243e != null && (weakReference = (WeakReference) c1243e.m2899c(j2, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM2896b = AbstractC1242d.m2896b(c1243e.f5032b, c1243e.f5034d, j2);
                    if (iM2896b >= 0) {
                        Object[] objArr = c1243e.f5033c;
                        Object obj = objArr[iM2896b];
                        Object obj2 = C1243e.f5030e;
                        if (obj != obj2) {
                            objArr[iM2896b] = obj2;
                            c1243e.f5031a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM2742c = null;
        if (this.f4406e != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM2742c = new LayerDrawable(new Drawable[]{m2659c(context, R.drawable.abc_cab_background_internal_bg), m2659c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableM2742c = C1128s.m2742c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM2742c = C1128s.m2742c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM2742c = C1128s.m2742c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM2742c == null) {
            return layerDrawableM2742c;
        }
        layerDrawableM2742c.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM2742c.getConstantState();
                if (constantState2 != null) {
                    C1243e c1243e2 = (C1243e) this.f4403b.get(context);
                    if (c1243e2 == null) {
                        c1243e2 = new C1243e();
                        this.f4403b.put(context, c1243e2);
                    }
                    c1243e2.m2900d(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM2742c;
    }

    /* renamed from: c */
    public final synchronized Drawable m2659c(Context context, int i2) {
        return m2660d(context, i2, false);
    }

    /* renamed from: d */
    public final synchronized Drawable m2660d(Context context, int i2, boolean z2) {
        Drawable drawableM2658a;
        try {
            if (!this.f4405d) {
                this.f4405d = true;
                Drawable drawableM2659c = m2659c(context, R.drawable.abc_vector_test);
                if (drawableM2659c == null || (!(drawableM2659c instanceof C1198p) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2659c.getClass().getName()))) {
                    this.f4405d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM2658a = m2658a(context, i2);
            if (drawableM2658a == null) {
                drawableM2658a = AbstractC0000a.m1b(context, i2);
            }
            if (drawableM2658a != null) {
                drawableM2658a = m2662g(context, i2, z2, drawableM2658a);
            }
            if (drawableM2658a != null) {
                AbstractC1117o0.m2732a(drawableM2658a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM2658a;
    }

    /* renamed from: f */
    public final synchronized ColorStateList m2661f(Context context, int i2) {
        ColorStateList colorStateList;
        C1250l c1250l;
        WeakHashMap weakHashMap = this.f4402a;
        ColorStateList colorStateListM2744d = null;
        colorStateList = (weakHashMap == null || (c1250l = (C1250l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1250l.m2916b(i2, null);
        if (colorStateList == null) {
            C1128s c1128s = this.f4406e;
            if (c1128s != null) {
                colorStateListM2744d = c1128s.m2744d(context, i2);
            }
            if (colorStateListM2744d != null) {
                if (this.f4402a == null) {
                    this.f4402a = new WeakHashMap();
                }
                C1250l c1250l2 = (C1250l) this.f4402a.get(context);
                if (c1250l2 == null) {
                    c1250l2 = new C1250l();
                    this.f4402a.put(context, c1250l2);
                }
                c1250l2.m2915a(i2, colorStateListM2744d);
            }
            colorStateList = colorStateListM2744d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m2662g(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.C1050N0.m2662g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
