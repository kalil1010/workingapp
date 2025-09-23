package p028K;

import android.view.WindowInsets;

/* renamed from: K.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC0290t0 {
    /* renamed from: a */
    public static int m815a(int i2) {
        int iStatusBars;
        int i3 = 0;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i3 |= iStatusBars;
            }
        }
        return i3;
    }
}
