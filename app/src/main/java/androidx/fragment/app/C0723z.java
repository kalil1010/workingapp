package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.C0653a;
import java.util.ArrayList;
import java.util.Iterator;
import p093e2.AbstractC0901d;
import p107j1.C1178a;
import p110k1.AbstractC1206h;
import p110k1.AbstractC1209k;
import p110k1.AbstractC1218t;
import p110k1.C1216r;

/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C0723z extends AbstractC0901d {

    /* renamed from: c */
    public final /* synthetic */ int f2680c;

    public /* synthetic */ C0723z(int i2) {
        this.f2680c = i2;
    }

    @Override // p093e2.AbstractC0901d
    /* renamed from: d0 */
    public final Object mo1766d0(int i2, Intent intent) {
        switch (this.f2680c) {
            case 0:
                return new C0653a(i2, intent);
            case 1:
                C1216r c1216r = C1216r.f4905a;
                if (i2 != -1 || intent == null) {
                    return c1216r;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c1216r;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList arrayListM2846q0 = AbstractC1206h.m2846q0(stringArrayExtra);
                Iterator it = arrayListM2846q0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1209k.m2850x0(arrayListM2846q0), AbstractC1209k.m2850x0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C1178a(it.next(), it2.next()));
                }
                return AbstractC1218t.m2853M(arrayList2);
            default:
                return new C0653a(i2, intent);
        }
    }
}
