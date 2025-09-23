package p109k0;

import android.graphics.drawable.Drawable;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C1185c implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ C1188f f4813a;

    public C1185c(C1188f c1188f) {
        this.f4813a = c1188f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f4813a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f4813a.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4813a.unscheduleSelf(runnable);
    }
}
