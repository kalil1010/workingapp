package p028K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.C */
/* loaded from: classes.dex */
public abstract class AbstractC0228C {
    /* renamed from: a */
    public static WindowInsets m615a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m616b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m617c(View view) {
        view.requestApplyInsets();
    }
}
