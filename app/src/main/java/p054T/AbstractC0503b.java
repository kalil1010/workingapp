package p054T;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p018G0.C0164d;
import p018G0.C0166f;
import p028K.AbstractC0241P;
import p028K.C0253b;
import p031L.C0341k;
import p055T0.C0511e;

/* renamed from: T.b */
/* loaded from: classes.dex */
public abstract class AbstractC0503b extends C0253b {

    /* renamed from: n */
    public static final Rect f1537n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0511e f1538o = new C0511e(8);

    /* renamed from: p */
    public static final C0511e f1539p = new C0511e(9);

    /* renamed from: h */
    public final AccessibilityManager f1544h;

    /* renamed from: i */
    public final Chip f1545i;

    /* renamed from: j */
    public C0502a f1546j;

    /* renamed from: d */
    public final Rect f1540d = new Rect();

    /* renamed from: e */
    public final Rect f1541e = new Rect();

    /* renamed from: f */
    public final Rect f1542f = new Rect();

    /* renamed from: g */
    public final int[] f1543g = new int[2];

    /* renamed from: k */
    public int f1547k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f1548l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f1549m = Integer.MIN_VALUE;

    public AbstractC0503b(Chip chip) {
        this.f1545i = chip;
        this.f1544h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p028K.C0253b
    /* renamed from: b */
    public final C0004c mo727b(View view) {
        if (this.f1546j == null) {
            this.f1546j = new C0502a(this);
        }
        return this.f1546j;
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C0164d) this).f544q;
        C0166f c0166f = chip.f3141e;
        accessibilityNodeInfo.setCheckable(c0166f != null && c0166f.f568Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0341k.m929i(chip.getAccessibilityClassName());
        c0341k.m932l(chip.getText());
    }

    /* renamed from: j */
    public final boolean m1245j(int i2) {
        if (this.f1548l != i2) {
            return false;
        }
        this.f1548l = Integer.MIN_VALUE;
        C0164d c0164d = (C0164d) this;
        if (i2 == 1) {
            Chip chip = c0164d.f544q;
            chip.f3149m = false;
            chip.refreshDrawableState();
        }
        m1250q(i2, 8);
        return true;
    }

    /* renamed from: k */
    public final C0341k m1246k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0341k c0341k = new C0341k(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0341k.m929i("android.view.View");
        Rect rect = f1537n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f1545i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo430o(i2, c0341k);
        if (c0341k.m927g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1541e;
        c0341k.m926f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c0341k.f1086b = i2;
        accessibilityNodeInfoObtain.setSource(chip, i2);
        if (this.f1547k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0341k.m922a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0341k.m922a(64);
        }
        boolean z2 = this.f1548l == i2;
        if (z2) {
            c0341k.m922a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0341k.m922a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f1543g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1540d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0341k.m926f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1542f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            c0341k.f1085a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0341k;
    }

    /* renamed from: l */
    public abstract void mo429l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1247m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p054T.AbstractC0503b.m1247m(int, android.graphics.Rect):boolean");
    }

    /* renamed from: n */
    public final C0341k m1248n(int i2) {
        if (i2 != -1) {
            return m1246k(i2);
        }
        Chip chip = this.f1545i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C0341k c0341k = new C0341k(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo429l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0341k.f1085a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
        }
        return c0341k;
    }

    /* renamed from: o */
    public abstract void mo430o(int i2, C0341k c0341k);

    /* renamed from: p */
    public final boolean m1249p(int i2) {
        int i3;
        Chip chip = this.f1545i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f1548l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m1245j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1548l = i2;
        C0164d c0164d = (C0164d) this;
        if (i2 == 1) {
            Chip chip2 = c0164d.f544q;
            chip2.f3149m = true;
            chip2.refreshDrawableState();
        }
        m1250q(i2, 8);
        return true;
    }

    /* renamed from: q */
    public final void m1250q(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i2 == Integer.MIN_VALUE || !this.f1544h.isEnabled() || (parent = (view = this.f1545i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            C0341k c0341kM1248n = m1248n(i2);
            accessibilityEventObtain.getText().add(c0341kM1248n.m927g());
            AccessibilityNodeInfo accessibilityNodeInfo = c0341kM1248n.f1085a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i2);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
