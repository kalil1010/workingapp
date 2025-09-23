package p125q0;

import java.io.Serializable;
import p006C.AbstractC0075g;
import p074Z1.AbstractC0621d;
import p078a2.C0630a;

/* renamed from: q0.b */
/* loaded from: classes.dex */
public abstract class AbstractC1274b implements Serializable {

    /* renamed from: a */
    public static final C1273a f5190a;

    static {
        C1273a c1273a = new C1273a();
        c1273a.f1955c = true;
        c1273a.f1956d = false;
        c1273a.f1957e = "[";
        StringBuilder sb = new StringBuilder();
        String str = AbstractC0621d.f1939b;
        sb.append(str);
        sb.append("  ");
        String string = sb.toString();
        if (string == null) {
            string = "";
        }
        c1273a.f1961i = string;
        c1273a.f1960h = true;
        String strM237f = AbstractC0075g.m237f(str, "]");
        c1273a.f1958f = strM237f != null ? strM237f : "";
        f5190a = c1273a;
    }

    public final String toString() {
        return new C0630a(this, f5190a).toString();
    }
}
