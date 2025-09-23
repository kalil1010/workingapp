package p018G0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import p055T0.C0530x;
import p055T0.C0531y;

/* renamed from: G0.c */
/* loaded from: classes.dex */
public final class C0163c extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ int f542a;

    /* renamed from: b */
    public final /* synthetic */ Object f543b;

    public /* synthetic */ C0163c(int i2, Object obj) {
        this.f542a = i2;
        this.f543b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f542a) {
            case 0:
                C0166f c0166f = ((Chip) this.f543b).f3141e;
                if (c0166f == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    c0166f.getOutline(outline);
                    break;
                }
            case 1:
                C0530x c0530x = (C0530x) this.f543b;
                if (c0530x.f1688c != null && !c0530x.f1689d.isEmpty()) {
                    RectF rectF = c0530x.f1689d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0530x.f1692g);
                    break;
                }
                break;
            default:
                Path path = ((C0531y) this.f543b).f1690e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                    break;
                }
                break;
        }
    }
}
