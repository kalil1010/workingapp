package p028K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p001A0.C0004c;
import p031L.C0336f;
import p031L.C0341k;
import p031L.InterfaceC0351u;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: K.b */
/* loaded from: classes.dex */
public class C0253b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f831c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f832a;

    /* renamed from: b */
    public final C0251a f833b;

    public C0253b() {
        this(f831c);
    }

    /* renamed from: a */
    public boolean mo726a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f832a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0004c mo727b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f832a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0004c(13, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        this.f832a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo316d(View view, C0341k c0341k) {
        this.f832a.onInitializeAccessibilityNodeInfo(view, c0341k.f1085a);
    }

    /* renamed from: e */
    public void mo728e(View view, AccessibilityEvent accessibilityEvent) {
        this.f832a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo729f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f832a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo730g(View view, int i2, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            C0336f c0336f = (C0336f) list.get(i3);
            if (c0336f.m894a() == i2) {
                InterfaceC0351u interfaceC0351u = c0336f.f1082d;
                if (interfaceC0351u != null) {
                    Class cls = c0336f.f1081c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = interfaceC0351u.mo19f(view);
                }
            } else {
                i3++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f832a.performAccessibilityAction(view, i2, bundle);
        }
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }

    /* renamed from: h */
    public void mo731h(View view, int i2) {
        this.f832a.sendAccessibilityEvent(view, i2);
    }

    /* renamed from: i */
    public void mo732i(View view, AccessibilityEvent accessibilityEvent) {
        this.f832a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0253b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f832a = accessibilityDelegate;
        this.f833b = new C0251a(this);
    }
}
