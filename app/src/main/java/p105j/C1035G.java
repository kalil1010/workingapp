package p105j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p002A1.C0027i;
import p009D.AbstractC0098a;
import p009D.AbstractC0099b;
import p028K.AbstractC0241P;
import p086d.AbstractC0843a;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.G */
/* loaded from: classes.dex */
public final class C1035G extends C1025B {

    /* renamed from: e */
    public final C1033F f4377e;

    /* renamed from: f */
    public Drawable f4378f;

    /* renamed from: g */
    public ColorStateList f4379g;

    /* renamed from: h */
    public PorterDuff.Mode f4380h;

    /* renamed from: i */
    public boolean f4381i;

    /* renamed from: j */
    public boolean f4382j;

    public C1035G(C1033F c1033f) {
        super(c1033f);
        this.f4379g = null;
        this.f4380h = null;
        this.f4381i = false;
        this.f4382j = false;
        this.f4377e = c1033f;
    }

    @Override // p105j.C1025B
    /* renamed from: b */
    public final void mo2615b(AttributeSet attributeSet, int i2) {
        super.mo2615b(attributeSet, R.attr.seekBarStyle);
        C1033F c1033f = this.f4377e;
        Context context = c1033f.getContext();
        int[] iArr = AbstractC0843a.f3457g;
        C0027i c0027iM98N = C0027i.m98N(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0241P.m700l(c1033f, c1033f.getContext(), iArr, attributeSet, (TypedArray) c0027iM98N.f66c, R.attr.seekBarStyle);
        Drawable drawableM101C = c0027iM98N.m101C(0);
        if (drawableM101C != null) {
            c1033f.setThumb(drawableM101C);
        }
        Drawable drawableM100B = c0027iM98N.m100B(1);
        Drawable drawable = this.f4378f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f4378f = drawableM100B;
        if (drawableM100B != null) {
            drawableM100B.setCallback(c1033f);
            AbstractC0099b.m303b(drawableM100B, c1033f.getLayoutDirection());
            if (drawableM100B.isStateful()) {
                drawableM100B.setState(c1033f.getDrawableState());
            }
            m2633f();
        }
        c1033f.invalidate();
        TypedArray typedArray = (TypedArray) c0027iM98N.f66c;
        if (typedArray.hasValue(3)) {
            this.f4380h = AbstractC1117o0.m2733b(typedArray.getInt(3, -1), this.f4380h);
            this.f4382j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f4379g = c0027iM98N.m99A(2);
            this.f4381i = true;
        }
        c0027iM98N.m114R();
        m2633f();
    }

    /* renamed from: f */
    public final void m2633f() {
        Drawable drawable = this.f4378f;
        if (drawable != null) {
            if (this.f4381i || this.f4382j) {
                Drawable drawableMutate = drawable.mutate();
                this.f4378f = drawableMutate;
                if (this.f4381i) {
                    AbstractC0098a.m300h(drawableMutate, this.f4379g);
                }
                if (this.f4382j) {
                    AbstractC0098a.m301i(this.f4378f, this.f4380h);
                }
                if (this.f4378f.isStateful()) {
                    this.f4378f.setState(this.f4377e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public final void m2634g(Canvas canvas) {
        if (this.f4378f != null) {
            int max = this.f4377e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f4378f.getIntrinsicWidth();
                int intrinsicHeight = this.f4378f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f4378f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f4378f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
