package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p093e2.AbstractC0901d;
import p145x0.AbstractC1395a;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: a */
    public final ValueAnimator f3425a;

    /* renamed from: b */
    public boolean f3426b;

    /* renamed from: c */
    public final ArrayList f3427c;

    /* renamed from: d */
    public final int f3428d;

    /* renamed from: e */
    public final float f3429e;

    /* renamed from: f */
    public final Paint f3430f;

    /* renamed from: g */
    public final RectF f3431g;

    /* renamed from: h */
    public final int f3432h;

    /* renamed from: i */
    public float f3433i;

    /* renamed from: j */
    public boolean f3434j;

    /* renamed from: k */
    public double f3435k;

    /* renamed from: l */
    public int f3436l;

    /* renamed from: m */
    public int f3437m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3425a = new ValueAnimator();
        this.f3427c = new ArrayList();
        Paint paint = new Paint();
        this.f3430f = paint;
        this.f3431g = new RectF();
        this.f3437m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6036e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0901d.m2304k0(context, R.attr.motionDurationLong2, 200);
        AbstractC0901d.m2306l0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1400a.f6067b);
        this.f3436l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3428d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f3432h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3429e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2146b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m2145a(int i2) {
        return i2 == 2 ? Math.round(this.f3436l * 0.66f) : this.f3436l;
    }

    /* renamed from: b */
    public final void m2146b(float f) {
        ValueAnimator valueAnimator = this.f3425a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f3433i = f2;
        this.f3435k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM2145a = m2145a(this.f3437m);
        float fCos = (((float) Math.cos(this.f3435k)) * fM2145a) + width;
        float fSin = (fM2145a * ((float) Math.sin(this.f3435k))) + height;
        float f3 = this.f3428d;
        this.f3431g.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f3427c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0837d) it.next());
            if (Math.abs(clockFaceView.f3418I - f2) > 0.001f) {
                clockFaceView.f3418I = f2;
                clockFaceView.m2144n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM2145a = m2145a(this.f3437m);
        float fCos = (((float) Math.cos(this.f3435k)) * fM2145a) + f;
        float f2 = height;
        float fSin = (fM2145a * ((float) Math.sin(this.f3435k))) + f2;
        Paint paint = this.f3430f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f3428d, paint);
        double dSin = Math.sin(this.f3435k);
        paint.setStrokeWidth(this.f3432h);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f3435k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f3429e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f3425a.isRunning()) {
            return;
        }
        m2146b(this.f3433i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f3434j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f3434j;
            if (this.f3426b) {
                this.f3437m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m2145a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f3434j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        boolean z6 = this.f3433i != f;
        if (z2 && z6) {
            z4 = true;
        } else if (z6 || z3) {
            m2146b(f);
            z4 = true;
        }
        this.f3434j = z5 | z4;
        return true;
    }
}
