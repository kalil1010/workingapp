package p010D0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0818j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import p028K.C0253b;
import p031L.C0340j;
import p031L.C0341k;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: D0.e */
/* loaded from: classes.dex */
public final class C0107e extends C0253b {

    /* renamed from: d */
    public final /* synthetic */ int f262d;

    /* renamed from: e */
    public final /* synthetic */ Object f263e;

    public /* synthetic */ C0107e(int i2, Object obj) {
        this.f262d = i2;
        this.f263e = obj;
    }

    @Override // p028K.C0253b
    /* renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f262d) {
            case 1:
                super.mo315c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f263e).f3268d);
                break;
            default:
                super.mo315c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p028K.C0253b
    /* renamed from: d */
    public final void mo316d(View view, C0341k c0341k) {
        int i2;
        Object obj = this.f263e;
        View.AccessibilityDelegate accessibilityDelegate = this.f832a;
        switch (this.f262d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0341k.f1085a);
                int i3 = MaterialButtonToggleGroup.f3124k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i2 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m2065c(i4)) {
                                i2++;
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                c0341k.m930j(C0340j.m920a(0, 1, i2, 1, false, ((MaterialButton) view).f3121o));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = c0341k.f1085a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f3269e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f3268d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0341k.f1085a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f3280x);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0341k.f1085a);
                C0818j c0818j = (C0818j) obj;
                c0341k.m931k(c0818j.f3195c0.getVisibility() == 0 ? c0818j.m1758v().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0818j.m1758v().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
