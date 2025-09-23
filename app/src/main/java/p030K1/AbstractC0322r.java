package p030K1;

import java.io.IOException;

/* renamed from: K1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0322r {
    /* renamed from: a */
    public static int m852a(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
    }
}
