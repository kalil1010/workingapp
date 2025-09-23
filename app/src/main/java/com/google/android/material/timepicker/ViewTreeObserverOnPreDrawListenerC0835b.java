package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0835b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f3441a;

    public ViewTreeObserverOnPreDrawListenerC0835b(ClockFaceView clockFaceView) {
        this.f3441a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3441a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3420v.f3428d) - clockFaceView.f3413D;
        if (height != clockFaceView.f3444t) {
            clockFaceView.f3444t = height;
            clockFaceView.mo2143m();
            int i2 = clockFaceView.f3444t;
            ClockHandView clockHandView = clockFaceView.f3420v;
            clockHandView.f3436l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
