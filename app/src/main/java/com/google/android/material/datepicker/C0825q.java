package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p028K.C0300z;
import p094f0.AbstractC0926Z;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C0825q extends AbstractC0926Z {

    /* renamed from: t */
    public final TextView f3239t;

    /* renamed from: u */
    public final MaterialCalendarGridView f3240u;

    public C0825q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3239t = textView;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        new C0300z(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m613d(textView, Boolean.TRUE);
        this.f3240u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
