package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.InterfaceC0739d;
import androidx.lifecycle.InterfaceC0753r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p001A0.C0004c;
import p002A1.RunnableC0040v;
import p100h0.C0985a;
import p100h0.InterfaceC0986b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0986b {
    @Override // p100h0.InterfaceC0986b
    /* renamed from: a */
    public final List mo1606a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p100h0.InterfaceC0986b
    /* renamed from: b */
    public final Object mo1607b(Context context) {
        Object objM2494b;
        C0676o c0676o = new C0676o(new C0004c(context));
        c0676o.f2390a = 1;
        if (C0671j.f2394j == null) {
            synchronized (C0671j.f2393i) {
                try {
                    if (C0671j.f2394j == null) {
                        C0671j.f2394j = new C0671j(c0676o);
                    }
                } finally {
                }
            }
        }
        C0985a c0985aM2492c = C0985a.m2492c(context);
        c0985aM2492c.getClass();
        synchronized (C0985a.f4134e) {
            try {
                objM2494b = c0985aM2492c.f4135a.get(ProcessLifecycleInitializer.class);
                if (objM2494b == null) {
                    objM2494b = c0985aM2492c.m2494b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0755t c0755tMo1453e = ((InterfaceC0753r) objM2494b).mo1453e();
        c0755tMo1453e.m1779a(new InterfaceC0739d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0739d
            /* renamed from: a */
            public final void mo1608a() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0663b.m1609a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0040v(1), 500L);
                c0755tMo1453e.m1784f(this);
            }
        });
        return Boolean.TRUE;
    }
}
