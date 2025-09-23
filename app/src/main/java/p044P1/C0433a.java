package p044P1;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p033L1.AbstractC0364l;
import p131s1.AbstractC1326c;

/* renamed from: P1.a */
/* loaded from: classes.dex */
public final class C0433a extends AbstractC0364l {

    /* renamed from: f */
    public final InterfaceC0436d f1321f;

    public C0433a(InterfaceC0436d interfaceC0436d) {
        AbstractC1326c.m3062e(interfaceC0436d, "trustRootIndex");
        this.f1321f = interfaceC0436d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0433a) && AbstractC1326c.m3058a(((C0433a) obj).f1321f, this.f1321f);
    }

    public final int hashCode() {
        return this.f1321f.hashCode();
    }

    @Override // p033L1.AbstractC0364l
    /* renamed from: s */
    public final List mo1031s(List list, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        AbstractC1326c.m3062e(list, "chain");
        AbstractC1326c.m3062e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC1326c.m3061d(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo937a = this.f1321f.mo937a(x509Certificate);
            if (x509CertificateMo937a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC1326c.m3061d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC1326c.m3058a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo937a)) {
                arrayList.add(x509CertificateMo937a);
            }
            if (AbstractC1326c.m3058a(x509CertificateMo937a.getIssuerDN(), x509CertificateMo937a.getSubjectDN())) {
                try {
                    x509CertificateMo937a.verify(x509CertificateMo937a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
