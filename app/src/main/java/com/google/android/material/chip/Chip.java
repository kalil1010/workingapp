package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p007C0.C0086d;
import p009D.AbstractC0099b;
import p009D.InterfaceC0101d;
import p018G0.C0162b;
import p018G0.C0163c;
import p018G0.C0164d;
import p018G0.C0166f;
import p018G0.InterfaceC0165e;
import p022I.AbstractC0205h;
import p022I.C0199b;
import p028K.AbstractC0230E;
import p028K.AbstractC0241P;
import p033L1.AbstractC0356d;
import p033L1.AbstractC0364l;
import p035M0.AbstractC0368A;
import p035M0.C0396y;
import p035M0.InterfaceC0376e;
import p046Q0.C0458d;
import p049R0.AbstractC0472a;
import p055T0.C0517k;
import p055T0.InterfaceC0528v;
import p070Y0.AbstractC0601a;
import p093e2.AbstractC0901d;
import p105j.C1122q;
import p145x0.AbstractC1395a;
import p148y0.C1401b;

/* loaded from: classes.dex */
public class Chip extends C1122q implements InterfaceC0165e, InterfaceC0528v, Checkable {

    /* renamed from: w */
    public static final Rect f3138w = new Rect();

    /* renamed from: x */
    public static final int[] f3139x = {R.attr.state_selected};

    /* renamed from: y */
    public static final int[] f3140y = {R.attr.state_checkable};

    /* renamed from: e */
    public C0166f f3141e;

    /* renamed from: f */
    public InsetDrawable f3142f;

    /* renamed from: g */
    public RippleDrawable f3143g;

    /* renamed from: h */
    public View.OnClickListener f3144h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f3145i;

    /* renamed from: j */
    public boolean f3146j;

    /* renamed from: k */
    public boolean f3147k;

    /* renamed from: l */
    public boolean f3148l;

    /* renamed from: m */
    public boolean f3149m;

    /* renamed from: n */
    public boolean f3150n;

    /* renamed from: o */
    public int f3151o;

    /* renamed from: p */
    public int f3152p;

    /* renamed from: q */
    public CharSequence f3153q;

    /* renamed from: r */
    public final C0164d f3154r;

    /* renamed from: s */
    public boolean f3155s;

    /* renamed from: t */
    public final Rect f3156t;

    /* renamed from: u */
    public final RectF f3157u;

    /* renamed from: v */
    public final C0162b f3158v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0601a.m1405a(context, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle);
        this.f3156t = new Rect();
        this.f3157u = new RectF();
        this.f3158v = new C0162b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C0166f c0166f = new C0166f(context2, attributeSet);
        int[] iArr = AbstractC1395a.f6034c;
        TypedArray typedArrayM1041f = AbstractC0368A.m1041f(c0166f.f582e0, attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0166f.f556E0 = typedArrayM1041f.hasValue(37);
        Context context3 = c0166f.f582e0;
        ColorStateList colorStateListM2318t = AbstractC0901d.m2318t(context3, typedArrayM1041f, 24);
        if (c0166f.f601x != colorStateListM2318t) {
            c0166f.f601x = colorStateListM2318t;
            c0166f.onStateChange(c0166f.getState());
        }
        ColorStateList colorStateListM2318t2 = AbstractC0901d.m2318t(context3, typedArrayM1041f, 11);
        if (c0166f.f603y != colorStateListM2318t2) {
            c0166f.f603y = colorStateListM2318t2;
            c0166f.onStateChange(c0166f.getState());
        }
        float dimension = typedArrayM1041f.getDimension(19, 0.0f);
        if (c0166f.f605z != dimension) {
            c0166f.f605z = dimension;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        if (typedArrayM1041f.hasValue(12)) {
            c0166f.m434A(typedArrayM1041f.getDimension(12, 0.0f));
        }
        c0166f.m439F(AbstractC0901d.m2318t(context3, typedArrayM1041f, 22));
        c0166f.m440G(typedArrayM1041f.getDimension(23, 0.0f));
        c0166f.m449P(AbstractC0901d.m2318t(context3, typedArrayM1041f, 36));
        String text = typedArrayM1041f.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0166f.f555E, text)) {
            c0166f.f555E = text;
            c0166f.f588k0.f1271d = true;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        C0458d c0458d = (!typedArrayM1041f.hasValue(0) || (resourceId3 = typedArrayM1041f.getResourceId(0, 0)) == 0) ? null : new C0458d(context3, resourceId3);
        c0458d.f1378k = typedArrayM1041f.getDimension(1, c0458d.f1378k);
        c0166f.m450Q(c0458d);
        int i2 = typedArrayM1041f.getInt(3, 0);
        if (i2 == 1) {
            c0166f.f550B0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c0166f.f550B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c0166f.f550B0 = TextUtils.TruncateAt.END;
        }
        c0166f.m438E(typedArrayM1041f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0166f.m438E(typedArrayM1041f.getBoolean(15, false));
        }
        c0166f.m435B(AbstractC0901d.m2322y(context3, typedArrayM1041f, 14));
        if (typedArrayM1041f.hasValue(17)) {
            c0166f.m437D(AbstractC0901d.m2318t(context3, typedArrayM1041f, 17));
        }
        c0166f.m436C(typedArrayM1041f.getDimension(16, -1.0f));
        c0166f.m446M(typedArrayM1041f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0166f.m446M(typedArrayM1041f.getBoolean(26, false));
        }
        c0166f.m441H(AbstractC0901d.m2322y(context3, typedArrayM1041f, 25));
        c0166f.m445L(AbstractC0901d.m2318t(context3, typedArrayM1041f, 30));
        c0166f.m443J(typedArrayM1041f.getDimension(28, 0.0f));
        c0166f.m461w(typedArrayM1041f.getBoolean(6, false));
        c0166f.m464z(typedArrayM1041f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0166f.m464z(typedArrayM1041f.getBoolean(8, false));
        }
        c0166f.m462x(AbstractC0901d.m2322y(context3, typedArrayM1041f, 7));
        if (typedArrayM1041f.hasValue(9)) {
            c0166f.m463y(AbstractC0901d.m2318t(context3, typedArrayM1041f, 9));
        }
        c0166f.f572U = (!typedArrayM1041f.hasValue(39) || (resourceId2 = typedArrayM1041f.getResourceId(39, 0)) == 0) ? null : C1401b.m3167a(context3, resourceId2);
        c0166f.f573V = (!typedArrayM1041f.hasValue(33) || (resourceId = typedArrayM1041f.getResourceId(33, 0)) == 0) ? null : C1401b.m3167a(context3, resourceId);
        float dimension2 = typedArrayM1041f.getDimension(21, 0.0f);
        if (c0166f.f574W != dimension2) {
            c0166f.f574W = dimension2;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        c0166f.m448O(typedArrayM1041f.getDimension(35, 0.0f));
        c0166f.m447N(typedArrayM1041f.getDimension(34, 0.0f));
        float dimension3 = typedArrayM1041f.getDimension(41, 0.0f);
        if (c0166f.f577Z != dimension3) {
            c0166f.f577Z = dimension3;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        float dimension4 = typedArrayM1041f.getDimension(40, 0.0f);
        if (c0166f.f578a0 != dimension4) {
            c0166f.f578a0 = dimension4;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        c0166f.m444K(typedArrayM1041f.getDimension(29, 0.0f));
        c0166f.m442I(typedArrayM1041f.getDimension(27, 0.0f));
        float dimension5 = typedArrayM1041f.getDimension(13, 0.0f);
        if (c0166f.f581d0 != dimension5) {
            c0166f.f581d0 = dimension5;
            c0166f.invalidateSelf();
            c0166f.m459u();
        }
        c0166f.f554D0 = typedArrayM1041f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM1041f.recycle();
        AbstractC0368A.m1036a(context2, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0368A.m1037b(context2, attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action);
        this.f3150n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f3152p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0166f);
        c0166f.m1289i(AbstractC0230E.m626i(this));
        AbstractC0368A.m1036a(context2, attributeSet, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0368A.m1037b(context2, attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, tkbmmn.ghwbbf.irvjzy.R.attr.chipStyle, tkbmmn.ghwbbf.irvjzy.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f3154r = new C0164d(this, this);
        m2077d();
        if (!zHasValue) {
            setOutlineProvider(new C0163c(0, this));
        }
        setChecked(this.f3146j);
        setText(c0166f.f555E);
        setEllipsize(c0166f.f550B0);
        m2080g();
        if (!this.f3141e.f552C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m2079f();
        if (this.f3150n) {
            setMinHeight(this.f3152p);
        }
        this.f3151o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: G0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f539a.f3145i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3157u;
        rectF.setEmpty();
        if (m2076c() && this.f3144h != null) {
            C0166f c0166f = this.f3141e;
            Rect bounds = c0166f.getBounds();
            rectF.setEmpty();
            if (c0166f.m453T()) {
                float f = c0166f.f581d0 + c0166f.f580c0 + c0166f.f566O + c0166f.f579b0 + c0166f.f578a0;
                if (AbstractC0099b.m302a(c0166f) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f3156t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private C0458d getTextAppearance() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f588k0.f1273f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f3148l != z2) {
            this.f3148l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f3147k != z2) {
            this.f3147k = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m2075b(int i2) {
        this.f3152p = i2;
        if (!this.f3150n) {
            InsetDrawable insetDrawable = this.f3142f;
            if (insetDrawable == null) {
                m2078e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3142f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2078e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.f3141e.f605z));
        int iMax2 = Math.max(0, i2 - this.f3141e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f3142f;
            if (insetDrawable2 == null) {
                m2078e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3142f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2078e();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f3142f != null) {
            Rect rect = new Rect();
            this.f3142f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                m2078e();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f3142f = new InsetDrawable((Drawable) this.f3141e, i3, i4, i3, i4);
        m2078e();
    }

    /* renamed from: c */
    public final boolean m2076c() {
        C0166f c0166f = this.f3141e;
        if (c0166f == null) {
            return false;
        }
        Object obj = c0166f.f563L;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC0101d) {
            obj = null;
        }
        return obj != null;
    }

    /* renamed from: d */
    public final void m2077d() {
        C0166f c0166f;
        if (!m2076c() || (c0166f = this.f3141e) == null || !c0166f.f562K || this.f3144h == null) {
            AbstractC0241P.m701m(this, null);
            this.f3155s = false;
        } else {
            AbstractC0241P.m701m(this, this.f3154r);
            this.f3155s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3155s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            G0.d r0 = r9.f3154r
            android.view.accessibility.AccessibilityManager r1 = r0.f1544h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6c
        L1c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L3d
            r5 = 9
            if (r1 == r5) goto L3d
            r5 = 10
            if (r1 == r5) goto L30
            goto L6c
        L30:
            int r1 = r0.f1549m
            if (r1 == r6) goto L6c
            if (r1 != r6) goto L37
            goto L72
        L37:
            r0.f1549m = r6
            r0.m1250q(r1, r2)
            return r3
        L3d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.f544q
            boolean r8 = r7.m2076c()
            if (r8 == 0) goto L59
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L59
            r1 = r3
            goto L5a
        L59:
            r1 = r4
        L5a:
            int r5 = r0.f1549m
            if (r5 != r1) goto L5f
            goto L69
        L5f:
            r0.f1549m = r1
            r7 = 128(0x80, float:1.8E-43)
            r0.m1250q(r1, r7)
            r0.m1250q(r5, r2)
        L69:
            if (r1 == r6) goto L6c
            goto L72
        L6c:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L73
        L72:
            return r3
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3155s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            G0.d r0 = r9.f3154r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m1247m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r3
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f1548l
            if (r1 == r4) goto L85
            com.google.android.material.chip.Chip r5 = r0.f544q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r3) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f3144h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f3155s
            if (r1 == 0) goto L85
            G0.d r1 = r5.f3154r
            r1.m1250q(r3, r3)
        L85:
            r2 = r3
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m1247m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m1247m(r3, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f1548l
            if (r0 == r4) goto La4
            return r3
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p105j.C1122q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        C0166f c0166f = this.f3141e;
        boolean zM460v = false;
        if (c0166f != null && C0166f.m433t(c0166f.f563L)) {
            C0166f c0166f2 = this.f3141e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f3149m) {
                i3 = IsEnabled + 1;
            }
            int i4 = i3;
            if (this.f3148l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f3147k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f3149m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f3148l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f3147k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c0166f2.f604y0, iArr)) {
                c0166f2.f604y0 = iArr;
                if (c0166f2.m453T()) {
                    zM460v = c0166f2.m460v(c0166f2.getState(), iArr);
                }
            }
        }
        if (zM460v) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m2078e() {
        this.f3143g = new RippleDrawable(AbstractC0472a.m1161a(this.f3141e.f553D), getBackgroundDrawable(), null);
        this.f3141e.getClass();
        RippleDrawable rippleDrawable = this.f3143g;
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setBackground(rippleDrawable);
        m2079f();
    }

    /* renamed from: f */
    public final void m2079f() {
        C0166f c0166f;
        if (TextUtils.isEmpty(getText()) || (c0166f = this.f3141e) == null) {
            return;
        }
        int iM457q = (int) (c0166f.m457q() + c0166f.f581d0 + c0166f.f578a0);
        C0166f c0166f2 = this.f3141e;
        int iM456p = (int) (c0166f2.m456p() + c0166f2.f574W + c0166f2.f577Z);
        if (this.f3142f != null) {
            Rect rect = new Rect();
            this.f3142f.getPadding(rect);
            iM456p += rect.left;
            iM457q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0241P.f815a;
        setPaddingRelative(iM456p, paddingTop, iM457q, paddingBottom);
    }

    /* renamed from: g */
    public final void m2080g() {
        TextPaint paint = getPaint();
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            paint.drawableState = c0166f.getState();
        }
        C0458d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1143e(getContext(), paint, this.f3158v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3153q)) {
            return this.f3153q;
        }
        C0166f c0166f = this.f3141e;
        if (!(c0166f != null && c0166f.f568Q)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3142f;
        return insetDrawable == null ? this.f3141e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f570S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f571T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f603y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return Math.max(0.0f, c0166f.m458r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3141e;
    }

    public float getChipEndPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f581d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0166f c0166f = this.f3141e;
        if (c0166f == null || (drawable = c0166f.f558G) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0101d)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f560I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f559H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f605z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f574W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f549B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f551C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0166f c0166f = this.f3141e;
        if (c0166f == null || (drawable = c0166f.f563L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0101d)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f567P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f580c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f566O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f579b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f565N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f550B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3155s) {
            C0164d c0164d = this.f3154r;
            if (c0164d.f1548l == 1 || c0164d.f1547k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1401b getHideMotionSpec() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f573V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f576Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f575X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f553D;
        }
        return null;
    }

    public C0517k getShapeAppearanceModel() {
        return this.f3141e.f1601a.f1584a;
    }

    public C1401b getShowMotionSpec() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f572U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f578a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            return c0166f.f577Z;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0364l.m999f0(this, this.f3141e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3139x);
        }
        C0166f c0166f = this.f3141e;
        if (c0166f != null && c0166f.f568Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3140y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f3155s) {
            C0164d c0164d = this.f3154r;
            int i3 = c0164d.f1548l;
            if (i3 != Integer.MIN_VALUE) {
                c0164d.m1245j(i3);
            }
            if (z2) {
                c0164d.m1247m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0166f c0166f = this.f3141e;
        accessibilityNodeInfo.setCheckable(c0166f != null && c0166f.f568Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f3151o != i2) {
            this.f3151o = i2;
            m2079f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f3147k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f3147k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f3144h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f3155s
            if (r0 == 0) goto L43
            G0.d r0 = r5.f3154r
            r0.m1250q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3153q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3143g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // p105j.C1122q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3143g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p105j.C1122q, android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m461w(z2);
        }
    }

    public void setCheckableResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m461w(c0166f.f582e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null) {
            this.f3146j = z2;
        } else if (c0166f.f568Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m462x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m462x(AbstractC0901d.m2321x(c0166f.f582e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m463y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m463y(AbstractC0356d.m969s(c0166f.f582e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m464z(c0166f.f582e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f603y == colorStateList) {
            return;
        }
        c0166f.f603y = colorStateList;
        c0166f.onStateChange(c0166f.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateListM969s;
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f603y == (colorStateListM969s = AbstractC0356d.m969s(c0166f.f582e0, i2))) {
            return;
        }
        c0166f.f603y = colorStateListM969s;
        c0166f.onStateChange(c0166f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m434A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m434A(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(C0166f c0166f) {
        C0166f c0166f2 = this.f3141e;
        if (c0166f2 != c0166f) {
            if (c0166f2 != null) {
                c0166f2.f548A0 = new WeakReference(null);
            }
            this.f3141e = c0166f;
            c0166f.f552C0 = false;
            c0166f.f548A0 = new WeakReference(this);
            m2075b(this.f3152p);
        }
    }

    public void setChipEndPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f581d0 == f) {
            return;
        }
        c0166f.f581d0 = f;
        c0166f.invalidateSelf();
        c0166f.m459u();
    }

    public void setChipEndPaddingResource(int i2) throws Resources.NotFoundException {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float dimension = c0166f.f582e0.getResources().getDimension(i2);
            if (c0166f.f581d0 != dimension) {
                c0166f.f581d0 = dimension;
                c0166f.invalidateSelf();
                c0166f.m459u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m435B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m435B(AbstractC0901d.m2321x(c0166f.f582e0, i2));
        }
    }

    public void setChipIconSize(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m436C(f);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m436C(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m437D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m437D(AbstractC0356d.m969s(c0166f.f582e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m438E(c0166f.f582e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f605z == f) {
            return;
        }
        c0166f.f605z = f;
        c0166f.invalidateSelf();
        c0166f.m459u();
    }

    public void setChipMinHeightResource(int i2) throws Resources.NotFoundException {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float dimension = c0166f.f582e0.getResources().getDimension(i2);
            if (c0166f.f605z != dimension) {
                c0166f.f605z = dimension;
                c0166f.invalidateSelf();
                c0166f.m459u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f574W == f) {
            return;
        }
        c0166f.f574W = f;
        c0166f.invalidateSelf();
        c0166f.m459u();
    }

    public void setChipStartPaddingResource(int i2) throws Resources.NotFoundException {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float dimension = c0166f.f582e0.getResources().getDimension(i2);
            if (c0166f.f574W != dimension) {
                c0166f.f574W = dimension;
                c0166f.invalidateSelf();
                c0166f.m459u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m439F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m439F(AbstractC0356d.m969s(c0166f.f582e0, i2));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m440G(f);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m440G(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m441H(drawable);
        }
        m2077d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f567P == charSequence) {
            return;
        }
        String str = C0199b.f746b;
        C0199b c0199b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0199b.f749e : C0199b.f748d;
        c0199b.getClass();
        C0086d c0086d = AbstractC0205h.f756a;
        c0166f.f567P = c0199b.m534c(charSequence);
        c0166f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m442I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m442I(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m441H(AbstractC0901d.m2321x(c0166f.f582e0, i2));
        }
        m2077d();
    }

    public void setCloseIconSize(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m443J(f);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m443J(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m444K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m444K(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m445L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m445L(AbstractC0356d.m969s(c0166f.f582e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // p105j.C1122q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p105j.C1122q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m1289i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3141e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f550B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f3150n = z2;
        m2075b(this.f3152p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            return;
        }
        super.setGravity(i2);
    }

    public void setHideMotionSpec(C1401b c1401b) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f573V = c1401b;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f573V = C1401b.m3167a(c0166f.f582e0, i2);
        }
    }

    public void setIconEndPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m447N(f);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m447N(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m448O(f);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m448O(c0166f.f582e0.getResources().getDimension(i2));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0376e interfaceC0376e) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f3141e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f554D0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3145i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3144h = onClickListener;
        m2077d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m449P(colorStateList);
        }
        this.f3141e.getClass();
        m2078e();
    }

    public void setRippleColorResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m449P(AbstractC0356d.m969s(c0166f.f582e0, i2));
            this.f3141e.getClass();
            m2078e();
        }
    }

    @Override // p055T0.InterfaceC0528v
    public void setShapeAppearanceModel(C0517k c0517k) {
        this.f3141e.setShapeAppearanceModel(c0517k);
    }

    public void setShowMotionSpec(C1401b c1401b) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f572U = c1401b;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.f572U = C1401b.m3167a(c0166f.f582e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0166f.f552C0 ? null : charSequence, bufferType);
        C0166f c0166f2 = this.f3141e;
        if (c0166f2 == null || TextUtils.equals(c0166f2.f555E, charSequence)) {
            return;
        }
        c0166f2.f555E = charSequence;
        c0166f2.f588k0.f1271d = true;
        c0166f2.invalidateSelf();
        c0166f2.m459u();
    }

    public void setTextAppearance(C0458d c0458d) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m450Q(c0458d);
        }
        m2080g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f578a0 == f) {
            return;
        }
        c0166f.f578a0 = f;
        c0166f.invalidateSelf();
        c0166f.m459u();
    }

    public void setTextEndPaddingResource(int i2) throws Resources.NotFoundException {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float dimension = c0166f.f582e0.getResources().getDimension(i2);
            if (c0166f.f578a0 != dimension) {
                c0166f.f578a0 = dimension;
                c0166f.invalidateSelf();
                c0166f.m459u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            C0396y c0396y = c0166f.f588k0;
            C0458d c0458d = c0396y.f1273f;
            if (c0458d != null) {
                c0458d.f1378k = fApplyDimension;
                c0396y.f1268a.setTextSize(fApplyDimension);
                c0166f.m459u();
                c0166f.invalidateSelf();
            }
        }
        m2080g();
    }

    public void setTextStartPadding(float f) {
        C0166f c0166f = this.f3141e;
        if (c0166f == null || c0166f.f577Z == f) {
            return;
        }
        c0166f.f577Z = f;
        c0166f.invalidateSelf();
        c0166f.m459u();
    }

    public void setTextStartPaddingResource(int i2) throws Resources.NotFoundException {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            float dimension = c0166f.f582e0.getResources().getDimension(i2);
            if (c0166f.f577Z != dimension) {
                c0166f.f577Z = dimension;
                c0166f.invalidateSelf();
                c0166f.m459u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m446M(z2);
        }
        m2077d();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m464z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m438E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m450Q(new C0458d(c0166f.f582e0, i2));
        }
        m2080g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C0166f c0166f = this.f3141e;
        if (c0166f != null) {
            c0166f.m450Q(new C0458d(c0166f.f582e0, i2));
        }
        m2080g();
    }
}
