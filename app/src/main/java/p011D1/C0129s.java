package p011D1;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001A0.C0004c;
import p033L1.AbstractC0364l;
import p044P1.C0435c;
import p055T0.C0511e;
import p131s1.AbstractC1326c;

/* renamed from: D1.s */
/* loaded from: classes.dex */
public final class C0129s {

    /* renamed from: A */
    public C0004c f385A;

    /* renamed from: a */
    public C0121k f386a = new C0121k(0);

    /* renamed from: b */
    public C0004c f387b = new C0004c(7);

    /* renamed from: c */
    public final ArrayList f388c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f389d = new ArrayList();

    /* renamed from: e */
    public C0511e f390e = new C0511e(2);

    /* renamed from: f */
    public boolean f391f = true;

    /* renamed from: g */
    public C0112b f392g;

    /* renamed from: h */
    public boolean f393h;

    /* renamed from: i */
    public boolean f394i;

    /* renamed from: j */
    public C0112b f395j;

    /* renamed from: k */
    public C0112b f396k;

    /* renamed from: l */
    public ProxySelector f397l;

    /* renamed from: m */
    public C0112b f398m;

    /* renamed from: n */
    public SocketFactory f399n;

    /* renamed from: o */
    public SSLSocketFactory f400o;

    /* renamed from: p */
    public X509TrustManager f401p;

    /* renamed from: q */
    public List f402q;

    /* renamed from: r */
    public List f403r;

    /* renamed from: s */
    public C0435c f404s;

    /* renamed from: t */
    public C0115e f405t;

    /* renamed from: u */
    public AbstractC0364l f406u;

    /* renamed from: v */
    public int f407v;

    /* renamed from: w */
    public int f408w;

    /* renamed from: x */
    public int f409x;

    /* renamed from: y */
    public int f410y;

    /* renamed from: z */
    public long f411z;

    public C0129s() {
        C0112b c0112b = C0112b.f289a;
        this.f392g = c0112b;
        this.f393h = true;
        this.f394i = true;
        this.f395j = C0112b.f290b;
        this.f396k = C0112b.f291c;
        this.f398m = c0112b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1326c.m3061d(socketFactory, "SocketFactory.getDefault()");
        this.f399n = socketFactory;
        this.f402q = C0130t.f413C;
        this.f403r = C0130t.f412B;
        this.f404s = C0435c.f1323a;
        this.f405t = C0115e.f306c;
        this.f407v = 10000;
        this.f408w = 10000;
        this.f409x = 10000;
        this.f411z = 1024L;
    }
}
