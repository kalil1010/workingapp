package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.K */
/* loaded from: classes.dex */
public final class C0734K {

    /* renamed from: a */
    public final LinkedHashMap f2707a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1771a() {
        for (AbstractC0732I abstractC0732I : this.f2707a.values()) {
            HashMap map = abstractC0732I.f2703a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : abstractC0732I.f2703a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0732I.f2704b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0732I.f2704b) {
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            abstractC0732I.mo1694a();
        }
        this.f2707a.clear();
    }
}
