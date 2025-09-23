package p105j;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p001A0.C0004c;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;

/* renamed from: j.w */
/* loaded from: classes.dex */
public final class C1138w {

    /* renamed from: a */
    public final TextView f4659a;

    /* renamed from: b */
    public final C0004c f4660b;

    public C1138w(TextView textView) {
        this.f4659a = textView;
        this.f4660b = new C0004c(textView);
    }

    /* renamed from: a */
    public final void m2757a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f4659a.getContext().obtainStyledAttributes(attributeSet, AbstractC0843a.f3459i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2759c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2758b(boolean z2) {
        ((AbstractC0901d) this.f4660b.f7b).mo1399m0(z2);
    }

    /* renamed from: c */
    public final void m2759c(boolean z2) {
        ((AbstractC0901d) this.f4660b.f7b).mo1400o0(z2);
    }
}
