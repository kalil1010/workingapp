package p047Q1;

import java.io.IOException;
import p019G1.AbstractC0167a;
import p021H1.C0190i;
import p131s1.AbstractC1326c;

/* renamed from: Q1.e */
/* loaded from: classes.dex */
public final class C0463e extends AbstractC0167a {

    /* renamed from: e */
    public final /* synthetic */ int f1391e = 0;

    /* renamed from: f */
    public final /* synthetic */ C0464f f1392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463e(String str, C0464f c0464f) {
        super(str, true);
        this.f1392f = c0464f;
    }

    @Override // p019G1.AbstractC0167a
    /* renamed from: a */
    public final long mo465a() {
        switch (this.f1391e) {
            case 0:
                C0464f c0464f = this.f1392f;
                try {
                    if (c0464f.m1152g()) {
                    }
                } catch (IOException e3) {
                    c0464f.m1148c(e3);
                    break;
                }
                break;
            default:
                C0190i c0190i = this.f1392f.f1395b;
                AbstractC1326c.m3059b(c0190i);
                c0190i.m498d();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463e(C0464f c0464f) {
        super(c0464f.f1400g + " writer", true);
        this.f1392f = c0464f;
    }
}
