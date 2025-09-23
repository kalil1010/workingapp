package p011D1;

/* renamed from: D1.u */
/* loaded from: classes.dex */
public enum EnumC0131u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a */
    public final String f448a;

    EnumC0131u(String str) {
        this.f448a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f448a;
    }
}
