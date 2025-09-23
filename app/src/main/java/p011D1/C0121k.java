package p011D1;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.C0673l;
import androidx.emoji2.text.C0677p;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p012E.InterfaceMenuItemC0137a;
import p014E1.AbstractC0145b;
import p014E1.ThreadFactoryC0144a;
import p021H1.C0186e;
import p021H1.C0190i;
import p021H1.C0193l;
import p021H1.C0194m;
import p021H1.RunnableC0187f;
import p024I1.InterfaceC0210d;
import p025J.C0214a;
import p030K1.C0304C;
import p030K1.C0305a;
import p033L1.AbstractC0364l;
import p050R1.C0488p;
import p050R1.C0489q;
import p063W.C0551a;
import p063W.C0552b;
import p093e2.AbstractC0901d;
import p099h.AbstractC0971a;
import p099h.C0976f;
import p102i.MenuC0991B;
import p102i.MenuC1006l;
import p102i.MenuItemC1013s;
import p110k1.C1216r;
import p119o.C1240b;
import p119o.C1243e;
import p119o.C1249k;
import p131s1.AbstractC1326c;
import p149y1.AbstractC1411i;

/* renamed from: D1.k */
/* loaded from: classes.dex */
public final class C0121k {

    /* renamed from: a */
    public Object f352a;

    /* renamed from: b */
    public Object f353b;

    /* renamed from: c */
    public Object f354c;

    /* renamed from: d */
    public Object f355d;

    public C0121k(int i2) {
        switch (i2) {
            case 1:
                this.f355d = new LinkedHashMap();
                this.f353b = "GET";
                this.f354c = new C0004c(8);
                break;
            case 5:
                this.f352a = new C1240b();
                this.f353b = new SparseArray();
                this.f354c = new C1243e();
                this.f355d = new C1240b();
                break;
            case 6:
                this.f352a = new C0214a(10);
                this.f353b = new C1249k();
                this.f354c = new ArrayList();
                this.f355d = new HashSet();
                break;
            default:
                this.f353b = new ArrayDeque();
                this.f354c = new ArrayDeque();
                this.f355d = new ArrayDeque();
                break;
        }
    }

    /* renamed from: a */
    public IOException m333a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            m347o(iOException);
        }
        C0190i c0190i = (C0190i) this.f353b;
        if (z3) {
            if (iOException != null) {
                AbstractC1326c.m3062e(c0190i, "call");
            } else {
                AbstractC1326c.m3062e(c0190i, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                AbstractC1326c.m3062e(c0190i, "call");
            } else {
                AbstractC1326c.m3062e(c0190i, "call");
            }
        }
        return c0190i.m503i(this, z3, z2, iOException);
    }

    /* renamed from: b */
    public C0132v m334b() {
        Map mapUnmodifiableMap;
        C0126p c0126p = (C0126p) this.f352a;
        if (c0126p == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f353b;
        C0124n c0124nM29p = ((C0004c) this.f354c).m29p();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f355d;
        byte[] bArr = AbstractC0145b.f495a;
        AbstractC1326c.m3062e(linkedHashMap, "$this$toImmutableMap");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C1216r.f4905a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1326c.m3061d(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return new C0132v(c0126p, str, c0124nM29p, null, mapUnmodifiableMap);
    }

    /* renamed from: c */
    public void m335c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1249k) this.f353b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m335c(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: d */
    public synchronized ExecutorService m336d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f352a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = AbstractC0145b.f501g + " Dispatcher";
                AbstractC1326c.m3062e(str, "name");
                this.f352a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0144a(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f352a;
            AbstractC1326c.m3059b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* renamed from: e */
    public void m337e(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m345m();
    }

    /* renamed from: f */
    public void m338f(RunnableC0187f runnableC0187f) {
        runnableC0187f.f682a.decrementAndGet();
        m337e((ArrayDeque) this.f354c, runnableC0187f);
    }

    /* renamed from: g */
    public C0976f m339g(AbstractC0971a abstractC0971a) {
        ArrayList arrayList = (ArrayList) this.f354c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0976f c0976f = (C0976f) arrayList.get(i2);
            if (c0976f != null && c0976f.f4082b == abstractC0971a) {
                return c0976f;
            }
        }
        C0976f c0976f2 = new C0976f((Context) this.f353b, abstractC0971a);
        arrayList.add(c0976f2);
        return c0976f2;
    }

    /* renamed from: h */
    public void m340h(String str, String str2) {
        AbstractC1326c.m3062e(str2, "value");
        C0004c c0004c = (C0004c) this.f354c;
        c0004c.getClass();
        AbstractC0901d.m2293e(str);
        AbstractC0901d.m2297g(str2, str);
        c0004c.m34u(str);
        c0004c.m28o(str, str2);
    }

    /* renamed from: i */
    public void m341i(String str, AbstractC0901d abstractC0901d) {
        AbstractC1326c.m3062e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0901d == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0075g.m238g("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC0901d.m2294e0(str)) {
            throw new IllegalArgumentException(AbstractC0075g.m238g("method ", str, " must not have a request body.").toString());
        }
        this.f353b = str;
    }

    /* renamed from: j */
    public C0193l m342j() throws SocketException {
        C0190i c0190i = (C0190i) this.f353b;
        if (c0190i.f694g) {
            throw new IllegalStateException("Check failed.");
        }
        c0190i.f694g = true;
        c0190i.f689b.m1163j();
        C0194m c0194mMo527h = ((InterfaceC0210d) this.f355d).mo527h();
        c0194mMo527h.getClass();
        Socket socket = c0194mMo527h.f713c;
        AbstractC1326c.m3059b(socket);
        C0489q c0489q = c0194mMo527h.f717g;
        AbstractC1326c.m3059b(c0489q);
        C0488p c0488p = c0194mMo527h.f718h;
        AbstractC1326c.m3059b(c0488p);
        socket.setSoTimeout(0);
        c0194mMo527h.m516k();
        return new C0193l(this, c0489q, c0488p);
    }

    /* renamed from: k */
    public boolean m343k(AbstractC0971a abstractC0971a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f352a).onActionItemClicked(m339g(abstractC0971a), new MenuItemC1013s((Context) this.f353b, (InterfaceMenuItemC0137a) menuItem));
    }

    /* renamed from: l */
    public boolean m344l(AbstractC0971a abstractC0971a, MenuC1006l menuC1006l) {
        C0976f c0976fM339g = m339g(abstractC0971a);
        C1249k c1249k = (C1249k) this.f355d;
        Menu menuC0991B = (Menu) c1249k.getOrDefault(menuC1006l, null);
        if (menuC0991B == null) {
            menuC0991B = new MenuC0991B((Context) this.f353b, menuC1006l);
            c1249k.put(menuC1006l, menuC0991B);
        }
        return ((ActionMode.Callback) this.f352a).onCreateActionMode(c0976fM339g, menuC0991B);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m345m() {
        /*
            r8 = this;
            byte[] r0 = p014E1.AbstractC0145b.f495a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.f353b     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            p131s1.AbstractC1326c.m3061d(r1, r2)     // Catch: java.lang.Throwable -> L4b
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4b
            H1.f r2 = (p021H1.RunnableC0187f) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r8.f354c     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L4b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4b
            r4 = 64
            if (r3 < r4) goto L2e
            goto L4d
        L2e:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f682a     // Catch: java.lang.Throwable -> L4b
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L4b
            r4 = 5
            if (r3 < r4) goto L38
            goto L15
        L38:
            r1.remove()     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f682a     // Catch: java.lang.Throwable -> L4b
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L4b
            r0.add(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r8.f354c     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L4b
            r3.add(r2)     // Catch: java.lang.Throwable -> L4b
            goto L15
        L4b:
            r0 = move-exception
            goto Laa
        L4d:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r8.f354c     // Catch: java.lang.Throwable -> La7
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La7
            r1.size()     // Catch: java.lang.Throwable -> La7
            java.lang.Object r1 = r8.f355d     // Catch: java.lang.Throwable -> La7
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La7
            r1.size()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L63:
            if (r2 >= r1) goto La6
            java.lang.Object r3 = r0.get(r2)
            H1.f r3 = (p021H1.RunnableC0187f) r3
            java.util.concurrent.ExecutorService r4 = r8.m336d()
            r3.getClass()
            H1.i r5 = r3.f684c
            D1.t r6 = r5.f702o
            D1.k r6 = r6.f415a
            byte[] r6 = p014E1.AbstractC0145b.f495a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L80 java.lang.Throwable -> L9d
            r4.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L80 java.lang.Throwable -> L9d
            goto L9a
        L80:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L9d
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L9d
            r5.m504j(r6)     // Catch: java.lang.Throwable -> L9d
            D1.d r4 = r3.f683b     // Catch: java.lang.Throwable -> L9d
            r4.mo25l(r5, r6)     // Catch: java.lang.Throwable -> L9d
            D1.t r4 = r5.f702o
            D1.k r4 = r4.f415a
            r4.m338f(r3)
        L9a:
            int r2 = r2 + 1
            goto L63
        L9d:
            r0 = move-exception
            D1.t r1 = r5.f702o
            D1.k r1 = r1.f415a
            r1.m338f(r3)
            throw r0
        La6:
            return
        La7:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> L4b
        Laa:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011D1.C0121k.m345m():void");
    }

    /* renamed from: n */
    public C0133w m346n(boolean z2) throws IOException {
        try {
            C0133w c0133wMo524e = ((InterfaceC0210d) this.f355d).mo524e(z2);
            if (c0133wMo524e != null) {
                c0133wMo524e.f467m = this;
            }
            return c0133wMo524e;
        } catch (IOException e3) {
            AbstractC1326c.m3062e((C0190i) this.f353b, "call");
            m347o(e3);
            throw e3;
        }
    }

    /* renamed from: o */
    public void m347o(IOException iOException) {
        ((C0186e) this.f354c).m491c(iOException);
        C0194m c0194mMo527h = ((InterfaceC0210d) this.f355d).mo527h();
        C0190i c0190i = (C0190i) this.f353b;
        synchronized (c0194mMo527h) {
            try {
                AbstractC1326c.m3062e(c0190i, "call");
                if (!(iOException instanceof C0304C)) {
                    if (!(c0194mMo527h.f716f != null) || (iOException instanceof C0305a)) {
                        c0194mMo527h.f719i = true;
                        if (c0194mMo527h.f722l == 0) {
                            C0194m.m506d(c0190i.f702o, c0194mMo527h.f727q, iOException);
                            c0194mMo527h.f721k++;
                        }
                    }
                } else if (((C0304C) iOException).f930a == 8) {
                    int i2 = c0194mMo527h.f723m + 1;
                    c0194mMo527h.f723m = i2;
                    if (i2 > 1) {
                        c0194mMo527h.f719i = true;
                        c0194mMo527h.f721k++;
                    }
                } else if (((C0304C) iOException).f930a != 9 || !c0190i.f699l) {
                    c0194mMo527h.f719i = true;
                    c0194mMo527h.f721k++;
                }
            } finally {
            }
        }
    }

    /* renamed from: p */
    public void m348p(String str) {
        AbstractC1326c.m3062e(str, "url");
        if (AbstractC1411i.m3188c0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            AbstractC1326c.m3061d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (AbstractC1411i.m3188c0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            AbstractC1326c.m3061d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        AbstractC1326c.m3062e(str, "$this$toHttpUrl");
        C0125o c0125o = new C0125o();
        c0125o.m357c(null, str);
        this.f352a = c0125o.m355a();
    }

    public C0121k(Typeface typeface, C0552b c0552b) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f355d = typeface;
        this.f352a = c0552b;
        this.f354c = new C0677p(1024);
        int iM610a = c0552b.m610a(6);
        if (iM610a != 0) {
            int i6 = iM610a + c0552b.f803a;
            i2 = ((ByteBuffer) c0552b.f806d).getInt(((ByteBuffer) c0552b.f806d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f353b = new char[i2 * 2];
        int iM610a2 = c0552b.m610a(6);
        if (iM610a2 != 0) {
            int i7 = iM610a2 + c0552b.f803a;
            i3 = ((ByteBuffer) c0552b.f806d).getInt(((ByteBuffer) c0552b.f806d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            C0673l c0673l = new C0673l(this, i8);
            C0551a c0551aM1632b = c0673l.m1632b();
            int iM610a3 = c0551aM1632b.m610a(4);
            Character.toChars(iM610a3 != 0 ? ((ByteBuffer) c0551aM1632b.f806d).getInt(iM610a3 + c0551aM1632b.f803a) : 0, (char[]) this.f353b, i8 * 2);
            C0551a c0551aM1632b2 = c0673l.m1632b();
            int iM610a4 = c0551aM1632b2.m610a(16);
            if (iM610a4 != 0) {
                int i9 = iM610a4 + c0551aM1632b2.f803a;
                i4 = ((ByteBuffer) c0551aM1632b2.f806d).getInt(((ByteBuffer) c0551aM1632b2.f806d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            AbstractC0364l.m1008o("invalid metadata codepoint length", i4 > 0);
            C0551a c0551aM1632b3 = c0673l.m1632b();
            int iM610a5 = c0551aM1632b3.m610a(16);
            if (iM610a5 != 0) {
                int i10 = iM610a5 + c0551aM1632b3.f803a;
                i5 = ((ByteBuffer) c0551aM1632b3.f806d).getInt(((ByteBuffer) c0551aM1632b3.f806d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            ((C0677p) this.f354c).m1638a(c0673l, 0, i5 - 1);
        }
    }
}
