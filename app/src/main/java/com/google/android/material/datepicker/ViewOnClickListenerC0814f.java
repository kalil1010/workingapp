package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p094f0.AbstractC0911J;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0814f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f3176a;

    /* renamed from: b */
    public final /* synthetic */ C0826r f3177b;

    /* renamed from: c */
    public final /* synthetic */ C0818j f3178c;

    public /* synthetic */ ViewOnClickListenerC0814f(C0818j c0818j, C0826r c0826r, int i2) {
        this.f3176a = i2;
        this.f3178c = c0818j;
        this.f3177b = c0826r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3176a) {
            case 0:
                C0818j c0818j = this.f3178c;
                int iM1842K0 = ((LinearLayoutManager) c0818j.f3191Y.getLayoutManager()).m1842K0() - 1;
                if (iM1842K0 >= 0) {
                    Calendar calendarM2097a = AbstractC0830v.m2097a(this.f3177b.f3241c.f3162a.f3225a);
                    calendarM2097a.add(2, iM1842K0);
                    c0818j.m2086z(new C0822n(calendarM2097a));
                    break;
                }
                break;
            default:
                C0818j c0818j2 = this.f3178c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0818j2.f3191Y.getLayoutManager();
                View viewM1845M0 = linearLayoutManager.m1845M0(0, linearLayoutManager.m2374v(), false);
                int iM2346H = (viewM1845M0 == null ? -1 : AbstractC0911J.m2346H(viewM1845M0)) + 1;
                if (iM2346H < c0818j2.f3191Y.getAdapter().mo188a()) {
                    Calendar calendarM2097a2 = AbstractC0830v.m2097a(this.f3177b.f3241c.f3162a.f3225a);
                    calendarM2097a2.add(2, iM2346H);
                    c0818j2.m2086z(new C0822n(calendarM2097a2));
                    break;
                }
                break;
        }
    }
}
