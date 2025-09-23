package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p009D.AbstractC0098a;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p035M0.C0369B;
import p055T0.C0513g;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p102i.MenuC1006l;
import p145x0.AbstractC1395a;
import tkbmmn.ghwbbf.irvjzy.R;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W */
    public static final ImageView.ScaleType[] f3030W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R */
    public Integer f3031R;

    /* renamed from: S */
    public boolean f3032S;

    /* renamed from: T */
    public boolean f3033T;

    /* renamed from: U */
    public ImageView.ScaleType f3034U;

    /* renamed from: V */
    public Boolean f3035V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0601a.m1405a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(context2, attributeSet, AbstractC1395a.f6050s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM1041f.hasValue(2)) {
            setNavigationIconTint(typedArrayM1041f.getColor(2, -1));
        }
        this.f3032S = typedArrayM1041f.getBoolean(4, false);
        this.f3033T = typedArrayM1041f.getBoolean(3, false);
        int i2 = typedArrayM1041f.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3030W;
            if (i2 < scaleTypeArr.length) {
                this.f3034U = scaleTypeArr[i2];
            }
        }
        if (typedArrayM1041f.hasValue(0)) {
            this.f3035V = Boolean.valueOf(typedArrayM1041f.getBoolean(0, false));
        }
        typedArrayM1041f.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0901d.m2319u(background);
        if (colorStateListValueOf != null) {
            C0513g c0513g = new C0513g();
            c0513g.m1290j(colorStateListValueOf);
            c0513g.m1288h(context2);
            WeakHashMap weakHashMap = AbstractC0241P.f815a;
            c0513g.m1289i(AbstractC0230E.m626i(this));
            setBackground(c0513g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3034U;
    }

    public Integer getNavigationIconTint() {
        return this.f3031R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: m */
    public final void mo1528m(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC1006l;
        if (z2) {
            ((MenuC1006l) menu).m2583w();
        }
        super.mo1528m(i2);
        if (z2) {
            ((MenuC1006l) menu).m2582v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0513g) {
            AbstractC0364l.m999f0(this, (C0513g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f3032S || this.f3033T) {
            ArrayList arrayListM1039d = AbstractC0368A.m1039d(this, getTitle());
            boolean zIsEmpty = arrayListM1039d.isEmpty();
            C0369B c0369b = AbstractC0368A.f1135c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM1039d, c0369b);
            ArrayList arrayListM1039d2 = AbstractC0368A.m1039d(this, getSubtitle());
            TextView textView2 = arrayListM1039d2.isEmpty() ? null : (TextView) Collections.max(arrayListM1039d2, c0369b);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3032S && textView != null) {
                    m2036v(textView, pair);
                }
                if (this.f3033T && textView2 != null) {
                    m2036v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3035V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3034U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0513g) {
            ((C0513g) background).m1289i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f3035V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f3035V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3034U != scaleType) {
            this.f3034U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3031R != null) {
            drawable = drawable.mutate();
            AbstractC0098a.m299g(drawable, this.f3031R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f3031R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f3033T != z2) {
            this.f3033T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f3032S != z2) {
            this.f3032S = z2;
            requestLayout();
        }
    }

    /* renamed from: v */
    public final void m2036v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
