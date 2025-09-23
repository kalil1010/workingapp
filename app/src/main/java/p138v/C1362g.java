package p138v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C1362g {

    /* renamed from: a */
    public final float f5846a;

    /* renamed from: b */
    public final float f5847b;

    /* renamed from: c */
    public final float f5848c;

    /* renamed from: d */
    public final float f5849d;

    /* renamed from: e */
    public final int f5850e;

    public C1362g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f5846a = Float.NaN;
        this.f5847b = Float.NaN;
        this.f5848c = Float.NaN;
        this.f5849d = Float.NaN;
        this.f5850e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1372q.f5980j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5850e);
                this.f5850e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1369n().m3142b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f5849d = typedArrayObtainStyledAttributes.getDimension(index, this.f5849d);
            } else if (index == 2) {
                this.f5847b = typedArrayObtainStyledAttributes.getDimension(index, this.f5847b);
            } else if (index == 3) {
                this.f5848c = typedArrayObtainStyledAttributes.getDimension(index, this.f5848c);
            } else if (index == 4) {
                this.f5846a = typedArrayObtainStyledAttributes.getDimension(index, this.f5846a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
