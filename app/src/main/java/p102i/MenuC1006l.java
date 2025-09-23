package p102i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p028K.AbstractC0243S;
import p028K.AbstractC0245U;

/* renamed from: i.l */
/* loaded from: classes.dex */
public class MenuC1006l implements Menu {

    /* renamed from: y */
    public static final int[] f4250y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f4251a;

    /* renamed from: b */
    public final Resources f4252b;

    /* renamed from: c */
    public boolean f4253c;

    /* renamed from: d */
    public final boolean f4254d;

    /* renamed from: e */
    public InterfaceC1004j f4255e;

    /* renamed from: f */
    public final ArrayList f4256f;

    /* renamed from: g */
    public final ArrayList f4257g;

    /* renamed from: h */
    public boolean f4258h;

    /* renamed from: i */
    public final ArrayList f4259i;

    /* renamed from: j */
    public final ArrayList f4260j;

    /* renamed from: k */
    public boolean f4261k;

    /* renamed from: m */
    public CharSequence f4263m;

    /* renamed from: n */
    public Drawable f4264n;

    /* renamed from: o */
    public View f4265o;

    /* renamed from: v */
    public C1008n f4272v;

    /* renamed from: x */
    public boolean f4274x;

    /* renamed from: l */
    public int f4262l = 0;

    /* renamed from: p */
    public boolean f4266p = false;

    /* renamed from: q */
    public boolean f4267q = false;

    /* renamed from: r */
    public boolean f4268r = false;

    /* renamed from: s */
    public boolean f4269s = false;

    /* renamed from: t */
    public final ArrayList f4270t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f4271u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f4273w = false;

    public MenuC1006l(Context context) {
        boolean zM706b;
        boolean z2 = false;
        this.f4251a = context;
        Resources resources = context.getResources();
        this.f4252b = resources;
        this.f4256f = new ArrayList();
        this.f4257g = new ArrayList();
        this.f4258h = true;
        this.f4259i = new ArrayList();
        this.f4260j = new ArrayList();
        this.f4261k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0245U.f821a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM706b = AbstractC0243S.m706b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM706b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM706b) {
                z2 = true;
            }
        }
        this.f4254d = z2;
    }

    /* renamed from: a */
    public final C1008n m2570a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f4250y[i6] << 16) | (65535 & i4);
        C1008n c1008n = new C1008n(this, i2, i3, i4, i7, charSequence, this.f4262l);
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((C1008n) arrayList.get(size)).f4284d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, c1008n);
        mo1072p(true);
        return c1008n;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2570a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f4251a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1008n c1008nM2570a = m2570a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            c1008nM2570a.setIcon(resolveInfo.loadIcon(packageManager));
            c1008nM2570a.f4287g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = c1008nM2570a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m2571b(InterfaceC1019y interfaceC1019y, Context context) {
        this.f4271u.add(new WeakReference(interfaceC1019y));
        interfaceC1019y.mo1067h(context, this);
        this.f4261k = true;
    }

    /* renamed from: c */
    public final void m2572c(boolean z2) {
        if (this.f4269s) {
            return;
        }
        this.f4269s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
            if (interfaceC1019y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1019y.mo1062a(this, z2);
            }
        }
        this.f4269s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1008n c1008n = this.f4272v;
        if (c1008n != null) {
            mo2553d(c1008n);
        }
        this.f4256f.clear();
        mo1072p(true);
    }

    public final void clearHeader() {
        this.f4264n = null;
        this.f4263m = null;
        this.f4265o = null;
        mo1072p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2572c(true);
    }

    /* renamed from: d */
    public boolean mo2553d(C1008n c1008n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
        boolean zMo1065e = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4272v == c1008n) {
            m2583w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
                if (interfaceC1019y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1065e = interfaceC1019y.mo1065e(c1008n);
                    if (zMo1065e) {
                        break;
                    }
                }
            }
            m2582v();
            if (zMo1065e) {
                this.f4272v = null;
            }
        }
        return zMo1065e;
    }

    /* renamed from: e */
    public boolean mo2554e(MenuC1006l menuC1006l, MenuItem menuItem) {
        InterfaceC1004j interfaceC1004j = this.f4255e;
        return interfaceC1004j != null && interfaceC1004j.mo1074h(menuC1006l, menuItem);
    }

    /* renamed from: f */
    public boolean mo2555f(C1008n c1008n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
        boolean zMo1069l = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2583w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
            if (interfaceC1019y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo1069l = interfaceC1019y.mo1069l(c1008n);
                if (zMo1069l) {
                    break;
                }
            }
        }
        m2582v();
        if (zMo1069l) {
            this.f4272v = c1008n;
        }
        return zMo1069l;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1008n c1008n = (C1008n) arrayList.get(i3);
            if (c1008n.f4281a == i2) {
                return c1008n;
            }
            if (c1008n.hasSubMenu() && (menuItemFindItem = c1008n.f4295o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C1008n m2573g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4270t;
        arrayList.clear();
        m2574h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1008n) arrayList.get(0);
        }
        boolean zMo2559n = mo2559n();
        for (int i3 = 0; i3 < size; i3++) {
            C1008n c1008n = (C1008n) arrayList.get(i3);
            char c3 = zMo2559n ? c1008n.f4290j : c1008n.f4288h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zMo2559n && c3 == '\b' && i2 == 67))) {
                return c1008n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f4256f.get(i2);
    }

    /* renamed from: h */
    public final void m2574h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zMo2559n = mo2559n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f4256f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1008n c1008n = (C1008n) arrayList2.get(i3);
                if (c1008n.hasSubMenu()) {
                    c1008n.f4295o.m2574h(arrayList, i2, keyEvent);
                }
                char c3 = zMo2559n ? c1008n.f4290j : c1008n.f4288h;
                if ((modifiers & 69647) == ((zMo2559n ? c1008n.f4291k : c1008n.f4289i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (zMo2559n && c3 == '\b' && i2 == 67)) && c1008n.isEnabled()) {
                        arrayList.add(c1008n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4274x) {
            return true;
        }
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C1008n) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m2575i() {
        ArrayList arrayListM2576l = m2576l();
        if (this.f4261k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zMo1066g = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
                if (interfaceC1019y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo1066g |= interfaceC1019y.mo1066g();
                }
            }
            ArrayList arrayList = this.f4259i;
            ArrayList arrayList2 = this.f4260j;
            if (zMo1066g) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM2576l.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1008n c1008n = (C1008n) arrayListM2576l.get(i2);
                    if ((c1008n.f4304x & 32) == 32) {
                        arrayList.add(c1008n);
                    } else {
                        arrayList2.add(c1008n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2576l());
            }
            this.f4261k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m2573g(i2, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo2556j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public MenuC1006l mo2557k() {
        return this;
    }

    /* renamed from: l */
    public final ArrayList m2576l() {
        boolean z2 = this.f4258h;
        ArrayList arrayList = this.f4257g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4256f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1008n c1008n = (C1008n) arrayList2.get(i2);
            if (c1008n.isVisible()) {
                arrayList.add(c1008n);
            }
        }
        this.f4258h = false;
        this.f4261k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo2558m() {
        return this.f4273w;
    }

    /* renamed from: n */
    public boolean mo2559n() {
        return this.f4253c;
    }

    /* renamed from: o */
    public boolean mo2560o() {
        return this.f4254d;
    }

    /* renamed from: p */
    public void mo1072p(boolean z2) {
        if (this.f4266p) {
            this.f4267q = true;
            if (z2) {
                this.f4268r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f4258h = true;
            this.f4261k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2583w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
            if (interfaceC1019y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1019y.mo1064d();
            }
        }
        m2582v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return m2577q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C1008n c1008nM2573g = m2573g(i2, keyEvent);
        boolean zM2577q = c1008nM2573g != null ? m2577q(c1008nM2573g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m2572c(true);
        }
        return zM2577q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2577q(android.view.MenuItem r7, p102i.InterfaceC1019y r8, int r9) {
        /*
            r6 = this;
            i.n r7 = (p102i.C1008n) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f4296p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L3b
        L1a:
            i.l r1 = r7.f4294n
            boolean r3 = r1.mo2554e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f4287g
            if (r3 == 0) goto L2d
            android.content.Context r1 = r1.f4251a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            i.o r1 = r7.f4278A
            if (r1 == 0) goto L3a
            android.view.ActionProvider r1 = r1.f4307a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3a
            goto L18
        L3a:
            r1 = r0
        L3b:
            i.o r3 = r7.f4278A
            if (r3 == 0) goto L49
            android.view.ActionProvider r4 = r3.f4307a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r0
        L4a:
            boolean r5 = r7.m2586e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.m2572c(r2)
            goto Lcb
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L65
            goto L6d
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.m2572c(r2)
            goto Lcb
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.m2572c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            i.E r9 = new i.E
            android.content.Context r5 = r6.f4251a
            r9.<init>(r5, r6, r7)
            r7.f4295o = r9
            java.lang.CharSequence r5 = r7.f4285e
            r9.setHeaderTitle(r5)
        L88:
            i.E r7 = r7.f4295o
            if (r4 == 0) goto L93
            i.s r9 = r3.f4308b
            android.view.ActionProvider r9 = r3.f4307a
            r9.onPrepareSubMenu(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f4271u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.mo1071n(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i.y r4 = (p102i.InterfaceC1019y) r4
            if (r4 != 0) goto Lbe
            r9.remove(r3)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.mo1071n(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.m2572c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p102i.MenuC1006l.m2577q(android.view.MenuItem, i.y, int):boolean");
    }

    /* renamed from: r */
    public final void m2578r(InterfaceC1019y interfaceC1019y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4271u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1019y interfaceC1019y2 = (InterfaceC1019y) weakReference.get();
            if (interfaceC1019y2 == null || interfaceC1019y2 == interfaceC1019y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C1008n) arrayList.get(i4)).f4282b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C1008n) arrayList.get(i4)).f4282b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f4256f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            mo1072p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1008n) arrayList.get(i3)).f4281a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f4256f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            mo1072p(true);
        }
    }

    /* renamed from: s */
    public final void m2579s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2556j());
        int size = this.f4256f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0994E) item.getSubMenu()).m2579s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1008n c1008n = (C1008n) arrayList.get(i3);
            if (c1008n.f4282b == i2) {
                c1008n.m2587f(z3);
                c1008n.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f4273w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1008n c1008n = (C1008n) arrayList.get(i3);
            if (c1008n.f4282b == i2) {
                c1008n.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f4256f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C1008n c1008n = (C1008n) arrayList.get(i3);
            if (c1008n.f4282b == i2) {
                int i4 = c1008n.f4304x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                c1008n.f4304x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            mo1072p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f4253c = z2;
        mo1072p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4256f.size();
    }

    /* renamed from: t */
    public final void m2580t(Bundle bundle) {
        int size = this.f4256f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0994E) item.getSubMenu()).m2580t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2556j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m2581u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f4265o = view;
            this.f4263m = null;
            this.f4264n = null;
        } else {
            if (i2 > 0) {
                this.f4263m = this.f4252b.getText(i2);
            } else if (charSequence != null) {
                this.f4263m = charSequence;
            }
            if (i3 > 0) {
                this.f4264n = AbstractC0000a.m1b(this.f4251a, i3);
            } else if (drawable != null) {
                this.f4264n = drawable;
            }
            this.f4265o = null;
        }
        mo1072p(false);
    }

    /* renamed from: v */
    public final void m2582v() {
        this.f4266p = false;
        if (this.f4267q) {
            this.f4267q = false;
            mo1072p(this.f4268r);
        }
    }

    /* renamed from: w */
    public final void m2583w() {
        if (this.f4266p) {
            return;
        }
        this.f4266p = true;
        this.f4267q = false;
        this.f4268r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m2570a(0, 0, 0, this.f4252b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f4252b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m2570a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C1008n c1008nM2570a = m2570a(i2, i3, i4, charSequence);
        SubMenuC0994E subMenuC0994E = new SubMenuC0994E(this.f4251a, this, c1008nM2570a);
        c1008nM2570a.f4295o = subMenuC0994E;
        subMenuC0994E.setHeaderTitle(c1008nM2570a.f4285e);
        return subMenuC0994E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m2570a(i2, i3, i4, this.f4252b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f4252b.getString(i5));
    }
}
