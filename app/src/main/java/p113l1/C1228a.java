package p113l1;

import java.util.Comparator;
import p131s1.AbstractC1326c;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C1228a implements Comparator {

    /* renamed from: b */
    public static final C1228a f4933b = new C1228a(0);

    /* renamed from: c */
    public static final C1228a f4934c = new C1228a(1);

    /* renamed from: a */
    public final /* synthetic */ int f4935a;

    public /* synthetic */ C1228a(int i2) {
        this.f4935a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4935a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1326c.m3062e(comparable, "a");
                AbstractC1326c.m3062e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1326c.m3062e(comparable3, "a");
                AbstractC1326c.m3062e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f4935a) {
            case 0:
                return f4934c;
            default:
                return f4933b;
        }
    }
}
