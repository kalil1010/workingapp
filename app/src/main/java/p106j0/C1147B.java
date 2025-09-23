package p106j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p033L1.AbstractC0364l;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public class C1147B extends AbstractC0364l {

    /* renamed from: f */
    public static boolean f4697f = true;

    /* renamed from: g */
    public static boolean f4698g = true;

    /* renamed from: h */
    public static boolean f4699h = true;

    /* renamed from: i */
    public static boolean f4700i = true;

    @Override // p033L1.AbstractC0364l
    /* renamed from: i0 */
    public void mo1027i0(View view, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1027i0(view, i2);
        } else if (f4700i) {
            try {
                AbstractC1146A.m2764a(view, i2);
            } catch (NoSuchMethodError unused) {
                f4700i = false;
            }
        }
    }

    /* renamed from: m0 */
    public void mo2765m0(View view, int i2, int i3, int i4, int i5) {
        if (f4699h) {
            try {
                AbstractC1177z.m2829a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f4699h = false;
            }
        }
    }

    /* renamed from: n0 */
    public void mo2766n0(View view, Matrix matrix) {
        if (f4697f) {
            try {
                AbstractC1176y.m2827b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4697f = false;
            }
        }
    }

    /* renamed from: o0 */
    public void mo2767o0(View view, Matrix matrix) {
        if (f4698g) {
            try {
                AbstractC1176y.m2828c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4698g = false;
            }
        }
    }
}
