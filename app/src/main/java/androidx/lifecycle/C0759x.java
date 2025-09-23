package androidx.lifecycle;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.C0686D;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0709l;
import java.util.Map;
import java.util.Objects;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p108k.C1181a;
import p111l.C1221c;
import p111l.C1222d;
import p111l.C1224f;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C0759x {

    /* renamed from: j */
    public static final Object f2744j = new Object();

    /* renamed from: a */
    public final Object f2745a = new Object();

    /* renamed from: b */
    public final C1224f f2746b = new C1224f();

    /* renamed from: c */
    public int f2747c = 0;

    /* renamed from: d */
    public boolean f2748d;

    /* renamed from: e */
    public volatile Object f2749e;

    /* renamed from: f */
    public volatile Object f2750f;

    /* renamed from: g */
    public int f2751g;

    /* renamed from: h */
    public boolean f2752h;

    /* renamed from: i */
    public boolean f2753i;

    public C0759x() {
        Object obj = f2744j;
        this.f2750f = obj;
        this.f2749e = obj;
        this.f2751g = -1;
    }

    /* renamed from: a */
    public static void m1790a(String str) {
        ((C1181a) C1181a.m2831L().f4804n).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0075g.m238g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1791b(AbstractC0758w abstractC0758w) {
        if (abstractC0758w.f2741b) {
            if (!abstractC0758w.mo1773e()) {
                abstractC0758w.m1789c(false);
                return;
            }
            int i2 = abstractC0758w.f2742c;
            int i3 = this.f2751g;
            if (i2 >= i3) {
                return;
            }
            abstractC0758w.f2742c = i3;
            C0004c c0004c = abstractC0758w.f2740a;
            Object obj = this.f2749e;
            c0004c.getClass();
            if (((InterfaceC0753r) obj) != null) {
                DialogInterfaceOnCancelListenerC0709l dialogInterfaceOnCancelListenerC0709l = (DialogInterfaceOnCancelListenerC0709l) c0004c.f7b;
                if (dialogInterfaceOnCancelListenerC0709l.f2591W) {
                    View viewM1759w = dialogInterfaceOnCancelListenerC0709l.m1759w();
                    if (viewM1759w.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0709l.f2595a0 != null) {
                        if (C0686D.m1646D(3)) {
                            Objects.toString(dialogInterfaceOnCancelListenerC0709l.f2595a0);
                        }
                        dialogInterfaceOnCancelListenerC0709l.f2595a0.setContentView(viewM1759w);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1792c(AbstractC0758w abstractC0758w) {
        if (this.f2752h) {
            this.f2753i = true;
            return;
        }
        this.f2752h = true;
        do {
            this.f2753i = false;
            if (abstractC0758w != null) {
                m1791b(abstractC0758w);
                abstractC0758w = null;
            } else {
                C1224f c1224f = this.f2746b;
                c1224f.getClass();
                C1222d c1222d = new C1222d(c1224f);
                c1224f.f4920c.put(c1222d, Boolean.FALSE);
                while (c1222d.hasNext()) {
                    m1791b((AbstractC0758w) ((Map.Entry) c1222d.next()).getValue());
                    if (this.f2753i) {
                        break;
                    }
                }
            }
        } while (this.f2753i);
        this.f2752h = false;
    }

    /* renamed from: d */
    public final void m1793d(C0004c c0004c) {
        Object obj;
        m1790a("observeForever");
        C0757v c0757v = new C0757v(this, c0004c);
        C1224f c1224f = this.f2746b;
        C1221c c1221cMo2854a = c1224f.mo2854a(c0004c);
        if (c1221cMo2854a != null) {
            obj = c1221cMo2854a.f4912b;
        } else {
            C1221c c1221c = new C1221c(c0004c, c0757v);
            c1224f.f4921d++;
            C1221c c1221c2 = c1224f.f4919b;
            if (c1221c2 == null) {
                c1224f.f4918a = c1221c;
                c1224f.f4919b = c1221c;
            } else {
                c1221c2.f4913c = c1221c;
                c1221c.f4914d = c1221c2;
                c1224f.f4919b = c1221c;
            }
            obj = null;
        }
        AbstractC0758w abstractC0758w = (AbstractC0758w) obj;
        if (abstractC0758w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0758w != null) {
            return;
        }
        c0757v.m1789c(true);
    }

    /* renamed from: e */
    public final void m1794e(Object obj) {
        m1790a("setValue");
        this.f2751g++;
        this.f2749e = obj;
        m1792c(null);
    }
}
