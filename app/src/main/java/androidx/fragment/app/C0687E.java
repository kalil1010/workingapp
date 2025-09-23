package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p015F0.C0147b;

/* renamed from: androidx.fragment.app.E */
/* loaded from: classes.dex */
public final class C0687E implements Parcelable {
    public static final Parcelable.Creator<C0687E> CREATOR = new C0147b(5);

    /* renamed from: a */
    public ArrayList f2472a;

    /* renamed from: b */
    public ArrayList f2473b;

    /* renamed from: c */
    public C0699b[] f2474c;

    /* renamed from: d */
    public int f2475d;

    /* renamed from: e */
    public String f2476e;

    /* renamed from: f */
    public ArrayList f2477f;

    /* renamed from: g */
    public ArrayList f2478g;

    /* renamed from: h */
    public ArrayList f2479h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f2472a);
        parcel.writeStringList(this.f2473b);
        parcel.writeTypedArray(this.f2474c, i2);
        parcel.writeInt(this.f2475d);
        parcel.writeString(this.f2476e);
        parcel.writeStringList(this.f2477f);
        parcel.writeTypedList(this.f2478g);
        parcel.writeTypedList(this.f2479h);
    }
}
