package androidx.fragment.app;

import androidx.activity.result.C0653a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class C0719v {

    /* renamed from: a */
    public final /* synthetic */ int f2671a;

    /* renamed from: b */
    public final /* synthetic */ C0686D f2672b;

    public /* synthetic */ C0719v(C0686D c0686d, int i2) {
        this.f2671a = i2;
        this.f2672b = c0686d;
    }

    /* renamed from: a */
    public final void m1762a(Object obj) {
        switch (this.f2671a) {
            case 0:
                C0653a c0653a = (C0653a) obj;
                C0686D c0686d = this.f2672b;
                C0683A c0683a = (C0683A) c0686d.f2468w.pollFirst();
                if (c0683a != null) {
                    AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM139w = c0686d.f2448c.m139w(c0683a.f2435a);
                    if (abstractComponentCallbacksC0712oM139w != null) {
                        int i2 = c0653a.f2027a;
                        if (C0686D.m1646D(2)) {
                            abstractComponentCallbacksC0712oM139w.toString();
                            Objects.toString(c0653a.f2028b);
                            break;
                        }
                    }
                }
                break;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
                }
                C0686D c0686d2 = this.f2672b;
                C0683A c0683a2 = (C0683A) c0686d2.f2468w.pollFirst();
                if (c0683a2 != null) {
                    c0686d2.f2448c.m139w(c0683a2.f2435a);
                    break;
                }
                break;
            default:
                C0653a c0653a2 = (C0653a) obj;
                C0686D c0686d3 = this.f2672b;
                C0683A c0683a3 = (C0683A) c0686d3.f2468w.pollFirst();
                if (c0683a3 != null) {
                    AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM139w2 = c0686d3.f2448c.m139w(c0683a3.f2435a);
                    if (abstractComponentCallbacksC0712oM139w2 != null) {
                        int i4 = c0653a2.f2027a;
                        if (C0686D.m1646D(2)) {
                            abstractComponentCallbacksC0712oM139w2.toString();
                            Objects.toString(c0653a2.f2028b);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
