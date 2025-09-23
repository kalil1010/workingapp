package p028K;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p006C.C0072d;

/* renamed from: K.j0 */
/* loaded from: classes.dex */
public final class C0270j0 extends AbstractC0276m0 {

    /* renamed from: e */
    public static Field f873e;

    /* renamed from: f */
    public static boolean f874f;

    /* renamed from: g */
    public static Constructor f875g;

    /* renamed from: h */
    public static boolean f876h;

    /* renamed from: c */
    public WindowInsets f877c;

    /* renamed from: d */
    public C0072d f878d;

    public C0270j0() {
        this.f877c = m752i();
    }

    /* renamed from: i */
    private static WindowInsets m752i() {
        if (!f874f) {
            try {
                f873e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f874f = true;
        }
        Field field = f873e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f876h) {
            try {
                f875g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f876h = true;
        }
        Constructor constructor = f875g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: b */
    public C0292u0 mo753b() {
        m782a();
        C0292u0 c0292u0M817g = C0292u0.m817g(null, this.f877c);
        C0072d[] c0072dArr = this.f886b;
        C0288s0 c0288s0 = c0292u0M817g.f910a;
        c0288s0.mo797o(c0072dArr);
        c0288s0.mo806q(this.f878d);
        return c0292u0M817g;
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: e */
    public void mo754e(C0072d c0072d) {
        this.f878d = c0072d;
    }

    @Override // p028K.AbstractC0276m0
    /* renamed from: g */
    public void mo755g(C0072d c0072d) {
        WindowInsets windowInsets = this.f877c;
        if (windowInsets != null) {
            this.f877c = windowInsets.replaceSystemWindowInsets(c0072d.f172a, c0072d.f173b, c0072d.f174c, c0072d.f175d);
        }
    }

    public C0270j0(C0292u0 c0292u0) {
        super(c0292u0);
        this.f877c = c0292u0.m822f();
    }
}
