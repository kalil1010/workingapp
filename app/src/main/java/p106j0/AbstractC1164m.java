package p106j0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p001A0.C0002a;
import p011D1.C0121k;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0254b0;
import p080b1.C0767e;
import p093e2.AbstractC0901d;
import p119o.AbstractC1242d;
import p119o.C1240b;
import p119o.C1243e;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public abstract class AbstractC1164m implements Cloneable {

    /* renamed from: w */
    public static final Animator[] f4754w = new Animator[0];

    /* renamed from: x */
    public static final int[] f4755x = {2, 1, 3, 4};

    /* renamed from: y */
    public static final C0767e f4756y = new C0767e(10);

    /* renamed from: z */
    public static final ThreadLocal f4757z = new ThreadLocal();

    /* renamed from: k */
    public ArrayList f4768k;

    /* renamed from: l */
    public ArrayList f4769l;

    /* renamed from: m */
    public InterfaceC1162k[] f4770m;

    /* renamed from: a */
    public final String f4758a = getClass().getName();

    /* renamed from: b */
    public long f4759b = -1;

    /* renamed from: c */
    public long f4760c = -1;

    /* renamed from: d */
    public TimeInterpolator f4761d = null;

    /* renamed from: e */
    public final ArrayList f4762e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f4763f = new ArrayList();

    /* renamed from: g */
    public C0121k f4764g = new C0121k(5);

    /* renamed from: h */
    public C0121k f4765h = new C0121k(5);

    /* renamed from: i */
    public C1152a f4766i = null;

    /* renamed from: j */
    public final int[] f4767j = f4755x;

    /* renamed from: n */
    public final ArrayList f4771n = new ArrayList();

    /* renamed from: o */
    public Animator[] f4772o = f4754w;

    /* renamed from: p */
    public int f4773p = 0;

    /* renamed from: q */
    public boolean f4774q = false;

    /* renamed from: r */
    public boolean f4775r = false;

    /* renamed from: s */
    public AbstractC1164m f4776s = null;

    /* renamed from: t */
    public ArrayList f4777t = null;

    /* renamed from: u */
    public ArrayList f4778u = new ArrayList();

    /* renamed from: v */
    public C0767e f4779v = f4756y;

    /* renamed from: b */
    public static void m2803b(C0121k c0121k, View view, C1172u c1172u) {
        ((C1240b) c0121k.f352a).put(view, c1172u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0121k.f353b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        String strM628k = AbstractC0230E.m628k(view);
        if (strM628k != null) {
            C1240b c1240b = (C1240b) c0121k.f355d;
            if (c1240b.containsKey(strM628k)) {
                c1240b.put(strM628k, null);
            } else {
                c1240b.put(strM628k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1243e c1243e = (C1243e) c0121k.f354c;
                if (c1243e.f5031a) {
                    c1243e.m2898b();
                }
                if (AbstractC1242d.m2896b(c1243e.f5032b, c1243e.f5034d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1243e.m2900d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1243e.m2899c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1243e.m2900d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: p */
    public static C1240b m2804p() {
        ThreadLocal threadLocal = f4757z;
        C1240b c1240b = (C1240b) threadLocal.get();
        if (c1240b != null) {
            return c1240b;
        }
        C1240b c1240b2 = new C1240b();
        threadLocal.set(c1240b2);
        return c1240b2;
    }

    /* renamed from: u */
    public static boolean m2805u(C1172u c1172u, C1172u c1172u2, String str) {
        Object obj = c1172u.f4790a.get(str);
        Object obj2 = c1172u2.f4790a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2775A(long j2) {
        this.f4760c = j2;
    }

    /* renamed from: B */
    public void mo2776B(AbstractC0901d abstractC0901d) {
    }

    /* renamed from: C */
    public void mo2777C(TimeInterpolator timeInterpolator) {
        this.f4761d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo2778D(C0767e c0767e) {
        if (c0767e == null) {
            this.f4779v = f4756y;
        } else {
            this.f4779v = c0767e;
        }
    }

    /* renamed from: E */
    public void mo2779E() {
    }

    /* renamed from: F */
    public void mo2780F(long j2) {
        this.f4759b = j2;
    }

    /* renamed from: G */
    public final void m2806G() {
        if (this.f4773p == 0) {
            m2816v(this, InterfaceC1163l.f4749a);
            this.f4775r = false;
        }
        this.f4773p++;
    }

    /* renamed from: H */
    public String mo2781H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4760c != -1) {
            sb.append("dur(");
            sb.append(this.f4760c);
            sb.append(") ");
        }
        if (this.f4759b != -1) {
            sb.append("dly(");
            sb.append(this.f4759b);
            sb.append(") ");
        }
        if (this.f4761d != null) {
            sb.append("interp(");
            sb.append(this.f4761d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f4762e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4763f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2807a(InterfaceC1162k interfaceC1162k) {
        if (this.f4777t == null) {
            this.f4777t = new ArrayList();
        }
        this.f4777t.add(interfaceC1162k);
    }

    /* renamed from: c */
    public void mo2783c() {
        ArrayList arrayList = this.f4771n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4772o);
        this.f4772o = f4754w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f4772o = animatorArr;
        m2816v(this, InterfaceC1163l.f4751c);
    }

    /* renamed from: d */
    public abstract void mo2784d(C1172u c1172u);

    /* renamed from: e */
    public final void m2808e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1172u c1172u = new C1172u(view);
            if (z2) {
                mo2786g(c1172u);
            } else {
                mo2784d(c1172u);
            }
            c1172u.f4792c.add(this);
            mo2785f(c1172u);
            if (z2) {
                m2803b(this.f4764g, view, c1172u);
            } else {
                m2803b(this.f4765h, view, c1172u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m2808e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    /* renamed from: f */
    public void mo2785f(C1172u c1172u) {
    }

    /* renamed from: g */
    public abstract void mo2786g(C1172u c1172u);

    /* renamed from: h */
    public final void m2809h(ViewGroup viewGroup, boolean z2) {
        m2810i(z2);
        ArrayList arrayList = this.f4762e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4763f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2808e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                C1172u c1172u = new C1172u(viewFindViewById);
                if (z2) {
                    mo2786g(c1172u);
                } else {
                    mo2784d(c1172u);
                }
                c1172u.f4792c.add(this);
                mo2785f(c1172u);
                if (z2) {
                    m2803b(this.f4764g, viewFindViewById, c1172u);
                } else {
                    m2803b(this.f4765h, viewFindViewById, c1172u);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            C1172u c1172u2 = new C1172u(view);
            if (z2) {
                mo2786g(c1172u2);
            } else {
                mo2784d(c1172u2);
            }
            c1172u2.f4792c.add(this);
            mo2785f(c1172u2);
            if (z2) {
                m2803b(this.f4764g, view, c1172u2);
            } else {
                m2803b(this.f4765h, view, c1172u2);
            }
        }
    }

    /* renamed from: i */
    public final void m2810i(boolean z2) {
        if (z2) {
            ((C1240b) this.f4764g.f352a).clear();
            ((SparseArray) this.f4764g.f353b).clear();
            ((C1243e) this.f4764g.f354c).m2897a();
        } else {
            ((C1240b) this.f4765h.f352a).clear();
            ((SparseArray) this.f4765h.f353b).clear();
            ((C1243e) this.f4765h.f354c).m2897a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC1164m clone() {
        try {
            AbstractC1164m abstractC1164m = (AbstractC1164m) super.clone();
            abstractC1164m.f4778u = new ArrayList();
            abstractC1164m.f4764g = new C0121k(5);
            abstractC1164m.f4765h = new C0121k(5);
            abstractC1164m.f4768k = null;
            abstractC1164m.f4769l = null;
            abstractC1164m.f4776s = this;
            abstractC1164m.f4777t = null;
            return abstractC1164m;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: k */
    public Animator mo2794k(ViewGroup viewGroup, C1172u c1172u, C1172u c1172u2) {
        return null;
    }

    /* renamed from: l */
    public void mo2788l(ViewGroup viewGroup, C0121k c0121k, C0121k c0121k2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        C1172u c1172u;
        Animator animator;
        C1172u c1172u2;
        C1240b c1240bM2804p = m2804p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2813o().getClass();
        int i4 = 0;
        while (i4 < size) {
            C1172u c1172u3 = (C1172u) arrayList.get(i4);
            C1172u c1172u4 = (C1172u) arrayList2.get(i4);
            if (c1172u3 != null && !c1172u3.f4792c.contains(this)) {
                c1172u3 = null;
            }
            if (c1172u4 != null && !c1172u4.f4792c.contains(this)) {
                c1172u4 = null;
            }
            if ((c1172u3 != null || c1172u4 != null) && (c1172u3 == null || c1172u4 == null || mo2801s(c1172u3, c1172u4))) {
                Animator animatorMo2794k = mo2794k(viewGroup, c1172u3, c1172u4);
                if (animatorMo2794k != null) {
                    String str = this.f4758a;
                    if (c1172u4 != null) {
                        String[] strArrMo2795q = mo2795q();
                        view = c1172u4.f4791b;
                        if (strArrMo2795q != null && strArrMo2795q.length > 0) {
                            c1172u2 = new C1172u(view);
                            C1172u c1172u5 = (C1172u) ((C1240b) c0121k2.f352a).getOrDefault(view, null);
                            i2 = size;
                            if (c1172u5 != null) {
                                int i5 = 0;
                                while (i5 < strArrMo2795q.length) {
                                    HashMap map = c1172u2.f4790a;
                                    int i6 = i4;
                                    String str2 = strArrMo2795q[i5];
                                    map.put(str2, c1172u5.f4790a.get(str2));
                                    i5++;
                                    i4 = i6;
                                }
                            }
                            i3 = i4;
                            int i7 = c1240bM2804p.f5058c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = animatorMo2794k;
                                    break;
                                }
                                C1161j c1161j = (C1161j) c1240bM2804p.getOrDefault((Animator) c1240bM2804p.m2912h(i8), null);
                                if (c1161j.f4745c != null && c1161j.f4743a == view && c1161j.f4744b.equals(str) && c1161j.f4745c.equals(c1172u2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator = animatorMo2794k;
                            c1172u2 = null;
                        }
                        animatorMo2794k = animator;
                        c1172u = c1172u2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = c1172u3.f4791b;
                        c1172u = null;
                    }
                    if (animatorMo2794k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C1161j c1161j2 = new C1161j();
                        c1161j2.f4743a = view;
                        c1161j2.f4744b = str;
                        c1161j2.f4745c = c1172u;
                        c1161j2.f4746d = windowId;
                        c1161j2.f4747e = this;
                        c1161j2.f4748f = animatorMo2794k;
                        c1240bM2804p.put(animatorMo2794k, c1161j2);
                        this.f4778u.add(animatorMo2794k);
                    }
                }
                i4 = i3 + 1;
                size = i2;
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                C1161j c1161j3 = (C1161j) c1240bM2804p.getOrDefault((Animator) this.f4778u.get(sparseIntArray.keyAt(i9)), null);
                c1161j3.f4748f.setStartDelay(c1161j3.f4748f.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m2811m() {
        int i2 = this.f4773p - 1;
        this.f4773p = i2;
        if (i2 == 0) {
            m2816v(this, InterfaceC1163l.f4750b);
            for (int i3 = 0; i3 < ((C1243e) this.f4764g.f354c).m2901e(); i3++) {
                View view = (View) ((C1243e) this.f4764g.f354c).m2902f(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C1243e) this.f4765h.f354c).m2901e(); i4++) {
                View view2 = (View) ((C1243e) this.f4765h.f354c).m2902f(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4775r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f4769l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f4768k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p106j0.C1172u) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p106j0.C1172u m2812n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            j0.a r0 = r4.f4766i
            if (r0 == 0) goto L9
            j0.u r5 = r0.m2812n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f4768k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f4769l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            j0.u r3 = (p106j0.C1172u) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f4791b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f4769l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f4768k
        L35:
            java.lang.Object r5 = r5.get(r2)
            j0.u r5 = (p106j0.C1172u) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p106j0.AbstractC1164m.m2812n(android.view.View, boolean):j0.u");
    }

    /* renamed from: o */
    public final AbstractC1164m m2813o() {
        C1152a c1152a = this.f4766i;
        return c1152a != null ? c1152a.m2813o() : this;
    }

    /* renamed from: q */
    public String[] mo2795q() {
        return null;
    }

    /* renamed from: r */
    public final C1172u m2814r(View view, boolean z2) {
        C1152a c1152a = this.f4766i;
        if (c1152a != null) {
            return c1152a.m2814r(view, z2);
        }
        return (C1172u) ((C1240b) (z2 ? this.f4764g : this.f4765h).f352a).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo2801s(C1172u c1172u, C1172u c1172u2) {
        if (c1172u != null && c1172u2 != null) {
            String[] strArrMo2795q = mo2795q();
            if (strArrMo2795q != null) {
                for (String str : strArrMo2795q) {
                    if (m2805u(c1172u, c1172u2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c1172u.f4790a.keySet().iterator();
                while (it.hasNext()) {
                    if (m2805u(c1172u, c1172u2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m2815t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4762e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4763f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2781H("");
    }

    /* renamed from: v */
    public final void m2816v(AbstractC1164m abstractC1164m, InterfaceC1163l interfaceC1163l) {
        AbstractC1164m abstractC1164m2 = this.f4776s;
        if (abstractC1164m2 != null) {
            abstractC1164m2.m2816v(abstractC1164m, interfaceC1163l);
        }
        ArrayList arrayList = this.f4777t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4777t.size();
        InterfaceC1162k[] interfaceC1162kArr = this.f4770m;
        if (interfaceC1162kArr == null) {
            interfaceC1162kArr = new InterfaceC1162k[size];
        }
        this.f4770m = null;
        InterfaceC1162k[] interfaceC1162kArr2 = (InterfaceC1162k[]) this.f4777t.toArray(interfaceC1162kArr);
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC1163l.mo745a(interfaceC1162kArr2[i2], abstractC1164m);
            interfaceC1162kArr2[i2] = null;
        }
        this.f4770m = interfaceC1162kArr2;
    }

    /* renamed from: w */
    public void mo2789w(ViewGroup viewGroup) {
        if (this.f4775r) {
            return;
        }
        ArrayList arrayList = this.f4771n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4772o);
        this.f4772o = f4754w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f4772o = animatorArr;
        m2816v(this, InterfaceC1163l.f4752d);
        this.f4774q = true;
    }

    /* renamed from: x */
    public AbstractC1164m mo2790x(InterfaceC1162k interfaceC1162k) {
        AbstractC1164m abstractC1164m;
        ArrayList arrayList = this.f4777t;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC1162k) && (abstractC1164m = this.f4776s) != null) {
                abstractC1164m.mo2790x(interfaceC1162k);
            }
            if (this.f4777t.size() == 0) {
                this.f4777t = null;
            }
        }
        return this;
    }

    /* renamed from: y */
    public void mo2791y(View view) {
        if (this.f4774q) {
            if (!this.f4775r) {
                ArrayList arrayList = this.f4771n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4772o);
                this.f4772o = f4754w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f4772o = animatorArr;
                m2816v(this, InterfaceC1163l.f4753e);
            }
            this.f4774q = false;
        }
    }

    /* renamed from: z */
    public void mo2792z() {
        m2806G();
        C1240b c1240bM2804p = m2804p();
        Iterator it = this.f4778u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c1240bM2804p.containsKey(animator)) {
                m2806G();
                if (animator != null) {
                    animator.addListener(new C0254b0(this, c1240bM2804p));
                    long j2 = this.f4760c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f4759b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4761d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0002a(7, this));
                    animator.start();
                }
            }
        }
        this.f4778u.clear();
        m2811m();
    }
}
