package p011D1;

import android.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p093e2.AbstractC0901d;
import p107j1.C1178a;
import p110k1.C1200b;
import p131s1.AbstractC1326c;

/* renamed from: D1.v */
/* loaded from: classes.dex */
public final class C0132v {

    /* renamed from: a */
    public final /* synthetic */ int f449a = 0;

    /* renamed from: b */
    public final String f450b;

    /* renamed from: c */
    public Object f451c;

    /* renamed from: d */
    public final Object f452d;

    /* renamed from: e */
    public final Iterable f453e;

    /* renamed from: f */
    public final Object f454f;

    public C0132v(C0126p c0126p, String str, C0124n c0124n, AbstractC0901d abstractC0901d, Map map) {
        AbstractC1326c.m3062e(c0126p, "url");
        AbstractC1326c.m3062e(str, "method");
        this.f452d = c0126p;
        this.f450b = str;
        this.f453e = c0124n;
        this.f454f = map;
    }

    /* renamed from: a */
    public C0121k m367a() {
        C0121k c0121k = new C0121k();
        c0121k.f355d = new LinkedHashMap();
        c0121k.f352a = (C0126p) this.f452d;
        c0121k.f353b = this.f450b;
        Map map = (Map) this.f454f;
        c0121k.f355d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        c0121k.f354c = ((C0124n) this.f453e).m353c();
        return c0121k;
    }

    public final String toString() {
        switch (this.f449a) {
            case 0:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append(this.f450b);
                sb.append(", url=");
                sb.append((C0126p) this.f452d);
                C0124n c0124n = (C0124n) this.f453e;
                if (c0124n.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c0124n.iterator();
                    int i2 = 0;
                    while (true) {
                        C1200b c1200b = (C1200b) it;
                        if (c1200b.hasNext()) {
                            Object next = c1200b.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            C1178a c1178a = (C1178a) next;
                            String str = (String) c1178a.f4795a;
                            String str2 = (String) c1178a.f4796b;
                            if (i2 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i2 = i3;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f454f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String string = sb.toString();
                AbstractC1326c.m3061d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + this.f450b + ", mProviderPackage: " + ((String) this.f451c) + ", mQuery: " + ((String) this.f452d) + ", mCertificates:");
                int i4 = 0;
                while (true) {
                    List list = (List) this.f453e;
                    if (i4 >= list.size()) {
                        sb2.append("}mCertificatesArray: 0");
                        return sb2.toString();
                    }
                    sb2.append(" [");
                    List list2 = (List) list.get(i4);
                    for (int i5 = 0; i5 < list2.size(); i5++) {
                        sb2.append(" \"");
                        sb2.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                        sb2.append("\"");
                    }
                    sb2.append(" ]");
                    i4++;
                }
        }
    }

    public C0132v(String str, String str2, String str3, List list) {
        str.getClass();
        this.f450b = str;
        str2.getClass();
        this.f451c = str2;
        this.f452d = str3;
        list.getClass();
        this.f453e = list;
        this.f454f = str + "-" + str2 + "-" + str3;
    }
}
