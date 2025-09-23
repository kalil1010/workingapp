package p032L0;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import p055T0.C0513g;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public final class C0352a extends ViewOutlineProvider {

    /* renamed from: a */
    public final Rect f1088a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ ShapeableImageView f1089b;

    public C0352a(ShapeableImageView shapeableImageView) {
        this.f1089b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f1089b;
        if (shapeableImageView.f3256l == null) {
            return;
        }
        if (shapeableImageView.f3255k == null) {
            shapeableImageView.f3255k = new C0513g(shapeableImageView.f3256l);
        }
        RectF rectF = shapeableImageView.f3249e;
        Rect rect = this.f1088a;
        rectF.round(rect);
        shapeableImageView.f3255k.setBounds(rect);
        shapeableImageView.f3255k.getOutline(outline);
    }
}
