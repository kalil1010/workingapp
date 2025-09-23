package p080b1;

import java.math.BigDecimal;

/* renamed from: b1.l */
/* loaded from: classes.dex */
public final class C0774l extends Number {

    /* renamed from: a */
    public final String f2898a;

    public C0774l(String str) {
        this.f2898a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f2898a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0774l)) {
            return false;
        }
        Object obj2 = ((C0774l) obj).f2898a;
        String str = this.f2898a;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f2898a);
    }

    public final int hashCode() {
        return this.f2898a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f2898a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f2898a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f2898a;
    }
}
