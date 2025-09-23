package p080b1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: b1.c */
/* loaded from: classes.dex */
public final class C0765c implements WildcardType, Serializable {

    /* renamed from: a */
    public final Type f2878a;

    /* renamed from: b */
    public final Type f2879b;

    public C0765c(Type[] typeArr, Type[] typeArr2) {
        AbstractC0766d.m1965b(typeArr2.length <= 1);
        AbstractC0766d.m1965b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0766d.m1966c(typeArr[0]);
            this.f2879b = null;
            this.f2878a = AbstractC0766d.m1964a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0766d.m1966c(typeArr2[0]);
        AbstractC0766d.m1965b(typeArr[0] == Object.class);
        this.f2879b = AbstractC0766d.m1964a(typeArr2[0]);
        this.f2878a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0766d.m1967d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2879b;
        return type != null ? new Type[]{type} : AbstractC0766d.f2880a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2878a};
    }

    public final int hashCode() {
        Type type = this.f2879b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2878a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f2879b;
        if (type != null) {
            return "? super " + AbstractC0766d.m1972i(type);
        }
        Type type2 = this.f2878a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0766d.m1972i(type2);
    }
}
