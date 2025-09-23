package p041O0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: O0.e */
/* loaded from: classes.dex */
public final class C0429e extends AbstractC0498b {
    public static final Parcelable.Creator<C0429e> CREATOR = new C0089g(4);

    /* renamed from: c */
    public Bundle f1316c;

    public C0429e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1316c = parcel.readBundle(classLoader);
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeBundle(this.f1316c);
    }
}
