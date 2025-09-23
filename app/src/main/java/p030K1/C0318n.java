package p030K1;

import java.io.IOException;
import p006C.AbstractC0075g;
import p019G1.AbstractC0167a;

/* renamed from: K1.n */
/* loaded from: classes.dex */
public final class C0318n extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f977e;

    /* renamed from: f */
    public final /* synthetic */ Object f978f;

    /* renamed from: g */
    public final /* synthetic */ int f979g;

    /* renamed from: h */
    public final /* synthetic */ int f980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0318n(String str, Object obj, int i2, int i3, int i4) {
        super(str, true);
        this.f977e = i4;
        this.f978f = obj;
        this.f979g = i2;
        this.f980h = i3;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() throws IOException {
        switch (this.f977e) {
            case 0:
                C0302A c0302a = ((C0320p) this.f978f).f995k;
                int i2 = this.f980h;
                c0302a.getClass();
                AbstractC0075g.m240i("errorCode", i2);
                synchronized (((C0320p) this.f978f)) {
                    ((C0320p) this.f978f).f1010z.remove(Integer.valueOf(this.f979g));
                }
                return -1L;
            case 1:
                C0320p c0320p = (C0320p) this.f978f;
                try {
                    int i3 = this.f979g;
                    int i4 = this.f980h;
                    c0320p.getClass();
                    AbstractC0075g.m240i("statusCode", i4);
                    c0320p.f1008x.m877m(i3, i4);
                    return -1L;
                } catch (IOException e3) {
                    c0320p.m844g(2, 2, e3);
                    return -1L;
                }
            default:
                C0320p c0320p2 = ((C0315k) this.f978f).f969b;
                int i5 = this.f979g;
                int i6 = this.f980h;
                c0320p2.getClass();
                try {
                    c0320p2.f1008x.m876l(i5, i6, true);
                    return -1L;
                } catch (IOException e4) {
                    c0320p2.m844g(2, 2, e4);
                    return -1L;
                }
        }
    }
}
