package p016F1;

import p011D1.C0133w;
import p011D1.C0134x;

/* renamed from: F1.a */
/* loaded from: classes.dex */
public final class C0150a {
    /* renamed from: a */
    public static final C0134x m415a(C0134x c0134x) {
        if ((c0134x != null ? c0134x.f474g : null) == null) {
            return c0134x;
        }
        C0133w c0133wM371h = c0134x.m371h();
        c0133wM371h.f461g = null;
        return c0133wM371h.m369a();
    }

    /* renamed from: b */
    public static boolean m416b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
