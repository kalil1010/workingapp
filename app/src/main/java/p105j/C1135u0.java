package p105j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import p002A1.RunnableC0042x;
import p045Q.ViewOnTouchListenerC0443g;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.u0 */
/* loaded from: classes.dex */
public class C1135u0 extends ListView {

    /* renamed from: a */
    public final Rect f4641a;

    /* renamed from: b */
    public int f4642b;

    /* renamed from: c */
    public int f4643c;

    /* renamed from: d */
    public int f4644d;

    /* renamed from: e */
    public int f4645e;

    /* renamed from: f */
    public int f4646f;

    /* renamed from: g */
    public C1129s0 f4647g;

    /* renamed from: h */
    public boolean f4648h;

    /* renamed from: i */
    public final boolean f4649i;

    /* renamed from: j */
    public boolean f4650j;

    /* renamed from: k */
    public ViewOnTouchListenerC0443g f4651k;

    /* renamed from: l */
    public RunnableC0042x f4652l;

    public C1135u0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4641a = new Rect();
        this.f4642b = 0;
        this.f4643c = 0;
        this.f4644d = 0;
        this.f4645e = 0;
        this.f4649i = z2;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m2755a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2756b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.C1135u0.m2756b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4641a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4652l != null) {
            return;
        }
        super.drawableStateChanged();
        C1129s0 c1129s0 = this.f4647g;
        if (c1129s0 != null) {
            c1129s0.f4633b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4650j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4649i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4649i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4649i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4649i && this.f4648h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4652l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4652l == null) {
            RunnableC0042x runnableC0042x = new RunnableC0042x(14, this);
            this.f4652l = runnableC0042x;
            post(runnableC0042x);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !AbstractC1123q0.f4613d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1123q0.f4610a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1123q0.f4611b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1123q0.f4612c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4650j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4646f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0042x runnableC0042x = this.f4652l;
        if (runnableC0042x != null) {
            C1135u0 c1135u0 = (C1135u0) runnableC0042x.f95b;
            c1135u0.f4652l = null;
            c1135u0.removeCallbacks(runnableC0042x);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f4648h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1129s0 c1129s0 = null;
        if (drawable != null) {
            C1129s0 c1129s02 = new C1129s0();
            Drawable drawable2 = c1129s02.f4632a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1129s02.f4632a = drawable;
            drawable.setCallback(c1129s02);
            c1129s02.f4633b = true;
            c1129s0 = c1129s02;
        }
        this.f4647g = c1129s0;
        super.setSelector(c1129s0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4642b = rect.left;
        this.f4643c = rect.top;
        this.f4644d = rect.right;
        this.f4645e = rect.bottom;
    }
}
