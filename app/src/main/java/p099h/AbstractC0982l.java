package p099h;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: h.l */
/* loaded from: classes.dex */
public abstract class AbstractC0982l {
    /* renamed from: a */
    public static boolean m2488a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m2489b(Window.Callback callback, ActionMode.Callback callback2, int i2) {
        return callback.onWindowStartingActionMode(callback2, i2);
    }
}
