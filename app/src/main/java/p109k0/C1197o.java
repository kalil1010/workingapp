package p109k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: k0.o */
/* loaded from: classes.dex */
public final class C1197o extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4878a;

    public C1197o(Drawable.ConstantState constantState) {
        this.f4878a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4878a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4878a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1198p c1198p = new C1198p();
        c1198p.f4824a = (VectorDrawable) this.f4878a.newDrawable();
        return c1198p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1198p c1198p = new C1198p();
        c1198p.f4824a = (VectorDrawable) this.f4878a.newDrawable(resources);
        return c1198p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1198p c1198p = new C1198p();
        c1198p.f4824a = (VectorDrawable) this.f4878a.newDrawable(resources, theme);
        return c1198p;
    }
}
