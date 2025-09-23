package p006C;

import android.content.res.Resources;
import android.os.Build;
import p033L1.AbstractC0364l;
import p119o.C1244f;

/* renamed from: C.i */
/* loaded from: classes.dex */
public abstract class AbstractC0077i {

    /* renamed from: a */
    public static final AbstractC0364l f179a;

    /* renamed from: b */
    public static final C1244f f180b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f179a = new C0082n();
        } else if (i2 >= 28) {
            f179a = new C0081m();
        } else if (i2 >= 26) {
            f179a = new C0080l();
        } else if (C0079k.f188h != null) {
            f179a = new C0079k();
        } else {
            f179a = new C0078j();
        }
        f180b = new C1244f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m245a(android.content.Context r14, p003B.InterfaceC0050f r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, p003B.AbstractC0046b r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p006C.AbstractC0077i.m245a(android.content.Context, B.f, android.content.res.Resources, int, java.lang.String, int, int, B.b, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m246b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
