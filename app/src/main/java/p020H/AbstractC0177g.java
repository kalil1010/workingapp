package p020H;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006C.AbstractC0077i;
import p007C0.C0088f;
import p011D1.C0132v;
import p119o.C1244f;
import p119o.C1249k;

/* renamed from: H.g */
/* loaded from: classes.dex */
public abstract class AbstractC0177g {

    /* renamed from: a */
    public static final C1244f f641a = new C1244f(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f642b;

    /* renamed from: c */
    public static final Object f643c;

    /* renamed from: d */
    public static final C1249k f644d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0180j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f642b = threadPoolExecutor;
        f643c = new Object();
        f644d = new C1249k();
    }

    /* renamed from: a */
    public static C0176f m478a(String str, Context context, C0132v c0132v, int i2) throws Resources.NotFoundException {
        C1244f c1244f = f641a;
        Typeface typeface = (Typeface) c1244f.m2903a(str);
        if (typeface != null) {
            return new C0176f(typeface);
        }
        try {
            C0088f c0088fM476a = AbstractC0173c.m476a(context, c0132v);
            int i3 = 1;
            C0178h[] c0178hArr = (C0178h[]) c0088fM476a.f208b;
            int i4 = c0088fM476a.f207a;
            if (i4 != 0) {
                i3 = i4 != 1 ? -3 : -2;
            } else if (c0178hArr != null && c0178hArr.length != 0) {
                int length = c0178hArr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = c0178hArr[i5].f649e;
                    if (i6 == 0) {
                        i5++;
                    } else if (i6 >= 0) {
                        i3 = i6;
                    }
                }
            }
            if (i3 != 0) {
                return new C0176f(i3);
            }
            Typeface typefaceMo250w = AbstractC0077i.f179a.mo250w(context, c0178hArr, i2);
            if (typefaceMo250w == null) {
                return new C0176f(-3);
            }
            c1244f.m2904b(str, typefaceMo250w);
            return new C0176f(typefaceMo250w);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0176f(-1);
        }
    }
}
