package p109k0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p009D.AbstractC0098a;
import p015F0.C0146a;
import p015F0.C0149d;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C1184b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C0146a f4812a;

    public C1184b(C0146a c0146a) {
        this.f4812a = c0146a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4812a.f503b.f520o;
        if (colorStateList != null) {
            AbstractC0098a.m300h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0149d c0149d = this.f4812a.f503b;
        ColorStateList colorStateList = c0149d.f520o;
        if (colorStateList != null) {
            AbstractC0098a.m299g(drawable, colorStateList.getColorForState(c0149d.f524s, colorStateList.getDefaultColor()));
        }
    }
}
