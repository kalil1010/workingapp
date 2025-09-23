package p090e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p093e2.AbstractC0901d;
import p099h.C0974d;

/* renamed from: e.s */
/* loaded from: classes.dex */
public final class C0886s extends ContentFrameLayout {

    /* renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0888u f3636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886s(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u, C0974d c0974d) {
        super(c0974d, null);
        this.f3636i = layoutInflaterFactory2C0888u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3636i.m2264t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3636i;
                layoutInflaterFactory2C0888u.m2263r(layoutInflaterFactory2C0888u.m2270z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(AbstractC0901d.m2321x(getContext(), i2));
    }
}
