package p002A1;

import android.content.Context;
import android.os.Handler;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import p001A0.C0004c;
import p011D1.AbstractC0136z;
import p011D1.C0111a;
import p011D1.C0112b;
import p011D1.C0115e;
import p011D1.C0121k;
import p011D1.C0124n;
import p011D1.C0126p;
import p011D1.C0130t;
import p011D1.C0132v;
import p011D1.C0133w;
import p011D1.C0134x;
import p011D1.InterfaceC0127q;
import p014E1.AbstractC0145b;
import p021H1.C0186e;
import p021H1.C0190i;
import p021H1.C0195n;
import p021H1.C0196o;
import p024I1.AbstractC0211e;
import p024I1.C0212f;
import p024I1.C0213g;
import p030K1.C0305a;
import p044P1.C0435c;
import p050R1.C0484l;
import p050R1.C0489q;
import p093e2.AbstractC0901d;
import p110k1.C1215q;
import p131s1.AbstractC1326c;

/* renamed from: A1.D */
/* loaded from: classes.dex */
public final class C0009D implements InterfaceC0127q {

    /* renamed from: a */
    public final /* synthetic */ int f16a = 1;

    /* renamed from: b */
    public final Object f17b;

    public C0009D(Context context) {
        this.f17b = context;
    }

    /* renamed from: d */
    public static int m36d(C0134x c0134x, int i2) throws NumberFormatException {
        String strM370g = C0134x.m370g(c0134x, "Retry-After");
        if (strM370g == null) {
            return i2;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC1326c.m3061d(patternCompile, "compile(pattern)");
        if (!patternCompile.matcher(strM370g).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM370g);
        AbstractC1326c.m3061d(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p011D1.InterfaceC0127q
    /* renamed from: a */
    public final C0134x mo37a(C0212f c0212f) {
        AbstractC0136z abstractC0136z;
        SSLSocketFactory sSLSocketFactory;
        C0435c c0435c;
        C0115e c0115e;
        switch (this.f16a) {
            case 0:
                C0132v c0132v = c0212f.f772f;
                Context context = (Context) this.f17b;
                if (!AbstractC0901d.m2284N(context)) {
                    new Handler(context.getMainLooper()).post(new RunnableC0042x(1, this));
                }
                return c0212f.m563b(c0132v);
            case 1:
                C0132v c0132v2 = c0212f.f772f;
                C0121k c0121kM367a = c0132v2.m367a();
                C0124n c0124n = (C0124n) c0132v2.f453e;
                String strM351a = c0124n.m351a("Host");
                boolean z2 = false;
                C0126p c0126p = (C0126p) c0132v2.f452d;
                if (strM351a == null) {
                    c0121kM367a.m340h("Host", AbstractC0145b.m411x(c0126p, false));
                }
                if (c0124n.m351a("Connection") == null) {
                    c0121kM367a.m340h("Connection", "Keep-Alive");
                }
                if (c0124n.m351a("Accept-Encoding") == null && c0124n.m351a("Range") == null) {
                    c0121kM367a.m340h("Accept-Encoding", "gzip");
                    z2 = true;
                }
                C0112b c0112b = (C0112b) this.f17b;
                c0112b.getClass();
                AbstractC1326c.m3062e(c0126p, "url");
                if (c0124n.m351a("User-Agent") == null) {
                    c0121kM367a.m340h("User-Agent", "okhttp/4.9.3");
                }
                C0134x c0134xM563b = c0212f.m563b(c0121kM367a.m334b());
                C0124n c0124n2 = c0134xM563b.f473f;
                AbstractC0211e.m561b(c0112b, c0126p, c0124n2);
                C0133w c0133wM371h = c0134xM563b.m371h();
                c0133wM371h.f455a = c0132v2;
                if (z2 && "gzip".equalsIgnoreCase(C0134x.m370g(c0134xM563b, "Content-Encoding")) && AbstractC0211e.m560a(c0134xM563b) && (abstractC0136z = c0134xM563b.f474g) != null) {
                    C0484l c0484l = new C0484l(abstractC0136z.mo374i());
                    C0004c c0004cM353c = c0124n2.m353c();
                    c0004cM353c.m34u("Content-Encoding");
                    c0004cM353c.m34u("Content-Length");
                    c0133wM371h.f460f = c0004cM353c.m29p().m353c();
                    c0133wM371h.f461g = new C0213g(C0134x.m370g(c0134xM563b, "Content-Type"), -1L, new C0489q(c0484l));
                }
                return c0133wM371h.m369a();
            default:
                C0132v c0132v3 = c0212f.f772f;
                C0190i c0190i = c0212f.f768b;
                C1215q c1215q = C1215q.f4904a;
                C0134x c0134x = null;
                int i2 = 0;
                C0132v c0132vM38b = c0132v3;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        c0190i.getClass();
                        if (c0190i.f695h != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (c0190i) {
                            try {
                                if (c0190i.f697j) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c0190i.f696i) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            C0195n c0195n = c0190i.f688a;
                            C0126p c0126p2 = (C0126p) c0132vM38b.f452d;
                            boolean z4 = c0126p2.f372a;
                            C0130t c0130t = c0190i.f702o;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = c0130t.f429o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                C0435c c0435c2 = c0130t.f433s;
                                c0115e = c0130t.f434t;
                                sSLSocketFactory = sSLSocketFactory2;
                                c0435c = c0435c2;
                            } else {
                                sSLSocketFactory = null;
                                c0435c = null;
                                c0115e = null;
                            }
                            c0190i.f692e = new C0186e(c0195n, new C0111a(c0126p2.f376e, c0126p2.f377f, c0130t.f425k, c0130t.f428n, sSLSocketFactory, c0435c, c0115e, c0130t.f427m, c0130t.f432r, c0130t.f431q, c0130t.f426l), c0190i);
                        }
                        try {
                            if (c0190i.f699l) {
                                throw new IOException("Canceled");
                            }
                            try {
                                C0134x c0134xM563b2 = c0212f.m563b(c0132vM38b);
                                if (c0134x != null) {
                                    C0133w c0133wM371h2 = c0134xM563b2.m371h();
                                    C0133w c0133wM371h3 = c0134x.m371h();
                                    c0133wM371h3.f461g = null;
                                    C0134x c0134xM369a = c0133wM371h3.m369a();
                                    if (c0134xM369a.f474g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    c0133wM371h2.f464j = c0134xM369a;
                                    c0134xM563b2 = c0133wM371h2.m369a();
                                }
                                c0134x = c0134xM563b2;
                                c0132vM38b = m38b(c0134x, c0190i.f695h);
                                if (c0132vM38b == null) {
                                    c0190i.m501g(false);
                                    return c0134x;
                                }
                                AbstractC0136z abstractC0136z2 = c0134x.f474g;
                                if (abstractC0136z2 != null) {
                                    AbstractC0145b.m391d(abstractC0136z2);
                                }
                                i2++;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                c0190i.m501g(true);
                            } catch (C0196o e3) {
                                if (!m39c(e3.f732a, c0190i, c0132vM38b, false)) {
                                    IOException iOException = e3.f733b;
                                    AbstractC0145b.m387B(iOException, c1215q);
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f733b;
                                ArrayList arrayList = new ArrayList(c1215q.size() + 1);
                                arrayList.addAll(c1215q);
                                arrayList.add(iOException2);
                                c0190i.m501g(true);
                                c1215q = arrayList;
                                z3 = false;
                            } catch (IOException e4) {
                                if (!m39c(e4, c0190i, c0132vM38b, !(e4 instanceof C0305a))) {
                                    AbstractC0145b.m387B(e4, c1215q);
                                    throw e4;
                                }
                                ArrayList arrayList2 = new ArrayList(c1215q.size() + 1);
                                arrayList2.addAll(c1215q);
                                arrayList2.add(e4);
                                c0190i.m501g(true);
                                c1215q = arrayList2;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            c0190i.m501g(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p011D1.C0132v m38b(p011D1.C0134x r12, p011D1.C0121k r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0009D.m38b(D1.x, D1.k):D1.v");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0084  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m39c(java.io.IOException r4, p021H1.C0190i r5, p011D1.C0132v r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f17b
            D1.t r6 = (p011D1.C0130t) r6
            boolean r6 = r6.f420f
            r0 = 0
            if (r6 != 0) goto Lb
            goto L9b
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L9b
            if (r7 != 0) goto L9b
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L9b
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            H1.e r4 = r5.f692e
            p131s1.AbstractC1326c.m3059b(r4)
            int r5 = r4.f675c
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f676d
            if (r7 != 0) goto L49
            int r7 = r4.f677e
            if (r7 != 0) goto L49
            r4 = r0
            goto L99
        L49:
            D1.A r7 = r4.f678f
            if (r7 == 0) goto L4e
            goto L84
        L4e:
            r7 = 0
            if (r5 > r6) goto L80
            int r5 = r4.f676d
            if (r5 > r6) goto L80
            int r5 = r4.f677e
            if (r5 <= 0) goto L5a
            goto L80
        L5a:
            H1.i r5 = r4.f681i
            H1.m r5 = r5.f693f
            if (r5 == 0) goto L80
            monitor-enter(r5)
            int r1 = r5.f721k     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L67
            monitor-exit(r5)
            goto L80
        L67:
            D1.A r1 = r5.f727q     // Catch: java.lang.Throwable -> L7d
            D1.a r1 = r1.f269a     // Catch: java.lang.Throwable -> L7d
            D1.p r1 = r1.f279a     // Catch: java.lang.Throwable -> L7d
            D1.a r2 = r4.f680h     // Catch: java.lang.Throwable -> L7d
            D1.p r2 = r2.f279a     // Catch: java.lang.Throwable -> L7d
            boolean r1 = p014E1.AbstractC0145b.m388a(r1, r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L79
            monitor-exit(r5)
            goto L80
        L79:
            D1.A r7 = r5.f727q     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)
            goto L80
        L7d:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L80:
            if (r7 == 0) goto L86
            r4.f678f = r7
        L84:
            r4 = r6
            goto L99
        L86:
            C0.f r5 = r4.f673a
            if (r5 == 0) goto L91
            boolean r5 = r5.m282b()
            if (r5 != r6) goto L91
            goto L84
        L91:
            H1.p r4 = r4.f674b
            if (r4 == 0) goto L84
            boolean r4 = r4.m528i()
        L99:
            if (r4 != 0) goto L9c
        L9b:
            return r0
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A1.C0009D.m39c(java.io.IOException, H1.i, D1.v, boolean):boolean");
    }

    public C0009D(C0112b c0112b) {
        AbstractC1326c.m3062e(c0112b, "cookieJar");
        this.f17b = c0112b;
    }

    public C0009D(C0130t c0130t) {
        AbstractC1326c.m3062e(c0130t, "client");
        this.f17b = c0130t;
    }
}
