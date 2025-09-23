package p105j;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import tkbmmn.ghwbbf.irvjzy.R;

/* renamed from: j.D */
/* loaded from: classes.dex */
public final class C1029D extends RatingBar {

    /* renamed from: a */
    public final C1025B f4344a;

    public C1029D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1079b1.m2695a(this, getContext());
        C1025B c1025b = new C1025B(this);
        this.f4344a = c1025b;
        c1025b.mo2615b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f4344a.f4339c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
