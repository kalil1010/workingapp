package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p035M0.AbstractC0397z;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0834a extends AbstractC0397z {

    /* renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f3440a;

    public C0834a(ChipTextInputComboView chipTextInputComboView) {
        this.f3440a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f3440a;
        if (zIsEmpty) {
            chipTextInputComboView.f3408a.setText(ChipTextInputComboView.m2142a(chipTextInputComboView, "00"));
            return;
        }
        String strM2142a = ChipTextInputComboView.m2142a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f3408a;
        if (TextUtils.isEmpty(strM2142a)) {
            strM2142a = ChipTextInputComboView.m2142a(chipTextInputComboView, "00");
        }
        chip.setText(strM2142a);
    }
}
