package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public abstract class AbstractC0830v {

    /* renamed from: a */
    public static final AtomicReference f3245a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m2097a(Calendar calendar) {
        Calendar calendarM2099c = m2099c(calendar);
        Calendar calendarM2099c2 = m2099c(null);
        calendarM2099c2.set(calendarM2099c.get(1), calendarM2099c.get(2), calendarM2099c.get(5));
        return calendarM2099c2;
    }

    /* renamed from: b */
    public static Calendar m2098b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m2099c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
