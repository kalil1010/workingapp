package com.google.android.material.navigation;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.C0636b;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p002A1.C0027i;
import p028K.AbstractC0241P;
import p028K.C0247W;
import p028K.C0254b0;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0392u;
import p035M0.C0377f;
import p035M0.C0388q;
import p038N0.C0417d;
import p038N0.C0422i;
import p038N0.InterfaceC0415b;
import p041O0.AbstractC0425a;
import p041O0.C0426b;
import p041O0.C0429e;
import p041O0.InterfaceC0428d;
import p041O0.ViewTreeObserverOnGlobalLayoutListenerC0427c;
import p055T0.AbstractC0529w;
import p055T0.C0507a;
import p055T0.C0513g;
import p055T0.C0516j;
import p055T0.C0517k;
import p060V.C0542d;
import p099h.C0979i;
import p102i.C1008n;
import p102i.InterfaceC1019y;
import p148y0.AbstractC1400a;

/* loaded from: classes.dex */
public class NavigationView extends AbstractC0392u implements InterfaceC0415b {

    /* renamed from: w */
    public static final int[] f3284w = {R.attr.state_checked};

    /* renamed from: x */
    public static final int[] f3285x = {-16842910};

    /* renamed from: h */
    public final C0377f f3286h;

    /* renamed from: i */
    public final C0388q f3287i;

    /* renamed from: j */
    public final int f3288j;

    /* renamed from: k */
    public final int[] f3289k;

    /* renamed from: l */
    public C0979i f3290l;

    /* renamed from: m */
    public final ViewTreeObserverOnGlobalLayoutListenerC0427c f3291m;

    /* renamed from: n */
    public boolean f3292n;

    /* renamed from: o */
    public boolean f3293o;

    /* renamed from: p */
    public int f3294p;

    /* renamed from: q */
    public final boolean f3295q;

    /* renamed from: r */
    public final int f3296r;

    /* renamed from: s */
    public final AbstractC0529w f3297s;

    /* renamed from: t */
    public final C0422i f3298t;

    /* renamed from: u */
    public final C0027i f3299u;

    /* renamed from: v */
    public final C0426b f3300v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8 A[PHI: r9
  0x01c8: PHI (r9v3 android.graphics.drawable.Drawable) = 
  (r9v2 android.graphics.drawable.Drawable)
  (r9v7 android.graphics.drawable.Drawable)
  (r9v2 android.graphics.drawable.Drawable)
 binds: [B:54:0x018b, B:60:0x01b1, B:58:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(android.content.Context r19, android.util.AttributeSet r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f3290l == null) {
            this.f3290l = new C0979i(getContext());
        }
        return this.f3290l;
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: a */
    public final void mo1085a() {
        int i2 = 1;
        Pair pairM2106h = m2106h();
        DrawerLayout drawerLayout = (DrawerLayout) pairM2106h.first;
        C0422i c0422i = this.f3298t;
        C0636b c0636b = c0422i.f1297f;
        c0422i.f1297f = null;
        if (c0636b == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m1590c(this, true);
            return;
        }
        int i3 = ((C0542d) pairM2106h.second).f1708a;
        int i4 = AbstractC0425a.f1312a;
        c0422i.m1095b(c0636b, i3, new C0254b0(drawerLayout, this, i2), new C0247W(i2, drawerLayout));
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: b */
    public final void mo1086b(C0636b c0636b) {
        m2106h();
        this.f3298t.f1297f = c0636b;
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: c */
    public final void mo1087c(C0636b c0636b) {
        int i2 = ((C0542d) m2106h().second).f1708a;
        C0422i c0422i = this.f3298t;
        C0636b c0636b2 = c0422i.f1297f;
        c0422i.f1297f = c0636b;
        float f = c0636b.f1981c;
        if (c0636b2 != null) {
            c0422i.m1096c(f, c0636b.f1982d == 0, i2);
        }
        if (this.f3295q) {
            this.f3294p = AbstractC1400a.m3166c(0, this.f3296r, c0422i.f1292a.getInterpolation(f));
            m2105g(getWidth(), getHeight());
        }
    }

    @Override // p038N0.InterfaceC0415b
    /* renamed from: d */
    public final void mo1088d() {
        m2106h();
        this.f3298t.m1094a();
        if (!this.f3295q || this.f3294p == 0) {
            return;
        }
        this.f3294p = 0;
        m2105g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0529w abstractC0529w = this.f3297s;
        if (abstractC0529w.mo1311b()) {
            Path path = abstractC0529w.f1690e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final ColorStateList m2103e(int i2) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM969s = AbstractC0356d.m969s(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(tkbmmn.ghwbbf.irvjzy.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateListM969s.getDefaultColor();
        int[] iArr = f3285x;
        return new ColorStateList(new int[][]{iArr, f3284w, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM969s.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    /* renamed from: f */
    public final InsetDrawable m2104f(C0027i c0027i, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) c0027i.f66c;
        C0513g c0513g = new C0513g(C0517k.m1296a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0), new C0507a(0)).m1295a());
        c0513g.m1290j(colorStateList);
        return new InsetDrawable((Drawable) c0513g, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    /* renamed from: g */
    public final void m2105g(int i2, int i3) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof C0542d)) {
            if ((this.f3294p > 0 || this.f3295q) && (getBackground() instanceof C0513g)) {
                int i4 = ((C0542d) getLayoutParams()).f1708a;
                WeakHashMap weakHashMap = AbstractC0241P.f815a;
                boolean z2 = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) == 3;
                C0513g c0513g = (C0513g) getBackground();
                C0516j c0516jM1300e = c0513g.f1601a.f1584a.m1300e();
                float f = this.f3294p;
                c0516jM1300e.f1628e = new C0507a(f);
                c0516jM1300e.f1629f = new C0507a(f);
                c0516jM1300e.f1630g = new C0507a(f);
                c0516jM1300e.f1631h = new C0507a(f);
                if (z2) {
                    c0516jM1300e.f1628e = new C0507a(0.0f);
                    c0516jM1300e.f1631h = new C0507a(0.0f);
                } else {
                    c0516jM1300e.f1629f = new C0507a(0.0f);
                    c0516jM1300e.f1630g = new C0507a(0.0f);
                }
                C0517k c0517kM1295a = c0516jM1300e.m1295a();
                c0513g.setShapeAppearanceModel(c0517kM1295a);
                AbstractC0529w abstractC0529w = this.f3297s;
                abstractC0529w.f1688c = c0517kM1295a;
                abstractC0529w.m1312c();
                abstractC0529w.mo1310a(this);
                abstractC0529w.f1689d = new RectF(0.0f, 0.0f, i2, i3);
                abstractC0529w.m1312c();
                abstractC0529w.mo1310a(this);
                abstractC0529w.f1687b = true;
                abstractC0529w.mo1310a(this);
            }
        }
    }

    public C0422i getBackHelper() {
        return this.f3298t;
    }

    public MenuItem getCheckedItem() {
        return this.f3287i.f1227e.f1212d;
    }

    public int getDividerInsetEnd() {
        return this.f3287i.f1242t;
    }

    public int getDividerInsetStart() {
        return this.f3287i.f1241s;
    }

    public int getHeaderCount() {
        return this.f3287i.f1224b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f3287i.f1235m;
    }

    public int getItemHorizontalPadding() {
        return this.f3287i.f1237o;
    }

    public int getItemIconPadding() {
        return this.f3287i.f1239q;
    }

    public ColorStateList getItemIconTintList() {
        return this.f3287i.f1234l;
    }

    public int getItemMaxLines() {
        return this.f3287i.f1247y;
    }

    public ColorStateList getItemTextColor() {
        return this.f3287i.f1233k;
    }

    public int getItemVerticalPadding() {
        return this.f3287i.f1238p;
    }

    public Menu getMenu() {
        return this.f3286h;
    }

    public int getSubheaderInsetEnd() {
        return this.f3287i.f1244v;
    }

    public int getSubheaderInsetStart() {
        return this.f3287i.f1243u;
    }

    /* renamed from: h */
    public final Pair m2106h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof C0542d)) {
            return new Pair((DrawerLayout) parent, (C0542d) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // p035M0.AbstractC0392u, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0417d c0417d;
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0513g) {
            AbstractC0364l.m999f0(this, (C0513g) background);
        }
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            C0027i c0027i = this.f3299u;
            if (((C0417d) c0027i.f65b) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                C0426b c0426b = this.f3300v;
                if (c0426b == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f2375t;
                    if (arrayList != null) {
                        arrayList.remove(c0426b);
                    }
                }
                drawerLayout.m1588a(c0426b);
                if (!DrawerLayout.m1585o(this) || (c0417d = (C0417d) c0027i.f65b) == null) {
                    return;
                }
                c0417d.m1090b((InterfaceC0415b) c0027i.f66c, (NavigationView) c0027i.f67d, true);
            }
        }
    }

    @Override // p035M0.AbstractC0392u, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f3291m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            C0426b c0426b = this.f3300v;
            if (c0426b == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f2375t;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(c0426b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = this.f3288j;
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), i4), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0429e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0429e c0429e = (C0429e) parcelable;
        super.onRestoreInstanceState(c0429e.f1521a);
        Bundle bundle = c0429e.f1316c;
        C0377f c0377f = this.f3286h;
        c0377f.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = c0377f.f4271u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
                if (interfaceC1019y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iMo1063c = interfaceC1019y.mo1063c();
                    if (iMo1063c > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iMo1063c)) != null) {
                        interfaceC1019y.mo1070m(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1068j;
        C0429e c0429e = new C0429e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0429e.f1316c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3286h.f4271u;
        if (copyOnWriteArrayList.isEmpty()) {
            return c0429e;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1019y interfaceC1019y = (InterfaceC1019y) weakReference.get();
            if (interfaceC1019y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int iMo1063c = interfaceC1019y.mo1063c();
                if (iMo1063c > 0 && (parcelableMo1068j = interfaceC1019y.mo1068j()) != null) {
                    sparseArray.put(iMo1063c, parcelableMo1068j);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return c0429e;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        m2105g(i2, i3);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f3293o = z2;
    }

    public void setCheckedItem(int i2) {
        MenuItem menuItemFindItem = this.f3286h.findItem(i2);
        if (menuItemFindItem != null) {
            this.f3287i.f1227e.m1061h((C1008n) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1242t = i2;
        c0388q.mo1064d();
    }

    public void setDividerInsetStart(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1241s = i2;
        c0388q.mo1064d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0513g) {
            ((C0513g) background).m1289i(f);
        }
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        AbstractC0529w abstractC0529w = this.f3297s;
        if (z2 != abstractC0529w.f1686a) {
            abstractC0529w.f1686a = z2;
            abstractC0529w.mo1310a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        C0388q c0388q = this.f3287i;
        c0388q.f1235m = drawable;
        c0388q.mo1064d();
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(AbstractC0000a.m1b(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1237o = i2;
        c0388q.mo1064d();
    }

    public void setItemHorizontalPaddingResource(int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0388q c0388q = this.f3287i;
        c0388q.f1237o = dimensionPixelSize;
        c0388q.mo1064d();
    }

    public void setItemIconPadding(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1239q = i2;
        c0388q.mo1064d();
    }

    public void setItemIconPaddingResource(int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0388q c0388q = this.f3287i;
        c0388q.f1239q = dimensionPixelSize;
        c0388q.mo1064d();
    }

    public void setItemIconSize(int i2) {
        C0388q c0388q = this.f3287i;
        if (c0388q.f1240r != i2) {
            c0388q.f1240r = i2;
            c0388q.f1245w = true;
            c0388q.mo1064d();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C0388q c0388q = this.f3287i;
        c0388q.f1234l = colorStateList;
        c0388q.mo1064d();
    }

    public void setItemMaxLines(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1247y = i2;
        c0388q.mo1064d();
    }

    public void setItemTextAppearance(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1231i = i2;
        c0388q.mo1064d();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1232j = z2;
        c0388q.mo1064d();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C0388q c0388q = this.f3287i;
        c0388q.f1233k = colorStateList;
        c0388q.mo1064d();
    }

    public void setItemVerticalPadding(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1238p = i2;
        c0388q.mo1064d();
    }

    public void setItemVerticalPaddingResource(int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0388q c0388q = this.f3287i;
        c0388q.f1238p = dimensionPixelSize;
        c0388q.mo1064d();
    }

    public void setNavigationItemSelectedListener(InterfaceC0428d interfaceC0428d) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        C0388q c0388q = this.f3287i;
        if (c0388q != null) {
            c0388q.f1221B = i2;
            NavigationMenuView navigationMenuView = c0388q.f1223a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i2);
            }
        }
    }

    public void setSubheaderInsetEnd(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1244v = i2;
        c0388q.mo1064d();
    }

    public void setSubheaderInsetStart(int i2) {
        C0388q c0388q = this.f3287i;
        c0388q.f1243u = i2;
        c0388q.mo1064d();
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.f3292n = z2;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f3286h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f3287i.f1227e.m1061h((C1008n) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
