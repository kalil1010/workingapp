package p138v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: v.m */
/* loaded from: classes.dex */
public final class C1368m {

    /* renamed from: n */
    public static final SparseIntArray f5951n;

    /* renamed from: a */
    public float f5952a;

    /* renamed from: b */
    public float f5953b;

    /* renamed from: c */
    public float f5954c;

    /* renamed from: d */
    public float f5955d;

    /* renamed from: e */
    public float f5956e;

    /* renamed from: f */
    public float f5957f;

    /* renamed from: g */
    public float f5958g;

    /* renamed from: h */
    public int f5959h;

    /* renamed from: i */
    public float f5960i;

    /* renamed from: j */
    public float f5961j;

    /* renamed from: k */
    public float f5962k;

    /* renamed from: l */
    public boolean f5963l;

    /* renamed from: m */
    public float f5964m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5951n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m3135a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1372q.f5979i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f5951n.get(index)) {
                case 1:
                    this.f5952a = typedArrayObtainStyledAttributes.getFloat(index, this.f5952a);
                    break;
                case 2:
                    this.f5953b = typedArrayObtainStyledAttributes.getFloat(index, this.f5953b);
                    break;
                case 3:
                    this.f5954c = typedArrayObtainStyledAttributes.getFloat(index, this.f5954c);
                    break;
                case 4:
                    this.f5955d = typedArrayObtainStyledAttributes.getFloat(index, this.f5955d);
                    break;
                case 5:
                    this.f5956e = typedArrayObtainStyledAttributes.getFloat(index, this.f5956e);
                    break;
                case 6:
                    this.f5957f = typedArrayObtainStyledAttributes.getDimension(index, this.f5957f);
                    break;
                case 7:
                    this.f5958g = typedArrayObtainStyledAttributes.getDimension(index, this.f5958g);
                    break;
                case 8:
                    this.f5960i = typedArrayObtainStyledAttributes.getDimension(index, this.f5960i);
                    break;
                case 9:
                    this.f5961j = typedArrayObtainStyledAttributes.getDimension(index, this.f5961j);
                    break;
                case 10:
                    this.f5962k = typedArrayObtainStyledAttributes.getDimension(index, this.f5962k);
                    break;
                case 11:
                    this.f5963l = true;
                    this.f5964m = typedArrayObtainStyledAttributes.getDimension(index, this.f5964m);
                    break;
                case 12:
                    this.f5959h = C1369n.m3138f(typedArrayObtainStyledAttributes, index, this.f5959h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
