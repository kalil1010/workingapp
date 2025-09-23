package p106j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p006C.AbstractC0075g;

/* renamed from: j0.u */
/* loaded from: classes.dex */
public final class C1172u {

    /* renamed from: b */
    public final View f4791b;

    /* renamed from: a */
    public final HashMap f4790a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4792c = new ArrayList();

    public C1172u(View view) {
        this.f4791b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1172u)) {
            return false;
        }
        C1172u c1172u = (C1172u) obj;
        return this.f4791b == c1172u.f4791b && this.f4790a.equals(c1172u.f4790a);
    }

    public final int hashCode() {
        return this.f4790a.hashCode() + (this.f4791b.hashCode() * 31);
    }

    public final String toString() {
        String strM237f = AbstractC0075g.m237f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4791b + "\n", "    values:");
        HashMap map = this.f4790a;
        for (String str : map.keySet()) {
            strM237f = strM237f + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM237f;
    }
}
