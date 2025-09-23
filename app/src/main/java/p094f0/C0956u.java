package p094f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.u */
/* loaded from: classes.dex */
public final class C0956u {

    /* renamed from: a */
    public boolean f3998a;

    /* renamed from: b */
    public int f3999b;

    /* renamed from: c */
    public int f4000c;

    /* renamed from: d */
    public int f4001d;

    /* renamed from: e */
    public int f4002e;

    /* renamed from: f */
    public int f4003f;

    /* renamed from: g */
    public int f4004g;

    /* renamed from: h */
    public int f4005h;

    /* renamed from: i */
    public int f4006i;

    /* renamed from: j */
    public int f4007j;

    /* renamed from: k */
    public List f4008k;

    /* renamed from: l */
    public boolean f4009l;

    /* renamed from: a */
    public final void m2462a(View view) {
        int iM2395b;
        int size = this.f4008k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((AbstractC0926Z) this.f4008k.get(i3)).f3815a;
            C0912K c0912k = (C0912K) view3.getLayoutParams();
            if (view3 != view && !c0912k.f3767a.m2401h() && (iM2395b = (c0912k.f3767a.m2395b() - this.f4001d) * this.f4002e) >= 0 && iM2395b < i2) {
                view2 = view3;
                if (iM2395b == 0) {
                    break;
                } else {
                    i2 = iM2395b;
                }
            }
        }
        if (view2 == null) {
            this.f4001d = -1;
        } else {
            this.f4001d = ((C0912K) view2.getLayoutParams()).f3767a.m2395b();
        }
    }

    /* renamed from: b */
    public final View m2463b(C0917P c0917p) {
        List list = this.f4008k;
        if (list == null) {
            View view = c0917p.m2386i(this.f4001d, Long.MAX_VALUE).f3815a;
            this.f4001d += this.f4002e;
            return view;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = ((AbstractC0926Z) this.f4008k.get(i2)).f3815a;
            C0912K c0912k = (C0912K) view2.getLayoutParams();
            if (!c0912k.f3767a.m2401h() && this.f4001d == c0912k.f3767a.m2395b()) {
                m2462a(view2);
                return view2;
            }
        }
        return null;
    }
}
