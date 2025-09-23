package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0751p {

    /* renamed from: a */
    public static int f1973a;

    @Override // androidx.lifecycle.InterfaceC0751p
    /* renamed from: b */
    public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) throws SecurityException {
        if (enumC0747l != EnumC0747l.ON_DESTROY) {
            return;
        }
        if (f1973a == 0) {
            try {
                f1973a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f1973a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1973a == 1) {
            throw null;
        }
    }
}
