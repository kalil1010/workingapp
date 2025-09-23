package p018G0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p033L1.AbstractC0356d;
import p035M0.C0396y;
import p035M0.InterfaceC0395x;

/* renamed from: G0.b */
/* loaded from: classes.dex */
public final class C0162b extends AbstractC0356d {

    /* renamed from: n */
    public final /* synthetic */ int f540n;

    /* renamed from: o */
    public final /* synthetic */ Object f541o;

    public /* synthetic */ C0162b(int i2, Object obj) {
        this.f540n = i2;
        this.f541o = obj;
    }

    /* renamed from: L */
    private final void m426L(int i2) {
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: y */
    public final void mo427y(int i2) {
        switch (this.f540n) {
            case 0:
                break;
            default:
                C0396y c0396y = (C0396y) this.f541o;
                c0396y.f1271d = true;
                InterfaceC0395x interfaceC0395x = (InterfaceC0395x) c0396y.f1272e.get();
                if (interfaceC0395x != null) {
                    C0166f c0166f = (C0166f) interfaceC0395x;
                    c0166f.m459u();
                    c0166f.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // p033L1.AbstractC0356d
    /* renamed from: z */
    public final void mo428z(Typeface typeface, boolean z2) {
        switch (this.f540n) {
            case 0:
                Chip chip = (Chip) this.f541o;
                C0166f c0166f = chip.f3141e;
                chip.setText(c0166f.f552C0 ? c0166f.f555E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    C0396y c0396y = (C0396y) this.f541o;
                    c0396y.f1271d = true;
                    InterfaceC0395x interfaceC0395x = (InterfaceC0395x) c0396y.f1272e.get();
                    if (interfaceC0395x != null) {
                        C0166f c0166f2 = (C0166f) interfaceC0395x;
                        c0166f2.m459u();
                        c0166f2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
