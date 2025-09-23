package p090e;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0646l;
import androidx.activity.C0656t;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.InterfaceC0753r;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p002A1.RunnableC0030l;
import p005B1.ViewOnClickListenerC0066d;
import p028K.AbstractC0231F;
import p028K.AbstractC0241P;
import p028K.InterfaceC0271k;
import p033L1.AbstractC0356d;
import p097g0.C0968d;
import p097g0.InterfaceC0969e;
import p099h.C0981k;
import p131s1.AbstractC1326c;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: e.f */
/* loaded from: classes.dex */
public final class DialogC0873f extends Dialog implements DialogInterface, InterfaceC0875h, InterfaceC0753r, InterfaceC0969e {

    /* renamed from: a */
    public C0755t f3601a;

    /* renamed from: b */
    public final C0646l f3602b;

    /* renamed from: c */
    public final C0656t f3603c;

    /* renamed from: d */
    public LayoutInflaterFactory2C0888u f3604d;

    /* renamed from: e */
    public final C0889v f3605e;

    /* renamed from: f */
    public final C0872e f3606f;

    /* JADX WARN: Type inference failed for: r2v4, types: [e.v] */
    public DialogC0873f(ContextThemeWrapper contextThemeWrapper, int i2) {
        int i3;
        int iM2207h = m2207h(contextThemeWrapper, i2);
        if (iM2207h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = iM2207h;
        }
        super(contextThemeWrapper, i3);
        this.f3602b = new C0646l(this);
        this.f3603c = new C0656t(new RunnableC0030l(10, this));
        this.f3605e = new InterfaceC0271k() { // from class: e.v
            @Override // p028K.InterfaceC0271k
            /* renamed from: d */
            public final boolean mo756d(KeyEvent keyEvent) {
                return this.f3707a.m2213j(keyEvent);
            }
        };
        AbstractC0878k abstractC0878kM2208c = m2208c();
        if (iM2207h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM2207h = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0888u) abstractC0878kM2208c).f3676T = iM2207h;
        abstractC0878kM2208c.mo2230d();
        this.f3606f = new C0872e(getContext(), this, getWindow());
    }

    /* renamed from: a */
    public static void m2206a(DialogC0873f dialogC0873f) {
        AbstractC1326c.m3062e(dialogC0873f, "this$0");
        super.onBackPressed();
    }

    /* renamed from: h */
    public static int m2207h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2208c();
        layoutInflaterFactory2C0888u.m2266v();
        ((ViewGroup) layoutInflaterFactory2C0888u.f3657A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0888u.f3693m.m2244a(layoutInflaterFactory2C0888u.f3692l.getCallback());
    }

    @Override // p097g0.InterfaceC0969e
    /* renamed from: b */
    public final C0968d mo1451b() {
        return (C0968d) this.f3602b.f2014c;
    }

    /* renamed from: c */
    public final AbstractC0878k m2208c() {
        if (this.f3604d == null) {
            ExecutorC0860A executorC0860A = AbstractC0878k.f3613a;
            this.f3604d = new LayoutInflaterFactory2C0888u(getContext(), getWindow(), this, this);
        }
        return this.f3604d;
    }

    /* renamed from: d */
    public final void m2209d(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1326c.m3061d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0656t c0656t = this.f3603c;
            c0656t.getClass();
            c0656t.f2040e = onBackInvokedDispatcher;
            c0656t.m1468c(c0656t.f2042g);
        }
        this.f3602b.m1458c(bundle);
        C0755t c0755t = this.f3601a;
        if (c0755t == null) {
            c0755t = new C0755t(this);
            this.f3601a = c0755t;
        }
        c0755t.m1782d(EnumC0747l.ON_CREATE);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2208c().mo2231e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0356d.m965o(this.f3605e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        C0755t c0755t = this.f3601a;
        if (c0755t != null) {
            return c0755t;
        }
        C0755t c0755t2 = new C0755t(this);
        this.f3601a = c0755t2;
        return c0755t2;
    }

    /* renamed from: f */
    public final void m2210f(Bundle bundle) {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2208c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0888u.f3691k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0888u);
        } else {
            boolean z2 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0888u;
        }
        m2209d(bundle);
        m2208c().mo2230d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2208c();
        layoutInflaterFactory2C0888u.m2266v();
        return layoutInflaterFactory2C0888u.f3692l.findViewById(i2);
    }

    /* renamed from: g */
    public final void m2211g() {
        C0755t c0755t = this.f3601a;
        if (c0755t == null) {
            c0755t = new C0755t(this);
            this.f3601a = c0755t;
        }
        c0755t.m1782d(EnumC0747l.ON_DESTROY);
        this.f3601a = null;
        super.onStop();
    }

    /* renamed from: i */
    public final void m2212i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2208c().mo2236l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m2208c().mo2229a();
    }

    /* renamed from: j */
    public final boolean m2213j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3603c.m1467b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        m2210f(bundle);
        C0872e c0872e = this.f3606f;
        c0872e.f3579b.setContentView(c0872e.f3594q);
        Window window = c0872e.f3580c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM2205a = C0872e.m2205a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM2205a2 = C0872e.m2205a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2205a3 = C0872e.m2205a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0872e.f3586i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0872e.f3586i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM2205a2.findViewById(android.R.id.message);
        c0872e.f3590m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0872e.f3586i.removeView(c0872e.f3590m);
            if (c0872e.f3582e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0872e.f3586i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0872e.f3586i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0872e.f3582e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM2205a2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM2205a3.findViewById(android.R.id.button1);
        c0872e.f3583f = button;
        ViewOnClickListenerC0066d viewOnClickListenerC0066d = c0872e.f3600w;
        button.setOnClickListener(viewOnClickListenerC0066d);
        if (TextUtils.isEmpty(null)) {
            c0872e.f3583f.setVisibility(8);
            i2 = 0;
        } else {
            c0872e.f3583f.setText((CharSequence) null);
            c0872e.f3583f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroupM2205a3.findViewById(android.R.id.button2);
        c0872e.f3584g = button2;
        button2.setOnClickListener(viewOnClickListenerC0066d);
        if (TextUtils.isEmpty(null)) {
            c0872e.f3584g.setVisibility(8);
        } else {
            c0872e.f3584g.setText((CharSequence) null);
            c0872e.f3584g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroupM2205a3.findViewById(android.R.id.button3);
        c0872e.f3585h = button3;
        button3.setOnClickListener(viewOnClickListenerC0066d);
        if (TextUtils.isEmpty(null)) {
            c0872e.f3585h.setVisibility(8);
        } else {
            c0872e.f3585h.setText((CharSequence) null);
            c0872e.f3585h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0872e.f3578a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0872e.f3583f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0872e.f3584g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0872e.f3585h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            viewGroupM2205a3.setVisibility(8);
        }
        if (c0872e.f3591n != null) {
            viewGroupM2205a.addView(c0872e.f3591n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0872e.f3588k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0872e.f3581d) || !c0872e.f3598u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0872e.f3588k.setVisibility(8);
                viewGroupM2205a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0872e.f3589l = textView2;
                textView2.setText(c0872e.f3581d);
                Drawable drawable = c0872e.f3587j;
                if (drawable != null) {
                    c0872e.f3588k.setImageDrawable(drawable);
                } else {
                    c0872e.f3589l.setPadding(c0872e.f3588k.getPaddingLeft(), c0872e.f3588k.getPaddingTop(), c0872e.f3588k.getPaddingRight(), c0872e.f3588k.getPaddingBottom());
                    c0872e.f3588k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM2205a == null || viewGroupM2205a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM2205a3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM2205a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0872e.f3586i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0872e.f3582e != null ? viewGroupM2205a.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM2205a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0872e.f3582e;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f2043a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f2044b);
        }
        if (!z2) {
            View view = c0872e.f3582e;
            if (view == null) {
                view = c0872e.f3586i;
            }
            if (view != null) {
                int i4 = (z3 ? 2 : 0) | i3;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                AbstractC0231F.m647d(view, i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM2205a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM2205a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0872e.f3582e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0872e.f3592o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0872e.f3593p;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3606f.f3586i;
        if (nestedScrollView == null || !nestedScrollView.m1568i(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3606f.f3586i;
        if (nestedScrollView == null || !nestedScrollView.m1568i(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC1326c.m3061d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f3602b.m1459d(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0755t c0755t = this.f3601a;
        if (c0755t == null) {
            c0755t = new C0755t(this);
            this.f3601a = c0755t;
        }
        c0755t.m1782d(EnumC0747l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2211g();
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2208c();
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h != null) {
            c0867h.f3548G = false;
            C0981k c0981k = c0867h.f3547F;
            if (c0981k != null) {
                c0981k.m2486a();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        m2208c().mo2233i(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        m2208c().mo2236l(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m2208c().mo2234j(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2208c().mo2235k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2212i(charSequence);
        C0872e c0872e = this.f3606f;
        c0872e.f3581d = charSequence;
        TextView textView = c0872e.f3589l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
