package p064W0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import p035M0.AbstractC0368A;
import p055T0.C0513g;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.C1034F0;
import p105j.C1116o;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: W0.v */
/* loaded from: classes.dex */
public final class C0576v extends C1116o {

    /* renamed from: e */
    public final C1034F0 f1844e;

    /* renamed from: f */
    public final AccessibilityManager f1845f;

    /* renamed from: g */
    public final Rect f1846g;

    /* renamed from: h */
    public final int f1847h;

    /* renamed from: i */
    public final float f1848i;

    /* renamed from: j */
    public ColorStateList f1849j;

    /* renamed from: k */
    public int f1850k;

    /* renamed from: l */
    public ColorStateList f1851l;

    public C0576v(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1846g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(context2, attributeSet, AbstractC1395a.f6040i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM1041f.hasValue(0) && typedArrayM1041f.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1847h = typedArrayM1041f.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1848i = typedArrayM1041f.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM1041f.hasValue(2)) {
            this.f1849j = ColorStateList.valueOf(typedArrayM1041f.getColor(2, 0));
        }
        this.f1850k = typedArrayM1041f.getColor(4, 0);
        this.f1851l = AbstractC0901d.m2318t(context2, typedArrayM1041f, 5);
        this.f1845f = (AccessibilityManager) context2.getSystemService("accessibility");
        C1034F0 c1034f0 = new C1034F0(context2, null, R.attr.listPopupWindowStyle);
        this.f1844e = c1034f0;
        c1034f0.f4375y = true;
        c1034f0.f4376z.setFocusable(true);
        c1034f0.f4365o = this;
        c1034f0.f4376z.setInputMethodMode(2);
        c1034f0.mo2630o(getAdapter());
        c1034f0.f4366p = new C0574t(0, this);
        if (typedArrayM1041f.hasValue(6)) {
            setSimpleItems(typedArrayM1041f.getResourceId(6, 0));
        }
        typedArrayM1041f.recycle();
    }

    /* renamed from: a */
    public static void m1385a(C0576v c0576v, Object obj) {
        c0576v.setText(c0576v.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m1386b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m1387c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1845f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m1387c()) {
            this.f1844e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1849j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM1386b = m1386b();
        return (textInputLayoutM1386b == null || !textInputLayoutM1386b.f3337E) ? super.getHint() : textInputLayoutM1386b.getHint();
    }

    public float getPopupElevation() {
        return this.f1848i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1850k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1851l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM1386b = m1386b();
        if (textInputLayoutM1386b != null && textInputLayoutM1386b.f3337E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1844e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM1386b = m1386b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM1386b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1034F0 c1034f0 = this.f1844e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c1034f0.f4376z.isShowing() ? -1 : c1034f0.f4353c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM1386b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c1034f0.f4376z.getBackground();
                if (background != null) {
                    Rect rect = this.f1846g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM1386b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (m1387c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f1844e.mo2630o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1034F0 c1034f0 = this.f1844e;
        if (c1034f0 != null) {
            c1034f0.m2627l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1849j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0513g) {
            ((C0513g) dropDownBackground).m1290j(this.f1849j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1844e.f4367q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout textInputLayoutM1386b = m1386b();
        if (textInputLayoutM1386b != null) {
            textInputLayoutM1386b.m2131s();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f1850k = i2;
        if (getAdapter() instanceof C0575u) {
            ((C0575u) getAdapter()).m1384a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1851l = colorStateList;
        if (getAdapter() instanceof C0575u) {
            ((C0575u) getAdapter()).m1384a();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m1387c()) {
            this.f1844e.mo2543i();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0575u(this, getContext(), this.f1847h, strArr));
    }
}
