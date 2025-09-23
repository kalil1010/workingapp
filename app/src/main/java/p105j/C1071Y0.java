package p105j;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: j.Y0 */
/* loaded from: classes.dex */
public final class C1071Y0 extends TouchDelegate {

    /* renamed from: a */
    public final View f4439a;

    /* renamed from: b */
    public final Rect f4440b;

    /* renamed from: c */
    public final Rect f4441c;

    /* renamed from: d */
    public final Rect f4442d;

    /* renamed from: e */
    public final int f4443e;

    /* renamed from: f */
    public boolean f4444f;

    public C1071Y0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f4443e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f4440b = rect3;
        Rect rect4 = new Rect();
        this.f4442d = rect4;
        Rect rect5 = new Rect();
        this.f4441c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f4439a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f4444f;
                if (z3 && !this.f4442d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f4444f;
                    this.f4444f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else if (this.f4440b.contains(x2, y2)) {
            this.f4444f = true;
            z2 = true;
        } else {
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f4441c;
        View view = this.f4439a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
