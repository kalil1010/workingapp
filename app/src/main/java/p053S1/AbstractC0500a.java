package p053S1;

import java.io.EOFException;
import p050R1.C0479g;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1403a;

/* renamed from: S1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0500a {

    /* renamed from: a */
    public static final byte[] f1534a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1403a.f6077a);
        AbstractC1326c.m3061d(bytes, "(this as java.lang.String).getBytes(charset)");
        f1534a = bytes;
    }

    /* renamed from: a */
    public static final String m1241a(C0479g c0479g, long j2) throws EOFException {
        AbstractC1326c.m3062e(c0479g, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (c0479g.m1176h(j3) == ((byte) 13)) {
                String strM1185q = c0479g.m1185q(j3, AbstractC1403a.f6077a);
                c0479g.m1187s(2L);
                return strM1185q;
            }
        }
        String strM1185q2 = c0479g.m1185q(j2, AbstractC1403a.f6077a);
        c0479g.m1187s(1L);
        return strM1185q2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r19 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[LOOP:0: B:5:0x001d->B:44:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m1242b(p050R1.C0479g r17, p050R1.C0487o r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p053S1.AbstractC0500a.m1242b(R1.g, R1.o, boolean):int");
    }
}
