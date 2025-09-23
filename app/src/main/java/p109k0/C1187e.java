package p109k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C1187e extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4818a;

    public C1187e(Drawable.ConstantState constantState) {
        this.f4818a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4818a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4818a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1188f c1188f = new C1188f(null);
        Drawable drawableNewDrawable = this.f4818a.newDrawable();
        c1188f.f4824a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1188f.f4823f);
        return c1188f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1188f c1188f = new C1188f(null);
        Drawable drawableNewDrawable = this.f4818a.newDrawable(resources);
        c1188f.f4824a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1188f.f4823f);
        return c1188f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1188f c1188f = new C1188f(null);
        Drawable drawableNewDrawable = this.f4818a.newDrawable(resources, theme);
        c1188f.f4824a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1188f.f4823f);
        return c1188f;
    }
}
