package p054T;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p018G0.C0164d;
import p028K.AbstractC0241P;
import p031L.C0341k;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final class C0502a extends C0004c {

    /* renamed from: d */
    public final /* synthetic */ AbstractC0503b f1536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502a(AbstractC0503b abstractC0503b) {
        super(13);
        this.f1536d = abstractC0503b;
    }

    @Override // p001A0.C0004c
    /* renamed from: q */
    public final C0341k mo30q(int i2) {
        return new C0341k(AccessibilityNodeInfo.obtain(this.f1536d.m1248n(i2).f1085a));
    }

    @Override // p001A0.C0004c
    /* renamed from: r */
    public final C0341k mo31r(int i2) {
        AbstractC0503b abstractC0503b = this.f1536d;
        int i3 = i2 == 2 ? abstractC0503b.f1547k : abstractC0503b.f1548l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return mo30q(i3);
    }

    @Override // p001A0.C0004c
    /* renamed from: t */
    public final boolean mo33t(int i2, int i3, Bundle bundle) {
        int i4;
        AbstractC0503b abstractC0503b = this.f1536d;
        Chip chip = abstractC0503b.f1545i;
        if (i2 == -1) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            return chip.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return abstractC0503b.m1249p(i2);
        }
        if (i3 == 2) {
            return abstractC0503b.m1245j(i2);
        }
        boolean z2 = false;
        if (i3 == 64) {
            AccessibilityManager accessibilityManager = abstractC0503b.f1544h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = abstractC0503b.f1547k) == i2) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                abstractC0503b.f1547k = Integer.MIN_VALUE;
                abstractC0503b.f1545i.invalidate();
                abstractC0503b.m1250q(i4, 65536);
            }
            abstractC0503b.f1547k = i2;
            chip.invalidate();
            abstractC0503b.m1250q(i2, 32768);
            return true;
        }
        if (i3 == 128) {
            if (abstractC0503b.f1547k != i2) {
                return false;
            }
            abstractC0503b.f1547k = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC0503b.m1250q(i2, 65536);
            return true;
        }
        C0164d c0164d = (C0164d) abstractC0503b;
        if (i3 == 16) {
            Chip chip2 = c0164d.f544q;
            if (i2 == 0) {
                return chip2.performClick();
            }
            if (i2 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f3144h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z2 = true;
                }
                if (chip2.f3155s) {
                    chip2.f3154r.m1250q(1, 1);
                }
            }
        }
        return z2;
    }
}
