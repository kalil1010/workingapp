package p106j0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p011D1.C0121k;
import p080b1.C0767e;
import p093e2.AbstractC0901d;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public final class C1152a extends AbstractC1164m {

    /* renamed from: A */
    public ArrayList f4718A;

    /* renamed from: B */
    public boolean f4719B;

    /* renamed from: C */
    public int f4720C;

    /* renamed from: D */
    public boolean f4721D;

    /* renamed from: E */
    public int f4722E;

    @Override // p106j0.AbstractC1164m
    /* renamed from: A */
    public final void mo2775A(long j2) {
        ArrayList arrayList;
        this.f4760c = j2;
        if (j2 < 0 || (arrayList = this.f4718A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2775A(j2);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: B */
    public final void mo2776B(AbstractC0901d abstractC0901d) {
        this.f4722E |= 8;
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2776B(abstractC0901d);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: C */
    public final void mo2777C(TimeInterpolator timeInterpolator) {
        this.f4722E |= 1;
        ArrayList arrayList = this.f4718A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1164m) this.f4718A.get(i2)).mo2777C(timeInterpolator);
            }
        }
        this.f4761d = timeInterpolator;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: D */
    public final void mo2778D(C0767e c0767e) {
        super.mo2778D(c0767e);
        this.f4722E |= 4;
        if (this.f4718A != null) {
            for (int i2 = 0; i2 < this.f4718A.size(); i2++) {
                ((AbstractC1164m) this.f4718A.get(i2)).mo2778D(c0767e);
            }
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: E */
    public final void mo2779E() {
        this.f4722E |= 2;
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2779E();
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: F */
    public final void mo2780F(long j2) {
        this.f4759b = j2;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: H */
    public final String mo2781H(String str) {
        String strMo2781H = super.mo2781H(str);
        for (int i2 = 0; i2 < this.f4718A.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo2781H);
            sb.append("\n");
            sb.append(((AbstractC1164m) this.f4718A.get(i2)).mo2781H(str + "  "));
            strMo2781H = sb.toString();
        }
        return strMo2781H;
    }

    /* renamed from: I */
    public final void m2782I(AbstractC1164m abstractC1164m) {
        this.f4718A.add(abstractC1164m);
        abstractC1164m.f4766i = this;
        long j2 = this.f4760c;
        if (j2 >= 0) {
            abstractC1164m.mo2775A(j2);
        }
        if ((this.f4722E & 1) != 0) {
            abstractC1164m.mo2777C(this.f4761d);
        }
        if ((this.f4722E & 2) != 0) {
            abstractC1164m.mo2779E();
        }
        if ((this.f4722E & 4) != 0) {
            abstractC1164m.mo2778D(this.f4779v);
        }
        if ((this.f4722E & 8) != 0) {
            abstractC1164m.mo2776B(null);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: c */
    public final void mo2783c() {
        super.mo2783c();
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2783c();
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: d */
    public final void mo2784d(C1172u c1172u) {
        if (m2815t(c1172u.f4791b)) {
            Iterator it = this.f4718A.iterator();
            while (it.hasNext()) {
                AbstractC1164m abstractC1164m = (AbstractC1164m) it.next();
                if (abstractC1164m.m2815t(c1172u.f4791b)) {
                    abstractC1164m.mo2784d(c1172u);
                    c1172u.f4792c.add(abstractC1164m);
                }
            }
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: f */
    public final void mo2785f(C1172u c1172u) {
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2785f(c1172u);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: g */
    public final void mo2786g(C1172u c1172u) {
        if (m2815t(c1172u.f4791b)) {
            Iterator it = this.f4718A.iterator();
            while (it.hasNext()) {
                AbstractC1164m abstractC1164m = (AbstractC1164m) it.next();
                if (abstractC1164m.m2815t(c1172u.f4791b)) {
                    abstractC1164m.mo2786g(c1172u);
                    c1172u.f4792c.add(abstractC1164m);
                }
            }
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC1164m clone() {
        C1152a c1152a = (C1152a) super.clone();
        c1152a.f4718A = new ArrayList();
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1164m abstractC1164mClone = ((AbstractC1164m) this.f4718A.get(i2)).clone();
            c1152a.f4718A.add(abstractC1164mClone);
            abstractC1164mClone.f4766i = c1152a;
        }
        return c1152a;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: l */
    public final void mo2788l(ViewGroup viewGroup, C0121k c0121k, C0121k c0121k2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f4759b;
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1164m abstractC1164m = (AbstractC1164m) this.f4718A.get(i2);
            if (j2 > 0 && (this.f4719B || i2 == 0)) {
                long j3 = abstractC1164m.f4759b;
                if (j3 > 0) {
                    abstractC1164m.mo2780F(j3 + j2);
                } else {
                    abstractC1164m.mo2780F(j2);
                }
            }
            abstractC1164m.mo2788l(viewGroup, c0121k, c0121k2, arrayList, arrayList2);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: w */
    public final void mo2789w(ViewGroup viewGroup) {
        super.mo2789w(viewGroup);
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2789w(viewGroup);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: x */
    public final AbstractC1164m mo2790x(InterfaceC1162k interfaceC1162k) {
        super.mo2790x(interfaceC1162k);
        return this;
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: y */
    public final void mo2791y(View view) {
        super.mo2791y(view);
        int size = this.f4718A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1164m) this.f4718A.get(i2)).mo2791y(view);
        }
    }

    @Override // p106j0.AbstractC1164m
    /* renamed from: z */
    public final void mo2792z() {
        if (this.f4718A.isEmpty()) {
            m2806G();
            m2811m();
            return;
        }
        C1169r c1169r = new C1169r();
        c1169r.f4788b = this;
        Iterator it = this.f4718A.iterator();
        while (it.hasNext()) {
            ((AbstractC1164m) it.next()).m2807a(c1169r);
        }
        this.f4720C = this.f4718A.size();
        if (this.f4719B) {
            Iterator it2 = this.f4718A.iterator();
            while (it2.hasNext()) {
                ((AbstractC1164m) it2.next()).mo2792z();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f4718A.size(); i2++) {
            ((AbstractC1164m) this.f4718A.get(i2 - 1)).m2807a(new C1169r((AbstractC1164m) this.f4718A.get(i2)));
        }
        AbstractC1164m abstractC1164m = (AbstractC1164m) this.f4718A.get(0);
        if (abstractC1164m != null) {
            abstractC1164m.mo2792z();
        }
    }
}
