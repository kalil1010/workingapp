package p094f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p015F0.C0147b;

/* renamed from: f0.f0 */
/* loaded from: classes.dex */
public final class C0938f0 implements Parcelable {
    public static final Parcelable.Creator<C0938f0> CREATOR = new C0147b(12);

    /* renamed from: a */
    public int f3877a;

    /* renamed from: b */
    public int f3878b;

    /* renamed from: c */
    public int f3879c;

    /* renamed from: d */
    public int[] f3880d;

    /* renamed from: e */
    public int f3881e;

    /* renamed from: f */
    public int[] f3882f;

    /* renamed from: g */
    public ArrayList f3883g;

    /* renamed from: h */
    public boolean f3884h;

    /* renamed from: i */
    public boolean f3885i;

    /* renamed from: j */
    public boolean f3886j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3877a);
        parcel.writeInt(this.f3878b);
        parcel.writeInt(this.f3879c);
        if (this.f3879c > 0) {
            parcel.writeIntArray(this.f3880d);
        }
        parcel.writeInt(this.f3881e);
        if (this.f3881e > 0) {
            parcel.writeIntArray(this.f3882f);
        }
        parcel.writeInt(this.f3884h ? 1 : 0);
        parcel.writeInt(this.f3885i ? 1 : 0);
        parcel.writeInt(this.f3886j ? 1 : 0);
        parcel.writeList(this.f3883g);
    }
}
