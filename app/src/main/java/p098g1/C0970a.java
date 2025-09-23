package p098g1;

import java.lang.reflect.Type;
import java.util.Objects;
import p080b1.AbstractC0766d;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C0970a {

    /* renamed from: a */
    public final Class f4064a;

    /* renamed from: b */
    public final Type f4065b;

    /* renamed from: c */
    public final int f4066c;

    public C0970a(Type type) {
        Objects.requireNonNull(type);
        Type typeM1964a = AbstractC0766d.m1964a(type);
        this.f4065b = typeM1964a;
        this.f4064a = AbstractC0766d.m1970g(typeM1964a);
        this.f4066c = typeM1964a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0970a) {
            return AbstractC0766d.m1967d(this.f4065b, ((C0970a) obj).f4065b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4066c;
    }

    public final String toString() {
        return AbstractC0766d.m1972i(this.f4065b);
    }
}
