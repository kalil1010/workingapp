package p138v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: v.l */
/* loaded from: classes.dex */
public final class C1367l {

    /* renamed from: a */
    public int f5947a;

    /* renamed from: b */
    public int f5948b;

    /* renamed from: c */
    public float f5949c;

    /* renamed from: d */
    public float f5950d;

    /* renamed from: a */
    public final void m3134a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1372q.f5977g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f5949c = typedArrayObtainStyledAttributes.getFloat(index, this.f5949c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f5947a);
                this.f5947a = i3;
                this.f5947a = C1369n.f5965d[i3];
            } else if (index == 4) {
                this.f5948b = typedArrayObtainStyledAttributes.getInt(index, this.f5948b);
            } else if (index == 3) {
                this.f5950d = typedArrayObtainStyledAttributes.getFloat(index, this.f5950d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
