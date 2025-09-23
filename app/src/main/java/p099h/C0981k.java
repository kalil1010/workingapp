package p099h;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p028K.C0248X;
import p033L1.AbstractC0364l;

/* renamed from: h.k */
/* loaded from: classes.dex */
public final class C0981k {

    /* renamed from: c */
    public BaseInterpolator f4129c;

    /* renamed from: d */
    public AbstractC0364l f4130d;

    /* renamed from: e */
    public boolean f4131e;

    /* renamed from: b */
    public long f4128b = -1;

    /* renamed from: f */
    public final C0980j f4132f = new C0980j(this);

    /* renamed from: a */
    public final ArrayList f4127a = new ArrayList();

    /* renamed from: a */
    public final void m2486a() {
        if (this.f4131e) {
            Iterator it = this.f4127a.iterator();
            while (it.hasNext()) {
                ((C0248X) it.next()).m718b();
            }
            this.f4131e = false;
        }
    }

    /* renamed from: b */
    public final void m2487b() {
        View view;
        if (this.f4131e) {
            return;
        }
        Iterator it = this.f4127a.iterator();
        while (it.hasNext()) {
            C0248X c0248x = (C0248X) it.next();
            long j2 = this.f4128b;
            if (j2 >= 0) {
                c0248x.m719c(j2);
            }
            BaseInterpolator baseInterpolator = this.f4129c;
            if (baseInterpolator != null && (view = (View) c0248x.f824a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f4130d != null) {
                c0248x.m720d(this.f4132f);
            }
            View view2 = (View) c0248x.f824a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4131e = true;
    }
}
