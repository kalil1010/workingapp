package p118n1;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1237a {

    /* renamed from: a */
    public static final Integer f4965a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f4965a = num;
    }
}
