package p031L;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.f */
/* loaded from: classes.dex */
public final class C0336f {

    /* renamed from: e */
    public static final C0336f f1069e = new C0336f(1);

    /* renamed from: f */
    public static final C0336f f1070f = new C0336f(2);

    /* renamed from: g */
    public static final C0336f f1071g;

    /* renamed from: h */
    public static final C0336f f1072h;

    /* renamed from: i */
    public static final C0336f f1073i;

    /* renamed from: j */
    public static final C0336f f1074j;

    /* renamed from: k */
    public static final C0336f f1075k;

    /* renamed from: l */
    public static final C0336f f1076l;

    /* renamed from: m */
    public static final C0336f f1077m;

    /* renamed from: n */
    public static final C0336f f1078n;

    /* renamed from: a */
    public final Object f1079a;

    /* renamed from: b */
    public final int f1080b;

    /* renamed from: c */
    public final Class f1081c;

    /* renamed from: d */
    public final InterfaceC0351u f1082d;

    static {
        new C0336f(4);
        new C0336f(8);
        f1071g = new C0336f(16);
        new C0336f(32);
        new C0336f(64);
        new C0336f(128);
        new C0336f(256, AbstractC0344n.class);
        new C0336f(512, AbstractC0344n.class);
        new C0336f(1024, AbstractC0345o.class);
        new C0336f(2048, AbstractC0345o.class);
        f1072h = new C0336f(4096);
        f1073i = new C0336f(8192);
        new C0336f(16384);
        new C0336f(32768);
        new C0336f(65536);
        new C0336f(131072, AbstractC0349s.class);
        f1074j = new C0336f(262144);
        f1075k = new C0336f(524288);
        f1076l = new C0336f(1048576);
        new C0336f(2097152, AbstractC0350t.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0347q.class);
        f1077m = new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f1078n = new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0336f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0336f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0336f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0336f(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0336f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0348r.class);
        new C0336f(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC0346p.class);
        new C0336f(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0336f(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0336f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0336f(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0336f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0336f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0336f(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0336f(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0336f(i2 >= 34 ? AbstractC0339i.m908a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0336f(int i2) {
        this(null, i2, null, null, null);
    }

    /* renamed from: a */
    public final int m894a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1079a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0336f)) {
            return false;
        }
        Object obj2 = ((C0336f) obj).f1079a;
        Object obj3 = this.f1079a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1079a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM921d = C0341k.m921d(this.f1080b);
        if (strM921d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1079a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM921d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM921d);
        return sb.toString();
    }

    public C0336f(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public C0336f(Object obj, int i2, String str, InterfaceC0351u interfaceC0351u, Class cls) {
        this.f1080b = i2;
        this.f1082d = interfaceC0351u;
        if (obj == null) {
            this.f1079a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f1079a = obj;
        }
        this.f1081c = cls;
    }
}
