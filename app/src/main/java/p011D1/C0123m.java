package p011D1;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p107j1.C1179b;
import p110k1.AbstractC1209k;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;

/* renamed from: D1.m */
/* loaded from: classes.dex */
public final class C0123m {

    /* renamed from: a */
    public final C1179b f358a;

    /* renamed from: b */
    public final EnumC0110B f359b;

    /* renamed from: c */
    public final C0117g f360c;

    /* renamed from: d */
    public final List f361d;

    public C0123m(EnumC0110B enumC0110B, C0117g c0117g, List list, InterfaceC1290a interfaceC1290a) {
        this.f359b = enumC0110B;
        this.f360c = c0117g;
        this.f361d = list;
        this.f358a = new C1179b(new C0122l(interfaceC1290a));
    }

    /* renamed from: a */
    public final List m350a() {
        return (List) this.f358a.m2830a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0123m)) {
            return false;
        }
        C0123m c0123m = (C0123m) obj;
        return c0123m.f359b == this.f359b && AbstractC1326c.m3058a(c0123m.f360c, this.f360c) && AbstractC1326c.m3058a(c0123m.m350a(), m350a()) && AbstractC1326c.m3058a(c0123m.f361d, this.f361d);
    }

    public final int hashCode() {
        return this.f361d.hashCode() + ((m350a().hashCode() + ((this.f360c.hashCode() + ((this.f359b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM350a = m350a();
        ArrayList arrayList = new ArrayList(AbstractC1209k.m2850x0(listM350a));
        for (Certificate certificate : listM350a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1326c.m3061d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f359b);
        sb.append(" cipherSuite=");
        sb.append(this.f360c);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f361d;
        ArrayList arrayList2 = new ArrayList(AbstractC1209k.m2850x0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1326c.m3061d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
