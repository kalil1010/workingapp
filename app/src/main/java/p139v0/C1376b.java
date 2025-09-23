package p139v0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import p080b1.C0770h;
import p085c2.AbstractC0808b;
import p085c2.InterfaceC0807a;
import p120o0.AbstractC1252b;
import p120o0.C1254d;
import p130s0.C1322a;
import p142w0.AbstractC1385d;

/* renamed from: v0.b */
/* loaded from: classes.dex */
public final class C1376b extends AbstractC1375a {

    /* renamed from: c */
    public static final InterfaceC0807a f5985c = AbstractC0808b.m2014d(C1376b.class);

    /* renamed from: d */
    public static final Pattern f5986d = Pattern.compile(".*");

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[PHI: r6
  0x007f: PHI (r6v1 byte[]) = (r6v0 byte[]), (r6v18 byte[]), (r6v16 byte[]) binds: [B:5:0x0044, B:12:0x007a, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
    @Override // p130s0.InterfaceC1323b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo3055a(p125q0.C1276d r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139v0.C1376b.mo3055a(q0.d):boolean");
    }

    @Override // p130s0.InterfaceC1323b
    /* renamed from: c */
    public final Pattern mo3056c() {
        return f5986d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3151j(p125q0.C1278f r12, byte[] r13) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f5984a
            java.lang.Object r1 = r0.get()
            s0.a r1 = (p130s0.C1322a) r1
            q0.f r1 = r1.f5645e
            p0.b r2 = p120o0.AbstractC1252b.f5069E
            p0.b[] r2 = new p123p0.C1266b[]{r2}
            byte[] r2 = p142w0.AbstractC1385d.m3158b(r13, r2)
            c2.a r3 = p142w0.AbstractC1386e.f6004a
            java.lang.String r3 = "yyMM"
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L86
            q0.g r8 = new q0.g
            r8.<init>()
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
            java.util.regex.Pattern r2 = p142w0.AbstractC1386e.f6006c
            java.util.regex.Matcher r2 = r2.matcher(r9)
            boolean r9 = r2.find()
            if (r9 == 0) goto L86
            r2.group(r7)
            java.lang.String r9 = r2.group(r4)
            r8.f5202b = r9
            r9 = 4
            java.lang.String r9 = r2.group(r9)
            java.lang.String r9 = r9.trim()
            java.lang.String[] r9 = p074Z1.AbstractC0618a.m1423g(r9)
            if (r9 == 0) goto L59
            int r10 = r9.length
            if (r10 != r4) goto L59
            r10 = r9[r6]
            p074Z1.AbstractC0618a.m1424h(r10)
            r9 = r9[r7]
            p074Z1.AbstractC0618a.m1424h(r9)
        L59:
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            java.util.Locale r10 = java.util.Locale.getDefault()
            r9.<init>(r3, r10)
            r10 = 5
            java.lang.String r10 = r2.group(r10)     // Catch: java.text.ParseException -> L7c
            java.util.Date r9 = r9.parse(r10)     // Catch: java.text.ParseException -> L7c
            java.util.Date r9 = p081b2.AbstractC0785a.m1998a(r9)     // Catch: java.text.ParseException -> L7c
            r8.f5203c = r9     // Catch: java.text.ParseException -> L7c
            q0.j r9 = new q0.j
            r10 = 6
            java.lang.String r2 = r2.group(r10)
            r9.<init>(r2)
            goto L87
        L7c:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            c2.a r8 = p142w0.AbstractC1386e.f6004a
            r8.mo126j(r2)
        L86:
            r8 = r5
        L87:
            r1.f5200d = r8
            java.lang.Object r0 = r0.get()
            s0.a r0 = (p130s0.C1322a) r0
            q0.f r0 = r0.f5645e
            p0.b r1 = p120o0.AbstractC1252b.f5083g
            p0.b r2 = p120o0.AbstractC1252b.f5071G
            p0.b[] r1 = new p123p0.C1266b[]{r1, r2}
            byte[] r13 = p142w0.AbstractC1385d.m3158b(r13, r1)
            if (r13 == 0) goto Le7
            q0.h r1 = new q0.h
            r1.<init>()
            java.lang.String r13 = p093e2.AbstractC0901d.m2312q(r13, r6)
            java.util.regex.Pattern r2 = p142w0.AbstractC1386e.f6005b
            java.util.regex.Matcher r13 = r2.matcher(r13)
            boolean r2 = r13.find()
            if (r2 == 0) goto Le7
            java.lang.String r2 = r13.group(r7)
            r1.f5204b = r2
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r8 = java.util.Locale.getDefault()
            r2.<init>(r3, r8)
            java.lang.String r3 = r13.group(r4)     // Catch: java.text.ParseException -> Ldd
            java.util.Date r2 = r2.parse(r3)     // Catch: java.text.ParseException -> Ldd
            java.util.Date r2 = p081b2.AbstractC0785a.m1998a(r2)     // Catch: java.text.ParseException -> Ldd
            r1.f5205c = r2     // Catch: java.text.ParseException -> Ldd
            q0.j r2 = new q0.j
            r3 = 3
            java.lang.String r13 = r13.group(r3)
            r2.<init>(r13)
            r5 = r1
            goto Le7
        Ldd:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            c2.a r1 = p142w0.AbstractC1386e.f6004a
            r1.mo126j(r13)
        Le7:
            r0.f5199c = r5
            q0.g r13 = r12.f5200d
            if (r13 != 0) goto Lf1
            q0.h r12 = r12.f5199c
            if (r12 == 0) goto Lf2
        Lf1:
            r6 = r7
        Lf2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p139v0.C1376b.m3151j(q0.f, byte[]):boolean");
    }

    /* renamed from: k */
    public final byte[] m3152k(byte[] bArr) throws IOException {
        WeakReference weakReference = this.f5984a;
        ArrayList arrayListM3160d = AbstractC1385d.m3160d(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(AbstractC1252b.f5085i.f5136a);
            Iterator it = arrayListM3160d.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((C1254d) it.next()).f5106b;
            }
            byteArrayOutputStream.write(i2);
            Iterator it2 = arrayListM3160d.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(((C1322a) weakReference.get()).f5641a.m2926a((C1254d) it2.next()));
            }
        } catch (IOException e3) {
            f5985c.mo124g("Construct GPO Command:" + e3.getMessage(), e3);
        }
        C0770h c0770h = ((C1322a) weakReference.get()).f5642b;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray == null ? 0 : byteArray.length;
        int length2 = 4;
        byte[] bArr2 = new byte[((byteArray == null || byteArray.length == 0) ? 4 : byteArray.length + 5) + 1];
        bArr2[0] = (byte) 128;
        bArr2[1] = (byte) 168;
        byte b = (byte) 0;
        bArr2[2] = b;
        bArr2[3] = b;
        if (byteArray != null && byteArray.length != 0) {
            bArr2[4] = (byte) length;
            System.arraycopy(byteArray, 0, bArr2, 5, byteArray.length);
            length2 = 5 + byteArray.length;
        }
        bArr2[length2] = (byte) (bArr2[length2] + b);
        return c0770h.m1986l(bArr2);
    }
}
