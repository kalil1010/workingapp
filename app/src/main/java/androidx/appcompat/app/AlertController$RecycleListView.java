package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p086d.AbstractC0843a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f2043a;

    /* renamed from: b */
    public final int f2044b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3471u);
        this.f2044b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f2043a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
