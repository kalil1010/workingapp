package p028K;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p006C.C0072d;

/* renamed from: K.s0 */
/* loaded from: classes.dex */
public class C0288s0 {

    /* renamed from: b */
    public static final C0292u0 f904b;

    /* renamed from: a */
    public final C0292u0 f905a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f904b = (i2 >= 30 ? new C0274l0() : i2 >= 29 ? new C0272k0() : new C0270j0()).mo753b().f910a.mo808a().f910a.mo802b().f910a.mo803c();
    }

    public C0288s0(C0292u0 c0292u0) {
        this.f905a = c0292u0;
    }

    /* renamed from: a */
    public C0292u0 mo808a() {
        return this.f905a;
    }

    /* renamed from: b */
    public C0292u0 mo802b() {
        return this.f905a;
    }

    /* renamed from: c */
    public C0292u0 mo803c() {
        return this.f905a;
    }

    /* renamed from: d */
    public void mo792d(View view) {
    }

    /* renamed from: e */
    public C0269j mo809e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0288s0)) {
            return false;
        }
        C0288s0 c0288s0 = (C0288s0) obj;
        return mo796n() == c0288s0.mo796n() && mo805m() == c0288s0.mo805m() && Objects.equals(mo794j(), c0288s0.mo794j()) && Objects.equals(mo804h(), c0288s0.mo804h()) && Objects.equals(mo809e(), c0288s0.mo809e());
    }

    /* renamed from: f */
    public C0072d mo793f(int i2) {
        return C0072d.f171e;
    }

    /* renamed from: g */
    public C0072d mo810g() {
        return mo794j();
    }

    /* renamed from: h */
    public C0072d mo804h() {
        return C0072d.f171e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo796n()), Boolean.valueOf(mo805m()), mo794j(), mo804h(), mo809e());
    }

    /* renamed from: i */
    public C0072d mo811i() {
        return mo794j();
    }

    /* renamed from: j */
    public C0072d mo794j() {
        return C0072d.f171e;
    }

    /* renamed from: k */
    public C0072d mo812k() {
        return mo794j();
    }

    /* renamed from: l */
    public C0292u0 mo795l(int i2, int i3, int i4, int i5) {
        return f904b;
    }

    /* renamed from: m */
    public boolean mo805m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo796n() {
        return false;
    }

    /* renamed from: o */
    public void mo797o(C0072d[] c0072dArr) {
    }

    /* renamed from: p */
    public void mo798p(C0292u0 c0292u0) {
    }

    /* renamed from: q */
    public void mo806q(C0072d c0072d) {
    }
}
