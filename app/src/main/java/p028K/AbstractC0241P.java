package p028K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p031L.C0336f;
import p031L.InterfaceC0351u;
import p045Q.C0453q;
import p105j.C1136v;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.P */
/* loaded from: classes.dex */
public abstract class AbstractC0241P {

    /* renamed from: a */
    public static WeakHashMap f815a;

    /* renamed from: b */
    public static Field f816b;

    /* renamed from: c */
    public static boolean f817c;

    /* renamed from: d */
    public static final int[] f818d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C0299y f819e = new C0299y();

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0226A f820f = new ViewTreeObserverOnGlobalLayoutListenerC0226A();

    /* renamed from: a */
    public static C0248X m689a(View view) {
        if (f815a == null) {
            f815a = new WeakHashMap();
        }
        C0248X c0248x = (C0248X) f815a.get(view);
        if (c0248x != null) {
            return c0248x;
        }
        C0248X c0248x2 = new C0248X(view);
        f815a.put(view, c0248x2);
        return c0248x2;
    }

    /* renamed from: b */
    public static void m690b(View view, C0292u0 c0292u0) {
        WindowInsets windowInsetsM822f = c0292u0.m822f();
        if (windowInsetsM822f != null) {
            WindowInsets windowInsetsM615a = AbstractC0228C.m615a(view, windowInsetsM822f);
            if (windowInsetsM615a.equals(windowInsetsM822f)) {
                return;
            }
            C0292u0.m817g(view, windowInsetsM615a);
        }
    }

    /* renamed from: c */
    public static boolean m691c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0240O.f811d;
        C0240O c0240o = (C0240O) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0240o == null) {
            c0240o = new C0240O();
            c0240o.f812a = null;
            c0240o.f813b = null;
            c0240o.f814c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0240o);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0240o.f812a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0240O.f811d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0240o.f812a == null) {
                            c0240o.f812a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0240O.f811d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0240o.f812a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0240o.f812a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM688a = c0240o.m688a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM688a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0240o.f813b == null) {
                    c0240o.f813b = new SparseArray();
                }
                c0240o.f813b.put(keyCode, new WeakReference(viewM688a));
            }
        }
        return viewM688a != null;
    }

    /* renamed from: d */
    public static View.AccessibilityDelegate m692d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0235J.m674a(view);
        }
        if (f817c) {
            return null;
        }
        if (f816b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f816b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f817c = true;
                return null;
            }
        }
        try {
            Object obj = f816b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f817c = true;
            return null;
        }
    }

    /* renamed from: e */
    public static CharSequence m693e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0234I.m665b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m694f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static String[] m695g(C1136v c1136v) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0237L.m685a(c1136v) : (String[]) c1136v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static void m696h(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m693e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(m693e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m693e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static C0261f m697i(View view, C0261f c0261f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0261f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0237L.m686b(view, c0261f);
        }
        InterfaceC0285r interfaceC0285r = (InterfaceC0285r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0287s interfaceC0287s = f819e;
        if (interfaceC0285r == null) {
            if (view instanceof InterfaceC0287s) {
                interfaceC0287s = (InterfaceC0287s) view;
            }
            return interfaceC0287s.mo813a(c0261f);
        }
        C0261f c0261fM1138a = ((C0453q) interfaceC0285r).m1138a(view, c0261f);
        if (c0261fM1138a == null) {
            return null;
        }
        if (view instanceof InterfaceC0287s) {
            interfaceC0287s = (InterfaceC0287s) view;
        }
        return interfaceC0287s.mo813a(c0261fM1138a);
    }

    /* renamed from: j */
    public static void m698j(View view, int i2) {
        ArrayList arrayListM694f = m694f(view);
        for (int i3 = 0; i3 < arrayListM694f.size(); i3++) {
            if (((C0336f) arrayListM694f.get(i3)).m894a() == i2) {
                arrayListM694f.remove(i3);
                return;
            }
        }
    }

    /* renamed from: k */
    public static void m699k(View view, C0336f c0336f, InterfaceC0351u interfaceC0351u) {
        if (interfaceC0351u == null) {
            m698j(view, c0336f.m894a());
            m696h(view, 0);
            return;
        }
        C0336f c0336f2 = new C0336f(null, c0336f.f1080b, null, interfaceC0351u, c0336f.f1081c);
        View.AccessibilityDelegate accessibilityDelegateM692d = m692d(view);
        C0253b c0253b = accessibilityDelegateM692d == null ? null : accessibilityDelegateM692d instanceof C0251a ? ((C0251a) accessibilityDelegateM692d).f825a : new C0253b(accessibilityDelegateM692d);
        if (c0253b == null) {
            c0253b = new C0253b();
        }
        m701m(view, c0253b);
        m698j(view, c0336f2.m894a());
        m694f(view).add(c0336f2);
        m696h(view, 0);
    }

    /* renamed from: l */
    public static void m700l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0235J.m677d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* renamed from: m */
    public static void m701m(View view, C0253b c0253b) {
        if (c0253b == null && (m692d(view) instanceof C0251a)) {
            c0253b = new C0253b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0253b == null ? null : c0253b.f833b);
    }

    /* renamed from: n */
    public static void m702n(View view, CharSequence charSequence) {
        new C0300z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m613d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0226A viewTreeObserverOnGlobalLayoutListenerC0226A = f820f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0226A.f802a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0226A);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0226A);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0226A.f802a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0226A);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0226A);
            }
        }
    }
}
