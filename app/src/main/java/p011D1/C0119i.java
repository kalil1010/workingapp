package p011D1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p014E1.AbstractC0145b;
import p033L1.AbstractC0356d;
import p110k1.AbstractC1207i;
import p113l1.C1228a;

/* renamed from: D1.i */
/* loaded from: classes.dex */
public final class C0119i {

    /* renamed from: e */
    public static final C0119i f333e;

    /* renamed from: f */
    public static final C0119i f334f;

    /* renamed from: a */
    public final boolean f335a;

    /* renamed from: b */
    public final boolean f336b;

    /* renamed from: c */
    public final String[] f337c;

    /* renamed from: d */
    public final String[] f338d;

    static {
        C0117g c0117g = C0117g.f324q;
        C0117g c0117g2 = C0117g.f325r;
        C0117g c0117g3 = C0117g.f326s;
        C0117g c0117g4 = C0117g.f318k;
        C0117g c0117g5 = C0117g.f320m;
        C0117g c0117g6 = C0117g.f319l;
        C0117g c0117g7 = C0117g.f321n;
        C0117g c0117g8 = C0117g.f323p;
        C0117g c0117g9 = C0117g.f322o;
        C0117g[] c0117gArr = {c0117g, c0117g2, c0117g3, c0117g4, c0117g5, c0117g6, c0117g7, c0117g8, c0117g9};
        C0117g[] c0117gArr2 = {c0117g, c0117g2, c0117g3, c0117g4, c0117g5, c0117g6, c0117g7, c0117g8, c0117g9, C0117g.f316i, C0117g.f317j, C0117g.f314g, C0117g.f315h, C0117g.f312e, C0117g.f313f, C0117g.f311d};
        C0118h c0118h = new C0118h();
        c0118h.m326b((C0117g[]) Arrays.copyOf(c0117gArr, 9));
        EnumC0110B enumC0110B = EnumC0110B.TLS_1_3;
        EnumC0110B enumC0110B2 = EnumC0110B.TLS_1_2;
        c0118h.m328d(enumC0110B, enumC0110B2);
        if (!c0118h.f329a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0118h.f330b = true;
        c0118h.m325a();
        C0118h c0118h2 = new C0118h();
        c0118h2.m326b((C0117g[]) Arrays.copyOf(c0117gArr2, 16));
        c0118h2.m328d(enumC0110B, enumC0110B2);
        if (!c0118h2.f329a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0118h2.f330b = true;
        f333e = c0118h2.m325a();
        C0118h c0118h3 = new C0118h();
        c0118h3.m326b((C0117g[]) Arrays.copyOf(c0117gArr2, 16));
        c0118h3.m328d(enumC0110B, enumC0110B2, EnumC0110B.TLS_1_1, EnumC0110B.TLS_1_0);
        if (!c0118h3.f329a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0118h3.f330b = true;
        c0118h3.m325a();
        f334f = new C0119i(false, false, null, null);
    }

    public C0119i(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f335a = z2;
        this.f336b = z3;
        this.f337c = strArr;
        this.f338d = strArr2;
    }

    /* renamed from: a */
    public final List m330a() {
        String[] strArr = this.f337c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0117g.f327t.m324d(str));
        }
        return AbstractC1207i.m2847A0(arrayList);
    }

    /* renamed from: b */
    public final boolean m331b(SSLSocket sSLSocket) {
        if (!this.f335a) {
            return false;
        }
        String[] strArr = this.f338d;
        if (strArr != null && !AbstractC0145b.m398k(strArr, sSLSocket.getEnabledProtocols(), C1228a.f4933b)) {
            return false;
        }
        String[] strArr2 = this.f337c;
        return strArr2 == null || AbstractC0145b.m398k(strArr2, sSLSocket.getEnabledCipherSuites(), C0117g.f309b);
    }

    /* renamed from: c */
    public final List m332c() {
        String[] strArr = this.f338d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0356d.m966p(str));
        }
        return AbstractC1207i.m2847A0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0119i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0119i c0119i = (C0119i) obj;
        boolean z2 = c0119i.f335a;
        boolean z3 = this.f335a;
        if (z3 != z2) {
            return false;
        }
        if (z3) {
            return Arrays.equals(this.f337c, c0119i.f337c) && Arrays.equals(this.f338d, c0119i.f338d) && this.f336b == c0119i.f336b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f335a) {
            return 17;
        }
        String[] strArr = this.f337c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f338d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f336b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f335a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m330a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m332c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f336b + ')';
    }
}
