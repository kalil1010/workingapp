package p018G0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import p031L.C0336f;
import p031L.C0341k;
import p054T.AbstractC0503b;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: G0.d */
/* loaded from: classes.dex */
public final class C0164d extends AbstractC0503b {

    /* renamed from: q */
    public final /* synthetic */ Chip f544q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164d(Chip chip, Chip chip2) {
        super(chip2);
        this.f544q = chip;
    }

    @Override // p054T.AbstractC0503b
    /* renamed from: l */
    public final void mo429l(ArrayList arrayList) {
        C0166f c0166f;
        arrayList.add(0);
        Rect rect = Chip.f3138w;
        Chip chip = this.f544q;
        if (!chip.m2076c() || (c0166f = chip.f3141e) == null || !c0166f.f562K || chip.f3144h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p054T.AbstractC0503b
    /* renamed from: o */
    public final void mo430o(int i2, C0341k c0341k) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f3138w);
            return;
        }
        Chip chip = this.f544q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c0341k.m923b(C0336f.f1071g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
