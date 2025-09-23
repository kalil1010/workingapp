package p080b1;

import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.C0004c;
import p006C.AbstractC0075g;
import p028K.AbstractC0241P;
import p028K.C0288s0;
import p028K.C0292u0;
import p028K.InterfaceC0283q;
import p033L1.AbstractC0364l;
import p087d0.InterfaceC0848e;
import p092e1.AbstractC0897c;
import p102i.C0999e;
import p102i.C1008n;
import p102i.InterfaceC1004j;
import p102i.InterfaceC1018x;
import p102i.MenuC1006l;
import p102i.RunnableC0998d;
import p102i.SubMenuC0994E;
import p102i.ViewOnKeyListenerC1000f;
import p105j.C1091f1;
import p105j.C1104k;
import p105j.InterfaceC1036G0;
import p105j.InterfaceC1075a0;
import p105j.InterfaceC1113n;
import p115m0.EnumC1231b;
import p142w0.AbstractC1384c;
import p144x.C1391d;
import p146x1.InterfaceC1397b;

/* renamed from: b1.h */
/* loaded from: classes.dex */
public class C0770h implements InterfaceC0779q, InterfaceC0848e, InterfaceC1036G0, InterfaceC1018x, InterfaceC1004j, InterfaceC1075a0, InterfaceC1397b, InterfaceC0283q {

    /* renamed from: a */
    public Object f2887a;

    public /* synthetic */ C0770h(Object obj) {
        this.f2887a = obj;
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: a */
    public void mo1977a(MenuC1006l menuC1006l, boolean z2) {
        if (menuC1006l instanceof SubMenuC0994E) {
            ((SubMenuC0994E) menuC1006l).f4185z.mo2557k().m2572c(false);
        }
        InterfaceC1018x interfaceC1018x = ((C1104k) this.f2887a).f4534e;
        if (interfaceC1018x != null) {
            interfaceC1018x.mo1977a(menuC1006l, z2);
        }
    }

    @Override // p105j.InterfaceC1075a0
    /* renamed from: b */
    public void mo1982b(int i2) {
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: c */
    public void mo1073c(MenuC1006l menuC1006l) {
        C1091f1 c1091f1 = ((ActionMenuView) this.f2887a).f2137u;
        if (c1091f1 != null) {
            c1091f1.mo1073c(menuC1006l);
        }
    }

    @Override // p028K.InterfaceC0283q
    /* renamed from: d */
    public C0292u0 mo67d(View view, C0292u0 c0292u0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2887a;
        if (!Objects.equals(coordinatorLayout.f2295n, c0292u0)) {
            coordinatorLayout.f2295n = c0292u0;
            boolean z2 = c0292u0.m821d() > 0;
            coordinatorLayout.f2296o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0288s0 c0288s0 = c0292u0.f910a;
            if (!c0288s0.mo805m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    if (childAt.getFitsSystemWindows() && ((C1391d) childAt.getLayoutParams()).f6008a != null && c0288s0.mo805m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0292u0;
    }

    @Override // p087d0.InterfaceC0848e
    /* renamed from: e */
    public void mo1978e(int i2, Serializable serializable) {
        if (i2 == 6 || i2 == 7 || i2 == 8) {
        }
        ((ProfileInstallReceiver) this.f2887a).setResultCode(i2);
    }

    @Override // p102i.InterfaceC1018x
    /* renamed from: f */
    public boolean mo1979f(MenuC1006l menuC1006l) {
        C1104k c1104k = (C1104k) this.f2887a;
        if (menuC1006l == c1104k.f4532c) {
            return false;
        }
        c1104k.f4554y = ((SubMenuC0994E) menuC1006l).f4184A.f4281a;
        InterfaceC1018x interfaceC1018x = c1104k.f4534e;
        if (interfaceC1018x != null) {
            return interfaceC1018x.mo1979f(menuC1006l);
        }
        return false;
    }

    @Override // p105j.InterfaceC1036G0
    /* renamed from: g */
    public void mo1983g(MenuC1006l menuC1006l, C1008n c1008n) {
        ViewOnKeyListenerC1000f viewOnKeyListenerC1000f = (ViewOnKeyListenerC1000f) this.f2887a;
        viewOnKeyListenerC1000f.f4215f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1000f.f4217h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC1006l == ((C0999e) arrayList.get(i2)).f4209b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC1000f.f4215f.postAtTime(new RunnableC0998d(this, i3 < arrayList.size() ? (C0999e) arrayList.get(i3) : null, c1008n, menuC1006l), menuC1006l, SystemClock.uptimeMillis() + 200);
    }

    @Override // p102i.InterfaceC1004j
    /* renamed from: h */
    public boolean mo1074h(MenuC1006l menuC1006l, MenuItem menuItem) {
        InterfaceC1113n interfaceC1113n = ((ActionMenuView) this.f2887a).f2142z;
        if (interfaceC1113n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1091f1) interfaceC1113n).f4506a.f2206G.f46b).iterator();
        if (it.hasNext()) {
            throw AbstractC0075g.m235d(it);
        }
        return false;
    }

    @Override // p080b1.InterfaceC0779q
    /* renamed from: i */
    public Object mo22i() {
        Constructor constructor = (Constructor) this.f2887a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e3) {
            AbstractC0364l abstractC0364l = AbstractC0897c.f3726a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0897c.m2274b(constructor) + "' with no args", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0897c.m2274b(constructor) + "' with no args", e5.getCause());
        }
    }

    @Override // p146x1.InterfaceC1397b
    public Iterator iterator() {
        return ((List) this.f2887a).iterator();
    }

    @Override // p105j.InterfaceC1075a0
    /* renamed from: j */
    public void mo1984j(int i2) {
    }

    @Override // p105j.InterfaceC1036G0
    /* renamed from: k */
    public void mo1985k(MenuC1006l menuC1006l, C1008n c1008n) {
        ((ViewOnKeyListenerC1000f) this.f2887a).f4215f.removeCallbacksAndMessages(menuC1006l);
    }

    /* renamed from: l */
    public byte[] m1986l(byte[] bArr) {
        C0004c c0004c = (C0004c) this.f2887a;
        byte[] bArrM35v = c0004c.m35v(bArr);
        if (AbstractC1384c.m3155a(bArrM35v, EnumC1231b.f4946e)) {
            bArr[bArr.length - 1] = bArrM35v[bArrM35v.length - 1];
            return c0004c.m35v(bArr);
        }
        if (!AbstractC1384c.m3155a(bArrM35v, EnumC1231b.f4944c)) {
            return bArrM35v;
        }
        byte b = bArrM35v[bArrM35v.length - 1];
        byte[] bArr2 = new byte[5];
        byte b3 = (byte) 0;
        bArr2[0] = b3;
        bArr2[1] = (byte) 12;
        bArr2[2] = b3;
        bArr2[3] = b3;
        bArr2[4] = (byte) (bArr2[4] + b);
        return c0004c.m35v(bArr2);
    }
}
