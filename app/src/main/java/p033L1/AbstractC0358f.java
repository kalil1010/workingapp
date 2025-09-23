package p033L1;

import org.conscrypt.Conscrypt;

/* renamed from: L1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0358f {
    /* renamed from: a */
    public static boolean m977a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
