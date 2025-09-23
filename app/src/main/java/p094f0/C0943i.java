package p094f0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p028K.C0281p;

/* renamed from: f0.i */
/* loaded from: classes.dex */
public final class C0943i extends AbstractC0907F {

    /* renamed from: s */
    public static TimeInterpolator f3909s;

    /* renamed from: g */
    public boolean f3910g;

    /* renamed from: h */
    public ArrayList f3911h;

    /* renamed from: i */
    public ArrayList f3912i;

    /* renamed from: j */
    public ArrayList f3913j;

    /* renamed from: k */
    public ArrayList f3914k;

    /* renamed from: l */
    public ArrayList f3915l;

    /* renamed from: m */
    public ArrayList f3916m;

    /* renamed from: n */
    public ArrayList f3917n;

    /* renamed from: o */
    public ArrayList f3918o;

    /* renamed from: p */
    public ArrayList f3919p;

    /* renamed from: q */
    public ArrayList f3920q;

    /* renamed from: r */
    public ArrayList f3921r;

    /* renamed from: h */
    public static void m2441h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0926Z) arrayList.get(size)).f3815a.animate().cancel();
        }
    }

    @Override // p094f0.AbstractC0907F
    /* renamed from: a */
    public final boolean mo2335a(AbstractC0926Z abstractC0926Z, AbstractC0926Z abstractC0926Z2, C0281p c0281p, C0281p c0281p2) {
        int i2;
        int i3;
        int i4 = c0281p.f898a;
        int i5 = c0281p.f899b;
        if (abstractC0926Z2.m2408o()) {
            int i6 = c0281p.f898a;
            i3 = c0281p.f899b;
            i2 = i6;
        } else {
            i2 = c0281p2.f898a;
            i3 = c0281p2.f899b;
        }
        if (abstractC0926Z == abstractC0926Z2) {
            return m2442g(abstractC0926Z, i4, i5, i2, i3);
        }
        View view = abstractC0926Z.f3815a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2446l(abstractC0926Z);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2446l(abstractC0926Z2);
        float f = -((int) ((i2 - i4) - translationX));
        View view2 = abstractC0926Z2.f3815a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i3 - i5) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3914k;
        C0939g c0939g = new C0939g();
        c0939g.f3887a = abstractC0926Z;
        c0939g.f3888b = abstractC0926Z2;
        c0939g.f3889c = i4;
        c0939g.f3890d = i5;
        c0939g.f3891e = i2;
        c0939g.f3892f = i3;
        arrayList.add(c0939g);
        return true;
    }

    @Override // p094f0.AbstractC0907F
    /* renamed from: d */
    public final void mo2337d(AbstractC0926Z abstractC0926Z) {
        View view = abstractC0926Z.f3815a;
        view.animate().cancel();
        ArrayList arrayList = this.f3913j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0941h) arrayList.get(size)).f3899a == abstractC0926Z) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2336c(abstractC0926Z);
                arrayList.remove(size);
            }
        }
        m2444j(this.f3914k, abstractC0926Z);
        if (this.f3911h.remove(abstractC0926Z)) {
            view.setAlpha(1.0f);
            m2336c(abstractC0926Z);
        }
        if (this.f3912i.remove(abstractC0926Z)) {
            view.setAlpha(1.0f);
            m2336c(abstractC0926Z);
        }
        ArrayList arrayList2 = this.f3917n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2444j(arrayList3, abstractC0926Z);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3916m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0941h) arrayList5.get(size4)).f3899a == abstractC0926Z) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2336c(abstractC0926Z);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3915l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0926Z)) {
                view.setAlpha(1.0f);
                m2336c(abstractC0926Z);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3920q.remove(abstractC0926Z);
        this.f3918o.remove(abstractC0926Z);
        this.f3921r.remove(abstractC0926Z);
        this.f3919p.remove(abstractC0926Z);
        m2443i();
    }

    @Override // p094f0.AbstractC0907F
    /* renamed from: e */
    public final void mo2338e() {
        ArrayList arrayList = this.f3913j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0941h c0941h = (C0941h) arrayList.get(size);
            View view = c0941h.f3899a.f3815a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2336c(c0941h.f3899a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3911h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2336c((AbstractC0926Z) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3912i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0926Z abstractC0926Z = (AbstractC0926Z) arrayList3.get(size3);
            abstractC0926Z.f3815a.setAlpha(1.0f);
            m2336c(abstractC0926Z);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3914k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0939g c0939g = (C0939g) arrayList4.get(size4);
            AbstractC0926Z abstractC0926Z2 = c0939g.f3887a;
            if (abstractC0926Z2 != null) {
                m2445k(c0939g, abstractC0926Z2);
            }
            AbstractC0926Z abstractC0926Z3 = c0939g.f3888b;
            if (abstractC0926Z3 != null) {
                m2445k(c0939g, abstractC0926Z3);
            }
        }
        arrayList4.clear();
        if (mo2339f()) {
            ArrayList arrayList5 = this.f3916m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0941h c0941h2 = (C0941h) arrayList6.get(size6);
                    View view2 = c0941h2.f3899a.f3815a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2336c(c0941h2.f3899a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3915l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0926Z abstractC0926Z4 = (AbstractC0926Z) arrayList8.get(size8);
                    abstractC0926Z4.f3815a.setAlpha(1.0f);
                    m2336c(abstractC0926Z4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3917n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0939g c0939g2 = (C0939g) arrayList10.get(size10);
                    AbstractC0926Z abstractC0926Z5 = c0939g2.f3887a;
                    if (abstractC0926Z5 != null) {
                        m2445k(c0939g2, abstractC0926Z5);
                    }
                    AbstractC0926Z abstractC0926Z6 = c0939g2.f3888b;
                    if (abstractC0926Z6 != null) {
                        m2445k(c0939g2, abstractC0926Z6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2441h(this.f3920q);
            m2441h(this.f3919p);
            m2441h(this.f3918o);
            m2441h(this.f3921r);
            ArrayList arrayList11 = this.f3741b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p094f0.AbstractC0907F
    /* renamed from: f */
    public final boolean mo2339f() {
        return (this.f3912i.isEmpty() && this.f3914k.isEmpty() && this.f3913j.isEmpty() && this.f3911h.isEmpty() && this.f3919p.isEmpty() && this.f3920q.isEmpty() && this.f3918o.isEmpty() && this.f3921r.isEmpty() && this.f3916m.isEmpty() && this.f3915l.isEmpty() && this.f3917n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2442g(AbstractC0926Z abstractC0926Z, int i2, int i3, int i4, int i5) {
        View view = abstractC0926Z.f3815a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) abstractC0926Z.f3815a.getTranslationY());
        m2446l(abstractC0926Z);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m2336c(abstractC0926Z);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.f3913j;
        C0941h c0941h = new C0941h();
        c0941h.f3899a = abstractC0926Z;
        c0941h.f3900b = translationX;
        c0941h.f3901c = translationY;
        c0941h.f3902d = i4;
        c0941h.f3903e = i5;
        arrayList.add(c0941h);
        return true;
    }

    /* renamed from: i */
    public final void m2443i() {
        if (mo2339f()) {
            return;
        }
        ArrayList arrayList = this.f3741b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m2444j(ArrayList arrayList, AbstractC0926Z abstractC0926Z) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0939g c0939g = (C0939g) arrayList.get(size);
            if (m2445k(c0939g, abstractC0926Z) && c0939g.f3887a == null && c0939g.f3888b == null) {
                arrayList.remove(c0939g);
            }
        }
    }

    /* renamed from: k */
    public final boolean m2445k(C0939g c0939g, AbstractC0926Z abstractC0926Z) {
        if (c0939g.f3888b == abstractC0926Z) {
            c0939g.f3888b = null;
        } else {
            if (c0939g.f3887a != abstractC0926Z) {
                return false;
            }
            c0939g.f3887a = null;
        }
        abstractC0926Z.f3815a.setAlpha(1.0f);
        View view = abstractC0926Z.f3815a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2336c(abstractC0926Z);
        return true;
    }

    /* renamed from: l */
    public final void m2446l(AbstractC0926Z abstractC0926Z) {
        if (f3909s == null) {
            f3909s = new ValueAnimator().getInterpolator();
        }
        abstractC0926Z.f3815a.animate().setInterpolator(f3909s);
        mo2337d(abstractC0926Z);
    }
}
