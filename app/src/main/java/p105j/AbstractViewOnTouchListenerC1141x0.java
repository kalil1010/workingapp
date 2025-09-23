package p105j;

import android.view.View;
import android.view.ViewConfiguration;
import p102i.InterfaceC0992C;

/* renamed from: j.x0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1141x0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f4666a;

    /* renamed from: b */
    public final int f4667b;

    /* renamed from: c */
    public final int f4668c;

    /* renamed from: d */
    public final View f4669d;

    /* renamed from: e */
    public RunnableC1139w0 f4670e;

    /* renamed from: f */
    public RunnableC1139w0 f4671f;

    /* renamed from: g */
    public boolean f4672g;

    /* renamed from: h */
    public int f4673h;

    /* renamed from: i */
    public final int[] f4674i = new int[2];

    public AbstractViewOnTouchListenerC1141x0(View view) {
        this.f4669d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4666a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4667b = tapTimeout;
        this.f4668c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m2760a() {
        RunnableC1139w0 runnableC1139w0 = this.f4671f;
        View view = this.f4669d;
        if (runnableC1139w0 != null) {
            view.removeCallbacks(runnableC1139w0);
        }
        RunnableC1139w0 runnableC1139w02 = this.f4670e;
        if (runnableC1139w02 != null) {
            view.removeCallbacks(runnableC1139w02);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0992C mo2562b();

    /* renamed from: c */
    public abstract boolean mo2563c();

    /* renamed from: d */
    public boolean mo2564d() {
        InterfaceC0992C interfaceC0992CMo2562b = mo2562b();
        if (interfaceC0992CMo2562b == null || !interfaceC0992CMo2562b.mo2541b()) {
            return true;
        }
        interfaceC0992CMo2562b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.AbstractViewOnTouchListenerC1141x0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4672g = false;
        this.f4673h = -1;
        RunnableC1139w0 runnableC1139w0 = this.f4670e;
        if (runnableC1139w0 != null) {
            this.f4669d.removeCallbacks(runnableC1139w0);
        }
    }
}
