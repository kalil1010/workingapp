package p028K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p001A0.C0004c;
import p007C0.AbstractC0083a;

/* renamed from: K.L */
/* loaded from: classes.dex */
public abstract class AbstractC0237L {
    /* renamed from: a */
    public static String[] m685a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0261f m686b(View view, C0261f c0261f) {
        ContentInfo contentInfoMo24k = c0261f.f852a.mo24k();
        Objects.requireNonNull(contentInfoMo24k);
        ContentInfo contentInfoM271g = AbstractC0083a.m271g(contentInfoMo24k);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM271g);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM271g ? c0261f : new C0261f(new C0004c(contentInfoPerformReceiveContent));
    }

    /* renamed from: c */
    public static void m687c(View view, String[] strArr, InterfaceC0285r interfaceC0285r) {
        if (interfaceC0285r == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0238M(interfaceC0285r));
        }
    }
}
