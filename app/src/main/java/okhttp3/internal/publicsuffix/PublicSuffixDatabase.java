package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p033L1.AbstractC0356d;
import p033L1.C0366n;
import p050R1.AbstractC0486n;
import p050R1.C0476d;
import p050R1.C0484l;
import p050R1.C0489q;
import p050R1.C0496x;
import p055T0.C0511e;
import p080b1.C0770h;
import p093e2.AbstractC0901d;
import p110k1.AbstractC1207i;
import p110k1.AbstractC1208j;
import p110k1.C1215q;
import p131s1.AbstractC1326c;
import p146x1.C1396a;
import p146x1.InterfaceC1397b;
import p149y1.AbstractC1411i;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f5108e = {(byte) 42};

    /* renamed from: f */
    public static final List f5109f = AbstractC0901d.m2287T("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f5110g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f5111a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f5112b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f5113c;

    /* renamed from: d */
    public byte[] f5114d;

    /* renamed from: c */
    public static List m2918c(String str) {
        int i2 = 0;
        List listM3186a0 = AbstractC1411i.m3186a0(str, new char[]{'.'});
        if (listM3186a0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!AbstractC1326c.m3058a((String) listM3186a0.get(listM3186a0.size() - 1), "")) {
            return listM3186a0;
        }
        int size = listM3186a0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        if (size == 0) {
            return C1215q.f4904a;
        }
        if (size >= listM3186a0.size()) {
            return AbstractC1207i.m2847A0(listM3186a0);
        }
        if (size == 1) {
            if (listM3186a0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0901d.m2287T(listM3186a0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = listM3186a0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == size) {
                break;
            }
        }
        return AbstractC1208j.m2849w0(arrayList);
    }

    /* renamed from: a */
    public final String m2919a(String str) throws InterruptedException {
        String strM1271a;
        String strM1271a2;
        String strM1271a3;
        List listM3186a0;
        int size;
        int size2;
        int i2 = 0;
        String unicode = IDN.toUnicode(str);
        AbstractC1326c.m3061d(unicode, "unicodeDomain");
        List listM2918c = m2918c(unicode);
        if (this.f5111a.get() || !this.f5111a.compareAndSet(false, true)) {
            try {
                this.f5112b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        m2920b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e3) {
                        C0366n c0366n = C0366n.f1131a;
                        C0366n.f1131a.getClass();
                        C0366n.m1032i("Failed to read public suffix list", 5, e3);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f5113c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listM2918c.size();
        byte[][] bArr = new byte[size3][];
        for (int i3 = 0; i3 < size3; i3++) {
            String str2 = (String) listM2918c.get(i3);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1326c.m3061d(charset, "UTF_8");
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(charset);
            AbstractC1326c.m3061d(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i3] = bytes;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                strM1271a = null;
                break;
            }
            byte[] bArr2 = this.f5113c;
            if (bArr2 == null) {
                AbstractC1326c.m3065h("publicSuffixListBytes");
                throw null;
            }
            strM1271a = C0511e.m1271a(bArr2, bArr, i4);
            if (strM1271a != null) {
                break;
            }
            i4++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i5 = 0; i5 < length; i5++) {
                bArr3[i5] = f5108e;
                byte[] bArr4 = this.f5113c;
                if (bArr4 == null) {
                    AbstractC1326c.m3065h("publicSuffixListBytes");
                    throw null;
                }
                strM1271a2 = C0511e.m1271a(bArr4, bArr3, i5);
                if (strM1271a2 != null) {
                    break;
                }
            }
            strM1271a2 = null;
        } else {
            strM1271a2 = null;
        }
        if (strM1271a2 != null) {
            int i6 = size3 - 1;
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr5 = this.f5114d;
                if (bArr5 == null) {
                    AbstractC1326c.m3065h("publicSuffixExceptionListBytes");
                    throw null;
                }
                strM1271a3 = C0511e.m1271a(bArr5, bArr, i7);
                if (strM1271a3 != null) {
                    break;
                }
            }
            strM1271a3 = null;
        } else {
            strM1271a3 = null;
        }
        if (strM1271a3 != null) {
            listM3186a0 = AbstractC1411i.m3186a0("!".concat(strM1271a3), new char[]{'.'});
        } else if (strM1271a == null && strM1271a2 == null) {
            listM3186a0 = f5109f;
        } else {
            List listM3186a02 = C1215q.f4904a;
            List listM3186a03 = strM1271a != null ? AbstractC1411i.m3186a0(strM1271a, new char[]{'.'}) : listM3186a02;
            if (strM1271a2 != null) {
                listM3186a02 = AbstractC1411i.m3186a0(strM1271a2, new char[]{'.'});
            }
            listM3186a0 = listM3186a03.size() > listM3186a02.size() ? listM3186a03 : listM3186a02;
        }
        if (listM2918c.size() == listM3186a0.size() && ((String) listM3186a0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM3186a0.get(0)).charAt(0) == '!') {
            size = listM2918c.size();
            size2 = listM3186a0.size();
        } else {
            size = listM2918c.size();
            size2 = listM3186a0.size() + 1;
        }
        int i8 = size - size2;
        InterfaceC1397b c0770h = new C0770h(m2918c(str));
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 != 0) {
            c0770h = new C1396a(c0770h, i8);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c0770h) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC0356d.m952b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* renamed from: b */
    public final void m2920b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = AbstractC0486n.f1495a;
        C0489q c0489q = new C0489q(new C0484l(new C0476d(resourceAsStream, 1, new C0496x())));
        try {
            long jM1227m = c0489q.m1227m();
            c0489q.m1232r(jM1227m);
            byte[] bArrM1180l = c0489q.f1501a.m1180l(jM1227m);
            long jM1227m2 = c0489q.m1227m();
            c0489q.m1232r(jM1227m2);
            byte[] bArrM1180l2 = c0489q.f1501a.m1180l(jM1227m2);
            c0489q.close();
            synchronized (this) {
                this.f5113c = bArrM1180l;
                this.f5114d = bArrM1180l2;
            }
            this.f5112b.countDown();
        } finally {
        }
    }
}
