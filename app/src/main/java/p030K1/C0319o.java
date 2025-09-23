package p030K1;

import java.io.IOException;
import p019G1.AbstractC0167a;

/* renamed from: K1.o */
/* loaded from: classes.dex */
public final class C0319o extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ C0320p f981e;

    /* renamed from: f */
    public final /* synthetic */ int f982f;

    /* renamed from: g */
    public final /* synthetic */ long f983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319o(String str, C0320p c0320p, int i2, long j2) {
        super(str, true);
        this.f981e = c0320p;
        this.f982f = i2;
        this.f983g = j2;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() throws IOException {
        C0320p c0320p = this.f981e;
        try {
            c0320p.f1008x.m878n(this.f982f, this.f983g);
            return -1L;
        } catch (IOException e3) {
            c0320p.m844g(2, 2, e3);
            return -1L;
        }
    }
}
