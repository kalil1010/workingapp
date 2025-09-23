package p028K;

import android.view.View;
import java.util.Objects;
import p037N.AbstractC0413a;
import p119o.C1249k;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.I */
/* loaded from: classes.dex */
public abstract class AbstractC0234I {
    /* renamed from: a */
    public static void m664a(View view, InterfaceC0239N interfaceC0239N) {
        C1249k c1249k = (C1249k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1249k == null) {
            c1249k = new C1249k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1249k);
        }
        Objects.requireNonNull(interfaceC0239N);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0233H = new ViewOnUnhandledKeyEventListenerC0233H();
        c1249k.put(interfaceC0239N, viewOnUnhandledKeyEventListenerC0233H);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0233H);
    }

    /* renamed from: b */
    public static CharSequence m665b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m666c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m667d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m668e(View view, InterfaceC0239N interfaceC0239N) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1249k c1249k = (C1249k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1249k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1249k.getOrDefault(interfaceC0239N, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m669f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    /* renamed from: g */
    public static void m670g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* renamed from: h */
    public static void m671h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m672i(View view, AbstractC0413a abstractC0413a) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m673j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
