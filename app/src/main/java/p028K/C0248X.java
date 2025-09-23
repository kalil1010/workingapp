package p028K;

import android.view.View;
import java.lang.ref.WeakReference;
import p001A0.C0002a;

/* renamed from: K.X */
/* loaded from: classes.dex */
public final class C0248X {

    /* renamed from: a */
    public final WeakReference f824a;

    public C0248X(View view) {
        this.f824a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m717a(float f) {
        View view = (View) this.f824a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void m718b() {
        View view = (View) this.f824a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m719c(long j2) {
        View view = (View) this.f824a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* renamed from: d */
    public final void m720d(InterfaceC0249Y interfaceC0249Y) {
        View view = (View) this.f824a.get();
        if (view != null) {
            if (interfaceC0249Y != null) {
                view.animate().setListener(new C0002a(interfaceC0249Y, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m721e(float f) {
        View view = (View) this.f824a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
