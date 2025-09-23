package p060V;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p028K.AbstractC0241P;
import p028K.C0253b;
import p031L.C0336f;
import p031L.C0341k;
import p094f0.C0917P;
import p094f0.C0928a0;

/* renamed from: V.b */
/* loaded from: classes.dex */
public final class C0540b extends C0253b {

    /* renamed from: d */
    public final /* synthetic */ int f1705d;

    /* renamed from: e */
    public final Object f1706e;

    /* renamed from: f */
    public final Object f1707f;

    public C0540b(C0928a0 c0928a0) {
        this.f1705d = 1;
        this.f1707f = new WeakHashMap();
        this.f1706e = c0928a0;
    }

    @Override // p028K.C0253b
    /* renamed from: a */
    public final boolean mo726a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        Object obj = this.f1707f;
        switch (this.f1705d) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) obj;
                    View viewM1595h = drawerLayout.m1595h();
                    if (viewM1595h != null) {
                        int iM1598k = drawerLayout.m1598k(viewM1595h);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = AbstractC0241P.f815a;
                        Gravity.getAbsoluteGravity(iM1598k, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
            default:
                C0253b c0253b = (C0253b) ((WeakHashMap) obj).get(view);
                if (c0253b == null) {
                    break;
                } else {
                    break;
                }
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p028K.C0253b
    /* renamed from: b */
    public C0004c mo727b(View view) {
        switch (this.f1705d) {
            case 1:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                if (c0253b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.mo727b(view);
    }

    @Override // p028K.C0253b
    /* renamed from: c */
    public final void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1705d) {
            case 0:
                super.mo315c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                if (c0253b == null) {
                    super.mo315c(view, accessibilityEvent);
                    break;
                } else {
                    c0253b.mo315c(view, accessibilityEvent);
                    break;
                }
        }
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        Object obj = this.f1706e;
        switch (this.f1705d) {
            case 0:
                boolean z2 = DrawerLayout.f2350F;
                AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
                if (z2) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                    c0341k.f1086b = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = AbstractC0241P.f815a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj;
                    accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                    accessibilityNodeInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                    c0341k.m929i(accessibilityNodeInfoObtain.getClassName());
                    accessibilityNodeInfo.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                    accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                    accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                    accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                    c0341k.m922a(accessibilityNodeInfoObtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (DrawerLayout.m1583m(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                c0341k.m929i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0336f.f1069e.f1079a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0336f.f1070f.f1079a);
                break;
            default:
                C0928a0 c0928a0 = (C0928a0) obj;
                boolean zM1891L = c0928a0.f3836d.m1891L();
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0341k.f1085a;
                if (!zM1891L) {
                    RecyclerView recyclerView = c0928a0.f3836d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().m2360U(view, c0341k);
                        C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                        if (c0253b != null) {
                            c0253b.mo316d(view, c0341k);
                            break;
                        } else {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                            break;
                        }
                    }
                }
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                break;
        }
    }

    @Override // p028K.C0253b
    /* renamed from: e */
    public void mo728e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1705d) {
            case 1:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                if (c0253b == null) {
                    super.mo728e(view, accessibilityEvent);
                    break;
                } else {
                    c0253b.mo728e(view, accessibilityEvent);
                    break;
                }
            default:
                super.mo728e(view, accessibilityEvent);
                break;
        }
    }

    @Override // p028K.C0253b
    /* renamed from: f */
    public final boolean mo729f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1705d) {
            case 0:
                if (DrawerLayout.f2350F || DrawerLayout.m1583m(view)) {
                    break;
                }
                break;
            default:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(viewGroup);
                if (c0253b == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f832a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p028K.C0253b
    /* renamed from: g */
    public boolean mo730g(View view, int i2, Bundle bundle) {
        switch (this.f1705d) {
            case 1:
                C0928a0 c0928a0 = (C0928a0) this.f1706e;
                if (!c0928a0.f3836d.m1891L()) {
                    RecyclerView recyclerView = c0928a0.f3836d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                        if (c0253b == null ? !super.mo730g(view, i2, bundle) : !c0253b.mo730g(view, i2, bundle)) {
                            C0917P c0917p = recyclerView.getLayoutManager().f3753b.f2805b;
                            break;
                        }
                    }
                }
                break;
        }
        return super.mo730g(view, i2, bundle);
    }

    @Override // p028K.C0253b
    /* renamed from: h */
    public void mo731h(View view, int i2) {
        switch (this.f1705d) {
            case 1:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                if (c0253b == null) {
                    super.mo731h(view, i2);
                    break;
                } else {
                    c0253b.mo731h(view, i2);
                    break;
                }
            default:
                super.mo731h(view, i2);
                break;
        }
    }

    @Override // p028K.C0253b
    /* renamed from: i */
    public void mo732i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1705d) {
            case 1:
                C0253b c0253b = (C0253b) ((WeakHashMap) this.f1707f).get(view);
                if (c0253b == null) {
                    super.mo732i(view, accessibilityEvent);
                    break;
                } else {
                    c0253b.mo732i(view, accessibilityEvent);
                    break;
                }
            default:
                super.mo732i(view, accessibilityEvent);
                break;
        }
    }

    public C0540b(DrawerLayout drawerLayout) {
        this.f1705d = 0;
        this.f1707f = drawerLayout;
        this.f1706e = new Rect();
    }
}
