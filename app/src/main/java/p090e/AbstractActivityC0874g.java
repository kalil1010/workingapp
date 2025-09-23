package p090e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0645k;
import androidx.fragment.app.AbstractComponentCallbacksC0712o;
import androidx.fragment.app.C0686D;
import androidx.fragment.app.C0693K;
import androidx.fragment.app.C0713p;
import androidx.fragment.app.C0714q;
import androidx.fragment.app.C0715r;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.EnumC0748m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p001A0.C0004c;
import p002A1.AbstractActivityC0021c;
import p002A1.C0019a;
import p003B.AbstractC0046b;
import p003B.AbstractC0059o;
import p017G.AbstractC0153b;
import p017G.C0158g;
import p033L1.AbstractC0364l;
import p087d0.RunnableC0850g;
import p093e2.AbstractC0901d;
import p097g0.C0968d;
import p099h.C0974d;
import p099h.C0979i;
import p099h.C0981k;
import p105j.AbstractC1127r1;
import p105j.C1050N0;
import p105j.C1112m1;
import p105j.C1131t;
import p119o.C1243e;
import p131s1.AbstractC1326c;

/* renamed from: e.g */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0874g extends AbstractActivityC0645k implements InterfaceC0875h {

    /* renamed from: p */
    public final C0004c f3607p;

    /* renamed from: r */
    public boolean f3609r;

    /* renamed from: s */
    public boolean f3610s;

    /* renamed from: u */
    public LayoutInflaterFactory2C0888u f3612u;

    /* renamed from: q */
    public final C0755t f3608q = new C0755t(this);

    /* renamed from: t */
    public boolean f3611t = true;

    public AbstractActivityC0874g() {
        AbstractActivityC0021c abstractActivityC0021c = (AbstractActivityC0021c) this;
        this.f3607p = new C0004c(26, new C0715r(abstractActivityC0021c));
        ((C0968d) this.f2001e.f2014c).m2478e("android:support:fragments", new C0713p(abstractActivityC0021c, 0));
        m1454g(new C0714q(abstractActivityC0021c, 0));
        ((C0968d) this.f2001e.f2014c).m2478e("androidx:appcompat", new C0713p(abstractActivityC0021c, 1));
        m1454g(new C0714q(abstractActivityC0021c, 1));
    }

    /* renamed from: k */
    public static boolean m2214k(C0686D c0686d) {
        boolean zM2214k = false;
        for (AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o : c0686d.f2448c.m103E()) {
            if (abstractComponentCallbacksC0712o != null) {
                C0715r c0715r = abstractComponentCallbacksC0712o.f2646s;
                if ((c0715r == null ? null : c0715r.f2662j) != null) {
                    zM2214k |= m2214k(abstractComponentCallbacksC0712o.m1753g());
                }
                C0693K c0693k = abstractComponentCallbacksC0712o.f2624M;
                EnumC0748m enumC0748m = EnumC0748m.f2724d;
                if (c0693k != null) {
                    c0693k.m1716f();
                    if (c0693k.f2518b.f2732c.compareTo(enumC0748m) >= 0) {
                        abstractComponentCallbacksC0712o.f2624M.f2518b.m1785g();
                        zM2214k = true;
                    }
                }
                if (abstractComponentCallbacksC0712o.f2623L.f2732c.compareTo(enumC0748m) >= 0) {
                    abstractComponentCallbacksC0712o.f2623L.m1785g();
                    zM2214k = true;
                }
            }
        }
        return zM2214k;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2216j();
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        layoutInflaterFactory2C0888u.m2266v();
        ((ViewGroup) layoutInflaterFactory2C0888u.f3657A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0888u.f3693m.m2244a(layoutInflaterFactory2C0888u.f3692l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        layoutInflaterFactory2C0888u.f3671O = true;
        int i2 = layoutInflaterFactory2C0888u.f3675S;
        if (i2 == -100) {
            i2 = AbstractC0878k.f3614b;
        }
        int iM2252C = layoutInflaterFactory2C0888u.m2252C(context, i2);
        if (AbstractC0878k.m2227b(context) && AbstractC0878k.m2227b(context)) {
            if (!AbstractC0153b.m418a()) {
                synchronized (AbstractC0878k.f3621i) {
                    try {
                        C0158g c0158g = AbstractC0878k.f3615c;
                        if (c0158g == null) {
                            if (AbstractC0878k.f3616d == null) {
                                AbstractC0878k.f3616d = C0158g.m425a(AbstractC0901d.m2301i0(context));
                            }
                            if (!AbstractC0878k.f3616d.f536a.f537a.isEmpty()) {
                                AbstractC0878k.f3615c = AbstractC0878k.f3616d;
                            }
                        } else if (!c0158g.equals(AbstractC0878k.f3616d)) {
                            C0158g c0158g2 = AbstractC0878k.f3615c;
                            AbstractC0878k.f3616d = c0158g2;
                            AbstractC0901d.m2296f0(context, c0158g2.f536a.f537a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0878k.f3618f) {
                AbstractC0878k.f3613a.execute(new RunnableC0850g(context, 2));
            }
        }
        C0158g c0158gM2248o = LayoutInflaterFactory2C0888u.m2248o(context);
        if (LayoutInflaterFactory2C0888u.f3656k0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0888u.m2249s(context, iM2252C, c0158gM2248o, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C0974d) {
            try {
                ((C0974d) context).m2480a(LayoutInflaterFactory2C0888u.m2249s(context, iM2252C, c0158gM2248o, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C0888u.f3655j0) {
            int i3 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    AbstractC0882o.m2237a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i3 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    int i38 = configuration3.densityDpi;
                    int i39 = configuration4.densityDpi;
                    if (i38 != i39) {
                        configuration.densityDpi = i39;
                    }
                }
            }
            Configuration configurationM2249s = LayoutInflaterFactory2C0888u.m2249s(context, iM2252C, c0158gM2248o, configuration, true);
            C0974d c0974d = new C0974d(context, tkbmmn.ghwbbf.irvjzy.R.style.Theme_AppCompat_Empty);
            c0974d.m2480a(configurationM2249s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0974d.getTheme();
                    if (i3 >= 29) {
                        AbstractC0059o.m185a(theme);
                    } else {
                        synchronized (AbstractC0046b.f110e) {
                            if (!AbstractC0046b.f112g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    AbstractC0046b.f111f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                AbstractC0046b.f112g = true;
                            }
                            Method method = AbstractC0046b.f111f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    AbstractC0046b.f111f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = c0974d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((LayoutInflaterFactory2C0888u) m2215i()).m2250A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p150z.AbstractActivityC1416e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0888u) m2215i()).m2250A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3609r);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3610s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3611t);
        if (getApplication() != null) {
            new C0019a(this, mo1452c()).m82u(str2, printWriter);
        }
        ((C0715r) this.f3607p.f7b).f2661i.m1688u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        layoutInflaterFactory2C0888u.m2266v();
        return layoutInflaterFactory2C0888u.f3692l.findViewById(i2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        if (layoutInflaterFactory2C0888u.f3696p == null) {
            layoutInflaterFactory2C0888u.m2250A();
            C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
            layoutInflaterFactory2C0888u.f3696p = new C0979i(c0867h != null ? c0867h.m2200M() : layoutInflaterFactory2C0888u.f3691k);
        }
        return layoutInflaterFactory2C0888u.f3696p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = AbstractC1127r1.f4625a;
        return super.getResources();
    }

    /* renamed from: i */
    public final AbstractC0878k m2215i() {
        if (this.f3612u == null) {
            ExecutorC0860A executorC0860A = AbstractC0878k.f3613a;
            this.f3612u = new LayoutInflaterFactory2C0888u(this, null, this, this);
        }
        return this.f3612u;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m2215i().mo2229a();
    }

    /* renamed from: j */
    public final void m2216j() {
        View decorView = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView, "<this>");
        decorView.setTag(tkbmmn.ghwbbf.irvjzy.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView2, "<this>");
        decorView2.setTag(tkbmmn.ghwbbf.irvjzy.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView3, "<this>");
        decorView3.setTag(tkbmmn.ghwbbf.irvjzy.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView4, "<this>");
        decorView4.setTag(tkbmmn.ghwbbf.irvjzy.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* renamed from: l */
    public final void m2217l(Configuration configuration) {
        C0004c c0004c = this.f3607p;
        c0004c.m32s();
        super.onConfigurationChanged(configuration);
        ((C0715r) c0004c.f7b).f2661i.m1675h();
    }

    /* renamed from: m */
    public final void m2218m() {
        super.onDestroy();
        ((C0715r) this.f3607p.f7b).f2661i.m1678k();
        this.f3608q.m1782d(EnumC0747l.ON_DESTROY);
    }

    /* renamed from: n */
    public final boolean m2219n(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        C0004c c0004c = this.f3607p;
        if (i2 == 0) {
            return ((C0715r) c0004c.f7b).f2661i.m1681n();
        }
        if (i2 != 6) {
            return false;
        }
        return ((C0715r) c0004c.f7b).f2661i.m1676i();
    }

    /* renamed from: o */
    public final void m2220o(int i2, Menu menu) {
        if (i2 == 0) {
            ((C0715r) this.f3607p.f7b).f2661i.m1682o();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f3607p.m32s();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2217l(configuration);
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        if (layoutInflaterFactory2C0888u.f3662F && layoutInflaterFactory2C0888u.f3706z) {
            layoutInflaterFactory2C0888u.m2250A();
            C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
            if (c0867h != null) {
                c0867h.m2203P(c0867h.f3553n.getResources().getBoolean(tkbmmn.ghwbbf.irvjzy.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1131t c1131tM2749a = C1131t.m2749a();
        Context context = layoutInflaterFactory2C0888u.f3691k;
        synchronized (c1131tM2749a) {
            C1050N0 c1050n0 = c1131tM2749a.f4636a;
            synchronized (c1050n0) {
                C1243e c1243e = (C1243e) c1050n0.f4403b.get(context);
                if (c1243e != null) {
                    c1243e.m2897a();
                }
            }
        }
        layoutInflaterFactory2C0888u.f3674R = new Configuration(layoutInflaterFactory2C0888u.f3691k.getResources().getConfiguration());
        layoutInflaterFactory2C0888u.m2259m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.activity.AbstractActivityC0645k, p150z.AbstractActivityC1416e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3608q.m1782d(EnumC0747l.ON_CREATE);
        C0686D c0686d = ((C0715r) this.f3607p.f7b).f2661i;
        c0686d.f2470y = false;
        c0686d.f2471z = false;
        c0686d.f2444F.f2485h = false;
        c0686d.m1686s(1);
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i2 != 0) {
            super.onCreatePanelMenu(i2, menu);
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        ((C0715r) this.f3607p.f7b).f2661i.m1677j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0715r) this.f3607p.f7b).f2661i.f2451f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m2218m();
        m2215i().mo2231e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0715r) this.f3607p.f7b).f2661i.m1679l();
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentM984H;
        if (!m2219n(i2, menuItem)) {
            LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
            layoutInflaterFactory2C0888u.m2250A();
            C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
            if (menuItem.getItemId() != 16908332 || c0867h == null || (((C1112m1) c0867h.f3557r).f4569b & 4) == 0 || (intentM984H = AbstractC0364l.m984H(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM984H)) {
                navigateUpTo(intentM984H);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM984H2 = AbstractC0364l.m984H(this);
            if (intentM984H2 == null) {
                intentM984H2 = AbstractC0364l.m984H(this);
            }
            if (intentM984H2 != null) {
                ComponentName component = intentM984H2.getComponent();
                if (component == null) {
                    component = intentM984H2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM985I = AbstractC0364l.m985I(this, component);
                    while (intentM985I != null) {
                        arrayList.add(size, intentM985I);
                        intentM985I = AbstractC0364l.m985I(this, intentM985I.getComponent());
                    }
                    arrayList.add(intentM984H2);
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ((C0715r) this.f3607p.f7b).f2661i.m1680m();
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f3607p.m32s();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        m2220o(i2, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3610s = false;
        ((C0715r) this.f3607p.f7b).f2661i.m1686s(5);
        this.f3608q.m1782d(EnumC0747l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ((C0715r) this.f3607p.f7b).f2661i.m1684q();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0888u) m2215i()).m2266v();
    }

    @Override // android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2221p();
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h != null) {
            c0867h.f3548G = true;
        }
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            super.onPreparePanel(i2, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0715r) this.f3607p.f7b).f2661i.m1685r();
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f3607p.m32s();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0004c c0004c = this.f3607p;
        c0004c.m32s();
        super.onResume();
        this.f3610s = true;
        ((C0715r) c0004c.f7b).f2661i.m1691x(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        m2222q();
        ((LayoutInflaterFactory2C0888u) m2215i()).m2259m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3607p.m32s();
    }

    @Override // android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2223r();
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = (LayoutInflaterFactory2C0888u) m2215i();
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

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m2215i().mo2236l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((LayoutInflaterFactory2C0888u) m2215i()).m2250A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final void m2221p() {
        super.onPostResume();
        this.f3608q.m1782d(EnumC0747l.ON_RESUME);
        C0686D c0686d = ((C0715r) this.f3607p.f7b).f2661i;
        c0686d.f2470y = false;
        c0686d.f2471z = false;
        c0686d.f2444F.f2485h = false;
        c0686d.m1686s(7);
    }

    /* renamed from: q */
    public final void m2222q() {
        C0004c c0004c = this.f3607p;
        c0004c.m32s();
        super.onStart();
        this.f3611t = false;
        boolean z2 = this.f3609r;
        C0715r c0715r = (C0715r) c0004c.f7b;
        if (!z2) {
            this.f3609r = true;
            C0686D c0686d = c0715r.f2661i;
            c0686d.f2470y = false;
            c0686d.f2471z = false;
            c0686d.f2444F.f2485h = false;
            c0686d.m1686s(4);
        }
        c0715r.f2661i.m1691x(true);
        this.f3608q.m1782d(EnumC0747l.ON_START);
        C0686D c0686d2 = c0715r.f2661i;
        c0686d2.f2470y = false;
        c0686d2.f2471z = false;
        c0686d2.f2444F.f2485h = false;
        c0686d2.m1686s(5);
    }

    /* renamed from: r */
    public final void m2223r() {
        C0004c c0004c;
        super.onStop();
        this.f3611t = true;
        do {
            c0004c = this.f3607p;
        } while (m2214k(((C0715r) c0004c.f7b).f2661i));
        C0686D c0686d = ((C0715r) c0004c.f7b).f2661i;
        c0686d.f2471z = true;
        c0686d.f2444F.f2485h = true;
        c0686d.m1686s(4);
        this.f3608q.m1782d(EnumC0747l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        m2216j();
        m2215i().mo2233i(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((LayoutInflaterFactory2C0888u) m2215i()).f3676T = i2;
    }

    @Override // androidx.activity.AbstractActivityC0645k, android.app.Activity
    public void setContentView(View view) {
        m2216j();
        m2215i().mo2234j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0715r) this.f3607p.f7b).f2661i.f2451f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2216j();
        m2215i().mo2235k(view, layoutParams);
    }
}
