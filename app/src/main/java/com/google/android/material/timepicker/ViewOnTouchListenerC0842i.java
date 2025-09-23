package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.i */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0842i implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f3448a;

    public ViewOnTouchListenerC0842i(GestureDetector gestureDetector) {
        this.f3448a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3448a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
