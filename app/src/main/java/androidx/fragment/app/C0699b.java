package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p015F0.C0147b;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0699b implements Parcelable {
    public static final Parcelable.Creator<C0699b> CREATOR = new C0147b(3);

    /* renamed from: a */
    public final int[] f2550a;

    /* renamed from: b */
    public final ArrayList f2551b;

    /* renamed from: c */
    public final int[] f2552c;

    /* renamed from: d */
    public final int[] f2553d;

    /* renamed from: e */
    public final int f2554e;

    /* renamed from: f */
    public final String f2555f;

    /* renamed from: g */
    public final int f2556g;

    /* renamed from: h */
    public final int f2557h;

    /* renamed from: i */
    public final CharSequence f2558i;

    /* renamed from: j */
    public final int f2559j;

    /* renamed from: k */
    public final CharSequence f2560k;

    /* renamed from: l */
    public final ArrayList f2561l;

    /* renamed from: m */
    public final ArrayList f2562m;

    /* renamed from: n */
    public final boolean f2563n;

    public C0699b(C0698a c0698a) {
        int size = c0698a.f2532a.size();
        this.f2550a = new int[size * 5];
        if (!c0698a.f2538g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2551b = new ArrayList(size);
        this.f2552c = new int[size];
        this.f2553d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0692J c0692j = (C0692J) c0698a.f2532a.get(i3);
            int i4 = i2 + 1;
            this.f2550a[i2] = c0692j.f2509a;
            ArrayList arrayList = this.f2551b;
            AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0692j.f2510b;
            arrayList.add(abstractComponentCallbacksC0712o != null ? abstractComponentCallbacksC0712o.f2632e : null);
            int[] iArr = this.f2550a;
            iArr[i4] = c0692j.f2511c;
            iArr[i2 + 2] = c0692j.f2512d;
            int i5 = i2 + 4;
            iArr[i2 + 3] = c0692j.f2513e;
            i2 += 5;
            iArr[i5] = c0692j.f2514f;
            this.f2552c[i3] = c0692j.f2515g.ordinal();
            this.f2553d[i3] = c0692j.f2516h.ordinal();
        }
        this.f2554e = c0698a.f2537f;
        this.f2555f = c0698a.f2539h;
        this.f2556g = c0698a.f2549r;
        this.f2557h = c0698a.f2540i;
        this.f2558i = c0698a.f2541j;
        this.f2559j = c0698a.f2542k;
        this.f2560k = c0698a.f2543l;
        this.f2561l = c0698a.f2544m;
        this.f2562m = c0698a.f2545n;
        this.f2563n = c0698a.f2546o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f2550a);
        parcel.writeStringList(this.f2551b);
        parcel.writeIntArray(this.f2552c);
        parcel.writeIntArray(this.f2553d);
        parcel.writeInt(this.f2554e);
        parcel.writeString(this.f2555f);
        parcel.writeInt(this.f2556g);
        parcel.writeInt(this.f2557h);
        TextUtils.writeToParcel(this.f2558i, parcel, 0);
        parcel.writeInt(this.f2559j);
        TextUtils.writeToParcel(this.f2560k, parcel, 0);
        parcel.writeStringList(this.f2561l);
        parcel.writeStringList(this.f2562m);
        parcel.writeInt(this.f2563n ? 1 : 0);
    }

    public C0699b(Parcel parcel) {
        this.f2550a = parcel.createIntArray();
        this.f2551b = parcel.createStringArrayList();
        this.f2552c = parcel.createIntArray();
        this.f2553d = parcel.createIntArray();
        this.f2554e = parcel.readInt();
        this.f2555f = parcel.readString();
        this.f2556g = parcel.readInt();
        this.f2557h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2558i = (CharSequence) creator.createFromParcel(parcel);
        this.f2559j = parcel.readInt();
        this.f2560k = (CharSequence) creator.createFromParcel(parcel);
        this.f2561l = parcel.createStringArrayList();
        this.f2562m = parcel.createStringArrayList();
        this.f2563n = parcel.readInt() != 0;
    }
}
