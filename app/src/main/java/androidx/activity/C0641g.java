package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0653a;
import androidx.activity.result.C0654b;
import androidx.fragment.app.C0719v;
import java.util.ArrayList;
import java.util.HashMap;
import p002A1.C0019a;
import p093e2.AbstractC0901d;
import p134t1.AbstractC1350a;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final class C0641g {

    /* renamed from: a */
    public final HashMap f1986a = new HashMap();

    /* renamed from: b */
    public final HashMap f1987b = new HashMap();

    /* renamed from: c */
    public final HashMap f1988c = new HashMap();

    /* renamed from: d */
    public ArrayList f1989d = new ArrayList();

    /* renamed from: e */
    public final transient HashMap f1990e = new HashMap();

    /* renamed from: f */
    public final HashMap f1991f = new HashMap();

    /* renamed from: g */
    public final Bundle f1992g = new Bundle();

    /* renamed from: a */
    public final boolean m1446a(int i2, int i3, Intent intent) {
        String str = (String) this.f1986a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0654b c0654b = (C0654b) this.f1990e.get(str);
        if (c0654b != null) {
            C0719v c0719v = c0654b.f2029a;
            if (this.f1989d.contains(str)) {
                c0719v.m1762a(c0654b.f2030b.mo1766d0(i3, intent));
                this.f1989d.remove(str);
                return true;
            }
        }
        this.f1991f.remove(str);
        this.f1992g.putParcelable(str, new C0653a(i3, intent));
        return true;
    }

    /* renamed from: b */
    public final C0019a m1447b(String str, AbstractC0901d abstractC0901d, C0719v c0719v) {
        int i2;
        HashMap map;
        HashMap map2 = this.f1987b;
        if (((Integer) map2.get(str)) == null) {
            int iM3112b = AbstractC1350a.f5719a.m3112b();
            while (true) {
                i2 = iM3112b + 65536;
                map = this.f1986a;
                if (!map.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                iM3112b = AbstractC1350a.f5719a.m3112b();
            }
            map.put(Integer.valueOf(i2), str);
            map2.put(str, Integer.valueOf(i2));
        }
        this.f1990e.put(str, new C0654b(c0719v, abstractC0901d));
        HashMap map3 = this.f1991f;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c0719v.m1762a(obj);
        }
        Bundle bundle = this.f1992g;
        C0653a c0653a = (C0653a) bundle.getParcelable(str);
        if (c0653a != null) {
            bundle.remove(str);
            c0719v.m1762a(abstractC0901d.mo1766d0(c0653a.f2027a, c0653a.f2028b));
        }
        return new C0019a(this, str, 10, false);
    }
}
