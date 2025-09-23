package p028K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p055T0.C0511e;

/* renamed from: K.B */
/* loaded from: classes.dex */
public abstract class AbstractC0227B {

    /* renamed from: a */
    public int f803a;

    /* renamed from: b */
    public int f804b;

    /* renamed from: c */
    public int f805c;

    /* renamed from: d */
    public Object f806d;

    public AbstractC0227B() {
        if (C0511e.f1582b == null) {
            C0511e.f1582b = new C0511e(11);
        }
    }

    /* renamed from: a */
    public int m610a(int i2) {
        if (i2 < this.f805c) {
            return ((ByteBuffer) this.f806d).getShort(this.f804b + i2);
        }
        return 0;
    }

    /* renamed from: b */
    public abstract Object mo611b(View view);

    /* renamed from: c */
    public abstract void mo612c(View view, Object obj);

    /* renamed from: d */
    public void m613d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f804b) {
            mo612c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f804b) {
            tag = mo611b(view);
        } else {
            tag = view.getTag(this.f803a);
            if (!((Class) this.f806d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo614e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM692d = AbstractC0241P.m692d(view);
            C0253b c0253b = accessibilityDelegateM692d == null ? null : accessibilityDelegateM692d instanceof C0251a ? ((C0251a) accessibilityDelegateM692d).f825a : new C0253b(accessibilityDelegateM692d);
            if (c0253b == null) {
                c0253b = new C0253b();
            }
            AbstractC0241P.m701m(view, c0253b);
            view.setTag(this.f803a, obj);
            AbstractC0241P.m696h(view, this.f805c);
        }
    }

    /* renamed from: e */
    public abstract boolean mo614e(Object obj, Object obj2);
}
