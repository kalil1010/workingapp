package p074Z1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF172' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: Z1.c */
/* loaded from: classes.dex */
public final class EnumC0620c {

    /* renamed from: b */
    public static final /* synthetic */ EnumC0620c[] f1936b;

    /* renamed from: a */
    public final String f1937a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF3;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF4;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF5;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF6;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF7;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF8;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF9;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF12;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0620c EF172;

    static {
        EnumC0620c enumC0620c = new EnumC0620c("JAVA_0_9", 0, "0.9");
        EnumC0620c enumC0620c2 = new EnumC0620c("JAVA_1_1", 1, "1.1");
        EnumC0620c enumC0620c3 = new EnumC0620c("JAVA_1_2", 2, "1.2");
        EnumC0620c enumC0620c4 = new EnumC0620c("JAVA_1_3", 3, "1.3");
        EnumC0620c enumC0620c5 = new EnumC0620c("JAVA_1_4", 4, "1.4");
        EnumC0620c enumC0620c6 = new EnumC0620c("JAVA_1_5", 5, "1.5");
        EnumC0620c enumC0620c7 = new EnumC0620c("JAVA_1_6", 6, "1.6");
        EnumC0620c enumC0620c8 = new EnumC0620c("JAVA_1_7", 7, "1.7");
        EnumC0620c enumC0620c9 = new EnumC0620c("JAVA_1_8", 8, "1.8");
        EnumC0620c enumC0620c10 = new EnumC0620c("JAVA_1_9", 9, "9");
        EnumC0620c enumC0620c11 = new EnumC0620c("JAVA_9", 10, "9");
        EnumC0620c enumC0620c12 = new EnumC0620c("JAVA_10", 11, "10");
        EnumC0620c enumC0620c13 = new EnumC0620c("JAVA_11", 12, "11");
        m1425a(System.getProperty("java.specification.version", "99.0"));
        float fM1425a = m1425a(System.getProperty("java.specification.version", "99.0"));
        f1936b = new EnumC0620c[]{enumC0620c, enumC0620c2, enumC0620c3, enumC0620c4, enumC0620c5, enumC0620c6, enumC0620c7, enumC0620c8, enumC0620c9, enumC0620c10, enumC0620c11, enumC0620c12, enumC0620c13, new EnumC0620c("JAVA_RECENT", 13, Float.toString(fM1425a <= 0.0f ? 99.0f : fM1425a))};
    }

    public EnumC0620c(String str, int i2, String str2) {
        this.f1937a = str2;
    }

    /* renamed from: a */
    public static float m1425a(String str) {
        if (!str.contains(".")) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
                return -1.0f;
            }
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[0] + '.' + strArrSplit[1];
            if (str2 != null) {
                try {
                    return Float.parseFloat(str2);
                } catch (NumberFormatException unused2) {
                }
            }
        }
        return -1.0f;
    }

    public static EnumC0620c valueOf(String str) {
        return (EnumC0620c) Enum.valueOf(EnumC0620c.class, str);
    }

    public static EnumC0620c[] values() {
        return (EnumC0620c[]) f1936b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1937a;
    }
}
