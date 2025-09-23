package p095f1;

import p084c1.C0790a;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0963b {

    /* renamed from: a */
    public static final boolean f4040a;

    /* renamed from: b */
    public static final C0790a f4041b;

    /* renamed from: c */
    public static final C0790a f4042c;

    /* renamed from: d */
    public static final C0790a f4043d;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f4040a = z2;
        if (z2) {
            f4041b = C0962a.f4035c;
            f4042c = C0962a.f4036d;
            f4043d = C0962a.f4037e;
        } else {
            f4041b = null;
            f4042c = null;
            f4043d = null;
        }
    }
}
