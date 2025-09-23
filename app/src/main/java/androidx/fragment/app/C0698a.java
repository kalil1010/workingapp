package androidx.fragment.app;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0698a implements InterfaceC0684B {

    /* renamed from: a */
    public final ArrayList f2532a;

    /* renamed from: b */
    public int f2533b;

    /* renamed from: c */
    public int f2534c;

    /* renamed from: d */
    public int f2535d;

    /* renamed from: e */
    public int f2536e;

    /* renamed from: f */
    public int f2537f;

    /* renamed from: g */
    public boolean f2538g;

    /* renamed from: h */
    public String f2539h;

    /* renamed from: i */
    public int f2540i;

    /* renamed from: j */
    public CharSequence f2541j;

    /* renamed from: k */
    public int f2542k;

    /* renamed from: l */
    public CharSequence f2543l;

    /* renamed from: m */
    public ArrayList f2544m;

    /* renamed from: n */
    public ArrayList f2545n;

    /* renamed from: o */
    public boolean f2546o;

    /* renamed from: p */
    public final C0686D f2547p;

    /* renamed from: q */
    public boolean f2548q;

    /* renamed from: r */
    public int f2549r;

    public C0698a(C0686D c0686d) {
        c0686d.m1651B();
        C0715r c0715r = c0686d.f2459n;
        if (c0715r != null) {
            c0715r.f2659g.getClassLoader();
        }
        this.f2532a = new ArrayList();
        this.f2546o = false;
        this.f2549r = -1;
        this.f2547p = c0686d;
    }

    @Override // androidx.fragment.app.InterfaceC0684B
    /* renamed from: a */
    public final boolean mo1645a(ArrayList arrayList, ArrayList arrayList2) {
        if (C0686D.m1646D(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2538g) {
            return true;
        }
        C0686D c0686d = this.f2547p;
        if (c0686d.f2449d == null) {
            c0686d.f2449d = new ArrayList();
        }
        c0686d.f2449d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1722b(C0692J c0692j) {
        this.f2532a.add(c0692j);
        c0692j.f2511c = this.f2533b;
        c0692j.f2512d = this.f2534c;
        c0692j.f2513e = this.f2535d;
        c0692j.f2514f = this.f2536e;
    }

    /* renamed from: c */
    public final void m1723c(int i2) {
        if (this.f2538g) {
            if (C0686D.m1646D(2)) {
                toString();
            }
            ArrayList arrayList = this.f2532a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0692J c0692j = (C0692J) arrayList.get(i3);
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0692j.f2510b;
                if (abstractComponentCallbacksC0712o != null) {
                    abstractComponentCallbacksC0712o.f2644q += i2;
                    if (C0686D.m1646D(2)) {
                        Objects.toString(c0692j.f2510b);
                        int i4 = c0692j.f2510b.f2644q;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1724d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2539h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2549r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2548q);
            if (this.f2537f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2537f));
            }
            if (this.f2533b != 0 || this.f2534c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2533b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2534c));
            }
            if (this.f2535d != 0 || this.f2536e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2535d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2536e));
            }
            if (this.f2540i != 0 || this.f2541j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2540i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2541j);
            }
            if (this.f2542k != 0 || this.f2543l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2542k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2543l);
            }
        }
        ArrayList arrayList = this.f2532a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0692J c0692j = (C0692J) arrayList.get(i2);
            switch (c0692j.f2509a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0692j.f2509a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0692j.f2510b);
            if (z2) {
                if (c0692j.f2511c != 0 || c0692j.f2512d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0692j.f2511c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0692j.f2512d));
                }
                if (c0692j.f2513e != 0 || c0692j.f2514f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0692j.f2513e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0692j.f2514f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2549r >= 0) {
            sb.append(" #");
            sb.append(this.f2549r);
        }
        if (this.f2539h != null) {
            sb.append(" ");
            sb.append(this.f2539h);
        }
        sb.append("}");
        return sb.toString();
    }
}
