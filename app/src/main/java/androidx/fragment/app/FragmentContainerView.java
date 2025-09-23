package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p028K.AbstractC0228C;
import p028K.AbstractC0241P;
import p028K.C0292u0;
import p069Y.AbstractC0600a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public ArrayList f2487a;

    /* renamed from: b */
    public ArrayList f2488b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f2489c;

    /* renamed from: d */
    public boolean f2490d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f2490d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0600a.f1908b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    /* renamed from: a */
    public final void m1696a(View view) {
        ArrayList arrayList = this.f2488b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2487a == null) {
            this.f2487a = new ArrayList();
        }
        this.f2487a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0712o ? (AbstractComponentCallbacksC0712o) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0712o ? (AbstractComponentCallbacksC0712o) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0292u0 c0292u0M817g;
        C0292u0 c0292u0M817g2 = C0292u0.m817g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2489c;
        if (onApplyWindowInsetsListener != null) {
            c0292u0M817g = C0292u0.m817g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            WindowInsets windowInsetsM822f = c0292u0M817g2.m822f();
            if (windowInsetsM822f != null) {
                WindowInsets windowInsetsM616b = AbstractC0228C.m616b(this, windowInsetsM822f);
                if (!windowInsetsM616b.equals(windowInsetsM822f)) {
                    c0292u0M817g2 = C0292u0.m817g(this, windowInsetsM616b);
                }
            }
            c0292u0M817g = c0292u0M817g2;
        }
        if (!c0292u0M817g.f910a.mo805m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AbstractC0241P.m690b(getChildAt(i2), c0292u0M817g);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f2490d && this.f2487a != null) {
            for (int i2 = 0; i2 < this.f2487a.size(); i2++) {
                super.drawChild(canvas, (View) this.f2487a.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f2490d || (arrayList = this.f2487a) == null || arrayList.size() <= 0 || !this.f2487a.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f2488b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2487a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2490d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m1696a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            m1696a(view);
        }
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m1696a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        m1696a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m1696a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m1696a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m1696a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f2490d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2489c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2488b == null) {
                this.f2488b = new ArrayList();
            }
            this.f2488b.add(view);
        }
        super.startViewTransition(view);
    }
}
