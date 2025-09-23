package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0737b {

    /* renamed from: a */
    public final int f2714a;

    /* renamed from: b */
    public final Method f2715b;

    public C0737b(int i2, Method method) throws SecurityException {
        this.f2714a = i2;
        this.f2715b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0737b)) {
            return false;
        }
        C0737b c0737b = (C0737b) obj;
        return this.f2714a == c0737b.f2714a && this.f2715b.getName().equals(c0737b.f2715b.getName());
    }

    public final int hashCode() {
        return this.f2715b.getName().hashCode() + (this.f2714a * 31);
    }
}
