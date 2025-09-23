package p105j;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: j.b */
/* loaded from: classes.dex */
public final class C1077b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f4483a;

    public C1077b(ActionBarContainer actionBarContainer) {
        this.f4483a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f4483a;
        if (actionBarContainer.f2081g) {
            Drawable drawable = actionBarContainer.f2080f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2078d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f2079e;
        if (drawable3 == null || !actionBarContainer.f2082h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f4483a;
        if (actionBarContainer.f2081g) {
            if (actionBarContainer.f2080f != null) {
                actionBarContainer.f2078d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2078d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
