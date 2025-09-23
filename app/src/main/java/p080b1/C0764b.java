package p080b1;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public final class C0764b implements ParameterizedType, Serializable {

    /* renamed from: a */
    public final Type f2875a;

    /* renamed from: b */
    public final Type f2876b;

    /* renamed from: c */
    public final Type[] f2877c;

    public C0764b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = true;
            boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z3) {
                z2 = false;
            }
            AbstractC0766d.m1965b(z2);
        }
        this.f2875a = type == null ? null : AbstractC0766d.m1964a(type);
        this.f2876b = AbstractC0766d.m1964a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f2877c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.f2877c[i2]);
            AbstractC0766d.m1966c(this.f2877c[i2]);
            Type[] typeArr3 = this.f2877c;
            typeArr3[i2] = AbstractC0766d.m1964a(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0766d.m1967d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f2877c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2875a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f2876b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f2877c) ^ this.f2876b.hashCode();
        Type type = this.f2875a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f2877c;
        int length = typeArr.length;
        Type type = this.f2876b;
        if (length == 0) {
            return AbstractC0766d.m1972i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0766d.m1972i(type));
        sb.append("<");
        sb.append(AbstractC0766d.m1972i(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(AbstractC0766d.m1972i(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
