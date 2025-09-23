package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0839f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p001A0.C0004c;
import p010D0.C0106d;
import p010D0.C0107e;
import p010D0.C0108f;
import p028K.AbstractC0241P;
import p035M0.AbstractC0368A;
import p055T0.C0507a;
import p055T0.C0516j;
import p055T0.C0517k;
import p070Y0.AbstractC0601a;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f3124k = 0;

    /* renamed from: a */
    public final ArrayList f3125a;

    /* renamed from: b */
    public final C0004c f3126b;

    /* renamed from: c */
    public final LinkedHashSet f3127c;

    /* renamed from: d */
    public final C0106d f3128d;

    /* renamed from: e */
    public Integer[] f3129e;

    /* renamed from: f */
    public boolean f3130f;

    /* renamed from: g */
    public boolean f3131g;

    /* renamed from: h */
    public boolean f3132h;

    /* renamed from: i */
    public final int f3133i;

    /* renamed from: j */
    public HashSet f3134j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f3125a = new ArrayList();
        this.f3126b = new C0004c(6, this);
        this.f3127c = new LinkedHashSet();
        this.f3128d = new C0106d(this);
        this.f3130f = false;
        this.f3134j = new HashSet();
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(getContext(), attributeSet, AbstractC1395a.f6042k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM1041f.getBoolean(3, false));
        this.f3133i = typedArrayM1041f.getResourceId(1, -1);
        this.f3132h = typedArrayM1041f.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM1041f.getBoolean(0, true));
        typedArrayM1041f.recycle();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m2065c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m2065c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m2065c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3126b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m2063a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i2, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            m2064b(materialButton.getId(), materialButton.f3121o);
            C0517k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f3125a.add(new C0108f(shapeAppearanceModel.f1640e, shapeAppearanceModel.f1643h, shapeAppearanceModel.f1641f, shapeAppearanceModel.f1642g));
            materialButton.setEnabled(isEnabled());
            AbstractC0241P.m701m(materialButton, new C0107e(0, this));
        }
    }

    /* renamed from: b */
    public final void m2064b(int i2, boolean z2) {
        if (i2 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f3134j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f3131g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f3132h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        m2066d(hashSet);
    }

    /* renamed from: c */
    public final boolean m2065c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m2066d(Set set) {
        HashSet hashSet = this.f3134j;
        this.f3134j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f3130f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f3130f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3127c.iterator();
                while (it.hasNext()) {
                    ((C0839f) it.next()).m2147a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3128d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f3129e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m2067e() {
        C0108f c0108f;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                C0516j c0516jM1300e = materialButton.getShapeAppearanceModel().m1300e();
                C0108f c0108f2 = (C0108f) this.f3125a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0507a c0507a = C0108f.f264e;
                    if (i2 == firstVisibleChildIndex) {
                        c0108f = z2 ? AbstractC0368A.m1040e(this) ? new C0108f(c0507a, c0507a, c0108f2.f266b, c0108f2.f267c) : new C0108f(c0108f2.f265a, c0108f2.f268d, c0507a, c0507a) : new C0108f(c0108f2.f265a, c0507a, c0108f2.f266b, c0507a);
                    } else if (i2 == lastVisibleChildIndex) {
                        c0108f = z2 ? AbstractC0368A.m1040e(this) ? new C0108f(c0108f2.f265a, c0108f2.f268d, c0507a, c0507a) : new C0108f(c0507a, c0507a, c0108f2.f266b, c0108f2.f267c) : new C0108f(c0507a, c0108f2.f268d, c0507a, c0108f2.f267c);
                    } else {
                        c0108f2 = null;
                    }
                    c0108f2 = c0108f;
                }
                if (c0108f2 == null) {
                    c0516jM1300e.f1628e = new C0507a(0.0f);
                    c0516jM1300e.f1629f = new C0507a(0.0f);
                    c0516jM1300e.f1630g = new C0507a(0.0f);
                    c0516jM1300e.f1631h = new C0507a(0.0f);
                } else {
                    c0516jM1300e.f1628e = c0108f2.f265a;
                    c0516jM1300e.f1631h = c0108f2.f268d;
                    c0516jM1300e.f1629f = c0108f2.f266b;
                    c0516jM1300e.f1630g = c0108f2.f267c;
                }
                materialButton.setShapeAppearanceModel(c0516jM1300e.m1295a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f3131g || this.f3134j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3134j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f3134j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f3129e;
        return (numArr == null || i3 >= numArr.length) ? i3 : numArr[i3].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f3133i;
        if (i2 != -1) {
            m2066d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3131g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        m2067e();
        m2063a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f3125a.remove(iIndexOfChild);
        }
        m2067e();
        m2063a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f3132h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f3131g != z2) {
            this.f3131g = z2;
            m2066d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f3131g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
