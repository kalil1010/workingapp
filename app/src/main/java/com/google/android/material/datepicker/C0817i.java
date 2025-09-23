package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p094f0.AbstractC0911J;
import p094f0.AbstractC0914M;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0817i extends AbstractC0914M {

    /* renamed from: a */
    public final /* synthetic */ C0826r f3182a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f3183b;

    /* renamed from: c */
    public final /* synthetic */ C0818j f3184c;

    public C0817i(C0818j c0818j, C0826r c0826r, MaterialButton materialButton) {
        this.f3184c = c0818j;
        this.f3182a = c0826r;
        this.f3183b = materialButton;
    }

    @Override // p094f0.AbstractC0914M
    /* renamed from: a */
    public final void mo2083a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f3183b.getText());
        }
    }

    @Override // p094f0.AbstractC0914M
    /* renamed from: b */
    public final void mo2084b(RecyclerView recyclerView, int i2, int i3) {
        int iM1842K0;
        C0818j c0818j = this.f3184c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0818j.f3191Y.getLayoutManager();
            View viewM1845M0 = linearLayoutManager.m1845M0(0, linearLayoutManager.m2374v(), false);
            iM1842K0 = viewM1845M0 == null ? -1 : AbstractC0911J.m2346H(viewM1845M0);
        } else {
            iM1842K0 = ((LinearLayoutManager) c0818j.f3191Y.getLayoutManager()).m1842K0();
        }
        C0810b c0810b = this.f3182a.f3241c;
        Calendar calendarM2097a = AbstractC0830v.m2097a(c0810b.f3162a.f3225a);
        calendarM2097a.add(2, iM1842K0);
        c0818j.f3187U = new C0822n(calendarM2097a);
        Calendar calendarM2097a2 = AbstractC0830v.m2097a(c0810b.f3162a.f3225a);
        calendarM2097a2.add(2, iM1842K0);
        calendarM2097a2.set(5, 1);
        Calendar calendarM2097a3 = AbstractC0830v.m2097a(calendarM2097a2);
        calendarM2097a3.get(2);
        calendarM2097a3.get(1);
        calendarM2097a3.getMaximum(7);
        calendarM2097a3.getActualMaximum(5);
        calendarM2097a3.getTimeInMillis();
        long timeInMillis = calendarM2097a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC0830v.f3245a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f3183b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
