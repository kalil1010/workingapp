package p028K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: K.p0 */
/* loaded from: classes.dex */
public class C0282p0 extends C0280o0 {
    public C0282p0(C0292u0 c0292u0, WindowInsets windowInsets) {
        super(c0292u0, windowInsets);
    }

    @Override // p028K.C0288s0
    /* renamed from: a */
    public C0292u0 mo808a() {
        return C0292u0.m817g(null, this.f892c.consumeDisplayCutout());
    }

    @Override // p028K.C0288s0
    /* renamed from: e */
    public C0269j mo809e() {
        DisplayCutout displayCutout = this.f892c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0269j(displayCutout);
    }

    @Override // p028K.AbstractC0278n0, p028K.C0288s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282p0)) {
            return false;
        }
        C0282p0 c0282p0 = (C0282p0) obj;
        return Objects.equals(this.f892c, c0282p0.f892c) && Objects.equals(this.f896g, c0282p0.f896g);
    }

    @Override // p028K.C0288s0
    public int hashCode() {
        return this.f892c.hashCode();
    }
}
