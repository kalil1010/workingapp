package p138v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p129s.C1318g;

/* renamed from: v.s */
/* loaded from: classes.dex */
public abstract class AbstractC1374s extends AbstractC1358c {

    /* renamed from: h */
    public boolean f5981h;

    /* renamed from: i */
    public boolean f5982i;

    @Override // p138v.AbstractC1358c
    /* renamed from: e */
    public final void mo3120e(ConstraintLayout constraintLayout) {
        m3119d(constraintLayout);
    }

    @Override // p138v.AbstractC1358c
    /* renamed from: g */
    public void mo3122g(AttributeSet attributeSet) {
        super.mo3122g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1372q.f5972b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f5981h = true;
                } else if (index == 22) {
                    this.f5982i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo1542j(C1318g c1318g, int i2, int i3);

    @Override // p138v.AbstractC1358c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5981h || this.f5982i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f5763b; i2++) {
                    View view = (View) constraintLayout.f2259a.get(this.f5762a[i2]);
                    if (view != null) {
                        if (this.f5981h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f5982i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3119d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3119d((ConstraintLayout) parent);
    }
}
