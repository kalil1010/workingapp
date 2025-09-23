package p105j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p002A1.C0027i;
import p028K.AbstractC0241P;
import p086d.AbstractC0843a;

/* renamed from: j.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC1145z0 extends ViewGroup {

    /* renamed from: a */
    public boolean f4682a;

    /* renamed from: b */
    public int f4683b;

    /* renamed from: c */
    public int f4684c;

    /* renamed from: d */
    public int f4685d;

    /* renamed from: e */
    public int f4686e;

    /* renamed from: f */
    public int f4687f;

    /* renamed from: g */
    public float f4688g;

    /* renamed from: h */
    public boolean f4689h;

    /* renamed from: i */
    public int[] f4690i;

    /* renamed from: j */
    public int[] f4691j;

    /* renamed from: k */
    public Drawable f4692k;

    /* renamed from: l */
    public int f4693l;

    /* renamed from: m */
    public int f4694m;

    /* renamed from: n */
    public int f4695n;

    /* renamed from: o */
    public int f4696o;

    public AbstractC1145z0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4682a = true;
        this.f4683b = -1;
        this.f4684c = 0;
        this.f4686e = 8388659;
        int[] iArr = AbstractC0843a.f3465o;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, i2);
        AbstractC0241P.m700l(this, context, iArr, attributeSet, (TypedArray) c0027iM98N.f66c, i2);
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f4688g = typedArray.getFloat(4, -1.0f);
        this.f4683b = typedArray.getInt(3, -1);
        this.f4689h = typedArray.getBoolean(7, false);
        setDividerDrawable(c0027iM98N.m100B(5));
        this.f4695n = typedArray.getInt(8, 0);
        this.f4696o = typedArray.getDimensionPixelSize(6, 0);
        c0027iM98N.m114R();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1143y0;
    }

    /* renamed from: f */
    public final void m2761f(Canvas canvas, int i2) {
        this.f4692k.setBounds(getPaddingLeft() + this.f4696o, i2, (getWidth() - getPaddingRight()) - this.f4696o, this.f4694m + i2);
        this.f4692k.draw(canvas);
    }

    /* renamed from: g */
    public final void m2762g(Canvas canvas, int i2) {
        this.f4692k.setBounds(i2, getPaddingTop() + this.f4696o, this.f4693l + i2, (getHeight() - getPaddingBottom()) - this.f4696o);
        this.f4692k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f4683b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f4683b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4683b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f4684c;
        if (this.f4685d == 1 && (i2 = this.f4686e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4687f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4687f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1143y0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4683b;
    }

    public Drawable getDividerDrawable() {
        return this.f4692k;
    }

    public int getDividerPadding() {
        return this.f4696o;
    }

    public int getDividerWidth() {
        return this.f4693l;
    }

    public int getGravity() {
        return this.f4686e;
    }

    public int getOrientation() {
        return this.f4685d;
    }

    public int getShowDividers() {
        return this.f4695n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4688g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1143y0 generateDefaultLayoutParams() {
        int i2 = this.f4685d;
        if (i2 == 0) {
            return new C1143y0(-2, -2);
        }
        if (i2 == 1) {
            return new C1143y0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1143y0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1143y0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1143y0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1143y0(layoutParams);
    }

    /* renamed from: k */
    public final boolean m2763k(int i2) {
        if (i2 == 0) {
            return (this.f4695n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f4695n & 4) != 0;
        }
        if ((this.f4695n & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f4692k == null) {
            return;
        }
        int i3 = 0;
        if (this.f4685d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && m2763k(i3)) {
                    m2761f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1143y0) childAt.getLayoutParams())).topMargin) - this.f4694m);
                }
                i3++;
            }
            if (m2763k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2761f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4694m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1143y0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM2754a = AbstractC1133t1.m2754a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2763k(i3)) {
                C1143y0 c1143y0 = (C1143y0) childAt3.getLayoutParams();
                m2762g(canvas, zM2754a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1143y0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1143y0).leftMargin) - this.f4693l);
            }
            i3++;
        }
        if (m2763k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1143y0 c1143y02 = (C1143y0) childAt4.getLayoutParams();
                if (zM2754a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1143y02).leftMargin;
                    i2 = this.f4693l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1143y02).rightMargin;
                }
            } else if (zM2754a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f4693l;
                right = left - i2;
            }
            m2762g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.AbstractC1145z0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.AbstractC1145z0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f4682a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f4683b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4692k) {
            return;
        }
        this.f4692k = drawable;
        if (drawable != null) {
            this.f4693l = drawable.getIntrinsicWidth();
            this.f4694m = drawable.getIntrinsicHeight();
        } else {
            this.f4693l = 0;
            this.f4694m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f4696o = i2;
    }

    public void setGravity(int i2) {
        if (this.f4686e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f4686e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f4686e;
        if ((8388615 & i4) != i3) {
            this.f4686e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f4689h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f4685d != i2) {
            this.f4685d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f4695n) {
            requestLayout();
        }
        this.f4695n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f4686e;
        if ((i4 & 112) != i3) {
            this.f4686e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f4688g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
