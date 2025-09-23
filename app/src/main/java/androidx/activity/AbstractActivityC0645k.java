package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0726C;
import androidx.lifecycle.AbstractC0729F;
import androidx.lifecycle.C0730G;
import androidx.lifecycle.C0733J;
import androidx.lifecycle.C0734K;
import androidx.lifecycle.C0755t;
import androidx.lifecycle.EnumC0747l;
import androidx.lifecycle.EnumC0748m;
import androidx.lifecycle.FragmentC0728E;
import androidx.lifecycle.InterfaceC0735L;
import androidx.lifecycle.InterfaceC0743h;
import androidx.lifecycle.InterfaceC0751p;
import androidx.lifecycle.InterfaceC0753r;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p002A1.C0019a;
import p002A1.RunnableC0030l;
import p002A1.RunnableC0042x;
import p006C.AbstractC0075g;
import p020H.C0175e;
import p033L1.AbstractC0364l;
import p075a.C0622a;
import p075a.InterfaceC0623b;
import p076a0.AbstractC0625b;
import p076a0.C0624a;
import p076a0.C0626c;
import p080b1.C0767e;
import p090e.AbstractActivityC0874g;
import p097g0.C0968d;
import p097g0.InterfaceC0967c;
import p097g0.InterfaceC0969e;
import p111l.C1220b;
import p111l.C1224f;
import p128r1.InterfaceC1290a;
import p131s1.AbstractC1326c;
import p150z.AbstractActivityC1416e;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0645k extends AbstractActivityC1416e implements InterfaceC0735L, InterfaceC0743h, InterfaceC0969e {

    /* renamed from: b */
    public final C0622a f1998b = new C0622a();

    /* renamed from: c */
    public final C0019a f1999c;

    /* renamed from: d */
    public final C0755t f2000d;

    /* renamed from: e */
    public final C0646l f2001e;

    /* renamed from: f */
    public C0734K f2002f;

    /* renamed from: g */
    public C0656t f2003g;

    /* renamed from: h */
    public final ExecutorC0644j f2004h;

    /* renamed from: i */
    public final C0646l f2005i;

    /* renamed from: j */
    public final C0641g f2006j;

    /* renamed from: k */
    public final CopyOnWriteArrayList f2007k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f2008l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f2009m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f2010n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f2011o;

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.activity.d] */
    public AbstractActivityC0645k() {
        final AbstractActivityC0874g abstractActivityC0874g = (AbstractActivityC0874g) this;
        this.f1999c = new C0019a(new RunnableC0030l(8, abstractActivityC0874g));
        C0755t c0755t = new C0755t(this);
        this.f2000d = c0755t;
        C0646l c0646l = new C0646l(this);
        this.f2001e = c0646l;
        InterfaceC0967c interfaceC0967c = null;
        this.f2003g = null;
        ExecutorC0644j executorC0644j = new ExecutorC0644j(abstractActivityC0874g);
        this.f2004h = executorC0644j;
        this.f2005i = new C0646l(executorC0644j, new InterfaceC1290a() { // from class: androidx.activity.d
            @Override // p128r1.InterfaceC1290a
            /* renamed from: a */
            public final Object mo349a() {
                abstractActivityC0874g.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f2006j = new C0641g();
        this.f2007k = new CopyOnWriteArrayList();
        this.f2008l = new CopyOnWriteArrayList();
        this.f2009m = new CopyOnWriteArrayList();
        this.f2010n = new CopyOnWriteArrayList();
        this.f2011o = new CopyOnWriteArrayList();
        c0755t.m1779a(new InterfaceC0751p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0751p
            /* renamed from: b */
            public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                if (enumC0747l == EnumC0747l.ON_STOP) {
                    Window window = abstractActivityC0874g.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0755t.m1779a(new InterfaceC0751p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0751p
            /* renamed from: b */
            public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                if (enumC0747l == EnumC0747l.ON_DESTROY) {
                    abstractActivityC0874g.f1998b.f1943b = null;
                    if (!abstractActivityC0874g.isChangingConfigurations()) {
                        abstractActivityC0874g.mo1452c().m1771a();
                    }
                    ExecutorC0644j executorC0644j2 = abstractActivityC0874g.f2004h;
                    AbstractActivityC0874g abstractActivityC0874g2 = executorC0644j2.f1997d;
                    abstractActivityC0874g2.getWindow().getDecorView().removeCallbacks(executorC0644j2);
                    abstractActivityC0874g2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0644j2);
                }
            }
        });
        c0755t.m1779a(new InterfaceC0751p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0751p
            /* renamed from: b */
            public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                AbstractActivityC0874g abstractActivityC0874g2 = abstractActivityC0874g;
                if (abstractActivityC0874g2.f2002f == null) {
                    C0643i c0643i = (C0643i) abstractActivityC0874g2.getLastNonConfigurationInstance();
                    if (c0643i != null) {
                        abstractActivityC0874g2.f2002f = c0643i.f1993a;
                    }
                    if (abstractActivityC0874g2.f2002f == null) {
                        abstractActivityC0874g2.f2002f = new C0734K();
                    }
                }
                abstractActivityC0874g2.f2000d.m1784f(this);
            }
        });
        c0646l.m1456a();
        EnumC0748m enumC0748m = c0755t.f2732c;
        if (enumC0748m != EnumC0748m.f2722b && enumC0748m != EnumC0748m.f2723c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0968d c0968d = (C0968d) c0646l.f2014c;
        c0968d.getClass();
        Iterator it = ((C1224f) c0968d.f4061d).iterator();
        while (true) {
            C1220b c1220b = (C1220b) it;
            if (!c1220b.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1220b.next();
            AbstractC1326c.m3061d(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC0967c interfaceC0967c2 = (InterfaceC0967c) entry.getValue();
            if (AbstractC1326c.m3058a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                interfaceC0967c = interfaceC0967c2;
                break;
            }
        }
        if (interfaceC0967c == null) {
            C0730G c0730g = new C0730G((C0968d) this.f2001e.f2014c, this);
            ((C0968d) this.f2001e.f2014c).m2478e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0730g);
            this.f2000d.m1779a(new SavedStateHandleAttacher(c0730g));
        }
        ((C0968d) this.f2001e.f2014c).m2478e("android:support:activity-result", new InterfaceC0967c() { // from class: androidx.activity.e
            @Override // p097g0.InterfaceC0967c
            /* renamed from: a */
            public final Bundle mo1445a() {
                AbstractActivityC0874g abstractActivityC0874g2 = abstractActivityC0874g;
                Bundle bundle = new Bundle();
                C0641g c0641g = abstractActivityC0874g2.f2006j;
                c0641g.getClass();
                HashMap map = c0641g.f1987b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0641g.f1989d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0641g.f1992g.clone());
                return bundle;
            }
        });
        m1454g(new InterfaceC0623b() { // from class: androidx.activity.f
            @Override // p075a.InterfaceC0623b
            /* renamed from: a */
            public final void mo1431a() {
                AbstractActivityC0874g abstractActivityC0874g2 = abstractActivityC0874g;
                Bundle bundleM2476c = ((C0968d) abstractActivityC0874g2.f2001e.f2014c).m2476c("android:support:activity-result");
                if (bundleM2476c != null) {
                    C0641g c0641g = abstractActivityC0874g2.f2006j;
                    c0641g.getClass();
                    ArrayList<Integer> integerArrayList = bundleM2476c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM2476c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0641g.f1989d = bundleM2476c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = bundleM2476c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0641g.f1992g;
                    bundle2.putAll(bundle);
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str2 = stringArrayList.get(i2);
                        HashMap map = c0641g.f1987b;
                        boolean zContainsKey = map.containsKey(str2);
                        HashMap map2 = c0641g.f1986a;
                        if (zContainsKey) {
                            Integer num = (Integer) map.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                map2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.intValue();
                        String str3 = stringArrayList.get(i2);
                        map2.put(num2, str3);
                        map.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC0743h
    /* renamed from: a */
    public final AbstractC0625b mo1450a() {
        C0624a c0624a = C0624a.f1944b;
        AbstractC1326c.m3062e(c0624a, "initialExtras");
        C0626c c0626c = new C0626c();
        c0626c.f1945a.putAll(c0624a.f1945a);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0626c.f1945a;
        if (application != null) {
            linkedHashMap.put(C0733J.f2705a, getApplication());
        }
        linkedHashMap.put(AbstractC0729F.f2695a, this);
        linkedHashMap.put(AbstractC0729F.f2696b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0729F.f2697c, getIntent().getExtras());
        }
        return c0626c;
    }

    @Override // p097g0.InterfaceC0969e
    /* renamed from: b */
    public final C0968d mo1451b() {
        return (C0968d) this.f2001e.f2014c;
    }

    @Override // androidx.lifecycle.InterfaceC0735L
    /* renamed from: c */
    public final C0734K mo1452c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2002f == null) {
            C0643i c0643i = (C0643i) getLastNonConfigurationInstance();
            if (c0643i != null) {
                this.f2002f = c0643i.f1993a;
            }
            if (this.f2002f == null) {
                this.f2002f = new C0734K();
            }
        }
        return this.f2002f;
    }

    @Override // androidx.lifecycle.InterfaceC0753r
    /* renamed from: e */
    public final C0755t mo1453e() {
        return this.f2000d;
    }

    /* renamed from: g */
    public final void m1454g(InterfaceC0623b interfaceC0623b) {
        C0622a c0622a = this.f1998b;
        c0622a.getClass();
        if (c0622a.f1943b != null) {
            interfaceC0623b.mo1431a();
        }
        c0622a.f1942a.add(interfaceC0623b);
    }

    /* renamed from: h */
    public final C0656t m1455h() {
        if (this.f2003g == null) {
            this.f2003g = new C0656t(new RunnableC0042x(8, this));
            this.f2000d.m1779a(new InterfaceC0751p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0751p
                /* renamed from: b */
                public final void mo1439b(InterfaceC0753r interfaceC0753r, EnumC0747l enumC0747l) {
                    if (enumC0747l != EnumC0747l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0656t c0656t = this.f1972a.f2003g;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM1448a = AbstractC0642h.m1448a((AbstractActivityC0645k) interfaceC0753r);
                    c0656t.getClass();
                    AbstractC1326c.m3062e(onBackInvokedDispatcherM1448a, "invoker");
                    c0656t.f2040e = onBackInvokedDispatcherM1448a;
                    c0656t.m1468c(c0656t.f2042g);
                }
            });
        }
        return this.f2003g;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f2006j.m1446a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m1455h().m1467b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2007k.iterator();
        while (it.hasNext()) {
            ((C0175e) it.next()).m477a(configuration);
        }
    }

    @Override // p150z.AbstractActivityC1416e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2001e.m1458c(bundle);
        C0622a c0622a = this.f1998b;
        c0622a.getClass();
        c0622a.f1943b = this;
        Iterator it = c0622a.f1942a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0623b) it.next()).mo1431a();
        }
        super.onCreate(bundle);
        int i2 = FragmentC0728E.f2693b;
        AbstractC0726C.m1769b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1999c.f46b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1999c.f46b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        super.onMultiWindowModeChanged(z2, configuration);
        Iterator it = this.f2010n.iterator();
        while (it.hasNext()) {
            C0175e c0175e = (C0175e) it.next();
            AbstractC1326c.m3062e(configuration, "newConfig");
            c0175e.m477a(new C0767e(14));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2009m.iterator();
        while (it.hasNext()) {
            ((C0175e) it.next()).m477a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1999c.f46b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        super.onPictureInPictureModeChanged(z2, configuration);
        Iterator it = this.f2011o.iterator();
        while (it.hasNext()) {
            C0175e c0175e = (C0175e) it.next();
            AbstractC1326c.m3062e(configuration, "newConfig");
            c0175e.m477a(new C0767e(15));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1999c.f46b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f2006j.m1446a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0643i c0643i;
        C0734K c0734k = this.f2002f;
        if (c0734k == null && (c0643i = (C0643i) getLastNonConfigurationInstance()) != null) {
            c0734k = c0643i.f1993a;
        }
        if (c0734k == null) {
            return null;
        }
        C0643i c0643i2 = new C0643i();
        c0643i2.f1993a = c0734k;
        return c0643i2;
    }

    @Override // p150z.AbstractActivityC1416e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0755t c0755t = this.f2000d;
        if (c0755t != null) {
            c0755t.m1785g();
        }
        super.onSaveInstanceState(bundle);
        this.f2001e.m1459d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f2008l.iterator();
        while (it.hasNext()) {
            ((C0175e) it.next()).m477a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0364l.m989O()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0646l c0646l = this.f2005i;
            synchronized (c0646l.f2013b) {
                try {
                    c0646l.f2012a = true;
                    Iterator it = ((ArrayList) c0646l.f2014c).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1290a) it.next()).mo349a();
                    }
                    ((ArrayList) c0646l.f2014c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1326c.m3062e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        ExecutorC0644j executorC0644j = this.f2004h;
        if (!executorC0644j.f1996c) {
            executorC0644j.f1996c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(executorC0644j);
        }
        super.setContentView(view);
    }
}
