package p064W0;

import com.google.android.material.internal.CheckableImageButton;
import p033L1.AbstractC0364l;

/* renamed from: W0.e */
/* loaded from: classes.dex */
public final class C0559e extends AbstractC0570p {

    /* renamed from: e */
    public final /* synthetic */ int f1751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0559e(C0569o c0569o, int i2) {
        super(c0569o);
        this.f1751e = i2;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: r */
    public void mo1341r() {
        switch (this.f1751e) {
            case 0:
                C0569o c0569o = this.f1802b;
                c0569o.f1793o = null;
                CheckableImageButton checkableImageButton = c0569o.f1785g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0364l.m998e0(checkableImageButton, null);
                break;
        }
    }
}
