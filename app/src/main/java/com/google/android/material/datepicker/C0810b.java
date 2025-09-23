package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p015F0.C0147b;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0810b implements Parcelable {
    public static final Parcelable.Creator<C0810b> CREATOR = new C0147b(7);

    /* renamed from: a */
    public final C0822n f3162a;

    /* renamed from: b */
    public final C0822n f3163b;

    /* renamed from: c */
    public final C0812d f3164c;

    /* renamed from: d */
    public final C0822n f3165d;

    /* renamed from: e */
    public final int f3166e;

    /* renamed from: f */
    public final int f3167f;

    /* renamed from: g */
    public final int f3168g;

    public C0810b(C0822n c0822n, C0822n c0822n2, C0812d c0812d, C0822n c0822n3, int i2) {
        Objects.requireNonNull(c0822n, "start cannot be null");
        Objects.requireNonNull(c0822n2, "end cannot be null");
        Objects.requireNonNull(c0812d, "validator cannot be null");
        this.f3162a = c0822n;
        this.f3163b = c0822n2;
        this.f3165d = c0822n3;
        this.f3166e = i2;
        this.f3164c = c0812d;
        if (c0822n3 != null && c0822n.f3225a.compareTo(c0822n3.f3225a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0822n3 != null && c0822n3.f3225a.compareTo(c0822n2.f3225a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > AbstractC0830v.m2099c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3168g = c0822n.m2093d(c0822n2) + 1;
        this.f3167f = (c0822n2.f3227c - c0822n.f3227c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0810b)) {
            return false;
        }
        C0810b c0810b = (C0810b) obj;
        return this.f3162a.equals(c0810b.f3162a) && this.f3163b.equals(c0810b.f3163b) && Objects.equals(this.f3165d, c0810b.f3165d) && this.f3166e == c0810b.f3166e && this.f3164c.equals(c0810b.f3164c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3162a, this.f3163b, this.f3165d, Integer.valueOf(this.f3166e), this.f3164c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3162a, 0);
        parcel.writeParcelable(this.f3163b, 0);
        parcel.writeParcelable(this.f3165d, 0);
        parcel.writeParcelable(this.f3164c, 0);
        parcel.writeInt(this.f3166e);
    }
}
