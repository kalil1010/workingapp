package p030K1;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p019G1.AbstractC0167a;
import p047Q1.C0464f;
import p047Q1.C0467i;
import p050R1.C0482j;
import p131s1.AbstractC1326c;

/* renamed from: K1.g */
/* loaded from: classes.dex */
public final class C0311g extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f961e = 1;

    /* renamed from: f */
    public final /* synthetic */ long f962f;

    /* renamed from: g */
    public final /* synthetic */ Object f963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0311g(String str, long j2, C0464f c0464f) {
        super(str, true);
        this.f962f = j2;
        this.f963g = c0464f;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() throws IOException {
        C0320p c0320p;
        boolean z2;
        C0467i c0467i;
        switch (this.f961e) {
            case 0:
                synchronized (((C0320p) this.f963g)) {
                    c0320p = (C0320p) this.f963g;
                    long j2 = c0320p.f997m;
                    long j3 = c0320p.f996l;
                    if (j2 < j3) {
                        z2 = true;
                    } else {
                        c0320p.f996l = j3 + 1;
                        z2 = false;
                    }
                }
                if (z2) {
                    c0320p.m844g(2, 2, null);
                    return -1L;
                }
                try {
                    c0320p.f1008x.m876l(1, 0, false);
                } catch (IOException e3) {
                    c0320p.m844g(2, 2, e3);
                }
                return this.f962f;
            default:
                C0464f c0464f = (C0464f) this.f963g;
                synchronized (c0464f) {
                    try {
                        if (!c0464f.f1408o && (c0467i = c0464f.f1398e) != null) {
                            int i2 = c0464f.f1410q ? c0464f.f1409p : -1;
                            c0464f.f1409p++;
                            c0464f.f1410q = true;
                            if (i2 != -1) {
                                c0464f.m1148c(new SocketTimeoutException("sent ping but didn't receive pong within " + c0464f.f1413t + "ms (after " + (i2 - 1) + " successful ping/pongs)"));
                            } else {
                                try {
                                    C0482j c0482j = C0482j.f1481d;
                                    AbstractC1326c.m3062e(c0482j, "payload");
                                    c0467i.m1155g(9, c0482j);
                                } catch (IOException e4) {
                                    c0464f.m1148c(e4);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f962f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0311g(String str, C0320p c0320p, long j2) {
        super(str, true);
        this.f963g = c0320p;
        this.f962f = j2;
    }
}
