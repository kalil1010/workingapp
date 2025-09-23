package p028K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j */
/* loaded from: classes.dex */
public final class C0269j {

    /* renamed from: a */
    public final DisplayCutout f872a;

    public C0269j(DisplayCutout displayCutout) {
        this.f872a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0269j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f872a, ((C0269j) obj).f872a);
    }

    public final int hashCode() {
        return this.f872a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f872a + "}";
    }
}
