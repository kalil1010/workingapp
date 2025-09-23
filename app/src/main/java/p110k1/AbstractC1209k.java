package p110k1;

import java.util.Collection;
import p131s1.AbstractC1326c;

/* renamed from: k1.k */
/* loaded from: classes.dex */
public abstract class AbstractC1209k extends AbstractC1208j {
    /* renamed from: x0 */
    public static int m2850x0(Iterable iterable) {
        AbstractC1326c.m3062e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
