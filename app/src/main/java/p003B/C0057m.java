package p003B;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: B.m */
/* loaded from: classes.dex */
public final class C0057m {

    /* renamed from: a */
    public final Resources f132a;

    /* renamed from: b */
    public final Resources.Theme f133b;

    public C0057m(Resources resources, Resources.Theme theme) {
        this.f132a = resources;
        this.f133b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0057m.class == obj.getClass()) {
            C0057m c0057m = (C0057m) obj;
            if (this.f132a.equals(c0057m.f132a) && Objects.equals(this.f133b, c0057m.f133b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f132a, this.f133b);
    }
}
