package p080b1;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C0763a implements GenericArrayType, Serializable {

    /* renamed from: a */
    public final Type f2874a;

    public C0763a(Type type) {
        Objects.requireNonNull(type);
        this.f2874a = AbstractC0766d.m1964a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0766d.m1967d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2874a;
    }

    public final int hashCode() {
        return this.f2874a.hashCode();
    }

    public final String toString() {
        return AbstractC0766d.m1972i(this.f2874a) + "[]";
    }
}
