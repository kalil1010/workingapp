package p045Q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: Q.b */
/* loaded from: classes.dex */
public abstract class AbstractC0438b {
    /* renamed from: a */
    public static ColorStateList m1102a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m1103b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* renamed from: c */
    public static void m1104c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m1105d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
