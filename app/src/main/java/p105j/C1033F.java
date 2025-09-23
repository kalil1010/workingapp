package p105j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.F */
/* loaded from: classes.dex */
public final class C1033F extends SeekBar {

    /* renamed from: a */
    public final C1035G f4348a;

    public C1033F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1079b1.m2695a(this, getContext());
        C1035G c1035g = new C1035G(this);
        this.f4348a = c1035g;
        c1035g.mo2615b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1035G c1035g = this.f4348a;
        Drawable drawable = c1035g.f4378f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1033F c1033f = c1035g.f4377e;
        if (drawable.setState(c1033f.getDrawableState())) {
            c1033f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4348a.f4378f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4348a.m2634g(canvas);
    }
}
