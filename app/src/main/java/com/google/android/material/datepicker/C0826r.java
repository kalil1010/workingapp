package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;
import p080b1.C0770h;
import p094f0.AbstractC0903B;
import p094f0.AbstractC0926Z;
import p094f0.C0912K;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0826r extends AbstractC0903B {

    /* renamed from: c */
    public final C0810b f3241c;

    /* renamed from: d */
    public final C0770h f3242d;

    /* renamed from: e */
    public final int f3243e;

    public C0826r(ContextThemeWrapper contextThemeWrapper, C0810b c0810b, C0770h c0770h) {
        C0822n c0822n = c0810b.f3162a;
        C0822n c0822n2 = c0810b.f3165d;
        if (c0822n.f3225a.compareTo(c0822n2.f3225a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0822n2.f3225a.compareTo(c0810b.f3163b.f3225a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f3243e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0823o.f3232d) + (C0820l.m2088C(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f3241c = c0810b;
        this.f3242d = c0770h;
        if (this.f3738a.m2331a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3739b = true;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: a */
    public final int mo188a() {
        return this.f3241c.f3168g;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: b */
    public final long mo1057b(int i2) {
        Calendar calendarM2097a = AbstractC0830v.m2097a(this.f3241c.f3162a.f3225a);
        calendarM2097a.add(2, i2);
        calendarM2097a.set(5, 1);
        Calendar calendarM2097a2 = AbstractC0830v.m2097a(calendarM2097a);
        calendarM2097a2.get(2);
        calendarM2097a2.get(1);
        calendarM2097a2.getMaximum(7);
        calendarM2097a2.getActualMaximum(5);
        calendarM2097a2.getTimeInMillis();
        return calendarM2097a2.getTimeInMillis();
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: d */
    public final void mo189d(AbstractC0926Z abstractC0926Z, int i2) {
        C0825q c0825q = (C0825q) abstractC0926Z;
        C0810b c0810b = this.f3241c;
        Calendar calendarM2097a = AbstractC0830v.m2097a(c0810b.f3162a.f3225a);
        calendarM2097a.add(2, i2);
        C0822n c0822n = new C0822n(calendarM2097a);
        c0825q.f3239t.setText(c0822n.m2092c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0825q.f3240u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m2081a() == null || !c0822n.equals(materialCalendarGridView.m2081a().f3234a)) {
            new C0823o(c0822n, c0810b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m2081a().getClass();
        throw null;
    }

    @Override // p094f0.AbstractC0903B
    /* renamed from: e */
    public final AbstractC0926Z mo190e(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0820l.m2088C(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0825q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0912K(-1, this.f3243e));
        return new C0825q(linearLayout, true);
    }
}
