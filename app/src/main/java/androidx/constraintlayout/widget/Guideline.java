package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p138v.C1360e;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a */
    public boolean f2276a;

    public Guideline(Context context) {
        super(context);
        this.f2276a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f2276a = z2;
    }

    public void setGuidelineBegin(int i2) {
        C1360e c1360e = (C1360e) getLayoutParams();
        if (this.f2276a && c1360e.f5796a == i2) {
            return;
        }
        c1360e.f5796a = i2;
        setLayoutParams(c1360e);
    }

    public void setGuidelineEnd(int i2) {
        C1360e c1360e = (C1360e) getLayoutParams();
        if (this.f2276a && c1360e.f5798b == i2) {
            return;
        }
        c1360e.f5798b = i2;
        setLayoutParams(c1360e);
    }

    public void setGuidelinePercent(float f) {
        C1360e c1360e = (C1360e) getLayoutParams();
        if (this.f2276a && c1360e.f5800c == f) {
            return;
        }
        c1360e.f5800c = f;
        setLayoutParams(c1360e);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2276a = true;
        super.setVisibility(8);
    }
}
