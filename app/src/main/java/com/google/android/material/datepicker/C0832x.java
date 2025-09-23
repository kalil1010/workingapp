package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import p080b1.C0767e;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0926Z;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0832x extends AbstractC0903B {

    /* renamed from: c */
    public final C0818j f3247c;

    public C0832x(C0818j c0818j) {
        this.f3247c = c0818j;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: a */
    public final int mo188a() {
        return this.f3247c.f3186T.f3167f;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: d */
    public final void mo189d(AbstractC0926Z abstractC0926Z, int i2) {
        C0818j c0818j = this.f3247c;
        int i3 = c0818j.f3186T.f3162a.f3227c + i2;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
        TextView textView = ((C0831w) abstractC0926Z).f3246t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0830v.m2098b().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i3)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i3)));
        C0811c c0811c = c0818j.f3189W;
        if (AbstractC0830v.m2098b().get(1) == i3) {
            C0767e c0767e = c0811c.f3170b;
        } else {
            C0767e c0767e2 = c0811c.f3169a;
        }
        throw null;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: e */
    public final AbstractC0926Z mo190e(ViewGroup viewGroup, int i2) {
        return new C0831w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
