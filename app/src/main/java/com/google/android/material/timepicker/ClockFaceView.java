package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p093e2.AbstractC0901d;
import p138v.C1364i;
import p138v.C1365j;
import p138v.C1369n;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0838e implements InterfaceC0837d {

    /* renamed from: A */
    public final C0836c f3410A;

    /* renamed from: B */
    public final int[] f3411B;

    /* renamed from: C */
    public final float[] f3412C;

    /* renamed from: D */
    public final int f3413D;

    /* renamed from: E */
    public final int f3414E;

    /* renamed from: F */
    public final int f3415F;

    /* renamed from: G */
    public final int f3416G;

    /* renamed from: H */
    public final String[] f3417H;

    /* renamed from: I */
    public float f3418I;

    /* renamed from: J */
    public final ColorStateList f3419J;

    /* renamed from: v */
    public final ClockHandView f3420v;

    /* renamed from: w */
    public final Rect f3421w;

    /* renamed from: x */
    public final RectF f3422x;

    /* renamed from: y */
    public final Rect f3423y;

    /* renamed from: z */
    public final SparseArray f3424z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3421w = new Rect();
        this.f3422x = new RectF();
        this.f3423y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3424z = sparseArray;
        this.f3412C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1395a.f6035d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM2318t = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 1);
        this.f3419J = colorStateListM2318t;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3420v = clockHandView;
        this.f3413D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM2318t.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM2318t.getDefaultColor());
        this.f3411B = new int[]{colorForState, colorForState, colorStateListM2318t.getDefaultColor()};
        clockHandView.f3427c.add(this);
        int defaultColor = AbstractC0356d.m969s(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM2318t2 = AbstractC0901d.m2318t(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM2318t2 != null ? colorStateListM2318t2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0835b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f3410A = new C0836c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3417H = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f3417H.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f3417H.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f3417H[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                AbstractC0241P.m701m(textView, this.f3410A);
                textView.setTextColor(this.f3419J);
            }
        }
        ClockHandView clockHandView2 = this.f3420v;
        if (clockHandView2.f3426b && !z2) {
            clockHandView2.f3437m = 1;
        }
        clockHandView2.f3426b = z2;
        clockHandView2.invalidate();
        this.f3414E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3415F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3416G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0838e
    /* renamed from: m */
    public final void mo2143m() {
        C1369n c1369n = new C1369n();
        c1369n.m3142b(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3444t * 0.66f) : this.f3444t;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c1369n.f5970c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1364i());
                }
                C1365j c1365j = ((C1364i) map2.get(Integer.valueOf(id))).f5866d;
                c1365j.f5936z = R.id.circle_center;
                c1365j.f5870A = iRound;
                c1365j.f5871B = size;
                size += 360.0f / list.size();
            }
        }
        c1369n.m3141a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f3424z;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    /* renamed from: n */
    public final void m2144n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f3420v.f3431g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f3424z;
            int size = sparseArray.size();
            rectF = this.f3422x;
            rect = this.f3421w;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3423y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3411B, this.f3412C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3417H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m2144n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f3416G / Math.max(Math.max(this.f3414E / displayMetrics.heightPixels, this.f3415F / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
