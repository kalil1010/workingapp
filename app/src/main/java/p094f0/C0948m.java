package p094f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002A1.RunnableC0042x;
import p007C0.C0085c;
import p028K.AbstractC0241P;

/* renamed from: f0.m */
/* loaded from: classes.dex */
public final class C0948m extends AbstractC0908G {

    /* renamed from: C */
    public static final int[] f3933C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f3934D = new int[0];

    /* renamed from: A */
    public int f3935A;

    /* renamed from: B */
    public final RunnableC0042x f3936B;

    /* renamed from: a */
    public final int f3937a;

    /* renamed from: b */
    public final int f3938b;

    /* renamed from: c */
    public final StateListDrawable f3939c;

    /* renamed from: d */
    public final Drawable f3940d;

    /* renamed from: e */
    public final int f3941e;

    /* renamed from: f */
    public final int f3942f;

    /* renamed from: g */
    public final StateListDrawable f3943g;

    /* renamed from: h */
    public final Drawable f3944h;

    /* renamed from: i */
    public final int f3945i;

    /* renamed from: j */
    public final int f3946j;

    /* renamed from: k */
    public int f3947k;

    /* renamed from: l */
    public int f3948l;

    /* renamed from: m */
    public float f3949m;

    /* renamed from: n */
    public int f3950n;

    /* renamed from: o */
    public int f3951o;

    /* renamed from: p */
    public float f3952p;

    /* renamed from: s */
    public final RecyclerView f3955s;

    /* renamed from: z */
    public final ValueAnimator f3962z;

    /* renamed from: q */
    public int f3953q = 0;

    /* renamed from: r */
    public int f3954r = 0;

    /* renamed from: t */
    public boolean f3956t = false;

    /* renamed from: u */
    public boolean f3957u = false;

    /* renamed from: v */
    public int f3958v = 0;

    /* renamed from: w */
    public int f3959w = 0;

    /* renamed from: x */
    public final int[] f3960x = new int[2];

    /* renamed from: y */
    public final int[] f3961y = new int[2];

    public C0948m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3962z = valueAnimatorOfFloat;
        this.f3935A = 0;
        RunnableC0042x runnableC0042x = new RunnableC0042x(12, this);
        this.f3936B = runnableC0042x;
        C0946k c0946k = new C0946k(this);
        this.f3939c = stateListDrawable;
        this.f3940d = drawable;
        this.f3943g = stateListDrawable2;
        this.f3944h = drawable2;
        this.f3941e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3942f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f3945i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3946j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3937a = i3;
        this.f3938b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0947l(this));
        valueAnimatorOfFloat.addUpdateListener(new C0085c(2, this));
        RecyclerView recyclerView2 = this.f3955s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0911J abstractC0911J = recyclerView2.f2827m;
            if (abstractC0911J != null) {
                abstractC0911J.mo1860c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2829n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1894O();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3955s;
            recyclerView3.f2831o.remove(this);
            if (recyclerView3.f2833p == this) {
                recyclerView3.f2833p = null;
            }
            ArrayList arrayList2 = this.f3955s.f2816g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0946k);
            }
            this.f3955s.removeCallbacks(runnableC0042x);
        }
        this.f3955s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1913g(this);
            this.f3955s.f2831o.add(this);
            this.f3955s.m1914h(c0946k);
        }
    }

    /* renamed from: f */
    public static int m2448f(float f, float f2, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f2 - f) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    @Override // p094f0.AbstractC0908G
    /* renamed from: c */
    public final void mo384c(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f3953q;
        RecyclerView recyclerView2 = this.f3955s;
        if (i2 != recyclerView2.getWidth() || this.f3954r != recyclerView2.getHeight()) {
            this.f3953q = recyclerView2.getWidth();
            this.f3954r = recyclerView2.getHeight();
            m2451g(0);
            return;
        }
        if (this.f3935A != 0) {
            if (this.f3956t) {
                int i3 = this.f3953q;
                int i4 = this.f3941e;
                int i5 = i3 - i4;
                int i6 = this.f3948l;
                int i7 = this.f3947k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f3939c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f3954r;
                int i10 = this.f3942f;
                Drawable drawable = this.f3940d;
                drawable.setBounds(0, 0, i10, i9);
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i4, -i8);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i8);
                }
            }
            if (this.f3957u) {
                int i11 = this.f3954r;
                int i12 = this.f3945i;
                int i13 = i11 - i12;
                int i14 = this.f3951o;
                int i15 = this.f3950n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f3943g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f3953q;
                int i18 = this.f3946j;
                Drawable drawable2 = this.f3944h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    /* renamed from: d */
    public final boolean m2449d(float f, float f2) {
        if (f2 < this.f3954r - this.f3945i) {
            return false;
        }
        int i2 = this.f3951o;
        int i3 = this.f3950n;
        return f >= ((float) (i2 - (i3 / 2))) && f <= ((float) ((i3 / 2) + i2));
    }

    /* renamed from: e */
    public final boolean m2450e(float f, float f2) {
        RecyclerView recyclerView = this.f3955s;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f3941e;
        if (!z2 ? f >= this.f3953q - i2 : f <= i2 / 2) {
            int i3 = this.f3948l;
            int i4 = this.f3947k / 2;
            if (f2 >= i3 - i4 && f2 <= i4 + i3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m2451g(int i2) {
        RunnableC0042x runnableC0042x = this.f3936B;
        StateListDrawable stateListDrawable = this.f3939c;
        if (i2 == 2 && this.f3958v != 2) {
            stateListDrawable.setState(f3933C);
            this.f3955s.removeCallbacks(runnableC0042x);
        }
        if (i2 == 0) {
            this.f3955s.invalidate();
        } else {
            m2452h();
        }
        if (this.f3958v == 2 && i2 != 2) {
            stateListDrawable.setState(f3934D);
            this.f3955s.removeCallbacks(runnableC0042x);
            this.f3955s.postDelayed(runnableC0042x, 1200);
        } else if (i2 == 1) {
            this.f3955s.removeCallbacks(runnableC0042x);
            this.f3955s.postDelayed(runnableC0042x, 1500);
        }
        this.f3958v = i2;
    }

    /* renamed from: h */
    public final void m2452h() {
        int i2 = this.f3935A;
        ValueAnimator valueAnimator = this.f3962z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3935A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
