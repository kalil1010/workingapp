package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p086d.AbstractC0843a;
import p105j.AbstractC1056Q0;
import p105j.C1077b;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f2075a;

    /* renamed from: b */
    public View f2076b;

    /* renamed from: c */
    public View f2077c;

    /* renamed from: d */
    public Drawable f2078d;

    /* renamed from: e */
    public Drawable f2079e;

    /* renamed from: f */
    public Drawable f2080f;

    /* renamed from: g */
    public final boolean f2081g;

    /* renamed from: h */
    public boolean f2082h;

    /* renamed from: i */
    public final int f2083i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1077b c1077b = new C1077b(this);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setBackground(c1077b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3451a);
        boolean z2 = false;
        this.f2078d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f2079e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f2083i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2081g = true;
            this.f2080f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2081g ? !(this.f2078d != null || this.f2079e != null) : this.f2080f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2078d;
        if (drawable != null && drawable.isStateful()) {
            this.f2078d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2079e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2079e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2080f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2080f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2078d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2079e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2080f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2076b = findViewById(R.id.action_bar);
        this.f2077c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2075a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f2081g) {
            Drawable drawable = this.f2080f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f2078d == null) {
                z3 = false;
            } else if (this.f2076b.getVisibility() == 0) {
                this.f2078d.setBounds(this.f2076b.getLeft(), this.f2076b.getTop(), this.f2076b.getRight(), this.f2076b.getBottom());
            } else {
                View view = this.f2077c;
                if (view == null || view.getVisibility() != 0) {
                    this.f2078d.setBounds(0, 0, 0, 0);
                } else {
                    this.f2078d.setBounds(this.f2077c.getLeft(), this.f2077c.getTop(), this.f2077c.getRight(), this.f2077c.getBottom());
                }
            }
            this.f2082h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f2076b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f2083i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f2076b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2078d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2078d);
        }
        this.f2078d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2076b;
            if (view != null) {
                this.f2078d.setBounds(view.getLeft(), this.f2076b.getTop(), this.f2076b.getRight(), this.f2076b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f2081g ? !(this.f2078d != null || this.f2079e != null) : this.f2080f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2080f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2080f);
        }
        this.f2080f = drawable;
        boolean z2 = this.f2081g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f2080f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f2078d != null || this.f2079e != null) : this.f2080f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f2079e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2079e);
        }
        this.f2079e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2082h && this.f2079e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f2081g ? !(this.f2078d != null || this.f2079e != null) : this.f2080f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC1056Q0 abstractC1056Q0) {
    }

    public void setTransitioning(boolean z2) {
        this.f2075a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f2078d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f2079e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f2080f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2078d;
        boolean z2 = this.f2081g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f2079e && this.f2082h) {
            return true;
        }
        return (drawable == this.f2080f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
