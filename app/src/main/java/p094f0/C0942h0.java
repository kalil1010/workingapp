package p094f0;

/* renamed from: f0.h0 */
/* loaded from: classes.dex */
public final class C0942h0 {

    /* renamed from: a */
    public int f3904a;

    /* renamed from: b */
    public int f3905b;

    /* renamed from: c */
    public int f3906c;

    /* renamed from: d */
    public int f3907d;

    /* renamed from: e */
    public int f3908e;

    /* renamed from: a */
    public final boolean m2440a() {
        int i2 = this.f3904a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f3907d;
            int i5 = this.f3905b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f3907d;
            int i7 = this.f3906c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f3908e;
            int i9 = this.f3905b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f3908e;
            int i11 = this.f3906c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
