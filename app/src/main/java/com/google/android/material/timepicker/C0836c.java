package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p028K.C0253b;
import p031L.C0336f;
import p031L.C0340j;
import p031L.C0341k;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C0836c extends C0253b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f3442d;

    public C0836c(ClockFaceView clockFaceView) {
        this.f3442d = clockFaceView;
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f3442d.f3424z.get(iIntValue - 1));
        }
        c0341k.m930j(C0340j.m920a(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0341k.m923b(C0336f.f1071g);
    }

    @Override // p028K.C0253b
    /* renamed from: g */
    public final boolean mo730g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.mo730g(view, i2, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f3442d;
        view.getHitRect(clockFaceView.f3421w);
        float fCenterX = clockFaceView.f3421w.centerX();
        float fCenterY = clockFaceView.f3421w.centerY();
        clockFaceView.f3420v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f3420v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
