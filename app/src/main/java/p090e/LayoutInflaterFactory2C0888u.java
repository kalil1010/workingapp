package p090e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0703f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p002A1.C0027i;
import p017G.AbstractC0157f;
import p017G.C0158g;
import p017G.C0159h;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p028K.C0248X;
import p033L1.AbstractC0364l;
import p086d.AbstractC0843a;
import p099h.AbstractC0971a;
import p099h.C0974d;
import p099h.C0979i;
import p102i.C1008n;
import p102i.InterfaceC1004j;
import p102i.MenuC1006l;
import p105j.AbstractC1133t1;
import p105j.C1089f;
import p105j.C1097h1;
import p105j.C1104k;
import p105j.C1112m1;
import p105j.C1131t;
import p105j.InterfaceC1111m0;
import p105j.InterfaceC1114n0;
import p119o.C1249k;

/* renamed from: e.u */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0888u extends AbstractC0878k implements InterfaceC1004j, LayoutInflater.Factory2 {

    /* renamed from: h0 */
    public static final C1249k f3653h0 = new C1249k();

    /* renamed from: i0 */
    public static final int[] f3654i0 = {R.attr.windowBackground};

    /* renamed from: j0 */
    public static final boolean f3655j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: k0 */
    public static final boolean f3656k0 = true;

    /* renamed from: A */
    public ViewGroup f3657A;

    /* renamed from: B */
    public TextView f3658B;

    /* renamed from: C */
    public View f3659C;

    /* renamed from: D */
    public boolean f3660D;

    /* renamed from: E */
    public boolean f3661E;

    /* renamed from: F */
    public boolean f3662F;

    /* renamed from: G */
    public boolean f3663G;

    /* renamed from: H */
    public boolean f3664H;

    /* renamed from: I */
    public boolean f3665I;

    /* renamed from: J */
    public boolean f3666J;

    /* renamed from: K */
    public boolean f3667K;

    /* renamed from: L */
    public C0887t[] f3668L;

    /* renamed from: M */
    public C0887t f3669M;

    /* renamed from: N */
    public boolean f3670N;

    /* renamed from: O */
    public boolean f3671O;

    /* renamed from: P */
    public boolean f3672P;

    /* renamed from: Q */
    public boolean f3673Q;

    /* renamed from: R */
    public Configuration f3674R;

    /* renamed from: S */
    public final int f3675S;

    /* renamed from: T */
    public int f3676T;

    /* renamed from: U */
    public int f3677U;

    /* renamed from: V */
    public boolean f3678V;

    /* renamed from: W */
    public C0885r f3679W;

    /* renamed from: X */
    public C0885r f3680X;

    /* renamed from: Y */
    public boolean f3681Y;

    /* renamed from: Z */
    public int f3682Z;

    /* renamed from: b0 */
    public boolean f3684b0;

    /* renamed from: c0 */
    public Rect f3685c0;

    /* renamed from: d0 */
    public Rect f3686d0;

    /* renamed from: e0 */
    public C0891x f3687e0;

    /* renamed from: f0 */
    public OnBackInvokedDispatcher f3688f0;

    /* renamed from: g0 */
    public OnBackInvokedCallback f3689g0;

    /* renamed from: j */
    public final Object f3690j;

    /* renamed from: k */
    public final Context f3691k;

    /* renamed from: l */
    public Window f3692l;

    /* renamed from: m */
    public WindowCallbackC0884q f3693m;

    /* renamed from: n */
    public final Object f3694n;

    /* renamed from: o */
    public C0867H f3695o;

    /* renamed from: p */
    public C0979i f3696p;

    /* renamed from: q */
    public CharSequence f3697q;

    /* renamed from: r */
    public InterfaceC1111m0 f3698r;

    /* renamed from: s */
    public C0880m f3699s;

    /* renamed from: t */
    public C0880m f3700t;

    /* renamed from: u */
    public AbstractC0971a f3701u;

    /* renamed from: v */
    public ActionBarContextView f3702v;

    /* renamed from: w */
    public PopupWindow f3703w;

    /* renamed from: x */
    public RunnableC0879l f3704x;

    /* renamed from: z */
    public boolean f3706z;

    /* renamed from: y */
    public C0248X f3705y = null;

    /* renamed from: a0 */
    public final RunnableC0879l f3683a0 = new RunnableC0879l(this, 0);

    public LayoutInflaterFactory2C0888u(Context context, Window window, InterfaceC0875h interfaceC0875h, Object obj) {
        AbstractActivityC0874g abstractActivityC0874g;
        this.f3675S = -100;
        this.f3691k = context;
        this.f3694n = interfaceC0875h;
        this.f3690j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0874g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0874g = (AbstractActivityC0874g) context;
                    break;
                }
            }
            abstractActivityC0874g = null;
            if (abstractActivityC0874g != null) {
                this.f3675S = ((LayoutInflaterFactory2C0888u) abstractActivityC0874g.m2215i()).f3675S;
            }
        }
        if (this.f3675S == -100) {
            C1249k c1249k = f3653h0;
            Integer num = (Integer) c1249k.getOrDefault(this.f3690j.getClass().getName(), null);
            if (num != null) {
                this.f3675S = num.intValue();
                c1249k.remove(this.f3690j.getClass().getName());
            }
        }
        if (window != null) {
            m2260n(window);
        }
        C1131t.m2751d();
    }

    /* renamed from: o */
    public static C0158g m2248o(Context context) {
        C0158g c0158g;
        C0158g c0158g2;
        if (Build.VERSION.SDK_INT >= 33 || (c0158g = AbstractC0878k.f3615c) == null) {
            return null;
        }
        C0158g c0158gM2238b = AbstractC0882o.m2238b(context.getApplicationContext().getResources().getConfiguration());
        C0159h c0159h = c0158g.f536a;
        if (c0159h.f537a.isEmpty()) {
            c0158g2 = C0158g.f535b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < c0158gM2238b.f536a.f537a.size() + c0159h.f537a.size()) {
                Locale locale = i2 < c0159h.f537a.size() ? c0159h.f537a.get(i2) : c0158gM2238b.f536a.f537a.get(i2 - c0159h.f537a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c0158g2 = new C0158g(new C0159h(AbstractC0157f.m422a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0158g2.f536a.f537a.isEmpty() ? c0158gM2238b : c0158g2;
    }

    /* renamed from: s */
    public static Configuration m2249s(Context context, int i2, C0158g c0158g, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c0158g != null) {
            AbstractC0882o.m2240d(configuration2, c0158g);
        }
        return configuration2;
    }

    /* renamed from: A */
    public final void m2250A() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2266v();
        if (this.f3662F && this.f3695o == null) {
            Object obj = this.f3690j;
            if (obj instanceof Activity) {
                this.f3695o = new C0867H((Activity) obj, this.f3663G);
            } else if (obj instanceof Dialog) {
                this.f3695o = new C0867H((Dialog) obj);
            }
            C0867H c0867h = this.f3695o;
            if (c0867h != null) {
                c0867h.m2202O(this.f3684b0);
            }
        }
    }

    /* renamed from: B */
    public final void m2251B(int i2) {
        this.f3682Z = (1 << i2) | this.f3682Z;
        if (this.f3681Y) {
            return;
        }
        View decorView = this.f3692l.getDecorView();
        RunnableC0879l runnableC0879l = this.f3683a0;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        decorView.postOnAnimation(runnableC0879l);
        this.f3681Y = true;
    }

    /* renamed from: C */
    public final int m2252C(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f3680X == null) {
                            this.f3680X = new C0885r(this, context);
                        }
                        return this.f3680X.mo1729f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2269y(context).mo1729f();
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: D */
    public final boolean m2253D() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC1114n0 interfaceC1114n0;
        C1097h1 c1097h1;
        boolean z2 = this.f3670N;
        this.f3670N = false;
        C0887t c0887tM2270z = m2270z(0);
        if (!c0887tM2270z.f3649m) {
            AbstractC0971a abstractC0971a = this.f3701u;
            if (abstractC0971a != null) {
                abstractC0971a.mo2185a();
                return true;
            }
            m2250A();
            C0867H c0867h = this.f3695o;
            if (c0867h == null || (interfaceC1114n0 = c0867h.f3557r) == null || (c1097h1 = ((C1112m1) interfaceC1114n0).f4568a.f2211L) == null || c1097h1.f4511b == null) {
                return false;
            }
            C1097h1 c1097h12 = ((C1112m1) interfaceC1114n0).f4568a.f2211L;
            C1008n c1008n = c1097h12 == null ? null : c1097h12.f4511b;
            if (c1008n != null) {
                c1008n.collapseActionView();
            }
        } else if (!z2) {
            m2263r(c0887tM2270z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r15.f4243f.getCount() > 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2254E(p090e.C0887t r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.m2254E(e.t, android.view.KeyEvent):void");
    }

    /* renamed from: F */
    public final boolean m2255F(C0887t c0887t, int i2, KeyEvent keyEvent) {
        MenuC1006l menuC1006l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0887t.f3647k || m2256G(c0887t, keyEvent)) && (menuC1006l = c0887t.f3644h) != null) {
            return menuC1006l.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2256G(p090e.C0887t r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.m2256G(e.t, android.view.KeyEvent):boolean");
    }

    /* renamed from: H */
    public final void m2257H() {
        if (this.f3706z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    public final void m2258I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f3688f0 != null && (m2270z(0).f3649m || this.f3701u != null)) {
                z2 = true;
            }
            if (z2 && this.f3689g0 == null) {
                this.f3689g0 = AbstractC0883p.m2242b(this.f3688f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f3689g0) == null) {
                    return;
                }
                AbstractC0883p.m2243c(this.f3688f0, onBackInvokedCallback);
            }
        }
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: a */
    public final void mo2229a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f3695o != null) {
            m2250A();
            this.f3695o.getClass();
            m2251B(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m2726i() != false) goto L20;
     */
    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1073c(p102i.MenuC1006l r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.mo1073c(i.l):void");
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: d */
    public final void mo2230d() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strM986J;
        this.f3671O = true;
        m2259m(false, true);
        m2267w();
        Object obj = this.f3690j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM986J = AbstractC0364l.m986J(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (IllegalArgumentException unused) {
                strM986J = null;
            }
            if (strM986J != null) {
                C0867H c0867h = this.f3695o;
                if (c0867h == null) {
                    this.f3684b0 = true;
                } else {
                    c0867h.m2202O(true);
                }
            }
            synchronized (AbstractC0878k.f3620h) {
                AbstractC0878k.m2228f(this);
                AbstractC0878k.f3619g.add(new WeakReference(this));
            }
        }
        this.f3674R = new Configuration(this.f3691k.getResources().getConfiguration());
        this.f3672P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p090e.AbstractC0878k
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2231e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3690j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p090e.AbstractC0878k.f3620h
            monitor-enter(r0)
            p090e.AbstractC0878k.m2228f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f3681Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f3692l
            android.view.View r0 = r0.getDecorView()
            e.l r1 = r3.f3683a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f3673Q = r0
            int r0 = r3.f3675S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f3690j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            o.k r0 = p090e.LayoutInflaterFactory2C0888u.f3653h0
            java.lang.Object r1 = r3.f3690j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f3675S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            o.k r0 = p090e.LayoutInflaterFactory2C0888u.f3653h0
            java.lang.Object r1 = r3.f3690j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.r r0 = r3.f3679W
            if (r0 == 0) goto L63
            r0.m1726c()
        L63:
            e.r r0 = r3.f3680X
            if (r0 == 0) goto L6a
            r0.m1726c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.mo2231e():void");
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: g */
    public final boolean mo2232g(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.f3666J && i2 == 108) {
            return false;
        }
        if (this.f3662F && i2 == 1) {
            this.f3662F = false;
        }
        if (i2 == 1) {
            m2257H();
            this.f3666J = true;
            return true;
        }
        if (i2 == 2) {
            m2257H();
            this.f3660D = true;
            return true;
        }
        if (i2 == 5) {
            m2257H();
            this.f3661E = true;
            return true;
        }
        if (i2 == 10) {
            m2257H();
            this.f3664H = true;
            return true;
        }
        if (i2 == 108) {
            m2257H();
            this.f3662F = true;
            return true;
        }
        if (i2 != 109) {
            return this.f3692l.requestFeature(i2);
        }
        m2257H();
        this.f3663G = true;
        return true;
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public final boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        C0887t c0887t;
        Window.Callback callback = this.f3692l.getCallback();
        if (callback != null && !this.f3673Q) {
            MenuC1006l menuC1006lMo2557k = menuC1006l.mo2557k();
            C0887t[] c0887tArr = this.f3668L;
            int length = c0887tArr != null ? c0887tArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c0887t = c0887tArr[i2];
                    if (c0887t != null && c0887t.f3644h == menuC1006lMo2557k) {
                        break;
                    }
                    i2++;
                } else {
                    c0887t = null;
                    break;
                }
            }
            if (c0887t != null) {
                return callback.onMenuItemSelected(c0887t.f3637a, menuItem);
            }
        }
        return false;
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: i */
    public final void mo2233i(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2266v();
        ViewGroup viewGroup = (ViewGroup) this.f3657A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3691k).inflate(i2, viewGroup);
        this.f3693m.m2244a(this.f3692l.getCallback());
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: j */
    public final void mo2234j(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2266v();
        ViewGroup viewGroup = (ViewGroup) this.f3657A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3693m.m2244a(this.f3692l.getCallback());
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: k */
    public final void mo2235k(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2266v();
        ViewGroup viewGroup = (ViewGroup) this.f3657A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3693m.m2244a(this.f3692l.getCallback());
    }

    @Override // p090e.AbstractC0878k
    /* renamed from: l */
    public final void mo2236l(CharSequence charSequence) {
        this.f3697q = charSequence;
        InterfaceC1111m0 interfaceC1111m0 = this.f3698r;
        if (interfaceC1111m0 != null) {
            interfaceC1111m0.setWindowTitle(charSequence);
            return;
        }
        C0867H c0867h = this.f3695o;
        if (c0867h == null) {
            TextView textView = this.f3658B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1112m1 c1112m1 = (C1112m1) c0867h.f3557r;
        if (c1112m1.f4574g) {
            return;
        }
        c1112m1.f4575h = charSequence;
        if ((c1112m1.f4569b & 8) != 0) {
            Toolbar toolbar = c1112m1.f4568a;
            toolbar.setTitle(charSequence);
            if (c1112m1.f4574g) {
                AbstractC0241P.m702n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2259m(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.m2259m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2260n(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.f3692l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L66
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof p090e.WindowCallbackC0884q
            if (r2 != 0) goto L60
            e.q r1 = new e.q
            r1.<init>(r3, r0)
            r3.f3693m = r1
            r4.setCallback(r1)
            int[] r0 = p090e.LayoutInflaterFactory2C0888u.f3654i0
            android.content.Context r1 = r3.f3691k
            r2 = 0
            A1.i r0 = p002A1.C0027i.m97M(r1, r2, r0)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.m101C(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.m114R()
            r3.f3692l = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L5f
            android.window.OnBackInvokedDispatcher r4 = r3.f3688f0
            if (r4 != 0) goto L5f
            if (r4 == 0) goto L45
            android.window.OnBackInvokedCallback r0 = r3.f3689g0
            if (r0 == 0) goto L45
            p090e.AbstractC0883p.m2243c(r4, r0)
            r3.f3689g0 = r2
        L45:
            java.lang.Object r4 = r3.f3690j
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L5a
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L5a
            android.window.OnBackInvokedDispatcher r4 = p090e.AbstractC0883p.m2241a(r4)
            r3.f3688f0 = r4
            goto L5c
        L5a:
            r3.f3688f0 = r2
        L5c:
            r3.m2258I()
        L5f:
            return
        L60:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L66:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.m2260n(android.view.Window):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: p */
    public final void m2261p(int i2, C0887t c0887t, MenuC1006l menuC1006l) {
        if (menuC1006l == null) {
            if (c0887t == null && i2 >= 0) {
                C0887t[] c0887tArr = this.f3668L;
                if (i2 < c0887tArr.length) {
                    c0887t = c0887tArr[i2];
                }
            }
            if (c0887t != null) {
                menuC1006l = c0887t.f3644h;
            }
        }
        if ((c0887t == null || c0887t.f3649m) && !this.f3673Q) {
            WindowCallbackC0884q windowCallbackC0884q = this.f3693m;
            Window.Callback callback = this.f3692l.getCallback();
            windowCallbackC0884q.getClass();
            try {
                windowCallbackC0884q.f3631d = true;
                callback.onPanelClosed(i2, menuC1006l);
            } finally {
                windowCallbackC0884q.f3631d = false;
            }
        }
    }

    /* renamed from: q */
    public final void m2262q(MenuC1006l menuC1006l) {
        C1104k c1104k;
        if (this.f3667K) {
            return;
        }
        this.f3667K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3698r;
        actionBarOverlayLayout.m1490k();
        ActionMenuView actionMenuView = ((C1112m1) actionBarOverlayLayout.f2110e).f4568a.f2217a;
        if (actionMenuView != null && (c1104k = actionMenuView.f2136t) != null) {
            c1104k.m2725f();
            C1089f c1089f = c1104k.f4550u;
            if (c1089f != null && c1089f.m2594b()) {
                c1089f.f4327i.dismiss();
            }
        }
        Window.Callback callback = this.f3692l.getCallback();
        if (callback != null && !this.f3673Q) {
            callback.onPanelClosed(108, menuC1006l);
        }
        this.f3667K = false;
    }

    /* renamed from: r */
    public final void m2263r(C0887t c0887t, boolean z2) {
        C0886s c0886s;
        InterfaceC1111m0 interfaceC1111m0;
        C1104k c1104k;
        if (z2 && c0887t.f3637a == 0 && (interfaceC1111m0 = this.f3698r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1111m0;
            actionBarOverlayLayout.m1490k();
            ActionMenuView actionMenuView = ((C1112m1) actionBarOverlayLayout.f2110e).f4568a.f2217a;
            if (actionMenuView != null && (c1104k = actionMenuView.f2136t) != null && c1104k.m2726i()) {
                m2262q(c0887t.f3644h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f3691k.getSystemService("window");
        if (windowManager != null && c0887t.f3649m && (c0886s = c0887t.f3641e) != null) {
            windowManager.removeView(c0886s);
            if (z2) {
                m2261p(c0887t.f3637a, c0887t, null);
            }
        }
        c0887t.f3647k = false;
        c0887t.f3648l = false;
        c0887t.f3649m = false;
        c0887t.f3642f = null;
        c0887t.f3650n = true;
        if (this.f3669M == c0887t) {
            this.f3669M = null;
        }
        if (c0887t.f3637a == 0) {
            m2258I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2264t(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.LayoutInflaterFactory2C0888u.m2264t(android.view.KeyEvent):boolean");
    }

    /* renamed from: u */
    public final void m2265u(int i2) {
        C0887t c0887tM2270z = m2270z(i2);
        if (c0887tM2270z.f3644h != null) {
            Bundle bundle = new Bundle();
            c0887tM2270z.f3644h.m2580t(bundle);
            if (bundle.size() > 0) {
                c0887tM2270z.f3652p = bundle;
            }
            c0887tM2270z.f3644h.m2583w();
            c0887tM2270z.f3644h.clear();
        }
        c0887tM2270z.f3651o = true;
        c0887tM2270z.f3650n = true;
        if ((i2 == 108 || i2 == 0) && this.f3698r != null) {
            C0887t c0887tM2270z2 = m2270z(0);
            c0887tM2270z2.f3647k = false;
            m2256G(c0887tM2270z2, null);
        }
    }

    /* renamed from: v */
    public final void m2266v() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i2 = 1;
        int i3 = 0;
        if (this.f3706z) {
            return;
        }
        int[] iArr = AbstractC0843a.f3460j;
        Context context = this.f3691k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo2232g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo2232g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo2232g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo2232g(10);
        }
        this.f3665I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2267w();
        this.f3692l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f3666J) {
            viewGroup = this.f3664H ? (ViewGroup) layoutInflaterFrom.inflate(tkbmmn.ghwbbf.irvjzy.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(tkbmmn.ghwbbf.irvjzy.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f3665I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(tkbmmn.ghwbbf.irvjzy.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f3663G = false;
            this.f3662F = false;
        } else if (this.f3662F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(tkbmmn.ghwbbf.irvjzy.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0974d(context, typedValue.resourceId) : context).inflate(tkbmmn.ghwbbf.irvjzy.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1111m0 interfaceC1111m0 = (InterfaceC1111m0) viewGroup.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.decor_content_parent);
            this.f3698r = interfaceC1111m0;
            interfaceC1111m0.setWindowCallback(this.f3692l.getCallback());
            if (this.f3663G) {
                ((ActionBarOverlayLayout) this.f3698r).m1489j(109);
            }
            if (this.f3660D) {
                ((ActionBarOverlayLayout) this.f3698r).m1489j(2);
            }
            if (this.f3661E) {
                ((ActionBarOverlayLayout) this.f3698r).m1489j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3662F + ", windowActionBarOverlay: " + this.f3663G + ", android:windowIsFloating: " + this.f3665I + ", windowActionModeOverlay: " + this.f3664H + ", windowNoTitle: " + this.f3666J + " }");
        }
        C0880m c0880m = new C0880m(this, i3);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        AbstractC0230E.m638u(viewGroup, c0880m);
        if (this.f3698r == null) {
            this.f3658B = (TextView) viewGroup.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.title);
        }
        Method method = AbstractC1133t1.f4638a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(tkbmmn.ghwbbf.irvjzy.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f3692l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f3692l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0880m(this, i2));
        this.f3657A = viewGroup;
        Object obj = this.f3690j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3697q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1111m0 interfaceC1111m02 = this.f3698r;
            if (interfaceC1111m02 != null) {
                interfaceC1111m02.setWindowTitle(title);
            } else {
                C0867H c0867h = this.f3695o;
                if (c0867h != null) {
                    C1112m1 c1112m1 = (C1112m1) c0867h.f3557r;
                    if (!c1112m1.f4574g) {
                        c1112m1.f4575h = title;
                        if ((c1112m1.f4569b & 8) != 0) {
                            Toolbar toolbar = c1112m1.f4568a;
                            toolbar.setTitle(title);
                            if (c1112m1.f4574g) {
                                AbstractC0241P.m702n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f3658B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3657A.findViewById(R.id.content);
        View decorView = this.f3692l.getDecorView();
        contentFrameLayout2.f2153g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f3706z = true;
        C0887t c0887tM2270z = m2270z(0);
        if (this.f3673Q || c0887tM2270z.f3644h != null) {
            return;
        }
        m2251B(108);
    }

    /* renamed from: w */
    public final void m2267w() {
        if (this.f3692l == null) {
            Object obj = this.f3690j;
            if (obj instanceof Activity) {
                m2260n(((Activity) obj).getWindow());
            }
        }
        if (this.f3692l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: x */
    public final Context m2268x() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2250A();
        C0867H c0867h = this.f3695o;
        Context contextM2200M = c0867h != null ? c0867h.m2200M() : null;
        return contextM2200M == null ? this.f3691k : contextM2200M;
    }

    /* renamed from: y */
    public final AbstractC0703f m2269y(Context context) {
        if (this.f3679W == null) {
            if (C0027i.f63f == null) {
                Context applicationContext = context.getApplicationContext();
                C0027i.f63f = new C0027i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3679W = new C0885r(this, C0027i.f63f);
        }
        return this.f3679W;
    }

    /* renamed from: z */
    public final C0887t m2270z(int i2) {
        C0887t[] c0887tArr = this.f3668L;
        if (c0887tArr == null || c0887tArr.length <= i2) {
            C0887t[] c0887tArr2 = new C0887t[i2 + 1];
            if (c0887tArr != null) {
                System.arraycopy(c0887tArr, 0, c0887tArr2, 0, c0887tArr.length);
            }
            this.f3668L = c0887tArr2;
            c0887tArr = c0887tArr2;
        }
        C0887t c0887t = c0887tArr[i2];
        if (c0887t != null) {
            return c0887t;
        }
        C0887t c0887t2 = new C0887t();
        c0887t2.f3637a = i2;
        c0887t2.f3650n = false;
        c0887tArr[i2] = c0887t2;
        return c0887t2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
