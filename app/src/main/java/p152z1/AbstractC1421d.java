package p152z1;

import java.io.ByteArrayOutputStream;
import java.util.logging.Logger;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1421d {

    /* renamed from: a */
    public static final /* synthetic */ int f6111a = 0;

    static {
        Logger.getLogger("net.sf.scuba");
    }

    /* renamed from: a */
    public static byte[] m3203a(int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i2 < 128) {
            byteArrayOutputStream.write(i2);
        } else {
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                i3 /= 256;
                i4++;
            }
            byteArrayOutputStream.write(i4 | 128);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = ((i4 - i5) - 1) * 8;
                byteArrayOutputStream.write(((255 << i6) & i2) >> i6);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
