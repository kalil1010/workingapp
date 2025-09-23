package p105j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p002A1.ViewOnTouchListenerC0034p;
import p028K.AbstractC0241P;
import p045Q.AbstractC0448l;
import p048R.C0469b;
import p086d.AbstractC0843a;
import p093e2.AbstractC0901d;
import p102i.InterfaceC0992C;

/* renamed from: j.F0 */
/* loaded from: classes.dex */
public class C1034F0 implements InterfaceC0992C {

    /* renamed from: A */
    public static final Method f4349A;

    /* renamed from: B */
    public static final Method f4350B;

    /* renamed from: a */
    public final Context f4351a;

    /* renamed from: b */
    public ListAdapter f4352b;

    /* renamed from: c */
    public C1135u0 f4353c;

    /* renamed from: f */
    public int f4356f;

    /* renamed from: g */
    public int f4357g;

    /* renamed from: i */
    public boolean f4359i;

    /* renamed from: j */
    public boolean f4360j;

    /* renamed from: k */
    public boolean f4361k;

    /* renamed from: n */
    public C0469b f4364n;

    /* renamed from: o */
    public View f4365o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f4366p;

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f4367q;

    /* renamed from: v */
    public final Handler f4372v;

    /* renamed from: x */
    public Rect f4374x;

    /* renamed from: y */
    public boolean f4375y;

    /* renamed from: z */
    public final C1023A f4376z;

    /* renamed from: d */
    public final int f4354d = -2;

    /* renamed from: e */
    public int f4355e = -2;

    /* renamed from: h */
    public final int f4358h = 1002;

    /* renamed from: l */
    public int f4362l = 0;

    /* renamed from: m */
    public final int f4363m = Integer.MAX_VALUE;

    /* renamed from: r */
    public final RunnableC1030D0 f4368r = new RunnableC1030D0(this, 1);

    /* renamed from: s */
    public final ViewOnTouchListenerC0034p f4369s = new ViewOnTouchListenerC0034p(2, this);

    /* renamed from: t */
    public final C1032E0 f4370t = new C1032E0(this);

    /* renamed from: u */
    public final RunnableC1030D0 f4371u = new RunnableC1030D0(this, 0);

    /* renamed from: w */
    public final Rect f4373w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4349A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4350B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public C1034F0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f4351a = context;
        this.f4372v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3466p, i2, 0);
        this.f4356f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4357g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4359i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1023A c1023a = new C1023A(context, attributeSet, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3470t, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0448l.m1123c(c1023a, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1023a.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0901d.m2321x(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f4376z = c1023a;
        c1023a.setInputMethodMode(1);
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: b */
    public final boolean mo2541b() {
        return this.f4376z.isShowing();
    }

    /* renamed from: c */
    public final void m2624c(int i2) {
        this.f4356f = i2;
    }

    /* renamed from: d */
    public final int m2625d() {
        return this.f4356f;
    }

    @Override // p102i.InterfaceC0992C
    public final void dismiss() {
        C1023A c1023a = this.f4376z;
        c1023a.dismiss();
        c1023a.setContentView(null);
        this.f4353c = null;
        this.f4372v.removeCallbacks(this.f4368r);
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: f */
    public final C1135u0 mo2542f() {
        return this.f4353c;
    }

    @Override // p102i.InterfaceC0992C
    /* renamed from: i */
    public final void mo2543i() {
        int i2;
        int paddingBottom;
        C1135u0 c1135u0;
        C1135u0 c1135u02 = this.f4353c;
        C1023A c1023a = this.f4376z;
        Context context = this.f4351a;
        if (c1135u02 == null) {
            C1135u0 c1135u0Mo2631q = mo2631q(context, !this.f4375y);
            this.f4353c = c1135u0Mo2631q;
            c1135u0Mo2631q.setAdapter(this.f4352b);
            this.f4353c.setOnItemClickListener(this.f4366p);
            this.f4353c.setFocusable(true);
            this.f4353c.setFocusableInTouchMode(true);
            this.f4353c.setOnItemSelectedListener(new C1024A0(0, this));
            this.f4353c.setOnScrollListener(this.f4370t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4367q;
            if (onItemSelectedListener != null) {
                this.f4353c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1023a.setContentView(this.f4353c);
        }
        Drawable background = c1023a.getBackground();
        Rect rect = this.f4373w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f4359i) {
                this.f4357g = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iM2619a = AbstractC1026B0.m2619a(c1023a, this.f4365o, this.f4357g, c1023a.getInputMethodMode() == 2);
        int i4 = this.f4354d;
        if (i4 == -1) {
            paddingBottom = iM2619a + i2;
        } else {
            int i5 = this.f4355e;
            int iM2755a = this.f4353c.m2755a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM2619a);
            paddingBottom = iM2755a + (iM2755a > 0 ? this.f4353c.getPaddingBottom() + this.f4353c.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.f4376z.getInputMethodMode() == 2;
        AbstractC0448l.m1124d(c1023a, this.f4358h);
        if (c1023a.isShowing()) {
            View view = this.f4365o;
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            if (view.isAttachedToWindow()) {
                int width = this.f4355e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f4365o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c1023a.setWidth(this.f4355e == -1 ? -1 : 0);
                        c1023a.setHeight(0);
                    } else {
                        c1023a.setWidth(this.f4355e == -1 ? -1 : 0);
                        c1023a.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c1023a.setOutsideTouchable(true);
                int i6 = width;
                c1023a.update(this.f4365o, this.f4356f, this.f4357g, i6 < 0 ? -1 : i6, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f4355e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f4365o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c1023a.setWidth(width2);
        c1023a.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4349A;
            if (method != null) {
                try {
                    method.invoke(c1023a, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            AbstractC1028C0.m2621b(c1023a, true);
        }
        c1023a.setOutsideTouchable(true);
        c1023a.setTouchInterceptor(this.f4369s);
        if (this.f4361k) {
            AbstractC0448l.m1123c(c1023a, this.f4360j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4350B;
            if (method2 != null) {
                try {
                    method2.invoke(c1023a, this.f4374x);
                } catch (Exception unused2) {
                }
            }
        } else {
            AbstractC1028C0.m2620a(c1023a, this.f4374x);
        }
        c1023a.showAsDropDown(this.f4365o, this.f4356f, this.f4357g, this.f4362l);
        this.f4353c.setSelection(-1);
        if ((!this.f4375y || this.f4353c.isInTouchMode()) && (c1135u0 = this.f4353c) != null) {
            c1135u0.setListSelectionHidden(true);
            c1135u0.requestLayout();
        }
        if (this.f4375y) {
            return;
        }
        this.f4372v.post(this.f4371u);
    }

    /* renamed from: j */
    public final int m2626j() {
        if (this.f4359i) {
            return this.f4357g;
        }
        return 0;
    }

    /* renamed from: l */
    public final void m2627l(Drawable drawable) {
        this.f4376z.setBackgroundDrawable(drawable);
    }

    /* renamed from: m */
    public final void m2628m(int i2) {
        this.f4357g = i2;
        this.f4359i = true;
    }

    /* renamed from: n */
    public final Drawable m2629n() {
        return this.f4376z.getBackground();
    }

    /* renamed from: o */
    public void mo2630o(ListAdapter listAdapter) {
        C0469b c0469b = this.f4364n;
        if (c0469b == null) {
            this.f4364n = new C0469b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f4352b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0469b);
            }
        }
        this.f4352b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4364n);
        }
        C1135u0 c1135u0 = this.f4353c;
        if (c1135u0 != null) {
            c1135u0.setAdapter(this.f4352b);
        }
    }

    /* renamed from: q */
    public C1135u0 mo2631q(Context context, boolean z2) {
        return new C1135u0(context, z2);
    }

    /* renamed from: r */
    public final void m2632r(int i2) {
        Drawable background = this.f4376z.getBackground();
        if (background == null) {
            this.f4355e = i2;
            return;
        }
        Rect rect = this.f4373w;
        background.getPadding(rect);
        this.f4355e = rect.left + rect.right + i2;
    }
}
