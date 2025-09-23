package p006C;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* renamed from: C.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0070b {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m203d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m205f() {
        return new WindowInsets.Builder();
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m206g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m216q(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
