package p110k1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p131s1.AbstractC1326c;

/* renamed from: k1.o */
/* loaded from: classes.dex */
public abstract class AbstractC1213o extends AbstractC1212n {
    /* renamed from: y0 */
    public static void m2851y0(List list, Iterable iterable) {
        AbstractC1326c.m3062e(list, "<this>");
        AbstractC1326c.m3062e(iterable, "elements");
        if (iterable instanceof Collection) {
            list.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
    }
}
