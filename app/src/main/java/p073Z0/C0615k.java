package p073Z0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import p080b1.C0774l;

/* renamed from: Z0.k */
/* loaded from: classes.dex */
public final class C0615k extends AbstractC0610f {

    /* renamed from: a */
    public final Serializable f1930a;

    public C0615k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f1930a = bool;
    }

    /* renamed from: c */
    public static boolean m1413c(C0615k c0615k) {
        Serializable serializable = c0615k.f1930a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: a */
    public final Number m1414a() {
        Serializable serializable = this.f1930a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0774l((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: b */
    public final String m1415b() {
        Serializable serializable = this.f1930a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m1414a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0615k.class != obj.getClass()) {
            return false;
        }
        C0615k c0615k = (C0615k) obj;
        Serializable serializable = this.f1930a;
        Serializable serializable2 = c0615k.f1930a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m1413c(this) && m1413c(c0615k)) {
            return m1414a().longValue() == c0615k.m1414a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = m1414a().doubleValue();
        double dDoubleValue2 = c0615k.m1414a().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f1930a;
        if (serializable == null) {
            return 31;
        }
        if (m1413c(this)) {
            jDoubleToLongBits = m1414a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m1414a().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C0615k(Number number) {
        Objects.requireNonNull(number);
        this.f1930a = number;
    }

    public C0615k(String str) {
        Objects.requireNonNull(str);
        this.f1930a = str;
    }
}
