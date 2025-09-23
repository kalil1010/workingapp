package p127r0;

/* renamed from: r0.f */
/* loaded from: classes.dex */
public enum EnumC1289f implements InterfaceC1286c {
    /* JADX INFO: Fake field, exist only in values array */
    NO_RESTRICTION_PIN_REQUIRED(0),
    /* JADX INFO: Fake field, exist only in values array */
    NO_RESTRICTION(1),
    /* JADX INFO: Fake field, exist only in values array */
    GOODS_SERVICES(2),
    /* JADX INFO: Fake field, exist only in values array */
    ATM_ONLY(3),
    /* JADX INFO: Fake field, exist only in values array */
    CASH_ONLY(4),
    /* JADX INFO: Fake field, exist only in values array */
    GOODS_SERVICES_PIN_REQUIRED(5),
    /* JADX INFO: Fake field, exist only in values array */
    NO_RESTRICTION_PIN_IF_PED(6),
    /* JADX INFO: Fake field, exist only in values array */
    GOODS_SERVICES_PIN_IF_PED(7);


    /* renamed from: a */
    public final int f5455a;

    EnumC1289f(int i2) {
        this.f5455a = i2;
    }

    @Override // p127r0.InterfaceC1286c
    public final int getKey() {
        return this.f5455a;
    }
}
