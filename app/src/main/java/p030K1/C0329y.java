package p030K1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p138v.AbstractC1372q;
import p138v.C1369n;

/* renamed from: K1.y */
/* loaded from: classes.dex */
public final class C0329y {

    /* renamed from: a */
    public final int f1059a;

    /* renamed from: b */
    public final int f1060b;

    /* renamed from: c */
    public final Object f1061c;

    public C0329y(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f1061c = new ArrayList();
        this.f1060b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1372q.f5978h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f1059a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1059a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1060b);
                this.f1060b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1369n().m3142b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0329y() {
        this.f1061c = new C0329y[256];
        this.f1059a = 0;
        this.f1060b = 0;
    }

    public C0329y(int i2, int i3) {
        this.f1061c = null;
        this.f1059a = i2;
        int i4 = i3 & 7;
        this.f1060b = i4 == 0 ? 8 : i4;
    }
}
