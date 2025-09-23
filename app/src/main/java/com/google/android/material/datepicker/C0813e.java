package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0813e extends BaseAdapter {

    /* renamed from: d */
    public static final int f3172d;

    /* renamed from: a */
    public final Calendar f3173a;

    /* renamed from: b */
    public final int f3174b;

    /* renamed from: c */
    public final int f3175c;

    static {
        f3172d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0813e() {
        Calendar calendarM2099c = AbstractC0830v.m2099c(null);
        this.f3173a = calendarM2099c;
        this.f3174b = calendarM2099c.getMaximum(7);
        this.f3175c = calendarM2099c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3174b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i3 = this.f3174b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f3175c;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i3 = i2 + this.f3175c;
        int i4 = this.f3174b;
        if (i3 > i4) {
            i3 -= i4;
        }
        Calendar calendar = this.f3173a;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, f3172d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0813e(int i2) {
        Calendar calendarM2099c = AbstractC0830v.m2099c(null);
        this.f3173a = calendarM2099c;
        this.f3174b = calendarM2099c.getMaximum(7);
        this.f3175c = i2;
    }
}
