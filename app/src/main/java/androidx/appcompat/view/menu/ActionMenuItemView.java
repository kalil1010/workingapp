package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p033L1.AbstractC0364l;
import p086d.AbstractC0843a;
import p102i.AbstractC0997c;
import p102i.C0996b;
import p102i.C1008n;
import p102i.InterfaceC1005k;
import p102i.InterfaceC1020z;
import p102i.MenuC1006l;
import p105j.C1081c0;
import p105j.InterfaceC1107l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1081c0 implements InterfaceC1020z, View.OnClickListener, InterfaceC1107l {

    /* renamed from: h */
    public C1008n f2045h;

    /* renamed from: i */
    public CharSequence f2046i;

    /* renamed from: j */
    public Drawable f2047j;

    /* renamed from: k */
    public InterfaceC1005k f2048k;

    /* renamed from: l */
    public C0996b f2049l;

    /* renamed from: m */
    public AbstractC0997c f2050m;

    /* renamed from: n */
    public boolean f2051n;

    /* renamed from: o */
    public boolean f2052o;

    /* renamed from: p */
    public final int f2053p;

    /* renamed from: q */
    public int f2054q;

    /* renamed from: r */
    public final int f2055r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f2051n = m1473g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0843a.f3453c, 0, 0);
        this.f2053p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2055r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2054q = -1;
        setSaveEnabled(false);
    }

    @Override // p105j.InterfaceC1107l
    /* renamed from: a */
    public final boolean mo1470a() {
        return !TextUtils.isEmpty(getText()) && this.f2045h.getIcon() == null;
    }

    @Override // p105j.InterfaceC1107l
    /* renamed from: b */
    public final boolean mo1471b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p102i.InterfaceC1020z
    /* renamed from: e */
    public final void mo1472e(C1008n c1008n) {
        this.f2045h = c1008n;
        setIcon(c1008n.getIcon());
        setTitle(c1008n.getTitleCondensed());
        setId(c1008n.f4281a);
        setVisibility(c1008n.isVisible() ? 0 : 8);
        setEnabled(c1008n.isEnabled());
        if (c1008n.hasSubMenu() && this.f2049l == null) {
            this.f2049l = new C0996b(this);
        }
    }

    /* renamed from: g */
    public final boolean m1473g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p102i.InterfaceC1020z
    public C1008n getItemData() {
        return this.f2045h;
    }

    /* renamed from: h */
    public final void m1474h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f2046i);
        if (this.f2047j != null && ((this.f2045h.f4305y & 4) != 4 || (!this.f2051n && !this.f2052o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f2046i : null);
        CharSequence charSequence = this.f2045h.f4297q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f2045h.f4285e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2045h.f4298r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0364l.m1000g0(this, z4 ? null : this.f2045h.f4285e);
        } else {
            AbstractC0364l.m1000g0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1005k interfaceC1005k = this.f2048k;
        if (interfaceC1005k != null) {
            interfaceC1005k.mo1476c(this.f2045h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2051n = m1473g();
        m1474h();
    }

    @Override // p105j.C1081c0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f2054q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f2053p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f2047j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2047j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0996b c0996b;
        if (this.f2045h.hasSubMenu() && (c0996b = this.f2049l) != null && c0996b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f2052o != z2) {
            this.f2052o = z2;
            C1008n c1008n = this.f2045h;
            if (c1008n != null) {
                MenuC1006l menuC1006l = c1008n.f4294n;
                menuC1006l.f4261k = true;
                menuC1006l.mo1072p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2047j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f2055r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1474h();
    }

    public void setItemInvoker(InterfaceC1005k interfaceC1005k) {
        this.f2048k = interfaceC1005k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f2054q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0997c abstractC0997c) {
        this.f2050m = abstractC0997c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2046i = charSequence;
        m1474h();
    }
}
