package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C0823o extends BaseAdapter {

    /* renamed from: d */
    public static final int f3232d = AbstractC0830v.m2099c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f3233e = (AbstractC0830v.m2099c(null).getMaximum(7) + AbstractC0830v.m2099c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0822n f3234a;

    /* renamed from: b */
    public C0811c f3235b;

    /* renamed from: c */
    public final C0810b f3236c;

    public C0823o(C0822n c0822n, C0810b c0810b) {
        this.f3234a = c0822n;
        this.f3236c = c0810b;
        throw null;
    }

    /* renamed from: a */
    public final int m2094a() {
        int firstDayOfWeek = this.f3236c.f3166e;
        C0822n c0822n = this.f3234a;
        Calendar calendar = c0822n.f3225a;
        int i2 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - firstDayOfWeek;
        return i3 < 0 ? i3 + c0822n.f3228d : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < m2094a() || i2 > m2096c()) {
            return null;
        }
        int iM2094a = (i2 - m2094a()) + 1;
        Calendar calendarM2097a = AbstractC0830v.m2097a(this.f3234a.f3225a);
        calendarM2097a.set(5, iM2094a);
        return Long.valueOf(calendarM2097a.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m2096c() {
        return (m2094a() + this.f3234a.f3229e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3233e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f3234a.f3228d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            com.google.android.material.datepicker.c r1 = r4.f3235b
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r4.f3235b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427405(0x7f0b004d, float:1.8476425E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.m2094a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.n r7 = r4.f3234a
            int r2 = r7.f3229e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.AbstractC0830v.m2098b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C0823o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
