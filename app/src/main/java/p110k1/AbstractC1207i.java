package p110k1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p033L1.AbstractC0356d;
import p093e2.AbstractC0901d;
import p131s1.AbstractC1326c;

/* renamed from: k1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1207i extends AbstractC1213o {
    /* renamed from: A0 */
    public static List m2847A0(List list) {
        AbstractC1326c.m3062e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : AbstractC0901d.m2287T(list.get(0)) : C1215q.f4904a;
    }

    /* renamed from: z0 */
    public static final void m2848z0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, C1199a c1199a) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            AbstractC0356d.m952b(sb, obj, c1199a);
        }
        sb.append(charSequence3);
    }
}
