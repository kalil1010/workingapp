package p023I0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0206a implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f760a;

    /* renamed from: b */
    public final int f761b;

    /* renamed from: c */
    public final int f762c;

    /* renamed from: d */
    public final int f763d;

    public ViewOnTouchListenerC0206a(Dialog dialog, Rect rect) {
        this.f760a = dialog;
        this.f761b = rect.left;
        this.f762c = rect.top;
        this.f763d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f761b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f762c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f763d;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f760a.onTouchEvent(motionEventObtain);
    }
}
