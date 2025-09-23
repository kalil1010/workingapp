package p090e;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p099h.AbstractC0982l;
import p099h.AbstractC0983m;
import p099h.AbstractC0984n;
import p102i.MenuC1006l;

/* renamed from: e.q */
/* loaded from: classes.dex */
public final class WindowCallbackC0884q implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f3628a;

    /* renamed from: b */
    public boolean f3629b;

    /* renamed from: c */
    public boolean f3630c;

    /* renamed from: d */
    public boolean f3631d;

    /* renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C0888u f3632e;

    public WindowCallbackC0884q(LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u, Window.Callback callback) {
        this.f3632e = layoutInflaterFactory2C0888u;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f3628a = callback;
    }

    /* renamed from: a */
    public final void m2244a(Window.Callback callback) {
        try {
            this.f3629b = true;
            callback.onContentChanged();
        } finally {
            this.f3629b = false;
        }
    }

    /* renamed from: b */
    public final boolean m2245b(int i2, Menu menu) {
        return this.f3628a.onMenuOpened(i2, menu);
    }

    /* renamed from: c */
    public final void m2246c(int i2, Menu menu) {
        this.f3628a.onPanelClosed(i2, menu);
    }

    /* renamed from: d */
    public final void m2247d(List list, Menu menu, int i2) {
        AbstractC0983m.m2490a(this.f3628a, list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3628a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3630c;
        Window.Callback callback = this.f3628a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f3632e.m2264t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f3628a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            e.u r2 = r6.f3632e
            r2.m2250A()
            e.H r3 = r2.f3695o
            r4 = 0
            if (r3 == 0) goto L3d
            e.G r3 = r3.f3561v
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            i.l r3 = r3.f3536d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            e.t r0 = r2.f3669M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2255F(r0, r3, r7)
            if (r0 == 0) goto L52
            e.t r7 = r2.f3669M
            if (r7 == 0) goto L3b
            r7.f3648l = r1
            goto L3b
        L52:
            e.t r0 = r2.f3669M
            if (r0 != 0) goto L6a
            e.t r0 = r2.m2270z(r4)
            r2.m2256G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2255F(r0, r3, r7)
            r0.f3647k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.WindowCallbackC0884q.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3628a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3628a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3628a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3628a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3628a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f3628a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3629b) {
            this.f3628a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof MenuC1006l)) {
            return this.f3628a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        return this.f3628a.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f3628a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f3628a.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m2245b(i2, menu);
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3632e;
        if (i2 != 108) {
            layoutInflaterFactory2C0888u.getClass();
            return true;
        }
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h != null && true != c0867h.f3564y) {
            c0867h.f3564y = true;
            ArrayList arrayList = c0867h.f3565z;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f3631d) {
            this.f3628a.onPanelClosed(i2, menu);
            return;
        }
        m2246c(i2, menu);
        LayoutInflaterFactory2C0888u layoutInflaterFactory2C0888u = this.f3632e;
        if (i2 != 108) {
            if (i2 != 0) {
                layoutInflaterFactory2C0888u.getClass();
                return;
            }
            C0887t c0887tM2270z = layoutInflaterFactory2C0888u.m2270z(i2);
            if (c0887tM2270z.f3649m) {
                layoutInflaterFactory2C0888u.m2263r(c0887tM2270z, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0888u.m2250A();
        C0867H c0867h = layoutInflaterFactory2C0888u.f3695o;
        if (c0867h == null || !c0867h.f3564y) {
            return;
        }
        c0867h.f3564y = false;
        ArrayList arrayList = c0867h.f3565z;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0984n.m2491a(this.f3628a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        MenuC1006l menuC1006l = menu instanceof MenuC1006l ? (MenuC1006l) menu : null;
        if (i2 == 0 && menuC1006l == null) {
            return false;
        }
        if (menuC1006l != null) {
            menuC1006l.f4274x = true;
        }
        boolean zOnPreparePanel = this.f3628a.onPreparePanel(i2, view, menu);
        if (menuC1006l != null) {
            menuC1006l.f4274x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        MenuC1006l menuC1006l = this.f3632e.m2270z(0).f3644h;
        if (menuC1006l != null) {
            m2247d(list, menuC1006l, i2);
        } else {
            m2247d(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0982l.m2488a(this.f3628a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3628a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f3628a.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090e.WindowCallbackC0884q.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f3628a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
