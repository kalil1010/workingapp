package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p011D1.C0118h;

/* renamed from: j.t */
/* loaded from: classes.dex */
public final class C1131t {

    /* renamed from: b */
    public static final PorterDuff.Mode f4634b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1131t f4635c;

    /* renamed from: a */
    public C1050N0 f4636a;

    /* renamed from: a */
    public static synchronized C1131t m2749a() {
        try {
            if (f4635c == null) {
                m2751d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4635c;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m2750c(int i2, PorterDuff.Mode mode) {
        return C1050N0.m2657e(i2, mode);
    }

    /* renamed from: d */
    public static synchronized void m2751d() {
        if (f4635c == null) {
            C1131t c1131t = new C1131t();
            f4635c = c1131t;
            c1131t.f4636a = C1050N0.m2656b();
            C1050N0 c1050n0 = f4635c.f4636a;
            C1128s c1128s = new C1128s();
            synchronized (c1050n0) {
                c1050n0.f4406e = c1128s;
            }
        }
    }

    /* renamed from: e */
    public static void m2752e(Drawable drawable, C0118h c0118h, int[] iArr) {
        PorterDuff.Mode mode = C1050N0.f4399f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC1117o0.f4587a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = c0118h.f330b;
            if (!z2 && !c0118h.f329a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterM2657e = null;
            ColorStateList colorStateList = z2 ? (ColorStateList) c0118h.f331c : null;
            PorterDuff.Mode mode2 = c0118h.f329a ? (PorterDuff.Mode) c0118h.f332d : C1050N0.f4399f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM2657e = C1050N0.m2657e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM2657e);
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m2753b(Context context, int i2) {
        return this.f4636a.m2659c(context, i2);
    }
}
