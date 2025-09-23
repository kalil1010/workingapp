package p138v;

import java.util.Arrays;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C1363h {

    /* renamed from: a */
    public int[] f5851a;

    /* renamed from: b */
    public int[] f5852b;

    /* renamed from: c */
    public int f5853c;

    /* renamed from: d */
    public int[] f5854d;

    /* renamed from: e */
    public float[] f5855e;

    /* renamed from: f */
    public int f5856f;

    /* renamed from: g */
    public int[] f5857g;

    /* renamed from: h */
    public String[] f5858h;

    /* renamed from: i */
    public int f5859i;

    /* renamed from: j */
    public int[] f5860j;

    /* renamed from: k */
    public boolean[] f5861k;

    /* renamed from: l */
    public int f5862l;

    /* renamed from: a */
    public final void m3127a(int i2, float f) {
        int i3 = this.f5856f;
        int[] iArr = this.f5854d;
        if (i3 >= iArr.length) {
            this.f5854d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5855e;
            this.f5855e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5854d;
        int i4 = this.f5856f;
        iArr2[i4] = i2;
        float[] fArr2 = this.f5855e;
        this.f5856f = i4 + 1;
        fArr2[i4] = f;
    }

    /* renamed from: b */
    public final void m3128b(int i2, int i3) {
        int i4 = this.f5853c;
        int[] iArr = this.f5851a;
        if (i4 >= iArr.length) {
            this.f5851a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5852b;
            this.f5852b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5851a;
        int i5 = this.f5853c;
        iArr3[i5] = i2;
        int[] iArr4 = this.f5852b;
        this.f5853c = i5 + 1;
        iArr4[i5] = i3;
    }

    /* renamed from: c */
    public final void m3129c(int i2, boolean z2) {
        int i3 = this.f5862l;
        int[] iArr = this.f5860j;
        if (i3 >= iArr.length) {
            this.f5860j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5861k;
            this.f5861k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f5860j;
        int i4 = this.f5862l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f5861k;
        this.f5862l = i4 + 1;
        zArr2[i4] = z2;
    }

    /* renamed from: d */
    public final void m3130d(String str, int i2) {
        int i3 = this.f5859i;
        int[] iArr = this.f5857g;
        if (i3 >= iArr.length) {
            this.f5857g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5858h;
            this.f5858h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5857g;
        int i4 = this.f5859i;
        iArr2[i4] = i2;
        String[] strArr2 = this.f5858h;
        this.f5859i = i4 + 1;
        strArr2[i4] = str;
    }
}
