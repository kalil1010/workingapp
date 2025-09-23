package p105j;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p003B.AbstractC0046b;
import p007C0.RunnableC0084b;
import p028K.AbstractC0241P;

/* renamed from: j.U */
/* loaded from: classes.dex */
public final class C1062U extends AbstractC0046b {

    /* renamed from: h */
    public final /* synthetic */ int f4434h;

    /* renamed from: i */
    public final /* synthetic */ int f4435i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f4436j;

    /* renamed from: k */
    public final /* synthetic */ C1072Z f4437k;

    public C1062U(C1072Z c1072z, int i2, int i3, WeakReference weakReference) {
        this.f4437k = c1072z;
        this.f4434h = i2;
        this.f4435i = i3;
        this.f4436j = weakReference;
    }

    @Override // p003B.AbstractC0046b
    /* renamed from: g */
    public final void mo172g(int i2) {
    }

    @Override // p003B.AbstractC0046b
    /* renamed from: h */
    public final void mo173h(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f4434h) != -1) {
            typeface = AbstractC1070Y.m2676a(typeface, i2, (this.f4435i & 2) != 0);
        }
        C1072Z c1072z = this.f4437k;
        if (c1072z.f4457m) {
            c1072z.f4456l = typeface;
            TextView textView = (TextView) this.f4436j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0084b(textView, typeface, c1072z.f4454j));
                } else {
                    textView.setTypeface(typeface, c1072z.f4454j);
                }
            }
        }
    }
}
