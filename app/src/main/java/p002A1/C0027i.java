package p002A1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractComponentCallbacksC0712o;
import androidx.fragment.app.C0686D;
import androidx.fragment.app.C0688F;
import androidx.fragment.app.C0691I;
import androidx.fragment.app.C0702e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import nfc.share.nfcshare.LoginActivity;
import nfc.share.nfcshare.model.MqttChannel;
import p001A0.C0004c;
import p003B.AbstractC0060p;
import p008C1.C0097f;
import p008C1.RunnableC0092a;
import p017G.InterfaceC0154c;
import p027J1.C0219a;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p038N0.C0417d;
import p038N0.C0419f;
import p080b1.C0767e;
import p080b1.C0770h;
import p085c2.InterfaceC0807a;
import p089d2.C0859a;
import p090e.C0864E;
import p090e.InterfaceC0868a;
import p093e2.AbstractC0901d;
import p093e2.C0899b;
import p094f0.AbstractC0926Z;
import p094f0.C0902A;
import p105j.C1062U;
import p105j.C1131t;
import p123p0.C1265a;
import p125q0.C1278f;
import p129s.C1315d;
import p129s.C1316e;
import p130s0.C1322a;
import p132t.C1333b;
import p138v.C1361f;
import p139v0.C1376b;
import p139v0.C1377c;

/* renamed from: A1.i */
/* loaded from: classes.dex */
public final class C0027i implements InterfaceC0154c, InterfaceC0807a, InterfaceC0868a {

    /* renamed from: e */
    public static boolean f62e;

    /* renamed from: f */
    public static C0027i f63f;

    /* renamed from: a */
    public final /* synthetic */ int f64a;

    /* renamed from: b */
    public Object f65b;

    /* renamed from: c */
    public Object f66c;

    /* renamed from: d */
    public Object f67d;

    public /* synthetic */ C0027i(int i2) {
        this.f64a = i2;
    }

    /* renamed from: M */
    public static C0027i m97M(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0027i(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: N */
    public static C0027i m98N(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0027i(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    /* renamed from: A */
    public ColorStateList m99A(int i2) {
        int resourceId;
        ColorStateList colorStateListM969s;
        TypedArray typedArray = (TypedArray) this.f66c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM969s = AbstractC0356d.m969s((Context) this.f65b, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM969s;
    }

    /* renamed from: B */
    public Drawable m100B(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f66c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0901d.m2321x((Context) this.f65b, resourceId);
    }

    /* renamed from: C */
    public Drawable m101C(int i2) {
        int resourceId;
        Drawable drawableM2660d;
        if (!((TypedArray) this.f66c).hasValue(i2) || (resourceId = ((TypedArray) this.f66c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C1131t c1131tM2749a = C1131t.m2749a();
        Context context = (Context) this.f65b;
        synchronized (c1131tM2749a) {
            drawableM2660d = c1131tM2749a.f4636a.m2660d(context, resourceId, true);
        }
        return drawableM2660d;
    }

    /* renamed from: D */
    public Typeface m102D(int i2, int i3, C1062U c1062u) {
        int resourceId = ((TypedArray) this.f66c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f67d) == null) {
            this.f67d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f67d;
        ThreadLocal threadLocal = AbstractC0060p.f137a;
        Context context = (Context) this.f65b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0060p.m187b(context, resourceId, typedValue, i3, c1062u, true, false);
    }

    /* renamed from: E */
    public List m103E() {
        ArrayList arrayList;
        if (((ArrayList) this.f65b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f65b)) {
            arrayList = new ArrayList((ArrayList) this.f65b);
        }
        return arrayList;
    }

    /* renamed from: F */
    public int m104F(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((C0902A) this.f65b).f3737a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0219a c0219a = (C0219a) this.f66c;
            int iM600b = i2 - (i3 - c0219a.m600b(i3));
            if (iM600b == 0) {
                while (c0219a.m602d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iM600b;
        }
        return -1;
    }

    /* renamed from: G */
    public View m105G(int i2) {
        return ((C0902A) this.f65b).f3737a.getChildAt(i2);
    }

    /* renamed from: H */
    public int m106H() {
        return ((C0902A) this.f65b).f3737a.getChildCount();
    }

    /* renamed from: I */
    public void m107I(View view) {
        ((ArrayList) this.f67d).add(view);
        C0902A c0902a = (C0902A) this.f65b;
        AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
        if (abstractC0926ZM1876I != null) {
            int i2 = abstractC0926ZM1876I.f3831q;
            View view2 = abstractC0926ZM1876I.f3815a;
            if (i2 != -1) {
                abstractC0926ZM1876I.f3830p = i2;
            } else {
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                abstractC0926ZM1876I.f3830p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0902a.f3737a;
            if (recyclerView.m1892M()) {
                abstractC0926ZM1876I.f3831q = 4;
                recyclerView.f2838r0.add(abstractC0926ZM1876I);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0241P.f815a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: J */
    public void m108J(C0691I c0691i) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
        String str = abstractComponentCallbacksC0712o.f2632e;
        HashMap map = (HashMap) this.f66c;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0712o.f2632e, c0691i);
        if (C0686D.m1646D(2)) {
            abstractComponentCallbacksC0712o.toString();
        }
    }

    /* renamed from: K */
    public void m109K(C0691I c0691i) {
        AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o = c0691i.f2506c;
        if (abstractComponentCallbacksC0712o.f2612A) {
            ((C0688F) this.f67d).m1695b(abstractComponentCallbacksC0712o);
        }
        if (((C0691I) ((HashMap) this.f66c).put(abstractComponentCallbacksC0712o.f2632e, null)) != null && C0686D.m1646D(2)) {
            abstractComponentCallbacksC0712o.toString();
        }
    }

    /* renamed from: L */
    public boolean m110L(int i2, C1315d c1315d, C1361f c1361f) {
        int[] iArr = c1315d.f5543p0;
        int i3 = iArr[0];
        C1333b c1333b = (C1333b) this.f66c;
        c1333b.f5652a = i3;
        c1333b.f5653b = iArr[1];
        c1333b.f5654c = c1315d.m3021q();
        c1333b.f5655d = c1315d.m3017k();
        c1333b.f5660i = false;
        c1333b.f5661j = i2;
        boolean z2 = c1333b.f5652a == 3;
        boolean z3 = c1333b.f5653b == 3;
        boolean z4 = z2 && c1315d.f5508W > 0.0f;
        boolean z5 = z3 && c1315d.f5508W > 0.0f;
        int[] iArr2 = c1315d.f5547t;
        if (z4 && iArr2[0] == 4) {
            c1333b.f5652a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1333b.f5653b = 1;
        }
        c1361f.m3126b(c1315d, c1333b);
        c1315d.m3006O(c1333b.f5656e);
        c1315d.m3003L(c1333b.f5657f);
        c1315d.f5490E = c1333b.f5659h;
        c1315d.m3000I(c1333b.f5658g);
        c1333b.f5661j = 0;
        return c1333b.f5660i;
    }

    /* renamed from: O */
    public void m111O(String str) {
        ((LoginActivity) this.f67d).runOnUiThread(new RunnableC0026h(this, 0, str));
    }

    /* renamed from: P */
    public void m112P(MqttChannel mqttChannel, String str) {
        new Thread(new RunnableC0092a(this, str, mqttChannel, 0)).start();
    }

    /* renamed from: Q */
    public void m113Q(Object[] objArr) {
        C0859a c0859a = new C0859a();
        System.currentTimeMillis();
        c0859a.f3521a = (C0899b) this.f66c;
        Thread.currentThread().getName();
        c0859a.f3522b = objArr;
        ((LinkedBlockingQueue) this.f67d).add(c0859a);
    }

    /* renamed from: R */
    public void m114R() {
        ((TypedArray) this.f66c).recycle();
    }

    /* renamed from: S */
    public void m115S(C1316e c1316e, int i2, int i3, int i4) {
        int i5 = c1316e.f5515b0;
        int i6 = c1316e.f5517c0;
        c1316e.f5515b0 = 0;
        c1316e.f5517c0 = 0;
        c1316e.m3006O(i3);
        c1316e.m3003L(i4);
        if (i5 < 0) {
            c1316e.f5515b0 = 0;
        } else {
            c1316e.f5515b0 = i5;
        }
        if (i6 < 0) {
            c1316e.f5517c0 = 0;
        } else {
            c1316e.f5517c0 = i6;
        }
        C1316e c1316e2 = (C1316e) this.f67d;
        c1316e2.f5569t0 = i2;
        c1316e2.m3035U();
    }

    /* renamed from: T */
    public void m116T(View view) {
        if (((ArrayList) this.f67d).remove(view)) {
            C0902A c0902a = (C0902A) this.f65b;
            AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
            if (abstractC0926ZM1876I != null) {
                int i2 = abstractC0926ZM1876I.f3830p;
                RecyclerView recyclerView = c0902a.f3737a;
                if (recyclerView.m1892M()) {
                    abstractC0926ZM1876I.f3831q = i2;
                    recyclerView.f2838r0.add(abstractC0926ZM1876I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    abstractC0926ZM1876I.f3815a.setImportantForAccessibility(i2);
                }
                abstractC0926ZM1876I.f3830p = 0;
            }
        }
    }

    /* renamed from: U */
    public void m117U(C1316e c1316e) {
        ArrayList arrayList = (ArrayList) this.f65b;
        arrayList.clear();
        int size = c1316e.f5566q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1315d c1315d = (C1315d) c1316e.f5566q0.get(i2);
            int[] iArr = c1315d.f5543p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1315d);
            }
        }
        c1316e.f5568s0.f5665b = true;
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: a */
    public void mo118a(String str, EOFException eOFException) {
        m113Q(null);
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: b */
    public void mo119b(int i2) {
        Toolbar toolbar = (Toolbar) this.f65b;
        if (i2 == 0) {
            toolbar.setNavigationContentDescription((CharSequence) this.f67d);
        } else {
            toolbar.setNavigationContentDescription(i2);
        }
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: c */
    public boolean mo120c() {
        return true;
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: d */
    public boolean mo121d() {
        return true;
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: e */
    public void mo122e(Drawable drawable, int i2) {
        ((Toolbar) this.f65b).setNavigationIcon(drawable);
        mo119b(i2);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: f */
    public void mo123f() {
        m113Q(null);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: g */
    public void mo124g(String str, Exception exc) {
        m113Q(null);
    }

    @Override // p017G.InterfaceC0154c
    /* renamed from: h */
    public void mo21h() {
        View view = (View) this.f65b;
        view.clearAnimation();
        ((ViewGroup) this.f66c).endViewTransition(view);
        ((C0702e) this.f67d).m1727d();
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: i */
    public void mo125i(String str) {
        m113Q(null);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: j */
    public void mo126j(String str) {
        m113Q(new Object[]{str});
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: k */
    public void mo127k(String str) {
        m113Q(null);
    }

    @Override // p085c2.InterfaceC0807a
    /* renamed from: l */
    public String mo128l() {
        return (String) this.f65b;
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: m */
    public Context mo129m() {
        return ((Toolbar) this.f65b).getContext();
    }

    @Override // p090e.InterfaceC0868a
    /* renamed from: n */
    public Drawable mo130n() {
        return (Drawable) this.f66c;
    }

    /* renamed from: o */
    public void m131o(AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712o) {
        if (((ArrayList) this.f65b).contains(abstractComponentCallbacksC0712o)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0712o);
        }
        synchronized (((ArrayList) this.f65b)) {
            ((ArrayList) this.f65b).add(abstractComponentCallbacksC0712o);
        }
        abstractComponentCallbacksC0712o.f2638k = true;
    }

    /* renamed from: p */
    public void m132p(View view, int i2, boolean z2) {
        RecyclerView recyclerView = ((C0902A) this.f65b).f3737a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m104F(i2);
        ((C0219a) this.f66c).m603e(childCount, z2);
        if (z2) {
            m107I(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m1876I(view);
    }

    /* renamed from: q */
    public void m133q(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0902A) this.f65b).f3737a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : m104F(i2);
        ((C0219a) this.f66c).m603e(childCount, z2);
        if (z2) {
            m107I(view);
        }
        AbstractC0926Z abstractC0926ZM1876I = RecyclerView.m1876I(view);
        if (abstractC0926ZM1876I != null) {
            if (!abstractC0926ZM1876I.m2403j() && !abstractC0926ZM1876I.m2408o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0926ZM1876I + recyclerView.m1930y());
            }
            abstractC0926ZM1876I.f3824j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: r */
    public C1322a m134r() {
        if (((C0004c) this.f65b) == null) {
            throw new IllegalArgumentException("Provider may not be null.");
        }
        if (((C1265a) this.f66c) == null) {
            this.f66c = new C1265a();
        }
        C0004c c0004c = (C0004c) this.f65b;
        C1265a c1265a = (C1265a) this.f66c;
        C0767e c0767e = (C0767e) this.f67d;
        C1322a c1322a = new C1322a();
        C0770h c0770h = new C0770h();
        c0770h.f2887a = c0004c;
        c1322a.f5642b = c0770h;
        c1322a.f5641a = c1265a;
        c1322a.f5644d = c0767e;
        if (c0767e == null) {
            c1322a.f5644d = new C0767e(12);
        }
        ArrayList arrayList = new ArrayList();
        c1322a.f5643c = arrayList;
        c1322a.f5644d.getClass();
        arrayList.add(new C1377c(c1322a));
        arrayList.add(new C1376b(c1322a));
        c1322a.f5645e = new C1278f();
        return c1322a;
    }

    /* renamed from: s */
    public void m135s(String str) {
        if (!f62e) {
            AbstractC0018M.m45a("正在连接服务器...");
        }
        if (((C0097f) this.f67d) == null) {
            this.f67d = new C0097f(str);
        }
        C0097f c0097f = (C0097f) this.f67d;
        c0097f.f239g = new C0004c(4, this);
        if (c0097f.f237e) {
            return;
        }
        try {
            c0097f.f234b = c0097f.f233a.m366a(c0097f.f235c, c0097f.f236d);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m136t(int i2) {
        AbstractC0926Z abstractC0926ZM1876I;
        int iM104F = m104F(i2);
        ((C0219a) this.f66c).m605g(iM104F);
        RecyclerView recyclerView = ((C0902A) this.f65b).f3737a;
        View childAt = recyclerView.getChildAt(iM104F);
        if (childAt != null && (abstractC0926ZM1876I = RecyclerView.m1876I(childAt)) != null) {
            if (abstractC0926ZM1876I.m2403j() && !abstractC0926ZM1876I.m2408o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC0926ZM1876I + recyclerView.m1930y());
            }
            abstractC0926ZM1876I.m2394a(256);
        }
        recyclerView.detachViewFromParent(iM104F);
    }

    public String toString() {
        switch (this.f64a) {
            case 8:
                return ((C0219a) this.f66c).toString() + ", hidden list:" + ((ArrayList) this.f67d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m137u() {
        C0097f c0097f = (C0097f) this.f67d;
        if (c0097f != null) {
            c0097f.m291b();
            AbstractC0018M.f44j = null;
            AbstractC0018M.m45a("已断开");
            this.f67d = null;
        }
    }

    /* renamed from: v */
    public AbstractComponentCallbacksC0712o m138v(String str) {
        C0691I c0691i = (C0691I) ((HashMap) this.f66c).get(str);
        if (c0691i != null) {
            return c0691i.f2506c;
        }
        return null;
    }

    /* renamed from: w */
    public AbstractComponentCallbacksC0712o m139w(String str) {
        for (C0691I c0691i : ((HashMap) this.f66c).values()) {
            if (c0691i != null) {
                AbstractComponentCallbacksC0712o abstractComponentCallbacksC0712oM139w = c0691i.f2506c;
                if (!str.equals(abstractComponentCallbacksC0712oM139w.f2632e)) {
                    abstractComponentCallbacksC0712oM139w = abstractComponentCallbacksC0712oM139w.f2647t.f2448c.m139w(str);
                }
                if (abstractComponentCallbacksC0712oM139w != null) {
                    return abstractComponentCallbacksC0712oM139w;
                }
            }
        }
        return null;
    }

    /* renamed from: x */
    public ArrayList m140x() {
        ArrayList arrayList = new ArrayList();
        for (C0691I c0691i : ((HashMap) this.f66c).values()) {
            if (c0691i != null) {
                arrayList.add(c0691i);
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public View m141y(int i2) {
        return ((C0902A) this.f65b).f3737a.getChildAt(m104F(i2));
    }

    /* renamed from: z */
    public int m142z() {
        return ((C0902A) this.f65b).f3737a.getChildCount() - ((ArrayList) this.f67d).size();
    }

    public C0027i() {
        this.f64a = 4;
        this.f65b = new ArrayList();
        this.f66c = new HashMap();
    }

    public C0027i(Context context) {
        this.f64a = 1;
        this.f65b = context;
    }

    public C0027i(C0902A c0902a) {
        this.f64a = 8;
        this.f65b = c0902a;
        this.f66c = new C0219a();
        this.f67d = new ArrayList();
    }

    public C0027i(NavigationView navigationView) {
        Object c0417d;
        this.f64a = 2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            c0417d = new C0419f();
        } else {
            c0417d = i2 >= 33 ? new C0417d() : null;
        }
        this.f65b = c0417d;
        this.f66c = navigationView;
        this.f67d = navigationView;
    }

    public C0027i(Context context, TypedArray typedArray) {
        this.f64a = 9;
        this.f65b = context;
        this.f66c = typedArray;
    }

    public C0027i(Context context, LocationManager locationManager) {
        this.f64a = 7;
        this.f67d = new C0864E();
        this.f65b = context;
        this.f66c = locationManager;
    }

    public C0027i(C1316e c1316e) {
        this.f64a = 12;
        this.f65b = new ArrayList();
        this.f66c = new C1333b();
        this.f67d = c1316e;
    }

    public C0027i(LoginActivity loginActivity, String str, String str2) {
        this.f64a = 0;
        this.f67d = loginActivity;
        this.f65b = str;
        this.f66c = str2;
    }

    public C0027i(View view, ViewGroup viewGroup, C0702e c0702e) {
        this.f64a = 3;
        this.f65b = view;
        this.f66c = viewGroup;
        this.f67d = c0702e;
    }

    public C0027i(Toolbar toolbar) {
        this.f64a = 6;
        this.f65b = toolbar;
        this.f66c = toolbar.getNavigationIcon();
        this.f67d = toolbar.getNavigationContentDescription();
    }
}
