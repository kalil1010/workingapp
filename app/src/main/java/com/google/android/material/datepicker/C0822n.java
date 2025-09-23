package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p015F0.C0147b;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C0822n implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0822n> CREATOR = new C0147b(9);

    /* renamed from: a */
    public final Calendar f3225a;

    /* renamed from: b */
    public final int f3226b;

    /* renamed from: c */
    public final int f3227c;

    /* renamed from: d */
    public final int f3228d;

    /* renamed from: e */
    public final int f3229e;

    /* renamed from: f */
    public final long f3230f;

    /* renamed from: g */
    public String f3231g;

    public C0822n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2097a = AbstractC0830v.m2097a(calendar);
        this.f3225a = calendarM2097a;
        this.f3226b = calendarM2097a.get(2);
        this.f3227c = calendarM2097a.get(1);
        this.f3228d = calendarM2097a.getMaximum(7);
        this.f3229e = calendarM2097a.getActualMaximum(5);
        this.f3230f = calendarM2097a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0822n m2090a(int i2, int i3) {
        Calendar calendarM2099c = AbstractC0830v.m2099c(null);
        calendarM2099c.set(1, i2);
        calendarM2099c.set(2, i3);
        return new C0822n(calendarM2099c);
    }

    /* renamed from: b */
    public static C0822n m2091b(long j2) {
        Calendar calendarM2099c = AbstractC0830v.m2099c(null);
        calendarM2099c.setTimeInMillis(j2);
        return new C0822n(calendarM2099c);
    }

    /* renamed from: c */
    public final String m2092c() {
        if (this.f3231g == null) {
            long timeInMillis = this.f3225a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0830v.f3245a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f3231g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f3231g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3225a.compareTo(((C0822n) obj).f3225a);
    }

    /* renamed from: d */
    public final int m2093d(C0822n c0822n) {
        if (!(this.f3225a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0822n.f3226b - this.f3226b) + ((c0822n.f3227c - this.f3227c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0822n)) {
            return false;
        }
        C0822n c0822n = (C0822n) obj;
        return this.f3226b == c0822n.f3226b && this.f3227c == c0822n.f3227c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3226b), Integer.valueOf(this.f3227c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3227c);
        parcel.writeInt(this.f3226b);
    }
}
