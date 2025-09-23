package p138v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p126r.AbstractC1283a;

/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C1366k {

    /* renamed from: j */
    public static final SparseIntArray f5937j;

    /* renamed from: a */
    public int f5938a;

    /* renamed from: b */
    public int f5939b;

    /* renamed from: c */
    public int f5940c;

    /* renamed from: d */
    public float f5941d;

    /* renamed from: e */
    public float f5942e;

    /* renamed from: f */
    public float f5943f;

    /* renamed from: g */
    public int f5944g;

    /* renamed from: h */
    public String f5945h;

    /* renamed from: i */
    public int f5946i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5937j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m3133a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1372q.f5976f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f5937j.get(index)) {
                case 1:
                    this.f5942e = typedArrayObtainStyledAttributes.getFloat(index, this.f5942e);
                    break;
                case 2:
                    this.f5940c = typedArrayObtainStyledAttributes.getInt(index, this.f5940c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1283a.f5208a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f5938a = C1369n.m3138f(typedArrayObtainStyledAttributes, index, this.f5938a);
                    break;
                case 6:
                    this.f5939b = typedArrayObtainStyledAttributes.getInteger(index, this.f5939b);
                    break;
                case 7:
                    this.f5941d = typedArrayObtainStyledAttributes.getFloat(index, this.f5941d);
                    break;
                case 8:
                    this.f5944g = typedArrayObtainStyledAttributes.getInteger(index, this.f5944g);
                    break;
                case 9:
                    this.f5943f = typedArrayObtainStyledAttributes.getFloat(index, this.f5943f);
                    break;
                case 10:
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        this.f5946i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f5945h = string;
                        if (string.indexOf("/") > 0) {
                            this.f5946i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f5946i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
