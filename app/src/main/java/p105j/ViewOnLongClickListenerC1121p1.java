package p105j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p028K.AbstractC0241P;
import p028K.AbstractC0243S;
import p028K.AbstractC0245U;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.p1 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC1121p1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC1121p1 f4594k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC1121p1 f4595l;

    /* renamed from: a */
    public final View f4596a;

    /* renamed from: b */
    public final CharSequence f4597b;

    /* renamed from: c */
    public final int f4598c;

    /* renamed from: d */
    public final RunnableC1118o1 f4599d;

    /* renamed from: e */
    public final RunnableC1118o1 f4600e;

    /* renamed from: f */
    public int f4601f;

    /* renamed from: g */
    public int f4602g;

    /* renamed from: h */
    public C1124q1 f4603h;

    /* renamed from: i */
    public boolean f4604i;

    /* renamed from: j */
    public boolean f4605j;

    /* JADX WARN: Type inference failed for: r0v0, types: [j.o1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [j.o1] */
    public ViewOnLongClickListenerC1121p1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f4599d = new Runnable(this) { // from class: j.o1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1121p1 f4590b;

            {
                this.f4590b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f4590b.m2737c(false);
                        break;
                    default:
                        this.f4590b.m2736a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f4600e = new Runnable(this) { // from class: j.o1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC1121p1 f4590b;

            {
                this.f4590b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        this.f4590b.m2737c(false);
                        break;
                    default:
                        this.f4590b.m2736a();
                        break;
                }
            }
        };
        this.f4596a = view;
        this.f4597b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0245U.f821a;
        this.f4598c = Build.VERSION.SDK_INT >= 28 ? AbstractC0243S.m705a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f4605j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m2735b(ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p1) {
        ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p12 = f4594k;
        if (viewOnLongClickListenerC1121p12 != null) {
            viewOnLongClickListenerC1121p12.f4596a.removeCallbacks(viewOnLongClickListenerC1121p12.f4599d);
        }
        f4594k = viewOnLongClickListenerC1121p1;
        if (viewOnLongClickListenerC1121p1 != null) {
            viewOnLongClickListenerC1121p1.f4596a.postDelayed(viewOnLongClickListenerC1121p1.f4599d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m2736a() {
        ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p1 = f4595l;
        View view = this.f4596a;
        if (viewOnLongClickListenerC1121p1 == this) {
            f4595l = null;
            C1124q1 c1124q1 = this.f4603h;
            if (c1124q1 != null) {
                View view2 = c1124q1.f4615b;
                if (view2.getParent() != null) {
                    ((WindowManager) c1124q1.f4614a.getSystemService("window")).removeView(view2);
                }
                this.f4603h = null;
                this.f4605j = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f4594k == this) {
            m2735b(null);
        }
        view.removeCallbacks(this.f4600e);
    }

    /* renamed from: c */
    public final void m2737c(boolean z2) throws Resources.NotFoundException {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j2;
        long j3;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        View view = this.f4596a;
        if (view.isAttachedToWindow()) {
            m2735b(null);
            ViewOnLongClickListenerC1121p1 viewOnLongClickListenerC1121p1 = f4595l;
            if (viewOnLongClickListenerC1121p1 != null) {
                viewOnLongClickListenerC1121p1.m2736a();
            }
            f4595l = this;
            this.f4604i = z2;
            C1124q1 c1124q1 = new C1124q1(view.getContext());
            this.f4603h = c1124q1;
            int width = this.f4601f;
            int i7 = this.f4602g;
            boolean z3 = this.f4604i;
            View view2 = c1124q1.f4615b;
            ViewParent parent = view2.getParent();
            Context context = c1124q1.f4614a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            c1124q1.f4616c.setText(this.f4597b);
            WindowManager.LayoutParams layoutParams = c1124q1.f4617d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i7 + dimensionPixelOffset2;
                i2 = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                i6 = 1;
            } else {
                Rect rect = c1124q1.f4618e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = width;
                    i4 = i2;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i3 = width;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = c1124q1.f4620g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = c1124q1.f4619f;
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i8;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i8 + i3) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i6];
                int i10 = ((i9 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f4604i) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC1118o1 runnableC1118o1 = this.f4600e;
            view.removeCallbacks(runnableC1118o1);
            view.postDelayed(runnableC1118o1, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            j.q1 r4 = r3.f4603h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f4604i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f4596a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f4605j = r4
            r3.m2736a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            j.q1 r4 = r3.f4603h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f4605j
            if (r1 != 0) goto L66
            int r1 = r3.f4601f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f4598c
            if (r1 > r2) goto L66
            int r1 = r3.f4602g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f4601f = r4
            r3.f4602g = r5
            r3.f4605j = r0
            m2735b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p105j.ViewOnLongClickListenerC1121p1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f4601f = view.getWidth() / 2;
        this.f4602g = view.getHeight() / 2;
        m2737c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m2736a();
    }
}
