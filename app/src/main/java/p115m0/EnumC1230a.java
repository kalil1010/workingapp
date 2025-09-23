package p115m0;

import java.util.regex.Pattern;
import p074Z1.AbstractC0618a;
import p093e2.AbstractC0901d;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public enum EnumC1230a {
    /* JADX INFO: Fake field, exist only in values array */
    VISA("VISA", "^4[0-9]{6,}$", "A0 00 00 00 03", "A0 00 00 00 03 10 10", "A0 00 00 00 98 08 48"),
    /* JADX INFO: Fake field, exist only in values array */
    MASTER_CARD("Master card", "^5[1-5][0-9]{5,}$", "A0 00 00 00 04", "A0 00 00 00 05"),
    /* JADX INFO: Fake field, exist only in values array */
    AMERICAN_EXPRESS("American express", "^3[47][0-9]{5,}$", "A0 00 00 00 25"),
    CB("CB", null, "A0 00 00 00 42"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK", null, "A0 00 00 00 29"),
    /* JADX INFO: Fake field, exist only in values array */
    JCB("JCB", "^(?:2131|1800|35[0-9]{3})[0-9]{3,}$", "A0 00 00 00 65"),
    /* JADX INFO: Fake field, exist only in values array */
    DANKORT("Dankort", null, "A0 00 00 01 21 10 10"),
    /* JADX INFO: Fake field, exist only in values array */
    COGEBAN("CoGeBan", null, "A0 00 00 01 41 00 01"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVER("Discover", "(6011|65|64[4-9]|622)[0-9]*", "A0 00 00 01 52 30 10"),
    /* JADX INFO: Fake field, exist only in values array */
    BANRISUL("Banrisul", null, "A0 00 00 01 54"),
    /* JADX INFO: Fake field, exist only in values array */
    SPAN("Saudi Payments Network", null, "A0 00 00 02 28"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERAC("Interac", null, "A0 00 00 02 77"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIP("Discover Card", null, "A0 00 00 03 24"),
    /* JADX INFO: Fake field, exist only in values array */
    UNIONPAY("UnionPay", "^62[0-9]{14,17}", "A0 00 00 03 33"),
    /* JADX INFO: Fake field, exist only in values array */
    EAPS("Euro Alliance of Payment Schemes", null, "A0 00 00 03 59"),
    /* JADX INFO: Fake field, exist only in values array */
    VERVE("Verve", null, "A0 00 00 03 71"),
    /* JADX INFO: Fake field, exist only in values array */
    TENN("The Exchange Network ATM Network", null, "A0 00 00 04 39"),
    /* JADX INFO: Fake field, exist only in values array */
    RUPAY("Rupay", null, "A0 00 00 05 24 10 10"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("ПРО100", null, "A0 00 00 04 32 00 01"),
    GELDKARTE("GeldKarte/ZKA", null, "D2 76 00 00 25 45 50 02 00", "D2 76 00 00 25 45 50 01 00", "D2 76 00 00 25"),
    /* JADX INFO: Fake field, exist only in values array */
    BANKAXEPT("Bankaxept", null, "D5 78 00 00 02 10 10"),
    /* JADX INFO: Fake field, exist only in values array */
    BRADESCO("BRADESCO", null, "F0 00 00 00 03 00 01"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDLAND("Midland", null, "A0 00 00 00 24 01"),
    /* JADX INFO: Fake field, exist only in values array */
    PBS("PBS", null, "A0 00 00 01 21 10 10"),
    /* JADX INFO: Fake field, exist only in values array */
    ETRANZACT("eTranzact", null, "A0 00 00 04 54"),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE("Google", null, "A0 00 00 04 76 6C"),
    /* JADX INFO: Fake field, exist only in values array */
    INTER_SWITCH("InterSwitch", null, "A0 00 00 03 71 00 01");


    /* renamed from: a */
    public final String[] f4940a;

    /* renamed from: b */
    public final byte[][] f4941b;

    /* renamed from: c */
    public final String f4942c;

    /* renamed from: d */
    public final Pattern f4943d;

    EnumC1230a(String str, String str2, String... strArr) {
        this.f4940a = strArr;
        this.f4941b = new byte[strArr.length][];
        for (int i2 = 0; i2 < this.f4940a.length; i2++) {
            this.f4941b[i2] = AbstractC0901d.m2314r(strArr[i2]);
        }
        this.f4942c = str;
        if (AbstractC0618a.m1420d(str2)) {
            this.f4943d = Pattern.compile(str2);
        } else {
            this.f4943d = null;
        }
    }

    /* renamed from: a */
    public static EnumC1230a m2867a(String str) {
        String strM1418b = AbstractC0618a.m1418b(str);
        EnumC1230a enumC1230a = null;
        for (EnumC1230a enumC1230a2 : values()) {
            String[] strArr = enumC1230a2.f4940a;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strM1418b.startsWith(AbstractC0618a.m1418b(strArr[i2]))) {
                    enumC1230a = enumC1230a2;
                    break;
                }
                i2++;
            }
        }
        return enumC1230a;
    }
}
