package p002A1;

import java.io.IOException;
import p011D1.C0132v;
import p011D1.C0134x;
import p011D1.InterfaceC0127q;
import p024I1.C0212f;

/* renamed from: A1.L */
/* loaded from: classes.dex */
public final class C0017L implements InterfaceC0127q {
    @Override // p011D1.InterfaceC0127q
    /* renamed from: a */
    public final C0134x mo37a(C0212f c0212f) throws IOException {
        C0132v c0132v = c0212f.f772f;
        IOException e3 = null;
        for (int i2 = 0; i2 <= 5; i2++) {
            try {
                return c0212f.m563b(c0132v);
            } catch (IOException e4) {
                e3 = e4;
                if (i2 == 5) {
                    break;
                }
            }
        }
        if (e3 == null) {
            throw new IOException();
        }
        throw e3;
    }
}
