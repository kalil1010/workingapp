package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0824p implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f3237a;

    /* renamed from: b */
    public final /* synthetic */ C0826r f3238b;

    public C0824p(C0826r c0826r, MaterialCalendarGridView materialCalendarGridView) {
        this.f3238b = c0826r;
        this.f3237a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f3237a;
        C0823o c0823oM2081a = materialCalendarGridView.m2081a();
        if (i2 < c0823oM2081a.m2094a() || i2 > c0823oM2081a.m2096c()) {
            return;
        }
        if (materialCalendarGridView.m2081a().getItem(i2).longValue() >= ((C0818j) this.f3238b.f3242d.f2887a).f3186T.f3164c.f3171a) {
            throw null;
        }
    }
}
