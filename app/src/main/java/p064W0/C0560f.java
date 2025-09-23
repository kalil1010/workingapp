package p064W0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p055T0.C0512f;
import p055T0.C0517k;

/* renamed from: W0.f */
/* loaded from: classes.dex */
public final class C0560f extends C0512f {

    /* renamed from: q */
    public final RectF f1752q;

    public C0560f(C0517k c0517k, RectF rectF) {
        super(c0517k);
        this.f1752q = rectF;
    }

    @Override // p055T0.C0512f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0561g c0561g = new C0561g(this);
        c0561g.f1754x = this;
        c0561g.invalidateSelf();
        return c0561g;
    }

    public C0560f(C0560f c0560f) {
        super(c0560f);
        this.f1752q = c0560f.f1752q;
    }
}
