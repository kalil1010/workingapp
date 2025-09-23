package p112l0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p119o.C1240b;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class C1226b extends AbstractC1225a {

    /* renamed from: d */
    public final SparseIntArray f4925d;

    /* renamed from: e */
    public final Parcel f4926e;

    /* renamed from: f */
    public final int f4927f;

    /* renamed from: g */
    public final int f4928g;

    /* renamed from: h */
    public final String f4929h;

    /* renamed from: i */
    public int f4930i;

    /* renamed from: j */
    public int f4931j;

    /* renamed from: k */
    public int f4932k;

    public C1226b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1240b(), new C1240b(), new C1240b());
    }

    @Override // p112l0.AbstractC1225a
    /* renamed from: a */
    public final C1226b mo2858a() {
        Parcel parcel = this.f4926e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f4931j;
        if (i2 == this.f4927f) {
            i2 = this.f4928g;
        }
        return new C1226b(parcel, iDataPosition, i2, this.f4929h + "  ", this.f4922a, this.f4923b, this.f4924c);
    }

    @Override // p112l0.AbstractC1225a
    /* renamed from: e */
    public final boolean mo2862e(int i2) {
        while (this.f4931j < this.f4928g) {
            int i3 = this.f4932k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f4931j;
            Parcel parcel = this.f4926e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f4932k = parcel.readInt();
            this.f4931j += i5;
        }
        return this.f4932k == i2;
    }

    @Override // p112l0.AbstractC1225a
    /* renamed from: h */
    public final void mo2865h(int i2) {
        int i3 = this.f4930i;
        SparseIntArray sparseIntArray = this.f4925d;
        Parcel parcel = this.f4926e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4930i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C1226b(Parcel parcel, int i2, int i3, String str, C1240b c1240b, C1240b c1240b2, C1240b c1240b3) {
        super(c1240b, c1240b2, c1240b3);
        this.f4925d = new SparseIntArray();
        this.f4930i = -1;
        this.f4932k = -1;
        this.f4926e = parcel;
        this.f4927f = i2;
        this.f4928g = i3;
        this.f4931j = i2;
        this.f4929h = str;
    }
}
