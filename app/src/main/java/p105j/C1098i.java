package p105j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import p009D.AbstractC0098a;
import p033L1.AbstractC0364l;
import p102i.C0996b;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.i */
/* loaded from: classes.dex */
public final class C1098i extends C1142y implements InterfaceC1107l {

    /* renamed from: d */
    public final /* synthetic */ C1104k f4513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098i(C1104k c1104k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f4513d = c1104k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0364l.m1000g0(this, getContentDescription());
        setOnTouchListener(new C0996b(this, this));
    }

    @Override // p105j.InterfaceC1107l
    /* renamed from: a */
    public final boolean mo1470a() {
        return false;
    }

    @Override // p105j.InterfaceC1107l
    /* renamed from: b */
    public final boolean mo1471b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4513d.m2727o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0098a.m298f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
