package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p015F0.C0147b;

/* renamed from: androidx.fragment.app.H */
/* loaded from: classes.dex */
public final class C0690H implements Parcelable {
    public static final Parcelable.Creator<C0690H> CREATOR = new C0147b(6);

    /* renamed from: a */
    public final String f2491a;

    /* renamed from: b */
    public final String f2492b;

    /* renamed from: c */
    public final boolean f2493c;

    /* renamed from: d */
    public final int f2494d;

    /* renamed from: e */
    public final int f2495e;

    /* renamed from: f */
    public final String f2496f;

    /* renamed from: g */
    public final boolean f2497g;

    /* renamed from: h */
    public final boolean f2498h;

    /* renamed from: i */
    public final boolean f2499i;

    /* renamed from: j */
    public final Bundle f2500j;

    /* renamed from: k */
    public final boolean f2501k;

    /* renamed from: l */
    public final int f2502l;

    /* renamed from: m */
    public Bundle f2503m;

    public C0690H(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        this.f2491a = abstractComponentCallbacksC0712o.getClass().getName();
        this.f2492b = abstractComponentCallbacksC0712o.f2632e;
        this.f2493c = abstractComponentCallbacksC0712o.f2640m;
        this.f2494d = abstractComponentCallbacksC0712o.f2649v;
        this.f2495e = abstractComponentCallbacksC0712o.f2650w;
        this.f2496f = abstractComponentCallbacksC0712o.f2651x;
        this.f2497g = abstractComponentCallbacksC0712o.f2612A;
        this.f2498h = abstractComponentCallbacksC0712o.f2639l;
        this.f2499i = abstractComponentCallbacksC0712o.f2653z;
        this.f2500j = abstractComponentCallbacksC0712o.f2633f;
        this.f2501k = abstractComponentCallbacksC0712o.f2652y;
        this.f2502l = abstractComponentCallbacksC0712o.f2622K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2491a);
        sb.append(" (");
        sb.append(this.f2492b);
        sb.append(")}:");
        if (this.f2493c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f2495e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f2496f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2497g) {
            sb.append(" retainInstance");
        }
        if (this.f2498h) {
            sb.append(" removing");
        }
        if (this.f2499i) {
            sb.append(" detached");
        }
        if (this.f2501k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2491a);
        parcel.writeString(this.f2492b);
        parcel.writeInt(this.f2493c ? 1 : 0);
        parcel.writeInt(this.f2494d);
        parcel.writeInt(this.f2495e);
        parcel.writeString(this.f2496f);
        parcel.writeInt(this.f2497g ? 1 : 0);
        parcel.writeInt(this.f2498h ? 1 : 0);
        parcel.writeInt(this.f2499i ? 1 : 0);
        parcel.writeBundle(this.f2500j);
        parcel.writeInt(this.f2501k ? 1 : 0);
        parcel.writeBundle(this.f2503m);
        parcel.writeInt(this.f2502l);
    }

    public C0690H(Parcel parcel) {
        this.f2491a = parcel.readString();
        this.f2492b = parcel.readString();
        this.f2493c = parcel.readInt() != 0;
        this.f2494d = parcel.readInt();
        this.f2495e = parcel.readInt();
        this.f2496f = parcel.readString();
        this.f2497g = parcel.readInt() != 0;
        this.f2498h = parcel.readInt() != 0;
        this.f2499i = parcel.readInt() != 0;
        this.f2500j = parcel.readBundle();
        this.f2501k = parcel.readInt() != 0;
        this.f2503m = parcel.readBundle();
        this.f2502l = parcel.readInt();
    }
}
