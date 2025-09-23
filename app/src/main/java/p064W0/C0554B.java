package p064W0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p007C0.C0089g;
import p051S.AbstractC0498b;

/* renamed from: W0.B */
/* loaded from: classes.dex */
public final class C0554B extends AbstractC0498b {
    public static final Parcelable.Creator<C0554B> CREATOR = new C0089g(8);

    /* renamed from: c */
    public CharSequence f1734c;

    /* renamed from: d */
    public boolean f1735d;

    public C0554B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1734c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1735d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1734c) + "}";
    }

    @Override // p051S.AbstractC0498b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f1734c, parcel, i2);
        parcel.writeInt(this.f1735d ? 1 : 0);
    }
}
