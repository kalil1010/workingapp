package p090e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p002A1.C0019a;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;

/* renamed from: e.F */
/* loaded from: classes.dex */
public final class C0865F extends AbstractC0364l {

    /* renamed from: f */
    public final /* synthetic */ int f3533f;

    /* renamed from: g */
    public final /* synthetic */ C0867H f3534g;

    public /* synthetic */ C0865F(C0867H c0867h, int i2) {
        this.f3533f = i2;
        this.f3534g = c0867h;
    }

    @Override // p028K.InterfaceC0249Y
    /* renamed from: a */
    public final void mo722a() {
        View view;
        C0867H c0867h = this.f3534g;
        switch (this.f3533f) {
            case 0:
                if (c0867h.f3543B && (view = c0867h.f3559t) != null) {
                    view.setTranslationY(0.0f);
                    c0867h.f3556q.setTranslationY(0.0f);
                }
                c0867h.f3556q.setVisibility(8);
                c0867h.f3556q.setTransitioning(false);
                c0867h.f3547F = null;
                C0019a c0019a = c0867h.f3563x;
                if (c0019a != null) {
                    c0019a.m58D(c0867h.f3562w);
                    c0867h.f3562w = null;
                    c0867h.f3563x = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0867h.f3555p;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    AbstractC0228C.m617c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0867h.f3547F = null;
                c0867h.f3556q.requestLayout();
                break;
        }
    }
}
