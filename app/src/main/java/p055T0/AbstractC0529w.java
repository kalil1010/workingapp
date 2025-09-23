package p055T0;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* renamed from: T0.w */
/* loaded from: classes.dex */
public abstract class AbstractC0529w {

    /* renamed from: c */
    public C0517k f1688c;

    /* renamed from: a */
    public boolean f1686a = false;

    /* renamed from: b */
    public boolean f1687b = false;

    /* renamed from: d */
    public RectF f1689d = new RectF();

    /* renamed from: e */
    public final Path f1690e = new Path();

    /* renamed from: a */
    public abstract void mo1310a(NavigationView navigationView);

    /* renamed from: b */
    public abstract boolean mo1311b();

    /* renamed from: c */
    public final void m1312c() {
        C0517k c0517k;
        RectF rectF = this.f1689d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (c0517k = this.f1688c) == null) {
            return;
        }
        AbstractC0518l.f1648a.m1301a(c0517k, 1.0f, rectF, null, this.f1690e);
    }
}
