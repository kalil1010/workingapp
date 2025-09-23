package p064W0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p001A0.C0002a;
import p002A1.C0013H;
import p002A1.RunnableC0030l;
import p002A1.ViewOnClickListenerC0022d;
import p028K.AbstractC0241P;
import p028K.C0247W;
import p031L.C0341k;
import p033L1.AbstractC0356d;
import p093e2.AbstractC0901d;
import p148y0.AbstractC1400a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.j */
/* loaded from: classes.dex */
public final class C0564j extends AbstractC0570p {

    /* renamed from: e */
    public final int f1757e;

    /* renamed from: f */
    public final int f1758f;

    /* renamed from: g */
    public final TimeInterpolator f1759g;

    /* renamed from: h */
    public AutoCompleteTextView f1760h;

    /* renamed from: i */
    public final ViewOnClickListenerC0022d f1761i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0555a f1762j;

    /* renamed from: k */
    public final C0013H f1763k;

    /* renamed from: l */
    public boolean f1764l;

    /* renamed from: m */
    public boolean f1765m;

    /* renamed from: n */
    public boolean f1766n;

    /* renamed from: o */
    public long f1767o;

    /* renamed from: p */
    public AccessibilityManager f1768p;

    /* renamed from: q */
    public ValueAnimator f1769q;

    /* renamed from: r */
    public ValueAnimator f1770r;

    public C0564j(C0569o c0569o) {
        super(c0569o);
        this.f1761i = new ViewOnClickListenerC0022d(3, this);
        this.f1762j = new ViewOnFocusChangeListenerC0555a(this, 1);
        this.f1763k = new C0013H(this);
        this.f1767o = Long.MAX_VALUE;
        this.f1758f = AbstractC0901d.m2304k0(c0569o.getContext(), R.attr.motionDurationShort3, 67);
        this.f1757e = AbstractC0901d.m2304k0(c0569o.getContext(), R.attr.motionDurationShort3, 50);
        this.f1759g = AbstractC0901d.m2306l0(c0569o.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1400a.f6066a);
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: a */
    public final void mo1333a() {
        if (this.f1768p.isTouchExplorationEnabled() && AbstractC0356d.m972w(this.f1760h) && !this.f1804d.hasFocus()) {
            this.f1760h.dismissDropDown();
        }
        this.f1760h.post(new RunnableC0030l(6, this));
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: c */
    public final int mo1334c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: d */
    public final int mo1335d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1336e() {
        return this.f1762j;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: f */
    public final View.OnClickListener mo1337f() {
        return this.f1761i;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: h */
    public final C0013H mo1346h() {
        return this.f1763k;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: i */
    public final boolean mo1347i(int i2) {
        return i2 != 0;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: j */
    public final boolean mo1348j() {
        return this.f1764l;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: l */
    public final boolean mo1349l() {
        return this.f1766n;
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: m */
    public final void mo1339m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1760h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: W0.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0564j c0564j = this.f1755a;
                c0564j.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0564j.f1767o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0564j.f1765m = false;
                    }
                    c0564j.m1353u();
                    c0564j.f1765m = true;
                    c0564j.f1767o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1760h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: W0.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0564j c0564j = this.f1756a;
                c0564j.f1765m = true;
                c0564j.f1767o = System.currentTimeMillis();
                c0564j.m1352t(false);
            }
        });
        this.f1760h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1801a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC0356d.m972w(editText) && this.f1768p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            this.f1804d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: n */
    public final void mo1350n(C0341k c0341k) {
        if (!AbstractC0356d.m972w(this.f1760h)) {
            c0341k.m929i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c0341k.f1085a.isShowingHintText() : c0341k.m925e(4)) {
            c0341k.m931k(null);
        }
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: o */
    public final void mo1351o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1768p.isEnabled() || AbstractC0356d.m972w(this.f1760h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1766n && !this.f1760h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m1353u();
            this.f1765m = true;
            this.f1767o = System.currentTimeMillis();
        }
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: r */
    public final void mo1341r() {
        int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1759g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f1758f);
        valueAnimatorOfFloat.addUpdateListener(new C0247W(i2, this));
        this.f1770r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f1757e);
        valueAnimatorOfFloat2.addUpdateListener(new C0247W(i2, this));
        this.f1769q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0002a(5, this));
        this.f1768p = (AccessibilityManager) this.f1803c.getSystemService("accessibility");
    }

    @Override // p064W0.AbstractC0570p
    /* renamed from: s */
    public final void mo1342s() {
        AutoCompleteTextView autoCompleteTextView = this.f1760h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1760h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m1352t(boolean z2) {
        if (this.f1766n != z2) {
            this.f1766n = z2;
            this.f1770r.cancel();
            this.f1769q.start();
        }
    }

    /* renamed from: u */
    public final void m1353u() {
        if (this.f1760h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f1767o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f1765m = false;
        }
        if (this.f1765m) {
            this.f1765m = false;
            return;
        }
        m1352t(!this.f1766n);
        if (!this.f1766n) {
            this.f1760h.dismissDropDown();
        } else {
            this.f1760h.requestFocus();
            this.f1760h.showDropDown();
        }
    }
}
