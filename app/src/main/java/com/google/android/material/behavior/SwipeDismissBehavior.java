package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p001A0.C0003b;
import p001A0.C0004c;
import p028K.AbstractC0241P;
import p031L.C0336f;
import p054T.C0506e;
import p144x.AbstractC1388a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1388a {

    /* renamed from: a */
    public C0506e f3044a;

    /* renamed from: b */
    public boolean f3045b;

    /* renamed from: c */
    public boolean f3046c;

    /* renamed from: d */
    public int f3047d = 2;

    /* renamed from: e */
    public float f3048e = 0.0f;

    /* renamed from: f */
    public float f3049f = 0.5f;

    /* renamed from: g */
    public final C0003b f3050g = new C0003b(this);

    @Override // p144x.AbstractC1388a
    /* renamed from: j */
    public boolean mo2021j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1558n = this.f3045b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1558n = coordinatorLayout.m1558n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3045b = zM1558n;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3045b = false;
        }
        if (zM1558n) {
            if (this.f3044a == null) {
                this.f3044a = new C0506e(coordinatorLayout.getContext(), coordinatorLayout, this.f3050g);
            }
            if (!this.f3046c && this.f3044a.m1267q(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: k */
    public final boolean mo2022k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = 0;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0241P.m698j(view, 1048576);
            AbstractC0241P.m696h(view, 0);
            if (mo2037v(view)) {
                AbstractC0241P.m699k(view, C0336f.f1076l, new C0004c(i3, this));
            }
        }
        return false;
    }

    @Override // p144x.AbstractC1388a
    /* renamed from: u */
    public final boolean mo2030u(View view, MotionEvent motionEvent) {
        if (this.f3044a == null) {
            return false;
        }
        if (this.f3046c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3044a.m1260j(motionEvent);
        return true;
    }

    /* renamed from: v */
    public boolean mo2037v(View view) {
        return true;
    }
}
