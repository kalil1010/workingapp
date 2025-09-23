package p030K1;

import java.io.IOException;
import java.util.List;
import p019G1.AbstractC0167a;

/* renamed from: K1.m */
/* loaded from: classes.dex */
public final class C0317m extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f974e = 1;

    /* renamed from: f */
    public final /* synthetic */ C0320p f975f;

    /* renamed from: g */
    public final /* synthetic */ int f976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317m(String str, C0320p c0320p, int i2, List list) {
        super(str, true);
        this.f975f = c0320p;
        this.f976g = i2;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() {
        switch (this.f974e) {
            case 0:
                this.f975f.f995k.getClass();
                try {
                    this.f975f.f1008x.m877m(this.f976g, 9);
                    synchronized (this.f975f) {
                        this.f975f.f1010z.remove(Integer.valueOf(this.f976g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f975f.f995k.getClass();
                try {
                    this.f975f.f1008x.m877m(this.f976g, 9);
                    synchronized (this.f975f) {
                        this.f975f.f1010z.remove(Integer.valueOf(this.f976g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317m(String str, C0320p c0320p, int i2, List list, boolean z2) {
        super(str, true);
        this.f975f = c0320p;
        this.f976g = i2;
    }
}
