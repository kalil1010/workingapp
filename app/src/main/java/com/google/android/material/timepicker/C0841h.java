package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public final class C0841h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f3447a;

    public C0841h(TimePickerView timePickerView) {
        this.f3447a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i2 = TimePickerView.f3438t;
        this.f3447a.getClass();
        return false;
    }
}
