package p109k0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p119o.C1240b;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class C1186d extends Drawable.ConstantState {

    /* renamed from: a */
    public C1198p f4814a;

    /* renamed from: b */
    public AnimatorSet f4815b;

    /* renamed from: c */
    public ArrayList f4816c;

    /* renamed from: d */
    public C1240b f4817d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
