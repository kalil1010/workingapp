package p024I1;

import java.util.regex.Pattern;
import p011D1.AbstractC0136z;
import p011D1.C0128r;
import p033L1.AbstractC0356d;
import p050R1.C0489q;
import p050R1.InterfaceC0481i;

/* renamed from: I1.g */
/* loaded from: classes.dex */
public final class C0213g extends AbstractC0136z {

    /* renamed from: a */
    public final String f776a;

    /* renamed from: b */
    public final long f777b;

    /* renamed from: c */
    public final C0489q f778c;

    public C0213g(String str, long j2, C0489q c0489q) {
        this.f776a = str;
        this.f777b = j2;
        this.f778c = c0489q;
    }

    @Override // p011D1.AbstractC0136z
    /* renamed from: g */
    public final long mo372g() {
        return this.f777b;
    }

    @Override // p011D1.AbstractC0136z
    /* renamed from: h */
    public final C0128r mo373h() {
        String str = this.f776a;
        if (str == null) {
            return null;
        }
        Pattern pattern = C0128r.f381c;
        try {
            return AbstractC0356d.m968r(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p011D1.AbstractC0136z
    /* renamed from: i */
    public final InterfaceC0481i mo374i() {
        return this.f778c;
    }
}
