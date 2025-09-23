package p028K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: K.D */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0229D implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0292u0 f807a = null;

    /* renamed from: b */
    public final /* synthetic */ View f808b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0283q f809c;

    public ViewOnApplyWindowInsetsListenerC0229D(View view, InterfaceC0283q interfaceC0283q) {
        this.f808b = view;
        this.f809c = interfaceC0283q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0292u0 c0292u0M817g = C0292u0.m817g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0283q interfaceC0283q = this.f809c;
        if (i2 < 30) {
            AbstractC0230E.m618a(windowInsets, this.f808b);
            if (c0292u0M817g.equals(this.f807a)) {
                return interfaceC0283q.mo67d(view, c0292u0M817g).m822f();
            }
        }
        this.f807a = c0292u0M817g;
        C0292u0 c0292u0Mo67d = interfaceC0283q.mo67d(view, c0292u0M817g);
        if (i2 >= 30) {
            return c0292u0Mo67d.m822f();
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0228C.m617c(view);
        return c0292u0Mo67d.m822f();
    }
}
