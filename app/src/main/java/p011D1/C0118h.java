package p011D1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import p131s1.AbstractC1326c;

/* renamed from: D1.h */
/* loaded from: classes.dex */
public final class C0118h {

    /* renamed from: a */
    public boolean f329a = true;

    /* renamed from: b */
    public boolean f330b;

    /* renamed from: c */
    public Object f331c;

    /* renamed from: d */
    public Serializable f332d;

    /* renamed from: a */
    public C0119i m325a() {
        return new C0119i(this.f329a, this.f330b, (String[]) this.f331c, (String[]) this.f332d);
    }

    /* renamed from: b */
    public void m326b(C0117g... c0117gArr) throws CloneNotSupportedException {
        AbstractC1326c.m3062e(c0117gArr, "cipherSuites");
        if (!this.f329a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c0117gArr.length);
        for (C0117g c0117g : c0117gArr) {
            arrayList.add(c0117g.f328a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        m327c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public void m327c(String... strArr) throws CloneNotSupportedException {
        AbstractC1326c.m3062e(strArr, "cipherSuites");
        if (!this.f329a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.f331c = (String[]) objClone;
    }

    /* renamed from: d */
    public void m328d(EnumC0110B... enumC0110BArr) throws CloneNotSupportedException {
        if (!this.f329a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC0110BArr.length);
        for (EnumC0110B enumC0110B : enumC0110BArr) {
            arrayList.add(enumC0110B.f278a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        m329e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: e */
    public void m329e(String... strArr) throws CloneNotSupportedException {
        AbstractC1326c.m3062e(strArr, "tlsVersions");
        if (!this.f329a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.f332d = (String[]) objClone;
    }
}
