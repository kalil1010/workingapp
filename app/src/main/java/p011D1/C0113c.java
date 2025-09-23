package p011D1;

import java.util.concurrent.TimeUnit;
import p131s1.AbstractC1326c;

/* renamed from: D1.c */
/* loaded from: classes.dex */
public final class C0113c {

    /* renamed from: n */
    public static final /* synthetic */ int f292n = 0;

    /* renamed from: a */
    public final boolean f293a;

    /* renamed from: b */
    public final boolean f294b;

    /* renamed from: c */
    public final int f295c;

    /* renamed from: d */
    public final int f296d;

    /* renamed from: e */
    public final boolean f297e;

    /* renamed from: f */
    public final boolean f298f;

    /* renamed from: g */
    public final boolean f299g;

    /* renamed from: h */
    public final int f300h;

    /* renamed from: i */
    public final int f301i;

    /* renamed from: j */
    public final boolean f302j;

    /* renamed from: k */
    public final boolean f303k;

    /* renamed from: l */
    public final boolean f304l;

    /* renamed from: m */
    public String f305m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC1326c.m3062e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C0113c(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f293a = z2;
        this.f294b = z3;
        this.f295c = i2;
        this.f296d = i3;
        this.f297e = z4;
        this.f298f = z5;
        this.f299g = z6;
        this.f300h = i4;
        this.f301i = i5;
        this.f302j = z7;
        this.f303k = z8;
        this.f304l = z9;
        this.f305m = str;
    }

    public final String toString() {
        String str = this.f305m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f293a) {
            sb.append("no-cache, ");
        }
        if (this.f294b) {
            sb.append("no-store, ");
        }
        int i2 = this.f295c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f296d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f297e) {
            sb.append("private, ");
        }
        if (this.f298f) {
            sb.append("public, ");
        }
        if (this.f299g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f300h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f301i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f302j) {
            sb.append("only-if-cached, ");
        }
        if (this.f303k) {
            sb.append("no-transform, ");
        }
        if (this.f304l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC1326c.m3061d(string, "StringBuilder().apply(builderAction).toString()");
        this.f305m = string;
        return string;
    }
}
