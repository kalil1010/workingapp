package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p001A0.C0004c;
import p055T0.C0511e;
import p061V0.AbstractC0547c;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0511e f3324h;

    public BaseTransientBottomBar$Behavior() {
        C0511e c0511e = new C0511e(10);
        this.f3048e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3049f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3047d = 0;
        this.f3324h = c0511e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p144x.AbstractC1388a
    /* renamed from: j */
    public final boolean mo2021j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3324h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0004c.f5c == null) {
                    C0004c.f5c = new C0004c(20);
                }
                synchronized (C0004c.f5c.f7b) {
                }
            }
        } else if (coordinatorLayout.m1558n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0004c.f5c == null) {
                C0004c.f5c = new C0004c(20);
            }
            synchronized (C0004c.f5c.f7b) {
            }
        }
        return super.mo2021j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: v */
    public final boolean mo2037v(View view) {
        this.f3324h.getClass();
        return view instanceof AbstractC0547c;
    }
}
