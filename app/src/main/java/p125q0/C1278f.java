package p125q0;

import java.util.ArrayList;
import p115m0.EnumC1230a;

/* renamed from: q0.f */
/* loaded from: classes.dex */
public final class C1278f extends AbstractC1274b {

    /* renamed from: b */
    public EnumC1230a f5198b;

    /* renamed from: c */
    public C1280h f5199c;

    /* renamed from: d */
    public C1279g f5200d;

    /* renamed from: e */
    public final ArrayList f5201e = new ArrayList();

    /* renamed from: a */
    public final String m2973a() {
        C1279g c1279g;
        C1280h c1280h = this.f5199c;
        String str = c1280h != null ? c1280h.f5204b : null;
        return (str != null || (c1279g = this.f5200d) == null) ? str : c1279g.f5202b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1278f) && m2973a() != null && m2973a().equals(((C1278f) obj).m2973a());
    }
}
