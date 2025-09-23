package p120o0;

import java.util.Arrays;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C1251a {

    /* renamed from: a */
    public final byte[] f5063a;

    /* renamed from: b */
    public final int f5064b;

    public C1251a(byte[] bArr) {
        this.f5063a = bArr;
        this.f5064b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1251a)) {
            return false;
        }
        return Arrays.equals(this.f5063a, ((C1251a) obj).f5063a);
    }

    public final int hashCode() {
        return this.f5064b;
    }
}
